package id.dana.usereducation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.common.base.Ascii;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.richview.HelpListView;
import id.dana.usereducation.model.ContentOnBoardingModel;
import id.dana.usereducation.model.OnBoardingModel;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CornerMarkingDataProvider;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import o.resetInternal;
import o.setRightSelected;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0002J\b\u0010\u000e\u001a\u00020\tH\u0002J\u0012\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0014J\b\u0010\u0013\u001a\u00020\tH\u0002J\f\u0010\u0014\u001a\u00020\t*\u00020\u0015H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lid/dana/usereducation/BottomSheetHelpActivity;", "Lid/dana/base/BaseActivity;", "()V", "contentOnBoardingModels", "", "Lid/dana/usereducation/model/ContentOnBoardingModel;", "dismissOutside", "", "finishActivity", "", "getLayout", "", "init", "initAdapter", "initListener", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "prepareBundleData", "setOnBoardingContents", "Lid/dana/usereducation/model/OnBoardingModel;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public class BottomSheetHelpActivity extends BaseActivity {
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    public static final byte[] getMax = {55, Byte.MAX_VALUE, 56, -94, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    public static final int toIntRange = 16;
    private List<ContentOnBoardingModel> getMin;
    private HashMap isInside;
    /* access modifiers changed from: private */
    public boolean setMax = true;

    @JvmStatic
    @NotNull
    @JvmOverloads
    public static final Intent createBottomSheetHelpIntent(@NotNull Context context, @NotNull OnBoardingModel onBoardingModel) {
        return getMin.length(context, onBoardingModel, true);
    }

    @JvmStatic
    @NotNull
    @JvmOverloads
    public static final Intent createBottomSheetHelpIntent(@NotNull Context context, @NotNull OnBoardingModel onBoardingModel, boolean z) {
        return getMin.length(context, onBoardingModel, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMin(byte r5, short r6, byte r7) {
        /*
            int r7 = r7 * 45
            int r7 = r7 + 56
            int r5 = r5 * 165
            int r5 = r5 + 11
            byte[] r0 = getMax
            int r6 = r6 + 4
            byte[] r1 = new byte[r5]
            r2 = -1
            int r5 = r5 + r2
            if (r0 != 0) goto L_0x0019
            r7 = r6
            r2 = r1
            r3 = -1
            r6 = r5
            r1 = r0
            r0 = r7
            goto L_0x0032
        L_0x0019:
            int r2 = r2 + 1
            byte r3 = (byte) r7
            r1[r2] = r3
            int r6 = r6 + 1
            if (r2 != r5) goto L_0x0029
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            return r5
        L_0x0029:
            byte r3 = r0[r6]
            r4 = r6
            r6 = r5
            r5 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r4
        L_0x0032:
            int r5 = -r5
            int r7 = r7 + r5
            int r7 = r7 + -2
            r5 = r6
            r6 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.usereducation.BottomSheetHelpActivity.getMin(byte, short, byte):java.lang.String");
    }

    public void _$_clearFindViewByIdCache() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-293171904, oncanceled);
            onCancelLoad.getMin(-293171904, oncanceled);
        }
        HashMap hashMap = this.isInside;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        int min;
        int min2;
        int max;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (max = dispatchOnCancelled.getMax(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, max, 512);
            onCancelLoad.setMax(-71704916, oncanceled);
            onCancelLoad.getMin(-71704916, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || i == (min2 = dispatchOnCancelled.setMin(applicationContext2, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min2, 8);
            onCancelLoad.setMax(-71704916, oncanceled2);
            onCancelLoad.getMin(-71704916, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || i == (min = dispatchOnCancelled.getMin(context, i)))) {
            onCanceled oncanceled3 = new onCanceled(i, min, 32);
            onCancelLoad.setMax(-71704916, oncanceled3);
            onCancelLoad.getMin(-71704916, oncanceled3);
        }
        if (this.isInside == null) {
            this.isInside = new HashMap();
        }
        View view = (View) this.isInside.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.isInside.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int getLayout() {
        int max = dispatchOnCancelled.getMax(0);
        if (max == 0) {
            return R.layout.activity_help_bottom_sheet;
        }
        onCanceled oncanceled = new onCanceled(0, max, 16);
        onCancelLoad.setMax(1920731222, oncanceled);
        onCancelLoad.getMin(1920731222, oncanceled);
        return R.layout.activity_help_bottom_sheet;
    }

    public void onCreate(@Nullable Bundle bundle) {
        int length;
        int min;
        int max;
        byte[] bArr = getMax;
        String min2 = getMin((byte) bArr[96], (short) bArr[85], (byte) bArr[96]);
        byte[] bArr2 = getMax;
        byte b = (byte) bArr2[8];
        String min3 = getMin(b, (short) (b | 174), (byte) bArr2[8]);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, min2, min3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length2 = dispatchOnCancelled.length(nextInt);
        int i = 1;
        if (nextInt != length2) {
            onCanceled oncanceled = new onCanceled(nextInt, length2, 1);
            onCancelLoad.setMax(-1943720172, oncanceled);
            onCancelLoad.getMin(-1943720172, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || -1943720172 == (max = dispatchOnCancelled.getMax(applicationContext2, -1943720172)))) {
            onCanceled oncanceled2 = new onCanceled(-1943720172, max, 512);
            onCancelLoad.setMax(-1943720172, oncanceled2);
            onCancelLoad.getMin(-1943720172, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(-1943720172, oncanceled3);
            onCancelLoad.getMin(-1943720172, oncanceled3);
        }
        super.onCreate(bundle);
        if (CornerMarkingDataProvider.toDoubleRange() || CornerMarkingDataProvider.values()) {
            i = -1;
        }
        setRequestedOrientation(i);
    }

    public void onStart() {
        super.onStart();
        overridePendingTransition(R.anim.f782130772050, R.anim.f822130772054);
    }

    public void init() {
        int length;
        int min;
        String str;
        int length2;
        int max;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1786632096 == (max = dispatchOnCancelled.getMax(applicationContext, -1786632096)))) {
            onCanceled oncanceled = new onCanceled(-1786632096, max, 512);
            onCancelLoad.setMax(-1786632096, oncanceled);
            onCancelLoad.getMin(-1786632096, oncanceled);
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            OnBoardingModel onBoardingModel = (OnBoardingModel) extras.getParcelable("data");
            if (onBoardingModel != null) {
                Context baseContext2 = getBaseContext();
                Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
                if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
                    onCanceled oncanceled2 = new onCanceled(0, length2, 4);
                    onCancelLoad.setMax(1405455470, oncanceled2);
                    onCancelLoad.getMin(1405455470, oncanceled2);
                }
                TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getApplicationContext);
                if (textView != null) {
                    textView.setText(onBoardingModel.getMin);
                }
                this.getMin = onBoardingModel.getMax;
            }
            this.setMax = extras.getBoolean("dismiss_outside", true);
            OnBoardingModel onBoardingModel2 = (OnBoardingModel) extras.getParcelable("data");
            if (onBoardingModel2 != null) {
                str = onBoardingModel2.setMin;
            } else {
                str = null;
            }
            if (StringsKt.equals(str, "kyc_supporting_doc", true)) {
                ImageView imageView = (ImageView) _$_findCachedViewById(resetInternal.setMax.hasLogo);
                Intrinsics.checkNotNullExpressionValue(imageView, "rect_grey");
                imageView.setVisibility(0);
            }
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1719526066, oncanceled3);
            onCancelLoad.getMin(1719526066, oncanceled3);
        }
        List<ContentOnBoardingModel> list = this.getMin;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentOnBoardingModels");
        }
        ((HelpListView) _$_findCachedViewById(resetInternal.setMax.otherwise)).setAdapter(new setRightSelected(list));
        Button button = (Button) _$_findCachedViewById(resetInternal.setMax.getSmallIconId);
        if (button != null) {
            button.setOnClickListener(new setMax(this));
        }
        View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.isAttachedToWindow);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setOnClickListener(new setMin(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ BottomSheetHelpActivity getMin;

        setMax(BottomSheetHelpActivity bottomSheetHelpActivity) {
            this.getMin = bottomSheetHelpActivity;
        }

        public final void onClick(View view) {
            BottomSheetHelpActivity.access$finishActivity(this.getMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ BottomSheetHelpActivity getMin;

        setMin(BottomSheetHelpActivity bottomSheetHelpActivity) {
            this.getMin = bottomSheetHelpActivity;
        }

        public final void onClick(View view) {
            if (this.getMin.setMax) {
                BottomSheetHelpActivity.access$finishActivity(this.getMin);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/usereducation/BottomSheetHelpActivity$Companion;", "", "()V", "BUNDLE_DISMISS_OUTSIDE", "", "createBottomSheetHelpIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "onBoardingModel", "Lid/dana/usereducation/model/OnBoardingModel;", "dismissOutside", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }

        @JvmStatic
        @NotNull
        @JvmOverloads
        public static Intent length(@NotNull Context context, @NotNull OnBoardingModel onBoardingModel, boolean z) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(onBoardingModel, "onBoardingModel");
            Intent intent = new Intent(context, BottomSheetHelpActivity.class);
            intent.putExtra("data", onBoardingModel);
            intent.putExtra("dismiss_outside", z);
            return intent;
        }
    }

    public static final /* synthetic */ void access$finishActivity(BottomSheetHelpActivity bottomSheetHelpActivity) {
        bottomSheetHelpActivity.setResult(-1);
        bottomSheetHelpActivity.finish();
    }
}
