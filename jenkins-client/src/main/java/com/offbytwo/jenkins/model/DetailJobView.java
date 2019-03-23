package com.offbytwo.jenkins.model;

import java.util.List;

public class DetailJobView extends BaseModel {

    private List<JobWithDetails> jobs;

    public List<JobWithDetails> getJobs() {
        return jobs;
    }

    public void setJobs(List<JobWithDetails> jobs) {
        this.jobs = jobs;
    }

}
