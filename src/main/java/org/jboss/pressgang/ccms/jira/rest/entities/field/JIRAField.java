package org.jboss.pressgang.ccms.jira.rest.entities.field;

import org.jboss.pressgang.ccms.jira.rest.entities.Identifiable;
import org.jboss.pressgang.ccms.jira.rest.entities.Named;

public class JIRAField implements Identifiable<String>, Named {
    private String id;
    private String name;
    private Boolean custom;
    private Boolean orderable;
    private Boolean navigable;
    private Boolean searchable;
    private JIRAFieldSchema schema;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getCustom() {
        return custom;
    }

    public void setCustom(Boolean custom) {
        this.custom = custom;
    }

    public Boolean getOrderable() {
        return orderable;
    }

    public void setOrderable(Boolean orderable) {
        this.orderable = orderable;
    }

    public Boolean getNavigable() {
        return navigable;
    }

    public void setNavigable(Boolean navigable) {
        this.navigable = navigable;
    }

    public Boolean getSearchable() {
        return searchable;
    }

    public void setSearchable(Boolean searchable) {
        this.searchable = searchable;
    }

    public JIRAFieldSchema getSchema() {
        return schema;
    }

    public void setSchema(JIRAFieldSchema schema) {
        this.schema = schema;
    }
}
