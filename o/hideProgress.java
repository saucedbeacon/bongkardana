package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import o.GriverProgressBar;

public final class hideProgress {
    private static final hasCornerMarking getMax;

    static final class length {
        static final hasCornerMarking setMax = new GriverProgressBar.ProgressNotifier(new Handler(Looper.getMainLooper()));
    }

    static {
        hasCornerMarking hascornermarking;
        AnonymousClass3 r0 = new Callable<hasCornerMarking>() {
            public final /* bridge */ /* synthetic */ Object call() throws Exception {
                return length.setMax;
            }
        };
        RedDotDrawable redDotDrawable = setNotifier.getMax;
        if (redDotDrawable == null) {
            hascornermarking = setNotifier.setMax(r0);
        } else {
            hascornermarking = (hasCornerMarking) setNotifier.length(redDotDrawable, r0);
            if (hascornermarking == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
        }
        getMax = hascornermarking;
    }

    public static hasCornerMarking length() {
        hasCornerMarking hascornermarking = getMax;
        if (hascornermarking != null) {
            RedDotDrawable redDotDrawable = setNotifier.length;
            if (redDotDrawable == null) {
                return hascornermarking;
            }
            return (hasCornerMarking) setNotifier.length(redDotDrawable, hascornermarking);
        }
        throw new NullPointerException("scheduler == null");
    }
}
