package org.jboss.pressgang.ccms.jira.rest.collections.issue;

import java.util.List;

import org.jboss.pressgang.ccms.jira.rest.entities.issue.JIRAIssueChangeLog;

public class JIRAIssueChangeLogCollection {
    private Integer startAt;
    private Integer maxResults;
    private Integer total;
    private List<JIRAIssueChangeLog> histories;

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

    public List<JIRAIssueChangeLog> getHistories() {
        return histories;
    }

    public void setHistories(List<JIRAIssueChangeLog> histories) {
        this.histories = histories;
    }
}
