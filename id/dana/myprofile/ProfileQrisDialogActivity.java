package id.dana.myprofile;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.contract.deeplink.generation.GenerateDeepLinkModule;
import id.dana.contract.staticqr.GetStaticQrModule;
import id.dana.data.account.repository.AccountEntityRepository;
import id.dana.richview.QRView;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.BottomPopup;
import o.MainResourcePackage;
import o.OnTouch;
import o.PrepareException;
import o.RedDotManager;
import o.WheelView;
import o.dispatchOnCancelled;
import o.getTransitionProperties;
import o.isShowMenu;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.resetInternal;
import o.setContentViewBefore;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0014J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0014J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lid/dana/myprofile/ProfileQrisDialogActivity;", "Lid/dana/base/BaseActivity;", "()V", "avatarUrl", "", "getStaticQrPresenter", "Lid/dana/contract/staticqr/GetStaticQrContract$Presenter;", "getGetStaticQrPresenter", "()Lid/dana/contract/staticqr/GetStaticQrContract$Presenter;", "setGetStaticQrPresenter", "(Lid/dana/contract/staticqr/GetStaticQrContract$Presenter;)V", "kycStatus", "profileQrDeepLinkPresenter", "Lid/dana/contract/deeplink/generation/GenerateDeepLinkContract$ProfilePresenter;", "getProfileQrDeepLinkPresenter", "()Lid/dana/contract/deeplink/generation/GenerateDeepLinkContract$ProfilePresenter;", "setProfileQrDeepLinkPresenter", "(Lid/dana/contract/deeplink/generation/GenerateDeepLinkContract$ProfilePresenter;)V", "userId", "generateProfileQrDeepLink", "", "profileQrUrl", "getLayout", "", "getProfileQris", "init", "initComponent", "initViews", "onPause", "onQrEmpty", "onStart", "prepareBundleData", "showQrImage", "qrString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ProfileQrisDialogActivity extends BaseActivity {
    private HashMap equals;
    private String getMax;
    /* access modifiers changed from: private */
    public String getMin;
    @Inject
    public OnTouch.setMin getStaticQrPresenter;
    @Inject
    public getTransitionProperties.setMin profileQrDeepLinkPresenter;
    /* access modifiers changed from: private */
    public String setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements View.OnClickListener {
        public static final toFloatRange getMax = new toFloatRange();

        toFloatRange() {
        }

        public final void onClick(View view) {
        }
    }

    public final void _$_clearFindViewByIdCache() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(890694135, oncanceled);
            onCancelLoad.getMin(890694135, oncanceled);
        }
        HashMap hashMap = this.equals;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.getMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 32);
            onCancelLoad.setMax(-68974795, oncanceled);
            onCancelLoad.getMin(-68974795, oncanceled);
        }
        if (this.equals == null) {
            this.equals = new HashMap();
        }
        View view = (View) this.equals.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.equals.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_profile_qris_dialog;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "accept", "id/dana/myprofile/ProfileQrisDialogActivity$showQrImage$1$2"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T> implements RedDotManager<Bitmap> {
        final /* synthetic */ ProfileQrisDialogActivity getMin;
        final /* synthetic */ QRView setMax;
        final /* synthetic */ String setMin;

        setMin(QRView qRView, ProfileQrisDialogActivity profileQrisDialogActivity, String str) {
            this.setMax = qRView;
            this.getMin = profileQrisDialogActivity;
            this.setMin = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            this.setMax.hideSkeleton();
            ImageView qrImageView = this.setMax.getQrImageView();
            if (qrImageView != null) {
                qrImageView.setImageBitmap(bitmap);
            }
            this.setMax.setKycView(ProfileQrisDialogActivity.access$getKycStatus$p(this.getMin));
            this.setMax.displayUserAvatar(ProfileQrisDialogActivity.access$getAvatarUrl$p(this.getMin));
        }
    }

    public static final /* synthetic */ String access$getAvatarUrl$p(ProfileQrisDialogActivity profileQrisDialogActivity) {
        String str = profileQrisDialogActivity.setMax;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException(AccountEntityRepository.UpdateType.AVATAR);
        }
        return str;
    }

    public static final /* synthetic */ String access$getKycStatus$p(ProfileQrisDialogActivity profileQrisDialogActivity) {
        String str = profileQrisDialogActivity.getMin;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kycStatus");
        }
        return str;
    }

    public static final /* synthetic */ void access$onQrEmpty(ProfileQrisDialogActivity profileQrisDialogActivity) {
        int length2;
        Context baseContext = profileQrisDialogActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-1407478133, oncanceled);
            onCancelLoad.getMin(-1407478133, oncanceled);
        }
        QRView qRView = (QRView) profileQrisDialogActivity._$_findCachedViewById(resetInternal.setMax.fitSystemWindows);
        if (qRView != null) {
            qRView.showEmptyQr();
            qRView.setOnClickListener(new setMax(profileQrisDialogActivity));
        }
    }

    @NotNull
    public final OnTouch.setMin getGetStaticQrPresenter() {
        OnTouch.setMin setmin = this.getStaticQrPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getStaticQrPresenter");
        }
        return setmin;
    }

    public final void setGetStaticQrPresenter(@NotNull OnTouch.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.getStaticQrPresenter = setmin;
    }

    @NotNull
    public final getTransitionProperties.setMin getProfileQrDeepLinkPresenter() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-477810871, oncanceled);
            onCancelLoad.getMin(-477810871, oncanceled);
        }
        getTransitionProperties.setMin setmin = this.profileQrDeepLinkPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profileQrDeepLinkPresenter");
        }
        return setmin;
    }

    public final void setProfileQrDeepLinkPresenter(@NotNull getTransitionProperties.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.profileQrDeepLinkPresenter = setmin;
    }

    public final void onStart() {
        super.onStart();
        overridePendingTransition(R.anim.f782130772050, R.anim.f822130772054);
    }

    public final void init() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 434627186 == (max = dispatchOnCancelled.getMax(applicationContext, 434627186)))) {
            onCanceled oncanceled = new onCanceled(434627186, max, 512);
            onCancelLoad.setMax(434627186, oncanceled);
            onCancelLoad.getMin(434627186, oncanceled);
        }
        setContentViewBefore.setMin(this);
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("USER_ID");
            String str = "";
            if (stringExtra == null) {
                stringExtra = str;
            }
            this.getMax = stringExtra;
            String stringExtra2 = intent.getStringExtra(ShareQrDialog.AVATAR_URL);
            if (stringExtra2 == null) {
                stringExtra2 = str;
            }
            this.setMax = stringExtra2;
            String stringExtra3 = intent.getStringExtra(ShareQrDialog.KYC_STATUS);
            if (stringExtra3 != null) {
                str = stringExtra3;
            }
            this.getMin = str;
        }
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.onUnbind);
        if (textView != null) {
            String str2 = this.getMax;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userId");
            }
            textView.setText(WheelView.ScrollerTask.AnonymousClass2.getMin(str2, false));
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.ResultReceiver$MyResultReceiver);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new length(this));
        }
        MainResourcePackage.AnonymousClass2.setMin setmin = new MainResourcePackage.AnonymousClass2.setMin((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            setmin.setMin = applicationComponent;
            setmin.setMax = new GetStaticQrModule(new getMax(this));
            setmin.getMax = new GenerateDeepLinkModule((getTransitionProperties.setMax) new getMin(this));
            stopIgnoring.setMin(setmin.setMax, GetStaticQrModule.class);
            stopIgnoring.setMin(setmin.getMax, GenerateDeepLinkModule.class);
            stopIgnoring.setMin(setmin.setMin, PrepareException.AnonymousClass1.class);
            new MainResourcePackage.AnonymousClass2(setmin.setMax, setmin.getMax, setmin.setMin, (byte) 0).length(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[2];
            OnTouch.setMin setmin2 = this.getStaticQrPresenter;
            if (setmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("getStaticQrPresenter");
            }
            getminArr[0] = setmin2;
            getTransitionProperties.setMin setmin3 = this.profileQrDeepLinkPresenter;
            if (setmin3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("profileQrDeepLinkPresenter");
            }
            getminArr[1] = setmin3;
            registerPresenter(getminArr);
            setMax();
            return;
        }
        throw null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"id/dana/myprofile/ProfileQrisDialogActivity$initComponent$1", "Lid/dana/contract/staticqr/GetStaticQrContract$View;", "dismissProgress", "", "onError", "errorMessage", "", "onGetProfileQr", "profileQrUrl", "onQrisTcicoEnable", "enable", "", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements OnTouch.length {
        final /* synthetic */ ProfileQrisDialogActivity setMin;

        public final void dismissProgress() {
        }

        public final void setMin(boolean z) {
        }

        public final void showProgress() {
        }

        getMax(ProfileQrisDialogActivity profileQrisDialogActivity) {
            this.setMin = profileQrisDialogActivity;
        }

        public final void getMin(@Nullable String str) {
            if (str != null) {
                if (!(str.length() > 0)) {
                    ProfileQrisDialogActivity.access$onQrEmpty(this.setMin);
                } else if (!isShowMenu.length(str)) {
                    ProfileQrisDialogActivity.access$showQrImage(this.setMin, str);
                } else {
                    ProfileQrisDialogActivity.access$generateProfileQrDeepLink(this.setMin, str);
                }
            }
        }

        public final void onError(@Nullable String str) {
            ProfileQrisDialogActivity.access$onQrEmpty(this.setMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"id/dana/myprofile/ProfileQrisDialogActivity$initComponent$2", "Lid/dana/contract/deeplink/generation/GenerateDeepLinkContract$ProfileView;", "dismissProgress", "", "onError", "errorMessage", "", "onProfileQrDeepLinkGenerated", "deepLink", "retryDeepLinkWithProfileQrUrl", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements getTransitionProperties.setMax {
        final /* synthetic */ ProfileQrisDialogActivity getMin;

        getMin(ProfileQrisDialogActivity profileQrisDialogActivity) {
            this.getMin = profileQrisDialogActivity;
        }

        public final void showProgress() {
            QRView qRView = (QRView) this.getMin._$_findCachedViewById(resetInternal.setMax.fitSystemWindows);
            if (qRView != null) {
                qRView.showSkeleton();
            }
        }

        public final void dismissProgress() {
            QRView qRView = (QRView) this.getMin._$_findCachedViewById(resetInternal.setMax.fitSystemWindows);
            if (qRView != null) {
                qRView.hideSkeleton();
            }
        }

        public final void onError(@Nullable String str) {
            this.getMin.showToast(str);
        }

        public final void setMax(@Nullable String str) {
            ProfileQrisDialogActivity.access$showQrImage(this.getMin, String.valueOf(str));
        }

        public final void getMin() {
            this.getMin.getGetStaticQrPresenter().setMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ ProfileQrisDialogActivity setMin;

        length(ProfileQrisDialogActivity profileQrisDialogActivity) {
            this.setMin = profileQrisDialogActivity;
        }

        public final void onClick(View view) {
            this.setMin.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/myprofile/ProfileQrisDialogActivity$onQrEmpty$1$1"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ ProfileQrisDialogActivity setMax;

        setMax(ProfileQrisDialogActivity profileQrisDialogActivity) {
            this.setMax = profileQrisDialogActivity;
        }

        public final void onClick(View view) {
            this.setMax.setMax();
        }
    }

    /* access modifiers changed from: private */
    public final void setMax() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(2111636674, oncanceled);
            onCancelLoad.getMin(2111636674, oncanceled);
        }
        OnTouch.setMin setmin = this.getStaticQrPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getStaticQrPresenter");
        }
        setmin.setMin();
    }

    public final void onPause() {
        super.onPause();
        if (isFinishing()) {
            overridePendingTransition(R.anim.f752130772047, R.anim.f792130772051);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "id/dana/myprofile/ProfileQrisDialogActivity$showQrImage$1$3"}, k = 3, mv = {1, 4, 2})
    static final class isInside<T> implements RedDotManager<Throwable> {
        final /* synthetic */ String length;
        final /* synthetic */ QRView setMax;
        final /* synthetic */ ProfileQrisDialogActivity setMin;

        isInside(QRView qRView, ProfileQrisDialogActivity profileQrisDialogActivity, String str) {
            this.setMax = qRView;
            this.setMin = profileQrisDialogActivity;
            this.length = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.setMax.hideSkeleton();
            ProfileQrisDialogActivity.access$onQrEmpty(this.setMin);
        }
    }

    public static final /* synthetic */ void access$showQrImage(ProfileQrisDialogActivity profileQrisDialogActivity, String str) {
        QRView qRView = (QRView) profileQrisDialogActivity._$_findCachedViewById(resetInternal.setMax.fitSystemWindows);
        if (qRView != null) {
            qRView.setOnClickListener(toFloatRange.getMax);
            qRView.showSkeleton();
            qRView.addDisposable(BottomPopup.getMin(str).subscribe(new setMin(qRView, profileQrisDialogActivity, str), new isInside(qRView, profileQrisDialogActivity, str)));
        }
    }

    public static final /* synthetic */ void access$generateProfileQrDeepLink(ProfileQrisDialogActivity profileQrisDialogActivity, String str) {
        getTransitionProperties.setMin setmin = profileQrisDialogActivity.profileQrDeepLinkPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profileQrDeepLinkPresenter");
        }
        setmin.getMin(str, profileQrisDialogActivity.getString(R.string.deeplink_title_request_money), profileQrisDialogActivity.getString(R.string.deeplink_description_request_money), true);
    }
}
