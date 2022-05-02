package com.alibaba.ariver.resource.api.prepare;

public interface StepCreator {
    PrepareStep createStep(StepType stepType);
}
