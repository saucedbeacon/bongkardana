package o;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u0019"}, d2 = {"Lid/dana/model/BizInfoBankModel;", "Lid/dana/model/BizInfoModel;", "bizType", "", "remarks", "bankAccountHolderName", "bankAccountFormattedMaskedNo", "userId", "bankAccountIndexNo", "withdrawInstId", "withdrawPayMethod", "withdrawPayOption", "withdrawInstLocalName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankAccountFormattedMaskedNo", "()Ljava/lang/String;", "getBankAccountHolderName", "getBankAccountIndexNo", "getRemarks", "getUserId", "getWithdrawInstId", "getWithdrawInstLocalName", "getWithdrawPayMethod", "getWithdrawPayOption", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class measureText extends postWebViewMessage {
    @NotNull
    public static final length isInside = new length((byte) 0);
    @NotNull
    public final String IsOverlapping;
    @NotNull
    public final String equals;
    @NotNull
    public final String getMax;
    @NotNull
    public final String getMin;
    @NotNull
    public final String length;
    @NotNull
    public final String setMax;
    @NotNull
    public final String setMin;
    @NotNull
    public final String toFloatRange;
    @NotNull
    public final String toIntRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private measureText(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "bizType");
        Intrinsics.checkNotNullParameter(str2, "remarks");
        Intrinsics.checkNotNullParameter(str3, "bankAccountHolderName");
        Intrinsics.checkNotNullParameter(str4, "bankAccountFormattedMaskedNo");
        Intrinsics.checkNotNullParameter(str5, "userId");
        Intrinsics.checkNotNullParameter(str6, "bankAccountIndexNo");
        Intrinsics.checkNotNullParameter(str7, "withdrawInstId");
        Intrinsics.checkNotNullParameter(str8, "withdrawPayMethod");
        Intrinsics.checkNotNullParameter(str9, "withdrawPayOption");
        Intrinsics.checkNotNullParameter(str10, "withdrawInstLocalName");
        this.getMax = str2;
        this.getMin = str3;
        this.length = str4;
        this.setMax = str5;
        this.setMin = str6;
        this.IsOverlapping = str7;
        this.equals = str8;
        this.toFloatRange = str9;
        this.toIntRange = str10;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/model/BizInfoBankModel$Companion;", "", "()V", "BANK_ACCOUNT_FORMATTED_MASKED_NO", "", "BANK_ACCOUNT_HOLDER_NAME", "BANK_ACCOUNT_INDEX_NO", "REMARKS", "USER_ID", "WITHDRAW_INST_ID", "WITHDRAW_INST_LOCAL_NAME", "WITHDRAW_PAY_METHOD", "WITHDRAW_PAY_OPTION", "transform", "Lid/dana/model/BizInfoBankModel;", "Lid/dana/model/BizInfoModel;", "bizInfo", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    @JvmStatic
    @NotNull
    public static final measureText setMin(@NotNull postWebViewMessage postwebviewmessage, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(postwebviewmessage, "$this$transform");
        Intrinsics.checkNotNullParameter(map, "bizInfo");
        String str = postwebviewmessage.toString;
        Intrinsics.checkNotNullExpressionValue(str, "bizType");
        String str2 = map.get("remarks");
        String str3 = "";
        String str4 = str2 == null ? str3 : str2;
        String str5 = map.get("bankAccountHolderName");
        String str6 = str5 == null ? str3 : str5;
        String str7 = map.get("bankAccountFormattedMaskedNo");
        String str8 = str7 == null ? str3 : str7;
        String str9 = map.get("userId");
        String str10 = str9 == null ? str3 : str9;
        String str11 = map.get("bankAccountIndexNo");
        String str12 = str11 == null ? str3 : str11;
        String str13 = map.get("withdrawInstId");
        String str14 = str13 == null ? str3 : str13;
        String str15 = map.get("withdrawPayMethod");
        String str16 = str15 == null ? str3 : str15;
        String str17 = map.get("withdrawPayOption");
        String str18 = str17 == null ? str3 : str17;
        String str19 = map.get("withdrawInstLocalName");
        measureText measuretext = new measureText(str, str4, str6, str8, str10, str12, str14, str16, str18, str19 == null ? str3 : str19);
        String str20 = postwebviewmessage.FastBitmap$CoordinateSystem;
        if (str20 == null) {
            str20 = str3;
        }
        measuretext.FastBitmap$CoordinateSystem = str20;
        String str21 = postwebviewmessage.hashCode;
        if (str21 == null) {
            str21 = str3;
        }
        measuretext.hashCode = str21;
        String str22 = postwebviewmessage.hashCode;
        if (str22 == null) {
            str22 = str3;
        }
        measuretext.values = str22;
        String str23 = postwebviewmessage.toDoubleRange;
        if (str23 == null) {
            str23 = str3;
        }
        measuretext.toDoubleRange = str23;
        String str24 = postwebviewmessage.invokeSuspend;
        if (str24 == null) {
            str24 = str3;
        }
        measuretext.invokeSuspend = str24;
        String str25 = postwebviewmessage.Grayscale$Algorithm;
        if (str25 == null) {
            str25 = str3;
        }
        measuretext.Grayscale$Algorithm = str25;
        String str26 = postwebviewmessage.valueOf;
        if (str26 == null) {
            str26 = str3;
        }
        measuretext.valueOf = str26;
        String str27 = postwebviewmessage.invoke;
        if (str27 == null) {
            str27 = str3;
        }
        measuretext.invoke = str27;
        String str28 = postwebviewmessage.Mean$Arithmetic;
        if (str28 == null) {
            str28 = str3;
        }
        measuretext.Mean$Arithmetic = str28;
        String str29 = postwebviewmessage.b;
        if (str29 == null) {
            str29 = str3;
        }
        measuretext.b = str29;
        String str30 = postwebviewmessage.ICustomTabsCallback;
        if (str30 == null) {
            str30 = str3;
        }
        measuretext.ICustomTabsCallback = str30;
        String str31 = postwebviewmessage.create;
        if (str31 == null) {
            str31 = str3;
        }
        measuretext.create = str31;
        String str32 = postwebviewmessage.onNavigationEvent;
        if (str32 != null) {
            str3 = str32;
        }
        measuretext.onNavigationEvent = str3;
        return measuretext;
    }
}
