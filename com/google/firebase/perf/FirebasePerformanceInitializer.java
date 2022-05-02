package com.google.firebase.perf;

import com.google.firebase.perf.application.AppStateMonitor;

public final class FirebasePerformanceInitializer implements AppStateMonitor.AppColdStartCallback {
    public final void onAppColdStart() {
        FirebasePerformance.getInstance();
    }
}
