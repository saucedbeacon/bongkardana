package com.alipay.multigateway.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.multigateway.sdk.decision.condition.getter.IGetter;
import java.util.Map;
import o.PlaybackStateCompat;

public class ConditionValueGetter {
    private static ConditionValueGetter sInstance;
    @NonNull
    private final Map<String, IGetter> gettersMap = new PlaybackStateCompat();

    @NonNull
    public static ConditionValueGetter getInstance() {
        if (sInstance == null) {
            synchronized (ConditionValueGetter.class) {
                if (sInstance == null) {
                    sInstance = new ConditionValueGetter();
                }
            }
        }
        return sInstance;
    }

    public void addGetter(@NonNull String str, @NonNull IGetter iGetter) {
        this.gettersMap.put(str, iGetter);
    }

    @Nullable
    public <T> T getValue(@NonNull String str, @NonNull Object obj) {
        IGetter iGetter = this.gettersMap.get(str);
        if (iGetter == null) {
            return null;
        }
        return iGetter.getValue(obj);
    }
}
