package org.jboss.pressgang.ccms.jira.rest.collections.issue;

import java.util.List;

import org.jboss.pressgang.ccms.jira.rest.entities.issue.JIRAIssueComment;

public class JIRAIssueCommentCollection {
    private Integer startAt;
    private Integer maxResults;
    private Integer total;
    private List<JIRAIssueComment> comments;

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

    public List<JIRAIssueComment> getComments() {
        return comments;
    }

    public void setComments(List<JIRAIssueComment> comments) {
        this.comments = comments;
    }
}
