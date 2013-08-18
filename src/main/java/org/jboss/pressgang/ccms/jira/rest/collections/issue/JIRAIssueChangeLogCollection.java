package org.jboss.pressgang.ccms.jira.rest.collections.issue;

import java.util.List;

import org.jboss.pressgang.ccms.jira.rest.entities.issue.JIRAIssueChangeLog;

public class JIRAIssueChangeLogCollection extends JIRAAbstractIssueCollection {
    private List<JIRAIssueChangeLog> histories;

    public List<JIRAIssueChangeLog> getHistories() {
        return histories;
    }

    public void setHistories(List<JIRAIssueChangeLog> histories) {
        this.histories = histories;
    }
}
