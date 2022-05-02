package com.alipay.mobile.security.bio.config.bean;

import com.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig;
import java.util.Arrays;

public class Algorithm {
    private float batLivenessThreshold = 0.05f;
    private int blink = 0;
    private float differ = 0.15f;
    private int disWeight = 4;
    private float eyeHwratio = 0.16f;
    private int facesize = 50;
    private String[] liveness_combination;
    private String liveness_combinations = ToygerFaceAlgorithmConfig.BAT_LIVENESS;
    private int log_level = 0;
    private float matching_score = 79.79f;
    private int minpose = 0;
    private int mouth = 0;
    private int pitchWeight = 4;
    private float pose_distanceMax = 1500.0f;
    private float pose_distanceMin = 200.0f;
    private float pose_gaussian = 0.15f;
    private float pose_integrity = 0.9f;
    private float pose_light = 40.0f;
    private float pose_motion = 0.2f;
    private float pose_pitch = 0.2f;
    private float pose_pitchMin = -0.2f;
    private float pose_rectwidth = 0.25f;
    private float pose_yaw = 0.17f;
    private float pose_yawMin = -0.2f;
    private float quality_min_quality = 9.0f;
    private int stack_size = 1;
    private int stack_time = 0;
    private Threshold threshold;
    private int yawWeight = 1;
    private int yunqiQuality = 4;

    public String[] getLiveness_combination() {
        return this.liveness_combination;
    }

    public void setLiveness_combination(String[] strArr) {
        this.liveness_combination = strArr;
    }

    public void setPitchWeight(int i) {
        this.pitchWeight = i;
    }

    public int getPitchWeight() {
        return this.pitchWeight;
    }

    public void setYawWeight(int i) {
        this.yawWeight = i;
    }

    public int getYawWeight() {
        return this.yawWeight;
    }

    public void setDisWeight(int i) {
        this.disWeight = i;
    }

    public int getDisWeight() {
        return this.disWeight;
    }

    public void setMinpose(int i) {
        this.minpose = i;
    }

    public int getMinpose() {
        return this.minpose;
    }

    public void setYunqiQuality(int i) {
        this.yunqiQuality = i;
    }

    public int getYunqiQuality() {
        return this.yunqiQuality;
    }

    public void setFacesize(int i) {
        this.facesize = i;
    }

    public int getFacesize() {
        return this.facesize;
    }

    public void setMouth(int i) {
        this.mouth = i;
    }

    public int getMouth() {
        return this.mouth;
    }

    public void setBlink(int i) {
        this.blink = i;
    }

    public int getBlink() {
        return this.blink;
    }

    public void setEyeHwratio(float f) {
        this.eyeHwratio = f;
    }

    public float getEyeHwratio() {
        return this.eyeHwratio;
    }

    public void setDiffer(float f) {
        this.differ = f;
    }

    public float getDiffer() {
        return this.differ;
    }

    public float getPose_motion() {
        return this.pose_motion;
    }

    public void setPose_motion(float f) {
        this.pose_motion = f;
    }

    public float getPose_rectwidth() {
        return this.pose_rectwidth;
    }

    public void setPose_rectwidth(float f) {
        this.pose_rectwidth = f;
    }

    public float getPose_pitch() {
        return this.pose_pitch;
    }

    public void setPose_pitch(float f) {
        this.pose_pitch = f;
    }

    public float getPose_yaw() {
        return this.pose_yaw;
    }

    public void setPose_yaw(float f) {
        this.pose_yaw = f;
    }

    public float getPose_light() {
        return this.pose_light;
    }

    public void setPose_light(float f) {
        this.pose_light = f;
    }

    public float getPose_integrity() {
        return this.pose_integrity;
    }

    public void setPose_integrity(float f) {
        this.pose_integrity = f;
    }

    public float getPose_gaussian() {
        return this.pose_gaussian;
    }

    public void setPose_gaussian(float f) {
        this.pose_gaussian = f;
    }

    public float getPose_distanceMax() {
        return this.pose_distanceMax;
    }

    public void setPose_distanceMax(float f) {
        this.pose_distanceMax = f;
    }

    public float getPose_distanceMin() {
        return this.pose_distanceMin;
    }

    public void setPose_distanceMin(float f) {
        this.pose_distanceMin = f;
    }

    public float getPose_pitchMin() {
        return this.pose_pitchMin;
    }

    public void setPose_pitchMin(float f) {
        this.pose_pitchMin = f;
    }

    public float getPose_yawMin() {
        return this.pose_pitchMin;
    }

    public void setPose_yawMin(float f) {
        this.pose_pitchMin = f;
    }

    public float getQuality_min_quality() {
        return this.quality_min_quality;
    }

    public void setQuality_min_quality(float f) {
        this.quality_min_quality = f;
    }

    public String getLiveness_combinations() {
        return this.liveness_combinations;
    }

    public void setLiveness_combinations(String str) {
        this.liveness_combinations = str;
    }

    public float getMatching_score() {
        return this.matching_score;
    }

    public void setMatching_score(float f) {
        this.matching_score = f;
    }

    public int getLog_level() {
        return this.log_level;
    }

    public void setLog_level(int i) {
        this.log_level = i;
    }

    public int getStack_size() {
        return this.stack_size;
    }

    public void setStack_size(int i) {
        this.stack_size = i;
    }

    public int getStack_time() {
        return this.stack_time;
    }

    public void setStack_time(int i) {
        this.stack_time = i;
    }

    public float getBatLivenessThreshold() {
        return this.batLivenessThreshold;
    }

    public void setBatLivenessThreshold(float f) {
        this.batLivenessThreshold = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Algorithm{differ=");
        sb.append(this.differ);
        sb.append(", eyeHwratio=");
        sb.append(this.eyeHwratio);
        sb.append(", blink=");
        sb.append(this.blink);
        sb.append(", mouth=");
        sb.append(this.mouth);
        sb.append(", facesize=");
        sb.append(this.facesize);
        sb.append(", yunqiQuality=");
        sb.append(this.yunqiQuality);
        sb.append(", minpose=");
        sb.append(this.minpose);
        sb.append(", disWeight=");
        sb.append(this.disWeight);
        sb.append(", yawWeight=");
        sb.append(this.yawWeight);
        sb.append(", pitchWeight=");
        sb.append(this.pitchWeight);
        sb.append(", liveness_combinations='");
        sb.append(this.liveness_combinations);
        sb.append('\'');
        sb.append(", matching_score=");
        sb.append(this.matching_score);
        sb.append(", pose_motion=");
        sb.append(this.pose_motion);
        sb.append(", pose_rectwidth=");
        sb.append(this.pose_rectwidth);
        sb.append(", pose_pitch=");
        sb.append(this.pose_pitch);
        sb.append(", pose_yaw=");
        sb.append(this.pose_yaw);
        sb.append(", pose_light=");
        sb.append(this.pose_light);
        sb.append(", pose_integrity=");
        sb.append(this.pose_integrity);
        sb.append(", pose_gaussian=");
        sb.append(this.pose_gaussian);
        sb.append(", pose_distanceMin=");
        sb.append(this.pose_distanceMin);
        sb.append(", pose_distanceMax=");
        sb.append(this.pose_distanceMax);
        sb.append(", pose_yawMin=");
        sb.append(this.pose_yawMin);
        sb.append(", pose_pitchMin=");
        sb.append(this.pose_pitchMin);
        sb.append(", log_level=");
        sb.append(this.log_level);
        sb.append(", quality_min_quality=");
        sb.append(this.quality_min_quality);
        sb.append(", stack_size=");
        sb.append(this.stack_size);
        sb.append(", stack_time=");
        sb.append(this.stack_time);
        sb.append(", batLivenessThreshold=");
        sb.append(this.batLivenessThreshold);
        sb.append(", liveness_combination=");
        sb.append(Arrays.toString(this.liveness_combination));
        sb.append(", threshold=");
        sb.append(this.threshold);
        sb.append('}');
        return sb.toString();
    }
}
