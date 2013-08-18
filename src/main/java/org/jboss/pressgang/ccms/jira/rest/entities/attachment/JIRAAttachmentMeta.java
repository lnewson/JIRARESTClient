package org.jboss.pressgang.ccms.jira.rest.entities.attachment;

public class JIRAAttachmentMeta {
    private Boolean enabled;
    private Integer uploadLimit;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getUploadLimit() {
        return uploadLimit;
    }

    public void setUploadLimit(Integer uploadLimit) {
        this.uploadLimit = uploadLimit;
    }
}
