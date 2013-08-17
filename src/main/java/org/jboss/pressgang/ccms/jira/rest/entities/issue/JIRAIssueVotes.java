package org.jboss.pressgang.ccms.jira.rest.entities.issue;

import java.util.List;

import org.jboss.pressgang.ccms.jira.rest.entities.user.JIRAUser;

public class JIRAIssueVotes {
    private String self;
    private Integer votes;
    private Boolean hasVoted;
    private List<JIRAUser> voters;

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    public Boolean getHasVoted() {
        return hasVoted;
    }

    public void setHasVoted(Boolean hasVoted) {
        this.hasVoted = hasVoted;
    }

    public List<JIRAUser> getVoters() {
        return voters;
    }

    public void setVoters(List<JIRAUser> voters) {
        this.voters = voters;
    }
}
