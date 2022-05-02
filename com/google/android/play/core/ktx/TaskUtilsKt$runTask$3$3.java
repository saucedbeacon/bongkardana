package com.google.android.play.core.ktx;

import com.google.android.play.core.tasks.OnFailureListener;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import o.cy1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "exception", "Ljava/lang/Exception;", "kotlin.jvm.PlatformType", "onFailure"}, k = 3, mv = {1, 1, 16})
final class TaskUtilsKt$runTask$3$3 implements OnFailureListener {
    final /* synthetic */ cy1 $continuation;

    TaskUtilsKt$runTask$3$3(cy1 cy1) {
        this.$continuation = cy1;
    }

    public final void onFailure(Exception exc) {
        Intrinsics.checkExpressionValueIsNotNull(exc, "exception");
        Result.Companion companion = Result.Companion;
        this.$continuation.resumeWith(Result.m1constructorimpl(ResultKt.createFailure(exc)));
    }
}
