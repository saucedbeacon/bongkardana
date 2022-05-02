package com.iap.ac.config.lite.c;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.config.lite.ConfigMerger;
import com.iap.ac.config.lite.listener.ConfigChangeType;
import com.iap.ac.config.lite.listener.sectionconfig.ChangedDetails;
import java.util.Set;

public class a {
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    public final ChangedDetails f9796a = new ChangedDetails();
    @NonNull
    public String b;
    public boolean c;

    public a(@NonNull String str) {
        this.b = str;
        this.c = !ConfigMerger.isCommonConfigSection(str);
    }

    public boolean a(@NonNull ConfigChangeType configChangeType, @NonNull String str) {
        Set<String> set;
        if (configChangeType == ConfigChangeType.ADDED) {
            set = this.f9796a.addedKeys;
        } else if (configChangeType == ConfigChangeType.MODIFIED) {
            set = this.f9796a.modifiedKeys;
        } else {
            set = configChangeType == ConfigChangeType.DELETED ? this.f9796a.deletedKeys : null;
        }
        if (set == null || set.contains(str)) {
            return false;
        }
        set.add(str);
        return true;
    }

    public boolean a(@NonNull String str) {
        return TextUtils.equals(this.b, str);
    }
}
