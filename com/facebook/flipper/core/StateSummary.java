package com.facebook.flipper.core;

import java.util.ArrayList;
import java.util.List;

public class StateSummary {
    public final List<setMin> setMin = new ArrayList();

    public enum State {
        IN_PROGRESS,
        SUCCESS,
        FAILED,
        UNKNOWN
    }

    public static class setMin {
        public final State getMax;
        public final String setMax;
    }
}
