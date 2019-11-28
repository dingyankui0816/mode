package com.design.mode.pattern.behavioralModel.responsibilityChainPattern.v1;

public interface Interviewer {

    void nextInterviewer(Interviewer interviewer);
}
