package org.jboss.pressgang.ccms.jira.rest.entities.project;

import java.util.List;
import java.util.Map;

import org.jboss.pressgang.ccms.jira.rest.entities.issue.JIRAIssueType;
import org.jboss.pressgang.ccms.jira.rest.entities.user.JIRAUser;
import org.jboss.pressgang.ccms.jira.rest.entities.version.JIRAVersion;
import org.jboss.pressgang.ccms.jira.rest.enums.JIRAAssigneeType;

public class JIRAProject {
    private String self;
    private Integer id;
    private String key;
    private String description;
    private String url;
    private JIRAUser lead;
    private JIRAAssigneeType assigneeType;
    private List<JIRAProjectComponent> components;
    private List<JIRAIssueType> issueTypes;
    private List<JIRAVersion> versions;
    private Map<String, String> roles;
    private Map<String, String> avatarUrls;

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public JIRAUser getLead() {
        return lead;
    }

    public void setLead(JIRAUser lead) {
        this.lead = lead;
    }

    public List<JIRAProjectComponent> getComponents() {
        return components;
    }

    public void setComponents(List<JIRAProjectComponent> components) {
        this.components = components;
    }

    public List<JIRAIssueType> getIssueTypes() {
        return issueTypes;
    }

    public void setIssueTypes(List<JIRAIssueType> issueTypes) {
        this.issueTypes = issueTypes;
    }

    public List<JIRAVersion> getVersions() {
        return versions;
    }

    public void setVersions(List<JIRAVersion> versions) {
        this.versions = versions;
    }

    public JIRAAssigneeType getAssigneeType() {
        return assigneeType;
    }

    public void setAssigneeType(JIRAAssigneeType assigneeType) {
        this.assigneeType = assigneeType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, String> getAvatarUrls() {
        return avatarUrls;
    }

    public void setAvatarUrls(Map<String, String> avatarUrls) {
        this.avatarUrls = avatarUrls;
    }

    public Map<String, String> getRoles() {
        return roles;
    }

    public void setRoles(Map<String, String> roles) {
        this.roles = roles;
    }
}
