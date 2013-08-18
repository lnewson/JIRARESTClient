package org.jboss.pressgang.ccms.jira.rest.entities.issue;

import java.net.URI;
import java.util.List;

import org.jboss.pressgang.ccms.jira.rest.entities.HasSelfUrl;
import org.jboss.pressgang.ccms.jira.rest.entities.user.JIRAUser;

public class JIRAIssueWatchers implements HasSelfUrl {
    private URI self;
    private Integer watchCount;
    private Boolean isWatching;
    private List<JIRAUser> watchers;

    @Override
    public URI getSelf() {
        return self;
    }

    public void setSelf(URI self) {
        this.self = self;
    }

    public Integer getWatchCount() {
        return watchCount;
    }

    public void setWatchCount(Integer watchCount) {
        this.watchCount = watchCount;
    }

    public Boolean getWatching() {
        return isWatching;
    }

    public void setWatching(Boolean watching) {
        isWatching = watching;
    }

    public List<JIRAUser> getWatchers() {
        return watchers;
    }

    public void setWatchers(List<JIRAUser> watchers) {
        this.watchers = watchers;
    }
}
