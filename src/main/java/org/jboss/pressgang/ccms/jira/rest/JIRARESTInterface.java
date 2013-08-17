package org.jboss.pressgang.ccms.jira.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

import org.jboss.pressgang.ccms.jira.rest.collections.issue.JIRAIssueCommentCollection;
import org.jboss.pressgang.ccms.jira.rest.collections.issue.JIRAIssueWorkLogCollection;
import org.jboss.pressgang.ccms.jira.rest.entities.attachment.JIRAAttachment;
import org.jboss.pressgang.ccms.jira.rest.entities.attachment.JIRAAttachmentMeta;
import org.jboss.pressgang.ccms.jira.rest.entities.avatar.JIRAAvatars;
import org.jboss.pressgang.ccms.jira.rest.entities.field.JIRAField;
import org.jboss.pressgang.ccms.jira.rest.entities.group.JIRAGroup;
import org.jboss.pressgang.ccms.jira.rest.entities.issue.JIRAIssue;
import org.jboss.pressgang.ccms.jira.rest.entities.issue.JIRAIssueComment;
import org.jboss.pressgang.ccms.jira.rest.entities.issue.JIRAIssueType;
import org.jboss.pressgang.ccms.jira.rest.entities.issue.JIRAIssueVotes;
import org.jboss.pressgang.ccms.jira.rest.entities.issue.JIRAIssueWatchers;
import org.jboss.pressgang.ccms.jira.rest.entities.issue.JIRAIssueWorkLog;
import org.jboss.pressgang.ccms.jira.rest.entities.project.JIRAProject;
import org.jboss.pressgang.ccms.jira.rest.entities.project.JIRAProjectComponent;
import org.jboss.pressgang.ccms.jira.rest.entities.resolution.JIRAResolution;
import org.jboss.pressgang.ccms.jira.rest.entities.security.JIRASecurityLevel;
import org.jboss.pressgang.ccms.jira.rest.entities.status.JIRAStatus;
import org.jboss.pressgang.ccms.jira.rest.entities.user.JIRAUser;
import org.jboss.pressgang.ccms.jira.rest.entities.version.JIRAVersion;

@Path("/rest/api/2")
public interface JIRARESTInterface {

    // ATTACHMENT

    @GET
    @Path("/attachment/meta")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAAttachmentMeta getAttachmentMeta();

    @GET
    @Path("/attachment/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAAttachment getAttachment(@PathParam("id") Integer id);

    @DELETE
    @Path("/attachment/{id}")
    void deleteAttachment(@PathParam("id") Integer id);

    // FIELD

    @GET
    @Path("/field")
    @Produces(MediaType.APPLICATION_JSON)
    List<JIRAField> getFields();

    // GROUP

    @GET
    @Path("/group")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAGroup getGroup(@QueryParam("groupName") String groupName, @QueryParam("expand") String expand);

    // ISSUE ID

    @GET
    @Path("/issue/{issueId}")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAIssue getIssue(@PathParam("issueId") Integer issueId);

    @GET
    @Path("/issue/{issueId}")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAIssue getIssue(@PathParam("issueId") Integer issueId, @QueryParam("fields") String fields, @QueryParam("expand") String expand);

    @GET
    @Path("/issue/{issueId}/assignee")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAUser getIssueAssignee(@PathParam("issueId") Integer issueId);

    @GET
    @Path("/issue/{issueId}/comment")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAIssueCommentCollection getIssueComments(@PathParam("issueId") Integer issueId);

    @GET
    @Path("/issue/{issueId}/comment/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAIssueComment getIssueComment(@PathParam("issueId") Integer issueId, @PathParam("id") Integer commentId);

    @GET
    @Path("/issue/{issueId}/votes")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAIssueVotes getIssueVotes(@PathParam("issueId") Integer issueId);

    @GET
    @Path("/issue/{issueId}/watchers")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAIssueWatchers getIssueWatchers(@PathParam("issueId") Integer issueId);

    @GET
    @Path("/issue/{issueId}/worklog")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAIssueWorkLogCollection getIssueWorkLogs(@PathParam("issueId") Integer issueId);

    @GET
    @Path("/issue/{issueId}/worklog/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAIssueWorkLog getIssueWorkLog(@PathParam("issueId") Integer issueId, @PathParam("id") Integer workLogId);

    // ISSUE KEY

    @GET
    @Path("/issue/{issueKey}")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAIssue getIssue(@PathParam("issueKey") String issueKey);

    @GET
    @Path("/issue/{issueKey}")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAIssue getIssue(@PathParam("issueKey") String issueKey, @QueryParam("fields") String fields, @QueryParam("expand") String expand);

    @GET
    @Path("/issue/{issueKey}/assignee")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAUser getIssueAssignee(@PathParam("issueKey") String issueKey);

    @GET
    @Path("/issue/{issueKey}/comment")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAIssueCommentCollection getIssueComments(@PathParam("issueKey") String issueKey);

    @GET
    @Path("/issue/{issueKey}/comment/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAIssueComment getIssueComment(@PathParam("issueKey") String issueKey, @PathParam("id") Integer commentId);

    @GET
    @Path("/issue/{issueKey}/votes")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAIssueVotes getIssueVotes(@PathParam("issueKey") String issueKey);

    @GET
    @Path("/issue/{issueKey}/watchers")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAIssueWatchers getIssueWatchers(@PathParam("issueKey") String issueKey);

    @GET
    @Path("/issue/{issueKey}/worklog")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAIssueWorkLogCollection getIssueWorkLogs(@PathParam("issueKey") String issueKey);

    @GET
    @Path("/issue/{issueKey}/worklog/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAIssueWorkLog getIssueWorkLog(@PathParam("issueKey") String issueKey, @PathParam("id") Integer workLogId);

    // ISSUE TYPE

    @GET
    @Path("/issuetype")
    @Produces(MediaType.APPLICATION_JSON)
    List<JIRAIssueType> getIssueTypes();

    @GET
    @Path("/issuetype/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAIssueType getIssueType(@PathParam("id") Integer id);

    // PROJECT

    @GET
    @Path("/project")
    @Produces(MediaType.APPLICATION_JSON)
    List<JIRAProject> getProjects();

    @GET
    @Path("/project/{key}")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAProject getProject(@PathParam("key") String projectKey);

    @GET
    @Path("/project/{key}/avatars")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAAvatars getProjectAvatars(@PathParam("key") String projectKey);

    @DELETE
    @Path("/project/{key}/avatar/{id}")
    void deleteProjectAvatar(@PathParam("key") String projectKey, @PathParam("id") Integer id);

    @GET
    @Path("/project/{key}/components")
    @Produces(MediaType.APPLICATION_JSON)
    List<JIRAProjectComponent> getProjectComponents(@PathParam("key") String projectKey);

    @GET
    @Path("/project/{key}/statuses")
    @Produces(MediaType.APPLICATION_JSON)
    List<JIRAIssueType> getProjectIssueTypes(@PathParam("key") String projectKey);

    @GET
    @Path("/project/{key}/versions")
    @Produces(MediaType.APPLICATION_JSON)
    List<JIRAVersion> getProjectVersions(@PathParam("key") String projectKey);

    // RESOLUTION

    @GET
    @Path("/resolution")
    @Produces(MediaType.APPLICATION_JSON)
    List<JIRAResolution> getResolutions();

    @GET
    @Path("/resolution/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAResolution getResolution(@PathParam("id") Integer id);

    // SECURITY

    @GET
    @Path("/securitylevel/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    JIRASecurityLevel getSecurityLevel(@PathParam("id") Integer id);

    // STATUS

    @GET
    @Path("/status")
    @Produces(MediaType.APPLICATION_JSON)
    List<JIRAStatus> getStatuses();

    @GET
    @Path("/status/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAStatus getStatus(@PathParam("id") Integer id);

    @GET
    @Path("/status/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAStatus getStatus(@PathParam("name") String name);

    // USER

    @GET
    @Path("/user")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAUser getUser(@QueryParam("username") String username);

    @GET
    @Path("/user/search")
    @Produces(MediaType.APPLICATION_JSON)
    List<JIRAUser> searchUsers(@QueryParam("username") String username, @QueryParam("startAt") Integer startAt,
            @QueryParam("maxResults") Integer maxResults, @QueryParam("includeActive") Boolean includeActive,
            @QueryParam("includeInactive") Boolean includeInactive);

    // VERSION

    @GET
    @Path("/version/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    JIRAVersion getVersion(@PathParam("id") Integer id);

    @DELETE
    @Path("/version/{id}")
    void deleteVersion(@PathParam("id") Integer id);

    @PUT
    @Path("/version/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    void updateVersion(@PathParam("id") Integer id, JIRAVersion version);
}