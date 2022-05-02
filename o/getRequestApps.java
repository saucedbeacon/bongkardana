package o;

import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.data.tracker.TrackerDataKey;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0007¨\u0006\u000e"}, d2 = {"Lid/dana/data/tracker/BokuMixpanelDataTracker;", "", "()V", "addTrackerProperties", "Lorg/json/JSONObject;", "mixpanelPropertiesObject", "event", "", "source", "success", "", "isRequestNetwork", "responseCode", "responseMessage", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getRequestApps {
    @NotNull
    public static final getRequestApps INSTANCE = new getRequestApps();

    private getRequestApps() {
    }

    @JvmStatic
    @NotNull
    public static final JSONObject addTrackerProperties(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(jSONObject, "mixpanelPropertiesObject");
        Intrinsics.checkNotNullParameter(str, "event");
        Intrinsics.checkNotNullParameter(str2, "source");
        try {
            jSONObject.put("Source", str2);
            if (Intrinsics.areEqual((Object) TrackerDataKey.Event.CARRIER_IDENTIFICATION_COMPLETED, (Object) str)) {
                jSONObject.put("Success", z);
            }
        } catch (JSONException unused) {
            updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, DanaLogConstants.ExceptionType.MIXPANEL_MESSAGE_EXCEPTION);
        }
        return jSONObject;
    }

    @JvmStatic
    @NotNull
    public static final JSONObject addTrackerProperties(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(jSONObject, "mixpanelPropertiesObject");
        Intrinsics.checkNotNullParameter(str, "event");
        Intrinsics.checkNotNullParameter(str2, "source");
        Intrinsics.checkNotNullParameter(str3, ZimMessageChannel.K_RPC_RES_CODE);
        Intrinsics.checkNotNullParameter(str4, "responseMessage");
        try {
            jSONObject.put("Source", str2);
            int hashCode = str.hashCode();
            if (hashCode != -196324855) {
                if (hashCode == 1966359845) {
                    if (str.equals(TrackerDataKey.Event.CARRIER_IDENTIFICATION_REQUEST)) {
                        jSONObject.put(TrackerDataKey.Property.IS_REQUEST_NETWORK, z);
                    }
                }
            } else if (str.equals(TrackerDataKey.Event.CARRIER_IDENTIFICATION_EVURL_CALLED)) {
                jSONObject.put(TrackerDataKey.Property.RESPONSE_CODE, str3);
                jSONObject.put(TrackerDataKey.Property.RESPONSE_MESSAGE, str4);
            }
        } catch (JSONException unused) {
            updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, DanaLogConstants.ExceptionType.MIXPANEL_MESSAGE_EXCEPTION);
        }
        return jSONObject;
    }
}
