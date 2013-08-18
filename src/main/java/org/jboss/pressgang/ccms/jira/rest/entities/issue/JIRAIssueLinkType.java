package org.jboss.pressgang.ccms.jira.rest.entities.issue;

import org.jboss.pressgang.ccms.jira.rest.entities.Identifiable;
import org.jboss.pressgang.ccms.jira.rest.entities.Named;

public class JIRAIssueLinkType implements Identifiable<Long>, Named {
    private Long id;
    private String name;
    private String inward;
    private String outward;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInward() {
        return inward;
    }

    public void setInward(String inward) {
        this.inward = inward;
    }

    public String getOutward() {
        return outward;
    }

    public void setOutward(String outward) {
        this.outward = outward;
    }
}
