package id.dana.social;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.common.base.Ascii;
import id.dana.DanaApplication;
import id.dana.usereducation.BottomSheetOnBoardingActivity;
import java.util.HashMap;
import java.util.Random;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AUHorizontalListView;
import o.AUPopSupportPreemption;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lid/dana/social/FriendshipBottomSheetOnBoardingActivity;", "Lid/dana/usereducation/BottomSheetOnBoardingActivity;", "()V", "friendshipAnalyticTracker", "Lid/dana/social/tracker/FriendshipAnalyticTracker;", "getFriendshipAnalyticTracker", "()Lid/dana/social/tracker/FriendshipAnalyticTracker;", "setFriendshipAnalyticTracker", "(Lid/dana/social/tracker/FriendshipAnalyticTracker;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class FriendshipBottomSheetOnBoardingActivity extends BottomSheetOnBoardingActivity {
    @NotNull
    public static final setMin Companion = new setMin((byte) 0);
    public static final byte[] getMax = {94, 70, 35, 104, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    public static final int setMax = 109;
    @Inject
    public AUHorizontalListView.SelectionNotifier friendshipAnalyticTracker;
    private HashMap getMin;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMax(short r6, byte r7, byte r8) {
        /*
            int r7 = r7 * 175
            int r7 = 178 - r7
            int r6 = r6 * 45
            int r6 = r6 + 56
            int r8 = r8 * 165
            int r8 = 176 - r8
            byte[] r0 = getMax
            byte[] r1 = new byte[r8]
            int r8 = r8 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            r6 = r7
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            goto L_0x0035
        L_0x001b:
            r3 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x001f:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L_0x002e
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x002e:
            byte r3 = r0[r6]
            r5 = r0
            r0 = r8
            r8 = r3
            r3 = r1
            r1 = r5
        L_0x0035:
            int r7 = r7 + r8
            int r7 = r7 + -2
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.social.FriendshipBottomSheetOnBoardingActivity.getMax(short, byte, byte):java.lang.String");
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

    @NotNull
    public final AUHorizontalListView.SelectionNotifier getFriendshipAnalyticTracker() {
        int length;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-236232760, oncanceled);
            onCancelLoad.getMin(-236232760, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-236232760, oncanceled2);
            onCancelLoad.getMin(-236232760, oncanceled2);
        }
        AUHorizontalListView.SelectionNotifier selectionNotifier = this.friendshipAnalyticTracker;
        if (selectionNotifier == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendshipAnalyticTracker");
        }
        return selectionNotifier;
    }

    public final void setFriendshipAnalyticTracker(@NotNull AUHorizontalListView.SelectionNotifier selectionNotifier) {
        Intrinsics.checkNotNullParameter(selectionNotifier, "<set-?>");
        this.friendshipAnalyticTracker = selectionNotifier;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lid/dana/social/FriendshipBottomSheetOnBoardingActivity$Companion;", "", "()V", "createOnBoardingIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "onBoardingModel", "Lid/dana/usereducation/model/OnBoardingModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        int length;
        int min;
        int max;
        byte[] bArr = getMax;
        byte b = (byte) bArr[85];
        String max2 = getMax(b, (byte) b, (byte) bArr[8]);
        byte[] bArr2 = getMax;
        byte b2 = (byte) bArr2[8];
        String max3 = getMax(b2, (byte) b2, (byte) bArr2[85]);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, max2, max3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length2 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length2) {
            onCanceled oncanceled = new onCanceled(nextInt, length2, 1);
            onCancelLoad.setMax(1856474840, oncanceled);
            onCancelLoad.getMin(1856474840, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || 1856474840 == (max = dispatchOnCancelled.getMax(applicationContext2, 1856474840)))) {
            onCanceled oncanceled2 = new onCanceled(1856474840, max, 512);
            onCancelLoad.setMax(1856474840, oncanceled2);
            onCancelLoad.getMin(1856474840, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(1856474840, oncanceled3);
            onCancelLoad.getMin(1856474840, oncanceled3);
        }
        super.onCreate(bundle);
        DanaApplication danaApplication = getDanaApplication();
        Intrinsics.checkNotNullExpressionValue(danaApplication, "danaApplication");
        AUPopSupportPreemption socialCommonComponent = danaApplication.getSocialCommonComponent();
        if (socialCommonComponent != null) {
            socialCommonComponent.getMax(this);
        }
    }

    public final void onStart() {
        super.onStart();
        AUHorizontalListView.SelectionNotifier selectionNotifier = this.friendshipAnalyticTracker;
        if (selectionNotifier == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendshipAnalyticTracker");
        }
        selectionNotifier.getMin();
    }
}
