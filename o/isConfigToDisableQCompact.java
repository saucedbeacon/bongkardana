package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\bHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lid/dana/sendmoney/model/WithdrawInitMethodOptionModel;", "", "withdrawCardOptions", "", "Lid/dana/sendmoney/model/WithdrawSavedCardChannelModel;", "withdrawChannelOptions", "Lid/dana/sendmoney/model/WithdrawInitChannelOptionModel;", "withdrawMethod", "", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getWithdrawCardOptions", "()Ljava/util/List;", "getWithdrawChannelOptions", "getWithdrawMethod", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isConfigToDisableQCompact {
    @Nullable
    public final List<onLoadComplete> length;
    @Nullable
    public final String setMax;
    @Nullable
    private final List<setPhotoPreview> setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isConfigToDisableQCompact)) {
            return false;
        }
        isConfigToDisableQCompact isconfigtodisableqcompact = (isConfigToDisableQCompact) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) isconfigtodisableqcompact.setMin) && Intrinsics.areEqual((Object) this.length, (Object) isconfigtodisableqcompact.length) && Intrinsics.areEqual((Object) this.setMax, (Object) isconfigtodisableqcompact.setMax);
    }

    public final int hashCode() {
        List<setPhotoPreview> list = this.setMin;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<onLoadComplete> list2 = this.length;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.setMax;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("WithdrawInitMethodOptionModel(withdrawCardOptions=");
        sb.append(this.setMin);
        sb.append(", withdrawChannelOptions=");
        sb.append(this.length);
        sb.append(", withdrawMethod=");
        sb.append(this.setMax);
        sb.append(")");
        return sb.toString();
    }

    public isConfigToDisableQCompact(@Nullable List<setPhotoPreview> list, @Nullable List<onLoadComplete> list2, @Nullable String str) {
        this.setMin = list;
        this.length = list2;
        this.setMax = str;
    }
}
