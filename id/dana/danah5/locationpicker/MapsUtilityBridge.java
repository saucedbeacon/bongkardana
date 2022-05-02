package id.dana.danah5.locationpicker;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.env.GriverEnv;
import id.dana.DanaApplication;
import id.dana.danah5.locationpicker.MiniProgramLocationPickerActivity;
import id.dana.di.modules.GContainerModule;
import id.dana.domain.globalsearch.model.LatLng;
import id.dana.lib.gcontainer.app.bridge.core.BaseBridge;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import o.CornerMarkingDataProvider;
import o.PrepareException;
import o.RedDotDrawable;
import o.UpdateAppCallback;
import o.getMinimumFontSize;
import o.getRequestMainPackage;
import o.initToken;
import o.saveSnapshot;
import o.setDEFAULT_BEHAVIOR;
import o.xp4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J(\u0010\u001b\u001a\u00020\u00162\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u0007J\b\u0010\u001c\u001a\u00020\u0016H\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0011H\u0002J \u0010\"\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006$"}, d2 = {"Lid/dana/danah5/locationpicker/MapsUtilityBridge;", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge;", "()V", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "isFeatureEnabled", "", "()Z", "splitFacade", "Lid/dana/data/toggle/SplitFacade;", "getSplitFacade", "()Lid/dana/data/toggle/SplitFacade;", "setSplitFacade", "(Lid/dana/data/toggle/SplitFacade;)V", "assamblePickLocationInfo", "Lid/dana/danah5/locationpicker/model/PickLocationResponse;", "lat", "", "long", "name", "details", "handleMapsUtility", "", "info", "Lcom/alibaba/fastjson/JSONObject;", "page", "Lcom/alibaba/ariver/app/api/Page;", "mapUtility", "onInitialized", "onReceiveActivityResult", "event", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge$ActivityResultMessageEvent;", "setErrorCodeResult", "errorCode", "startPickLocationEvent", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MapsUtilityBridge extends BaseBridge {
    private static final String CURRENT_LOCATION = "currentLocation";
    @NotNull
    public static final length Companion = new length((DefaultConstructorMarker) null);
    private static final String ERROR_CODE_FEATURE_DISABLED = "500";
    private static final String ERROR_CODE_MISSING_EVENT = "420";
    private static final String ERROR_CODE_MISSING_INFO = "410";
    private static final String ERROR_CODE_MISSING_TITLE = "430";
    private static final String ERROR_CODE_NOT_SUPPORTED = "421";
    private static final String ERROR_CODE_PICK_LOCATION_CANCELLED_BY_USER = "400";
    private static final String PICK_LOCATION = "pickLocation";
    /* access modifiers changed from: private */
    public static final int REQUEST_CODE_PICK_LOCATION = CornerMarkingDataProvider.AnonymousClass2.setMax();
    private BridgeCallback bridgeCallback;
    @Inject
    public UpdateAppCallback splitFacade;

    @NotNull
    public final UpdateAppCallback getSplitFacade() {
        UpdateAppCallback updateAppCallback = this.splitFacade;
        if (updateAppCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("splitFacade");
        }
        return updateAppCallback;
    }

    public final void setSplitFacade(@NotNull UpdateAppCallback updateAppCallback) {
        Intrinsics.checkNotNullParameter(updateAppCallback, "<set-?>");
        this.splitFacade = updateAppCallback;
    }

    public final void onInitialized() {
        super.onInitialized();
        saveSnapshot.getMax getmax = new saveSnapshot.getMax((byte) 0);
        Application applicationContext = GriverEnv.getApplicationContext();
        if (applicationContext != null) {
            PrepareException.AnonymousClass1 applicationComponent = ((DanaApplication) applicationContext).getApplicationComponent();
            if (applicationComponent != null) {
                getmax.setMin = applicationComponent;
                getmax.getMin = new GContainerModule();
                getmax.getMin().setMin(this);
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }

    @ThreadType(ExecutorType.IO)
    @ActionFilter(canOverride = false)
    public final void mapUtility(@Nullable @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback2, @NotNull @BindingNode(Page.class) Page page) {
        Intrinsics.checkNotNullParameter(bridgeCallback2, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "page");
        this.bridgeCallback = bridgeCallback2;
        if (jSONObject != null) {
            handleMapsUtility(jSONObject, page, bridgeCallback2);
        } else {
            setErrorCodeResult(bridgeCallback2, ERROR_CODE_MISSING_INFO);
        }
    }

    private final void handleMapsUtility(JSONObject jSONObject, Page page, BridgeCallback bridgeCallback2) {
        if (!isFeatureEnabled()) {
            setErrorCodeResult(bridgeCallback2, ERROR_CODE_FEATURE_DISABLED);
            return;
        }
        Object obj = jSONObject.get("event");
        if (Intrinsics.areEqual(obj, (Object) PICK_LOCATION)) {
            startPickLocationEvent(jSONObject, page, bridgeCallback2);
        } else if (Intrinsics.areEqual(obj, (Object) CURRENT_LOCATION) || obj != null) {
            setErrorCodeResult(bridgeCallback2, ERROR_CODE_NOT_SUPPORTED);
        } else {
            setErrorCodeResult(bridgeCallback2, ERROR_CODE_MISSING_EVENT);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.danah5.locationpicker.MapsUtilityBridge$startPickLocationEvent$1", f = "MapsUtilityBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class getMin extends SuspendLambda implements Function2<initToken, Continuation<? super Unit>, Object> {
        final /* synthetic */ JSONObject $info;
        final /* synthetic */ Page $page;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(Page page, JSONObject jSONObject, Continuation continuation) {
            super(2, continuation);
            this.$page = page;
            this.$info = jSONObject;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            return new getMin(this.$page, this.$info, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((getMin) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Page page = this.$page;
                Intrinsics.checkNotNullParameter(page, "$this$activity");
                PageContext pageContext = page.getPageContext();
                Activity activity = pageContext != null ? pageContext.getActivity() : null;
                if (activity != null) {
                    Intent putExtra = new Intent(activity, MiniProgramLocationPickerActivity.class).putExtra("appName", String.valueOf(this.$info.get("title"))).putExtra(MiniProgramLocationPickerActivity.EXTRA_INITIAL_LOCATION, new LatLng(Double.parseDouble(String.valueOf(this.$info.get("lat"))), Double.parseDouble(String.valueOf(this.$info.get("long")))));
                    Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(this, MiniProgram…].toString().toDouble()))");
                    activity.startActivityForResult(putExtra, MapsUtilityBridge.Companion.getREQUEST_CODE_PICK_LOCATION());
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void startPickLocationEvent(JSONObject jSONObject, Page page, BridgeCallback bridgeCallback2) {
        if (jSONObject.get("title") != null) {
            xp4.getMin(getUiScope(), (CoroutineContext) null, (CoroutineStart) null, new getMin(page, jSONObject, (Continuation) null), 3);
        } else {
            setErrorCodeResult(bridgeCallback2, ERROR_CODE_MISSING_TITLE);
        }
    }

    private final void setErrorCodeResult(BridgeCallback bridgeCallback2, String str) {
        Object json = JSON.toJSON(new setDEFAULT_BEHAVIOR(false, (setDEFAULT_BEHAVIOR.setMax) null, str));
        if (json != null) {
            bridgeCallback2.sendJSONResponse((JSONObject) json);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
    }

    private final setDEFAULT_BEHAVIOR assamblePickLocationInfo(String str, String str2, String str3, String str4) {
        return new setDEFAULT_BEHAVIOR(true, new setDEFAULT_BEHAVIOR.setMax(str, str2, str3, str4), "");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply", "(Lid/dana/data/toggle/traffictype/BaseTrafficType;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<getRequestMainPackage, Boolean> {
        public static final setMax INSTANCE = new setMax();

        setMax() {
        }

        public final Boolean apply(@NotNull getRequestMainPackage getrequestmainpackage) {
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            return Boolean.valueOf(getRequestMainPackage.getMax(getrequestmainpackage, "feature_miniprogram_map_utility", false, 6));
        }
    }

    private final boolean isFeatureEnabled() {
        UpdateAppCallback updateAppCallback = this.splitFacade;
        if (updateAppCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("splitFacade");
        }
        R blockingFirst = getMinimumFontSize.timeoutForFirstEmit(updateAppCallback.setMin.length(), 10000).map(setMax.INSTANCE).onErrorReturnItem(Boolean.FALSE).blockingFirst();
        Intrinsics.checkNotNullExpressionValue(blockingFirst, "splitFacade.trafficTypeU…         .blockingFirst()");
        return ((Boolean) blockingFirst).booleanValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lid/dana/danah5/locationpicker/MapsUtilityBridge$Companion;", "", "()V", "CURRENT_LOCATION", "", "ERROR_CODE_FEATURE_DISABLED", "ERROR_CODE_MISSING_EVENT", "ERROR_CODE_MISSING_INFO", "ERROR_CODE_MISSING_TITLE", "ERROR_CODE_NOT_SUPPORTED", "ERROR_CODE_PICK_LOCATION_CANCELLED_BY_USER", "PICK_LOCATION", "REQUEST_CODE_PICK_LOCATION", "", "getREQUEST_CODE_PICK_LOCATION", "()I", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getREQUEST_CODE_PICK_LOCATION() {
            return MapsUtilityBridge.REQUEST_CODE_PICK_LOCATION;
        }
    }

    public final void onReceiveActivityResult(@NotNull BaseBridge.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "event");
        if (setmin.getMax == REQUEST_CODE_PICK_LOCATION) {
            if (setmin.getMin == -1) {
                Intent intent = setmin.length;
                MiniProgramLocationPickerActivity.Place place = intent != null ? (MiniProgramLocationPickerActivity.Place) intent.getParcelableExtra("result") : null;
                Intrinsics.checkNotNull(place);
                Intrinsics.checkNotNullExpressionValue(place, "event.data?.getParcelabl….EXTRA_LOCATION_RESULT)!!");
                Object json = JSON.toJSON(assamblePickLocationInfo(String.valueOf(place.getLocation().getLatitude()), String.valueOf(place.getLocation().getLongitude()), place.getName(), place.getAddress()));
                if (json != null) {
                    JSONObject jSONObject = (JSONObject) json;
                    BridgeCallback bridgeCallback2 = this.bridgeCallback;
                    if (bridgeCallback2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
                    }
                    bridgeCallback2.sendJSONResponse(jSONObject);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
            BridgeCallback bridgeCallback3 = this.bridgeCallback;
            if (bridgeCallback3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
            }
            setErrorCodeResult(bridgeCallback3, ERROR_CODE_PICK_LOCATION_CANCELLED_BY_USER);
        }
    }
}
