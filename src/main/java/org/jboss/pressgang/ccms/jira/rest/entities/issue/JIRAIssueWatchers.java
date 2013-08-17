package org.jboss.pressgang.ccms.jira.rest.entities.issue;

import java.util.List;

import org.jboss.pressgang.ccms.jira.rest.entities.user.JIRAUser;

public class JIRAIssueWatchers {
    private String self;
    private Integer watchCount;
    private Boolean isWatching;
    private List<JIRAUser> watchers;

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
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
