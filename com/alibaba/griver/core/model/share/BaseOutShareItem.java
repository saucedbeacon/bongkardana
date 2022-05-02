package com.alibaba.griver.core.model.share;

import android.app.Activity;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.griver.api.ui.share.BaseShareItem;
import com.alibaba.griver.api.ui.share.ShareParam;
import com.alibaba.griver.api.ui.share.ShareResultListener;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.rpc.OnRpcResultListener;
import com.alibaba.griver.base.common.utils.ToastUtils;
import com.alibaba.griver.core.R;
import com.alibaba.griver.core.utils.j;

public abstract class BaseOutShareItem extends BaseShareItem {
    public abstract void doShare(ShareParam shareParam, ShareResultListener shareResultListener);

    public void onShare(final ShareParam shareParam, final ShareResultListener shareResultListener) {
        StringBuilder sb = new StringBuilder();
        sb.append(shareParam.url);
        sb.append("&subChannel=");
        sb.append(this.channelName);
        shareParam.url = sb.toString();
        j.a(shareParam.url, new OnRpcResultListener<ShareShortUrlResult>() {
            public void onResultSuccess(ShareShortUrlResult shareShortUrlResult) {
                if (shareShortUrlResult == null) {
                    BaseOutShareItem.this.requestFailed(shareParam.activity, "3", "Unknown error!", shareResultListener);
                } else if (!shareShortUrlResult.success) {
                    BaseOutShareItem.this.requestFailed(shareParam.activity, shareShortUrlResult.errorCode, shareShortUrlResult.errorMessage, shareResultListener);
                } else {
                    shareParam.url = shareShortUrlResult.shortLink;
                    GriverExecutors.getExecutor(ExecutorType.UI).execute(new Runnable() {
                        public void run() {
                            BaseOutShareItem.this.doShare(shareParam, shareResultListener);
                        }
                    });
                }
            }

            public void onResultFailed(int i, String str) {
                BaseOutShareItem.this.requestFailed(shareParam.activity, String.valueOf(i), str, shareResultListener);
            }
        });
    }

    /* access modifiers changed from: private */
    public void requestFailed(Activity activity, String str, String str2, ShareResultListener shareResultListener) {
        final Activity activity2 = activity;
        final ShareResultListener shareResultListener2 = shareResultListener;
        final String str3 = str;
        final String str4 = str2;
        GriverExecutors.getExecutor(ExecutorType.UI).execute(new Runnable() {
            public void run() {
                Activity activity = activity2;
                if (activity != null) {
                    ToastUtils.showToast(activity, activity.getString(R.string.griver_core_share_request_fail), 0);
                }
                shareResultListener2.fail(BaseOutShareItem.this.channelName, String.valueOf(str3), str4);
            }
        });
    }
}
