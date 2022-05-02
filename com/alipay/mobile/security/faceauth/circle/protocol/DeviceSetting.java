package com.alipay.mobile.security.faceauth.circle.protocol;

public class DeviceSetting {
    int algorithmAngle = 270;
    boolean algorithmAuto = true;
    boolean cameraAuto = true;
    int cameraID = 1;
    private int cameraPreviewMaxSize = 2056;
    private int cameraPreviewMinSize = 1080;
    int displayAngle = 90;
    boolean displayAuto = true;
    int maxApiLevel = 100;
    int minApiLevel = 0;

    public boolean isDisplayAuto() {
        return this.displayAuto;
    }

    public void setDisplayAuto(boolean z) {
        this.displayAuto = z;
    }

    public int getDisplayAngle() {
        return this.displayAngle;
    }

    public void setDisplayAngle(int i) {
        this.displayAngle = i;
    }

    public boolean isCameraAuto() {
        return this.cameraAuto;
    }

    public void setCameraAuto(boolean z) {
        this.cameraAuto = z;
    }

    public int getCameraID() {
        return this.cameraID;
    }

    public void setCameraID(int i) {
        this.cameraID = i;
    }

    public int getAlgorithmAngle() {
        return this.algorithmAngle;
    }

    public void setAlgorithmAngle(int i) {
        this.algorithmAngle = i;
    }

    public boolean isAlgorithmAuto() {
        return this.algorithmAuto;
    }

    public void setAlgorithmAuto(boolean z) {
        this.algorithmAuto = z;
    }

    public int getMaxApiLevel() {
        return this.maxApiLevel;
    }

    public void setMaxApiLevel(int i) {
        this.maxApiLevel = i;
    }

    public int getMinApiLevel() {
        return this.minApiLevel;
    }

    public void setMinApiLevel(int i) {
        this.minApiLevel = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceSetting{displayAuto=");
        sb.append(this.displayAuto);
        sb.append(", displayAngle=");
        sb.append(this.displayAngle);
        sb.append(", cameraAuto=");
        sb.append(this.cameraAuto);
        sb.append(", cameraID=");
        sb.append(this.cameraID);
        sb.append(", algorithmAuto=");
        sb.append(this.algorithmAuto);
        sb.append(", algorithmAngle=");
        sb.append(this.algorithmAngle);
        sb.append(", maxApiLevel=");
        sb.append(this.maxApiLevel);
        sb.append(", minApiLevel=");
        sb.append(this.minApiLevel);
        sb.append('}');
        return sb.toString();
    }

    public int getCameraPreviewMaxSize() {
        return this.cameraPreviewMaxSize;
    }

    public void setCameraPreviewMaxSize(int i) {
        this.cameraPreviewMaxSize = i;
    }

    public int getCameraPreviewMinSize() {
        return this.cameraPreviewMinSize;
    }

    public void setCameraPreviewMinSize(int i) {
        this.cameraPreviewMinSize = i;
    }
}
