package o;

import android.content.Context;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.data.toggle.exception.UnexpectedTreatment;
import id.dana.data.toggle.tracker.ToggleEvent;
import id.dana.data.toggle.traffictype.TrafficType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.CharsKt;
import o.DatePickerBridgeExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\n\b&\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0001JB%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ,\u0010\u0011\u001a\u0004\u0018\u0001H\u0012\"\u0006\b\u0000\u0010\u0012\u0018\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u0001H\u0012H\b¢\u0006\u0002\u0010\u0015J*\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00172\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\bH\u0002J\"\u0010\u001c\u001a\u0004\u0018\u0001H\u0012\"\u0006\b\u0000\u0010\u0012\u0018\u00012\b\u0010\u001d\u001a\u0004\u0018\u00010\bH\b¢\u0006\u0002\u0010\u001eJ\"\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010!\u001a\u00020\u000fJH\u0010\"\u001a\u0002H\u0012\"\u0006\b\u0000\u0010\u0012\u0018\u00012\u0006\u0010 \u001a\u00020\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u0001H\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010#\u001a\u00020\u000f2\b\b\u0002\u0010!\u001a\u00020\u000fH\b¢\u0006\u0002\u0010$JF\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u00120&\"\u0006\b\u0000\u0010\u0012\u0018\u00012\u0006\u0010 \u001a\u00020\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u0001H\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010!\u001a\u00020\u000fH\b¢\u0006\u0002\u0010'J3\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\u00120)\"\u0006\b\u0000\u0010\u0012\u0018\u00012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0+2\u0006\u0010#\u001a\u00020\u000fH\bJK\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\u00120)0-\"\u0006\b\u0000\u0010\u0012\u0018\u00012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0+2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u000f2\b\b\u0002\u0010!\u001a\u00020\u000fH\bJ=\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00120/\"\u0004\b\u0000\u0010\u00122\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\u00120)2\b\u0010\u0014\u001a\u0004\u0018\u0001H\u0012¢\u0006\u0002\u00101J\"\u00102\u001a\u0002032\u0006\u0010 \u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u0002032\b\b\u0002\u0010!\u001a\u00020\u000fJS\u00104\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\u00120)\"\u0006\b\u0000\u0010\u0012\u0018\u00012\u0006\u0010 \u001a\u00020\b2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\u0012\u0018\u00010)2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010!\u001a\u00020\u000fH\bJ(\u00105\u001a\u0004\u0018\u00010\b2\u0006\u0010 \u001a\u00020\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\bJ\"\u00107\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0+J:\u00108\u001a\b\u0012\u0004\u0012\u0002H\u00120&\"\u0006\b\u0000\u0010\u0012\u0018\u00012\u0006\u0010 \u001a\u00020\b2\b\b\u0002\u00109\u001a\u00020\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u0001H\u0012H\b¢\u0006\u0002\u0010:J\u001a\u0010;\u001a\u0004\u0018\u00010\b2\u0006\u0010 \u001a\u00020\b2\b\b\u0002\u00109\u001a\u00020\u000fJ\b\u0010<\u001a\u00020\u000fH\u0002Jj\u0010=\u001a\u00020>\"\u0006\b\u0000\u0010\u0012\u0018\u00012\u0006\u0010\u001b\u001a\u00020?2\u0006\u0010!\u001a\u00020\u000f2\u0014\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00120A2\u0006\u0010B\u001a\u00020\b2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\u00120)2\b\u0010\u0014\u001a\u0004\u0018\u0001H\u00122\u0006\u0010#\u001a\u00020\u000fH\b¢\u0006\u0002\u0010CJ\u0006\u0010D\u001a\u00020>J\u0018\u0010E\u001a\u00020>2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010F\u001a\u00020?H\u0002J+\u0010E\u001a\u00020>\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u0001H\u0012¢\u0006\u0002\u0010GJ\u001a\u0010E\u001a\u00020>2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020?0)J\b\u0010I\u001a\u00020\bH&R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lid/dana/data/toggle/traffictype/BaseTrafficType;", "Lid/dana/lib/toggle/factory/AbstractToggleFactory;", "Lid/dana/data/toggle/traffictype/ITrafficTypeFactory;", "context", "Landroid/content/Context;", "config", "Lid/dana/lib/toggle/ToggleClientConfig;", "apikey", "", "mixpanelEntityRepository", "Lid/dana/data/tracker/MixpanelEntityRepository;", "(Landroid/content/Context;Lid/dana/lib/toggle/ToggleClientConfig;Ljava/lang/String;Lid/dana/data/tracker/MixpanelEntityRepository;)V", "getContext", "()Landroid/content/Context;", "isAdded", "", "()Z", "createDefaultValue", "T", "pathDefaultJsonValue", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "createJSONObjectForLog", "Lorg/json/JSONObject;", "kotlin.jvm.PlatformType", "configName", "treatment", "value", "createObjectFromJsonPath", "jsonAssetsPath", "(Ljava/lang/String;)Ljava/lang/Object;", "getBooleanConfig", "splitName", "throwExceptionIfControl", "getConfig", "isNeedToDeserialized", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZZ)Ljava/lang/Object;", "getConfigOnceReady", "Lio/reactivex/Single;", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Z)Lio/reactivex/Single;", "getConfigs", "", "splitNames", "", "getConfigsOnceReady", "Lio/reactivex/Observable;", "getDefaultValue", "Lkotlin/Function1;", "defaultMapValue", "(Ljava/util/Map;Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "getIntConfig", "", "getMapConfig", "getRawConfig", "jsonDefaultValue", "getRawConfigs", "getTreatmentWithConfigSdkReady", "isNeedToThrowWhenGotControl", "(Ljava/lang/String;ZLjava/lang/Object;)Lio/reactivex/Single;", "getTreatmentWithRawConfig", "isMixpanelExperimentTrackerEnabled", "mapResultConfigs", "", "Lid/dana/lib/toggle/result/RawResult;", "map", "", "key", "(Lid/dana/lib/toggle/result/RawResult;ZLjava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Z)V", "remove", "trackExperimentWithSplitName", "rawResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "configNamesWithTreatment", "trafficType", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class getRequestMainPackage extends getCurrentLocation {
    @NotNull
    public static final setMax getMin = new setMax((byte) 0);
    private final getQueryScene IsOverlapping;
    @NotNull
    public final Context length;

    @NotNull
    public abstract String setMin();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getRequestMainPackage(@NotNull Context context, @NotNull sendLocation sendlocation, @NotNull String str, @NotNull getQueryScene getqueryscene) {
        super(context, sendlocation, str);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(sendlocation, "config");
        Intrinsics.checkNotNullParameter(str, "apikey");
        Intrinsics.checkNotNullParameter(getqueryscene, "mixpanelEntityRepository");
        this.length = context;
        this.IsOverlapping = getqueryscene;
    }

    public final boolean getMax() {
        Set<String> keySet;
        isUesCacheLocation max = isUesCacheLocation.getMax();
        Intrinsics.checkNotNullExpressionValue(max, "ToggleManager.getInstance()");
        HashMap<String, getCurrentLocation> hashMap = max.length;
        if (!(hashMap == null || (keySet = hashMap.keySet()) == null)) {
            Iterable<String> iterable = keySet;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return false;
            }
            for (String areEqual : iterable) {
                if (Intrinsics.areEqual((Object) areEqual, (Object) setMin())) {
                    return true;
                }
            }
        }
        return false;
    }

    private static JSONObject getMax(String str, String str2, String str3) {
        JSONObject put = new JSONObject().put("configName", str).put("treatment", str2);
        if (str3 != null) {
            put.put("value", str3);
        }
        return put;
    }

    private static boolean length() {
        Set<String> keySet;
        boolean z;
        isUesCacheLocation max = isUesCacheLocation.getMax();
        Intrinsics.checkNotNullExpressionValue(max, "ToggleManager.getInstance()");
        HashMap<String, getCurrentLocation> hashMap = max.length;
        if (!(hashMap == null || (keySet = hashMap.keySet()) == null)) {
            Iterable iterable = keySet;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (Intrinsics.areEqual((Object) (String) it.next(), (Object) TrafficType.DEVICE)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                return false;
            }
        }
        try {
            getSystemLocation length2 = isUesCacheLocation.getMax().length("feature_mixpanel_experiment", TrafficType.DEVICE);
            Intrinsics.checkNotNullExpressionValue(length2, "ToggleManager.getInstanc…Name, TrafficType.DEVICE)");
            String str = length2.getMax;
            Intrinsics.checkNotNullExpressionValue(str, "result.treatment");
            LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, getMax("feature_mixpanel_experiment", str, length2.getMin).toString());
            String str2 = length2.getMin;
            if (str2 != null) {
                return Boolean.parseBoolean(str2);
            }
            return false;
        } catch (Exception e) {
            LoggerWrapper.e(DanaLogConstants.TAG.SPLIT, e.getMessage());
            return false;
        }
    }

    private final void getMax(String str, getSystemLocation getsystemlocation) {
        JSONObject put = new JSONObject().put(ToggleEvent.Property.Key.EXPERIMENT_NAME, str).put(ToggleEvent.Property.Key.VARIANT_NAME, getsystemlocation.getMax);
        if (length()) {
            this.IsOverlapping.track(ToggleEvent.EventName.GET_TOGGLE_CONFIG, put);
        }
        String str2 = getsystemlocation.getMax;
        Intrinsics.checkNotNullExpressionValue(str2, "rawResult.treatment");
        LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, getMax(str, str2, getsystemlocation.getMin).toString());
    }

    public final <T> void getMax(@NotNull String str, @NotNull String str2, @Nullable T t) {
        Intrinsics.checkNotNullParameter(str, "configName");
        Intrinsics.checkNotNullParameter(str2, "treatment");
        JSONObject put = new JSONObject().put(ToggleEvent.Property.Key.EXPERIMENT_NAME, str).put(ToggleEvent.Property.Key.VARIANT_NAME, str2);
        if (length()) {
            this.IsOverlapping.track(ToggleEvent.EventName.GET_TOGGLE_CONFIG, put);
        }
        LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, getMax(str, str2, getPositiveString.toJSONString(t)).toString());
    }

    public final void setMin(@NotNull Map<String, ? extends getSystemLocation> map) {
        Intrinsics.checkNotNullParameter(map, "configNamesWithTreatment");
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            getSystemLocation getsystemlocation = (getSystemLocation) next.getValue();
            JSONObject put = new JSONObject().put(ToggleEvent.Property.Key.EXPERIMENT_NAME, str).put(ToggleEvent.Property.Key.VARIANT_NAME, getsystemlocation.getMax);
            if (length()) {
                this.IsOverlapping.track(ToggleEvent.EventName.GET_TOGGLE_CONFIG, put);
            }
            String str2 = getsystemlocation.getMax;
            Intrinsics.checkNotNullExpressionValue(str2, "result.treatment");
            jSONArray.put(getMax(str, str2, getsystemlocation.getMin));
        }
        LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, jSONArray.toString());
    }

    @Nullable
    public final String getMax(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "splitName");
        getSystemLocation length2 = isUesCacheLocation.getMax().length(str, setMin());
        Intrinsics.checkNotNullExpressionValue(length2, "result");
        getMax(str, length2);
        if (!z || !Intrinsics.areEqual((Object) length2.getMax, (Object) "control")) {
            return length2.getMin;
        }
        throw new UnexpectedTreatment(str);
    }

    public static /* synthetic */ String length(getRequestMainPackage getrequestmainpackage, String str, String str2) {
        String str3;
        Intrinsics.checkNotNullParameter(str, "splitName");
        isUesCacheLocation max = isUesCacheLocation.getMax();
        getSDKVerison min = max.setMin(str, getrequestmainpackage.setMin());
        String str4 = null;
        if (min != null) {
            str3 = min.config();
        } else {
            str3 = null;
        }
        if (str3 != null) {
            str4 = str3;
        }
        return str4 == null ? getPositiveString.loadJSONFromAsset(max.setMax, str2) : str4;
    }

    public static /* synthetic */ boolean getMax(getRequestMainPackage getrequestmainpackage, String str, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        return getrequestmainpackage.setMin(str, false, z);
    }

    public final boolean setMin(@NotNull String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "splitName");
        String max = getMax(str, z2);
        if (max != null) {
            CharSequence charSequence = max;
            Appendable sb = new StringBuilder();
            int length2 = charSequence.length();
            for (int i = 0; i < length2; i++) {
                char charAt = charSequence.charAt(i);
                if (!CharsKt.isWhitespace(charAt)) {
                    sb.append(charAt);
                }
            }
            String obj = ((StringBuilder) sb).toString();
            Intrinsics.checkNotNullExpressionValue(obj, "filterTo(StringBuilder(), predicate).toString()");
            if (obj != null) {
                return Boolean.parseBoolean(obj);
            }
        }
        return z;
    }

    public static /* synthetic */ int getMax(getRequestMainPackage getrequestmainpackage, String str, int i) {
        Intrinsics.checkNotNullParameter(str, "splitName");
        String max = getrequestmainpackage.getMax(str, false);
        return max != null ? DatePickerBridgeExtension.AnonymousClass7.setMax(max, i) : i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "key", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    public static final class setMin extends Lambda implements Function1<String, T> {
        final /* synthetic */ Map $defaultMapValue;
        final /* synthetic */ Object $defaultValue;
        final /* synthetic */ getRequestMainPackage this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMin(getRequestMainPackage getrequestmainpackage, Map map, Object obj) {
            super(1);
            this.this$0 = getrequestmainpackage;
            this.$defaultMapValue = map;
            this.$defaultValue = obj;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
            r4 = kotlin.collections.MapsKt.getValue(r0, r4);
         */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final T invoke(@org.jetbrains.annotations.NotNull java.lang.String r4) {
            /*
                r3 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.util.Map r0 = r3.$defaultMapValue
                boolean r1 = r0.isEmpty()
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x0016
                boolean r1 = r0.containsKey(r4)
                if (r1 == 0) goto L_0x0016
                goto L_0x0017
            L_0x0016:
                r2 = 0
            L_0x0017:
                if (r2 == 0) goto L_0x001a
                goto L_0x001b
            L_0x001a:
                r0 = 0
            L_0x001b:
                if (r0 == 0) goto L_0x0023
                java.lang.Object r4 = kotlin.collections.MapsKt.getValue(r0, r4)
                if (r4 != 0) goto L_0x0025
            L_0x0023:
                java.lang.Object r4 = r3.$defaultValue
            L_0x0025:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getRequestMainPackage.setMin.invoke(java.lang.String):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/data/toggle/traffictype/BaseTrafficType$Companion;", "", "()V", "LOG_KEY_CONFIG_NAME", "", "LOG_KEY_TREATMENT", "LOG_KEY_VALUE", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }
}
