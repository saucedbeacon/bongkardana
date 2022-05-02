package com.iap.ac.android.diagnoselog.rpc;

import java.io.Serializable;

public class UpdateTaskStatusReq implements Serializable {
    private String taskId;
    private String taskStatus;
    private String taskStatusMessage;

    public String getTaskId() {
        return this.taskId;
    }

    public String getTaskStatus() {
        return this.taskStatus;
    }

    public String getTaskStatusMessage() {
        return this.taskStatusMessage;
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }

    public void setTaskStatus(String str) {
        this.taskStatus = str;
    }

    public void setTaskStatusMessage(String str) {
        this.taskStatusMessage = str;
    }
}
