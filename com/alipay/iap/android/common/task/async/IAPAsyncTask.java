package com.alipay.iap.android.common.task.async;

import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.errorcode.IAPError;
import com.alipay.iap.android.common.errorcode.IAPException;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.task.AsyncTaskExecutor;
import com.alipay.mobile.common.rpc.RpcException;
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
        } catch (RpcException e) {
            LoggerWrapper.e("IAPAsyncTask", e.getMessage(), e);
            return new IAPError(e);
        } catch (Exception e2) {
            LoggerWrapper.e("IAPAsyncTask", e2.getMessage(), e2);
            return createIAPError(e2);
        }
    }

    /* access modifiers changed from: protected */
    public void onPostExecute(Object obj) {
        if (this.callback != null) {
            if (IAPError.class.isInstance(obj)) {
                LoggerWrapper.d("IAPAsyncTask", "call back on failure");
                this.callback.onFailure((IAPError) obj);
                return;
            }
            LoggerWrapper.d("IAPAsyncTask", "call back on success");
            this.callback.onSuccess(obj);
        }
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
}
