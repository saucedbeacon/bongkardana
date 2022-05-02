package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lid/dana/openbankaccount/model/ConfigBankAccountModel;", "", "enable", "", "listBankUrl", "", "verifyUrl", "confirmUrl", "bannerUrl", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBannerUrl", "()Ljava/lang/String;", "getConfirmUrl", "getEnable", "()Z", "getListBankUrl", "getVerifyUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class sendUserDenyCallback {
    @NotNull
    public final String getMax;
    private final boolean getMin;
    @NotNull
    public final String length;
    @NotNull
    public final String setMax;
    @NotNull
    public final String setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sendUserDenyCallback)) {
            return false;
        }
        sendUserDenyCallback senduserdenycallback = (sendUserDenyCallback) obj;
        return this.getMin == senduserdenycallback.getMin && Intrinsics.areEqual((Object) this.setMin, (Object) senduserdenycallback.setMin) && Intrinsics.areEqual((Object) this.getMax, (Object) senduserdenycallback.getMax) && Intrinsics.areEqual((Object) this.length, (Object) senduserdenycallback.length) && Intrinsics.areEqual((Object) this.setMax, (Object) senduserdenycallback.setMax);
    }

    public final int hashCode() {
        boolean z = this.getMin;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.setMin;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.getMax;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.length;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.setMax;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigBankAccountModel(enable=");
        sb.append(this.getMin);
        sb.append(", listBankUrl=");
        sb.append(this.setMin);
        sb.append(", verifyUrl=");
        sb.append(this.getMax);
        sb.append(", confirmUrl=");
        sb.append(this.length);
        sb.append(", bannerUrl=");
        sb.append(this.setMax);
        sb.append(")");
        return sb.toString();
    }

    public sendUserDenyCallback(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "listBankUrl");
        Intrinsics.checkNotNullParameter(str2, "verifyUrl");
        Intrinsics.checkNotNullParameter(str3, "confirmUrl");
        Intrinsics.checkNotNullParameter(str4, "bannerUrl");
        this.getMin = z;
        this.setMin = str;
        this.getMax = str2;
        this.length = str3;
        this.setMax = str4;
    }

    public final boolean length() {
        return this.getMin;
    }
}
