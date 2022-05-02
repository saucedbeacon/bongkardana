package id.dana.lib.gcontainer.app.bridge.subapp;

import android.os.Bundle;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.WindowBridgeExtension;
import o.closeCurrentWindow;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/subapp/CallSubAppBridge;", "Lcom/alibaba/ariver/kernel/api/extension/bridge/SimpleBridgeExtension;", "()V", "callSubApp", "", "url", "", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public final class CallSubAppBridge extends SimpleBridgeExtension {
    @ThreadType(ExecutorType.UI)
    @ActionFilter(canOverride = false)
    public final void callSubApp(@NotNull @BindingParam(name = {"url"}) String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        WindowBridgeExtension.AnonymousClass1.setMin(str, (Bundle) null, (closeCurrentWindow) null, 14);
    }
}
