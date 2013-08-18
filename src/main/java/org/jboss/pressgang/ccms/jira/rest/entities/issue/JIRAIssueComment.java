package org.jboss.pressgang.ccms.jira.rest.entities.issue;

import java.net.URI;
import java.util.Date;

import org.jboss.pressgang.ccms.jira.rest.entities.HasSelfUrl;
import org.jboss.pressgang.ccms.jira.rest.entities.Identifiable;
import org.jboss.pressgang.ccms.jira.rest.entities.visibility.JIRAVisibility;
import org.jboss.pressgang.ccms.jira.rest.entities.user.JIRAUser;

public class JIRAIssueComment implements HasSelfUrl, Identifiable<Long> {
    private URI self;
    private Long id;
    private String body;
    private JIRAUser author;
    private JIRAUser updateAuthor;
    private Date created;
    private Date updated;
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

    public JIRAVisibility getVisibility() {
        return visibility;
    }

    public void setVisibility(JIRAVisibility visibility) {
        this.visibility = visibility;
    }
}
