package com.alibaba.griver.core.jsapi.share.menu;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Keep;
import com.alibaba.griver.api.ui.share.ShareParam;
import com.alibaba.griver.api.ui.share.ShareResultListener;
import com.alibaba.griver.core.R;
import com.alibaba.griver.core.model.share.BaseOutShareItem;

@Keep
public class MessagesShareItem extends BaseOutShareItem {
    private static final String CHANNEL_NAME = "Messages";
    private static final String TAG = "MessagesShareItem";

    public MessagesShareItem() {
        this.channelName = CHANNEL_NAME;
        this.iconDrawable = R.drawable.griver_core_share_messages;
    }

    public void doShare(ShareParam shareParam, ShareResultListener shareResultListener) {
        if (shareParam.activity != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(shareParam.title);
            sb.append(":");
            sb.append(shareParam.url);
            String obj = sb.toString();
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
            intent.putExtra("sms_body", obj);
            shareParam.activity.startActivity(intent);
            shareResultListener.success(CHANNEL_NAME);
        }
    }
}
