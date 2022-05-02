package id.dana.miniprogram.tnc;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.component.buttoncomponent.DanaButtonGhostView;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.danah5.showagreement.ShowAgreementBridge;
import id.dana.miniprogram.tnc.TncDetailMiniProgramActivity;
import id.dana.richview.CurrencyTextView;
import id.dana.richview.WebProgressView;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import o.BindInt;
import o.IPostMessageService;
import o.ITrustedWebActivityCallback;
import o.dispatchOnCancelled;
import o.evaluate;
import o.name;
import o.onCancelLoad;
import o.onCanceled;
import o.onInput;
import o.resetInternal;
import o.updateCornerMarking;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0002R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lid/dana/miniprogram/tnc/TncServiceDialogActivity;", "Lid/dana/miniprogram/tnc/AbstractTncMiniProgramDialogActivity;", "()V", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "params", "Lid/dana/miniprogram/tnc/TncServiceDialogActivity$StartParams;", "onBackPressed", "", "reportToParentPage", "status", "", "setupBehavior", "setupContent", "showIcon", "startTncDetailMiniProgram", "Companion", "StartParams", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class TncServiceDialogActivity extends AbstractTncMiniProgramDialogActivity {
    @NotNull
    public static final setMin Companion = new setMin((byte) 0);
    @NotNull
    public static final String EXTRA_START_PARAMS = "startParams";
    private final ITrustedWebActivityCallback<Intent> IsOverlapping;
    private StartParams getMax;
    private HashMap isInside;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.isInside;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (max = dispatchOnCancelled.setMax(applicationContext, i, 0)))) {
            onCanceled oncanceled = new onCanceled(i, max, 2);
            onCancelLoad.setMax(1471954691, oncanceled);
            onCancelLoad.getMin(1471954691, oncanceled);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/activity/result/ActivityResult;", "kotlin.jvm.PlatformType", "onActivityResult"}, k = 3, mv = {1, 4, 2})
    static final class getMin<O> implements IPostMessageService.Default<ActivityResult> {
        final /* synthetic */ TncServiceDialogActivity length;

        getMin(TncServiceDialogActivity tncServiceDialogActivity) {
            this.length = tncServiceDialogActivity;
        }

        public final /* synthetic */ void onActivityResult(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            Intrinsics.checkNotNullExpressionValue(activityResult, "it");
            if (activityResult.getMax == -1) {
                Intent intent = activityResult.length;
                boolean z = false;
                if (intent != null) {
                    z = intent.getBooleanExtra("AGREE", false);
                }
                this.length.getMin(z);
                this.length.finish();
            }
        }
    }

    public TncServiceDialogActivity() {
        ITrustedWebActivityCallback<Intent> registerForActivityResult = registerForActivityResult(new ITrustedWebActivityCallback.Stub.Proxy.getMin(), new getMin(this));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul… finish()\n        }\n    }");
        this.IsOverlapping = registerForActivityResult;
    }

    public final void setupContent() {
        Parcelable parcelableExtra = getIntent().getParcelableExtra("startParams");
        Intrinsics.checkNotNull(parcelableExtra);
        this.getMax = (StartParams) parcelableExtra;
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setWeightSum);
        Intrinsics.checkNotNullExpressionValue(textView, "tvContentTitle");
        Object[] objArr = new Object[1];
        StartParams startParams = this.getMax;
        if (startParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        objArr[0] = startParams.getMin;
        textView.setText(getString(R.string.text_title_content_tnc_mp, objArr));
        TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.launchQuerySearch);
        Intrinsics.checkNotNullExpressionValue(textView2, "tvTitle");
        StartParams startParams2 = this.getMax;
        if (startParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        textView2.setText(startParams2.getMin);
    }

    public final void showIcon() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 50964330 == (max = dispatchOnCancelled.getMax(applicationContext, 50964330)))) {
            onCanceled oncanceled = new onCanceled(50964330, max, 512);
            onCancelLoad.setMax(50964330, oncanceled);
            onCancelLoad.getMin(50964330, oncanceled);
        }
        updateCornerMarking updatecornermarking = (updateCornerMarking) Glide.setMin((FragmentActivity) this);
        StartParams startParams = this.getMax;
        if (startParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        updatecornermarking.setMax(startParams.setMax).setMax((int) R.drawable.dana_logo_blue).setMin((int) R.drawable.dana_logo_blue).setMax(evaluate.setMin).length((ImageView) (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.onTitleChanged));
    }

    public final void setupBehavior() {
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.setGroupVisible);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "llMPContentwrapper");
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.setGroupEnabled);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "llServiceContentwrapper");
        linearLayout2.setVisibility(0);
        ((DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.hashCode)).setOnClickListener(new setMax(this));
        ((DanaButtonGhostView) _$_findCachedViewById(resetInternal.setMax.valueOf)).setOnClickListener(new getMax(this));
        WebProgressView webProgressView = (WebProgressView) _$_findCachedViewById(resetInternal.setMax.transitionToState);
        StartParams startParams = this.getMax;
        if (startParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        webProgressView.loadDataWithBaseUrl((String) null, startParams.getMax);
        webProgressView.setScrollbarFadingEnabled(false);
        webProgressView.disableBuiltInZoom();
        ((TextView) _$_findCachedViewById(resetInternal.setMax.setSubmitButtonEnabled)).setOnClickListener(new length(this));
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setWeightSum);
        Intrinsics.checkNotNullExpressionValue(textView, "tvContentTitle");
        Object[] objArr = new Object[1];
        StartParams startParams2 = this.getMax;
        if (startParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        objArr[0] = startParams2.getMin;
        textView.setText(getString(R.string.text_title_content_tnc_service, objArr));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ TncServiceDialogActivity length;

        setMax(TncServiceDialogActivity tncServiceDialogActivity) {
            this.length = tncServiceDialogActivity;
        }

        public final void onClick(View view) {
            this.length.getMin(true);
            this.length.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ TncServiceDialogActivity setMin;

        getMax(TncServiceDialogActivity tncServiceDialogActivity) {
            this.setMin = tncServiceDialogActivity;
        }

        public final void onClick(View view) {
            this.setMin.getMin(false);
            this.setMin.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ TncServiceDialogActivity getMin;

        length(TncServiceDialogActivity tncServiceDialogActivity) {
            this.getMin = tncServiceDialogActivity;
        }

        public final void onClick(View view) {
            TncServiceDialogActivity.access$startTncDetailMiniProgram(this.getMin);
        }
    }

    /* access modifiers changed from: private */
    public final void getMin(boolean z) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1943239742 == (max = dispatchOnCancelled.getMax(applicationContext, -1943239742)))) {
            onCanceled oncanceled = new onCanceled(-1943239742, max, 512);
            onCancelLoad.setMax(-1943239742, oncanceled);
            onCancelLoad.getMin(-1943239742, oncanceled);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(-1943239742, oncanceled2);
            onCancelLoad.getMin(-1943239742, oncanceled2);
        }
        StartParams startParams = this.getMax;
        if (startParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        if (startParams.length()) {
            onInput.getDefault().post(new BindInt.setMin(z));
        } else {
            onInput.getDefault().post(new ShowAgreementBridge.length(z, (String) null, 2, (DefaultConstructorMarker) null));
        }
    }

    public final void onBackPressed() {
        getMin(false);
        super.onBackPressed();
    }

    @Parcelize
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003JU\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006("}, d2 = {"Lid/dana/miniprogram/tnc/TncServiceDialogActivity$StartParams;", "Landroid/os/Parcelable;", "scopes", "", "logo", "serviceName", "agreementKey", "contentAgreement", "isActive", "", "fromNativePage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getAgreementKey", "()Ljava/lang/String;", "getContentAgreement", "getFromNativePage", "()Z", "getLogo", "getScopes", "getServiceName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class StartParams implements Parcelable {
        public static final Parcelable.Creator<StartParams> CREATOR = new getMax();
        private final boolean IsOverlapping;
        @Nullable
        final String getMax;
        @NotNull
        final String getMin;
        private final boolean isInside;
        @Nullable
        private final String length;
        @NotNull
        final String setMax;
        @Nullable
        private final String setMin;

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
            return Intrinsics.areEqual((Object) this.setMin, (Object) startParams.setMin) && Intrinsics.areEqual((Object) this.setMax, (Object) startParams.setMax) && Intrinsics.areEqual((Object) this.getMin, (Object) startParams.getMin) && Intrinsics.areEqual((Object) this.length, (Object) startParams.length) && Intrinsics.areEqual((Object) this.getMax, (Object) startParams.getMax) && this.isInside == startParams.isInside && this.IsOverlapping == startParams.IsOverlapping;
        }

        public final int hashCode() {
            String str = this.setMin;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.setMax;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.getMin;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.length;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.getMax;
            if (str5 != null) {
                i = str5.hashCode();
            }
            int i2 = (hashCode4 + i) * 31;
            boolean z = this.isInside;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i3 = (i2 + (z ? 1 : 0)) * 31;
            boolean z3 = this.IsOverlapping;
            if (!z3) {
                z2 = z3;
            }
            return i3 + (z2 ? 1 : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("StartParams(scopes=");
            sb.append(this.setMin);
            sb.append(", logo=");
            sb.append(this.setMax);
            sb.append(", serviceName=");
            sb.append(this.getMin);
            sb.append(", agreementKey=");
            sb.append(this.length);
            sb.append(", contentAgreement=");
            sb.append(this.getMax);
            sb.append(", isActive=");
            sb.append(this.isInside);
            sb.append(", fromNativePage=");
            sb.append(this.IsOverlapping);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeString(this.setMin);
            parcel.writeString(this.setMax);
            parcel.writeString(this.getMin);
            parcel.writeString(this.length);
            parcel.writeString(this.getMax);
            parcel.writeInt(this.isInside ? 1 : 0);
            parcel.writeInt(this.IsOverlapping ? 1 : 0);
        }

        public StartParams(@Nullable String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable String str5, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str2, "logo");
            Intrinsics.checkNotNullParameter(str3, "serviceName");
            this.setMin = str;
            this.setMax = str2;
            this.getMin = str3;
            this.length = str4;
            this.getMax = str5;
            this.isInside = z;
            this.IsOverlapping = z2;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ StartParams(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, boolean r16, boolean r17, int r18) {
            /*
                r10 = this;
                r0 = r18 & 8
                java.lang.String r1 = ""
                if (r0 == 0) goto L_0x0008
                r6 = r1
                goto L_0x0009
            L_0x0008:
                r6 = r14
            L_0x0009:
                r0 = r18 & 16
                if (r0 == 0) goto L_0x000f
                r7 = r1
                goto L_0x0010
            L_0x000f:
                r7 = r15
            L_0x0010:
                r0 = r18 & 32
                r1 = 0
                if (r0 == 0) goto L_0x0023
                r0 = r13
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0020
                r0 = 1
                goto L_0x0021
            L_0x0020:
                r0 = 0
            L_0x0021:
                r8 = r0
                goto L_0x0025
            L_0x0023:
                r8 = r16
            L_0x0025:
                r0 = r18 & 64
                if (r0 == 0) goto L_0x002b
                r9 = 0
                goto L_0x002d
            L_0x002b:
                r9 = r17
            L_0x002d:
                r2 = r10
                r3 = r11
                r4 = r12
                r5 = r13
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.miniprogram.tnc.TncServiceDialogActivity.StartParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int):void");
        }

        public final boolean length() {
            return this.IsOverlapping;
        }

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
        public static class getMax implements Parcelable.Creator<StartParams> {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new StartParams[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                boolean z = false;
                boolean z2 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new StartParams(readString, readString2, readString3, readString4, readString5, z2, z);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/miniprogram/tnc/TncServiceDialogActivity$Companion;", "", "()V", "EXTRA_START_PARAMS", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void access$startTncDetailMiniProgram(TncServiceDialogActivity tncServiceDialogActivity) {
        StartParams startParams = tncServiceDialogActivity.getMax;
        if (startParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String str = startParams.getMin;
        StartParams startParams2 = tncServiceDialogActivity.getMax;
        if (startParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String str2 = startParams2.setMax;
        StartParams startParams3 = tncServiceDialogActivity.getMax;
        if (startParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        Intent putExtra = new Intent(tncServiceDialogActivity, TncDetailMiniProgramActivity.class).putExtra("startParams", new TncDetailMiniProgramActivity.StartParams(str, str2, (ArrayList) null, startParams3.getMax, 4));
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(this, TncDetailMi…TART_PARAMS, startParams)");
        tncServiceDialogActivity.IsOverlapping.getMin(putExtra, (name) null);
    }
}
