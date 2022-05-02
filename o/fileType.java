package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lid/dana/domain/openbankaccount/model/ConfigBankAccount;", "", "enable", "", "listBankUrl", "", "verifyUrl", "confirmUrl", "bannerUrl", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBannerUrl", "()Ljava/lang/String;", "getConfirmUrl", "getEnable", "()Z", "getListBankUrl", "getVerifyUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class fileType {
    @NotNull
    private final String bannerUrl;
    @NotNull
    private final String confirmUrl;
    private final boolean enable;
    @NotNull
    private final String listBankUrl;
    @NotNull
    private final String verifyUrl;

    public static /* synthetic */ fileType copy$default(fileType filetype, boolean z, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = filetype.enable;
        }
        if ((i & 2) != 0) {
            str = filetype.listBankUrl;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = filetype.verifyUrl;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = filetype.confirmUrl;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = filetype.bannerUrl;
        }
        return filetype.copy(z, str5, str6, str7, str4);
    }

    public final boolean component1() {
        return this.enable;
    }

    @NotNull
    public final String component2() {
        return this.listBankUrl;
    }

    @NotNull
    public final String component3() {
        return this.verifyUrl;
    }

    @NotNull
    public final String component4() {
        return this.confirmUrl;
    }

    @NotNull
    public final String component5() {
        return this.bannerUrl;
    }

    @NotNull
    public final fileType copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "listBankUrl");
        Intrinsics.checkNotNullParameter(str2, "verifyUrl");
        Intrinsics.checkNotNullParameter(str3, "confirmUrl");
        Intrinsics.checkNotNullParameter(str4, "bannerUrl");
        return new fileType(z, str, str2, str3, str4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fileType)) {
            return false;
        }
        fileType filetype = (fileType) obj;
        return this.enable == filetype.enable && Intrinsics.areEqual((Object) this.listBankUrl, (Object) filetype.listBankUrl) && Intrinsics.areEqual((Object) this.verifyUrl, (Object) filetype.verifyUrl) && Intrinsics.areEqual((Object) this.confirmUrl, (Object) filetype.confirmUrl) && Intrinsics.areEqual((Object) this.bannerUrl, (Object) filetype.bannerUrl);
    }

    public final int hashCode() {
        boolean z = this.enable;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.listBankUrl;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.verifyUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.confirmUrl;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.bannerUrl;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigBankAccount(enable=");
        sb.append(this.enable);
        sb.append(", listBankUrl=");
        sb.append(this.listBankUrl);
        sb.append(", verifyUrl=");
        sb.append(this.verifyUrl);
        sb.append(", confirmUrl=");
        sb.append(this.confirmUrl);
        sb.append(", bannerUrl=");
        sb.append(this.bannerUrl);
        sb.append(")");
        return sb.toString();
    }

    public fileType(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "listBankUrl");
        Intrinsics.checkNotNullParameter(str2, "verifyUrl");
        Intrinsics.checkNotNullParameter(str3, "confirmUrl");
        Intrinsics.checkNotNullParameter(str4, "bannerUrl");
        this.enable = z;
        this.listBankUrl = str;
        this.verifyUrl = str2;
        this.confirmUrl = str3;
        this.bannerUrl = str4;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    public final String getListBankUrl() {
        return this.listBankUrl;
    }

    @NotNull
    public final String getVerifyUrl() {
        return this.verifyUrl;
    }

    @NotNull
    public final String getConfirmUrl() {
        return this.confirmUrl;
    }

    @NotNull
    public final String getBannerUrl() {
        return this.bannerUrl;
    }
}
