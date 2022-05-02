package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/domain/nearbyme/model/MerchantAdditionalInfo;", "", "bizInfo", "", "infoContent", "(Ljava/lang/String;Ljava/lang/String;)V", "getBizInfo", "()Ljava/lang/String;", "getInfoContent", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getIMEIEncrypt {
    @NotNull
    private final String bizInfo;
    @NotNull
    private final String infoContent;

    public static /* synthetic */ getIMEIEncrypt copy$default(getIMEIEncrypt getimeiencrypt, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getimeiencrypt.bizInfo;
        }
        if ((i & 2) != 0) {
            str2 = getimeiencrypt.infoContent;
        }
        return getimeiencrypt.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.bizInfo;
    }

    @NotNull
    public final String component2() {
        return this.infoContent;
    }

    @NotNull
    public final getIMEIEncrypt copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "bizInfo");
        Intrinsics.checkNotNullParameter(str2, "infoContent");
        return new getIMEIEncrypt(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getIMEIEncrypt)) {
            return false;
        }
        getIMEIEncrypt getimeiencrypt = (getIMEIEncrypt) obj;
        return Intrinsics.areEqual((Object) this.bizInfo, (Object) getimeiencrypt.bizInfo) && Intrinsics.areEqual((Object) this.infoContent, (Object) getimeiencrypt.infoContent);
    }

    public final int hashCode() {
        String str = this.bizInfo;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.infoContent;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantAdditionalInfo(bizInfo=");
        sb.append(this.bizInfo);
        sb.append(", infoContent=");
        sb.append(this.infoContent);
        sb.append(")");
        return sb.toString();
    }

    public getIMEIEncrypt(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "bizInfo");
        Intrinsics.checkNotNullParameter(str2, "infoContent");
        this.bizInfo = str;
        this.infoContent = str2;
    }

    @NotNull
    public final String getBizInfo() {
        return this.bizInfo;
    }

    @NotNull
    public final String getInfoContent() {
        return this.infoContent;
    }
}
