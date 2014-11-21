package com.cloudbees.jenkins.plugins.gcloud;

import hudson.slaves.AbstractCloudComputer;

/**
 * Created by nicolas on 21/11/14.
 */
public class GoogleComputer extends AbstractCloudComputer<GoogleSlave> {

    public GoogleComputer(GoogleSlave slave) {
        super(slave);
    }
}
