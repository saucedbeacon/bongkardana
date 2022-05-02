package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JD\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0011\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lid/dana/domain/sendmoney/model/WithdrawInit;", "", "enableWithdrawSaveAccount", "", "maxNumOfAssets", "", "needSenderName", "withdrawMethodViewList", "", "Lid/dana/domain/sendmoney/model/WithdrawInitBase;", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;)V", "getEnableWithdrawSaveAccount", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxNumOfAssets", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNeedSenderName", "getWithdrawMethodViewList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;)Lid/dana/domain/sendmoney/model/WithdrawInit;", "equals", "other", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class ensureMaxSize {
    @Nullable
    private final Boolean enableWithdrawSaveAccount;
    @Nullable
    private final Integer maxNumOfAssets;
    @Nullable
    private final Boolean needSenderName;
    @Nullable
    private final List<byteArrayToFormattedString> withdrawMethodViewList;

    public static /* synthetic */ ensureMaxSize copy$default(ensureMaxSize ensuremaxsize, Boolean bool, Integer num, Boolean bool2, List<byteArrayToFormattedString> list, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = ensuremaxsize.enableWithdrawSaveAccount;
        }
        if ((i & 2) != 0) {
            num = ensuremaxsize.maxNumOfAssets;
        }
        if ((i & 4) != 0) {
            bool2 = ensuremaxsize.needSenderName;
        }
        if ((i & 8) != 0) {
            list = ensuremaxsize.withdrawMethodViewList;
        }
        return ensuremaxsize.copy(bool, num, bool2, list);
    }

    @Nullable
    public final Boolean component1() {
        return this.enableWithdrawSaveAccount;
    }

    @Nullable
    public final Integer component2() {
        return this.maxNumOfAssets;
    }

    @Nullable
    public final Boolean component3() {
        return this.needSenderName;
    }

    @Nullable
    public final List<byteArrayToFormattedString> component4() {
        return this.withdrawMethodViewList;
    }

    @NotNull
    public final ensureMaxSize copy(@Nullable Boolean bool, @Nullable Integer num, @Nullable Boolean bool2, @Nullable List<byteArrayToFormattedString> list) {
        return new ensureMaxSize(bool, num, bool2, list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ensureMaxSize)) {
            return false;
        }
        ensureMaxSize ensuremaxsize = (ensureMaxSize) obj;
        return Intrinsics.areEqual((Object) this.enableWithdrawSaveAccount, (Object) ensuremaxsize.enableWithdrawSaveAccount) && Intrinsics.areEqual((Object) this.maxNumOfAssets, (Object) ensuremaxsize.maxNumOfAssets) && Intrinsics.areEqual((Object) this.needSenderName, (Object) ensuremaxsize.needSenderName) && Intrinsics.areEqual((Object) this.withdrawMethodViewList, (Object) ensuremaxsize.withdrawMethodViewList);
    }

    public final int hashCode() {
        Boolean bool = this.enableWithdrawSaveAccount;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Integer num = this.maxNumOfAssets;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool2 = this.needSenderName;
        int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        List<byteArrayToFormattedString> list = this.withdrawMethodViewList;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("WithdrawInit(enableWithdrawSaveAccount=");
        sb.append(this.enableWithdrawSaveAccount);
        sb.append(", maxNumOfAssets=");
        sb.append(this.maxNumOfAssets);
        sb.append(", needSenderName=");
        sb.append(this.needSenderName);
        sb.append(", withdrawMethodViewList=");
        sb.append(this.withdrawMethodViewList);
        sb.append(")");
        return sb.toString();
    }

    public ensureMaxSize(@Nullable Boolean bool, @Nullable Integer num, @Nullable Boolean bool2, @Nullable List<byteArrayToFormattedString> list) {
        this.enableWithdrawSaveAccount = bool;
        this.maxNumOfAssets = num;
        this.needSenderName = bool2;
        this.withdrawMethodViewList = list;
    }

    @Nullable
    public final Boolean getEnableWithdrawSaveAccount() {
        return this.enableWithdrawSaveAccount;
    }

    @Nullable
    public final Integer getMaxNumOfAssets() {
        return this.maxNumOfAssets;
    }

    @Nullable
    public final Boolean getNeedSenderName() {
        return this.needSenderName;
    }

    @Nullable
    public final List<byteArrayToFormattedString> getWithdrawMethodViewList() {
        return this.withdrawMethodViewList;
    }
}
