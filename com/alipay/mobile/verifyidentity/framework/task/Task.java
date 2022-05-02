package com.alipay.mobile.verifyidentity.framework.task;

import com.alipay.mobile.verifyidentity.framework.flow.IFlowController;

public class Task implements Runnable {
    private IFlowController flowController;

    public Task(IFlowController iFlowController) {
        this.flowController = iFlowController;
    }

    public void run() {
        this.flowController.start();
    }
}
