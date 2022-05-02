package com.alipay.mobile.verifyidentity.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class DefaultOnClickUrl implements OnClickUrl {
    public void onClickHttpUrl(Context context, String str) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-636846253, oncanceled);
                onCancelLoad.getMin(-636846253, oncanceled);
            }
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }
    }
}
