package org.jboss.pressgang.ccms.jira.rest.entities.issue;

public class JIRAIssueProgress {
    private Integer progress;
    private Integer total;

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
