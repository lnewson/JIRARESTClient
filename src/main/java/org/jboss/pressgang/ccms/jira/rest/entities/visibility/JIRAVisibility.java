package org.jboss.pressgang.ccms.jira.rest.entities.visibility;

import org.jboss.pressgang.ccms.jira.rest.enums.JIRAVisibilityType;

public class JIRAVisibility {
    private JIRAVisibilityType type;
    private String value;

    public JIRAVisibilityType getType() {
        return type;
    }

    public void setType(JIRAVisibilityType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
