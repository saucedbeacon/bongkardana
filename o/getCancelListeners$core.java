package o;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import id.dana.bottomsheet.ServicesBottomSheetDialog;
import id.dana.tracker.TrackerKey;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\tH\u0002J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lid/dana/danah5/bottomsheet/service/ServicesBottomSheetManager;", "", "()V", "servicesBottomSheetDialog", "Lid/dana/bottomsheet/ServicesBottomSheetDialog;", "dismissBottomSheetDialog", "", "getListOfService", "", "", "params", "showServicesBottomSheetDialog", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "info", "Lcom/alibaba/fastjson/JSONObject;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "addQuery", "Lid/dana/bottomsheet/ServicesBottomSheetDialog$Builder;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getCancelListeners$core {
    @NotNull
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    @NotNull
    public static final String DEEPLINK_QUERY_NAME = "params";
    @NotNull
    public static final String DEFAULT_TITLE_BOTTOMSHEET_SERVICE = "Select services";
    @NotNull
    public static final String PARAM_TITLE = "title";
    @NotNull
    public static final String PARAM_WITH_CATEGORIES = "withCategory";
    @NotNull
    public static final String PARAM_WITH_DEEPLINK = "withDeepLink";
    @NotNull
    public static final String PARAM_WITH_SERVICES = "withServices";
    private ServicesBottomSheetDialog servicesBottomSheetDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "failure", "", "invoke", "id/dana/danah5/bottomsheet/service/ServicesBottomSheetManager$showServicesBottomSheetDialog$2$3"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ BridgeCallback $bridgeCallback$inlined;
        final /* synthetic */ FragmentActivity $fragmentActivity$inlined;
        final /* synthetic */ JSONObject $info$inlined;
        final /* synthetic */ getCancelListeners$core $this_run;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(getCancelListeners$core getcancellisteners_core, JSONObject jSONObject, BridgeCallback bridgeCallback, FragmentActivity fragmentActivity) {
            super(1);
            this.$this_run = getcancellisteners_core;
            this.$info$inlined = jSONObject;
            this.$bridgeCallback$inlined = bridgeCallback;
            this.$fragmentActivity$inlined = fragmentActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "failure");
            int hashCode = str.hashCode();
            if (hashCode != -476790647) {
                if (hashCode == 248045090 ? str.equals("FAIL_EMPTY_SERVICE") : !(hashCode != 986623908 || !str.equals("FAIL_FETCH_SERVICES"))) {
                    this.$bridgeCallback$inlined.sendBridgeResponse(icon.INSTANCE.getFAIL_FETCH_SERVICES());
                    this.$this_run.dismissBottomSheetDialog();
                }
            } else if (str.equals("FAIL_DO_ACTION")) {
                this.$bridgeCallback$inlined.sendBridgeResponse(icon.INSTANCE.getFAIL_FETCH_AUTH_CODE());
                this.$this_run.dismissBottomSheetDialog();
            }
            this.$bridgeCallback$inlined.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            this.$this_run.dismissBottomSheetDialog();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "id/dana/danah5/bottomsheet/service/ServicesBottomSheetManager$showServicesBottomSheetDialog$2$1"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ BridgeCallback $bridgeCallback$inlined;
        final /* synthetic */ FragmentActivity $fragmentActivity$inlined;
        final /* synthetic */ JSONObject $info$inlined;
        final /* synthetic */ getCancelListeners$core $this_run;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(getCancelListeners$core getcancellisteners_core, JSONObject jSONObject, BridgeCallback bridgeCallback, FragmentActivity fragmentActivity) {
            super(1);
            this.$this_run = getcancellisteners_core;
            this.$info$inlined = jSONObject;
            this.$bridgeCallback$inlined = bridgeCallback;
            this.$fragmentActivity$inlined = fragmentActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            this.$bridgeCallback$inlined.sendBridgeResponse(BridgeResponse.SUCCESS);
            this.$this_run.dismissBottomSheetDialog();
        }
    }

    public final void dismissBottomSheetDialog() {
        ServicesBottomSheetDialog servicesBottomSheetDialog2 = this.servicesBottomSheetDialog;
        if (servicesBottomSheetDialog2 != null && servicesBottomSheetDialog2.isVisible()) {
            servicesBottomSheetDialog2.dismissAllowingStateLoss();
        }
    }

    public final void showServicesBottomSheetDialog(@NotNull FragmentActivity fragmentActivity, @Nullable JSONObject jSONObject, @NotNull BridgeCallback bridgeCallback) {
        String str;
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        ServicesBottomSheetDialog servicesBottomSheetDialog2 = this.servicesBottomSheetDialog;
        if (servicesBottomSheetDialog2 != null) {
            if (!servicesBottomSheetDialog2.isAdded()) {
                servicesBottomSheetDialog2 = null;
            }
            if (servicesBottomSheetDialog2 != null) {
                return;
            }
        }
        getCancelListeners$core getcancellisteners_core = this;
        if (jSONObject == null || (str = jSONObject.getString("title")) == null) {
            str = DEFAULT_TITLE_BOTTOMSHEET_SERVICE;
        }
        ServicesBottomSheetDialog.getMin addQuery = getcancellisteners_core.addQuery(new ServicesBottomSheetDialog.getMin(str, (String) null, (List) null, (Function1) null, (Function0) null, (Function1) null, (String) null, 126), jSONObject);
        Function1<? super String, Unit> setmax = new setMax(getcancellisteners_core, jSONObject, bridgeCallback, fragmentActivity);
        Intrinsics.checkNotNullParameter(setmax, "onSuccessOpenService");
        ServicesBottomSheetDialog.getMin getmin = addQuery;
        getmin.getMax = setmax;
        Function0<Unit> getmin2 = new getMin(getcancellisteners_core, jSONObject, bridgeCallback, fragmentActivity);
        Intrinsics.checkNotNullParameter(getmin2, "onClickCloseOrSwipedDown");
        ServicesBottomSheetDialog.getMin getmin3 = getmin;
        getmin3.setMin = getmin2;
        Function1<? super String, Unit> length2 = new length(getcancellisteners_core, jSONObject, bridgeCallback, fragmentActivity);
        Intrinsics.checkNotNullParameter(length2, "onFail");
        ServicesBottomSheetDialog.getMin getmin4 = getmin3;
        getmin4.IsOverlapping = length2;
        Intrinsics.checkNotNullParameter(TrackerKey.SourceType.JS_API, "source");
        ServicesBottomSheetDialog.getMin getmin5 = getmin4;
        getmin5.toFloatRange = TrackerKey.SourceType.JS_API;
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "fragmentActivity.supportFragmentManager");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "fragmentManager");
        ServicesBottomSheetDialog servicesBottomSheetDialog3 = new ServicesBottomSheetDialog(new ServicesBottomSheetDialog.getMin(getmin5.setMax, getmin5.length, getmin5.getMin, getmin5.getMax, getmin5.setMin, getmin5.IsOverlapping, (String) null, 64));
        servicesBottomSheetDialog3.show(supportFragmentManager, "SERVICE_BOTTOM_SHEET_DIALOG");
        getcancellisteners_core.servicesBottomSheetDialog = servicesBottomSheetDialog3;
        Unit unit = Unit.INSTANCE;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/danah5/bottomsheet/service/ServicesBottomSheetManager$showServicesBottomSheetDialog$2$2"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function0<Unit> {
        final /* synthetic */ BridgeCallback $bridgeCallback$inlined;
        final /* synthetic */ FragmentActivity $fragmentActivity$inlined;
        final /* synthetic */ JSONObject $info$inlined;
        final /* synthetic */ getCancelListeners$core $this_run;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(getCancelListeners$core getcancellisteners_core, JSONObject jSONObject, BridgeCallback bridgeCallback, FragmentActivity fragmentActivity) {
            super(0);
            this.$this_run = getcancellisteners_core;
            this.$info$inlined = jSONObject;
            this.$bridgeCallback$inlined = bridgeCallback;
            this.$fragmentActivity$inlined = fragmentActivity;
        }

        public final void invoke() {
            this.$bridgeCallback$inlined.sendBridgeResponse(icon.INSTANCE.getUSER_CANCEL());
            this.$this_run.dismissBottomSheetDialog();
        }
    }

    private final ServicesBottomSheetDialog.getMin addQuery(ServicesBottomSheetDialog.getMin getmin, JSONObject jSONObject) {
        Map<String, List<String>> min;
        List<String> list;
        if (jSONObject != null) {
            JSONArray jSONArray = jSONObject.getJSONArray(PARAM_WITH_SERVICES);
            if (jSONArray != null) {
                getmin.getMin("SERVICE_KEY", getFantasyFontFamily.toMutableListOfString(jSONArray));
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray(PARAM_WITH_CATEGORIES);
            if (jSONArray2 != null) {
                getmin.getMin("CATEGORY_SERVICE", getFantasyFontFamily.toMutableListOfString(jSONArray2));
            }
            String string = jSONObject.getString(PARAM_WITH_DEEPLINK);
            if (!(string == null || (min = isShowMenu.getMin(new URL(string))) == null || (list = min.get("params")) == null)) {
                List arrayList = new ArrayList();
                for (String str : list) {
                    Intrinsics.checkNotNullExpressionValue(str, "param");
                    List<String> listOfService = getListOfService(str);
                    if (listOfService != null) {
                        arrayList.addAll(listOfService);
                    }
                }
                getmin.getMin("SERVICE_KEY", arrayList);
            }
        }
        return getmin;
    }

    private final List<String> getListOfService(String str) {
        try {
            return isShowMenu.getMin(str).get("services");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/danah5/bottomsheet/service/ServicesBottomSheetManager$Companion;", "", "()V", "DEEPLINK_QUERY_NAME", "", "DEFAULT_TITLE_BOTTOMSHEET_SERVICE", "PARAM_TITLE", "PARAM_WITH_CATEGORIES", "PARAM_WITH_DEEPLINK", "PARAM_WITH_SERVICES", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
