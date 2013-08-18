package org.jboss.pressgang.ccms.jira.rest.collections.avatar;

import java.util.List;

import org.jboss.pressgang.ccms.jira.rest.entities.avatar.JIRAAvatar;

public class JIRAAvatarCollection {
    private List<JIRAAvatar> system;
    private List<JIRAAvatar> custom;

    public List<JIRAAvatar> getSystem() {
        return system;
    }

    public void setSystem(List<JIRAAvatar> system) {
        this.system = system;
    }

    public List<JIRAAvatar> getCustom() {
        return custom;
    }

    public void setCustom(List<JIRAAvatar> custom) {
        this.custom = custom;
    }
}
