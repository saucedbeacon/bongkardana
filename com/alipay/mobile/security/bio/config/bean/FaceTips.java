package com.alipay.mobile.security.bio.config.bean;

import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class FaceTips {
    private String adjustPoseText;
    private AlertConfig authorizationAlert = new AlertConfig();
    public String bottomText = "";
    private String brandTip = "";
    private AlertConfig cameraNoPermissionAlert = new AlertConfig();
    private AlertConfig exitAlert = new AlertConfig();
    private AlertConfig failAlert = new AlertConfig();
    private AlertConfig failNoRetryAlert = new AlertConfig();
    private AlertConfig interruptAlert = new AlertConfig();
    private AlertConfig limitAlert = new AlertConfig();
    private AlertConfig networkErrorAlert = new AlertConfig();
    private String noBlinkText;
    private String noFaceText;
    public String sceneText = "";
    private String stopScanTip = "";
    private AlertConfig systemErrorAlert = new AlertConfig();
    private AlertConfig systemVersionErrorAlert = new AlertConfig();
    private AlertConfig timeoutAlert = new AlertConfig();
    public String topText = "";
    public String topText_angle = "";
    public String topText_blink = "";
    public String topText_blur = "";
    public String topText_integrity = "";
    public String topText_light = "";
    public String topText_max_rectwidth = "";
    public String topText_noface = "";
    public String topText_openness = "";
    public String topText_pitch = "";
    public String topText_quality = "";
    public String topText_rectwidth = "";
    public String topText_stay = "";
    public String topText_yaw = "";
    private AlertConfig unsurpportAlert = new AlertConfig();

    public FaceTips() {
        this.unsurpportAlert.setReturnCode(102);
        this.systemVersionErrorAlert.setReturnCode(105);
        this.systemErrorAlert.setReturnCode(205);
        this.cameraNoPermissionAlert.setReturnCode(100);
        this.exitAlert.setReturnCode(202);
        this.timeoutAlert.setReturnCode(203);
        this.failAlert.setReturnCode(208);
        this.limitAlert.setReturnCode(209);
        this.networkErrorAlert.setReturnCode(207);
        this.interruptAlert.setReturnCode(202);
        this.authorizationAlert.setReturnCode(210);
        this.failNoRetryAlert.setReturnCode(202);
    }

    public void setNoFaceText(String str) {
        this.noFaceText = str;
    }

    public String getNoFaceText() {
        return this.noFaceText;
    }

    public void setNoBlinkText(String str) {
        this.noBlinkText = str;
    }

    public String getNoBlinkText() {
        return this.noBlinkText;
    }

    public void setAdjustPoseText(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(591213752, oncanceled);
            onCancelLoad.getMin(591213752, oncanceled);
        }
        this.adjustPoseText = str;
    }

    public String getAdjustPoseText() {
        return this.adjustPoseText;
    }

    public AlertConfig getUnsurpportAlert() {
        return this.unsurpportAlert;
    }

    public void setUnsurpportAlert(AlertConfig alertConfig) {
        this.unsurpportAlert = alertConfig;
    }

    public AlertConfig getSystemVersionErrorAlert() {
        return this.systemVersionErrorAlert;
    }

    public void setSystemVersionErrorAlert(AlertConfig alertConfig) {
        this.systemVersionErrorAlert = alertConfig;
    }

    public AlertConfig getSystemErrorAlert() {
        return this.systemErrorAlert;
    }

    public void setSystemErrorAlert(AlertConfig alertConfig) {
        this.systemErrorAlert = alertConfig;
    }

    public AlertConfig getCameraNoPermissionAlert() {
        return this.cameraNoPermissionAlert;
    }

    public void setCameraNoPermissionAlert(AlertConfig alertConfig) {
        this.cameraNoPermissionAlert = alertConfig;
    }

    public AlertConfig getExitAlert() {
        return this.exitAlert;
    }

    public void setExitAlert(AlertConfig alertConfig) {
        this.exitAlert = alertConfig;
    }

    public AlertConfig getTimeoutAlert() {
        return this.timeoutAlert;
    }

    public void setTimeoutAlert(AlertConfig alertConfig) {
        this.timeoutAlert = alertConfig;
    }

    public AlertConfig getFailAlert() {
        return this.failAlert;
    }

    public void setFailAlert(AlertConfig alertConfig) {
        this.failAlert = alertConfig;
    }

    public AlertConfig getLimitAlert() {
        return this.limitAlert;
    }

    public void setLimitAlert(AlertConfig alertConfig) {
        this.limitAlert = alertConfig;
    }

    public AlertConfig getNetworkErrorAlert() {
        return this.networkErrorAlert;
    }

    public void setNetworkErrorAlert(AlertConfig alertConfig) {
        this.networkErrorAlert = alertConfig;
    }

    public AlertConfig getInterruptAlert() {
        return this.interruptAlert;
    }

    public void setInterruptAlert(AlertConfig alertConfig) {
        this.interruptAlert = alertConfig;
    }

    public AlertConfig getAuthorizationAlert() {
        return this.authorizationAlert;
    }

    public void setAuthorizationAlert(AlertConfig alertConfig) {
        this.authorizationAlert = alertConfig;
    }

    public AlertConfig getFailNoRetryAlert() {
        return this.failNoRetryAlert;
    }

    public void setFailNoRetryAlert(AlertConfig alertConfig) {
        this.failNoRetryAlert = alertConfig;
    }

    public String getBrandTip() {
        return this.brandTip;
    }

    public void setBrandTip(String str) {
        this.brandTip = str;
    }

    public String getStopScanTip() {
        return this.stopScanTip;
    }

    public void setStopScanTip(String str) {
        this.stopScanTip = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FaceTips{noFaceText='");
        sb.append(this.noFaceText);
        sb.append('\'');
        sb.append(", noBlinkText='");
        sb.append(this.noBlinkText);
        sb.append('\'');
        sb.append(", adjustPoseText='");
        sb.append(this.adjustPoseText);
        sb.append('\'');
        sb.append(", brandTip='");
        sb.append(this.brandTip);
        sb.append('\'');
        sb.append(", stopScanTip='");
        sb.append(this.stopScanTip);
        sb.append('\'');
        sb.append(", unsurpportAlert=");
        sb.append(this.unsurpportAlert);
        sb.append(", systemVersionErrorAlert=");
        sb.append(this.systemVersionErrorAlert);
        sb.append(", systemErrorAlert=");
        sb.append(this.systemErrorAlert);
        sb.append(", cameraNoPermissionAlert=");
        sb.append(this.cameraNoPermissionAlert);
        sb.append(", exitAlert=");
        sb.append(this.exitAlert);
        sb.append(", timeoutAlert=");
        sb.append(this.timeoutAlert);
        sb.append(", failAlert=");
        sb.append(this.failAlert);
        sb.append(", limitAlert=");
        sb.append(this.limitAlert);
        sb.append(", networkErrorAlert=");
        sb.append(this.networkErrorAlert);
        sb.append(", interruptAlert=");
        sb.append(this.interruptAlert);
        sb.append('}');
        return sb.toString();
    }
}
