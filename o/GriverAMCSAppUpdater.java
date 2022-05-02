package o;

import id.dana.domain.promoquest.model.PrizeType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020\u00112\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000f¨\u0006/"}, d2 = {"Lid/dana/domain/promoquest/model/PrizeInfoEntity;", "", "prizeAwardOrderId", "", "bizNo", "prizeId", "prizeMoneyAmount", "Lid/dana/domain/user/CurrencyAmount;", "prizeType", "voucherId", "voucherName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/domain/user/CurrencyAmount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBizNo", "()Ljava/lang/String;", "setBizNo", "(Ljava/lang/String;)V", "hasVoucher", "", "getHasVoucher", "()Z", "getPrizeAwardOrderId", "setPrizeAwardOrderId", "getPrizeId", "setPrizeId", "getPrizeMoneyAmount", "()Lid/dana/domain/user/CurrencyAmount;", "setPrizeMoneyAmount", "(Lid/dana/domain/user/CurrencyAmount;)V", "getPrizeType", "setPrizeType", "getVoucherId", "setVoucherId", "getVoucherName", "setVoucherName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GriverAMCSAppUpdater {
    @Nullable
    private String bizNo;
    @Nullable
    private String prizeAwardOrderId;
    @Nullable
    private String prizeId;
    @Nullable
    private stopBleScan prizeMoneyAmount;
    @Nullable
    private String prizeType;
    @Nullable
    private String voucherId;
    @Nullable
    private String voucherName;

    /* renamed from: o.GriverAMCSAppUpdater$1  reason: invalid class name */
    public interface AnonymousClass1 {
        TitleBarRightButtonView.AnonymousClass1<queryAppAppInfos> getMissionDetail(String str, boolean z);

        TitleBarRightButtonView.AnonymousClass1<List<GriverAppPreDownloadSQLiteStorage>> getMissionSummary();

        TitleBarRightButtonView.AnonymousClass1<List<queryAppAppInfos>> getMissions(int i, int i2);

        TitleBarRightButtonView.AnonymousClass1<List<queryAppAppInfos>> getMissionsByStatus(int i, int i2, List<String> list);

        TitleBarRightButtonView.AnonymousClass1<List<queryAppAppInfos>> getMissionsWithQuest(int i, int i2);

        TitleBarRightButtonView.AnonymousClass1<GriverAppInfoPreDownloadStorage> redeemMission(String str);

        TitleBarRightButtonView.AnonymousClass1<GriverAppSQLiteStorage> redeemQuest(String str, String str2);

        TitleBarRightButtonView.AnonymousClass1<GriverAppInfoDBHelper> trackQuestUser(String str, String str2, boolean z);
    }

    public GriverAMCSAppUpdater() {
        this((String) null, (String) null, (String) null, (stopBleScan) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GriverAMCSAppUpdater copy$default(GriverAMCSAppUpdater griverAMCSAppUpdater, String str, String str2, String str3, stopBleScan stopblescan, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = griverAMCSAppUpdater.prizeAwardOrderId;
        }
        if ((i & 2) != 0) {
            str2 = griverAMCSAppUpdater.bizNo;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = griverAMCSAppUpdater.prizeId;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            stopblescan = griverAMCSAppUpdater.prizeMoneyAmount;
        }
        stopBleScan stopblescan2 = stopblescan;
        if ((i & 16) != 0) {
            str4 = griverAMCSAppUpdater.prizeType;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = griverAMCSAppUpdater.voucherId;
        }
        String str10 = str5;
        if ((i & 64) != 0) {
            str6 = griverAMCSAppUpdater.voucherName;
        }
        return griverAMCSAppUpdater.copy(str, str7, str8, stopblescan2, str9, str10, str6);
    }

    @Nullable
    public final String component1() {
        return this.prizeAwardOrderId;
    }

    @Nullable
    public final String component2() {
        return this.bizNo;
    }

    @Nullable
    public final String component3() {
        return this.prizeId;
    }

    @Nullable
    public final stopBleScan component4() {
        return this.prizeMoneyAmount;
    }

    @Nullable
    public final String component5() {
        return this.prizeType;
    }

    @Nullable
    public final String component6() {
        return this.voucherId;
    }

    @Nullable
    public final String component7() {
        return this.voucherName;
    }

    @NotNull
    public final GriverAMCSAppUpdater copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable stopBleScan stopblescan, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new GriverAMCSAppUpdater(str, str2, str3, stopblescan, str4, str5, str6);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GriverAMCSAppUpdater)) {
            return false;
        }
        GriverAMCSAppUpdater griverAMCSAppUpdater = (GriverAMCSAppUpdater) obj;
        return Intrinsics.areEqual((Object) this.prizeAwardOrderId, (Object) griverAMCSAppUpdater.prizeAwardOrderId) && Intrinsics.areEqual((Object) this.bizNo, (Object) griverAMCSAppUpdater.bizNo) && Intrinsics.areEqual((Object) this.prizeId, (Object) griverAMCSAppUpdater.prizeId) && Intrinsics.areEqual((Object) this.prizeMoneyAmount, (Object) griverAMCSAppUpdater.prizeMoneyAmount) && Intrinsics.areEqual((Object) this.prizeType, (Object) griverAMCSAppUpdater.prizeType) && Intrinsics.areEqual((Object) this.voucherId, (Object) griverAMCSAppUpdater.voucherId) && Intrinsics.areEqual((Object) this.voucherName, (Object) griverAMCSAppUpdater.voucherName);
    }

    public final int hashCode() {
        String str = this.prizeAwardOrderId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.bizNo;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.prizeId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        stopBleScan stopblescan = this.prizeMoneyAmount;
        int hashCode4 = (hashCode3 + (stopblescan != null ? stopblescan.hashCode() : 0)) * 31;
        String str4 = this.prizeType;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.voucherId;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.voucherName;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode6 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PrizeInfoEntity(prizeAwardOrderId=");
        sb.append(this.prizeAwardOrderId);
        sb.append(", bizNo=");
        sb.append(this.bizNo);
        sb.append(", prizeId=");
        sb.append(this.prizeId);
        sb.append(", prizeMoneyAmount=");
        sb.append(this.prizeMoneyAmount);
        sb.append(", prizeType=");
        sb.append(this.prizeType);
        sb.append(", voucherId=");
        sb.append(this.voucherId);
        sb.append(", voucherName=");
        sb.append(this.voucherName);
        sb.append(")");
        return sb.toString();
    }

    public GriverAMCSAppUpdater(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable stopBleScan stopblescan, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.prizeAwardOrderId = str;
        this.bizNo = str2;
        this.prizeId = str3;
        this.prizeMoneyAmount = stopblescan;
        this.prizeType = str4;
        this.voucherId = str5;
        this.voucherName = str6;
    }

    @Nullable
    public final String getPrizeAwardOrderId() {
        return this.prizeAwardOrderId;
    }

    public final void setPrizeAwardOrderId(@Nullable String str) {
        this.prizeAwardOrderId = str;
    }

    @Nullable
    public final String getBizNo() {
        return this.bizNo;
    }

    public final void setBizNo(@Nullable String str) {
        this.bizNo = str;
    }

    @Nullable
    public final String getPrizeId() {
        return this.prizeId;
    }

    public final void setPrizeId(@Nullable String str) {
        this.prizeId = str;
    }

    @Nullable
    public final stopBleScan getPrizeMoneyAmount() {
        return this.prizeMoneyAmount;
    }

    public final void setPrizeMoneyAmount(@Nullable stopBleScan stopblescan) {
        this.prizeMoneyAmount = stopblescan;
    }

    @Nullable
    public final String getPrizeType() {
        return this.prizeType;
    }

    public final void setPrizeType(@Nullable String str) {
        this.prizeType = str;
    }

    @Nullable
    public final String getVoucherId() {
        return this.voucherId;
    }

    public final void setVoucherId(@Nullable String str) {
        this.voucherId = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GriverAMCSAppUpdater(java.lang.String r7, java.lang.String r8, java.lang.String r9, o.stopBleScan r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r9
        L_0x0016:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r11
        L_0x0024:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            r5 = r0
            goto L_0x002b
        L_0x002a:
            r5 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GriverAMCSAppUpdater.<init>(java.lang.String, java.lang.String, java.lang.String, o.stopBleScan, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final String getVoucherName() {
        return this.voucherName;
    }

    public final void setVoucherName(@Nullable String str) {
        this.voucherName = str;
    }

    public final boolean getHasVoucher() {
        return Intrinsics.areEqual((Object) this.prizeType, (Object) PrizeType.CASHCOUPON) || Intrinsics.areEqual((Object) this.prizeType, (Object) PrizeType.DISCOUNTCOUPON);
    }
}
