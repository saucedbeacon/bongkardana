package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, d2 = {"Lid/dana/data/social/model/GetMyFeedsRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "pageSize", "", "maxId", "", "minId", "inboxVersion", "globalNotification", "", "(ILjava/lang/String;Ljava/lang/String;IZ)V", "getGlobalNotification", "()Z", "getInboxVersion", "()I", "getMaxId", "()Ljava/lang/String;", "getMinId", "getPageSize", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getExtendDescription extends BaseRpcRequest {
    private final boolean globalNotification;
    private final int inboxVersion;
    @Nullable
    private final String maxId;
    @Nullable
    private final String minId;
    private final int pageSize;

    public static /* synthetic */ getExtendDescription copy$default(getExtendDescription getextenddescription, int i, String str, String str2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = getextenddescription.pageSize;
        }
        if ((i3 & 2) != 0) {
            str = getextenddescription.maxId;
        }
        String str3 = str;
        if ((i3 & 4) != 0) {
            str2 = getextenddescription.minId;
        }
        String str4 = str2;
        if ((i3 & 8) != 0) {
            i2 = getextenddescription.inboxVersion;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            z = getextenddescription.globalNotification;
        }
        return getextenddescription.copy(i, str3, str4, i4, z);
    }

    public final int component1() {
        return this.pageSize;
    }

    @Nullable
    public final String component2() {
        return this.maxId;
    }

    @Nullable
    public final String component3() {
        return this.minId;
    }

    public final int component4() {
        return this.inboxVersion;
    }

    public final boolean component5() {
        return this.globalNotification;
    }

    @NotNull
    public final getExtendDescription copy(int i, @Nullable String str, @Nullable String str2, int i2, boolean z) {
        return new getExtendDescription(i, str, str2, i2, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getExtendDescription)) {
            return false;
        }
        getExtendDescription getextenddescription = (getExtendDescription) obj;
        return this.pageSize == getextenddescription.pageSize && Intrinsics.areEqual((Object) this.maxId, (Object) getextenddescription.maxId) && Intrinsics.areEqual((Object) this.minId, (Object) getextenddescription.minId) && this.inboxVersion == getextenddescription.inboxVersion && this.globalNotification == getextenddescription.globalNotification;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GetMyFeedsRequest(pageSize=");
        sb.append(this.pageSize);
        sb.append(", maxId=");
        sb.append(this.maxId);
        sb.append(", minId=");
        sb.append(this.minId);
        sb.append(", inboxVersion=");
        sb.append(this.inboxVersion);
        sb.append(", globalNotification=");
        sb.append(this.globalNotification);
        sb.append(")");
        return sb.toString();
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    @Nullable
    public final String getMaxId() {
        return this.maxId;
    }

    @Nullable
    public final String getMinId() {
        return this.minId;
    }

    public final int getInboxVersion() {
        return this.inboxVersion;
    }

    public final boolean getGlobalNotification() {
        return this.globalNotification;
    }

    public getExtendDescription(int i, @Nullable String str, @Nullable String str2, int i2, boolean z) {
        this.pageSize = i;
        this.maxId = str;
        this.minId = str2;
        this.inboxVersion = i2;
        this.globalNotification = z;
    }

    public final int hashCode() {
        int hashCode = Integer.valueOf(this.pageSize).hashCode() * 31;
        String str = this.maxId;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.minId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int hashCode3 = (((hashCode2 + i) * 31) + Integer.valueOf(this.inboxVersion).hashCode()) * 31;
        boolean z = this.globalNotification;
        if (z) {
            z = true;
        }
        return hashCode3 + (z ? 1 : 0);
    }
}
