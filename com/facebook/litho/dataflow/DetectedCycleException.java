package com.facebook.litho.dataflow;

public class DetectedCycleException extends BadGraphSetupException {
    public DetectedCycleException(String str) {
        super(str);
    }
}
