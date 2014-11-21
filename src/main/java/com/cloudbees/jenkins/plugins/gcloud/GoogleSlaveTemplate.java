package com.cloudbees.jenkins.plugins.gcloud;

import hudson.Extension;
import hudson.model.AbstractDescribableImpl;
import hudson.model.Descriptor;

/**
 * Created by nicolas on 21/11/14.
 */
public class GoogleSlaveTemplate extends AbstractDescribableImpl<GoogleSlaveTemplate> {


    @Extension
    public static final class DescriptorImpl extends Descriptor<GoogleSlaveTemplate> {

        @Override
        public String getDisplayName() {
            return "Google Slave Template";
        }
    }
}
