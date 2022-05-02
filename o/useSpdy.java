package o;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J[\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, d2 = {"Lid/dana/data/saving/model/TopUpViewEntity;", "", "topUpId", "", "fundAmount", "Lid/dana/data/nearbyme/model/MoneyViewEntity;", "status", "createdTime", "bizOrderId", "extendInfo", "", "(Ljava/lang/String;Lid/dana/data/nearbyme/model/MoneyViewEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getBizOrderId", "()Ljava/lang/String;", "getCreatedTime", "getExtendInfo", "()Ljava/util/Map;", "getFundAmount", "()Lid/dana/data/nearbyme/model/MoneyViewEntity;", "getStatus", "getTopUpId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class useSpdy {
    @Nullable
    private final String bizOrderId;
    @Nullable
    private final String createdTime;
    @Nullable
    private final Map<String, String> extendInfo;
    @NotNull
    private final onWorkerReady fundAmount;
    @Nullable
    private final String status;
    @Nullable
    private final String topUpId;

    public static /* synthetic */ useSpdy copy$default(useSpdy usespdy, String str, onWorkerReady onworkerready, String str2, String str3, String str4, Map<String, String> map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = usespdy.topUpId;
        }
        if ((i & 2) != 0) {
            onworkerready = usespdy.fundAmount;
        }
        onWorkerReady onworkerready2 = onworkerready;
        if ((i & 4) != 0) {
            str2 = usespdy.status;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = usespdy.createdTime;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = usespdy.bizOrderId;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            map = usespdy.extendInfo;
        }
        return usespdy.copy(str, onworkerready2, str5, str6, str7, map);
    }

    @Nullable
    public final String component1() {
        return this.topUpId;
    }

    @NotNull
    public final onWorkerReady component2() {
        return this.fundAmount;
    }

    @Nullable
    public final String component3() {
        return this.status;
    }

    @Nullable
    public final String component4() {
        return this.createdTime;
    }

    @Nullable
    public final String component5() {
        return this.bizOrderId;
    }

    @Nullable
    public final Map<String, String> component6() {
        return this.extendInfo;
    }

    @NotNull
    public final useSpdy copy(@Nullable String str, @NotNull onWorkerReady onworkerready, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Map<String, String> map) {
        Intrinsics.checkNotNullParameter(onworkerready, "fundAmount");
        return new useSpdy(str, onworkerready, str2, str3, str4, map);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof useSpdy)) {
            return false;
        }
        useSpdy usespdy = (useSpdy) obj;
        return Intrinsics.areEqual((Object) this.topUpId, (Object) usespdy.topUpId) && Intrinsics.areEqual((Object) this.fundAmount, (Object) usespdy.fundAmount) && Intrinsics.areEqual((Object) this.status, (Object) usespdy.status) && Intrinsics.areEqual((Object) this.createdTime, (Object) usespdy.createdTime) && Intrinsics.areEqual((Object) this.bizOrderId, (Object) usespdy.bizOrderId) && Intrinsics.areEqual((Object) this.extendInfo, (Object) usespdy.extendInfo);
    }

    public final int hashCode() {
        String str = this.topUpId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        onWorkerReady onworkerready = this.fundAmount;
        int hashCode2 = (hashCode + (onworkerready != null ? onworkerready.hashCode() : 0)) * 31;
        String str2 = this.status;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.createdTime;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.bizOrderId;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Map<String, String> map = this.extendInfo;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode5 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TopUpViewEntity(topUpId=");
        sb.append(this.topUpId);
        sb.append(", fundAmount=");
        sb.append(this.fundAmount);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", createdTime=");
        sb.append(this.createdTime);
        sb.append(", bizOrderId=");
        sb.append(this.bizOrderId);
        sb.append(", extendInfo=");
        sb.append(this.extendInfo);
        sb.append(")");
        return sb.toString();
    }

    public useSpdy(@Nullable String str, @NotNull onWorkerReady onworkerready, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Map<String, String> map) {
        Intrinsics.checkNotNullParameter(onworkerready, "fundAmount");
        this.topUpId = str;
        this.fundAmount = onworkerready;
        this.status = str2;
        this.createdTime = str3;
        this.bizOrderId = str4;
        this.extendInfo = map;
    }

    @Nullable
    public final String getTopUpId() {
        return this.topUpId;
    }

    @NotNull
    public final onWorkerReady getFundAmount() {
        return this.fundAmount;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getCreatedTime() {
        return this.createdTime;
    }

    @Nullable
    public final String getBizOrderId() {
        return this.bizOrderId;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ useSpdy(String str, onWorkerReady onworkerready, String str2, String str3, String str4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, onworkerready, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? new HashMap() : map);
    }

    @Nullable
    public final Map<String, String> getExtendInfo() {
        return this.extendInfo;
    }
}
