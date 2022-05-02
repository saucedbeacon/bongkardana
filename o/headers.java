package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006-"}, d2 = {"Lid/dana/data/saving/model/SavingView;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "savingId", "", "title", "categoryCode", "currentAmount", "Lid/dana/data/nearbyme/model/MoneyViewEntity;", "targetAmount", "orderStatus", "orderSubStatus", "createdTime", "achievedTime", "completedTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/data/nearbyme/model/MoneyViewEntity;Lid/dana/data/nearbyme/model/MoneyViewEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAchievedTime", "()Ljava/lang/String;", "getCategoryCode", "getCompletedTime", "getCreatedTime", "getCurrentAmount", "()Lid/dana/data/nearbyme/model/MoneyViewEntity;", "getOrderStatus", "getOrderSubStatus", "getSavingId", "getTargetAmount", "getTitle", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class headers extends BaseRpcResult {
    @Nullable
    private final String achievedTime;
    @NotNull
    private final String categoryCode;
    @Nullable
    private final String completedTime;
    @Nullable
    private final String createdTime;
    @NotNull
    private final onWorkerReady currentAmount;
    @NotNull
    private final String orderStatus;
    @Nullable
    private final String orderSubStatus;
    @NotNull
    private final String savingId;
    @NotNull
    private final onWorkerReady targetAmount;
    @NotNull
    private final String title;

    public static /* synthetic */ headers copy$default(headers headers, String str, String str2, String str3, onWorkerReady onworkerready, onWorkerReady onworkerready2, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        headers headers2 = headers;
        int i2 = i;
        return headers.copy((i2 & 1) != 0 ? headers2.savingId : str, (i2 & 2) != 0 ? headers2.title : str2, (i2 & 4) != 0 ? headers2.categoryCode : str3, (i2 & 8) != 0 ? headers2.currentAmount : onworkerready, (i2 & 16) != 0 ? headers2.targetAmount : onworkerready2, (i2 & 32) != 0 ? headers2.orderStatus : str4, (i2 & 64) != 0 ? headers2.orderSubStatus : str5, (i2 & 128) != 0 ? headers2.createdTime : str6, (i2 & 256) != 0 ? headers2.achievedTime : str7, (i2 & 512) != 0 ? headers2.completedTime : str8);
    }

    @NotNull
    public final String component1() {
        return this.savingId;
    }

    @Nullable
    public final String component10() {
        return this.completedTime;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final String component3() {
        return this.categoryCode;
    }

    @NotNull
    public final onWorkerReady component4() {
        return this.currentAmount;
    }

    @NotNull
    public final onWorkerReady component5() {
        return this.targetAmount;
    }

    @NotNull
    public final String component6() {
        return this.orderStatus;
    }

    @Nullable
    public final String component7() {
        return this.orderSubStatus;
    }

    @Nullable
    public final String component8() {
        return this.createdTime;
    }

    @Nullable
    public final String component9() {
        return this.achievedTime;
    }

    @NotNull
    public final headers copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull onWorkerReady onworkerready, @NotNull onWorkerReady onworkerready2, @NotNull String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        Intrinsics.checkNotNullParameter(str2, "title");
        Intrinsics.checkNotNullParameter(str3, "categoryCode");
        onWorkerReady onworkerready3 = onworkerready;
        Intrinsics.checkNotNullParameter(onworkerready3, "currentAmount");
        onWorkerReady onworkerready4 = onworkerready2;
        Intrinsics.checkNotNullParameter(onworkerready4, "targetAmount");
        String str9 = str4;
        Intrinsics.checkNotNullParameter(str9, "orderStatus");
        return new headers(str, str2, str3, onworkerready3, onworkerready4, str9, str5, str6, str7, str8);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof headers)) {
            return false;
        }
        headers headers = (headers) obj;
        return Intrinsics.areEqual((Object) this.savingId, (Object) headers.savingId) && Intrinsics.areEqual((Object) this.title, (Object) headers.title) && Intrinsics.areEqual((Object) this.categoryCode, (Object) headers.categoryCode) && Intrinsics.areEqual((Object) this.currentAmount, (Object) headers.currentAmount) && Intrinsics.areEqual((Object) this.targetAmount, (Object) headers.targetAmount) && Intrinsics.areEqual((Object) this.orderStatus, (Object) headers.orderStatus) && Intrinsics.areEqual((Object) this.orderSubStatus, (Object) headers.orderSubStatus) && Intrinsics.areEqual((Object) this.createdTime, (Object) headers.createdTime) && Intrinsics.areEqual((Object) this.achievedTime, (Object) headers.achievedTime) && Intrinsics.areEqual((Object) this.completedTime, (Object) headers.completedTime);
    }

    public final int hashCode() {
        String str = this.savingId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.categoryCode;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        onWorkerReady onworkerready = this.currentAmount;
        int hashCode4 = (hashCode3 + (onworkerready != null ? onworkerready.hashCode() : 0)) * 31;
        onWorkerReady onworkerready2 = this.targetAmount;
        int hashCode5 = (hashCode4 + (onworkerready2 != null ? onworkerready2.hashCode() : 0)) * 31;
        String str4 = this.orderStatus;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.orderSubStatus;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.createdTime;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.achievedTime;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.completedTime;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode9 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingView(savingId=");
        sb.append(this.savingId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", categoryCode=");
        sb.append(this.categoryCode);
        sb.append(", currentAmount=");
        sb.append(this.currentAmount);
        sb.append(", targetAmount=");
        sb.append(this.targetAmount);
        sb.append(", orderStatus=");
        sb.append(this.orderStatus);
        sb.append(", orderSubStatus=");
        sb.append(this.orderSubStatus);
        sb.append(", createdTime=");
        sb.append(this.createdTime);
        sb.append(", achievedTime=");
        sb.append(this.achievedTime);
        sb.append(", completedTime=");
        sb.append(this.completedTime);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getSavingId() {
        return this.savingId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getCategoryCode() {
        return this.categoryCode;
    }

    @NotNull
    public final onWorkerReady getCurrentAmount() {
        return this.currentAmount;
    }

    @NotNull
    public final onWorkerReady getTargetAmount() {
        return this.targetAmount;
    }

    @NotNull
    public final String getOrderStatus() {
        return this.orderStatus;
    }

    @Nullable
    public final String getOrderSubStatus() {
        return this.orderSubStatus;
    }

    @Nullable
    public final String getCreatedTime() {
        return this.createdTime;
    }

    @Nullable
    public final String getAchievedTime() {
        return this.achievedTime;
    }

    @Nullable
    public final String getCompletedTime() {
        return this.completedTime;
    }

    public headers(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull onWorkerReady onworkerready, @NotNull onWorkerReady onworkerready2, @NotNull String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        Intrinsics.checkNotNullParameter(str2, "title");
        Intrinsics.checkNotNullParameter(str3, "categoryCode");
        Intrinsics.checkNotNullParameter(onworkerready, "currentAmount");
        Intrinsics.checkNotNullParameter(onworkerready2, "targetAmount");
        Intrinsics.checkNotNullParameter(str4, "orderStatus");
        this.savingId = str;
        this.title = str2;
        this.categoryCode = str3;
        this.currentAmount = onworkerready;
        this.targetAmount = onworkerready2;
        this.orderStatus = str4;
        this.orderSubStatus = str5;
        this.createdTime = str6;
        this.achievedTime = str7;
        this.completedTime = str8;
    }
}
