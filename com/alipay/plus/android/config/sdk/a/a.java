package com.alipay.plus.android.config.sdk.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.plus.android.config.sdk.ConfigMerger;
import com.alipay.plus.android.config.sdk.listener.ConfigChangeType;
import com.alipay.plus.android.config.sdk.listener.sectionconfig.ChangedDetails;
import java.util.Set;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class a {
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    public String f10741a;
    public boolean b;
    @NonNull
    public final ChangedDetails c = new ChangedDetails();

    public a(@NonNull String str) {
        this.f10741a = str;
        this.b = !ConfigMerger.isCommonConfigSection(str);
    }

    public boolean a(@NonNull ConfigChangeType configChangeType, @NonNull String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1480691578, oncanceled);
            onCancelLoad.getMin(-1480691578, oncanceled);
        }
        Set<String> set = null;
        if (configChangeType == ConfigChangeType.Added) {
            set = this.c.addedKeys;
        } else if (configChangeType == ConfigChangeType.Modified) {
            set = this.c.modifiedKeys;
        } else if (configChangeType == ConfigChangeType.Deleted) {
            set = this.c.deletedKeys;
        }
        if (set == null || set.contains(str)) {
            return false;
        }
        set.add(str);
        return true;
    }

    public boolean a(@NonNull String str) {
        return TextUtils.equals(this.f10741a, str);
    }
}
