package org.jboss.pressgang.ccms.jira.rest.entities.issue;

import java.util.Date;

import org.jboss.pressgang.ccms.jira.rest.entities.user.JIRAUser;

public class JIRAIssueWorkLog {
    private String self;
    private Integer id;
    private Date started;
    private String timeSpent;
    private Integer timeSpentSeconds;
    private JIRAUser author;
    private JIRAUser updateAuthor;

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

    public Date getStarted() {
        return started;
    }

    public void setStarted(Date started) {
        this.started = started;
    }

    public String getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(String timeSpent) {
        this.timeSpent = timeSpent;
    }

    public Integer getTimeSpentSeconds() {
        return timeSpentSeconds;
    }

    public void setTimeSpentSeconds(Integer timeSpentSeconds) {
        this.timeSpentSeconds = timeSpentSeconds;
    }

    public JIRAUser getAuthor() {
        return author;
    }

    public void setAuthor(JIRAUser author) {
        this.author = author;
    }

    public JIRAUser getUpdateAuthor() {
        return updateAuthor;
    }

    public void setUpdateAuthor(JIRAUser updateAuthor) {
        this.updateAuthor = updateAuthor;
    }
}
