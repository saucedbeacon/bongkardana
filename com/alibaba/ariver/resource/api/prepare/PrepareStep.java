package com.alibaba.ariver.resource.api.prepare;

public interface PrepareStep {
    void execute(PrepareController prepareController, PrepareContext prepareContext, PrepareCallback prepareCallback);

    void finish();

    StepType getType();

    boolean isFinished();
}
