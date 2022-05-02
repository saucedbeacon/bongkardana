package id.dana.globalsearch.onlinemerchant.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\tJ\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0010"}, d2 = {"Lid/dana/globalsearch/onlinemerchant/model/OnlineMerchantInfoModel;", "", "isOauth", "", "(Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lid/dana/globalsearch/onlinemerchant/model/OnlineMerchantInfoModel;", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class OnlineMerchantInfoModel {
    @Nullable
    private final Boolean isOauth;

    public static /* synthetic */ OnlineMerchantInfoModel copy$default(OnlineMerchantInfoModel onlineMerchantInfoModel, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = onlineMerchantInfoModel.isOauth;
        }
        return onlineMerchantInfoModel.copy(bool);
    }

    @Nullable
    public final Boolean component1() {
        return this.isOauth;
    }

    @NotNull
    public final OnlineMerchantInfoModel copy(@Nullable Boolean bool) {
        return new OnlineMerchantInfoModel(bool);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof OnlineMerchantInfoModel) && Intrinsics.areEqual((Object) this.isOauth, (Object) ((OnlineMerchantInfoModel) obj).isOauth);
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.isOauth;
        if (bool != null) {
            return bool.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("OnlineMerchantInfoModel(isOauth=");
        sb.append(this.isOauth);
        sb.append(")");
        return sb.toString();
    }

    public OnlineMerchantInfoModel(@Nullable Boolean bool) {
        this.isOauth = bool;
    }

    @Nullable
    public final Boolean isOauth() {
        return this.isOauth;
    }
}
