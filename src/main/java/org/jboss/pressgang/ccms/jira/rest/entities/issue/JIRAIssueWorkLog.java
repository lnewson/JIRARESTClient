package org.jboss.pressgang.ccms.jira.rest.entities.issue;

import java.net.URI;
import java.util.Date;

import org.jboss.pressgang.ccms.jira.rest.entities.HasSelfUrl;
import org.jboss.pressgang.ccms.jira.rest.entities.Identifiable;
import org.jboss.pressgang.ccms.jira.rest.entities.visibility.JIRAVisibility;
import org.jboss.pressgang.ccms.jira.rest.entities.user.JIRAUser;

public class JIRAIssueWorkLog implements HasSelfUrl, Identifiable<Long> {
    private URI self;
    private Long id;
    private Date started;
    private String timeSpent;
    private Integer timeSpentSeconds;
    private JIRAUser author;
    private JIRAUser updateAuthor;
    private JIRAVisibility visibility;

    @Override
    public URI getSelf() {
        return self;
    }

    public void setSelf(URI self) {
        this.self = self;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public JIRAVisibility getVisibility() {
        return visibility;
    }

    public void setVisibility(JIRAVisibility visibility) {
        this.visibility = visibility;
    }
}
