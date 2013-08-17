package org.jboss.pressgang.ccms.jira.rest.entities.avatar;

import java.util.List;

public class JIRAAvatars {
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
