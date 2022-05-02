package id.dana.autoroute;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.google.common.base.Ascii;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.richview.HelpListView;
import id.dana.usereducation.model.ContentOnBoardingModel;
import id.dana.webview.WebViewActivity;
import java.util.HashMap;
import java.util.Random;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CornerMarkingDataProvider;
import o.IntRange;
import o.dispatchOnCancelled;
import o.isShowMenu;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import o.resetInternal;
import o.setRightSelected;
import o.toJavaScript;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\u0012\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0014¨\u0006\u0015"}, d2 = {"Lid/dana/autoroute/BottomSheetAutoRoutingInfoActivity;", "Lid/dana/base/BaseActivity;", "()V", "activateAction", "", "getClickableSpan", "Lid/dana/utils/NoUnderlineClickableSpan;", "getContentOnBoardingModels", "", "Lid/dana/usereducation/model/ContentOnBoardingModel;", "getLayout", "", "getTncSpannable", "Landroid/text/Spannable;", "init", "initAdapter", "initListener", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BottomSheetAutoRoutingInfoActivity extends BaseActivity {
    public static final byte[] getMax = {75, 107, -115, -85, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    public static final int setMax = 7;
    private HashMap getMin;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMax(short r7, int r8, int r9) {
        /*
            int r9 = r9 * 165
            int r9 = 176 - r9
            int r8 = r8 + 4
            byte[] r0 = getMax
            int r7 = r7 * 45
            int r7 = 101 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L_0x0016
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            goto L_0x0031
        L_0x0016:
            r3 = 0
        L_0x0017:
            r6 = r9
            r9 = r7
            r7 = r6
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L_0x0029
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L_0x0029:
            byte r3 = r0[r8]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L_0x0031:
            int r7 = -r7
            int r0 = r0 + r7
            int r7 = r0 + -2
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.autoroute.BottomSheetAutoRoutingInfoActivity.getMax(short, int, int):java.lang.String");
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMin == null) {
            this.getMin = new HashMap();
        }
        View view = (View) this.getMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0) {
            return R.layout.activity_bottom_sheet_auto_routing_info;
        }
        onCanceled oncanceled = new onCanceled(0, length2, 4);
        onCancelLoad.setMax(-2010435833, oncanceled);
        onCancelLoad.getMin(-2010435833, oncanceled);
        return R.layout.activity_bottom_sheet_auto_routing_info;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        int length2;
        int min;
        int max;
        byte[] bArr = getMax;
        String max2 = getMax((byte) bArr[8], (short) bArr[85], (byte) bArr[8]);
        byte[] bArr2 = getMax;
        String max3 = getMax((byte) bArr2[96], 174, (byte) bArr2[96]);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, max2, max3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length3 = dispatchOnCancelled.length(nextInt);
        int i = 1;
        if (nextInt != length3) {
            onCanceled oncanceled = new onCanceled(nextInt, length3, 1);
            onCancelLoad.setMax(1089752981, oncanceled);
            onCancelLoad.getMin(1089752981, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || 1089752981 == (max = dispatchOnCancelled.getMax(applicationContext2, 1089752981)))) {
            onCanceled oncanceled2 = new onCanceled(1089752981, max, 512);
            onCancelLoad.setMax(1089752981, oncanceled2);
            onCancelLoad.getMin(1089752981, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 8);
            onCancelLoad.setMax(1089752981, oncanceled3);
            onCancelLoad.getMin(1089752981, oncanceled3);
        }
        int max4 = dispatchOnCancelled.getMax(0);
        if (max4 != 0) {
            onCanceled oncanceled4 = new onCanceled(0, max4, 16);
            onCancelLoad.setMax(1089752981, oncanceled4);
            onCancelLoad.getMin(1089752981, oncanceled4);
        }
        super.onCreate(bundle);
        if (CornerMarkingDataProvider.toDoubleRange() || CornerMarkingDataProvider.values()) {
            i = -1;
        }
        setRequestedOrientation(i);
    }

    public final void onStart() {
        super.onStart();
        overridePendingTransition(R.anim.f782130772050, R.anim.f822130772054);
    }

    public final void init() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -584498468 == (max = dispatchOnCancelled.getMax(applicationContext, -584498468)))) {
            onCanceled oncanceled = new onCanceled(-584498468, max, 512);
            onCancelLoad.setMax(-584498468, oncanceled);
            onCancelLoad.getMin(-584498468, oncanceled);
        }
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.onActionViewExpanded);
        if (textView != null) {
            textView.setText(getString(R.string.bottom_sheet_auto_routing_title));
        }
        TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.SearchView$SavedState);
        if (textView2 != null) {
            int max2 = dispatchOnCancelled.getMax(0);
            if (max2 != 0) {
                onCanceled oncanceled2 = new onCanceled(0, max2, 16);
                onCancelLoad.setMax(1782505770, oncanceled2);
                onCancelLoad.getMin(1782505770, oncanceled2);
            }
            String string = getString(R.string.auto_routing_tnc);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.auto_routing_tnc)");
            String string2 = getString(R.string.terms_and_conditions_text);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.terms_and_conditions_text)");
            CharSequence charSequence = string;
            int indexOf$default = StringsKt.indexOf$default(charSequence, string2, 0, false, 6, (Object) null);
            int length2 = string2.length() + indexOf$default;
            SpannableString spannableString = new SpannableString(charSequence);
            Context context = this;
            spannableString.setSpan(new toJavaScript(context, WebViewActivity.ContentBuilder(context, getString(R.string.tnc), isShowMenu.setMin("/m/standalone/tnc"))), indexOf$default, length2, 33);
            spannableString.setSpan(new ForegroundColorSpan(IntRange.setMax(context, R.color.f18632131099744)), indexOf$default, length2, 33);
            textView2.setText(spannableString);
        }
        TextView textView3 = (TextView) _$_findCachedViewById(resetInternal.setMax.SearchView$SavedState);
        if (textView3 != null) {
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
        }
        String string3 = getString(R.string.info_subtitle_1);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.info_subtitle_1)");
        String string4 = getString(R.string.desc_subtitle_1);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.desc_subtitle_1)");
        String string5 = getString(R.string.info_subtitle_2);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.info_subtitle_2)");
        String string6 = getString(R.string.desc_subtitle_2);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.desc_subtitle_2)");
        String string7 = getString(R.string.info_subtitle_3);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.info_subtitle_3)");
        String string8 = getString(R.string.desc_subtitle_3);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(R.string.desc_subtitle_3)");
        setRightSelected setrightselected = new setRightSelected(CollectionsKt.mutableListOf(new ContentOnBoardingModel((int) R.drawable.ic_autorouting_general_choose_method, string3, string4), new ContentOnBoardingModel((int) R.drawable.ic_autorouting_change_pay_method, string5, string6), new ContentOnBoardingModel((int) R.drawable.ic_autorouting_safety_guard, string7, string8)));
        HelpListView helpListView = (HelpListView) _$_findCachedViewById(resetInternal.setMax.otherwise);
        if (helpListView != null) {
            helpListView.setAdapter(setrightselected);
        }
        View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.Flow);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setOnClickListener(new length(this));
        }
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.create);
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setOnClickListener(new getMax(this));
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.FastBitmap$CoordinateSystem);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setOnClickListener(new getMin(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ BottomSheetAutoRoutingInfoActivity setMin;

        length(BottomSheetAutoRoutingInfoActivity bottomSheetAutoRoutingInfoActivity) {
            this.setMin = bottomSheetAutoRoutingInfoActivity;
        }

        public final void onClick(View view) {
            this.setMin.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ BottomSheetAutoRoutingInfoActivity setMin;

        getMax(BottomSheetAutoRoutingInfoActivity bottomSheetAutoRoutingInfoActivity) {
            this.setMin = bottomSheetAutoRoutingInfoActivity;
        }

        public final void onClick(View view) {
            this.setMin.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ BottomSheetAutoRoutingInfoActivity setMin;

        getMin(BottomSheetAutoRoutingInfoActivity bottomSheetAutoRoutingInfoActivity) {
            this.setMin = bottomSheetAutoRoutingInfoActivity;
        }

        public final void onClick(View view) {
            BottomSheetAutoRoutingInfoActivity.access$activateAction(this.setMin);
        }
    }

    public static final /* synthetic */ void access$activateAction(BottomSheetAutoRoutingInfoActivity bottomSheetAutoRoutingInfoActivity) {
        bottomSheetAutoRoutingInfoActivity.setResult(-1);
        bottomSheetAutoRoutingInfoActivity.finish();
    }
}
