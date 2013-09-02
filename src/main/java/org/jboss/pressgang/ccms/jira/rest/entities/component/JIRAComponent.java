package org.jboss.pressgang.ccms.jira.rest.entities.component;

import java.net.URI;

import org.jboss.pressgang.ccms.jira.rest.entities.HasSelfUrl;
import org.jboss.pressgang.ccms.jira.rest.entities.Identifiable;
import org.jboss.pressgang.ccms.jira.rest.entities.Named;
import org.jboss.pressgang.ccms.jira.rest.entities.user.JIRAUser;
import org.jboss.pressgang.ccms.jira.rest.enums.JIRAAssigneeType;

public class JIRAComponent implements HasSelfUrl, Identifiable<Long>, Named {
    private URI self;
    private Long id;
    private String name;
    private String description;
    private JIRAUser lead;
    private JIRAUser assignee;
    private JIRAUser realAssignee;
    private JIRAAssigneeType assigneeType;
    private JIRAAssigneeType realAssigneeType;
    private Boolean isAssigneeTypeValid;

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

    @Override
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
