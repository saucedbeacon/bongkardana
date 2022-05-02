package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b-\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B­\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J±\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00067"}, d2 = {"Lid/dana/data/electronicmoney/network/response/EmoneyDataEntity;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "approvalCode", "", "apiVersion", "message", "amount", "cardNumber", "reversalCount", "state", "transactionId", "typeCard", "pendingTopup", "session", "lastBalance", "responseFromSam", "status", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getApiVersion", "getApprovalCode", "getCardNumber", "getLastBalance", "getMessage", "getPendingTopup", "getResponseFromSam", "getReversalCount", "getSession", "getState", "getStatus", "getTransactionId", "getTypeCard", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class StartClientBundle extends BaseRpcResult {
    @Nullable
    private final String amount;
    @Nullable
    private final String apiVersion;
    @Nullable
    private final String approvalCode;
    @Nullable
    private final String cardNumber;
    @Nullable
    private final String lastBalance;
    @Nullable
    private final String message;
    @Nullable
    private final String pendingTopup;
    @Nullable
    private final String responseFromSam;
    @Nullable
    private final String reversalCount;
    @Nullable
    private final String session;
    @Nullable
    private final String state;
    @Nullable
    private final String status;
    @Nullable
    private final String transactionId;
    @Nullable
    private final String typeCard;

    public StartClientBundle() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ StartClientBundle copy$default(StartClientBundle startClientBundle, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, Object obj) {
        StartClientBundle startClientBundle2 = startClientBundle;
        int i2 = i;
        return startClientBundle.copy((i2 & 1) != 0 ? startClientBundle2.approvalCode : str, (i2 & 2) != 0 ? startClientBundle2.apiVersion : str2, (i2 & 4) != 0 ? startClientBundle2.message : str3, (i2 & 8) != 0 ? startClientBundle2.amount : str4, (i2 & 16) != 0 ? startClientBundle2.cardNumber : str5, (i2 & 32) != 0 ? startClientBundle2.reversalCount : str6, (i2 & 64) != 0 ? startClientBundle2.state : str7, (i2 & 128) != 0 ? startClientBundle2.transactionId : str8, (i2 & 256) != 0 ? startClientBundle2.typeCard : str9, (i2 & 512) != 0 ? startClientBundle2.pendingTopup : str10, (i2 & 1024) != 0 ? startClientBundle2.session : str11, (i2 & 2048) != 0 ? startClientBundle2.lastBalance : str12, (i2 & 4096) != 0 ? startClientBundle2.responseFromSam : str13, (i2 & 8192) != 0 ? startClientBundle2.status : str14);
    }

    @Nullable
    public final String component1() {
        return this.approvalCode;
    }

    @Nullable
    public final String component10() {
        return this.pendingTopup;
    }

    @Nullable
    public final String component11() {
        return this.session;
    }

    @Nullable
    public final String component12() {
        return this.lastBalance;
    }

    @Nullable
    public final String component13() {
        return this.responseFromSam;
    }

    @Nullable
    public final String component14() {
        return this.status;
    }

    @Nullable
    public final String component2() {
        return this.apiVersion;
    }

    @Nullable
    public final String component3() {
        return this.message;
    }

    @Nullable
    public final String component4() {
        return this.amount;
    }

    @Nullable
    public final String component5() {
        return this.cardNumber;
    }

    @Nullable
    public final String component6() {
        return this.reversalCount;
    }

    @Nullable
    public final String component7() {
        return this.state;
    }

    @Nullable
    public final String component8() {
        return this.transactionId;
    }

    @Nullable
    public final String component9() {
        return this.typeCard;
    }

    @NotNull
    public final StartClientBundle copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
        return new StartClientBundle(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartClientBundle)) {
            return false;
        }
        StartClientBundle startClientBundle = (StartClientBundle) obj;
        return Intrinsics.areEqual((Object) this.approvalCode, (Object) startClientBundle.approvalCode) && Intrinsics.areEqual((Object) this.apiVersion, (Object) startClientBundle.apiVersion) && Intrinsics.areEqual((Object) this.message, (Object) startClientBundle.message) && Intrinsics.areEqual((Object) this.amount, (Object) startClientBundle.amount) && Intrinsics.areEqual((Object) this.cardNumber, (Object) startClientBundle.cardNumber) && Intrinsics.areEqual((Object) this.reversalCount, (Object) startClientBundle.reversalCount) && Intrinsics.areEqual((Object) this.state, (Object) startClientBundle.state) && Intrinsics.areEqual((Object) this.transactionId, (Object) startClientBundle.transactionId) && Intrinsics.areEqual((Object) this.typeCard, (Object) startClientBundle.typeCard) && Intrinsics.areEqual((Object) this.pendingTopup, (Object) startClientBundle.pendingTopup) && Intrinsics.areEqual((Object) this.session, (Object) startClientBundle.session) && Intrinsics.areEqual((Object) this.lastBalance, (Object) startClientBundle.lastBalance) && Intrinsics.areEqual((Object) this.responseFromSam, (Object) startClientBundle.responseFromSam) && Intrinsics.areEqual((Object) this.status, (Object) startClientBundle.status);
    }

    public final int hashCode() {
        String str = this.approvalCode;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.apiVersion;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.message;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.amount;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.cardNumber;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.reversalCount;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.state;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.transactionId;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.typeCard;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.pendingTopup;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.session;
        int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.lastBalance;
        int hashCode12 = (hashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.responseFromSam;
        int hashCode13 = (hashCode12 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.status;
        if (str14 != null) {
            i = str14.hashCode();
        }
        return hashCode13 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("EmoneyDataEntity(approvalCode=");
        sb.append(this.approvalCode);
        sb.append(", apiVersion=");
        sb.append(this.apiVersion);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", cardNumber=");
        sb.append(this.cardNumber);
        sb.append(", reversalCount=");
        sb.append(this.reversalCount);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", transactionId=");
        sb.append(this.transactionId);
        sb.append(", typeCard=");
        sb.append(this.typeCard);
        sb.append(", pendingTopup=");
        sb.append(this.pendingTopup);
        sb.append(", session=");
        sb.append(this.session);
        sb.append(", lastBalance=");
        sb.append(this.lastBalance);
        sb.append(", responseFromSam=");
        sb.append(this.responseFromSam);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\n\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lid/dana/data/electronicmoney/network/request/EmoneyTopupCommandRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "cardType", "", "cardProvider", "reversal", "", "data", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "getCardProvider", "()Ljava/lang/String;", "getCardType", "getData", "()Ljava/util/Map;", "getReversal", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.StartClientBundle$1  reason: invalid class name */
    public final class AnonymousClass1 extends BaseRpcRequest {
        @NotNull
        private final String cardProvider;
        @NotNull
        private final String cardType;
        @NotNull
        private final Map<String, String> data;
        @Nullable
        private final Boolean reversal;

        @NotNull
        public final String getCardType() {
            return this.cardType;
        }

        @NotNull
        public final String getCardProvider() {
            return this.cardProvider;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(String str, String str2, Boolean bool, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? Boolean.FALSE : bool, map);
        }

        @Nullable
        public final Boolean getReversal() {
            return this.reversal;
        }

        @NotNull
        public final Map<String, String> getData() {
            return this.data;
        }

        public AnonymousClass1(@NotNull String str, @NotNull String str2, @Nullable Boolean bool, @NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(str, "cardType");
            Intrinsics.checkNotNullParameter(str2, "cardProvider");
            Intrinsics.checkNotNullParameter(map, "data");
            this.cardType = str;
            this.cardProvider = str2;
            this.reversal = bool;
            this.data = map;
        }
    }

    @Nullable
    public final String getApprovalCode() {
        return this.approvalCode;
    }

    @Nullable
    public final String getApiVersion() {
        return this.apiVersion;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getCardNumber() {
        return this.cardNumber;
    }

    @Nullable
    public final String getReversalCount() {
        return this.reversalCount;
    }

    @Nullable
    public final String getState() {
        return this.state;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }

    @Nullable
    public final String getTypeCard() {
        return this.typeCard;
    }

    @Nullable
    public final String getPendingTopup() {
        return this.pendingTopup;
    }

    @Nullable
    public final String getSession() {
        return this.session;
    }

    @Nullable
    public final String getLastBalance() {
        return this.lastBalance;
    }

    @Nullable
    public final String getResponseFromSam() {
        return this.responseFromSam;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StartClientBundle(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r15 = this;
            r0 = r30
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r16
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r17
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = r2
            goto L_0x001c
        L_0x001a:
            r4 = r18
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0022
            r5 = r2
            goto L_0x0024
        L_0x0022:
            r5 = r19
        L_0x0024:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002a
            r6 = r2
            goto L_0x002c
        L_0x002a:
            r6 = r20
        L_0x002c:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0032
            r7 = r2
            goto L_0x0034
        L_0x0032:
            r7 = r21
        L_0x0034:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003a
            r8 = r2
            goto L_0x003c
        L_0x003a:
            r8 = r22
        L_0x003c:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0042
            r9 = r2
            goto L_0x0044
        L_0x0042:
            r9 = r23
        L_0x0044:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x004a
            r10 = r2
            goto L_0x004c
        L_0x004a:
            r10 = r24
        L_0x004c:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0052
            r11 = r2
            goto L_0x0054
        L_0x0052:
            r11 = r25
        L_0x0054:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x005a
            r12 = r2
            goto L_0x005c
        L_0x005a:
            r12 = r26
        L_0x005c:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0062
            r13 = r2
            goto L_0x0064
        L_0x0062:
            r13 = r27
        L_0x0064:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x006a
            r14 = r2
            goto L_0x006c
        L_0x006a:
            r14 = r28
        L_0x006c:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r2 = r29
        L_0x0073:
            r16 = r15
            r17 = r1
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r10
            r26 = r11
            r27 = r12
            r28 = r13
            r29 = r14
            r30 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.StartClientBundle.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public StartClientBundle(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
        this.approvalCode = str;
        this.apiVersion = str2;
        this.message = str3;
        this.amount = str4;
        this.cardNumber = str5;
        this.reversalCount = str6;
        this.state = str7;
        this.transactionId = str8;
        this.typeCard = str9;
        this.pendingTopup = str10;
        this.session = str11;
        this.lastBalance = str12;
        this.responseFromSam = str13;
        this.status = str14;
    }
}
