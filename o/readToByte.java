package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\bHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lid/dana/data/sendmoney/model/WithdrawInitMethodViewResult;", "", "withdrawCardOptions", "", "Lid/dana/data/sendmoney/model/WithdrawCardOptionViewResult;", "withdrawChannelOptions", "Lid/dana/data/sendmoney/model/WithdrawInitChannelOptionViewResult;", "withdrawMethod", "", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getWithdrawCardOptions", "()Ljava/util/List;", "getWithdrawChannelOptions", "getWithdrawMethod", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class readToByte {
    @Nullable
    private final List<getByteArrayPool> withdrawCardOptions;
    @Nullable
    private final List<formatFileSize> withdrawChannelOptions;
    @Nullable
    private final String withdrawMethod;

    public static /* synthetic */ readToByte copy$default(readToByte readtobyte, List<getByteArrayPool> list, List<formatFileSize> list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = readtobyte.withdrawCardOptions;
        }
        if ((i & 2) != 0) {
            list2 = readtobyte.withdrawChannelOptions;
        }
        if ((i & 4) != 0) {
            str = readtobyte.withdrawMethod;
        }
        return readtobyte.copy(list, list2, str);
    }

    @Nullable
    public final List<getByteArrayPool> component1() {
        return this.withdrawCardOptions;
    }

    @Nullable
    public final List<formatFileSize> component2() {
        return this.withdrawChannelOptions;
    }

    @Nullable
    public final String component3() {
        return this.withdrawMethod;
    }

    @NotNull
    public final readToByte copy(@Nullable List<? extends getByteArrayPool> list, @Nullable List<formatFileSize> list2, @Nullable String str) {
        return new readToByte(list, list2, str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof readToByte)) {
            return false;
        }
        readToByte readtobyte = (readToByte) obj;
        return Intrinsics.areEqual((Object) this.withdrawCardOptions, (Object) readtobyte.withdrawCardOptions) && Intrinsics.areEqual((Object) this.withdrawChannelOptions, (Object) readtobyte.withdrawChannelOptions) && Intrinsics.areEqual((Object) this.withdrawMethod, (Object) readtobyte.withdrawMethod);
    }

    public final int hashCode() {
        List<getByteArrayPool> list = this.withdrawCardOptions;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<formatFileSize> list2 = this.withdrawChannelOptions;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.withdrawMethod;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("WithdrawInitMethodViewResult(withdrawCardOptions=");
        sb.append(this.withdrawCardOptions);
        sb.append(", withdrawChannelOptions=");
        sb.append(this.withdrawChannelOptions);
        sb.append(", withdrawMethod=");
        sb.append(this.withdrawMethod);
        sb.append(")");
        return sb.toString();
    }

    public readToByte(@Nullable List<? extends getByteArrayPool> list, @Nullable List<formatFileSize> list2, @Nullable String str) {
        this.withdrawCardOptions = list;
        this.withdrawChannelOptions = list2;
        this.withdrawMethod = str;
    }

    @Nullable
    public final List<getByteArrayPool> getWithdrawCardOptions() {
        return this.withdrawCardOptions;
    }

    @Nullable
    public final List<formatFileSize> getWithdrawChannelOptions() {
        return this.withdrawChannelOptions;
    }

    @Nullable
    public final String getWithdrawMethod() {
        return this.withdrawMethod;
    }
}
