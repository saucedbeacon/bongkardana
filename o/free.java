package o;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00060"}, d2 = {"Lid/dana/data/promocode/repository/source/network/result/PrizeAwardVOResult;", "", "prizeAwardOrderId", "", "status", "activityId", "merchantId", "userId", "requestId", "bizNo", "awardTime", "", "prizeInfoVO", "Lid/dana/data/promocode/repository/source/network/result/PrizeInfoVOResult;", "extendInfo", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLid/dana/data/promocode/repository/source/network/result/PrizeInfoVOResult;Ljava/util/Map;)V", "getActivityId", "()Ljava/lang/String;", "getAwardTime", "()J", "getBizNo", "getExtendInfo", "()Ljava/util/Map;", "getMerchantId", "getPrizeAwardOrderId", "getPrizeInfoVO", "()Lid/dana/data/promocode/repository/source/network/result/PrizeInfoVOResult;", "getRequestId", "getStatus", "getUserId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class free {
    @Nullable
    private final String activityId;
    private final long awardTime;
    @Nullable
    private final String bizNo;
    @Nullable
    private final Map<String, String> extendInfo;
    @Nullable
    private final String merchantId;
    @Nullable
    private final String prizeAwardOrderId;
    @Nullable
    private final obtain prizeInfoVO;
    @Nullable
    private final String requestId;
    @Nullable
    private final String status;
    @Nullable
    private final String userId;

    public static /* synthetic */ free copy$default(free free, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, obtain obtain, Map map, int i, Object obj) {
        free free2 = free;
        int i2 = i;
        return free.copy((i2 & 1) != 0 ? free2.prizeAwardOrderId : str, (i2 & 2) != 0 ? free2.status : str2, (i2 & 4) != 0 ? free2.activityId : str3, (i2 & 8) != 0 ? free2.merchantId : str4, (i2 & 16) != 0 ? free2.userId : str5, (i2 & 32) != 0 ? free2.requestId : str6, (i2 & 64) != 0 ? free2.bizNo : str7, (i2 & 128) != 0 ? free2.awardTime : j, (i2 & 256) != 0 ? free2.prizeInfoVO : obtain, (i2 & 512) != 0 ? free2.extendInfo : map);
    }

    @Nullable
    public final String component1() {
        return this.prizeAwardOrderId;
    }

    @Nullable
    public final Map<String, String> component10() {
        return this.extendInfo;
    }

    @Nullable
    public final String component2() {
        return this.status;
    }

    @Nullable
    public final String component3() {
        return this.activityId;
    }

    @Nullable
    public final String component4() {
        return this.merchantId;
    }

    @Nullable
    public final String component5() {
        return this.userId;
    }

    @Nullable
    public final String component6() {
        return this.requestId;
    }

    @Nullable
    public final String component7() {
        return this.bizNo;
    }

    public final long component8() {
        return this.awardTime;
    }

    @Nullable
    public final obtain component9() {
        return this.prizeInfoVO;
    }

    @NotNull
    public final free copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, long j, @Nullable obtain obtain, @Nullable Map<String, String> map) {
        return new free(str, str2, str3, str4, str5, str6, str7, j, obtain, map);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof free)) {
            return false;
        }
        free free = (free) obj;
        return Intrinsics.areEqual((Object) this.prizeAwardOrderId, (Object) free.prizeAwardOrderId) && Intrinsics.areEqual((Object) this.status, (Object) free.status) && Intrinsics.areEqual((Object) this.activityId, (Object) free.activityId) && Intrinsics.areEqual((Object) this.merchantId, (Object) free.merchantId) && Intrinsics.areEqual((Object) this.userId, (Object) free.userId) && Intrinsics.areEqual((Object) this.requestId, (Object) free.requestId) && Intrinsics.areEqual((Object) this.bizNo, (Object) free.bizNo) && this.awardTime == free.awardTime && Intrinsics.areEqual((Object) this.prizeInfoVO, (Object) free.prizeInfoVO) && Intrinsics.areEqual((Object) this.extendInfo, (Object) free.extendInfo);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PrizeAwardVOResult(prizeAwardOrderId=");
        sb.append(this.prizeAwardOrderId);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", activityId=");
        sb.append(this.activityId);
        sb.append(", merchantId=");
        sb.append(this.merchantId);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", bizNo=");
        sb.append(this.bizNo);
        sb.append(", awardTime=");
        sb.append(this.awardTime);
        sb.append(", prizeInfoVO=");
        sb.append(this.prizeInfoVO);
        sb.append(", extendInfo=");
        sb.append(this.extendInfo);
        sb.append(")");
        return sb.toString();
    }

    public free(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, long j, @Nullable obtain obtain, @Nullable Map<String, String> map) {
        this.prizeAwardOrderId = str;
        this.status = str2;
        this.activityId = str3;
        this.merchantId = str4;
        this.userId = str5;
        this.requestId = str6;
        this.bizNo = str7;
        this.awardTime = j;
        this.prizeInfoVO = obtain;
        this.extendInfo = map;
    }

    @Nullable
    public final String getActivityId() {
        return this.activityId;
    }

    @Nullable
    public final String getPrizeAwardOrderId() {
        return this.prizeAwardOrderId;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getBizNo() {
        return this.bizNo;
    }

    @Nullable
    public final String getMerchantId() {
        return this.merchantId;
    }

    @Nullable
    public final String getRequestId() {
        return this.requestId;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public final long getAwardTime() {
        return this.awardTime;
    }

    @Nullable
    public final obtain getPrizeInfoVO() {
        return this.prizeInfoVO;
    }

    @Nullable
    public final Map<String, String> getExtendInfo() {
        return this.extendInfo;
    }

    public final int hashCode() {
        String str = this.prizeAwardOrderId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.status;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.activityId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.merchantId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.userId;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.requestId;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.bizNo;
        int hashCode7 = (((hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31) + Long.valueOf(this.awardTime).hashCode()) * 31;
        obtain obtain = this.prizeInfoVO;
        int hashCode8 = (hashCode7 + (obtain != null ? obtain.hashCode() : 0)) * 31;
        Map<String, String> map = this.extendInfo;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode8 + i;
    }
}
