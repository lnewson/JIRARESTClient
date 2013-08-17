package org.jboss.pressgang.ccms.jira.rest.entities.issue;

import java.util.Date;
import java.util.List;

import org.jboss.pressgang.ccms.jira.rest.entities.user.JIRAUser;

public class JIRAIssueChangeLog {
    private Integer id;
    private JIRAUser author;
    private Date created;
    private List<JIRAIssueChange> items;
}
