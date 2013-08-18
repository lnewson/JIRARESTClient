package org.jboss.pressgang.ccms.jira.rest.entities.issue;

import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jboss.pressgang.ccms.jira.rest.collections.issue.JIRAIssueCommentCollection;
import org.jboss.pressgang.ccms.jira.rest.collections.issue.JIRAIssueWorkLogCollection;
import org.jboss.pressgang.ccms.jira.rest.entities.attachment.JIRAAttachment;
import org.jboss.pressgang.ccms.jira.rest.entities.component.JIRAComponent;
import org.jboss.pressgang.ccms.jira.rest.entities.priority.JIRAPriority;
import org.jboss.pressgang.ccms.jira.rest.entities.project.JIRAProject;
import org.jboss.pressgang.ccms.jira.rest.entities.security.JIRASecurityLevel;
import org.jboss.pressgang.ccms.jira.rest.entities.status.JIRAStatus;
import org.jboss.pressgang.ccms.jira.rest.entities.user.JIRAUser;
import org.jboss.pressgang.ccms.jira.rest.entities.version.JIRAVersion;

public class JIRAIssueFields {
    @JsonProperty("subtasks")
    private List<JIRAIssueLink> subTasks;
    private JIRAProject project;
    private JIRAStatus status;
    @JsonProperty("issuetype")
    private JIRAIssueType issueType;
    private JIRAIssueProgress progress;
    @JsonProperty("aggregateprogress")
    private JIRAIssueProgress aggregateProgress;
    private JIRAPriority priority;
    private JIRAUser assignee;
    private JIRAUser reporter;
    private JIRASecurityLevel security;
    private String summary;
    private String description;
    private String environment;
    private Date created;
    private Date updated;
    @JsonProperty("duedate")
    private Date dueDate;
    @JsonProperty("resolutiondate")
    private Date resolutionDate;
    private Date lastViewed;
    @JsonProperty("timetracking")
    private JIRAIssueTimeTracking timeTracking;
    @JsonProperty("timespent")
    private Integer timeSpent;
    @JsonProperty("timeoriginalestimate")
    private Integer timeOriginalEstimate;
    @JsonProperty("aggregatetimeoriginalestimate")
    private Integer aggregateTimeOriginalEstimate;
    @JsonProperty("workratio")
    private Integer workRatio;
    @JsonProperty("issuelinks")
    private List<JIRAIssueLink> issueLinks;
    private List<JIRAComponent> components;
    private List<String> labels;
    private JIRAIssueCommentCollection comment;
    private JIRAIssueVotes votes;
    private JIRAIssueWatchers watches;
    private List<JIRAAttachment> attachment;
    @JsonProperty("worklog")
    private JIRAIssueWorkLogCollection workLog;
    private List<JIRAVersion> affectedVersions;
    private List<JIRAVersion> fixVersions;

    public List<JIRAIssueLink> getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(List<JIRAIssueLink> subTasks) {
        this.subTasks = subTasks;
    }

    public JIRAIssueTimeTracking getTimeTracking() {
        return timeTracking;
    }

    public void setTimeTracking(JIRAIssueTimeTracking timeTracking) {
        this.timeTracking = timeTracking;
    }

    public JIRAProject getProject() {
        return project;
    }

    public void setProject(JIRAProject project) {
        this.project = project;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<JIRAIssueLink> getIssueLinks() {
        return issueLinks;
    }

    public void setIssueLinks(List<JIRAIssueLink> issueLinks) {
        this.issueLinks = issueLinks;
    }

    public JIRAIssueType getIssueType() {
        return issueType;
    }

    public void setIssueType(JIRAIssueType issueType) {
        this.issueType = issueType;
    }

    public JIRAIssueProgress getProgress() {
        return progress;
    }

    public void setProgress(JIRAIssueProgress progress) {
        this.progress = progress;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public JIRAIssueVotes getVotes() {
        return votes;
    }

    public void setVotes(JIRAIssueVotes votes) {
        this.votes = votes;
    }

    public JIRAIssueWatchers getWatches() {
        return watches;
    }

    public void setWatches(JIRAIssueWatchers watches) {
        this.watches = watches;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getResolutionDate() {
        return resolutionDate;
    }

    public void setResolutionDate(Date resolutionDate) {
        this.resolutionDate = resolutionDate;
    }

    public JIRAIssueCommentCollection getComment() {
        return comment;
    }

    public void setComment(JIRAIssueCommentCollection comment) {
        this.comment = comment;
    }

    public List<JIRAComponent> getComponents() {
        return components;
    }

    public void setComponents(List<JIRAComponent> components) {
        this.components = components;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public JIRAStatus getStatus() {
        return status;
    }

    public void setStatus(JIRAStatus status) {
        this.status = status;
    }

    public JIRAPriority getPriority() {
        return priority;
    }

    public void setPriority(JIRAPriority priority) {
        this.priority = priority;
    }

    public JIRAUser getReporter() {
        return reporter;
    }

    public void setReporter(JIRAUser reporter) {
        this.reporter = reporter;
    }

    public JIRAIssueProgress getAggregateProgress() {
        return aggregateProgress;
    }

    public void setAggregateProgress(JIRAIssueProgress aggregateProgress) {
        this.aggregateProgress = aggregateProgress;
    }

    public JIRAUser getAssignee() {
        return assignee;
    }

    public void setAssignee(JIRAUser assignee) {
        this.assignee = assignee;
    }

    public JIRASecurityLevel getSecurity() {
        return security;
    }

    public void setSecurity(JIRASecurityLevel security) {
        this.security = security;
    }

    public Integer getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(Integer timeSpent) {
        this.timeSpent = timeSpent;
    }

    public Integer getWorkRatio() {
        return workRatio;
    }

    public void setWorkRatio(Integer workRatio) {
        this.workRatio = workRatio;
    }

    public Date getLastViewed() {
        return lastViewed;
    }

    public void setLastViewed(Date lastViewed) {
        this.lastViewed = lastViewed;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public Integer getTimeOriginalEstimate() {
        return timeOriginalEstimate;
    }

    public void setTimeOriginalEstimate(Integer timeOriginalEstimate) {
        this.timeOriginalEstimate = timeOriginalEstimate;
    }

    public Integer getAggregateTimeOriginalEstimate() {
        return aggregateTimeOriginalEstimate;
    }

    public void setAggregateTimeOriginalEstimate(Integer aggregateTimeOriginalEstimate) {
        this.aggregateTimeOriginalEstimate = aggregateTimeOriginalEstimate;
    }

    public List<JIRAAttachment> getAttachment() {
        return attachment;
    }

    public void setAttachment(List<JIRAAttachment> attachment) {
        this.attachment = attachment;
    }

    public JIRAIssueWorkLogCollection getWorkLog() {
        return workLog;
    }

    public void setWorkLog(JIRAIssueWorkLogCollection workLog) {
        this.workLog = workLog;
    }

    public List<JIRAVersion> getFixVersions() {
        return fixVersions;
    }

    public void setFixVersions(List<JIRAVersion> fixVersions) {
        this.fixVersions = fixVersions;
    }

    public List<JIRAVersion> getAffectedVersions() {
        return affectedVersions;
    }

    public void setAffectedVersions(List<JIRAVersion> affectedVersions) {
        this.affectedVersions = affectedVersions;
    }
}
