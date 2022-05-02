package id.dana.miniprogram.tnc;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.griver.base.common.constants.GriverBaseConstants;
import com.bumptech.glide.Glide;
import com.google.common.base.Ascii;
import com.iap.ac.android.acs.plugin.ui.utils.UIConstants;
import id.dana.R;
import id.dana.component.buttoncomponent.DanaButtonGhostView;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.miniprogram.provider.OauthServiceProvider;
import id.dana.miniprogram.tnc.TncDetailMiniProgramActivity;
import id.dana.richview.CurrencyTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.android.parcel.Parcelize;
import o.GriverUniformDialogExtension;
import o.IPostMessageService;
import o.ITrustedWebActivityCallback;
import o.PrepareException;
import o.SplashEntryInfo;
import o.Workflow;
import o.base64;
import o.dispatchOnCancelled;
import o.evaluate;
import o.name;
import o.needWaitSetupWhenGet;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onInput;
import o.onNext;
import o.registerOnLoadCanceledListener;
import o.resetInternal;
import o.setPublishStatus;
import o.stopIgnoring;
import o.updateCornerMarking;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\u0012\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0018H\u0016J\b\u0010 \u001a\u00020\u0018H\u0016J\b\u0010!\u001a\u00020\u0018H\u0016J\u0016\u0010\"\u001a\u00020\u00182\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lid/dana/miniprogram/tnc/TncMiniProgramDialogActivity;", "Lid/dana/miniprogram/tnc/AbstractTncMiniProgramDialogActivity;", "()V", "adapter", "Lid/dana/miniprogram/adapter/MiniProgramAgreementsAdapter;", "danaLoadingDialog", "Lid/dana/dialog/DanaLoadingDialog;", "getDanaLoadingDialog", "()Lid/dana/dialog/DanaLoadingDialog;", "danaLoadingDialog$delegate", "Lkotlin/Lazy;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "params", "Lid/dana/miniprogram/tnc/TncMiniProgramDialogActivity$StartParams;", "presenter", "Lid/dana/globalnetwork/currency/GlobalNetworkContract$Presenter;", "getPresenter", "()Lid/dana/globalnetwork/currency/GlobalNetworkContract$Presenter;", "setPresenter", "(Lid/dana/globalnetwork/currency/GlobalNetworkContract$Presenter;)V", "applyAgreementAuthCode", "", "agree", "", "initComponent", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupBehavior", "setupContent", "showIcon", "startTncDetailMiniProgram", "agreements", "", "", "StartParams", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class TncMiniProgramDialogActivity extends AbstractTncMiniProgramDialogActivity {
    public static final byte[] getMax = {53, -120, -1, -63, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    public static final int toFloatRange = 197;
    /* access modifiers changed from: private */
    public GriverUniformDialogExtension IsOverlapping;
    private final Lazy equals = LazyKt.lazy(new setMax(this));
    private HashMap hashCode;
    private final ITrustedWebActivityCallback<Intent> isInside;
    @Inject
    public onNext.setMin presenter;
    /* access modifiers changed from: private */
    public StartParams toIntRange;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(int r6, byte r7, int r8) {
        /*
            byte[] r0 = getMax
            int r6 = r6 * 165
            int r6 = 176 - r6
            int r7 = r7 * 45
            int r7 = r7 + 56
            int r8 = r8 * 175
            int r8 = r8 + 4
            byte[] r1 = new byte[r6]
            int r6 = r6 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001a
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            goto L_0x0030
        L_0x001a:
            r3 = 0
        L_0x001b:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L_0x0026
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0026:
            int r3 = r3 + 1
            byte r4 = r0[r8]
            r5 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L_0x0030:
            int r7 = r7 + r8
            int r7 = r7 + -2
            int r8 = r0 + 1
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.miniprogram.tnc.TncMiniProgramDialogActivity.setMax(int, byte, int):java.lang.String");
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.hashCode;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1791338429 == (max = dispatchOnCancelled.getMax(applicationContext, 1791338429)))) {
            onCanceled oncanceled = new onCanceled(1791338429, max, 512);
            onCancelLoad.setMax(1791338429, oncanceled);
            onCancelLoad.getMin(1791338429, oncanceled);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(1791338429, oncanceled2);
            onCancelLoad.getMin(1791338429, oncanceled2);
        }
        if (this.hashCode == null) {
            this.hashCode = new HashMap();
        }
        View view = (View) this.hashCode.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.hashCode.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/activity/result/ActivityResult;", "kotlin.jvm.PlatformType", "onActivityResult"}, k = 3, mv = {1, 4, 2})
    static final class getMin<O> implements IPostMessageService.Default<ActivityResult> {
        final /* synthetic */ TncMiniProgramDialogActivity length;

        getMin(TncMiniProgramDialogActivity tncMiniProgramDialogActivity) {
            this.length = tncMiniProgramDialogActivity;
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
                onInput.getDefault().post(new OauthServiceProvider.getMin(z, TncMiniProgramDialogActivity.access$getParams$p(this.length).getMin, (String) null));
                this.length.finish();
            }
        }
    }

    public TncMiniProgramDialogActivity() {
        ITrustedWebActivityCallback<Intent> registerForActivityResult = registerForActivityResult(new ITrustedWebActivityCallback.Stub.Proxy.getMin(), new getMin(this));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul… finish()\n        }\n    }");
        this.isInside = registerForActivityResult;
    }

    public static final /* synthetic */ GriverUniformDialogExtension access$getAdapter$p(TncMiniProgramDialogActivity tncMiniProgramDialogActivity) {
        GriverUniformDialogExtension griverUniformDialogExtension = tncMiniProgramDialogActivity.IsOverlapping;
        if (griverUniformDialogExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        return griverUniformDialogExtension;
    }

    public static final /* synthetic */ StartParams access$getParams$p(TncMiniProgramDialogActivity tncMiniProgramDialogActivity) {
        StartParams startParams = tncMiniProgramDialogActivity.toIntRange;
        if (startParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        return startParams;
    }

    @NotNull
    public final onNext.setMin getPresenter() {
        onNext.setMin setmin = this.presenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return setmin;
    }

    public final void setPresenter(@NotNull onNext.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.presenter = setmin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/dialog/DanaLoadingDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<setPublishStatus> {
        final /* synthetic */ TncMiniProgramDialogActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(TncMiniProgramDialogActivity tncMiniProgramDialogActivity) {
            super(0);
            this.this$0 = tncMiniProgramDialogActivity;
        }

        @NotNull
        public final setPublishStatus invoke() {
            return new setPublishStatus(this.this$0);
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        int length2;
        int min;
        int max;
        byte[] bArr = getMax;
        String max2 = setMax((byte) bArr[8], (byte) bArr[85], (byte) bArr[8]);
        byte[] bArr2 = getMax;
        String max3 = setMax((byte) bArr2[85], (byte) bArr2[8], (byte) bArr2[85]);
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
            onCancelLoad.setMax(-610246197, oncanceled);
            onCancelLoad.getMin(-610246197, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || -610246197 == (max = dispatchOnCancelled.getMax(applicationContext2, -610246197)))) {
            onCanceled oncanceled2 = new onCanceled(-610246197, max, 512);
            onCancelLoad.setMax(-610246197, oncanceled2);
            onCancelLoad.getMin(-610246197, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 8);
            onCancelLoad.setMax(-610246197, oncanceled3);
            onCancelLoad.getMin(-610246197, oncanceled3);
        }
        int max4 = dispatchOnCancelled.getMax(0);
        if (max4 != 0) {
            onCanceled oncanceled4 = new onCanceled(0, max4, 16);
            onCancelLoad.setMax(-610246197, oncanceled4);
            onCancelLoad.getMin(-610246197, oncanceled4);
        }
        overridePendingTransition(17432576, 17432577);
        if (Build.VERSION.SDK_INT == 26) {
            i = -1;
        }
        setRequestedOrientation(i);
        super.onCreate(bundle);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"id/dana/miniprogram/tnc/TncMiniProgramDialogActivity$initComponent$1", "Lid/dana/globalnetwork/currency/GlobalNetworkListener;", "dismissProgressDialog", "", "onApplyAgreementAuthCode", "authCodeResult", "Lid/dana/domain/authcode/AuthCodeResult;", "statusAgreed", "", "showProgressDialog", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends Workflow {
        final /* synthetic */ TncMiniProgramDialogActivity setMax;

        getMax(TncMiniProgramDialogActivity tncMiniProgramDialogActivity) {
            this.setMax = tncMiniProgramDialogActivity;
        }

        public final void length(@NotNull SplashEntryInfo splashEntryInfo, boolean z) {
            Intrinsics.checkNotNullParameter(splashEntryInfo, "authCodeResult");
            if (z) {
                String authCode = splashEntryInfo.getAuthCode();
                if (authCode == null || !z) {
                    authCode = null;
                }
                onInput.getDefault().post(new OauthServiceProvider.getMin(z, TncMiniProgramDialogActivity.access$getParams$p(this.setMax).getMin, authCode));
                this.setMax.finish();
                return;
            }
            GriverUniformDialogExtension access$getAdapter$p = TncMiniProgramDialogActivity.access$getAdapter$p(this.setMax);
            List<base64> agreements = splashEntryInfo.getAgreements();
            if (agreements == null) {
                agreements = CollectionsKt.emptyList();
            }
            Iterable<base64> iterable = agreements;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (base64 base64 : iterable) {
                Intrinsics.checkNotNullExpressionValue(base64, "it");
                arrayList.add(base64.getDescription());
            }
            List<String> list = (List) arrayList;
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            access$getAdapter$p.setMin = list;
            access$getAdapter$p.notifyDataSetChanged();
        }

        public final void toIntRange() {
            setPublishStatus access$getDanaLoadingDialog$p = TncMiniProgramDialogActivity.access$getDanaLoadingDialog$p(this.setMax);
            if (!access$getDanaLoadingDialog$p.length.isShowing()) {
                access$getDanaLoadingDialog$p.length.show();
                access$getDanaLoadingDialog$p.getMax.startRefresh();
            }
        }

        public final void isInside() {
            TncMiniProgramDialogActivity.access$getDanaLoadingDialog$p(this.setMax).getMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ TncMiniProgramDialogActivity setMax;

        equals(TncMiniProgramDialogActivity tncMiniProgramDialogActivity) {
            this.setMax = tncMiniProgramDialogActivity;
        }

        public final void onClick(View view) {
            TncMiniProgramDialogActivity tncMiniProgramDialogActivity = this.setMax;
            TncMiniProgramDialogActivity.access$startTncDetailMiniProgram(tncMiniProgramDialogActivity, TncMiniProgramDialogActivity.access$getAdapter$p(tncMiniProgramDialogActivity).setMin);
        }
    }

    public final void setupBehavior() {
        getMax(false);
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.setGroupVisible);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "llMPContentwrapper");
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.setGroupEnabled);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "llServiceContentwrapper");
        linearLayout2.setVisibility(8);
        ((DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.hashCode)).setOnClickListener(new setMin(this));
        ((DanaButtonGhostView) _$_findCachedViewById(resetInternal.setMax.valueOf)).setOnClickListener(new length(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ TncMiniProgramDialogActivity getMax;

        setMin(TncMiniProgramDialogActivity tncMiniProgramDialogActivity) {
            this.getMax = tncMiniProgramDialogActivity;
        }

        public final void onClick(View view) {
            this.getMax.getMax(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ TncMiniProgramDialogActivity getMax;

        length(TncMiniProgramDialogActivity tncMiniProgramDialogActivity) {
            this.getMax = tncMiniProgramDialogActivity;
        }

        public final void onClick(View view) {
            onInput.getDefault().post(new OauthServiceProvider.getMin(false, TncMiniProgramDialogActivity.access$getParams$p(this.getMax).getMin, (String) null));
            this.getMax.finish();
        }
    }

    public final void showIcon() {
        updateCornerMarking updatecornermarking = (updateCornerMarking) Glide.setMin((FragmentActivity) this);
        StartParams startParams = this.toIntRange;
        if (startParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        updatecornermarking.setMax(startParams.setMin).setMax((int) R.drawable.dana_logo_blue).setMin((int) R.drawable.dana_logo_blue).setMax(evaluate.setMin).length((ImageView) (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.onTitleChanged));
    }

    /* access modifiers changed from: private */
    public final void getMax(boolean z) {
        onNext.setMin setmin = this.presenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        StartParams startParams = this.toIntRange;
        if (startParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String str = startParams.setMax;
        StartParams startParams2 = this.toIntRange;
        if (startParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String str2 = startParams2.setMin;
        StartParams startParams3 = this.toIntRange;
        if (startParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String str3 = startParams3.length;
        StartParams startParams4 = this.toIntRange;
        if (startParams4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String str4 = startParams4.getMax;
        StartParams startParams5 = this.toIntRange;
        if (startParams5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        setmin.getMax(str, str2, str3, str4, z, startParams5.toFloatRange);
    }

    @Parcelize
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JS\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006("}, d2 = {"Lid/dana/miniprogram/tnc/TncMiniProgramDialogActivity$StartParams;", "Landroid/os/Parcelable;", "appId", "", "authClientId", "scopes", "logo", "miniProgramName", "subMerchantId", "isActive", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAppId", "()Ljava/lang/String;", "getAuthClientId", "()Z", "getLogo", "getMiniProgramName", "getScopes", "getSubMerchantId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class StartParams implements Parcelable {
        public static final Parcelable.Creator<StartParams> CREATOR = new getMax();
        @Nullable
        final String getMax;
        @NotNull
        final String getMin;
        private final boolean isInside;
        @NotNull
        final String length;
        @NotNull
        final String setMax;
        @NotNull
        final String setMin;
        @Nullable
        final String toFloatRange;

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
            return Intrinsics.areEqual((Object) this.getMin, (Object) startParams.getMin) && Intrinsics.areEqual((Object) this.length, (Object) startParams.length) && Intrinsics.areEqual((Object) this.getMax, (Object) startParams.getMax) && Intrinsics.areEqual((Object) this.setMin, (Object) startParams.setMin) && Intrinsics.areEqual((Object) this.setMax, (Object) startParams.setMax) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) startParams.toFloatRange) && this.isInside == startParams.isInside;
        }

        public final int hashCode() {
            String str = this.getMin;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.length;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.getMax;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.setMin;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.setMax;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.toFloatRange;
            if (str6 != null) {
                i = str6.hashCode();
            }
            int i2 = (hashCode5 + i) * 31;
            boolean z = this.isInside;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("StartParams(appId=");
            sb.append(this.getMin);
            sb.append(", authClientId=");
            sb.append(this.length);
            sb.append(", scopes=");
            sb.append(this.getMax);
            sb.append(", logo=");
            sb.append(this.setMin);
            sb.append(", miniProgramName=");
            sb.append(this.setMax);
            sb.append(", subMerchantId=");
            sb.append(this.toFloatRange);
            sb.append(", isActive=");
            sb.append(this.isInside);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeString(this.getMin);
            parcel.writeString(this.length);
            parcel.writeString(this.getMax);
            parcel.writeString(this.setMin);
            parcel.writeString(this.setMax);
            parcel.writeString(this.toFloatRange);
            parcel.writeInt(this.isInside ? 1 : 0);
        }

        public StartParams(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6, boolean z) {
            Intrinsics.checkNotNullParameter(str, "appId");
            Intrinsics.checkNotNullParameter(str2, GriverBaseConstants.KEY_CLIENT_ID);
            Intrinsics.checkNotNullParameter(str4, "logo");
            Intrinsics.checkNotNullParameter(str5, UIConstants.KEY_MINI_PROGRAM_NAME);
            this.getMin = str;
            this.length = str2;
            this.getMax = str3;
            this.setMin = str4;
            this.setMax = str5;
            this.toFloatRange = str6;
            this.isInside = z;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StartParams(String str, String str2, String str3, String str4, String str5, String str6) {
            this(str, str2, str3, str4, str5, str6, str5.length() > 0);
        }

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
        public static class getMax implements Parcelable.Creator<StartParams> {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new StartParams[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
                return new StartParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }
        }
    }

    public final void setupContent() {
        needWaitSetupWhenGet.setMin setmin = new needWaitSetupWhenGet.setMin((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            setmin.getMin = applicationComponent;
            setmin.length = new GlobalNetworkModule(new getMax(this));
            stopIgnoring.setMin(setmin.length, GlobalNetworkModule.class);
            stopIgnoring.setMin(setmin.getMin, PrepareException.AnonymousClass1.class);
            new needWaitSetupWhenGet(setmin.length, setmin.getMin, (byte) 0).setMax(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            onNext.setMin setmin2 = this.presenter;
            if (setmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getminArr[0] = setmin2;
            registerPresenter(getminArr);
            ((TextView) _$_findCachedViewById(resetInternal.setMax.setSubmitButtonEnabled)).setOnClickListener(new equals(this));
            Parcelable parcelableExtra = getIntent().getParcelableExtra("startParams");
            Intrinsics.checkNotNull(parcelableExtra);
            this.toIntRange = (StartParams) parcelableExtra;
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setWeightSum);
            Intrinsics.checkNotNullExpressionValue(textView, "tvContentTitle");
            Object[] objArr = new Object[1];
            StartParams startParams = this.toIntRange;
            if (startParams == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
            }
            objArr[0] = startParams.setMax;
            textView.setText(getString(R.string.text_title_content_tnc_mp, objArr));
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setMenuPrepared);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "it");
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            GriverUniformDialogExtension griverUniformDialogExtension = new GriverUniformDialogExtension((byte) 0);
            recyclerView.setAdapter(griverUniformDialogExtension);
            Unit unit = Unit.INSTANCE;
            this.IsOverlapping = griverUniformDialogExtension;
            return;
        }
        throw null;
    }

    public static final /* synthetic */ setPublishStatus access$getDanaLoadingDialog$p(TncMiniProgramDialogActivity tncMiniProgramDialogActivity) {
        return (setPublishStatus) tncMiniProgramDialogActivity.equals.getValue();
    }

    public static final /* synthetic */ void access$startTncDetailMiniProgram(TncMiniProgramDialogActivity tncMiniProgramDialogActivity, List list) {
        StartParams startParams = tncMiniProgramDialogActivity.toIntRange;
        if (startParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String str = startParams.setMax;
        StartParams startParams2 = tncMiniProgramDialogActivity.toIntRange;
        if (startParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        Intent putExtra = new Intent(tncMiniProgramDialogActivity, TncDetailMiniProgramActivity.class).putExtra("startParams", new TncDetailMiniProgramActivity.StartParams(str, startParams2.setMin, new ArrayList(list), (String) null, 8));
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(this, TncDetailMi…TART_PARAMS, startParams)");
        tncMiniProgramDialogActivity.isInside.getMin(putExtra, (name) null);
    }
}
