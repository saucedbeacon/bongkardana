package o;

import org.json.JSONObject;

public final class ActionSheetBridgeExtension {
    private static boolean getMin = true;

    /* renamed from: o.ActionSheetBridgeExtension$2  reason: invalid class name */
    public interface AnonymousClass2 {
        void length();

        void length(String str, boolean z);

        void length(JSONObject jSONObject);

        void setMin(String str, boolean z);

        void setMin(JSONObject jSONObject);
    }

    public static boolean getMin() {
        return getMin;
    }
}
