package org.jboss.pressgang.ccms.jira.rest.entities.group;

import org.jboss.pressgang.ccms.jira.rest.collections.JIRACollection;
import org.jboss.pressgang.ccms.jira.rest.entities.user.JIRAUser;

public class JIRAGroup {
    private String self;
    private String name;
    private String expand;
    private JIRACollection<JIRAUser> users;

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

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
