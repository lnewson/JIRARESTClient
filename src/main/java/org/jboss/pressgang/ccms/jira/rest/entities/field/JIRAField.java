package org.jboss.pressgang.ccms.jira.rest.entities.field;

public class JIRAField {
    private String id;
    private String name;
    private Boolean custom;
    private Boolean orderable;
    private Boolean navigable;
    private Boolean searchable;
    private JIRAFieldSchema schema;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
