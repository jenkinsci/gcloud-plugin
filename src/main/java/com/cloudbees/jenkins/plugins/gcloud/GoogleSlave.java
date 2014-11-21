package com.cloudbees.jenkins.plugins.gcloud;

import hudson.model.Descriptor;
import hudson.model.TaskListener;
import hudson.slaves.*;

import java.io.IOException;
import java.util.List;

/**
 * Created by nicolas on 21/11/14.
 */
public class GoogleSlave extends AbstractCloudSlave {

    public GoogleSlave(String name, String nodeDescription, String remoteFS, int numExecutors, Mode mode, String labelString, ComputerLauncher launcher, RetentionStrategy retentionStrategy, List<? extends NodeProperty<?>> nodeProperties) throws Descriptor.FormException, IOException {
        super(name, nodeDescription, remoteFS, numExecutors, mode, labelString, launcher, retentionStrategy, nodeProperties);
    }

    @Override
    public AbstractCloudComputer createComputer() {
        return null;
    }

    @Override
    protected void _terminate(TaskListener taskListener) throws IOException, InterruptedException {

    }
}
