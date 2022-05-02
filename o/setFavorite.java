package o;

import android.os.AsyncTask;
import android.os.Build;

public abstract class setFavorite<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
    public final AsyncTask<Params, Progress, Result> getMin(Params... paramsArr) {
        if (Build.VERSION.SDK_INT < 11) {
            return execute(paramsArr);
        }
        try {
            return executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramsArr);
        } catch (Throwable unused) {
            return execute(paramsArr);
        }
    }
}
