package o;

import android.content.Context;
import android.content.Intent;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.domain.qrbarcode.DecodeQrBizType;
import id.dana.sendmoney.RecipientActivity;
import id.dana.sendmoney.model.QrRequestBankTransferModel;
import id.dana.sendmoney.model.QrTransferModel;
import id.dana.sendmoney_v2.landing.SendMoneyActivity;
import id.dana.tracker.TrackerKey;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.DatePickerBridgeExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\f\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0014J\f\u0010\u000f\u001a\u00020\n*\u00020\nH\u0002J\f\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0002J\f\u0010\u0013\u001a\u00020\u0007*\u00020\u0014H\u0002J\f\u0010\u0015\u001a\u00020\f*\u00020\u0011H\u0002¨\u0006\u0016"}, d2 = {"Lid/dana/scanner/handler/nativepages/ScannerSendMoneyToBankHandler;", "Lid/dana/scanner/handler/nativepages/BaseScannerNativePageHandler;", "context", "Landroid/content/Context;", "scanModel", "Lid/dana/model/ScanModel;", "viewType", "", "(Landroid/content/Context;Lid/dana/model/ScanModel;Ljava/lang/String;)V", "buildQrTransferModel", "Lid/dana/sendmoney/model/QrRequestBankTransferModel;", "startAction", "", "target", "Ljava/lang/Class;", "applyTrackerSource", "createIntent", "Landroid/content/Intent;", "Lid/dana/sendmoney/model/QrTransferModel;", "getAvatarUrl", "Lid/dana/model/BizInfoBankModel;", "start", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ImageEncoder extends APEncodeOptions {
    public ImageEncoder(@Nullable Context context, @Nullable fillPageCommonInfo fillpagecommoninfo, @Nullable String str) {
        super(context, fillpagecommoninfo, str);
    }

    public final void setMin() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        Intent intent;
        fillPageCommonInfo length = length();
        postWebViewMessage bizInfo = length != null ? length.getBizInfo() : null;
        if (!(bizInfo instanceof measureText)) {
            bizInfo = null;
        }
        measureText measuretext = (measureText) bizInfo;
        String str15 = measuretext != null ? measuretext.getMin : null;
        String str16 = str15 == null ? "" : str15;
        String str17 = measuretext != null ? measuretext.length : null;
        if (str17 == null) {
            str = "";
        } else {
            str = str17;
        }
        String str18 = measuretext != null ? measuretext.setMax : null;
        if (str18 == null) {
            str2 = "";
        } else {
            str2 = str18;
        }
        String str19 = measuretext != null ? measuretext.setMin : null;
        if (str19 == null) {
            str3 = "";
        } else {
            str3 = str19;
        }
        String str20 = measuretext != null ? measuretext.IsOverlapping : null;
        if (str20 == null) {
            str4 = "";
        } else {
            str4 = str20;
        }
        String str21 = measuretext != null ? measuretext.equals : null;
        if (str21 == null) {
            str5 = "";
        } else {
            str5 = str21;
        }
        String str22 = measuretext != null ? measuretext.toFloatRange : null;
        if (str22 == null) {
            str6 = "";
        } else {
            str6 = str22;
        }
        if (measuretext != null) {
            str7 = measuretext.toIntRange;
        } else {
            str7 = null;
        }
        if (str7 == null) {
            str8 = "";
        } else {
            str8 = str7;
        }
        if (measuretext != null) {
            Object[] objArr = new Object[1];
            String str23 = measuretext.IsOverlapping;
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
            if (str23 != null) {
                String lowerCase = str23.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                objArr[0] = lowerCase;
                str9 = String.format("https://a.m.dana.id/resource/imgs/skywalker/bankicons/%s.png", Arrays.copyOf(objArr, 1));
                Intrinsics.checkNotNullExpressionValue(str9, "java.lang.String.format(this, *args)");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        } else {
            str9 = null;
        }
        if (str9 == null) {
            str10 = "";
        } else {
            str10 = str9;
        }
        if (measuretext != null) {
            str11 = measuretext.FastBitmap$CoordinateSystem;
        } else {
            str11 = null;
        }
        if (str11 == null) {
            str12 = "";
        } else {
            str12 = str11;
        }
        if (measuretext != null) {
            str13 = measuretext.getMax;
        } else {
            str13 = null;
        }
        if (str13 == null) {
            str13 = "";
        }
        fillPageCommonInfo length2 = length();
        String bizType = length2 != null ? length2.getBizType() : null;
        if (bizType == null) {
            str14 = "";
        } else {
            str14 = bizType;
        }
        String str24 = str13;
        QrRequestBankTransferModel qrRequestBankTransferModel = r2;
        QrRequestBankTransferModel qrRequestBankTransferModel2 = new QrRequestBankTransferModel(str12, str10, str14, str24, (String) null, (String) null, (String) null, str16, str, str2, str3, str4, str5, str6, str8, 112);
        fillPageCommonInfo length3 = length();
        if (length3 != null) {
            length3.setSource((Intrinsics.areEqual((Object) qrRequestBankTransferModel.getMin, (Object) DecodeQrBizType.TRANSFER_BANK_ACCOUNT_CODE) || DatePickerBridgeExtension.AnonymousClass7.setMax(qrRequestBankTransferModel.setMax, 0) > 0) ? TrackerKey.SourceType.REQUEST_MONEY_TO_BANK_WITH_AMOUNT : TrackerKey.SourceType.REQUEST_MONEY_TO_BANK_WITHOUT_AMOUNT);
        }
        QrTransferModel qrTransferModel = qrRequestBankTransferModel;
        fillPageCommonInfo length4 = length();
        Intrinsics.checkNotNullExpressionValue(length4, "scanModel");
        if (length4.isSendMoneyV2()) {
            SendMoneyActivity.setMax setmax = SendMoneyActivity.Companion;
            Context max = setMax();
            fillPageCommonInfo length5 = length();
            String source = length5 != null ? length5.getSource() : null;
            if (source == null) {
                source = "";
            }
            intent = SendMoneyActivity.setMax.setMax(max, qrTransferModel, "request_money", source, BranchLinkConstant.ActionTarget.SEND_MONEY_BANK);
        } else {
            Context max2 = setMax();
            fillPageCommonInfo length6 = length();
            String source2 = length6 != null ? length6.getSource() : null;
            if (source2 == null) {
                source2 = "";
            }
            intent = RecipientActivity.createTransferIntent(max2, qrTransferModel, "request_money", source2, BranchLinkConstant.ActionTarget.SEND_MONEY_BANK);
            Intrinsics.checkNotNullExpressionValue(intent, "RecipientActivity.create…onTarget.SEND_MONEY_BANK)");
        }
        getMax(intent);
    }
}
