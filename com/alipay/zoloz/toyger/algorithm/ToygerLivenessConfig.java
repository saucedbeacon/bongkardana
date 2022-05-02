package com.alipay.zoloz.toyger.algorithm;

public class ToygerLivenessConfig {
    public float batLivenessThreshold = 0.5f;
    public String collection;
    public float dragonflyMax = 0.0f;
    public float dragonflyMin = 0.0f;
    public boolean fppPreProcess = false;
    public float geminiMax = 0.0f;
    public float geminiMin = 0.0f;
    public String livenessCombinations;

    public ToygerLivenessConfig() {
    }

    public ToygerLivenessConfig(String str, float f, boolean z) {
        this.livenessCombinations = str;
        this.batLivenessThreshold = f;
        this.fppPreProcess = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ToygerLivenessConfig{livenessCombinations='");
        sb.append(this.livenessCombinations);
        sb.append('\'');
        sb.append(", collection='");
        sb.append(this.collection);
        sb.append('\'');
        sb.append(", batLivenessThreshold=");
        sb.append(this.batLivenessThreshold);
        sb.append(", dragonflyMin=");
        sb.append(this.dragonflyMin);
        sb.append(", dragonflyMax=");
        sb.append(this.dragonflyMax);
        sb.append(", geminiMin=");
        sb.append(this.geminiMin);
        sb.append(", geminiMax=");
        sb.append(this.geminiMax);
        sb.append('}');
        return sb.toString();
    }
}
