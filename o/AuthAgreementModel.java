package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lid/dana/data/social/repository/source/network/request/AddActivityReactionRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "userId", "", "activityId", "kind", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivityId", "()Ljava/lang/String;", "getKind", "getUserId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AuthAgreementModel extends BaseRpcRequest {
    @NotNull
    private final String activityId;
    @NotNull
    private final String kind;
    @NotNull
    private final String userId;

    public static /* synthetic */ AuthAgreementModel copy$default(AuthAgreementModel authAgreementModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authAgreementModel.userId;
        }
        if ((i & 2) != 0) {
            str2 = authAgreementModel.activityId;
        }
        if ((i & 4) != 0) {
            str3 = authAgreementModel.kind;
        }
        return authAgreementModel.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.userId;
    }

    @NotNull
    public final String component2() {
        return this.activityId;
    }

    @NotNull
    public final String component3() {
        return this.kind;
    }

    @NotNull
    public final AuthAgreementModel copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(836068268, oncanceled);
            onCancelLoad.getMin(836068268, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(str2, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
        Intrinsics.checkNotNullParameter(str3, "kind");
        return new AuthAgreementModel(str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthAgreementModel)) {
            return false;
        }
        AuthAgreementModel authAgreementModel = (AuthAgreementModel) obj;
        return Intrinsics.areEqual((Object) this.userId, (Object) authAgreementModel.userId) && Intrinsics.areEqual((Object) this.activityId, (Object) authAgreementModel.activityId) && Intrinsics.areEqual((Object) this.kind, (Object) authAgreementModel.kind);
    }

    public final int hashCode() {
        String str = this.userId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.activityId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.kind;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AddActivityReactionRequest(userId=");
        sb.append(this.userId);
        sb.append(", activityId=");
        sb.append(this.activityId);
        sb.append(", kind=");
        sb.append(this.kind);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getActivityId() {
        return this.activityId;
    }

    @NotNull
    public final String getKind() {
        return this.kind;
    }

    public AuthAgreementModel(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(str2, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
        Intrinsics.checkNotNullParameter(str3, "kind");
        this.userId = str;
        this.activityId = str2;
        this.kind = str3;
    }
}
