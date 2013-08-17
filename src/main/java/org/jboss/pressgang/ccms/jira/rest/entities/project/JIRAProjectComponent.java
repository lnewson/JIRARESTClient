package org.jboss.pressgang.ccms.jira.rest.entities.project;

import org.jboss.pressgang.ccms.jira.rest.entities.user.JIRAUser;
import org.jboss.pressgang.ccms.jira.rest.enums.JIRAAssigneeType;

public class JIRAProjectComponent {
    private String self;
    private Integer id;
    private String name;
    private JIRAUser lead;
    private JIRAUser assignee;
    private JIRAUser realAssignee;
    private JIRAAssigneeType assigneeType;
    private JIRAAssigneeType realAssigneeType;
    private Boolean isAssigneeTypeValid;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsAssigneeTypeValid() {
        return isAssigneeTypeValid;
    }

    public void setIsAssigneeTypeValid(Boolean isAssigneeTypeValid) {
        this.isAssigneeTypeValid = isAssigneeTypeValid;
    }

    public JIRAUser getLead() {
        return lead;
    }

    public void setLead(JIRAUser lead) {
        this.lead = lead;
    }

    public JIRAAssigneeType getAssigneeType() {
        return assigneeType;
    }

    public void setAssigneeType(JIRAAssigneeType assigneeType) {
        this.assigneeType = assigneeType;
    }

    public JIRAUser getAssignee() {
        return assignee;
    }

    public void setAssignee(JIRAUser assignee) {
        this.assignee = assignee;
    }

    public JIRAUser getRealAssignee() {
        return realAssignee;
    }

    public void setRealAssignee(JIRAUser realAssignee) {
        this.realAssignee = realAssignee;
    }

    public JIRAAssigneeType getRealAssigneeType() {
        return realAssigneeType;
    }

    public void setRealAssigneeType(JIRAAssigneeType realAssigneeType) {
        this.realAssigneeType = realAssigneeType;
    }
}
