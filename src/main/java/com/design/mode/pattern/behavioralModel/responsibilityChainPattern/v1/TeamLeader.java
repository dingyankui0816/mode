package com.design.mode.pattern.behavioralModel.responsibilityChainPattern.v1;

/**
 * 第一轮面试
 */
public class TeamLeader implements Interviewer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Interviewer interviewer;

    @Override
    public void nextInterviewer(Interviewer interviewer) {
        this.interviewer = interviewer;
    }
}
