package org.jboss.pressgang.ccms.jira.rest.entities.issue;

import java.net.URI;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jboss.pressgang.ccms.jira.rest.collections.issue.JIRAIssueChangeLogCollection;
import org.jboss.pressgang.ccms.jira.rest.entities.HasExpandableFields;
import org.jboss.pressgang.ccms.jira.rest.entities.HasSelfUrl;
import org.jboss.pressgang.ccms.jira.rest.entities.Identifiable;
import org.jboss.pressgang.ccms.jira.rest.entities.field.JIRAFieldSchema;

public class JIRAIssue implements HasSelfUrl, Identifiable<Long>, HasExpandableFields {
    private URI self;
    private Long id;
    private String key;
    private String expand;
    private JIRAIssueFields fields;
    private Map<String, String> names;
    private Map<String, JIRAFieldSchema> schema;
    @JsonProperty("changelog")
    private JIRAIssueChangeLogCollection changeLog;

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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String getExpand() {
        return expand;
    }

    public void setExpand(String expand) {
        this.expand = expand;
    }

    public Map<String, String> getNames() {
        return names;
    }

    public void setNames(Map<String, String> names) {
        this.names = names;
    }

    public JIRAIssueFields getFields() {
        return fields;
    }

    public void setFields(JIRAIssueFields fields) {
        this.fields = fields;
    }

    public Map<String, JIRAFieldSchema> getSchema() {
        return schema;
    }

    public void setSchema(Map<String, JIRAFieldSchema> schema) {
        this.schema = schema;
    }

    public JIRAIssueChangeLogCollection getChangeLog() {
        return changeLog;
    }

    public void setChangeLog(JIRAIssueChangeLogCollection changeLog) {
        this.changeLog = changeLog;
    }
}
