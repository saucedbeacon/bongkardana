package com.google.android.play.core.ktx;

import com.google.android.play.core.review.ReviewManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H@"}, d2 = {"requestReview", "", "Lcom/google/android/play/core/review/ReviewManager;", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/google/android/play/core/review/ReviewInfo;"}, k = 3, mv = {1, 1, 16})
@DebugMetadata(c = "com.google.android.play.core.ktx.ReviewManagerKtxKt", f = "ReviewManagerKtx.kt", i = {0}, l = {17}, m = "requestReview", n = {"$this$requestReview"}, s = {"L$0"})
final class ReviewManagerKtxKt$requestReview$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    ReviewManagerKtxKt$requestReview$1(Continuation continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ReviewManagerKtxKt.requestReview((ReviewManager) null, this);
    }
}
