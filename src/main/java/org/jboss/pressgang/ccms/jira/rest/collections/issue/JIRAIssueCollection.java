package org.jboss.pressgang.ccms.jira.rest.collections.issue;

import java.util.List;

import org.jboss.pressgang.ccms.jira.rest.entities.issue.JIRAIssue;

public class JIRAIssueCollection extends JIRAAbstractIssueCollection {
    private String expand;
    private List<JIRAIssue> issues;

    public List<JIRAIssue> getIssues() {
        return issues;
    }

    public void setIssues(List<JIRAIssue> issues) {
        this.issues = issues;
    }

    public String getExpand() {
        return expand;
    }

    public void setExpand(String expand) {
        this.expand = expand;
    }
}
