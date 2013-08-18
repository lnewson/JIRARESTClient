package org.jboss.pressgang.ccms.jira.rest.collections.issue;

public abstract class JIRAAbstractIssueCollection {
    private Integer startAt;
    private Integer maxResults;
    private Integer total;

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
}
