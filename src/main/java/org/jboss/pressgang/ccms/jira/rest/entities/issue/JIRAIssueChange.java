package org.jboss.pressgang.ccms.jira.rest.entities.issue;

import org.jboss.pressgang.ccms.jira.rest.enums.JIRAFieldType;

public class JIRAIssueChange {
    private String field;
    private JIRAFieldType fieldType;
    private String from;
    private String fromString;
    private String to;
    private String toString;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public JIRAFieldType getFieldType() {
        return fieldType;
    }

    public void setFieldType(JIRAFieldType fieldType) {
        this.fieldType = fieldType;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getFromString() {
        return fromString;
    }

    public void setFromString(String fromString) {
        this.fromString = fromString;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getToString() {
        return toString;
    }

    public void setToString(String toString) {
        this.toString = toString;
    }
}
