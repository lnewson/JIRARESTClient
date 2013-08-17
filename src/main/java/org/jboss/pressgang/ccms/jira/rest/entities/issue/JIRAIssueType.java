package org.jboss.pressgang.ccms.jira.rest.entities.issue;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jboss.pressgang.ccms.jira.rest.entities.status.JIRAStatus;

public class JIRAIssueType {
    private String self;
    private Integer id;
    private String name;
    private String description;
    private String iconUrl;
    @JsonProperty("subtask")
    private Boolean subTask;
    private List<JIRAStatus> statuses;

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

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public List<JIRAStatus> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<JIRAStatus> statuses) {
        this.statuses = statuses;
    }
}
