package o;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002HHø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"await", "R", "Lcom/google/common/util/concurrent/ListenableFuture;", "(Lcom/google/common/util/concurrent/ListenableFuture;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "work-runtime-ktx_release"}, k = 2, mv = {1, 4, 1})
public final class AppCompatAutoCompleteTextView {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "R", "run", "androidx/work/ListenableFutureKt$await$2$1"}, k = 3, mv = {1, 4, 1})
    public static final class getMin implements Runnable {
        final /* synthetic */ ListenableFuture length;
        final /* synthetic */ cy1 setMin;

        public getMin(cy1 cy1, ListenableFuture listenableFuture) {
            this.setMin = cy1;
            this.length = listenableFuture;
        }

        public final void run() {
            try {
                Object obj = this.length.get();
                Result.Companion companion = Result.Companion;
                this.setMin.resumeWith(Result.m1constructorimpl(obj));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    cause = th;
                }
                if (th instanceof CancellationException) {
                    this.setMin.setMax(cause);
                    return;
                }
                Result.Companion companion2 = Result.Companion;
                this.setMin.resumeWith(Result.m1constructorimpl(ResultKt.createFailure(cause)));
            }
        }
    }
}
