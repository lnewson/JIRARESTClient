package org.jboss.pressgang.ccms.jira.rest.entities.issue;

import java.net.URI;
import java.util.List;

import org.jboss.pressgang.ccms.jira.rest.entities.HasSelfUrl;
import org.jboss.pressgang.ccms.jira.rest.entities.user.JIRAUser;

public class JIRAIssueVotes implements HasSelfUrl {
    private URI self;
    private Integer votes;
    private Boolean hasVoted;
    private List<JIRAUser> voters;

    @Override
    public URI getSelf() {
        return self;
    }

    public void setSelf(URI self) {
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
