package org.jboss.pressgang.ccms.jira.rest.collections.issue;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jboss.pressgang.ccms.jira.rest.entities.issue.JIRAIssueWorkLog;

public class JIRAIssueWorkLogCollection extends JIRAAbstractIssueCollection {
    @JsonProperty("worklogs")
    private List<JIRAIssueWorkLog> workLogs;

    public List<JIRAIssueWorkLog> getWorkLogs() {
        return workLogs;
    }

    public void setWorkLogs(List<JIRAIssueWorkLog> workLogs) {
        this.workLogs = workLogs;
    }
}