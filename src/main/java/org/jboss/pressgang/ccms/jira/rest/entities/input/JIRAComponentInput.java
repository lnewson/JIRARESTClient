package org.jboss.pressgang.ccms.jira.rest.entities.input;

import org.jboss.pressgang.ccms.jira.rest.enums.JIRAAssigneeType;

public class JIRAComponentInput {
    private String name;
    private String description;
    private String leadUsername;
    private String project;
    private JIRAAssigneeType assigneeType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLeadUsername() {
        return leadUsername;
    }

    public void setLeadUsername(String leadUsername) {
        this.leadUsername = leadUsername;
    }

    public JIRAAssigneeType getAssigneeType() {
        return assigneeType;
    }

    public void setAssigneeType(JIRAAssigneeType assigneeType) {
        this.assigneeType = assigneeType;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
}
