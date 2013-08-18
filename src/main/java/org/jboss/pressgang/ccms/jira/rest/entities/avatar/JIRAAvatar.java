package org.jboss.pressgang.ccms.jira.rest.entities.avatar;

import org.jboss.pressgang.ccms.jira.rest.entities.Identifiable;

public class JIRAAvatar implements Identifiable<Long> {
    private Long id;
    private String owner;
    private Boolean isSystemAvatar;
    private Boolean isSelected;
    private Boolean selected;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
