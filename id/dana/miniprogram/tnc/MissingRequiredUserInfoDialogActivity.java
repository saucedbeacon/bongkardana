package id.dana.miniprogram.tnc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.google.common.base.Ascii;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonGhostView;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.danah5.DanaH5;
import id.dana.danah5.showagreement.ShowAgreementBridge;
import id.dana.di.modules.OauthModule;
import id.dana.richview.CurrencyTextView;
import id.dana.social.view.activity.ChangeUsernameActivity;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import o.GriverUniformPromptExtension;
import o.PrepareException;
import o.dispatchOnCancelled;
import o.evaluate;
import o.getDuration;
import o.isShowMenu;
import o.onCancelLoad;
import o.onCanceled;
import o.onInput;
import o.registerOnLoadCanceledListener;
import o.resetInternal;
import o.setCancelOnTouchOutside$core;
import o.stopIgnoring;
import o.updateCornerMarking;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0002J\b\u0010\u0011\u001a\u00020\fH\u0016J\u0012\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\fH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lid/dana/miniprogram/tnc/MissingRequiredUserInfoDialogActivity;", "Lid/dana/base/BaseActivity;", "()V", "readLinkPropertiesPresenter", "Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "getReadLinkPropertiesPresenter", "()Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "setReadLinkPropertiesPresenter", "(Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;)V", "startParams", "Lid/dana/miniprogram/tnc/MissingRequiredUserInfoDialogActivity$StartParams;", "completeData", "", "getLayout", "", "init", "injectComponent", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showIcon", "Companion", "StartParams", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MissingRequiredUserInfoDialogActivity extends BaseActivity {
    @NotNull
    public static final setMin Companion = new setMin((byte) 0);
    @NotNull
    public static final String EXTRA_START_PARAMS = "startParams";
    public static final int getMin = 0;
    public static final byte[] setMax = {124, -124, 44, -103, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    private HashMap IsOverlapping;
    private StartParams getMax;
    @Inject
    public getDuration.length readLinkPropertiesPresenter;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String length(short r5, int r6, byte r7) {
        /*
            byte[] r0 = setMax
            int r7 = r7 * 165
            int r7 = r7 + 11
            int r6 = r6 * 45
            int r6 = r6 + 56
            int r5 = r5 * 175
            int r5 = r5 + 4
            byte[] r1 = new byte[r7]
            r2 = -1
            int r7 = r7 + r2
            if (r0 != 0) goto L_0x001b
            r2 = r1
            r3 = -1
            r1 = r0
            r0 = r7
            r7 = r6
            r6 = r5
            goto L_0x0033
        L_0x001b:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            r1[r2] = r3
            if (r2 != r7) goto L_0x0029
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            return r5
        L_0x0029:
            byte r3 = r0[r5]
            r4 = r6
            r6 = r5
            r5 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r7
            r7 = r4
        L_0x0033:
            int r5 = -r5
            int r6 = r6 + 1
            int r7 = r7 + r5
            int r5 = r7 + -2
            r7 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            r4 = r6
            r6 = r5
            r5 = r4
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.miniprogram.tnc.MissingRequiredUserInfoDialogActivity.length(short, int, byte):java.lang.String");
    }

    public final void _$_clearFindViewByIdCache() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1010067633, oncanceled);
            onCancelLoad.getMin(1010067633, oncanceled);
        }
        HashMap hashMap = this.IsOverlapping;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1880018807 == (max = dispatchOnCancelled.getMax(applicationContext, 1880018807)))) {
            onCanceled oncanceled = new onCanceled(1880018807, max, 512);
            onCancelLoad.setMax(1880018807, oncanceled);
            onCancelLoad.getMin(1880018807, oncanceled);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(1880018807, oncanceled2);
            onCancelLoad.getMin(1880018807, oncanceled2);
        }
        if (this.IsOverlapping == null) {
            this.IsOverlapping = new HashMap();
        }
        View view = (View) this.IsOverlapping.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.IsOverlapping.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.dialog_missing_required_user_info;
    }

    @NotNull
    public final getDuration.length getReadLinkPropertiesPresenter() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(290171238, oncanceled);
            onCancelLoad.getMin(290171238, oncanceled);
        }
        getDuration.length length2 = this.readLinkPropertiesPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("readLinkPropertiesPresenter");
        }
        return length2;
    }

    public final void setReadLinkPropertiesPresenter(@NotNull getDuration.length length) {
        Intrinsics.checkNotNullParameter(length, "<set-?>");
        this.readLinkPropertiesPresenter = length;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        int length;
        int min;
        int length2;
        byte b = (byte) setMax[96];
        String length3 = length((byte) getMin, b, (byte) b);
        byte b2 = (byte) getMin;
        String length4 = length((byte) setMax[96], b2, (byte) b2);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, length3, length4);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length5 = dispatchOnCancelled.length(nextInt);
        int i = 1;
        if (nextInt != length5) {
            onCanceled oncanceled = new onCanceled(nextInt, length5, 1);
            onCancelLoad.setMax(907938457, oncanceled);
            onCancelLoad.getMin(907938457, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(907938457, oncanceled2);
            onCancelLoad.getMin(907938457, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(907938457, oncanceled3);
            onCancelLoad.getMin(907938457, oncanceled3);
        }
        overridePendingTransition(17432576, 17432577);
        if (Build.VERSION.SDK_INT == 26) {
            i = -1;
        }
        setRequestedOrientation(i);
        super.onCreate(bundle);
    }

    public final void init() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1445195480 == (max = dispatchOnCancelled.getMax(applicationContext, 1445195480)))) {
            onCanceled oncanceled = new onCanceled(1445195480, max, 512);
            onCancelLoad.setMax(1445195480, oncanceled);
            onCancelLoad.getMin(1445195480, oncanceled);
        }
        GriverUniformPromptExtension.getMin getmin = new GriverUniformPromptExtension.getMin((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            getmin.IsOverlapping = applicationComponent;
            DeepLinkModule.setMin max2 = DeepLinkModule.getMax();
            Activity activity = this;
            max2.getMax = activity;
            getmin.length = new DeepLinkModule(max2, (byte) 0);
            ScanQrModule.setMin max3 = ScanQrModule.getMax();
            max3.setMin = activity;
            getmin.getMin = new ScanQrModule(max3, (byte) 0);
            RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
            min.getMax = activity;
            getmin.setMin = new RestoreUrlModule(min, (byte) 0);
            FeatureModule.length length = FeatureModule.length();
            length.setMax = activity;
            getmin.getMax = new FeatureModule(length, (byte) 0);
            OauthModule.getMax min2 = OauthModule.setMin();
            min2.setMin = activity;
            getmin.setMax = new OauthModule(min2, (byte) 0);
            getmin.equals = new ServicesModule((byte) 0);
            stopIgnoring.setMin(getmin.length, DeepLinkModule.class);
            stopIgnoring.setMin(getmin.getMin, ScanQrModule.class);
            stopIgnoring.setMin(getmin.setMin, RestoreUrlModule.class);
            stopIgnoring.setMin(getmin.getMax, FeatureModule.class);
            stopIgnoring.setMin(getmin.setMax, OauthModule.class);
            if (getmin.equals == null) {
                getmin.equals = new ServicesModule();
            }
            stopIgnoring.setMin(getmin.IsOverlapping, PrepareException.AnonymousClass1.class);
            new GriverUniformPromptExtension(getmin.length, getmin.getMin, getmin.setMin, getmin.getMax, getmin.setMax, getmin.equals, getmin.IsOverlapping, (byte) 0).setMax(this);
            Parcelable parcelableExtra = getIntent().getParcelableExtra("startParams");
            Intrinsics.checkNotNull(parcelableExtra);
            this.getMax = (StartParams) parcelableExtra;
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setWeightSum);
            Intrinsics.checkNotNullExpressionValue(textView, "tvContentTitle");
            Object[] objArr = new Object[1];
            StartParams startParams = this.getMax;
            if (startParams == null) {
                Intrinsics.throwUninitializedPropertyAccessException("startParams");
            }
            objArr[0] = startParams.setMax;
            textView.setText(getString(R.string.mp_please_complete_profile, objArr));
            TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.launchQuerySearch);
            Intrinsics.checkNotNullExpressionValue(textView2, "tvTitle");
            StartParams startParams2 = this.getMax;
            if (startParams2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("startParams");
            }
            textView2.setText(startParams2.setMax);
            ((DanaButtonGhostView) _$_findCachedViewById(resetInternal.setMax.Mean$Arithmetic)).setOnClickListener(new getMin(this));
            ((DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.extraCallback)).setOnClickListener(new setMax(this));
            updateCornerMarking updatecornermarking = (updateCornerMarking) Glide.setMin((FragmentActivity) this);
            StartParams startParams3 = this.getMax;
            if (startParams3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("startParams");
            }
            updatecornermarking.setMax(startParams3.getMin).setMax((int) R.drawable.dana_logo_blue).setMin((int) R.drawable.dana_logo_blue).setMax(evaluate.setMin).length((ImageView) (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.onTitleChanged));
            return;
        }
        throw null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ MissingRequiredUserInfoDialogActivity getMin;

        getMin(MissingRequiredUserInfoDialogActivity missingRequiredUserInfoDialogActivity) {
            this.getMin = missingRequiredUserInfoDialogActivity;
        }

        public final void onClick(View view) {
            this.getMin.finish();
            onInput.getDefault().post(new ShowAgreementBridge.length(false, "001"));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ MissingRequiredUserInfoDialogActivity getMax;

        setMax(MissingRequiredUserInfoDialogActivity missingRequiredUserInfoDialogActivity) {
            this.getMax = missingRequiredUserInfoDialogActivity;
        }

        public final void onClick(View view) {
            MissingRequiredUserInfoDialogActivity.access$completeData(this.getMax);
            onInput.getDefault().post(new ShowAgreementBridge.length(false, "001"));
        }
    }

    public final void onBackPressed() {
        finish();
        onInput.getDefault().post(new ShowAgreementBridge.length(false, "001"));
    }

    @Parcelize
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J/\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001e"}, d2 = {"Lid/dana/miniprogram/tnc/MissingRequiredUserInfoDialogActivity$StartParams;", "Landroid/os/Parcelable;", "serviceName", "", "iconUrl", "missingUserData", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getIconUrl", "()Ljava/lang/String;", "getMissingUserData", "()Ljava/util/List;", "getServiceName", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class StartParams implements Parcelable {
        public static final Parcelable.Creator<StartParams> CREATOR = new getMax();
        @NotNull
        final List<String> getMax;
        @Nullable
        final String getMin;
        @NotNull
        final String setMax;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartParams)) {
                return false;
            }
            StartParams startParams = (StartParams) obj;
            return Intrinsics.areEqual((Object) this.setMax, (Object) startParams.setMax) && Intrinsics.areEqual((Object) this.getMin, (Object) startParams.getMin) && Intrinsics.areEqual((Object) this.getMax, (Object) startParams.getMax);
        }

        public final int hashCode() {
            String str = this.setMax;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.getMin;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            List<String> list = this.getMax;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode2 + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("StartParams(serviceName=");
            sb.append(this.setMax);
            sb.append(", iconUrl=");
            sb.append(this.getMin);
            sb.append(", missingUserData=");
            sb.append(this.getMax);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeString(this.setMax);
            parcel.writeString(this.getMin);
            parcel.writeStringList(this.getMax);
        }

        public StartParams(@NotNull String str, @Nullable String str2, @NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(str, "serviceName");
            Intrinsics.checkNotNullParameter(list, "missingUserData");
            this.setMax = str;
            this.getMin = str2;
            this.getMax = list;
        }

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
        public static class getMax implements Parcelable.Creator<StartParams> {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new StartParams[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
                return new StartParams(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/miniprogram/tnc/MissingRequiredUserInfoDialogActivity$Companion;", "", "()V", "EXTRA_START_PARAMS", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void access$completeData(MissingRequiredUserInfoDialogActivity missingRequiredUserInfoDialogActivity) {
        StartParams startParams = missingRequiredUserInfoDialogActivity.getMax;
        if (startParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("startParams");
        }
        List<String> list = startParams.getMax;
        if (list.size() > 1) {
            getDuration.length length = missingRequiredUserInfoDialogActivity.readLinkPropertiesPresenter;
            if (length == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readLinkPropertiesPresenter");
            }
            length.setMax("https://link.dana.id/setting-more");
        } else if (list.contains("USER_CONTACTINFO_EMAIL")) {
            DanaH5.startContainerFullUrlWithSendCredentials$default(isShowMenu.setMin("/m/portal/emailSettings"), (setCancelOnTouchOutside$core) null, (Bundle) null, 6, (Object) null);
        } else if (list.contains("EXT_USER_NAME")) {
            missingRequiredUserInfoDialogActivity.startActivity(new Intent(missingRequiredUserInfoDialogActivity, ChangeUsernameActivity.class));
        } else {
            getDuration.length length2 = missingRequiredUserInfoDialogActivity.readLinkPropertiesPresenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readLinkPropertiesPresenter");
            }
            length2.setMax("https://link.dana.id/setting-more");
        }
        missingRequiredUserInfoDialogActivity.finish();
    }
}
