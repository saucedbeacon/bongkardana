package com.iap.ac.android.common.task.async;

import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alipay.mobile.common.rpc.RpcException;
import com.iap.ac.android.common.errorcode.IAPError;
import com.iap.ac.android.common.errorcode.IAPException;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.task.AsyncTaskExecutor;
import java.lang.reflect.UndeclaredThrowableException;

public abstract class IAPAsyncTask extends AsyncTask<Void, Void, Object> {
    protected IAPAsyncCallback callback;

    public interface Runner<T> extends IAPAsyncCallback<T> {
        @Nullable
        T execute() throws Exception;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void printError(Exception exc) {
    }

    /* access modifiers changed from: protected */
    @Nullable
    public abstract Object run() throws Exception;

    public IAPAsyncTask(IAPAsyncCallback iAPAsyncCallback) {
        this.callback = iAPAsyncCallback;
    }

    public static <T> void asyncTask(final Runner<T> runner) {
        new IAPAsyncTask(runner) {
            /* access modifiers changed from: protected */
            public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
                return IAPAsyncTask.super.doInBackground((Void[]) objArr);
            }

            /* access modifiers changed from: protected */
            @Nullable
            public final Object run() throws Exception {
                return runner.execute();
            }
        }.executeOnExecutor(AsyncTaskExecutor.getInstance().getExecutor(), new Void[0]);
    }

    public static void asyncTask(final Runnable runnable) {
        new IAPAsyncTask((IAPAsyncCallback) null) {
            /* access modifiers changed from: protected */
            public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
                return IAPAsyncTask.super.doInBackground((Void[]) objArr);
            }

            /* access modifiers changed from: protected */
            @Nullable
            public final Object run() throws Exception {
                runnable.run();
                return null;
            }
        }.executeOnExecutor(AsyncTaskExecutor.getInstance().getExecutor(), new Void[0]);
    }

    /* access modifiers changed from: protected */
    public IAPError createIAPError(Exception exc) {
        Throwable undeclaredThrowable;
        if (exc instanceof RpcException) {
            return new IAPError((RpcException) exc);
        }
        if (exc instanceof IAPException) {
            return ((IAPException) exc).getError();
        }
        String str = null;
        if ((exc instanceof UndeclaredThrowableException) && (undeclaredThrowable = ((UndeclaredThrowableException) exc).getUndeclaredThrowable()) != null) {
            str = undeclaredThrowable.toString();
        }
        if (TextUtils.isEmpty(str)) {
            str = exc.toString();
        }
        return new IAPError("unknown", str);
    }

    /* access modifiers changed from: protected */
    public Object doInBackground(Void... voidArr) {
        try {
            return run();
        } catch (Exception e) {
            ACLog.e("IAPAsyncTask", e.getMessage(), e);
            return e;
        }
    }

    /* access modifiers changed from: protected */
    public void onPostExecute(Object obj) {
        if (this.callback != null) {
            if (obj instanceof Exception) {
                ACLog.d("IAPAsyncTask", "call back on failure");
                this.callback.onFailure((Exception) obj);
                return;
            }
            ACLog.d("IAPAsyncTask", "call back on success");
            this.callback.onSuccess(obj);
        }
    }
}
