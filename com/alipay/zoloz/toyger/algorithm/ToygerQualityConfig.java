package com.alipay.zoloz.toyger.algorithm;

public class ToygerQualityConfig {
    public float blinkOpenness;
    public float diffThreshold;
    public float diff_threshold_aux;
    public float eyeOpenness;
    public float eye_occlusion_score_threshold;
    public float maxGaussian;
    public float maxMotion;
    public float maxPitch;
    public float maxYaw;
    public float max_iod;
    public float minBrightness;
    public float minFaceWidth;
    public float minIntegrity;
    public float minPitch;
    public float minQuality;
    public float minYaw;
    public float min_iod;
    public float openness_threshold_aux;
    public float pts_occ_num_threshold;
    public float quality_stability_threshold;
    public float stackTime;

    public ToygerQualityConfig() {
    }

    public ToygerQualityConfig(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20) {
        this.minBrightness = f;
        this.minFaceWidth = f2;
        this.minIntegrity = f3;
        this.maxPitch = f4;
        this.maxYaw = f5;
        this.maxGaussian = f6;
        this.maxMotion = f7;
        this.minQuality = f8;
        this.stackTime = f9;
        this.min_iod = f10;
        this.max_iod = f11;
        this.blinkOpenness = f12;
        this.eyeOpenness = f13;
        this.minPitch = f14;
        this.minYaw = f15;
        this.openness_threshold_aux = f16;
        this.diff_threshold_aux = f17;
        this.quality_stability_threshold = f18;
        this.eye_occlusion_score_threshold = f19;
        this.pts_occ_num_threshold = f20;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ToygerQualityConfig{minBrightness=");
        sb.append(this.minBrightness);
        sb.append(", minFaceWidth=");
        sb.append(this.minFaceWidth);
        sb.append(", minIntegrity=");
        sb.append(this.minIntegrity);
        sb.append(", maxPitch=");
        sb.append(this.maxPitch);
        sb.append(", maxYaw=");
        sb.append(this.maxYaw);
        sb.append(", maxGaussian=");
        sb.append(this.maxGaussian);
        sb.append(", maxMotion=");
        sb.append(this.maxMotion);
        sb.append(", minQuality=");
        sb.append(this.minQuality);
        sb.append(", stackTime=");
        sb.append(this.stackTime);
        sb.append(", min_iod=");
        sb.append(this.min_iod);
        sb.append(", max_iod=");
        sb.append(this.max_iod);
        sb.append(", eyeOpenness=");
        sb.append(this.eyeOpenness);
        sb.append(", blinkOpenness=");
        sb.append(this.blinkOpenness);
        sb.append(", minPitch=");
        sb.append(this.minPitch);
        sb.append(", minYaw=");
        sb.append(this.minYaw);
        sb.append(", eye_occlusion_score_threshold=");
        sb.append(this.eye_occlusion_score_threshold);
        sb.append(", pts_occ_num_threshold=");
        sb.append(this.pts_occ_num_threshold);
        sb.append('}');
        return sb.toString();
    }
}
