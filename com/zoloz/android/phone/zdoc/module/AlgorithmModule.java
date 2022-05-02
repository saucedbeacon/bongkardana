package com.zoloz.android.phone.zdoc.module;

import java.io.Serializable;

public class AlgorithmModule implements Serializable {
    private int algoType = -1;
    private int blur = 80;
    private int card_detect_score = 80;
    private int exposure = 20;

    public int getBlur() {
        return this.blur;
    }

    public void setBlur(int i) {
        this.blur = i;
    }

    public int getExposure() {
        return this.exposure;
    }

    public void setExposure(int i) {
        this.exposure = i;
    }

    public int getCard_detect_score() {
        return this.card_detect_score;
    }

    public void setCard_detect_score(int i) {
        this.card_detect_score = i;
    }

    public int getAlgoType() {
        return this.algoType;
    }

    public void setAlgoType(int i) {
        this.algoType = i;
    }
}
