package org.jboss.pressgang.ccms.jira.rest.collections;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class JIRACollection<T> {
    private Integer size;
    private List<T> items;
    @JsonProperty("max-results")
    private Integer maxResults;
    @JsonProperty("start-index")
    private Integer startIndex;
    @JsonProperty("end-index")
    private Integer endIndex;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public Integer getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
    }
}
