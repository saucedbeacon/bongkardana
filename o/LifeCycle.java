package o;

import id.dana.nearbyme.model.ShopModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lid/dana/nearbyrevamp/model/MerchantDetailInfoModel;", "", "viewType", "", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "merchantDetailConfig", "Lid/dana/domain/nearbyme/model/MerchantDetailConfig;", "(ILid/dana/nearbyme/model/ShopModel;Lid/dana/domain/nearbyme/model/MerchantDetailConfig;)V", "getMerchantDetailConfig", "()Lid/dana/domain/nearbyme/model/MerchantDetailConfig;", "setMerchantDetailConfig", "(Lid/dana/domain/nearbyme/model/MerchantDetailConfig;)V", "getShopModel", "()Lid/dana/nearbyme/model/ShopModel;", "setShopModel", "(Lid/dana/nearbyme/model/ShopModel;)V", "getViewType", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class LifeCycle {
    @NotNull
    public static final setMax length = new setMax((byte) 0);
    public final int getMax;
    @Nullable
    public getSerialNumberEncrypt setMax;
    @Nullable
    public ShopModel setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LifeCycle)) {
            return false;
        }
        LifeCycle lifeCycle = (LifeCycle) obj;
        return this.getMax == lifeCycle.getMax && Intrinsics.areEqual((Object) this.setMin, (Object) lifeCycle.setMin) && Intrinsics.areEqual((Object) this.setMax, (Object) lifeCycle.setMax);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantDetailInfoModel(viewType=");
        sb.append(this.getMax);
        sb.append(", shopModel=");
        sb.append(this.setMin);
        sb.append(", merchantDetailConfig=");
        sb.append(this.setMax);
        sb.append(")");
        return sb.toString();
    }

    public LifeCycle(int i, @Nullable ShopModel shopModel, @Nullable getSerialNumberEncrypt getserialnumberencrypt) {
        this.getMax = i;
        this.setMin = shopModel;
        this.setMax = getserialnumberencrypt;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LifeCycle(int i, ShopModel shopModel, int i2) {
        this(i, (i2 & 2) != 0 ? null : shopModel, (getSerialNumberEncrypt) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/nearbyrevamp/model/MerchantDetailInfoModel$Companion;", "", "()V", "MERCHANT_BASIC_INFO_ACTION", "", "MERCHANT_BASIC_INFO_ITEM", "MERCHANT_BASIC_INFO_SEE_MORE", "MERCHANT_BASIC_INFO_SHIMMER", "createAction", "Lid/dana/nearbyrevamp/model/MerchantDetailInfoModel;", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "merchantDetailConfig", "Lid/dana/domain/nearbyme/model/MerchantDetailConfig;", "createItem", "createSeeMore", "createShimmer", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public final int hashCode() {
        int hashCode = Integer.valueOf(this.getMax).hashCode() * 31;
        ShopModel shopModel = this.setMin;
        int i = 0;
        int hashCode2 = (hashCode + (shopModel != null ? shopModel.hashCode() : 0)) * 31;
        getSerialNumberEncrypt getserialnumberencrypt = this.setMax;
        if (getserialnumberencrypt != null) {
            i = getserialnumberencrypt.hashCode();
        }
        return hashCode2 + i;
    }
}
