package org.jboss.pressgang.ccms.jira.rest.entities.issue;

import java.net.URI;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jboss.pressgang.ccms.jira.rest.entities.HasSelfUrl;
import org.jboss.pressgang.ccms.jira.rest.entities.Identifiable;
import org.jboss.pressgang.ccms.jira.rest.entities.Named;
import org.jboss.pressgang.ccms.jira.rest.entities.status.JIRAStatus;

public class JIRAIssueType implements HasSelfUrl, Identifiable<Long>, Named {
    private URI self;
    private Long id;
    private String name;
    private String description;
    private URI iconUrl;
    @JsonProperty("subtask")
    private Boolean subTask;
    private List<JIRAStatus> statuses;

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

    public Boolean getSubTask() {
        return subTask;
    }

    public void setSubTask(Boolean subTask) {
        this.subTask = subTask;
    }

    public URI getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(URI iconUrl) {
        this.iconUrl = iconUrl;
    }

    public List<JIRAStatus> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<JIRAStatus> statuses) {
        this.statuses = statuses;
    }
}
