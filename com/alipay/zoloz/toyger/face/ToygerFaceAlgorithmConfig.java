package com.alipay.zoloz.toyger.face;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.android.phone.zoloz.toyger.BuildConfig;
import com.alipay.zoloz.toyger.ToygerAlgorithmConfig;
import com.alipay.zoloz.toyger.algorithm.ToygerCameraConfig;
import com.alipay.zoloz.toyger.algorithm.ToygerConfig;
import com.alipay.zoloz.toyger.algorithm.ToygerLivenessConfig;
import com.alipay.zoloz.toyger.algorithm.ToygerQualityConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToygerFaceAlgorithmConfig extends ToygerAlgorithmConfig {
    public static final String BAT_LIVENESS = "BatLiveness";
    public static final String DARK = "dark";
    public static final String DEPTH = "depth";
    public static final String DRAGONFLY_LIVENESS = "DragonflyLiveness";
    public static final String GEMINI_LIVENESS = "GeminiLiveness";
    public static final String NO_LIVENESS = "NoLiveness";
    public static final String PANO = "pano";
    public float batLivenessThreshold;
    public float blink_diff_threshold_aux = 0.15f;
    public float blink_openness = 0.2f;
    public float blink_openness_threshold_aux = 0.05f;
    public float eye_occlusion_score_threshold = 0.5f;
    public float eye_openness = 0.2f;
    public List<LivenessAction> liveness_action_combination = new ArrayList();
    public List<String> liveness_combination = new ArrayList();
    public int log_level = 0;
    public float max_iod = 0.45f;
    public float min_iod = 0.18f;
    public float pose_gaussian = 0.15f;
    public float pose_integrity = 0.9f;
    public float pose_light = 0.3f;
    public float pose_motion = 1.0f;
    public float pose_pitch = 0.2f;
    public float pose_pitchMin = -0.2f;
    public float pose_rectwidth = 0.25f;
    public float pose_yaw = 0.2f;
    public float pose_yawMin = -0.2f;
    public float pts_occ_num_threshold = 10.0f;
    public float quality_min_quality = 20.0f;
    public float quality_stability_threshold = 0.01f;
    public float stack_time = 3.0f;
    public Map<String, List<Float>> threshold = new HashMap();

    public ToygerFaceAlgorithmConfig() {
        boolean equals = TextUtils.equals(BuildConfig.PORTING_WALLET, BuildConfig.PORTING);
        Float valueOf = Float.valueOf(0.0f);
        if (equals) {
            this.liveness_combination.add(NO_LIVENESS);
            ArrayList arrayList = new ArrayList();
            arrayList.add(valueOf);
            this.threshold.put(NO_LIVENESS, arrayList);
        } else if (TextUtils.equals(BuildConfig.PORTING_VENDING, BuildConfig.PORTING)) {
            this.liveness_combination.add(BAT_LIVENESS);
            this.pose_pitch = 0.17f;
            this.batLivenessThreshold = 0.5f;
            this.pose_pitchMin = -0.17f;
            this.pose_integrity = 0.98f;
            this.stack_time = 1.5f;
        } else if (TextUtils.equals(BuildConfig.PORTING_JRCLOUD, BuildConfig.PORTING)) {
            this.liveness_combination.add(NO_LIVENESS);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(valueOf);
            this.threshold.put(NO_LIVENESS, arrayList2);
        } else if (TextUtils.equals(BuildConfig.PORTING_SUDIYI, BuildConfig.PORTING)) {
            this.liveness_combination.add(NO_LIVENESS);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(valueOf);
            this.threshold.put(NO_LIVENESS, arrayList3);
        } else {
            this.liveness_combination.add(NO_LIVENESS);
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(valueOf);
            this.threshold.put(NO_LIVENESS, arrayList4);
        }
    }

    public static ToygerFaceAlgorithmConfig from(String str) {
        return (ToygerFaceAlgorithmConfig) JSON.parseObject(str, ToygerFaceAlgorithmConfig.class);
    }

    public ToygerConfig toToygerConfig(boolean z) {
        List list;
        boolean z2 = z;
        ToygerQualityConfig toygerQualityConfig = r2;
        ToygerQualityConfig toygerQualityConfig2 = new ToygerQualityConfig(this.pose_light, this.pose_rectwidth, this.pose_integrity, this.pose_pitch, this.pose_yaw, this.pose_gaussian, this.pose_motion, this.quality_min_quality, this.stack_time, this.min_iod, this.max_iod, this.blink_openness, this.eye_openness, this.pose_pitchMin, this.pose_yawMin, this.blink_openness_threshold_aux, this.blink_diff_threshold_aux, this.quality_stability_threshold, this.eye_occlusion_score_threshold, this.pts_occ_num_threshold);
        String str = "";
        if (this.liveness_combination != null) {
            for (int i = 0; i < this.liveness_combination.size(); i++) {
                if (str.length() > 0) {
                    str = str.concat("#").concat(this.liveness_combination.get(i));
                } else {
                    str = this.liveness_combination.get(i);
                }
            }
        }
        boolean z3 = z;
        ToygerLivenessConfig toygerLivenessConfig = new ToygerLivenessConfig(str, this.batLivenessThreshold, z3);
        List<String> list2 = this.liveness_combination;
        if (list2 != null) {
            for (String next : list2) {
                if (DRAGONFLY_LIVENESS.equals(next)) {
                    List list3 = this.threshold.get(next);
                    if (list3 != null) {
                        if (list3.size() > 0) {
                            toygerLivenessConfig.dragonflyMin = ((Float) list3.get(0)).floatValue();
                        }
                        if (list3.size() > 1) {
                            toygerLivenessConfig.dragonflyMax = ((Float) list3.get(1)).floatValue();
                        }
                    }
                } else if (GEMINI_LIVENESS.equals(next) && (list = this.threshold.get(next)) != null) {
                    if (list.size() > 0) {
                        toygerLivenessConfig.geminiMin = ((Float) list.get(0)).floatValue();
                    }
                    if (list.size() > 1) {
                        toygerLivenessConfig.geminiMax = ((Float) list.get(1)).floatValue();
                    }
                }
            }
        }
        toygerLivenessConfig.fppPreProcess = z3;
        ToygerConfig toygerConfig = new ToygerConfig();
        toygerConfig.qualityConfig = toygerQualityConfig;
        toygerConfig.livenessConfig = toygerLivenessConfig;
        toygerConfig.cameraConfig = new ToygerCameraConfig();
        toygerConfig.liveness_action_combination = this.liveness_action_combination;
        return toygerConfig;
    }
}
