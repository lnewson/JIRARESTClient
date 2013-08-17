package org.jboss.pressgang.ccms.jira.rest.entities.attachment;

import java.util.Date;

import org.jboss.pressgang.ccms.jira.rest.entities.user.JIRAUser;

public class JIRAAttachment {
    private String self;
    private Integer id;
    private String filename;
    private Date created;
    private Long size;
    private String mimeType;
    private String content;
    private String thumbnail;
    private JIRAUser author;

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public JIRAUser getAuthor() {
        return author;
    }

    public void setAuthor(JIRAUser author) {
        this.author = author;
    }
}
