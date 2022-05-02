package o;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

final class findFirstPartiallyOrCompletelyInvisibleChild {
    private final Executor getMin = Executors.newSingleThreadExecutor();

    interface setMin {
        void getMax(SharedPreferences sharedPreferences);
    }

    public final Future<SharedPreferences> length(Context context, String str, setMin setmin) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(1491559365, oncanceled);
                onCancelLoad.getMin(1491559365, oncanceled);
            }
        }
        FutureTask futureTask = new FutureTask(new getMin(context, str, setmin));
        this.getMin.execute(futureTask);
        return futureTask;
    }

    static class getMin implements Callable<SharedPreferences> {
        private final String getMax;
        private final setMin getMin;
        private final Context setMax;

        public getMin(Context context, String str, setMin setmin) {
            this.setMax = context;
            this.getMax = str;
            this.getMin = setmin;
        }

        public final /* synthetic */ Object call() throws Exception {
            SharedPreferences sharedPreferences = this.setMax.getSharedPreferences(this.getMax, 0);
            setMin setmin = this.getMin;
            if (setmin != null) {
                setmin.getMax(sharedPreferences);
            }
            return sharedPreferences;
        }
    }
}
