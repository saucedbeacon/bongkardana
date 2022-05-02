package id.dana.danah5.getonlineconfig;

import android.app.Application;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.env.GriverEnv;
import id.dana.DanaApplication;
import id.dana.di.modules.GContainerModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GriverAmcsConfig;
import o.GriverAppVirtualHostProxy;
import o.PrepareException;
import o.noAutoDismiss;
import o.saveSnapshot;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001c\u0010\u000f\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lid/dana/danah5/getonlineconfig/GetOnlineConfigBridge;", "Lcom/alibaba/ariver/kernel/api/extension/bridge/SimpleBridgeExtension;", "()V", "getH5OnlineConfig", "Lid/dana/domain/h5onlineconfig/GetH5OnlineConfig;", "getGetH5OnlineConfig", "()Lid/dana/domain/h5onlineconfig/GetH5OnlineConfig;", "setGetH5OnlineConfig", "(Lid/dana/domain/h5onlineconfig/GetH5OnlineConfig;)V", "fetchOnlineConfigData", "", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "info", "Lcom/alibaba/fastjson/JSONObject;", "getOnlineConfig", "isValidInput", "", "onFinalized", "onInitialized", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GetOnlineConfigBridge extends SimpleBridgeExtension {
    @NotNull
    public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
    private static final String NAMES = "names";
    private static final String SECTION = "section";
    @Inject
    public GriverAmcsConfig.AnonymousClass2 getH5OnlineConfig;

    @NotNull
    public final GriverAmcsConfig.AnonymousClass2 getGetH5OnlineConfig() {
        GriverAmcsConfig.AnonymousClass2 r0 = this.getH5OnlineConfig;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getH5OnlineConfig");
        }
        return r0;
    }

    public final void setGetH5OnlineConfig(@NotNull GriverAmcsConfig.AnonymousClass2 r2) {
        Intrinsics.checkNotNullParameter(r2, "<set-?>");
        this.getH5OnlineConfig = r2;
    }

    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter(canOverride = false)
    public final void getOnlineConfig(@NotNull @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback) {
        Intrinsics.checkNotNullParameter(jSONObject, "info");
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        if (isValidInput(bridgeCallback, jSONObject)) {
            fetchOnlineConfigData(bridgeCallback, jSONObject);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/danah5/getonlineconfig/GetOnlineConfigBridge$fetchOnlineConfigData$1", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "e", "", "onNext", "result", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends GriverAppVirtualHostProxy<String> {
        final /* synthetic */ BridgeCallback $bridgeCallback;
        final /* synthetic */ GetOnlineConfigBridge this$0;

        getMin(GetOnlineConfigBridge getOnlineConfigBridge, BridgeCallback bridgeCallback) {
            this.this$0 = getOnlineConfigBridge;
            this.$bridgeCallback = bridgeCallback;
        }

        public final void onNext(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "result");
            this.$bridgeCallback.sendJSONResponse(noAutoDismiss.handleSuccess(str));
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.$bridgeCallback.sendJSONResponse(noAutoDismiss.handleError("001"));
            this.this$0.getGetH5OnlineConfig().dispose();
        }
    }

    private final void fetchOnlineConfigData(BridgeCallback bridgeCallback, JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray(NAMES);
        Intrinsics.checkNotNullExpressionValue(jSONArray, "info.getJSONArray(NAMES)");
        Iterable<Object> iterable = jSONArray;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Object obj : iterable) {
            arrayList.add(obj.toString());
        }
        Set set = CollectionsKt.toSet((List) arrayList);
        GriverAmcsConfig.AnonymousClass2 r1 = this.getH5OnlineConfig;
        if (r1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getH5OnlineConfig");
        }
        r1.execute(new getMin(this, bridgeCallback), GriverAmcsConfig.AnonymousClass2.getMin.forGetOnlineConfig(jSONObject.getString(SECTION), set));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020 A[Catch:{ NullPointerException -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a A[Catch:{ NullPointerException -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003a A[Catch:{ NullPointerException -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0042 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean isValidInput(com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r5, com.alibaba.fastjson.JSONObject r6) {
        /*
            r4 = this;
            java.lang.String r0 = "003"
            r1 = 0
            java.lang.String r2 = "section"
            java.lang.String r2 = r6.getString(r2)     // Catch:{ NullPointerException -> 0x0043 }
            java.lang.String r3 = "names"
            com.alibaba.fastjson.JSONArray r6 = r6.getJSONArray(r3)     // Catch:{ NullPointerException -> 0x0043 }
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ NullPointerException -> 0x0043 }
            r3 = 1
            if (r2 == 0) goto L_0x001d
            boolean r2 = kotlin.text.StringsKt.isBlank(r2)     // Catch:{ NullPointerException -> 0x0043 }
            if (r2 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r2 = 0
            goto L_0x001e
        L_0x001d:
            r2 = 1
        L_0x001e:
            if (r2 == 0) goto L_0x002a
            java.lang.String r6 = "002"
            com.alibaba.fastjson.JSONObject r6 = o.noAutoDismiss.handleError(r6)     // Catch:{ NullPointerException -> 0x0043 }
            r5.sendJSONResponse(r6)     // Catch:{ NullPointerException -> 0x0043 }
            return r1
        L_0x002a:
            java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ NullPointerException -> 0x0043 }
            if (r6 == 0) goto L_0x0037
            boolean r6 = r6.isEmpty()     // Catch:{ NullPointerException -> 0x0043 }
            if (r6 == 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r6 = 0
            goto L_0x0038
        L_0x0037:
            r6 = 1
        L_0x0038:
            if (r6 == 0) goto L_0x0042
            com.alibaba.fastjson.JSONObject r6 = o.noAutoDismiss.handleError(r0)     // Catch:{ NullPointerException -> 0x0043 }
            r5.sendJSONResponse(r6)     // Catch:{ NullPointerException -> 0x0043 }
            return r1
        L_0x0042:
            return r3
        L_0x0043:
            com.alibaba.fastjson.JSONObject r6 = o.noAutoDismiss.handleError(r0)
            r5.sendJSONResponse(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.danah5.getonlineconfig.GetOnlineConfigBridge.isValidInput(com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback, com.alibaba.fastjson.JSONObject):boolean");
    }

    public final void onFinalized() {
        GriverAmcsConfig.AnonymousClass2 r0 = this.getH5OnlineConfig;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getH5OnlineConfig");
        }
        r0.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/danah5/getonlineconfig/GetOnlineConfigBridge$Companion;", "", "()V", "NAMES", "", "SECTION", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void onInitialized() {
        saveSnapshot.getMax getmax = new saveSnapshot.getMax((byte) 0);
        Application applicationContext = GriverEnv.getApplicationContext();
        if (applicationContext != null) {
            PrepareException.AnonymousClass1 applicationComponent = ((DanaApplication) applicationContext).getApplicationComponent();
            if (applicationComponent != null) {
                getmax.setMin = applicationComponent;
                getmax.getMin = new GContainerModule();
                getmax.getMin().getMin(this);
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }
}
