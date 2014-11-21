package com.cloudbees.jenkins.plugins.gcloud;

import hudson.model.Label;
import hudson.slaves.Cloud;
import hudson.slaves.NodeProvisioner;

import java.util.Collection;
import java.util.logging.Logger;

/**
 * Created by nicolas on 21/11/14.
 */
public class GoogleCloud extends Cloud {

    protected GoogleCloud(String name) {
        super(name);
    }

    @Override
    public Collection<NodeProvisioner.PlannedNode> provision(Label label, int i) {
        return null;
    }

    @Override
    public boolean canProvision(Label label) {
        GoogleSlaveTemplate template = getSlaveTemplate(label);
        return (template != null);
    }

    private GoogleSlaveTemplate getSlaveTemplate(Label label) {
        return null;
    }

    public static final Logger LOGGER = Logger.getLogger(GoogleCloud.class.getName());
}
