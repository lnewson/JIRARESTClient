package org.jboss.pressgang.ccms.jira.rest.entities.issue;

import java.util.Date;
import java.util.List;

import org.jboss.pressgang.ccms.jira.rest.entities.Identifiable;
import org.jboss.pressgang.ccms.jira.rest.entities.user.JIRAUser;

public class JIRAIssueChangeLog implements Identifiable<Long> {
    private Long id;
    private JIRAUser author;
    private Date created;
    private List<JIRAIssueChange> items;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public JIRAUser getAuthor() {
        return author;
    }

    public void setAuthor(JIRAUser author) {
        this.author = author;
    }

    public List<JIRAIssueChange> getItems() {
        return items;
    }

    public void setItems(List<JIRAIssueChange> items) {
        this.items = items;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
