package org.jboss.pressgang.ccms.jira.rest.entities.project;

import java.net.URI;
import java.util.List;
import java.util.Map;

import org.jboss.pressgang.ccms.jira.rest.entities.HasSelfUrl;
import org.jboss.pressgang.ccms.jira.rest.entities.Identifiable;
import org.jboss.pressgang.ccms.jira.rest.entities.component.JIRAComponent;
import org.jboss.pressgang.ccms.jira.rest.entities.issue.JIRAIssueType;
import org.jboss.pressgang.ccms.jira.rest.entities.user.JIRAUser;
import org.jboss.pressgang.ccms.jira.rest.entities.version.JIRAVersion;
import org.jboss.pressgang.ccms.jira.rest.enums.JIRAAssigneeType;

public class JIRAProject implements HasSelfUrl, Identifiable<Long> {
    private URI self;
    private Long id;
    private String key;
    private String description;
    private URI url;
    private JIRAUser lead;
    private JIRAAssigneeType assigneeType;
    private List<JIRAComponent> components;
    private List<JIRAIssueType> issueTypes;
    private List<JIRAVersion> versions;
    private Map<String, URI> roles;
    private Map<String, URI> avatarUrls;

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

    public List<JIRAComponent> getComponents() {
        return components;
    }

    public void setComponents(List<JIRAComponent> components) {
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

    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public Map<String, URI> getAvatarUrls() {
        return avatarUrls;
    }

    public void setAvatarUrls(Map<String, URI> avatarUrls) {
        this.avatarUrls = avatarUrls;
    }

    public Map<String, URI> getRoles() {
        return roles;
    }

    public void setRoles(Map<String, URI> roles) {
        this.roles = roles;
    }
}
