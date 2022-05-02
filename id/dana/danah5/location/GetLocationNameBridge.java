package id.dana.danah5.location;

import android.app.Application;
import android.location.Location;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.env.GriverEnv;
import id.dana.DanaApplication;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.GContainerModule;
import id.dana.lib.gcontainer.app.bridge.core.BaseBridge;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GriverAppVirtualHostProxy;
import o.PrepareException;
import o.onEmbedViewParamChanged;
import o.onUpdateResult;
import o.saveSnapshot;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001e\u0010\u000e\u001a\u00020\u000f2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lid/dana/danah5/location/GetLocationNameBridge;", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge;", "()V", "getIndoSubdivisionsByLocation", "Lid/dana/domain/geocode/interactor/GetIndoSubdivisionsByLocation;", "getGetIndoSubdivisionsByLocation", "()Lid/dana/domain/geocode/interactor/GetIndoSubdivisionsByLocation;", "setGetIndoSubdivisionsByLocation", "(Lid/dana/domain/geocode/interactor/GetIndoSubdivisionsByLocation;)V", "createObserver", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/geocode/model/IndoSubdivisions;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "locationName", "", "info", "Lcom/alibaba/fastjson/JSONObject;", "onFinalized", "onInitialized", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GetLocationNameBridge extends BaseBridge {
    @NotNull
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    @NotNull
    public static final String PARAM_KEY_LATITUDE = "lat";
    @NotNull
    public static final String PARAM_KEY_LONGITUTE = "long";
    @NotNull
    public static final String PARAM_KEY_SOURCE = "source";
    @NotNull
    public static final String RESPONSE_KEY_DATA = "data";
    @Inject
    public onEmbedViewParamChanged getIndoSubdivisionsByLocation;

    @NotNull
    public final onEmbedViewParamChanged getGetIndoSubdivisionsByLocation() {
        onEmbedViewParamChanged onembedviewparamchanged = this.getIndoSubdivisionsByLocation;
        if (onembedviewparamchanged == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getIndoSubdivisionsByLocation");
        }
        return onembedviewparamchanged;
    }

    public final void setGetIndoSubdivisionsByLocation(@NotNull onEmbedViewParamChanged onembedviewparamchanged) {
        Intrinsics.checkNotNullParameter(onembedviewparamchanged, "<set-?>");
        this.getIndoSubdivisionsByLocation = onembedviewparamchanged;
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
                getmax.getMin().getMax(this);
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }

    public final void onFinalized() {
        onEmbedViewParamChanged onembedviewparamchanged = this.getIndoSubdivisionsByLocation;
        if (onembedviewparamchanged == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getIndoSubdivisionsByLocation");
        }
        onembedviewparamchanged.dispose();
        super.onFinalized();
    }

    @ThreadType(ExecutorType.NETWORK)
    @ActionFilter(canOverride = false)
    public final void locationName(@Nullable @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback) {
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        if (jSONObject != null) {
            CharSequence string = jSONObject.getString("lat");
            boolean z = false;
            if (!(string == null || string.length() == 0)) {
                CharSequence string2 = jSONObject.getString("long");
                if (!(string2 == null || string2.length() == 0)) {
                    z = true;
                }
            }
            if (!z) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                String string3 = jSONObject.getString("lat");
                String string4 = jSONObject.getString("long");
                onEmbedViewParamChanged onembedviewparamchanged = this.getIndoSubdivisionsByLocation;
                if (onembedviewparamchanged == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("getIndoSubdivisionsByLocation");
                }
                onEmbedViewParamChanged.setMax.getMin getmin = onEmbedViewParamChanged.setMax.Companion;
                Intrinsics.checkNotNullExpressionValue(string3, "lat");
                double parseDouble = Double.parseDouble(string3);
                Intrinsics.checkNotNullExpressionValue(string4, "lng");
                double parseDouble2 = Double.parseDouble(string4);
                Location location = new Location("");
                location.setLatitude(parseDouble);
                location.setLongitude(parseDouble2);
                Intrinsics.checkNotNullExpressionValue(location, "LocationUtil.latLonToLoc…Double(), lng.toDouble())");
                onembedviewparamchanged.execute(createObserver(bridgeCallback), onEmbedViewParamChanged.setMax.getMin.forLocation$default(getmin, location, false, false, 6, (Object) null));
                return;
            }
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/danah5/location/GetLocationNameBridge$createObserver$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/geocode/model/IndoSubdivisions;", "onError", "", "e", "", "onNext", "indoSubdivisions", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length extends GriverAppVirtualHostProxy<onUpdateResult> {
        final /* synthetic */ BridgeCallback $bridgeCallback;

        length(BridgeCallback bridgeCallback) {
            this.$bridgeCallback = bridgeCallback;
        }

        public final void onNext(@NotNull onUpdateResult onupdateresult) {
            Intrinsics.checkNotNullParameter(onupdateresult, "indoSubdivisions");
            JSONObject jSONObject = BridgeResponse.SUCCESS.get();
            jSONObject.put("data", (Object) onupdateresult);
            this.$bridgeCallback.sendJSONResponse(jSONObject);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.$bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(' ');
            sb.append(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.JS_BRIDGE_TAG, sb.toString(), th);
        }
    }

    private final GriverAppVirtualHostProxy<onUpdateResult> createObserver(BridgeCallback bridgeCallback) {
        return new length(bridgeCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/danah5/location/GetLocationNameBridge$Companion;", "", "()V", "PARAM_KEY_LATITUDE", "", "PARAM_KEY_LONGITUTE", "PARAM_KEY_SOURCE", "RESPONSE_KEY_DATA", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
