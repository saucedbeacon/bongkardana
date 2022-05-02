package o;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003JQ\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, d2 = {"Lid/dana/domain/saving/model/TopUpView;", "", "topUpId", "", "fundAmount", "Lid/dana/domain/nearbyme/model/MoneyView;", "status", "createdTime", "bizOrderId", "extendInfo", "", "(Ljava/lang/String;Lid/dana/domain/nearbyme/model/MoneyView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getBizOrderId", "()Ljava/lang/String;", "getCreatedTime", "getExtendInfo", "()Ljava/util/Map;", "getFundAmount", "()Lid/dana/domain/nearbyme/model/MoneyView;", "getStatus", "getTopUpId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setRssiFilterImplClass {
    @NotNull
    private final String bizOrderId;
    @NotNull
    private final String createdTime;
    @NotNull
    private final Map<String, String> extendInfo;
    @NotNull
    private final getAppDir fundAmount;
    @NotNull
    private final String status;
    @NotNull
    private final String topUpId;

    public static /* synthetic */ setRssiFilterImplClass copy$default(setRssiFilterImplClass setrssifilterimplclass, String str, getAppDir getappdir, String str2, String str3, String str4, Map<String, String> map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setrssifilterimplclass.topUpId;
        }
        if ((i & 2) != 0) {
            getappdir = setrssifilterimplclass.fundAmount;
        }
        getAppDir getappdir2 = getappdir;
        if ((i & 4) != 0) {
            str2 = setrssifilterimplclass.status;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = setrssifilterimplclass.createdTime;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = setrssifilterimplclass.bizOrderId;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            map = setrssifilterimplclass.extendInfo;
        }
        return setrssifilterimplclass.copy(str, getappdir2, str5, str6, str7, map);
    }

    @NotNull
    public final String component1() {
        return this.topUpId;
    }

    @NotNull
    public final getAppDir component2() {
        return this.fundAmount;
    }

    @NotNull
    public final String component3() {
        return this.status;
    }

    @NotNull
    public final String component4() {
        return this.createdTime;
    }

    @NotNull
    public final String component5() {
        return this.bizOrderId;
    }

    @NotNull
    public final Map<String, String> component6() {
        return this.extendInfo;
    }

    @NotNull
    public final setRssiFilterImplClass copy(@NotNull String str, @NotNull getAppDir getappdir, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "topUpId");
        Intrinsics.checkNotNullParameter(getappdir, "fundAmount");
        Intrinsics.checkNotNullParameter(str2, "status");
        Intrinsics.checkNotNullParameter(str3, "createdTime");
        Intrinsics.checkNotNullParameter(str4, "bizOrderId");
        Intrinsics.checkNotNullParameter(map, "extendInfo");
        return new setRssiFilterImplClass(str, getappdir, str2, str3, str4, map);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setRssiFilterImplClass)) {
            return false;
        }
        setRssiFilterImplClass setrssifilterimplclass = (setRssiFilterImplClass) obj;
        return Intrinsics.areEqual((Object) this.topUpId, (Object) setrssifilterimplclass.topUpId) && Intrinsics.areEqual((Object) this.fundAmount, (Object) setrssifilterimplclass.fundAmount) && Intrinsics.areEqual((Object) this.status, (Object) setrssifilterimplclass.status) && Intrinsics.areEqual((Object) this.createdTime, (Object) setrssifilterimplclass.createdTime) && Intrinsics.areEqual((Object) this.bizOrderId, (Object) setrssifilterimplclass.bizOrderId) && Intrinsics.areEqual((Object) this.extendInfo, (Object) setrssifilterimplclass.extendInfo);
    }

    public final int hashCode() {
        String str = this.topUpId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        getAppDir getappdir = this.fundAmount;
        int hashCode2 = (hashCode + (getappdir != null ? getappdir.hashCode() : 0)) * 31;
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
        StringBuilder sb = new StringBuilder("TopUpView(topUpId=");
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

    public setRssiFilterImplClass(@NotNull String str, @NotNull getAppDir getappdir, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "topUpId");
        Intrinsics.checkNotNullParameter(getappdir, "fundAmount");
        Intrinsics.checkNotNullParameter(str2, "status");
        Intrinsics.checkNotNullParameter(str3, "createdTime");
        Intrinsics.checkNotNullParameter(str4, "bizOrderId");
        Intrinsics.checkNotNullParameter(map, "extendInfo");
        this.topUpId = str;
        this.fundAmount = getappdir;
        this.status = str2;
        this.createdTime = str3;
        this.bizOrderId = str4;
        this.extendInfo = map;
    }

    @NotNull
    public final String getTopUpId() {
        return this.topUpId;
    }

    @NotNull
    public final getAppDir getFundAmount() {
        return this.fundAmount;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getCreatedTime() {
        return this.createdTime;
    }

    @NotNull
    public final String getBizOrderId() {
        return this.bizOrderId;
    }

    @NotNull
    public final Map<String, String> getExtendInfo() {
        return this.extendInfo;
    }
}
