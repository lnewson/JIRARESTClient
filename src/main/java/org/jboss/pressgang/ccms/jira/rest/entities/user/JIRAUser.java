package org.jboss.pressgang.ccms.jira.rest.entities.user;

import java.net.URI;
import java.util.Map;

import org.jboss.pressgang.ccms.jira.rest.collections.JIRACollection;
import org.jboss.pressgang.ccms.jira.rest.entities.HasExpandableFields;
import org.jboss.pressgang.ccms.jira.rest.entities.HasSelfUrl;
import org.jboss.pressgang.ccms.jira.rest.entities.Named;
import org.jboss.pressgang.ccms.jira.rest.entities.group.JIRAGroup;

public class JIRAUser implements HasExpandableFields, HasSelfUrl, Named {
    private URI self;
    private String name;
    private String displayName;
    private String emailAddress;
    private Boolean active;
    private String expand;
    private String timeZone;
    private JIRACollection<JIRAGroup> groups;
    private Map<String, URI> avatarUrls;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Map<String, URI> getAvatarUrls() {
        return avatarUrls;
    }

    public void setAvatarUrls(Map<String, URI> avatarUrls) {
        this.avatarUrls = avatarUrls;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String getExpand() {
        return expand;
    }

    public void setExpand(String expand) {
        this.expand = expand;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public JIRACollection<JIRAGroup> getGroups() {
        return groups;
    }

    public void setGroups(JIRACollection<JIRAGroup> groups) {
        this.groups = groups;
    }

    @Override
    public URI getSelf() {
        return self;
    }

    public void setSelf(URI self) {
        this.self = self;
    }
}
