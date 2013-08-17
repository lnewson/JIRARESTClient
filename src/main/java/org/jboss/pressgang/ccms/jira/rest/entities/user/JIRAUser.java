package org.jboss.pressgang.ccms.jira.rest.entities.user;

import java.util.Map;

import org.jboss.pressgang.ccms.jira.rest.collections.JIRACollection;
import org.jboss.pressgang.ccms.jira.rest.entities.group.JIRAGroup;

public class JIRAUser {
    private String self;
    private String name;
    private String displayName;
    private String emailAddress;
    private Boolean active;
    private String expand;
    private String timeZone;
    private JIRACollection<JIRAGroup> groups;
    private Map<String, String> avatarUrls;

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

    public Map<String, String> getAvatarUrls() {
        return avatarUrls;
    }

    public void setAvatarUrls(Map<String, String> avatarUrls) {
        this.avatarUrls = avatarUrls;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

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

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }
}
