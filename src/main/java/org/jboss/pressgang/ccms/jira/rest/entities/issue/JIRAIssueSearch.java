package org.jboss.pressgang.ccms.jira.rest.entities.issue;

import java.util.List;

public class JIRAIssueSearch {
    private String jql;
    private Integer startAt;
    private Integer maxResults;
    private Boolean validateQuery;
    private List<String> fields;
    private String expand;

    public String getJql() {
        return jql;
    }

    public void setJql(String jql) {
        this.jql = jql;
    }

    public Integer getStartAt() {
        return startAt;
    }

    public void setStartAt(Integer startAt) {
        this.startAt = startAt;
    }

    public Integer getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    public Boolean getValidateQuery() {
        return validateQuery;
    }

    public void setValidateQuery(Boolean validateQuery) {
        this.validateQuery = validateQuery;
    }

    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public String getExpand() {
        return expand;
    }

    public void setExpand(String expand) {
        this.expand = expand;
    }
}
