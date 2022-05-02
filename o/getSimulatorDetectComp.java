package o;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;
import io.split.android.client.SplitClient;
import io.split.android.client.dtos.Split;
import io.split.android.client.events.SplitEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class getSimulatorDetectComp implements SplitClient {
    private ImmutableMap<String, Split> mFeatureToTreatmentMap;
    private String mKey;
    private dynamicDecryptByteArrayDDp mLocalhostGrammar = new dynamicDecryptByteArrayDDp();
    private getOpenSDKComp mfactory;

    public final void flush() {
    }

    public final void on(SplitEvent splitEvent, atlasSafeEncrypt atlassafeencrypt) {
    }

    public final boolean track(String str) {
        return false;
    }

    public final boolean track(String str, double d) {
        return false;
    }

    public final boolean track(String str, double d, Map<String, Object> map) {
        return false;
    }

    public final boolean track(String str, String str2) {
        return false;
    }

    public final boolean track(String str, String str2, double d) {
        return false;
    }

    public final boolean track(String str, String str2, double d, Map<String, Object> map) {
        return false;
    }

    public final boolean track(String str, String str2, Map<String, Object> map) {
        return false;
    }

    public final boolean track(String str, Map<String, Object> map) {
        return false;
    }

    public getSimulatorDetectComp(getOpenSDKComp getopensdkcomp, String str, ImmutableMap<String, Split> immutableMap) {
        this.mFeatureToTreatmentMap = immutableMap;
        this.mfactory = getopensdkcomp;
        this.mKey = str;
    }

    public final String getTreatment(String str) {
        String str2 = this.mKey;
        if (!(str2 == null || str == null)) {
            Split split = this.mFeatureToTreatmentMap.get(this.mLocalhostGrammar.buildSplitKeyName(str, str2));
            if (split == null) {
                split = this.mFeatureToTreatmentMap.get(str);
            }
            if (!(split == null || split.defaultTreatment == null)) {
                return split.defaultTreatment;
            }
        }
        return "control";
    }

    public final String getTreatment(String str, Map<String, Object> map) {
        return getTreatment(str);
    }

    public final getSDKVerison getTreatmentWithConfig(String str, Map<String, Object> map) {
        String str2 = this.mKey;
        if (str2 == null || str == null) {
            return new getSDKVerison("control");
        }
        Split split = this.mFeatureToTreatmentMap.get(this.mLocalhostGrammar.buildSplitKeyName(str, str2));
        if (split == null) {
            split = this.mFeatureToTreatmentMap.get(str);
        }
        if (split == null || split.defaultTreatment == null) {
            return new getSDKVerison("control");
        }
        String str3 = null;
        if (split.configurations != null) {
            str3 = split.configurations.get(split.defaultTreatment);
        }
        return new getSDKVerison(split.defaultTreatment, str3);
    }

    public final Map<String, String> getTreatments(List<String> list, Map<String, Object> map) {
        Map<String, getSDKVerison> treatmentsWithConfig = getTreatmentsWithConfig(list, map);
        HashMap hashMap = new HashMap();
        for (Map.Entry next : treatmentsWithConfig.entrySet()) {
            hashMap.put((String) next.getKey(), ((getSDKVerison) next.getValue()).treatment());
        }
        return hashMap;
    }

    public final Map<String, getSDKVerison> getTreatmentsWithConfig(List<String> list, Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (String next : list) {
            hashMap.put(next, getTreatmentWithConfig(next, (Map<String, Object>) null));
        }
        return hashMap;
    }

    public final void destroy() {
        this.mfactory.destroy();
    }

    public final boolean isReady() {
        return this.mfactory.isReady();
    }

    /* access modifiers changed from: package-private */
    public final void updateSplitsMap(ImmutableMap<String, Split> immutableMap) {
        this.mFeatureToTreatmentMap = immutableMap;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final ImmutableMap<String, Split> featureToTreatmentMap() {
        return this.mFeatureToTreatmentMap;
    }
}
