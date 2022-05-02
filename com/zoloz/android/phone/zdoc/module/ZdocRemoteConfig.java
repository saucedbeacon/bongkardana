package com.zoloz.android.phone.zdoc.module;

import java.io.Serializable;
import java.util.ArrayList;

public class ZdocRemoteConfig implements Serializable {
    public static final int CAPTURE_SCAN = 1;
    public static final int CAPTURE_TAKE_PHOTO = 0;
    public static String CURRENT_LANG = null;
    public static boolean isEnbaleHint = true;
    private int captureMode = 0;
    private int env = 1;
    private String guidePageUrl = "";
    private ArrayList<DocModule> modules = new ArrayList<>();
    private int monitorCaptureInterval = 3000;
    private int monitorMaxFrameCount = 11;
    private float ratio = 0.7f;
    private String sceneCode = "DUMMY_BIZ_SCENE_CODE";
    private int showGuidePage = 0;
    private int showPowerByZoloz = 0;
    private int uploadMonitorPic = 0;

    public int getCaptureMode() {
        return this.captureMode;
    }

    public void setCaptureMode(int i) {
        this.captureMode = i;
    }

    public float getRatio() {
        return this.ratio;
    }

    public void setRatio(float f) {
        this.ratio = f;
    }

    public int getEnv() {
        return this.env;
    }

    public void setEnv(int i) {
        this.env = i;
    }

    public int getUploadMonitorPic() {
        return this.uploadMonitorPic;
    }

    public void setUploadMonitorPic(int i) {
        this.uploadMonitorPic = i;
    }

    public int getShowGuidePage() {
        return this.showGuidePage;
    }

    public void setShowGuidePage(int i) {
        this.showGuidePage = i;
    }

    public String getGuidePageUrl() {
        return this.guidePageUrl;
    }

    public void setGuidePageUrl(String str) {
        this.guidePageUrl = str;
    }

    public ArrayList<DocModule> getModules() {
        return this.modules;
    }

    public void setModules(ArrayList<DocModule> arrayList) {
        this.modules = arrayList;
    }

    public String getSceneCode() {
        return this.sceneCode;
    }

    public void setSceneCode(String str) {
        this.sceneCode = str;
    }

    public int getShowPowerByZoloz() {
        return this.showPowerByZoloz;
    }

    public void setShowPowerByZoloz(int i) {
        this.showPowerByZoloz = i;
    }

    public int getMonitorMaxFrameCount() {
        return this.monitorMaxFrameCount;
    }

    public void setMonitorMaxFrameCount(int i) {
        this.monitorMaxFrameCount = i;
    }

    public int getMonitorCaptureInterval() {
        return this.monitorCaptureInterval;
    }

    public void setMonitorCaptureInterval(int i) {
        this.monitorCaptureInterval = i;
    }
}
