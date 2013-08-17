package org.jboss.pressgang.ccms.jira.rest.collections.issue;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jboss.pressgang.ccms.jira.rest.entities.issue.JIRAIssueWorkLog;

public class JIRAIssueWorkLogCollection {
    private Integer startAt;
    private Integer maxResults;
    private Integer total;
    @JsonProperty("worklogs")
    private List<JIRAIssueWorkLog> workLogs;

    public Integer getStartAt() {
        return startAt;
    }

    public void setStartAt(Integer startAt) {
        this.startAt = startAt;
    }

    public Integer getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<JIRAIssueWorkLog> getWorkLogs() {
        return workLogs;
    }

    public void setWorkLogs(List<JIRAIssueWorkLog> workLogs) {
        this.workLogs = workLogs;
    }
}