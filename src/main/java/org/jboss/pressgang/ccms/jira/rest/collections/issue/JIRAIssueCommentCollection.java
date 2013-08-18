package org.jboss.pressgang.ccms.jira.rest.collections.issue;

import java.util.List;

import org.jboss.pressgang.ccms.jira.rest.entities.issue.JIRAIssueComment;

public class JIRAIssueCommentCollection extends JIRAAbstractIssueCollection {
    private List<JIRAIssueComment> comments;

    public List<JIRAIssueComment> getComments() {
        return comments;
    }

    public void setComments(List<JIRAIssueComment> comments) {
        this.comments = comments;
    }
}
