package com.alibaba.griver.core.jsapi.share.menu;

import android.content.Intent;
import androidx.annotation.Keep;
import com.alibaba.griver.api.ui.share.ShareParam;
import com.alibaba.griver.api.ui.share.ShareResultListener;
import com.alibaba.griver.core.R;
import com.alibaba.griver.core.model.share.BaseOutShareItem;

@Keep
public class MoreShareItem extends BaseOutShareItem {
    private static final String CHANNEL_NAME = "More";
    private static final String TAG = "MoreShareItem";

    public MoreShareItem() {
        this.channelName = CHANNEL_NAME;
        this.iconDrawable = R.drawable.griver_core_share_more;
    }

    public void doShare(ShareParam shareParam, ShareResultListener shareResultListener) {
        if (shareParam.activity != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", shareParam.title);
            intent.putExtra("android.intent.extra.TEXT", shareParam.url);
            shareParam.activity.startActivity(Intent.createChooser(intent, "share"));
            shareResultListener.success(CHANNEL_NAME);
        }
    }
}
