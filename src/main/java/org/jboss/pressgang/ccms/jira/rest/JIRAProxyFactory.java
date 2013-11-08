package org.jboss.pressgang.ccms.jira.rest;

import java.net.URI;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.jboss.resteasy.client.ClientExecutor;
import org.jboss.resteasy.client.ClientRequestFactory;
import org.jboss.resteasy.client.ProxyFactory;
import org.jboss.resteasy.plugins.providers.RegisterBuiltin;
import org.jboss.resteasy.plugins.providers.jackson.ResteasyJacksonProvider;
import org.jboss.resteasy.spi.ResteasyProviderFactory;

public class JIRAProxyFactory {
    private static final ResteasyProviderFactory providerFactory = ResteasyProviderFactory.getInstance();
    static {
        // Configure the Jackson Provider to ignore Unknown Fields
        final ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.getSerializationConfig().setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
        mapper.configure(SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS, false);
        final ResteasyJacksonProvider jacksonProvider = new ResteasyJacksonProvider();
        jacksonProvider.setMapper(mapper);
        providerFactory.registerProviderInstance(jacksonProvider);

        RegisterBuiltin.register(providerFactory);
    }

    private final ClientRequestFactory requestFactory;

    private JIRAProxyFactory(final String url) {
        this(url, null);
    }

    private JIRAProxyFactory(final String url, final ClientExecutor executor) {
        final URI uri = ProxyFactory.createUri(fixUrl(url));
        requestFactory = new ClientRequestFactory(executor, providerFactory, uri);
        requestFactory.setFollowRedirects(true);
    }

    public static JIRAProxyFactory create(final String url) {
        return new JIRAProxyFactory(url);
    }

    public static JIRAProxyFactory create(final String url, final ClientExecutor executor) {
        return new JIRAProxyFactory(url, executor);
    }

    private String fixUrl(final String url) {
        String fixedUrl = url;
        if (!fixedUrl.endsWith("/")) {
            fixedUrl += "/";
        }

        return fixedUrl;
    }

    public JIRARESTInterface getRESTClient() {
        return requestFactory.createProxy(JIRARESTInterface.class);
    }

    public ResteasyProviderFactory getResteasyProviderFactory() {
        return providerFactory;
    }
}
