package o;

import android.content.Intent;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import kotlin.jvm.internal.Intrinsics;
import o.TabBarBridgeExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class create {
    @Nullable
    public setBarBottomLineColor getMax;
    @NotNull
    public Intent getMin;
    @Nullable
    public WindowBridgeExtension length;
    @Nullable
    public TabBarBridgeExtension.AnonymousClass2 setMax;
    @Nullable
    public hideOptionMenu setMin;

    public create(@NotNull Intent intent, @Nullable hideOptionMenu hideoptionmenu, @Nullable setBarBottomLineColor setbarbottomlinecolor, @Nullable WindowBridgeExtension windowBridgeExtension, @Nullable TabBarBridgeExtension.AnonymousClass2 r6) {
        Intrinsics.checkNotNullParameter(intent, IpcMessageConstants.EXTRA_INTENT);
        this.getMin = intent;
        this.setMin = hideoptionmenu;
        this.getMax = setbarbottomlinecolor;
        this.length = windowBridgeExtension;
        this.setMax = r6;
    }
}
