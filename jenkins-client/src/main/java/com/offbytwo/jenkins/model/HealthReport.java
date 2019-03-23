package com.offbytwo.jenkins.model;

import lombok.Data;

@Data
public class HealthReport {
    private String description;
    private String iconClassName;
    private String iconUrl;
    private Integer score;

}
