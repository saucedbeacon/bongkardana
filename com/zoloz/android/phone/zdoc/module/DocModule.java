package com.zoloz.android.phone.zdoc.module;

import java.io.Serializable;
import java.util.List;

public class DocModule implements Serializable {
    private AlgorithmModule algorithm;
    private CollModule coll = new CollModule();
    private List<ScanTaskConfig> scanAlgorithm;

    public CollModule getColl() {
        return this.coll;
    }

    public void setColl(CollModule collModule) {
        this.coll = collModule;
    }

    public AlgorithmModule getAlgorithm() {
        return this.algorithm;
    }

    public void setAlgorithm(AlgorithmModule algorithmModule) {
        this.algorithm = algorithmModule;
    }

    public List<ScanTaskConfig> getScanAlgorithm() {
        return this.scanAlgorithm;
    }

    public void setScanAlgorithm(List<ScanTaskConfig> list) {
        this.scanAlgorithm = list;
    }
}
