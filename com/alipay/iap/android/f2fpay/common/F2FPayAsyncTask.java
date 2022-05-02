package com.alipay.iap.android.f2fpay.common;

import android.os.AsyncTask;
import com.alipay.iap.android.common.errorcode.IAPError;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.task.AsyncTaskExecutor;
import com.alipay.iap.android.common.task.async.IAPAsyncCallback;
import com.alipay.iap.android.common.task.async.IAPAsyncTask;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipayplus.mobile.component.common.facade.base.result.BaseServiceResult;

public abstract class F2FPayAsyncTask extends IAPAsyncTask {

    public static abstract class F2FPayRunner<T> implements IAPAsyncTask.Runner<T> {
        public void onFailure(IAPError iAPError) {
            if (iAPError != null) {
                StringBuilder sb = new StringBuilder("onFailure: ");
                sb.append(iAPError.toString());
                LoggerWrapper.e(F2FPayConstants.TAG, sb.toString());
            }
        }

        public void onSuccess(T t) {
            if (t instanceof BaseServiceResult) {
                BaseServiceResult baseServiceResult = (BaseServiceResult) t;
                LoggerWrapper.e(F2FPayConstants.TAG, String.format("onSuccess: success = %s, errorCode = %s, errorMsg = %s", new Object[]{String.valueOf(baseServiceResult.success), baseServiceResult.errorCode, baseServiceResult.errorMessage}));
            }
        }
    }

    public F2FPayAsyncTask(IAPAsyncCallback iAPAsyncCallback) {
        super(iAPAsyncCallback);
    }

    public IAPError createIAPError(Exception exc) {
        return exc instanceof RpcException ? new IAPError((RpcException) exc) : new IAPError(F2FPayErrorCode.ILLEGAL_ACCESS, exc.getMessage());
    }

    public AsyncTask<Void, Void, Object> executeOnDefaultExecutor() {
        return executeOnExecutor(AsyncTaskExecutor.getInstance().getExecutor(), new Void[0]);
    }

    public void printError(Exception exc) {
        LoggerWrapper.e(F2FPayConstants.TAG, exc.getMessage(), exc);
    }
}
