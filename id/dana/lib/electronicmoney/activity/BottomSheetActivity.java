package id.dana.lib.electronicmoney.activity;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.exoplayer2.C;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.common.base.Ascii;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.lib.electronicmoney.DanaEmoney;
import id.dana.richview.CurrencyTextView;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import o.FastBitmap$CoordinateSystem;
import o.FontRes;
import o.ICustomTabsCallback;
import o.ICustomTabsService;
import o.IntRange;
import o.cancelAll;
import o.dispatchOnCancelled;
import o.equals;
import o.hashCode;
import o.invoke;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import o.titleBarContainsStatusBarHeight;
import o.toDoubleRange;
import o.toString;
import o.values;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 72\u00020\u0001:\u000267B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u000fH\u0014J-\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0016¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u000fH\u0014J\b\u0010#\u001a\u00020\u000fH\u0014J\b\u0010$\u001a\u00020\u000fH\u0002J\u0010\u0010%\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010&\u001a\u00020\u000fH\u0002J\u0010\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u000fH\u0002J\u0010\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u001eH\u0002J\u0018\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u001eH\u0002J\b\u00104\u001a\u00020\u000fH\u0002J\u0010\u00105\u001a\u00020\u000f2\u0006\u00100\u001a\u000201H\u0002R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lid/dana/lib/electronicmoney/activity/BottomSheetActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "state", "Lid/dana/lib/electronicmoney/activity/BottomSheetActivity$CardReadState;", "cardReadState", "setCardReadState", "(Lid/dana/lib/electronicmoney/activity/BottomSheetActivity$CardReadState;)V", "nfcAdapter", "Landroid/nfc/NfcAdapter;", "pendingIntent", "Landroid/app/PendingIntent;", "timer", "Landroid/os/CountDownTimer;", "callPhone", "", "finishActivity", "init", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "onPause", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onStart", "processIntentIfAny", "processTag", "setElectronicMoneyBalance", "setTimeout", "timeOutinMillis", "", "setupPhonePermissions", "showFailCardReadState", "danaEmoneyErrorCode", "showSuccessCardReadState", "balanceResult", "Lid/dana/lib/electronicmoney/entity/BalanceResult;", "isReadFromCard", "", "showToastinDebugMode", "brizziErrorCode", "showWirelessSettings", "toggleReadFromCardView", "CardReadState", "Companion", "electronicmoney_release"}, k = 1, mv = {1, 4, 0})
public final class BottomSheetActivity extends AppCompatActivity {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final byte[] getMax = {37, 102, 47, -10, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    public static final int setMin = 236;

    /* renamed from: a  reason: collision with root package name */
    public NfcAdapter f9122a;
    public PendingIntent b;
    public CountDownTimer c;
    public a d = a.TAP_ELECTRONIC_MONEY_CARD;
    public HashMap e;

    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/lib/electronicmoney/activity/BottomSheetActivity$Companion;", "", "()V", "CUSTTOMER_SERVICE_NUMBER", "", "PHONE_REQUEST_CODE", "", "createBottomSheetHelpIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "electronicmoney_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Intent createBottomSheetHelpIntent(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            return new Intent(context, BottomSheetActivity.class);
        }
    }

    public enum a {
        TAP_ELECTRONIC_MONEY_CARD,
        READING_ELECTRONIC_MONEY_CARD,
        SHOWING_BRI_BRIZZI_BALANCE,
        SHOWING_MANDIRI_EMONEY_BALANCE,
        SCAN_CARD_TIMEOUT,
        CARD_READ_FAILED,
        SOMETHING_WRONG,
        CARD_UNSUPPORTED,
        SHOWING_CALL_CS
    }

    public static final class getMin implements View.OnClickListener {
        public final /* synthetic */ BottomSheetActivity setMin;

        public getMin(BottomSheetActivity bottomSheetActivity) {
            this.setMin = bottomSheetActivity;
        }

        public final void onClick(View view) {
            this.setMin.a(a.TAP_ELECTRONIC_MONEY_CARD);
        }
    }

    public static final class length implements View.OnClickListener {
        public final /* synthetic */ BottomSheetActivity setMax;

        public length(BottomSheetActivity bottomSheetActivity) {
            this.setMax = bottomSheetActivity;
        }

        public final void onClick(View view) {
            BottomSheetActivity.access$finishActivity(this.setMax);
        }
    }

    public static final class setMax implements View.OnClickListener {
        public final /* synthetic */ BottomSheetActivity setMin;

        public setMax(BottomSheetActivity bottomSheetActivity) {
            this.setMin = bottomSheetActivity;
        }

        public final void onClick(View view) {
            BottomSheetActivity.access$finishActivity(this.setMin);
        }
    }

    public static final class setMin implements View.OnClickListener {
        public final /* synthetic */ boolean getMin;
        public final /* synthetic */ BottomSheetActivity setMin;

        public setMin(BottomSheetActivity bottomSheetActivity, boolean z) {
            this.setMin = bottomSheetActivity;
            this.getMin = z;
        }

        public final void onClick(View view) {
            if (this.getMin) {
                BottomSheetActivity.access$setupPhonePermissions(this.setMin);
            }
        }
    }

    public static final /* synthetic */ void access$finishActivity(BottomSheetActivity bottomSheetActivity) {
        bottomSheetActivity.setResult(-1);
        bottomSheetActivity.finish();
    }

    public static final /* synthetic */ void access$setupPhonePermissions(BottomSheetActivity bottomSheetActivity) {
        if (bottomSheetActivity == null) {
            throw null;
        } else if (IntRange.length((Context) bottomSheetActivity, "android.permission.CALL_PHONE") != 0) {
            FontRes.getMin(bottomSheetActivity, new String[]{"android.permission.CALL_PHONE"}, 101);
        } else {
            bottomSheetActivity.startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:1500445")));
        }
    }

    public static final /* synthetic */ void access$showSuccessCardReadState(BottomSheetActivity bottomSheetActivity, ICustomTabsCallback iCustomTabsCallback, boolean z) {
        a aVar;
        String str;
        String format;
        String str2;
        if (bottomSheetActivity != null) {
            try {
                TextView textView = (TextView) bottomSheetActivity._$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.values);
                if (textView != null) {
                    ICustomTabsService iCustomTabsService = ICustomTabsService.setMax;
                    String str3 = iCustomTabsCallback.setMin;
                    Intrinsics.checkNotNullParameter(str3, "balance");
                    NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID"));
                    Intrinsics.checkNotNullExpressionValue(currencyInstance, "rupiahFormatter");
                    currencyInstance.setMaximumFractionDigits(0);
                    String format2 = currencyInstance.format(Long.parseLong(str3));
                    Intrinsics.checkNotNullExpressionValue(format2, "rupiahFormatter.format(balance.toLong())");
                    textView.setText(format2);
                }
                TextView textView2 = (TextView) bottomSheetActivity._$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.toDoubleRange);
                if (textView2 != null) {
                    ICustomTabsService iCustomTabsService2 = ICustomTabsService.setMax;
                    textView2.setText(ICustomTabsService.getMax(iCustomTabsCallback.length));
                }
                TextView textView3 = (TextView) bottomSheetActivity._$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.hashCode);
                if (textView3 != null) {
                    if (z) {
                        str = bottomSheetActivity.getString(titleBarContainsStatusBarHeight.setMin.desc_reversal_error);
                    } else {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String string = bottomSheetActivity.getString(titleBarContainsStatusBarHeight.setMin.desc_update_saldo_third);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.desc_update_saldo_third)");
                        Object[] objArr = new Object[1];
                        ICustomTabsService iCustomTabsService3 = ICustomTabsService.setMax;
                        String string2 = bottomSheetActivity.getString(titleBarContainsStatusBarHeight.setMin.date_time_pattern);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.date_time_pattern)");
                        Intrinsics.checkNotNullParameter(string2, "formatPattern");
                        if (Build.VERSION.SDK_INT >= 26) {
                            format = LocalDateTime.now().format(DateTimeFormatter.ofPattern(string2));
                            str2 = "LocalDateTime.now().form…ofPattern(formatPattern))";
                        } else {
                            format = new SimpleDateFormat(string2, Locale.getDefault()).format(new Date());
                            str2 = "SimpleDateFormat(formatP…Default()).format(Date())";
                        }
                        Intrinsics.checkNotNullExpressionValue(format, str2);
                        objArr[0] = format;
                        str = String.format(string, Arrays.copyOf(objArr, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
                    }
                    textView3.setText(str);
                }
                String str4 = iCustomTabsCallback.getMax;
                int hashCode = str4.hashCode();
                if (hashCode != -1380779920) {
                    if (hashCode == -1299343493 && str4.equals("emoney")) {
                        aVar = a.SHOWING_MANDIRI_EMONEY_BALANCE;
                    }
                    bottomSheetActivity.a(z);
                }
                if (str4.equals("brizzi")) {
                    aVar = a.SHOWING_BRI_BRIZZI_BALANCE;
                }
                bottomSheetActivity.a(z);
                bottomSheetActivity.a(aVar);
                bottomSheetActivity.a(z);
            } catch (NumberFormatException unused) {
                bottomSheetActivity.a("001");
            }
        } else {
            throw null;
        }
    }

    public static final /* synthetic */ void access$showToastinDebugMode(BottomSheetActivity bottomSheetActivity, String str) {
        if (bottomSheetActivity == null) {
            throw null;
        }
    }

    @JvmStatic
    @NotNull
    public static final Intent createBottomSheetHelpIntent(@NotNull Context context) {
        return Companion.createBottomSheetHelpIntent(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMin(short r6, byte r7, int r8) {
        /*
            byte[] r0 = getMax
            int r6 = r6 * 45
            int r6 = 101 - r6
            int r8 = r8 * 165
            int r8 = 176 - r8
            int r7 = r7 * 175
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            int r8 = r8 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            r8 = r7
            goto L_0x0032
        L_0x001b:
            r3 = 0
        L_0x001c:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L_0x0027
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0027:
            byte r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L_0x0032:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + -2
            int r7 = r8 + 1
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.lib.electronicmoney.activity.BottomSheetActivity.getMin(short, byte, int):java.lang.String");
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-1819445726, oncanceled);
            onCancelLoad.getMin(-1819445726, oncanceled);
        }
        if (this.e == null) {
            this.e = new HashMap();
        }
        View view = (View) this.e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void a() {
        TextView textView = (TextView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.toString);
        if (textView != null) {
            textView.setVisibility(8);
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.equals);
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.toIntRange);
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.setMax);
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setVisibility(8);
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.getMin);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setVisibility(8);
        }
    }

    public final void a(a aVar) {
        DanaButtonPrimaryView danaButtonPrimaryView;
        this.d = aVar;
        a(false);
        switch (aVar.ordinal()) {
            case 0:
                CountDownTimer countDownTimer = this.c;
                if (countDownTimer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("timer");
                }
                countDownTimer.start();
                TextView textView = (TextView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.toString);
                if (textView != null) {
                    textView.setText(titleBarContainsStatusBarHeight.setMin.title_update_saldo_first);
                }
                TextView textView2 = (TextView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.hashCode);
                if (textView2 != null) {
                    textView2.setText(titleBarContainsStatusBarHeight.setMin.desc_update_saldo_first);
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.equals);
                if (appCompatImageView != null) {
                    appCompatImageView.setImageDrawable(cancelAll.getMin(this, titleBarContainsStatusBarHeight.getMin.ic_tap_e_money));
                }
                DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.setMax);
                if (danaButtonSecondaryView != null) {
                    danaButtonSecondaryView.setVisibility(0);
                }
                danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.getMin);
                if (danaButtonPrimaryView == null) {
                    return;
                }
                break;
            case 1:
                TextView textView3 = (TextView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.toString);
                if (textView3 != null) {
                    textView3.setVisibility(0);
                    textView3.setText(titleBarContainsStatusBarHeight.setMin.title_update_saldo_second);
                }
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.equals);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setVisibility(0);
                    appCompatImageView2.setImageDrawable(cancelAll.getMin(this, titleBarContainsStatusBarHeight.getMin.ic_my_bill));
                }
                TextView textView4 = (TextView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.hashCode);
                if (textView4 != null) {
                    textView4.setText(titleBarContainsStatusBarHeight.setMin.desc_update_saldo_second);
                }
                RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.toIntRange);
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(8);
                }
                DanaButtonSecondaryView danaButtonSecondaryView2 = (DanaButtonSecondaryView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.setMax);
                if (danaButtonSecondaryView2 != null) {
                    danaButtonSecondaryView2.setVisibility(8);
                }
                danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.getMin);
                if (danaButtonPrimaryView == null) {
                    return;
                }
                break;
            case 2:
                a();
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.length);
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setImageDrawable(cancelAll.getMin(this, titleBarContainsStatusBarHeight.getMin.ic_card_brizzi_bg));
                    return;
                }
                return;
            case 3:
                a();
                AppCompatImageView appCompatImageView4 = (AppCompatImageView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.length);
                if (appCompatImageView4 != null) {
                    appCompatImageView4.setImageDrawable(cancelAll.getMin(this, titleBarContainsStatusBarHeight.getMin.ic_card_emoney_bg));
                    return;
                }
                return;
            case 4:
                TextView textView5 = (TextView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.toString);
                if (textView5 != null) {
                    textView5.setText(titleBarContainsStatusBarHeight.setMin.title_scan_card_time_out);
                }
                TextView textView6 = (TextView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.hashCode);
                if (textView6 != null) {
                    textView6.setText(titleBarContainsStatusBarHeight.setMin.desc_scan_card_time_out);
                }
                AppCompatImageView appCompatImageView5 = (AppCompatImageView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.equals);
                if (appCompatImageView5 != null) {
                    appCompatImageView5.setImageDrawable(cancelAll.getMin(this, titleBarContainsStatusBarHeight.getMin.ic_time_out));
                }
                DanaButtonSecondaryView danaButtonSecondaryView3 = (DanaButtonSecondaryView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.setMax);
                if (danaButtonSecondaryView3 != null) {
                    danaButtonSecondaryView3.setVisibility(8);
                }
                DanaButtonPrimaryView danaButtonPrimaryView2 = (DanaButtonPrimaryView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.getMin);
                if (danaButtonPrimaryView2 != null) {
                    danaButtonPrimaryView2.setActiveButton(getString(titleBarContainsStatusBarHeight.setMin.scan_card), (Drawable) null);
                    danaButtonPrimaryView2.setVisibility(0);
                    danaButtonPrimaryView2.setOnClickListener(new getMin(this));
                    return;
                }
                return;
            case 5:
                TextView textView7 = (TextView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.toString);
                if (textView7 != null) {
                    textView7.setText(titleBarContainsStatusBarHeight.setMin.title_card_read_failed);
                }
                TextView textView8 = (TextView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.hashCode);
                if (textView8 != null) {
                    textView8.setText(titleBarContainsStatusBarHeight.setMin.desc_card_read_failed);
                }
                AppCompatImageView appCompatImageView6 = (AppCompatImageView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.equals);
                if (appCompatImageView6 != null) {
                    appCompatImageView6.setImageDrawable(cancelAll.getMin(this, titleBarContainsStatusBarHeight.getMin.ic_read_failed));
                }
                DanaButtonSecondaryView danaButtonSecondaryView4 = (DanaButtonSecondaryView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.setMax);
                if (danaButtonSecondaryView4 != null) {
                    danaButtonSecondaryView4.setVisibility(8);
                }
                DanaButtonPrimaryView danaButtonPrimaryView3 = (DanaButtonPrimaryView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.getMin);
                if (danaButtonPrimaryView3 != null) {
                    danaButtonPrimaryView3.setActiveButton(getString(17039370), (Drawable) null);
                    danaButtonPrimaryView3.setVisibility(0);
                    danaButtonPrimaryView3.setOnClickListener(new setMax(this));
                    return;
                }
                return;
            case 6:
                TextView textView9 = (TextView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.toString);
                if (textView9 != null) {
                    textView9.setText(titleBarContainsStatusBarHeight.setMin.title_something_wrong);
                }
                TextView textView10 = (TextView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.hashCode);
                if (textView10 != null) {
                    textView10.setText(titleBarContainsStatusBarHeight.setMin.desc_something_wrong);
                }
                AppCompatImageView appCompatImageView7 = (AppCompatImageView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.equals);
                if (appCompatImageView7 != null) {
                    appCompatImageView7.setImageDrawable(cancelAll.getMin(this, titleBarContainsStatusBarHeight.getMin.ic_read_failed));
                }
                DanaButtonSecondaryView danaButtonSecondaryView5 = (DanaButtonSecondaryView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.setMax);
                if (danaButtonSecondaryView5 != null) {
                    danaButtonSecondaryView5.setVisibility(8);
                }
                DanaButtonPrimaryView danaButtonPrimaryView4 = (DanaButtonPrimaryView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.getMin);
                if (danaButtonPrimaryView4 != null) {
                    danaButtonPrimaryView4.setActiveButton(getString(17039370), (Drawable) null);
                    danaButtonPrimaryView4.setVisibility(0);
                    danaButtonPrimaryView4.setOnClickListener(new length(this));
                    return;
                }
                return;
            case 7:
                TextView textView11 = (TextView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.toString);
                if (textView11 != null) {
                    textView11.setText(titleBarContainsStatusBarHeight.setMin.title_card_unsupported);
                }
                TextView textView12 = (TextView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.hashCode);
                if (textView12 != null) {
                    textView12.setText(titleBarContainsStatusBarHeight.setMin.desc_card_unsupported);
                }
                AppCompatImageView appCompatImageView8 = (AppCompatImageView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.equals);
                if (appCompatImageView8 != null) {
                    appCompatImageView8.setImageDrawable(cancelAll.getMin(this, titleBarContainsStatusBarHeight.getMin.ic_card_unsupported));
                }
                DanaButtonSecondaryView danaButtonSecondaryView6 = (DanaButtonSecondaryView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.setMax);
                if (danaButtonSecondaryView6 != null) {
                    danaButtonSecondaryView6.setVisibility(0);
                }
                danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.getMin);
                if (danaButtonPrimaryView == null) {
                    return;
                }
                break;
            case 8:
                TextView textView13 = (TextView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.toString);
                if (textView13 != null) {
                    textView13.setText(titleBarContainsStatusBarHeight.setMin.title_call_cs);
                }
                TextView textView14 = (TextView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.hashCode);
                if (textView14 != null) {
                    textView14.setText(titleBarContainsStatusBarHeight.setMin.desc_call_cs);
                }
                AppCompatImageView appCompatImageView9 = (AppCompatImageView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.equals);
                if (appCompatImageView9 != null) {
                    appCompatImageView9.setImageDrawable(cancelAll.getMin(this, titleBarContainsStatusBarHeight.getMin.ic_call_cs));
                }
                LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.isInside);
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                DanaButtonSecondaryView danaButtonSecondaryView7 = (DanaButtonSecondaryView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.setMax);
                if (danaButtonSecondaryView7 != null) {
                    danaButtonSecondaryView7.setVisibility(8);
                }
                danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.getMin);
                if (danaButtonPrimaryView == null) {
                    return;
                }
                break;
            default:
                return;
        }
        danaButtonPrimaryView.setVisibility(8);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r5) {
        /*
            r4 = this;
            android.content.Context r0 = r4.getBaseContext()
            if (r0 == 0) goto L_0x000b
            android.content.Context r0 = r0.getApplicationContext()
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 == 0) goto L_0x0029
            java.lang.String[] r1 = r0.fileList()
            int r1 = r1.length
            int r0 = o.dispatchOnCancelled.getMin(r0, r1)
            if (r1 == r0) goto L_0x0029
            o.onCanceled r2 = new o.onCanceled
            r3 = 32
            r2.<init>(r1, r0, r3)
            r0 = 870686178(0x33e59de2, float:1.0692362E-7)
            o.onCancelLoad.setMax(r0, r2)
            o.onCancelLoad.getMin(r0, r2)
        L_0x0029:
            int r0 = r5.hashCode()
            switch(r0) {
                case 47665: goto L_0x005d;
                case 47666: goto L_0x0030;
                case 47667: goto L_0x0030;
                case 47668: goto L_0x0052;
                case 47669: goto L_0x0047;
                case 47670: goto L_0x0030;
                case 47671: goto L_0x003c;
                case 47672: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0062
        L_0x0031:
            java.lang.String r0 = "008"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0062
            id.dana.lib.electronicmoney.activity.BottomSheetActivity$a r5 = id.dana.lib.electronicmoney.activity.BottomSheetActivity.a.SHOWING_CALL_CS
            goto L_0x0064
        L_0x003c:
            java.lang.String r0 = "007"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0062
            id.dana.lib.electronicmoney.activity.BottomSheetActivity$a r5 = id.dana.lib.electronicmoney.activity.BottomSheetActivity.a.SCAN_CARD_TIMEOUT
            goto L_0x0064
        L_0x0047:
            java.lang.String r0 = "005"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0062
            id.dana.lib.electronicmoney.activity.BottomSheetActivity$a r5 = id.dana.lib.electronicmoney.activity.BottomSheetActivity.a.CARD_READ_FAILED
            goto L_0x0064
        L_0x0052:
            java.lang.String r0 = "004"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0062
            id.dana.lib.electronicmoney.activity.BottomSheetActivity$a r5 = id.dana.lib.electronicmoney.activity.BottomSheetActivity.a.CARD_UNSUPPORTED
            goto L_0x0064
        L_0x005d:
            java.lang.String r0 = "001"
            r5.equals(r0)
        L_0x0062:
            id.dana.lib.electronicmoney.activity.BottomSheetActivity$a r5 = id.dana.lib.electronicmoney.activity.BottomSheetActivity.a.SOMETHING_WRONG
        L_0x0064:
            r4.a((id.dana.lib.electronicmoney.activity.BottomSheetActivity.a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.lib.electronicmoney.activity.BottomSheetActivity.a(java.lang.String):void");
    }

    public final void a(boolean z) {
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.getMin);
        int i = 0;
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setVisibility(z ? 0 : 8);
            danaButtonPrimaryView.setActiveButton(getString(z ? titleBarContainsStatusBarHeight.setMin.contact_us : 17039370), (Drawable) null);
            danaButtonPrimaryView.setOnClickListener(new setMin(this, z));
        }
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.IsOverlapping);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "ll_container_reversal_error");
        if (!z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    public final void onCreate(@Nullable Bundle bundle) {
        Intent intent;
        int length2;
        int min;
        int max;
        int max2;
        byte b2 = (byte) getMax[8];
        byte b3 = (byte) b2;
        String min2 = getMin(b2, b3, (byte) b3);
        byte b4 = (byte) getMax[96];
        byte b5 = (byte) b4;
        String min3 = getMin(b4, b5, (byte) b5);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, min2, min3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length3 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length3) {
            onCanceled oncanceled = new onCanceled(nextInt, length3, 1);
            onCancelLoad.setMax(-1063554794, oncanceled);
            onCancelLoad.getMin(-1063554794, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (max2 = dispatchOnCancelled.setMax(applicationContext2, 0, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 2);
            onCancelLoad.setMax(-1063554794, oncanceled2);
            onCancelLoad.getMin(-1063554794, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        Context applicationContext3 = baseContext3 != null ? baseContext3.getApplicationContext() : null;
        if (!(applicationContext3 == null || -1063554794 == (max = dispatchOnCancelled.getMax(applicationContext3, -1063554794)))) {
            onCanceled oncanceled3 = new onCanceled(-1063554794, max, 512);
            onCancelLoad.setMax(-1063554794, oncanceled3);
            onCancelLoad.getMin(-1063554794, oncanceled3);
        }
        Context baseContext4 = getBaseContext();
        if (baseContext4 != null) {
            context = baseContext4.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length2)))) {
            onCanceled oncanceled4 = new onCanceled(length2, min, 8);
            onCancelLoad.setMax(-1063554794, oncanceled4);
            onCancelLoad.getMin(-1063554794, oncanceled4);
        }
        super.onCreate(bundle);
        setContentView(titleBarContainsStatusBarHeight.length.activity_bottom_sheet);
        DanaEmoney danaEmoney = DanaEmoney.getMax;
        Long max3 = DanaEmoney.getMax();
        if (max3 != null) {
            this.c = new invoke(this, max3.longValue());
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.toFloatRange);
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new equals(this));
        }
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.setMax);
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setOnClickListener(new hashCode(this));
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.getMin);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setOnClickListener(new values(this));
        }
        DanaButtonSecondaryView danaButtonSecondaryView2 = (DanaButtonSecondaryView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.setMin);
        if (danaButtonSecondaryView2 != null) {
            danaButtonSecondaryView2.setOnClickListener(new FastBitmap$CoordinateSystem(this));
        }
        DanaButtonPrimaryView danaButtonPrimaryView2 = (DanaButtonPrimaryView) _$_findCachedViewById(titleBarContainsStatusBarHeight.setMax.getMax);
        if (danaButtonPrimaryView2 != null) {
            danaButtonPrimaryView2.setOnClickListener(new toDoubleRange(this));
        }
        a(a.TAP_ELECTRONIC_MONEY_CARD);
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this);
        Intrinsics.checkNotNullExpressionValue(defaultAdapter, "NfcAdapter.getDefaultAdapter(this)");
        this.f9122a = defaultAdapter;
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent(this, BottomSheetActivity.class).addFlags(C.ENCODING_PCM_A_LAW), 0);
        Intrinsics.checkNotNullExpressionValue(activity, "PendingIntent.getActivit…_SINGLE_TOP), 0\n        )");
        this.b = activity;
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, IpcMessageConstants.EXTRA_INTENT);
        Bundle extras = intent2.getExtras();
        if (extras != null && (intent = (Intent) extras.getParcelable("android.nfc.extra.TAG")) != null) {
            a(a.READING_ELECTRONIC_MONEY_CARD);
            try {
                DanaEmoney danaEmoney2 = DanaEmoney.getMax;
                DanaEmoney.getMax(intent, new toString(this));
            } catch (IllegalAccessException unused) {
                a("004");
            }
        }
    }

    public final void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, IpcMessageConstants.EXTRA_INTENT);
        super.onNewIntent(intent);
        String action = intent.getAction();
        if (Intrinsics.areEqual((Object) "android.nfc.action.TAG_DISCOVERED", (Object) action) || Intrinsics.areEqual((Object) "android.nfc.action.TECH_DISCOVERED", (Object) action) || Intrinsics.areEqual((Object) "android.nfc.action.NDEF_DISCOVERED", (Object) action)) {
            a(a.READING_ELECTRONIC_MONEY_CARD);
            try {
                DanaEmoney danaEmoney = DanaEmoney.getMax;
                DanaEmoney.getMax(intent, new toString(this));
            } catch (IllegalAccessException unused) {
                a("004");
            }
        }
    }

    public final void onPause() {
        super.onPause();
        NfcAdapter nfcAdapter = this.f9122a;
        if (nfcAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nfcAdapter");
        }
        nfcAdapter.disableForegroundDispatch(this);
    }

    public final void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        int min;
        int max;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -251763362 == (max = dispatchOnCancelled.getMax(applicationContext, -251763362)))) {
            onCanceled oncanceled = new onCanceled(-251763362, max, 512);
            onCancelLoad.setMax(-251763362, oncanceled);
            onCancelLoad.getMin(-251763362, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || i == (min = dispatchOnCancelled.setMin(context, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-251763362, oncanceled2);
            onCancelLoad.getMin(-251763362, oncanceled2);
        }
        Intrinsics.checkNotNullParameter(strArr, RequestPermission.PERMISSIONS);
        Intrinsics.checkNotNullParameter(iArr, RequestPermission.GRANT_RESULTS);
        if (i == 101) {
            if ((!(iArr.length == 0)) && iArr[0] == 0) {
                startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:1500445")));
            }
        }
    }

    public final void onResume() {
        super.onResume();
        NfcAdapter nfcAdapter = this.f9122a;
        if (nfcAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nfcAdapter");
        }
        if (!nfcAdapter.isEnabled()) {
            startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
        }
        NfcAdapter nfcAdapter2 = this.f9122a;
        if (nfcAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nfcAdapter");
        }
        PendingIntent pendingIntent = this.b;
        if (pendingIntent == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BaseGmsClient.KEY_PENDING_INTENT);
        }
        nfcAdapter2.enableForegroundDispatch(this, pendingIntent, (IntentFilter[]) null, (String[][]) null);
    }

    public final void onStart() {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-766495374, oncanceled);
            onCancelLoad.getMin(-766495374, oncanceled);
        }
        super.onStart();
        overridePendingTransition(titleBarContainsStatusBarHeight.getMax.getMin, titleBarContainsStatusBarHeight.getMax.getMax);
    }
}
