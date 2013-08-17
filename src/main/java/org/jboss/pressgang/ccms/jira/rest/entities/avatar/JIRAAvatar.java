package org.jboss.pressgang.ccms.jira.rest.entities.avatar;

public class JIRAAvatar {
    private Integer id;
    private String owner;
    private Boolean isSystemAvatar;
    private Boolean isSelected;
    private Boolean selected;

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public Boolean getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
    }

    public Boolean getSystemAvatar() {
        return isSystemAvatar;
    }

    public void setSystemAvatar(Boolean systemAvatar) {
        isSystemAvatar = systemAvatar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
