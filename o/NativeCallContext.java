package o;

import android.content.Context;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantDetailInfoResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "shopInfo", "Lid/dana/data/nearbyme/model/ShopEntity;", "(Lid/dana/data/nearbyme/model/ShopEntity;)V", "getShopInfo", "()Lid/dana/data/nearbyme/model/ShopEntity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NativeCallContext extends BaseRpcResult {
    @NotNull
    private final Render shopInfo;

    public static /* synthetic */ NativeCallContext copy$default(NativeCallContext nativeCallContext, Render render, int i, Object obj) {
        if ((i & 1) != 0) {
            render = nativeCallContext.shopInfo;
        }
        return nativeCallContext.copy(render);
    }

    @NotNull
    public final Render component1() {
        return this.shopInfo;
    }

    @NotNull
    public final NativeCallContext copy(@NotNull Render render) {
        Intrinsics.checkNotNullParameter(render, "shopInfo");
        return new NativeCallContext(render);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof NativeCallContext) && Intrinsics.areEqual((Object) this.shopInfo, (Object) ((NativeCallContext) obj).shopInfo);
        }
        return true;
    }

    public final int hashCode() {
        Render render = this.shopInfo;
        if (render != null) {
            return render.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantDetailInfoResult(shopInfo=");
        sb.append(this.shopInfo);
        sb.append(")");
        return sb.toString();
    }

    public final class StatData implements getAdapterPosition<dispatcherOnWorkerThread> {
        private final b.C0007b<TabBarItemColorModel> networkNearbyPlaceEntityDataProvider;

        public StatData(b.C0007b<TabBarItemColorModel> bVar) {
            this.networkNearbyPlaceEntityDataProvider = bVar;
        }

        public final dispatcherOnWorkerThread get() {
            return newInstance(this.networkNearbyPlaceEntityDataProvider.get());
        }

        public static StatData create(b.C0007b<TabBarItemColorModel> bVar) {
            return new StatData(bVar);
        }

        public static dispatcherOnWorkerThread newInstance(TabBarItemColorModel tabBarItemColorModel) {
            return new dispatcherOnWorkerThread(tabBarItemColorModel);
        }
    }

    public final class Builder implements getAdapterPosition<setCallMode> {
        private final b.C0007b<Context> contextProvider;
        private final b.C0007b<PluginInstallCallback> serializerProvider;

        public Builder(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
            this.contextProvider = bVar;
            this.serializerProvider = bVar2;
        }

        public final setCallMode get() {
            return newInstance(this.contextProvider.get(), this.serializerProvider.get());
        }

        public static Builder create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
            return new Builder(bVar, bVar2);
        }

        public static setCallMode newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
            return new setCallMode(context, pluginInstallCallback);
        }
    }

    @NotNull
    public final Render getShopInfo() {
        return this.shopInfo;
    }

    public NativeCallContext(@NotNull Render render) {
        Intrinsics.checkNotNullParameter(render, "shopInfo");
        this.shopInfo = render;
    }
}
