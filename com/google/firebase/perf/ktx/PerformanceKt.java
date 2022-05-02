package com.google.firebase.perf.ktx;

import com.google.firebase.ktx.Firebase;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.HttpMetric;
import com.google.firebase.perf.metrics.Trace;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0007\u001a\u00020\b*\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\fH\b\u001a1\u0010\u0007\u001a\u0002H\r\"\u0004\b\u0000\u0010\r*\u00020\u000e2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H\r0\u000b¢\u0006\u0002\b\fH\b¢\u0006\u0002\u0010\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"LIBRARY_NAME", "", "performance", "Lcom/google/firebase/perf/FirebasePerformance;", "Lcom/google/firebase/ktx/Firebase;", "getPerformance", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/perf/FirebasePerformance;", "trace", "", "Lcom/google/firebase/perf/metrics/HttpMetric;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "T", "Lcom/google/firebase/perf/metrics/Trace;", "(Lcom/google/firebase/perf/metrics/Trace;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "com.google.firebase-firebase-perf-ktx"}, k = 2, mv = {1, 1, 16})
public final class PerformanceKt {
    @NotNull
    public static final String LIBRARY_NAME = "fire-perf-ktx";

    @NotNull
    public static final FirebasePerformance getPerformance(@NotNull Firebase firebase) {
        Intrinsics.checkParameterIsNotNull(firebase, "$this$performance");
        FirebasePerformance instance = FirebasePerformance.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "FirebasePerformance.getInstance()");
        return instance;
    }

    public static final void trace(@NotNull HttpMetric httpMetric, @NotNull Function1<? super HttpMetric, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(httpMetric, "$this$trace");
        Intrinsics.checkParameterIsNotNull(function1, "block");
        httpMetric.start();
        try {
            function1.invoke(httpMetric);
        } finally {
            InlineMarker.finallyStart(1);
            httpMetric.stop();
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <T> T trace(@NotNull Trace trace, @NotNull Function1<? super Trace, ? extends T> function1) {
        Intrinsics.checkParameterIsNotNull(trace, "$this$trace");
        Intrinsics.checkParameterIsNotNull(function1, "block");
        trace.start();
        try {
            return function1.invoke(trace);
        } finally {
            InlineMarker.finallyStart(1);
            trace.stop();
            InlineMarker.finallyEnd(1);
        }
    }
}
