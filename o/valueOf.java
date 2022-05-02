package o;

import android.content.Intent;
import android.nfc.tech.IsoDep;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import id.co.bri.sdk.exception.BrizziException;
import id.dana.data.sendmoney.model.TransferUserInfoResult;
import id.dana.lib.electronicmoney.bri.model.ReversalResult;
import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.TabBarBridgeExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0014J1\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\n0\rJ+\u0010\u0012\u001a\u00020\n2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\n0\rH\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0014J3\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00142!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\n0\rH\u0002J+\u0010\u0017\u001a\u00020\n2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\n0\rH\u0014J+\u0010\u0018\u001a\u00020\n2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\n0\rH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lid/dana/lib/electronicmoney/bri/BriEntityRepository;", "Lid/dana/lib/electronicmoney/base/AbstractElectronicmoneyRepository;", "isoDep", "Landroid/nfc/tech/IsoDep;", "request", "Lid/dana/lib/electronicmoney/manager/BankRequestEntity;", "(Landroid/nfc/tech/IsoDep;Lid/dana/lib/electronicmoney/manager/BankRequestEntity;)V", "check", "", "doBalanceInquiry", "", "fromHistory", "onResult", "Lkotlin/Function1;", "Lid/dana/lib/electronicmoney/entity/BalanceResult;", "Lkotlin/ParameterName;", "name", "balanceResult", "doHistoryObject", "getCardType", "", "mapBrizziErrorCode", "brizziErrorCode", "reversal", "update", "Companion", "electronicmoney_release"}, k = 1, mv = {1, 4, 0})
public final class valueOf extends Mean$Arithmetic {
    public final create getMax;

    public static final class length implements unScrap {
        public final /* synthetic */ Function1 getMax;
        public final /* synthetic */ valueOf length;

        public length(valueOf valueof, Function1 function1) {
            this.length = valueof;
            this.getMax = function1;
        }

        public final void getMax(@Nullable BrizziException brizziException) {
            String errorCode = brizziException.getErrorCode();
            if (errorCode != null) {
                int hashCode = errorCode.hashCode();
                if (hashCode != 1567) {
                    if (hashCode == 1575 && errorCode.equals("18")) {
                        valueOf.getMin(this.length, "18", this.getMax);
                        return;
                    }
                } else if (errorCode.equals(MonitorUtil.ERROR_CODE_EMPTY)) {
                    Function1 function1 = this.getMax;
                    ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255);
                    iCustomTabsCallback.setMax = false;
                    iCustomTabsCallback.equals = true;
                    Unit unit = Unit.INSTANCE;
                    function1.invoke(iCustomTabsCallback);
                    return;
                }
            }
            this.length.setMax(false, this.getMax);
        }

        public final void getMin(@NotNull clearReturnedFromScrapFlag clearreturnedfromscrapflag) {
            Intrinsics.checkNotNullParameter(clearreturnedfromscrapflag, "brizziCardObject");
            Function1 function1 = this.getMax;
            ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255);
            iCustomTabsCallback.setMax = true;
            String str = clearreturnedfromscrapflag.setMin;
            Intrinsics.checkNotNullExpressionValue(str, "brizziCardObject.balance");
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            iCustomTabsCallback.setMin = str;
            String str2 = clearreturnedfromscrapflag.setMax;
            Intrinsics.checkNotNullExpressionValue(str2, "brizziCardObject.cardNumber");
            Intrinsics.checkNotNullParameter(str2, "<set-?>");
            iCustomTabsCallback.length = str2;
            String str3 = clearreturnedfromscrapflag.toFloatRange;
            Intrinsics.checkNotNullExpressionValue(str3, "brizziCardObject.lastTrxDate");
            Intrinsics.checkNotNullParameter(str3, "<set-?>");
            iCustomTabsCallback.getMin = str3;
            Unit unit = Unit.INSTANCE;
            function1.invoke(iCustomTabsCallback);
        }
    }

    public static final class setMax implements unScrap {
        public final /* synthetic */ boolean getMax;
        public final /* synthetic */ Function1 length;
        public final /* synthetic */ valueOf setMin;

        public setMax(valueOf valueof, boolean z, Function1 function1) {
            this.setMin = valueof;
            this.getMax = z;
            this.length = function1;
        }

        public final void getMax(@Nullable BrizziException brizziException) {
            if (!this.getMax) {
                valueOf valueof = this.setMin;
                String errorCode = brizziException.getErrorCode();
                Intrinsics.checkNotNullExpressionValue(errorCode, "e.errorCode");
                valueOf.getMin(valueof, errorCode, this.length);
                return;
            }
            valueOf.getMin(this.setMin, TabBarItemColorModel.LIMIT, this.length);
        }

        public final void getMin(@NotNull clearReturnedFromScrapFlag clearreturnedfromscrapflag) {
            Intrinsics.checkNotNullParameter(clearreturnedfromscrapflag, "brizziCardObject");
            if (!this.getMax) {
                Function1 function1 = this.length;
                ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255);
                iCustomTabsCallback.setMax = true;
                String str = clearreturnedfromscrapflag.setMin;
                Intrinsics.checkNotNullExpressionValue(str, "brizziCardObject.balance");
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                iCustomTabsCallback.setMin = str;
                String str2 = clearreturnedfromscrapflag.setMax;
                Intrinsics.checkNotNullExpressionValue(str2, "brizziCardObject.cardNumber");
                Intrinsics.checkNotNullParameter(str2, "<set-?>");
                iCustomTabsCallback.length = str2;
                String str3 = clearreturnedfromscrapflag.toFloatRange;
                Intrinsics.checkNotNullExpressionValue(str3, "brizziCardObject.lastTrxDate");
                Intrinsics.checkNotNullParameter(str3, "<set-?>");
                iCustomTabsCallback.getMin = str3;
                Unit unit = Unit.INSTANCE;
                function1.invoke(iCustomTabsCallback);
                return;
            }
            valueOf.getMin(this.setMin, TabBarItemColorModel.LIMIT, this.length);
            TabBarBridgeExtension.AnonymousClass2 r0 = this.setMin.getMax.setMax;
            if (r0 != null) {
                WindowBridgeExtension windowBridgeExtension = this.setMin.getMax.length;
                Intrinsics.checkNotNull(windowBridgeExtension);
                String str4 = windowBridgeExtension.length;
                String str5 = clearreturnedfromscrapflag.setMax;
                Intrinsics.checkNotNullExpressionValue(str5, "brizziCardObject.cardNumber");
                String str6 = clearreturnedfromscrapflag.toFloatRange;
                Intrinsics.checkNotNullExpressionValue(str6, "brizziCardObject.lastTrxDate");
                String str7 = clearreturnedfromscrapflag.setMin;
                Intrinsics.checkNotNullExpressionValue(str7, "brizziCardObject.balance");
                r0.needReversal(new ReversalResult((String) null, str4, str5, str6, str7, TabBarItemColorModel.LIMIT, (List) null, 65));
            }
        }
    }

    public valueOf(@NotNull IsoDep isoDep, @NotNull create create) {
        Intrinsics.checkNotNullParameter(isoDep, "isoDep");
        Intrinsics.checkNotNullParameter(create, RequestPermissionsEvent.REQUEST);
        this.getMax = create;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r12.equals("09") != false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r12.equals("08") != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r12.equals("07") != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r12.equals("06") != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        r2 = new o.ICustomTabsCallback(false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 255);
        r2.setMax = false;
        r2.isInside = "004";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        if (r12.equals("05") != false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        if (r12.equals("18") != false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0073, code lost:
        if (r12.equals("17") != false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007d, code lost:
        if (r12.equals("16") != false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0087, code lost:
        if (r12.equals(com.alibaba.griver.bluetooth.ble.ErrorConstants.ERROR_CODE_15) != false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r12.equals("14") != false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        if (r12.equals("63") != false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
        if (r12.equals("62") != false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ac, code lost:
        if (r12.equals("61") != false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f1, code lost:
        if (r12.equals("03") != false) goto L_0x00f3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void getMin(o.valueOf r11, java.lang.String r12, kotlin.jvm.functions.Function1 r13) {
        /*
            if (r11 == 0) goto L_0x0126
            int r11 = r12.hashCode()
            r0 = 1539(0x603, float:2.157E-42)
            r1 = 0
            if (r11 == r0) goto L_0x00eb
            r0 = 1598(0x63e, float:2.239E-42)
            if (r11 == r0) goto L_0x00cd
            r0 = 1816(0x718, float:2.545E-42)
            if (r11 == r0) goto L_0x00af
            switch(r11) {
                case 1541: goto L_0x0059;
                case 1542: goto L_0x003a;
                case 1543: goto L_0x0031;
                case 1544: goto L_0x0028;
                case 1545: goto L_0x001e;
                default: goto L_0x0016;
            }
        L_0x0016:
            switch(r11) {
                case 1571: goto L_0x008b;
                case 1572: goto L_0x0081;
                case 1573: goto L_0x0077;
                case 1574: goto L_0x006d;
                case 1575: goto L_0x0063;
                default: goto L_0x0019;
            }
        L_0x0019:
            switch(r11) {
                case 1723: goto L_0x00a6;
                case 1724: goto L_0x009d;
                case 1725: goto L_0x0094;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0109
        L_0x001e:
            java.lang.String r11 = "09"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x0109
            goto L_0x00f3
        L_0x0028:
            java.lang.String r11 = "08"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x0109
            goto L_0x0042
        L_0x0031:
            java.lang.String r11 = "07"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x0109
            goto L_0x0042
        L_0x003a:
            java.lang.String r11 = "06"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x0109
        L_0x0042:
            o.ICustomTabsCallback r11 = new o.ICustomTabsCallback
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 255(0xff, float:3.57E-43)
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r11.setMax = r1
            java.lang.String r0 = "004"
            r11.isInside = r0
            goto L_0x011e
        L_0x0059:
            java.lang.String r11 = "05"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x0109
            goto L_0x00f3
        L_0x0063:
            java.lang.String r11 = "18"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x0109
            goto L_0x00f3
        L_0x006d:
            java.lang.String r11 = "17"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x0109
            goto L_0x00f3
        L_0x0077:
            java.lang.String r11 = "16"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x0109
            goto L_0x00f3
        L_0x0081:
            java.lang.String r11 = "15"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x0109
            goto L_0x00f3
        L_0x008b:
            java.lang.String r11 = "14"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x0109
            goto L_0x00f3
        L_0x0094:
            java.lang.String r11 = "63"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x0109
            goto L_0x00f3
        L_0x009d:
            java.lang.String r11 = "62"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x0109
            goto L_0x00f3
        L_0x00a6:
            java.lang.String r11 = "61"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x0109
            goto L_0x00f3
        L_0x00af:
            java.lang.String r11 = "91"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x0109
            o.ICustomTabsCallback r11 = new o.ICustomTabsCallback
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 255(0xff, float:3.57E-43)
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r11.setMax = r1
            java.lang.String r0 = "007"
            r11.isInside = r0
            goto L_0x011e
        L_0x00cd:
            java.lang.String r11 = "20"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x0109
            o.ICustomTabsCallback r11 = new o.ICustomTabsCallback
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 255(0xff, float:3.57E-43)
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r11.setMax = r1
            java.lang.String r0 = "008"
            r11.isInside = r0
            goto L_0x011e
        L_0x00eb:
            java.lang.String r11 = "03"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x0109
        L_0x00f3:
            o.ICustomTabsCallback r11 = new o.ICustomTabsCallback
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 255(0xff, float:3.57E-43)
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r11.setMax = r1
            java.lang.String r0 = "005"
            r11.isInside = r0
            goto L_0x011e
        L_0x0109:
            o.ICustomTabsCallback r11 = new o.ICustomTabsCallback
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 255(0xff, float:3.57E-43)
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r11.setMax = r1
            java.lang.String r0 = "001"
            r11.isInside = r0
        L_0x011e:
            r11.toFloatRange = r12
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            r13.invoke(r11)
            return
        L_0x0126:
            r11 = 0
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.valueOf.getMin(o.valueOf, java.lang.String, kotlin.jvm.functions.Function1):void");
    }

    public final boolean getMax() {
        return true;
    }

    @NotNull
    public final String getMin() {
        return "brizzi";
    }

    public final void setMax(boolean z, @NotNull Function1<? super ICustomTabsCallback, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onResult");
        if (this.getMax.length == null) {
            function1.invoke(new ICustomTabsCallback(false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255));
        }
        if (clearTmpDetachFlag.getMax == null) {
            clearTmpDetachFlag.getMax = new clearTmpDetachFlag();
        }
        clearTmpDetachFlag cleartmpdetachflag = clearTmpDetachFlag.getMax;
        Intent intent = this.getMax.getMin;
        setMax setmax = new setMax(this, z, function1);
        try {
            if (cleartmpdetachflag.setMin != null) {
                isBound isbound = cleartmpdetachflag.length;
                isbound.toIntRange = cleartmpdetachflag.getMin;
                isBound.setMin();
                isbound.equals = isbound.toIntRange.getPackageName();
                isbound.isInside = setScrapContainer.getMax(isBound.setMin);
                isBound isbound2 = cleartmpdetachflag.length;
                String str = cleartmpdetachflag.setMin;
                isInvalid.getMax(isbound2.getMax, isbound2.getMin);
                isbound2.IsOverlapping = setmax;
                IsoDep min = isBound.getMin(intent);
                isbound2.setMax = min != null ? min.getTag().getId() : new byte[0];
                isbound2.length(min, isbound2.length(), isbound2.getMax, isbound2.getMin, str);
                return;
            }
            throw setScrapContainer.getMax("17");
        } catch (BrizziException e) {
            setmax.getMax(e);
        }
    }

    public static final class setMin implements needsUpdate {
        public final /* synthetic */ valueOf getMax;
        public final /* synthetic */ Function1 setMin;

        public setMin(valueOf valueof, Function1 function1) {
            this.getMax = valueof;
            this.setMin = function1;
        }

        public final void getMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "reversalData");
            Function1 function1 = this.setMin;
            ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255);
            iCustomTabsCallback.setMax = false;
            iCustomTabsCallback.isInside = "005";
            Unit unit = Unit.INSTANCE;
            function1.invoke(iCustomTabsCallback);
            TabBarBridgeExtension.AnonymousClass2 r0 = this.getMax.getMax.setMax;
            if (r0 != null) {
                WindowBridgeExtension windowBridgeExtension = this.getMax.getMax.length;
                Intrinsics.checkNotNull(windowBridgeExtension);
                r0.needReversal(new ReversalResult(str, windowBridgeExtension.length, (String) null, (String) null, (String) null, TransferUserInfoResult.KycLevel.KYC_0, (List) null, 92));
            }
        }

        public final void getMin(@Nullable BrizziException brizziException) {
            if (Intrinsics.areEqual((Object) brizziException.getErrorCode(), (Object) TabBarItemColorModel.LIMIT)) {
                valueOf valueof = this.getMax;
                Function1 function1 = this.setMin;
                if (valueof != null) {
                    if (clearTmpDetachFlag.getMax == null) {
                        clearTmpDetachFlag.getMax = new clearTmpDetachFlag();
                    }
                    clearTmpDetachFlag cleartmpdetachflag = clearTmpDetachFlag.getMax;
                    Intent intent = valueof.getMax.getMin;
                    onNavigationEvent onnavigationevent = new onNavigationEvent(valueof, function1);
                    try {
                        if (cleartmpdetachflag.setMin != null) {
                            isBound isbound = cleartmpdetachflag.length;
                            isbound.toIntRange = cleartmpdetachflag.getMin;
                            isBound.setMin();
                            isbound.equals = isbound.toIntRange.getPackageName();
                            isbound.isInside = setScrapContainer.getMax(isBound.setMin);
                            isBound isbound2 = cleartmpdetachflag.length;
                            String str = cleartmpdetachflag.setMin;
                            isInvalid.getMax(isbound2.getMax, isbound2.getMin);
                            isbound2.IsOverlapping = onnavigationevent;
                            IsoDep min = isBound.getMin(intent);
                            isbound2.setMax = min != null ? min.getTag().getId() : new byte[0];
                            isbound2.getMax(min, isbound2.length(), isbound2.getMax, isbound2.getMin, str);
                            return;
                        }
                        throw setScrapContainer.getMax("17");
                    } catch (BrizziException e) {
                        onnavigationevent.getMax(e);
                    }
                } else {
                    throw null;
                }
            }
        }
    }

    public final void getMin(@NotNull Function1<? super ICustomTabsCallback, Unit> function1) {
        String str;
        Intrinsics.checkNotNullParameter(function1, "onResult");
        if (clearTmpDetachFlag.getMax == null) {
            clearTmpDetachFlag.getMax = new clearTmpDetachFlag();
        }
        clearTmpDetachFlag cleartmpdetachflag = clearTmpDetachFlag.getMax;
        create create = this.getMax;
        Intent intent = create.getMin;
        WindowBridgeExtension windowBridgeExtension = create.length;
        if (windowBridgeExtension != null) {
            str = windowBridgeExtension.length;
        } else {
            str = null;
        }
        String str2 = str;
        length length2 = new length(this, function1);
        try {
            if (cleartmpdetachflag.setMin != null) {
                isBound isbound = cleartmpdetachflag.length;
                isbound.toIntRange = cleartmpdetachflag.getMin;
                isBound.setMin();
                isbound.equals = isbound.toIntRange.getPackageName();
                isbound.isInside = setScrapContainer.getMax(isBound.setMin);
                isBound isbound2 = cleartmpdetachflag.length;
                String str3 = cleartmpdetachflag.setMin;
                isInvalid.getMax(isbound2.getMax, isbound2.getMin);
                isbound2.IsOverlapping = length2;
                IsoDep min = isBound.getMin(intent);
                isbound2.setMax = min != null ? min.getTag().getId() : new byte[0];
                isbound2.getMin(min, isbound2.length(), isbound2.getMax, isbound2.getMin, str3, str2);
                return;
            }
            throw setScrapContainer.getMax("17");
        } catch (BrizziException e) {
            length2.getMax(e);
        }
    }

    public final void setMin(@NotNull Function1<? super ICustomTabsCallback, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onResult");
        if (clearTmpDetachFlag.getMax == null) {
            clearTmpDetachFlag.getMax = new clearTmpDetachFlag();
        }
        clearTmpDetachFlag cleartmpdetachflag = clearTmpDetachFlag.getMax;
        setMin setmin = new setMin(this, function1);
        try {
            isBound isbound = cleartmpdetachflag.length;
            isbound.toFloatRange = setmin;
            String str = isbound.length;
            if (str == null || str.isEmpty()) {
                throw setScrapContainer.getMax(TabBarItemColorModel.LIMIT);
            }
            isbound.toFloatRange.getMin(isbound.length);
        } catch (BrizziException e) {
            setmin.getMin(e);
        }
    }
}
