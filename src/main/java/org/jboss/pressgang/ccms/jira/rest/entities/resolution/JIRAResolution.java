package org.jboss.pressgang.ccms.jira.rest.entities.resolution;

import java.net.URI;

import org.jboss.pressgang.ccms.jira.rest.entities.HasSelfUrl;
import org.jboss.pressgang.ccms.jira.rest.entities.Identifiable;
import org.jboss.pressgang.ccms.jira.rest.entities.Named;

public class JIRAResolution implements HasSelfUrl, Identifiable<Long>, Named {
    private URI self;
    private Long id;
    private String name;
    private String description;
    private URI iconUrl;

    @Override
    public URI getSelf() {
        return self;
    }

    public void setSelf(URI self) {
        this.self = self;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public URI getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(URI iconUrl) {
        this.iconUrl = iconUrl;
    }
}
