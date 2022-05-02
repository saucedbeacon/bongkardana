package id.dana.danah5.bottomsheet;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.env.GriverEnv;
import id.dana.DanaApplication;
import id.dana.di.modules.GContainerModule;
import id.dana.lib.gcontainer.app.bridge.core.BaseBridge;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.PrepareException;
import o.getCancelListeners$core;
import o.saveSnapshot;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J4\u0010\t\u001a\u00020\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"Lid/dana/danah5/bottomsheet/BottomSheetBridge;", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge;", "()V", "servicesBottomSheetManager", "Lid/dana/danah5/bottomsheet/service/ServicesBottomSheetManager;", "getServicesBottomSheetManager", "()Lid/dana/danah5/bottomsheet/service/ServicesBottomSheetManager;", "setServicesBottomSheetManager", "(Lid/dana/danah5/bottomsheet/service/ServicesBottomSheetManager;)V", "bottomSheet", "", "eventName", "", "info", "Lcom/alibaba/fastjson/JSONObject;", "page", "Lcom/alibaba/ariver/app/api/Page;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "onFinalized", "onInitialized", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BottomSheetBridge extends BaseBridge {
    @NotNull
    public static final setMax Companion = new setMax((DefaultConstructorMarker) null);
    @NotNull
    public static final String EVENT_NAME_SERVICES = "services";
    @Inject
    public getCancelListeners$core servicesBottomSheetManager;

    @NotNull
    public final getCancelListeners$core getServicesBottomSheetManager() {
        getCancelListeners$core getcancellisteners_core = this.servicesBottomSheetManager;
        if (getcancellisteners_core == null) {
            Intrinsics.throwUninitializedPropertyAccessException("servicesBottomSheetManager");
        }
        return getcancellisteners_core;
    }

    public final void setServicesBottomSheetManager(@NotNull getCancelListeners$core getcancellisteners_core) {
        Intrinsics.checkNotNullParameter(getcancellisteners_core, "<set-?>");
        this.servicesBottomSheetManager = getcancellisteners_core;
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
                getmax.getMin().length(this);
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }

    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter(canOverride = false)
    public final void bottomSheet(@Nullable @BindingParam(name = {"event"}) String str, @Nullable @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingNode(Page.class) Page page, @NotNull @BindingCallback BridgeCallback bridgeCallback) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        if (Intrinsics.areEqual((Object) str, (Object) "services")) {
            getCancelListeners$core getcancellisteners_core = this.servicesBottomSheetManager;
            if (getcancellisteners_core == null) {
                Intrinsics.throwUninitializedPropertyAccessException("servicesBottomSheetManager");
            }
            Intrinsics.checkNotNullParameter(page, "$this$activity");
            PageContext pageContext = page.getPageContext();
            Context context = null;
            Context activity = pageContext != null ? pageContext.getActivity() : null;
            if (activity instanceof FragmentActivity) {
                context = activity;
            }
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            if (fragmentActivity != null) {
                getcancellisteners_core.showServicesBottomSheetDialog(fragmentActivity, jSONObject, bridgeCallback);
            }
        }
    }

    public final void onFinalized() {
        getCancelListeners$core getcancellisteners_core = this.servicesBottomSheetManager;
        if (getcancellisteners_core == null) {
            Intrinsics.throwUninitializedPropertyAccessException("servicesBottomSheetManager");
        }
        getcancellisteners_core.dismissBottomSheetDialog();
        super.onFinalized();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/danah5/bottomsheet/BottomSheetBridge$Companion;", "", "()V", "EVENT_NAME_SERVICES", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
