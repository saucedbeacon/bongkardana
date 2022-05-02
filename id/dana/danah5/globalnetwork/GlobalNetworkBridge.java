package id.dana.danah5.globalnetwork;

import android.app.Application;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.griver.base.common.env.GriverEnv;
import id.dana.DanaApplication;
import id.dana.danah5.globalnetwork.model.request.InquiryForexRateEntity;
import id.dana.di.modules.GContainerModule;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.PrepareException;
import o.maxWidth;
import o.saveSnapshot;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lid/dana/danah5/globalnetwork/GlobalNetworkBridge;", "Lcom/alibaba/ariver/kernel/api/extension/bridge/SimpleBridgeExtension;", "()V", "globalNetworkPluginManager", "Lid/dana/danah5/globalnetwork/manager/GlobalNetworkPluginManager;", "getGlobalNetworkPluginManager", "()Lid/dana/danah5/globalnetwork/manager/GlobalNetworkPluginManager;", "setGlobalNetworkPluginManager", "(Lid/dana/danah5/globalnetwork/manager/GlobalNetworkPluginManager;)V", "forex", "", "eventName", "", "info", "Lcom/alibaba/fastjson/JSONObject;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "onInitialized", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GlobalNetworkBridge extends SimpleBridgeExtension {
    @NotNull
    public static final String BOTTOM_SHEET = "bottomSheet";
    @NotNull
    public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
    @NotNull
    public static final String GET_FOREX_BALANCE = "balance";
    @NotNull
    public static final String INQUIRY_FOREX_RATE = "rate";
    @Inject
    public maxWidth globalNetworkPluginManager;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"id/dana/lib/gcontainer/extension/JSONExtKt$toObject$1", "Lcom/alibaba/fastjson/TypeReference;", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends TypeReference<InquiryForexRateEntity> {
    }

    @NotNull
    public final maxWidth getGlobalNetworkPluginManager() {
        maxWidth maxwidth = this.globalNetworkPluginManager;
        if (maxwidth == null) {
            Intrinsics.throwUninitializedPropertyAccessException("globalNetworkPluginManager");
        }
        return maxwidth;
    }

    public final void setGlobalNetworkPluginManager(@NotNull maxWidth maxwidth) {
        Intrinsics.checkNotNullParameter(maxwidth, "<set-?>");
        this.globalNetworkPluginManager = maxwidth;
    }

    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter(canOverride = false)
    public final void forex(@NotNull @BindingParam(name = {"event"}) String str, @Nullable @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback) {
        Intrinsics.checkNotNullParameter(str, IpcMessageConstants.EXTRA_EVENT);
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        int hashCode = str.hashCode();
        if (hashCode != -339185956) {
            if (hashCode == 3493088 && str.equals("rate")) {
                maxWidth maxwidth = this.globalNetworkPluginManager;
                if (maxwidth == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("globalNetworkPluginManager");
                }
                if (jSONObject != null) {
                    Object obj = null;
                    try {
                        obj = JSONObject.parseObject(jSONObject.toJSONString(), new setMax(), new Feature[0]);
                    } catch (JSONException | NullPointerException unused) {
                    }
                    InquiryForexRateEntity inquiryForexRateEntity = (InquiryForexRateEntity) obj;
                    if (inquiryForexRateEntity != null) {
                        maxwidth.inquiryForexRate(bridgeCallback, inquiryForexRateEntity);
                    }
                }
            }
        } else if (str.equals("balance")) {
            maxWidth maxwidth2 = this.globalNetworkPluginManager;
            if (maxwidth2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("globalNetworkPluginManager");
            }
            maxwidth2.getForexBalance(bridgeCallback);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/danah5/globalnetwork/GlobalNetworkBridge$Companion;", "", "()V", "BOTTOM_SHEET", "", "GET_FOREX_BALANCE", "INQUIRY_FOREX_RATE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
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
                getmax.getMin().setMax(this);
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }
}
