package o;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import io.split.android.client.SplitClient;
import io.split.android.client.events.SplitEvent;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class isUesCacheLocation {
    @SuppressLint({"StaticFieldLeak"})
    private static final isUesCacheLocation getMax = new isUesCacheLocation();
    public final HashMap<String, Object> getMin = new HashMap<>();
    public final HashMap<String, getCurrentLocation> length = new HashMap<>();
    public Context setMax;

    public static final class length {
        public String IsOverlapping;
        public String equals;
        public Context getMax;
        public String getMin;
        public String isInside;
        public String length;
        public final HashMap<String, Object> setMax = new HashMap<>();
        final HashMap<String, getCurrentLocation> setMin = new HashMap<>();
        public String toFloatRange;
    }

    private isUesCacheLocation() {
    }

    public static synchronized isUesCacheLocation getMax() {
        isUesCacheLocation isuescachelocation;
        synchronized (isUesCacheLocation.class) {
            isuescachelocation = getMax;
        }
        return isuescachelocation;
    }

    @Nullable
    public final getSDKVerison setMin(String str, String str2) {
        if (this.length.containsKey(str2)) {
            return this.length.get(str2).setMin.getTreatmentWithConfig(str, this.getMin);
        }
        return null;
    }

    public final void length(final List<String> list, String str, final sendEndMsg sendendmsg) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-1275209562, oncanceled);
            onCancelLoad.getMin(-1275209562, oncanceled);
        }
        if (this.length.containsKey(str)) {
            SplitClient splitClient = this.length.get(str).setMin;
            if (getMin(str)) {
                sendendmsg.onComplete(setMax(splitClient.getTreatmentsWithConfig(list, this.getMin)));
                return;
            }
            AnonymousClass1 r6 = new atlasSafeEncrypt() {
                public final void onPostExecutionView(SplitClient splitClient) {
                }

                public final void onPostExecution(SplitClient splitClient) {
                    sendendmsg.onComplete(isUesCacheLocation.setMax(splitClient.getTreatmentsWithConfig(list, isUesCacheLocation.this.getMin)));
                }
            };
            splitClient.on(SplitEvent.SDK_READY, r6);
            splitClient.on(SplitEvent.SDK_READY_TIMED_OUT, r6);
            return;
        }
        sendendmsg.onError();
    }

    /* access modifiers changed from: private */
    public static Map<String, getSystemLocation> setMax(Map<String, getSDKVerison> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (Map.Entry next : map.entrySet()) {
            getSDKVerison getsdkverison = (getSDKVerison) next.getValue();
            linkedHashMap.put(next.getKey(), new getSystemLocation(getsdkverison.treatment(), getsdkverison.config()));
        }
        return linkedHashMap;
    }

    @Nullable
    public final <T> void getMin(String str, String str2, Class<T> cls, T t, KeyboardBridgeExtension<T> keyboardBridgeExtension) {
        if (this.length.containsKey(str2)) {
            SplitClient splitClient = this.length.get(str2).setMin;
            if (getMin(str2)) {
                onLocationAvailability<T> length2 = length(str, str2, cls, t);
                keyboardBridgeExtension.onComplete(length2.getMax, length2.setMax);
                return;
            }
            final String str3 = str;
            final String str4 = str2;
            final Class<T> cls2 = cls;
            final T t2 = t;
            final KeyboardBridgeExtension<T> keyboardBridgeExtension2 = keyboardBridgeExtension;
            AnonymousClass4 r1 = new atlasSafeEncrypt() {
                public final void onPostExecutionView(SplitClient splitClient) {
                }

                public final void onPostExecution(SplitClient splitClient) {
                    onLocationAvailability length2 = isUesCacheLocation.this.length(str3, str4, cls2, t2);
                    keyboardBridgeExtension2.onComplete(length2.getMax, length2.setMax);
                }
            };
            splitClient.on(SplitEvent.SDK_READY, r1);
            splitClient.on(SplitEvent.SDK_READY_TIMED_OUT, r1);
            return;
        }
        keyboardBridgeExtension.onError();
    }

    private boolean getMin(String str) {
        return this.length.get(str).setMin.isReady() || this.length.get(str).setMax() || this.length.get(str).getMin();
    }

    @NonNull
    public final getSystemLocation length(String str, String str2) {
        getSDKVerison min = setMin(str, str2);
        return min != null ? new getSystemLocation(min.treatment(), min.config()) : new getSystemLocation();
    }

    @NonNull
    public final Map<String, getSystemLocation> setMin(List<String> list, String str) {
        Map<String, getSDKVerison> max = setMax(list, str);
        LinkedHashMap linkedHashMap = new LinkedHashMap(max.size());
        for (Map.Entry next : max.entrySet()) {
            getSDKVerison getsdkverison = (getSDKVerison) next.getValue();
            if (getsdkverison != null) {
                linkedHashMap.put(next.getKey(), new getSystemLocation(getsdkverison.treatment(), getsdkverison.config()));
            } else {
                linkedHashMap.put(next.getKey(), new getSystemLocation());
            }
        }
        return linkedHashMap;
    }

    private Map<String, getSDKVerison> setMax(List<String> list, String str) {
        if (this.length.containsKey(str)) {
            return this.length.get(str).setMin.getTreatmentsWithConfig(list, this.getMin);
        }
        return Collections.emptyMap();
    }

    @NonNull
    public final <T> onLocationAvailability<T> length(String str, String str2, Class<T> cls, T t) {
        getSDKVerison min = setMin(str, str2);
        onLocationAvailability<T> onlocationavailability = new onLocationAvailability<>("control", t);
        if (min != null) {
            onlocationavailability.getMin = min.config();
            onlocationavailability.getMax = min.treatment();
            String config = min.config();
            T t2 = null;
            if (!(config == null || cls == null)) {
                t2 = JSON.parseObject(config, cls);
            }
            if (t2 != null) {
                t = t2;
            }
            onlocationavailability.setMax = t;
        }
        return onlocationavailability;
    }

    public final void getMax(@NonNull String str, final getCurrentLocation getcurrentlocation) {
        if (getcurrentlocation.setMin != null) {
            getcurrentlocation.setMin.on(SplitEvent.SDK_READY_FROM_CACHE, new atlasSafeEncrypt() {
                public final void onPostExecutionView(SplitClient splitClient) {
                }

                public final void onPostExecution(SplitClient splitClient) {
                    getcurrentlocation.getMax = true;
                }
            });
            getcurrentlocation.setMin.on(SplitEvent.SDK_READY_TIMED_OUT, new atlasSafeEncrypt() {
                public final void onPostExecutionView(SplitClient splitClient) {
                }

                public final void onPostExecution(SplitClient splitClient) {
                    getcurrentlocation.setMax = true;
                }
            });
        }
        this.length.put(str, getcurrentlocation);
    }

    public static /* synthetic */ isUesCacheLocation length(isUesCacheLocation isuescachelocation, length length2) {
        isuescachelocation.setMax = length2.getMax;
        isuescachelocation.getMin.put("android_lib_version", "2.7.2");
        isuescachelocation.getMin.putAll(length2.setMax);
        for (Map.Entry next : length2.setMin.entrySet()) {
            isuescachelocation.getMax((String) next.getKey(), (getCurrentLocation) next.getValue());
        }
        return getMax;
    }
}
