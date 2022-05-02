package com.alipay.mobile.security.bio.config.bean;

import java.util.Arrays;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class Coll {
    private String[] actionMode = {"7"};
    private boolean authorization = false;
    private String bottomText = "";
    private float far = 0.28f;
    private int imageIndex = 1;
    private int light = 178;
    private float maxangle = 0.6f;
    private float minangle = -0.6f;
    private int mineDscore = 1;
    private int mineVideo = 5;
    private int minlight = 50;
    private float near = 0.5f;
    private boolean progressbar = false;
    private int retry = 3;
    private int time = 20;
    private String topText = "";
    private String topText_angle = "";
    private String topText_blink = "";
    private String topText_blur = "";
    private String topText_integrity = "";
    private String topText_light = "";
    private String topText_max_rectwidth = "";
    private String topText_noface = "";
    private String topText_quality = "";
    private String topText_rectwidth = "";
    private String topText_stay = "";
    private boolean uploadBestPic = true;
    private boolean uploadBigPic = true;
    private boolean uploadDepthData = false;
    private boolean uploadLivePic = false;
    private int uploadMonitorPic = 0;
    private boolean uploadPoseOkPic = false;

    public void setRetry(int i) {
        this.retry = i;
    }

    public int getRetry() {
        return this.retry;
    }

    public void setMinangle(float f) {
        this.minangle = f;
    }

    public float getMinangle() {
        return this.minangle;
    }

    public void setMaxangle(float f) {
        this.maxangle = f;
    }

    public float getMaxangle() {
        return this.maxangle;
    }

    public void setNear(float f) {
        this.near = f;
    }

    public float getNear() {
        return this.near;
    }

    public void setFar(float f) {
        this.far = f;
    }

    public float getFar() {
        return this.far;
    }

    public void setMinlight(int i) {
        this.minlight = i;
    }

    public int getMinlight() {
        return this.minlight;
    }

    public void setTime(int i) {
        this.time = i;
    }

    public int getTime() {
        return this.time;
    }

    public void setLight(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(732818709, oncanceled);
            onCancelLoad.getMin(732818709, oncanceled);
        }
        this.light = i;
    }

    public int getLight() {
        return this.light;
    }

    public void setImageIndex(int i) {
        this.imageIndex = i;
    }

    public int getImageIndex() {
        return this.imageIndex;
    }

    public void setMineDscore(int i) {
        this.mineDscore = i;
    }

    public int getMineDscore() {
        return this.mineDscore;
    }

    public void setMineVideo(int i) {
        this.mineVideo = i;
    }

    public int getMineVideo() {
        return this.mineVideo;
    }

    public void setTopText(String str) {
        this.topText = str;
    }

    public String getTopText() {
        return this.topText;
    }

    public void setBottomText(String str) {
        this.bottomText = str;
    }

    public String getBottomText() {
        return this.bottomText;
    }

    public void setUploadMonitorPic(int i) {
        this.uploadMonitorPic = i;
    }

    public int getUploadMonitorPic() {
        return this.uploadMonitorPic;
    }

    public void setUploadLivePic(boolean z) {
        this.uploadLivePic = z;
    }

    public boolean isUploadLivePic() {
        return this.uploadLivePic;
    }

    public void setProgressbar(boolean z) {
        this.progressbar = z;
    }

    public boolean isProgressbar() {
        return this.progressbar;
    }

    public void setUploadBestPic(boolean z) {
        this.uploadBestPic = z;
    }

    public boolean isUploadBestPic() {
        return this.uploadBestPic;
    }

    public void setUploadPoseOkPic(boolean z) {
        this.uploadPoseOkPic = z;
    }

    public boolean isUploadPoseOkPic() {
        return this.uploadPoseOkPic;
    }

    public void setUploadBigPic(boolean z) {
        this.uploadBigPic = z;
    }

    public boolean isUploadBigPic() {
        return this.uploadBigPic;
    }

    public boolean isUploadDepthData() {
        return this.uploadDepthData;
    }

    public void setUploadDepthData(boolean z) {
        this.uploadDepthData = z;
    }

    public void setActionMode(String[] strArr) {
        this.actionMode = strArr;
    }

    public String[] getActionMode() {
        return this.actionMode;
    }

    public String getTopText_noface() {
        return this.topText_noface;
    }

    public void setTopText_noface(String str) {
        this.topText_noface = str;
    }

    public String getTopText_light() {
        return this.topText_light;
    }

    public void setTopText_light(String str) {
        this.topText_light = str;
    }

    public String getTopText_rectwidth() {
        return this.topText_rectwidth;
    }

    public void setTopText_rectwidth(String str) {
        this.topText_rectwidth = str;
    }

    public String getTopText_integrity() {
        return this.topText_integrity;
    }

    public void setTopText_integrity(String str) {
        this.topText_integrity = str;
    }

    public String getTopText_angle() {
        return this.topText_angle;
    }

    public void setTopText_angle(String str) {
        this.topText_angle = str;
    }

    public String getTopText_blur() {
        return this.topText_blur;
    }

    public void setTopText_blur(String str) {
        this.topText_blur = str;
    }

    public String getTopText_quality() {
        return this.topText_quality;
    }

    public void setTopText_quality(String str) {
        this.topText_quality = str;
    }

    public String getTopText_blink() {
        return this.topText_blink;
    }

    public void setTopText_blink(String str) {
        this.topText_blink = str;
    }

    public String getTopText_stay() {
        return this.topText_stay;
    }

    public void setTopText_stay(String str) {
        this.topText_stay = str;
    }

    public String getTopText_max_rectwidth() {
        return this.topText_max_rectwidth;
    }

    public void setTopText_max_rectwidth(String str) {
        this.topText_max_rectwidth = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Coll{retry=");
        sb.append(this.retry);
        sb.append(", minangle=");
        sb.append(this.minangle);
        sb.append(", maxangle=");
        sb.append(this.maxangle);
        sb.append(", near=");
        sb.append(this.near);
        sb.append(", far=");
        sb.append(this.far);
        sb.append(", minlight=");
        sb.append(this.minlight);
        sb.append(", time=");
        sb.append(this.time);
        sb.append(", light=");
        sb.append(this.light);
        sb.append(", imageIndex=");
        sb.append(this.imageIndex);
        sb.append(", mineDscore=");
        sb.append(this.mineDscore);
        sb.append(", mineVideo=");
        sb.append(this.mineVideo);
        sb.append(", topText='");
        sb.append(this.topText);
        sb.append('\'');
        sb.append(", bottomText='");
        sb.append(this.bottomText);
        sb.append('\'');
        sb.append(", topText_noface='");
        sb.append(this.topText_noface);
        sb.append('\'');
        sb.append(", topText_light='");
        sb.append(this.topText_light);
        sb.append('\'');
        sb.append(", topText_rectwidth='");
        sb.append(this.topText_rectwidth);
        sb.append('\'');
        sb.append(", topText_integrity='");
        sb.append(this.topText_integrity);
        sb.append('\'');
        sb.append(", topText_angle='");
        sb.append(this.topText_angle);
        sb.append('\'');
        sb.append(", topText_blur='");
        sb.append(this.topText_blur);
        sb.append('\'');
        sb.append(", topText_quality='");
        sb.append(this.topText_quality);
        sb.append('\'');
        sb.append(", topText_blink='");
        sb.append(this.topText_blink);
        sb.append('\'');
        sb.append(", topText_stay='");
        sb.append(this.topText_stay);
        sb.append('\'');
        sb.append(", topText_max_rectwidth='");
        sb.append(this.topText_max_rectwidth);
        sb.append('\'');
        sb.append(", uploadMonitorPic=");
        sb.append(this.uploadMonitorPic);
        sb.append(", uploadLivePic=");
        sb.append(this.uploadLivePic);
        sb.append(", progressbar=");
        sb.append(this.progressbar);
        sb.append(", uploadBestPic=");
        sb.append(this.uploadBestPic);
        sb.append(", uploadPoseOkPic=");
        sb.append(this.uploadPoseOkPic);
        sb.append(", uploadBigPic=");
        sb.append(this.uploadBigPic);
        sb.append(", uploadDepthData=");
        sb.append(this.uploadDepthData);
        sb.append(", actionMode=");
        sb.append(Arrays.toString(this.actionMode));
        sb.append('}');
        return sb.toString();
    }

    public boolean isAuthorization() {
        return this.authorization;
    }

    public void setAuthorization(boolean z) {
        this.authorization = z;
    }
}
