package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.jvm.internal.Intrinsics;
import o.BridgeDispatcher;
import o.DialogRecyclerView;
import o.NativePermissionExtensionInvoker;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;

public final class BindBridgeExtensionInvoker implements getAdapterPosition<BridgeDispatcher.AnonymousClass1> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public BindBridgeExtensionInvoker(b.C0007b<PluginInstallCallback> bVar, b.C0007b<Context> bVar2) {
        this.serializerProvider = bVar;
        this.contextProvider = bVar2;
    }

    public final BridgeDispatcher.AnonymousClass1 get() {
        return newInstance(this.serializerProvider.get(), this.contextProvider.get());
    }

    public static BindBridgeExtensionInvoker create(b.C0007b<PluginInstallCallback> bVar, b.C0007b<Context> bVar2) {
        return new BindBridgeExtensionInvoker(bVar, bVar2);
    }

    public static BridgeDispatcher.AnonymousClass1 newInstance(PluginInstallCallback pluginInstallCallback, Context context) {
        return new ResourceSourceType(pluginInstallCallback, context) {
            @NotNull
            private final Context context;
            @NotNull
            private final PluginInstallCallback serializer;

            {
                Intrinsics.checkNotNullParameter(r2, "serializer");
                Intrinsics.checkNotNullParameter(r3, HummerConstants.CONTEXT);
                this.serializer = r2;
                this.context = r3;
            }

            @NotNull
            public final PluginInstallCallback getSerializer() {
                return this.serializer;
            }

            @NotNull
            public final Context getContext() {
                return this.context;
            }

            @NotNull
            public final TitleBarRightButtonView.AnonymousClass1<NativePermissionExtensionInvoker.AnonymousClass1> getInfoList() {
                TitleBarRightButtonView.AnonymousClass1<NativePermissionExtensionInvoker.AnonymousClass1> just = TitleBarRightButtonView.AnonymousClass1.just(this.serializer.deserialize(getAppInfoQuery.jsonRawToString(this.context, DialogRecyclerView.length.toFloatRange), NativePermissionExtensionInvoker.AnonymousClass1.class));
                Intrinsics.checkNotNullExpressionValue(just, "Observable.just(serializ…countResult::class.java))");
                return just;
            }
        };
    }
}
