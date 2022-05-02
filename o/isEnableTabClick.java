package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b0\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B­\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¶\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\u00062\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014¨\u00069"}, d2 = {"Lid/dana/data/h5event/sendmoney/Attributes;", "", "payAccountNo", "", "accountName", "loginStatus", "", "networkScenario", "networkInfoName", "networkInfoScene", "networkInfoSubscene", "merchantReturnUrl", "processingStatus", "merchantTransId", "merchantLogoUrl", "displayMerchantOrder", "orderTitle", "vaExpiredTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getAccountName", "()Ljava/lang/String;", "getDisplayMerchantOrder", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLoginStatus", "getMerchantLogoUrl", "getMerchantReturnUrl", "getMerchantTransId", "getNetworkInfoName", "getNetworkInfoScene", "getNetworkInfoSubscene", "getNetworkScenario", "getOrderTitle", "getPayAccountNo", "getProcessingStatus", "getVaExpiredTime", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lid/dana/data/h5event/sendmoney/Attributes;", "equals", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isEnableTabClick {
    @Nullable
    String accountName;
    @Nullable
    Boolean displayMerchantOrder;
    @Nullable
    Boolean loginStatus;
    @Nullable
    String merchantLogoUrl;
    @Nullable
    String merchantReturnUrl;
    @Nullable
    String merchantTransId;
    @Nullable
    String networkInfoName;
    @Nullable
    String networkInfoScene;
    @Nullable
    String networkInfoSubscene;
    @Nullable
    String networkScenario;
    @Nullable
    String orderTitle;
    @Nullable
    String payAccountNo;
    @Nullable
    String processingStatus;
    @Nullable
    String vaExpiredTime;

    public isEnableTabClick() {
        this((String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ isEnableTabClick copy$default(isEnableTabClick isenabletabclick, String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool2, String str11, String str12, int i, Object obj) {
        isEnableTabClick isenabletabclick2 = isenabletabclick;
        int i2 = i;
        return isenabletabclick.copy((i2 & 1) != 0 ? isenabletabclick2.payAccountNo : str, (i2 & 2) != 0 ? isenabletabclick2.accountName : str2, (i2 & 4) != 0 ? isenabletabclick2.loginStatus : bool, (i2 & 8) != 0 ? isenabletabclick2.networkScenario : str3, (i2 & 16) != 0 ? isenabletabclick2.networkInfoName : str4, (i2 & 32) != 0 ? isenabletabclick2.networkInfoScene : str5, (i2 & 64) != 0 ? isenabletabclick2.networkInfoSubscene : str6, (i2 & 128) != 0 ? isenabletabclick2.merchantReturnUrl : str7, (i2 & 256) != 0 ? isenabletabclick2.processingStatus : str8, (i2 & 512) != 0 ? isenabletabclick2.merchantTransId : str9, (i2 & 1024) != 0 ? isenabletabclick2.merchantLogoUrl : str10, (i2 & 2048) != 0 ? isenabletabclick2.displayMerchantOrder : bool2, (i2 & 4096) != 0 ? isenabletabclick2.orderTitle : str11, (i2 & 8192) != 0 ? isenabletabclick2.vaExpiredTime : str12);
    }

    @Nullable
    public final String component1() {
        return this.payAccountNo;
    }

    @Nullable
    public final String component10() {
        return this.merchantTransId;
    }

    @Nullable
    public final String component11() {
        return this.merchantLogoUrl;
    }

    @Nullable
    public final Boolean component12() {
        return this.displayMerchantOrder;
    }

    @Nullable
    public final String component13() {
        return this.orderTitle;
    }

    @Nullable
    public final String component14() {
        return this.vaExpiredTime;
    }

    @Nullable
    public final String component2() {
        return this.accountName;
    }

    @Nullable
    public final Boolean component3() {
        return this.loginStatus;
    }

    @Nullable
    public final String component4() {
        return this.networkScenario;
    }

    @Nullable
    public final String component5() {
        return this.networkInfoName;
    }

    @Nullable
    public final String component6() {
        return this.networkInfoScene;
    }

    @Nullable
    public final String component7() {
        return this.networkInfoSubscene;
    }

    @Nullable
    public final String component8() {
        return this.merchantReturnUrl;
    }

    @Nullable
    public final String component9() {
        return this.processingStatus;
    }

    @NotNull
    public final isEnableTabClick copy(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable Boolean bool2, @Nullable String str11, @Nullable String str12) {
        return new isEnableTabClick(str, str2, bool, str3, str4, str5, str6, str7, str8, str9, str10, bool2, str11, str12);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isEnableTabClick)) {
            return false;
        }
        isEnableTabClick isenabletabclick = (isEnableTabClick) obj;
        return Intrinsics.areEqual((Object) this.payAccountNo, (Object) isenabletabclick.payAccountNo) && Intrinsics.areEqual((Object) this.accountName, (Object) isenabletabclick.accountName) && Intrinsics.areEqual((Object) this.loginStatus, (Object) isenabletabclick.loginStatus) && Intrinsics.areEqual((Object) this.networkScenario, (Object) isenabletabclick.networkScenario) && Intrinsics.areEqual((Object) this.networkInfoName, (Object) isenabletabclick.networkInfoName) && Intrinsics.areEqual((Object) this.networkInfoScene, (Object) isenabletabclick.networkInfoScene) && Intrinsics.areEqual((Object) this.networkInfoSubscene, (Object) isenabletabclick.networkInfoSubscene) && Intrinsics.areEqual((Object) this.merchantReturnUrl, (Object) isenabletabclick.merchantReturnUrl) && Intrinsics.areEqual((Object) this.processingStatus, (Object) isenabletabclick.processingStatus) && Intrinsics.areEqual((Object) this.merchantTransId, (Object) isenabletabclick.merchantTransId) && Intrinsics.areEqual((Object) this.merchantLogoUrl, (Object) isenabletabclick.merchantLogoUrl) && Intrinsics.areEqual((Object) this.displayMerchantOrder, (Object) isenabletabclick.displayMerchantOrder) && Intrinsics.areEqual((Object) this.orderTitle, (Object) isenabletabclick.orderTitle) && Intrinsics.areEqual((Object) this.vaExpiredTime, (Object) isenabletabclick.vaExpiredTime);
    }

    public final int hashCode() {
        String str = this.payAccountNo;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.accountName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.loginStatus;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str3 = this.networkScenario;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.networkInfoName;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.networkInfoScene;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.networkInfoSubscene;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.merchantReturnUrl;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.processingStatus;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.merchantTransId;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.merchantLogoUrl;
        int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31;
        Boolean bool2 = this.displayMerchantOrder;
        int hashCode12 = (hashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        String str11 = this.orderTitle;
        int hashCode13 = (hashCode12 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.vaExpiredTime;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return hashCode13 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Attributes(payAccountNo=");
        sb.append(this.payAccountNo);
        sb.append(", accountName=");
        sb.append(this.accountName);
        sb.append(", loginStatus=");
        sb.append(this.loginStatus);
        sb.append(", networkScenario=");
        sb.append(this.networkScenario);
        sb.append(", networkInfoName=");
        sb.append(this.networkInfoName);
        sb.append(", networkInfoScene=");
        sb.append(this.networkInfoScene);
        sb.append(", networkInfoSubscene=");
        sb.append(this.networkInfoSubscene);
        sb.append(", merchantReturnUrl=");
        sb.append(this.merchantReturnUrl);
        sb.append(", processingStatus=");
        sb.append(this.processingStatus);
        sb.append(", merchantTransId=");
        sb.append(this.merchantTransId);
        sb.append(", merchantLogoUrl=");
        sb.append(this.merchantLogoUrl);
        sb.append(", displayMerchantOrder=");
        sb.append(this.displayMerchantOrder);
        sb.append(", orderTitle=");
        sb.append(this.orderTitle);
        sb.append(", vaExpiredTime=");
        sb.append(this.vaExpiredTime);
        sb.append(")");
        return sb.toString();
    }

    public isEnableTabClick(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable Boolean bool2, @Nullable String str11, @Nullable String str12) {
        this.payAccountNo = str;
        this.accountName = str2;
        this.loginStatus = bool;
        this.networkScenario = str3;
        this.networkInfoName = str4;
        this.networkInfoScene = str5;
        this.networkInfoSubscene = str6;
        this.merchantReturnUrl = str7;
        this.processingStatus = str8;
        this.merchantTransId = str9;
        this.merchantLogoUrl = str10;
        this.displayMerchantOrder = bool2;
        this.orderTitle = str11;
        this.vaExpiredTime = str12;
    }

    @Nullable
    public final String getPayAccountNo() {
        return this.payAccountNo;
    }

    @Nullable
    public final String getAccountName() {
        return this.accountName;
    }

    @Nullable
    public final Boolean getLoginStatus() {
        return this.loginStatus;
    }

    @Nullable
    public final String getNetworkScenario() {
        return this.networkScenario;
    }

    @Nullable
    public final String getNetworkInfoName() {
        return this.networkInfoName;
    }

    @Nullable
    public final String getNetworkInfoScene() {
        return this.networkInfoScene;
    }

    @Nullable
    public final String getNetworkInfoSubscene() {
        return this.networkInfoSubscene;
    }

    @Nullable
    public final String getMerchantReturnUrl() {
        return this.merchantReturnUrl;
    }

    @Nullable
    public final String getProcessingStatus() {
        return this.processingStatus;
    }

    @Nullable
    public final String getMerchantTransId() {
        return this.merchantTransId;
    }

    @Nullable
    public final String getMerchantLogoUrl() {
        return this.merchantLogoUrl;
    }

    @Nullable
    public final Boolean getDisplayMerchantOrder() {
        return this.displayMerchantOrder;
    }

    @Nullable
    public final String getOrderTitle() {
        return this.orderTitle;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ isEnableTabClick(java.lang.String r16, java.lang.String r17, java.lang.Boolean r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.Boolean r27, java.lang.String r28, java.lang.String r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r15 = this;
            r0 = r30
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r16
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0013
        L_0x0011:
            r3 = r17
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = r2
            goto L_0x001b
        L_0x0019:
            r4 = r18
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            r5 = r2
            goto L_0x0023
        L_0x0021:
            r5 = r19
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0029
            r6 = r2
            goto L_0x002b
        L_0x0029:
            r6 = r20
        L_0x002b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0031
            r7 = r2
            goto L_0x0033
        L_0x0031:
            r7 = r21
        L_0x0033:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0039
            r8 = r2
            goto L_0x003b
        L_0x0039:
            r8 = r22
        L_0x003b:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0041
            r9 = r2
            goto L_0x0043
        L_0x0041:
            r9 = r23
        L_0x0043:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0049
            r10 = r2
            goto L_0x004b
        L_0x0049:
            r10 = r24
        L_0x004b:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0051
            r11 = r2
            goto L_0x0053
        L_0x0051:
            r11 = r25
        L_0x0053:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0059
            r12 = r2
            goto L_0x005b
        L_0x0059:
            r12 = r26
        L_0x005b:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0061
            r13 = r2
            goto L_0x0063
        L_0x0061:
            r13 = r27
        L_0x0063:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0069
            r14 = r2
            goto L_0x006b
        L_0x0069:
            r14 = r28
        L_0x006b:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r2 = r29
        L_0x0072:
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
        throw new UnsupportedOperationException("Method not decompiled: o.isEnableTabClick.<init>(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final String getVaExpiredTime() {
        return this.vaExpiredTime;
    }
}
