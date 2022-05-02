package com.alipay.zoloz.toyger.algorithm;

import com.alipay.zoloz.toyger.face.LivenessAction;
import java.util.ArrayList;
import java.util.List;

public class ToygerConfig {
    public ToygerCameraConfig cameraConfig;
    public ToygerLivenessConfig livenessConfig;
    public List<LivenessAction> liveness_action_combination;
    public ToygerQualityConfig qualityConfig;

    public ToygerConfig() {
        this.qualityConfig = new ToygerQualityConfig();
        this.livenessConfig = new ToygerLivenessConfig();
        this.cameraConfig = new ToygerCameraConfig();
        this.liveness_action_combination = new ArrayList();
    }

    public ToygerConfig(ToygerQualityConfig toygerQualityConfig, ToygerLivenessConfig toygerLivenessConfig, ToygerCameraConfig toygerCameraConfig) {
        this.qualityConfig = toygerQualityConfig;
        this.livenessConfig = toygerLivenessConfig;
        this.cameraConfig = toygerCameraConfig;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ToygerConfig{qualityConfig=");
        sb.append(this.qualityConfig);
        sb.append(", livenessConfig=");
        sb.append(this.livenessConfig);
        sb.append(", cameraConfig=");
        sb.append(this.cameraConfig);
        sb.append('}');
        return sb.toString();
    }
}
