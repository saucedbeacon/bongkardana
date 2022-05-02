package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\tHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013¨\u0006$"}, d2 = {"Lid/dana/data/social/repository/source/network/result/InitFeedResponse;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "nickname", "", "kycStatus", "", "maskedPhoneNumber", "status", "initProgress", "", "operationLogList", "", "Lid/dana/data/social/repository/source/network/result/OperationLog;", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getInitProgress", "()I", "getKycStatus", "()Z", "getMaskedPhoneNumber", "()Ljava/lang/String;", "getNickname", "getOperationLogList", "()Ljava/util/List;", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setAuthCode extends BaseRpcResult {
    private final int initProgress;
    private final boolean kycStatus;
    @NotNull
    private final String maskedPhoneNumber;
    @NotNull
    private final String nickname;
    @NotNull
    private final List<Object> operationLogList;
    @NotNull
    private final String status;

    public static /* synthetic */ setAuthCode copy$default(setAuthCode setauthcode, String str, boolean z, String str2, String str3, int i, List<Object> list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = setauthcode.nickname;
        }
        if ((i2 & 2) != 0) {
            z = setauthcode.kycStatus;
        }
        boolean z2 = z;
        if ((i2 & 4) != 0) {
            str2 = setauthcode.maskedPhoneNumber;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            str3 = setauthcode.status;
        }
        String str5 = str3;
        if ((i2 & 16) != 0) {
            i = setauthcode.initProgress;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            list = setauthcode.operationLogList;
        }
        return setauthcode.copy(str, z2, str4, str5, i3, list);
    }

    @NotNull
    public final String component1() {
        return this.nickname;
    }

    public final boolean component2() {
        return this.kycStatus;
    }

    @NotNull
    public final String component3() {
        return this.maskedPhoneNumber;
    }

    @NotNull
    public final String component4() {
        return this.status;
    }

    public final int component5() {
        return this.initProgress;
    }

    @NotNull
    public final List<Object> component6() {
        return this.operationLogList;
    }

    @NotNull
    public final setAuthCode copy(@NotNull String str, boolean z, @NotNull String str2, @NotNull String str3, int i, @NotNull List<Object> list) {
        Intrinsics.checkNotNullParameter(str, "nickname");
        Intrinsics.checkNotNullParameter(str2, "maskedPhoneNumber");
        Intrinsics.checkNotNullParameter(str3, "status");
        Intrinsics.checkNotNullParameter(list, "operationLogList");
        return new setAuthCode(str, z, str2, str3, i, list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setAuthCode)) {
            return false;
        }
        setAuthCode setauthcode = (setAuthCode) obj;
        return Intrinsics.areEqual((Object) this.nickname, (Object) setauthcode.nickname) && this.kycStatus == setauthcode.kycStatus && Intrinsics.areEqual((Object) this.maskedPhoneNumber, (Object) setauthcode.maskedPhoneNumber) && Intrinsics.areEqual((Object) this.status, (Object) setauthcode.status) && this.initProgress == setauthcode.initProgress && Intrinsics.areEqual((Object) this.operationLogList, (Object) setauthcode.operationLogList);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("InitFeedResponse(nickname=");
        sb.append(this.nickname);
        sb.append(", kycStatus=");
        sb.append(this.kycStatus);
        sb.append(", maskedPhoneNumber=");
        sb.append(this.maskedPhoneNumber);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", initProgress=");
        sb.append(this.initProgress);
        sb.append(", operationLogList=");
        sb.append(this.operationLogList);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getNickname() {
        return this.nickname;
    }

    public final boolean getKycStatus() {
        return this.kycStatus;
    }

    @NotNull
    public final String getMaskedPhoneNumber() {
        return this.maskedPhoneNumber;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public final int getInitProgress() {
        return this.initProgress;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setAuthCode(String str, boolean z, String str2, String str3, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, str2, str3, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list);
    }

    @NotNull
    public final List<Object> getOperationLogList() {
        return this.operationLogList;
    }

    public setAuthCode(@NotNull String str, boolean z, @NotNull String str2, @NotNull String str3, int i, @NotNull List<Object> list) {
        Intrinsics.checkNotNullParameter(str, "nickname");
        Intrinsics.checkNotNullParameter(str2, "maskedPhoneNumber");
        Intrinsics.checkNotNullParameter(str3, "status");
        Intrinsics.checkNotNullParameter(list, "operationLogList");
        this.nickname = str;
        this.kycStatus = z;
        this.maskedPhoneNumber = str2;
        this.status = str3;
        this.initProgress = i;
        this.operationLogList = list;
    }

    public final int hashCode() {
        String str = this.nickname;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.kycStatus;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        String str2 = this.maskedPhoneNumber;
        int hashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.status;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.valueOf(this.initProgress).hashCode()) * 31;
        List<Object> list = this.operationLogList;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }
}
