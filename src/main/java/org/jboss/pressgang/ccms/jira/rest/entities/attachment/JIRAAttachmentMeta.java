package org.jboss.pressgang.ccms.jira.rest.entities.attachment;

public class JIRAAttachmentMeta {
    private Boolean enabled;
    private Long uploadLimit;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Long getUploadLimit() {
        return uploadLimit;
    }

    public void setUploadLimit(Long uploadLimit) {
        this.uploadLimit = uploadLimit;
    }
}
