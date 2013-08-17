package org.jboss.pressgang.ccms.jira.rest.entities.issue;

import java.util.Date;

import org.jboss.pressgang.ccms.jira.rest.entities.user.JIRAUser;

public class JIRAIssueComment {
    private String self;
    private Integer id;
    private String body;
    private JIRAUser author;
    private JIRAUser updateAuthor;
    private Date created;
    private Date updated;
    private JIRAIssueCommentVisibility visibility;

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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public JIRAIssueCommentVisibility getVisibility() {
        return visibility;
    }

    public void setVisibility(JIRAIssueCommentVisibility visibility) {
        this.visibility = visibility;
    }
}
