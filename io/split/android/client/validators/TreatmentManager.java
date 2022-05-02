package io.split.android.client.validators;

import java.util.List;
import java.util.Map;
import o.getSDKVerison;

public interface TreatmentManager {
    String getTreatment(String str, Map<String, Object> map, boolean z);

    getSDKVerison getTreatmentWithConfig(String str, Map<String, Object> map, boolean z);

    Map<String, String> getTreatments(List<String> list, Map<String, Object> map, boolean z);

    Map<String, getSDKVerison> getTreatmentsWithConfig(List<String> list, Map<String, Object> map, boolean z);
}
