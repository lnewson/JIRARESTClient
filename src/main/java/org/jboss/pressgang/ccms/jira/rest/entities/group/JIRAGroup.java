package org.jboss.pressgang.ccms.jira.rest.entities.group;

import java.net.URI;

import org.jboss.pressgang.ccms.jira.rest.collections.JIRACollection;
import org.jboss.pressgang.ccms.jira.rest.entities.HasSelfUrl;
import org.jboss.pressgang.ccms.jira.rest.entities.Named;
import org.jboss.pressgang.ccms.jira.rest.entities.user.JIRAUser;

public class JIRAGroup implements HasSelfUrl, Named {
    private URI self;
    private String name;
    private String expand;
    private JIRACollection<JIRAUser> users;

    @Override
    public URI getSelf() {
        return self;
    }

    public void setSelf(URI self) {
        this.self = self;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JIRACollection<JIRAUser> getUsers() {
        return users;
    }

    public void setUsers(JIRACollection<JIRAUser> users) {
        this.users = users;
    }

    public String getExpand() {
        return expand;
    }

    public void setExpand(String expand) {
        this.expand = expand;
    }
}
