package id.dana.referral;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.OnClick;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.danah5.DanaH5;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.OauthModule;
import id.dana.di.modules.ReferralTrackerModule;
import id.dana.model.ThirdPartyService;
import id.dana.referral.model.MyReferralConsult;
import id.dana.richview.SearchView;
import id.dana.richview.contactselector.ContactSelectorView;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.tracker.TrackerKey;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import o.ConstraintProxy$StorageNotLowProxy;
import o.PrepareException;
import o.ResourceUtils;
import o.WheelView;
import o.dispatchOnCancelled;
import o.getDuration;
import o.getLineColor;
import o.getSharedData;
import o.handlePerformanceLog;
import o.isShowMenu;
import o.onCancelLoad;
import o.onCanceled;
import o.postWebMessage;
import o.removeSharedData;
import o.retainAll;
import o.setOnWheelViewListener;
import o.stopIgnoring;
import o.style;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MyReferralDetailActivity extends BaseActivity implements ConstraintProxy$StorageNotLowProxy.setMax {
    private static int IsOverlapping = 0;
    public static final String OPEN_BOTTOM_SHEET_DIRECTLY = "open_bottom_sheet_directly";
    private static char[] toFloatRange = {'U', 'T', 'F', '-', '8', 'V', 'W', 'X', 'Y'};
    private static char toIntRange = '\u0003';
    private static int values = 1;
    @BindView(2131362551)
    CollapsingToolbarLayout collapsingToolbarLayout;
    @BindView(2131362611)
    ContactSelectorView contactSelectorView;
    private String equals;
    private MyReferralConsult getMax;
    private String getMin;
    private boolean isInside;
    @BindView(2131363359)
    ImageView ivBackgroundReferral;
    @Inject
    public getDuration.length readDeepLinkPropertiesPresenter;
    @BindView(2131364328)
    ReferralCodeSectionView referralCodeSectionView;
    @Inject
    public ConstraintProxy$StorageNotLowProxy.setMin referralTrackerPresenter;
    private retainAll setMax;
    @BindView(2131365942)
    SearchView svSearch;
    @BindView(2131365499)
    TextView tvReferralSearchTitle;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BundleKey {
        public static final String BUNDLE_REFERRAL_CONSULT = "referral_consult";
        public static final String BUNDLE_REFERRAL_DEEPLINK = "referral_deepLink";
        public static final String BUNDLE_SHOW_REFERRAL = "referral_show";
    }

    public void configToolbar() {
        try {
            int i = values + 103;
            try {
                IsOverlapping = i % 128;
                if (i % 2 != 0) {
                    int i2 = 37 / 0;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void dismissProgress() {
        int i = values + 91;
        IsOverlapping = i % 128;
        if ((i % 2 != 0 ? 'H' : '-') == 'H') {
            Object obj = null;
            super.hashCode();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        if ((r4 == null) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        r2 = r4.length();
        r4 = values + 21;
        IsOverlapping = r4 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if ((r4 != null) != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = IsOverlapping
            int r0 = r0 + 41
            int r1 = r0 % 128
            values = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            r0 = 57
            int r0 = r0 / r2
            if (r4 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x0022
            goto L_0x002d
        L_0x0019:
            r4 = move-exception
            throw r4
        L_0x001b:
            if (r4 == 0) goto L_0x001f
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            if (r0 == 0) goto L_0x002d
        L_0x0022:
            int r4 = IsOverlapping
            int r4 = r4 + 23
            int r0 = r4 % 128
            values = r0
        L_0x002a:
            int r4 = r4 % 2
            goto L_0x003a
        L_0x002d:
            int r2 = r4.length()
            int r4 = values
            int r4 = r4 + 21
            int r0 = r4 % 128
            IsOverlapping = r0
            goto L_0x002a
        L_0x003a:
            int r4 = o.dispatchOnCancelled.setMax(r2)
            if (r2 == r4) goto L_0x0051
            o.onCanceled r0 = new o.onCanceled
            r0.<init>(r2, r4, r1)
            r4 = 370631603(0x161763b3, float:1.2229142E-25)
            o.onCancelLoad.setMax(r4, r0)     // Catch:{ Exception -> 0x004f }
            o.onCancelLoad.getMin(r4, r0)     // Catch:{ Exception -> 0x004f }
            goto L_0x0051
        L_0x004f:
            r4 = move-exception
            throw r4
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.referral.MyReferralDetailActivity.onError(java.lang.String):void");
    }

    public void onFinishCheckLatestReferralCampaign(MyReferralConsult myReferralConsult) {
        int i = IsOverlapping + 25;
        values = i % 128;
        int i2 = i % 2;
    }

    public void showProgress() {
        int i = IsOverlapping + 7;
        values = i % 128;
        int i2 = i % 2;
    }

    static /* synthetic */ boolean access$002(MyReferralDetailActivity myReferralDetailActivity, boolean z) {
        int i = IsOverlapping + 55;
        values = i % 128;
        int i2 = i % 2;
        try {
            myReferralDetailActivity.isInside = z;
            int i3 = values + 85;
            IsOverlapping = i3 % 128;
            int i4 = i3 % 2;
            return z;
        } catch (Exception e) {
            throw e;
        }
    }

    public int getLayout() {
        try {
            int i = IsOverlapping + 1;
            values = i % 128;
            if (!(i % 2 == 0)) {
                return R.layout.activity_my_referral;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return R.layout.activity_my_referral;
        } catch (Exception e) {
            throw e;
        }
    }

    public void init() {
        Context context;
        Context context2;
        int length;
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context context3 = null;
        if ((baseContext != null ? 'X' : '[') != 'X') {
            context = null;
        } else {
            context = baseContext.getApplicationContext();
        }
        if ((context != null ? 'O' : Typography.less) == 'O' && (length2 = context.fileList().length) != (min = dispatchOnCancelled.getMin(context, length2))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(876305375, oncanceled);
            onCancelLoad.getMin(876305375, oncanceled);
        }
        try {
            if (this.setMax == null) {
                ResourceUtils.AnonymousClass1.setMax setmax = new ResourceUtils.AnonymousClass1.setMax((byte) 0);
                PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
                if (applicationComponent != null) {
                    setmax.equals = applicationComponent;
                    setmax.toFloatRange = new ReferralTrackerModule(this);
                    setmax.isInside = new ServicesModule((style.getMin) new style.getMin() {
                        @JvmDefault
                        public final void dismissProgress() {
                        }

                        @JvmDefault
                        public final void getMax(@NotNull ThirdPartyService thirdPartyService) {
                            Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
                        }

                        @JvmDefault
                        public final void getMax(@NotNull ThirdPartyService thirdPartyService, @NotNull String str) {
                            Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
                            Intrinsics.checkNotNullParameter(str, "authCode");
                        }

                        @JvmDefault
                        public final void getMax(@NotNull List<ThirdPartyService> list) {
                            Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                        }

                        @JvmDefault
                        public final void getMin(@NotNull List<ThirdPartyService> list) {
                            Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                        }

                        @JvmDefault
                        public final void length() {
                        }

                        @JvmDefault
                        public final void onError(@Nullable String str) {
                        }

                        @JvmDefault
                        public final void setMax(@NotNull List<ThirdPartyService> list) {
                            Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                        }

                        @JvmDefault
                        public final void setMax(boolean z) {
                        }

                        @JvmDefault
                        public final void setMin() {
                        }

                        @JvmDefault
                        public final void setMin(@NotNull ThirdPartyService thirdPartyService) {
                            Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
                        }

                        @JvmDefault
                        public final void setMin(@NotNull List<ThirdPartyService> list) {
                            Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                        }

                        @JvmDefault
                        public final void showProgress() {
                        }
                    });
                    DeepLinkModule.setMin max = DeepLinkModule.getMax();
                    max.getMax = this;
                    max.length = TrackerKey.SourceType.REFERRAL;
                    setmax.setMax = new DeepLinkModule(max, (byte) 0);
                    ScanQrModule.setMin max2 = ScanQrModule.getMax();
                    max2.setMin = this;
                    setmax.setMin = new ScanQrModule(max2, (byte) 0);
                    RestoreUrlModule.setMin min2 = RestoreUrlModule.setMin();
                    min2.getMax = this;
                    setmax.length = new RestoreUrlModule(min2, (byte) 0);
                    FeatureModule.length length3 = FeatureModule.length();
                    length3.setMax = this;
                    setmax.getMin = new FeatureModule(length3, (byte) 0);
                    OauthModule.getMax min3 = OauthModule.setMin();
                    min3.setMin = this;
                    setmax.getMax = new OauthModule(min3, (byte) 0);
                    stopIgnoring.setMin(setmax.setMax, DeepLinkModule.class);
                    stopIgnoring.setMin(setmax.setMin, ScanQrModule.class);
                    stopIgnoring.setMin(setmax.length, RestoreUrlModule.class);
                    stopIgnoring.setMin(setmax.getMin, FeatureModule.class);
                    stopIgnoring.setMin(setmax.getMax, OauthModule.class);
                    if (setmax.isInside == null) {
                        try {
                            setmax.isInside = new ServicesModule();
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                    stopIgnoring.setMin(setmax.toFloatRange, ReferralTrackerModule.class);
                    stopIgnoring.setMin(setmax.equals, PrepareException.AnonymousClass1.class);
                    this.setMax = new ResourceUtils.AnonymousClass1(setmax.setMax, setmax.setMin, setmax.length, setmax.getMin, setmax.getMax, setmax.isInside, setmax.toFloatRange, setmax.equals, (byte) 0);
                    int i = IsOverlapping + 119;
                    values = i % 128;
                    int i2 = i % 2;
                } else {
                    throw null;
                }
            }
            this.setMax.getMin(this);
            registerPresenter(this.referralTrackerPresenter, this.readDeepLinkPropertiesPresenter);
            setCenterTitle(getString(R.string.title_activity_my_referral));
            setMenuLeftButton((int) R.drawable.btn_arrow_left);
            Context baseContext2 = getBaseContext();
            if (baseContext2 != null) {
                context2 = baseContext2.getApplicationContext();
            } else {
                context2 = null;
            }
            if (context2 != null) {
                int i3 = IsOverlapping + 61;
                values = i3 % 128;
                int i4 = i3 % 2;
                int max3 = dispatchOnCancelled.getMax(context2, 1883630528);
                if (1883630528 != max3) {
                    onCanceled oncanceled2 = new onCanceled(1883630528, max3, 512);
                    onCancelLoad.setMax(1883630528, oncanceled2);
                    onCancelLoad.getMin(1883630528, oncanceled2);
                    int i5 = IsOverlapping + 93;
                    values = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
            this.referralCodeSectionView.showSkeleton();
            this.referralTrackerPresenter.toFloatRange();
            Context baseContext3 = getBaseContext();
            if (baseContext3 != null) {
                context3 = baseContext3.getApplicationContext();
            }
            if ((context3 != null) && (length = dispatchOnCancelled.length(context3, 0)) != 0) {
                onCanceled oncanceled3 = new onCanceled(0, length, 4);
                onCancelLoad.setMax(1254505152, oncanceled3);
                onCancelLoad.getMin(1254505152, oncanceled3);
            }
            setOnWheelViewListener.getMax(getWindow().getDecorView(), new setOnWheelViewListener.length() {
                public final void length() {
                    MyReferralDetailActivity.access$002(MyReferralDetailActivity.this, true);
                }

                public final void setMax() {
                    MyReferralDetailActivity.access$002(MyReferralDetailActivity.this, false);
                }
            });
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        if (r4.getMax != null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if ((r0 != null ? '/' : 'X') != 'X') goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean setMax() {
        /*
            r4 = this;
            int r0 = values
            int r0 = r0 + 25
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L_0x001f
            id.dana.referral.model.MyReferralConsult r0 = r4.getMax
            r2 = 0
            int r2 = r2.length     // Catch:{ all -> 0x001d }
            r2 = 88
            if (r0 == 0) goto L_0x0018
            r0 = 47
            goto L_0x001a
        L_0x0018:
            r0 = 88
        L_0x001a:
            if (r0 == r2) goto L_0x0044
            goto L_0x0023
        L_0x001d:
            r0 = move-exception
            throw r0
        L_0x001f:
            id.dana.referral.model.MyReferralConsult r0 = r4.getMax     // Catch:{ Exception -> 0x004f }
            if (r0 == 0) goto L_0x0044
        L_0x0023:
            id.dana.referral.model.MyReferralConsult r0 = r4.getMax
            java.lang.String r0 = r0.length
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0030
            r0 = 0
            goto L_0x0031
        L_0x0030:
            r0 = 1
        L_0x0031:
            if (r0 == r2) goto L_0x0044
            int r0 = IsOverlapping     // Catch:{ Exception -> 0x0042 }
            int r0 = r0 + 35
            int r3 = r0 % 128
            values = r3     // Catch:{ Exception -> 0x004f }
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r1 = 1
        L_0x0041:
            return r1
        L_0x0042:
            r0 = move-exception
            throw r0
        L_0x0044:
            int r0 = values
            int r0 = r0 + 67
            int r2 = r0 % 128
            IsOverlapping = r2
            int r0 = r0 % 2
            return r1
        L_0x004f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.referral.MyReferralDetailActivity.setMax():boolean");
    }

    public void setReferralWidgetFeatureValue(List<handlePerformanceLog> list) {
        int i;
        handlePerformanceLog handleperformancelog;
        int i2 = values + 93;
        IsOverlapping = i2 % 128;
        int i3 = i2 % 2;
        boolean z = false;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-2139686469, oncanceled);
            onCancelLoad.getMin(-2139686469, oncanceled);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<handlePerformanceLog> it = list.iterator();
        while (true) {
            char c = 1;
            if (it.hasNext()) {
                int i4 = IsOverlapping + 3;
                values = i4 % 128;
                if (i4 % 2 == 0) {
                    handleperformancelog = it.next();
                    boolean min = handleperformancelog.setMin();
                    Object obj = null;
                    super.hashCode();
                    if (!min) {
                    }
                } else {
                    handleperformancelog = it.next();
                    if (handleperformancelog.setMin()) {
                        c = 10;
                    }
                    if (c != 10) {
                    }
                }
                int i5 = values + 53;
                IsOverlapping = i5 % 128;
                int i6 = i5 % 2;
                arrayList.add(handleperformancelog);
                int i7 = IsOverlapping + 61;
                values = i7 % 128;
                int i8 = i7 % 2;
            } else {
                try {
                    boolean isEmpty = arrayList.isEmpty();
                    ViewGroup.LayoutParams layoutParams = this.ivBackgroundReferral.getLayoutParams();
                    Resources resources = getResources();
                    int max2 = dispatchOnCancelled.getMax(0);
                    if (max2 != 0) {
                        onCanceled oncanceled2 = new onCanceled(0, max2, 16);
                        onCancelLoad.setMax(-738516133, oncanceled2);
                        onCancelLoad.getMin(-738516133, oncanceled2);
                    }
                    if (!setMax()) {
                        z = true;
                    }
                    if (z) {
                        i = isEmpty ? R.dimen.f32232131165973 : R.dimen.f32252131165975;
                    } else if (isEmpty) {
                        int i9 = values + 29;
                        IsOverlapping = i9 % 128;
                        int i10 = i9 % 2;
                        i = R.dimen.f32242131165974;
                    } else {
                        i = R.dimen.f32222131165972;
                    }
                    layoutParams.height = resources.getDimensionPixelSize(i);
                    this.ivBackgroundReferral.setLayoutParams(layoutParams);
                    this.referralCodeSectionView.setReferralContainerBottomPadding(arrayList.isEmpty());
                    this.referralCodeSectionView.setReferralButtons(list);
                    int i11 = values + 125;
                    IsOverlapping = i11 % 128;
                    int i12 = i11 % 2;
                    return;
                } catch (Exception e) {
                    throw e;
                }
            }
        }
    }

    public void onGetReferralConsultSuccess(MyReferralConsult myReferralConsult) {
        int i = values + 75;
        IsOverlapping = i % 128;
        if ((i % 2 != 0 ? ']' : 14) != ']') {
            this.getMax = myReferralConsult;
            this.referralTrackerPresenter.length(myReferralConsult);
            return;
        }
        this.getMax = myReferralConsult;
        this.referralTrackerPresenter.length(myReferralConsult);
        int i2 = 32 / 0;
    }

    public void onGetMessageTemplateSuccess(postWebMessage postwebmessage) {
        String str;
        postWebMessage insertReferralLink = postwebmessage.insertReferralCode(this.equals).insertReferralLink(this.getMin);
        boolean z = false;
        if (!(WheelView.OnWheelViewListener.getMin())) {
            str = insertReferralLink.getMessageEnglish();
        } else {
            str = insertReferralLink.getMessageIndonesia();
        }
        if (str.isEmpty()) {
            z = true;
        }
        if (z) {
            try {
                this.referralCodeSectionView.setMessage(getString(R.string.msg_share_text));
                int i = IsOverlapping + 33;
                values = i % 128;
                int i2 = i % 2;
            } catch (Exception e) {
                throw e;
            }
        } else {
            this.referralCodeSectionView.setMessage(str);
            int i3 = IsOverlapping + 27;
            values = i3 % 128;
            int i4 = i3 % 2;
        }
        this.referralTrackerPresenter.setMin();
        int i5 = IsOverlapping + 3;
        values = i5 % 128;
        int i6 = i5 % 2;
    }

    public void onGetMessageTemplateError() {
        Context context;
        int length;
        int i = values + 43;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        Context baseContext = getBaseContext();
        if (baseContext != null) {
            try {
                int i3 = values + 7;
                try {
                    IsOverlapping = i3 % 128;
                    int i4 = i3 % 2;
                    context = baseContext.getApplicationContext();
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            context = null;
        }
        if (!((context == null) || (length = dispatchOnCancelled.length(context, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(313715806, oncanceled);
            onCancelLoad.getMin(313715806, oncanceled);
        }
        this.referralCodeSectionView.setMessage(getString(R.string.msg_share_text));
        this.referralTrackerPresenter.setMin();
    }

    /* access modifiers changed from: protected */
    @OnClick({2131363774})
    public void closeToHome(View view) {
        int i = IsOverlapping + 61;
        values = i % 128;
        int i2 = i % 2;
        try {
            backToHomepage((Bundle) null);
            int i3 = values + 75;
            IsOverlapping = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if ((r0 != null) != true) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r1 = r0.getApplicationContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005f, code lost:
        if (r7 != r0) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0068, code lost:
        if (r7 != r0) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r0 != null) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRequestPermissionsResult(int r7, @androidx.annotation.NonNull java.lang.String[] r8, @androidx.annotation.NonNull int[] r9) {
        /*
            r6 = this;
            int r0 = values
            int r0 = r0 + 27
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x001b
            android.content.Context r0 = r6.getBaseContext()
            super.hashCode()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0026
            goto L_0x0031
        L_0x0019:
            r7 = move-exception
            throw r7
        L_0x001b:
            android.content.Context r0 = r6.getBaseContext()
            if (r0 == 0) goto L_0x0023
            r4 = 1
            goto L_0x0024
        L_0x0023:
            r4 = 0
        L_0x0024:
            if (r4 == r2) goto L_0x0031
        L_0x0026:
            int r0 = values
            int r0 = r0 + 83
            int r4 = r0 % 128
            IsOverlapping = r4
            int r0 = r0 % 2
            goto L_0x0035
        L_0x0031:
            android.content.Context r1 = r0.getApplicationContext()
        L_0x0035:
            r0 = 93
            if (r1 == 0) goto L_0x003c
            r4 = 93
            goto L_0x003e
        L_0x003c:
            r4 = 72
        L_0x003e:
            r5 = -385212661(0xffffffffe90a1f0b, float:-1.0436147E25)
            if (r4 == r0) goto L_0x0044
            goto L_0x0077
        L_0x0044:
            int r0 = IsOverlapping
            int r0 = r0 + 61
            int r4 = r0 % 128
            values = r4
            int r0 = r0 % 2
            r4 = 14
            if (r0 != 0) goto L_0x0054
            r0 = 5
            goto L_0x0056
        L_0x0054:
            r0 = 14
        L_0x0056:
            if (r0 == r4) goto L_0x0064
            int r0 = o.dispatchOnCancelled.setMin(r1, r7)     // Catch:{ Exception -> 0x0098 }
            r1 = 59
            int r1 = r1 / r3
            if (r7 == r0) goto L_0x0077
            goto L_0x006a
        L_0x0062:
            r7 = move-exception
            throw r7
        L_0x0064:
            int r0 = o.dispatchOnCancelled.setMin(r1, r7)     // Catch:{ Exception -> 0x009a }
            if (r7 == r0) goto L_0x0077
        L_0x006a:
            o.onCanceled r1 = new o.onCanceled
            r4 = 8
            r1.<init>(r7, r0, r4)
            o.onCancelLoad.setMax(r5, r1)
            o.onCancelLoad.getMin(r5, r1)
        L_0x0077:
            int r0 = o.dispatchOnCancelled.getMax(r3)     // Catch:{ Exception -> 0x0098 }
            if (r0 == 0) goto L_0x008a
            o.onCanceled r1 = new o.onCanceled
            r4 = 16
            r1.<init>(r3, r0, r4)
            o.onCancelLoad.setMax(r5, r1)
            o.onCancelLoad.getMin(r5, r1)
        L_0x008a:
            id.dana.richview.contactselector.ContactSelectorView r0 = r6.contactSelectorView
            if (r0 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r3 = 1
        L_0x0090:
            if (r3 == r2) goto L_0x0097
            id.dana.richview.contactselector.ContactSelectorView r0 = r6.contactSelectorView
            r0.onRequestPermissionsResult(r7, r8, r9)
        L_0x0097:
            return
        L_0x0098:
            r7 = move-exception
            throw r7
        L_0x009a:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.referral.MyReferralDetailActivity.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }

    private boolean getMin(MotionEvent motionEvent) {
        if ((!this.isInside) || length(motionEvent)) {
            try {
                int i = IsOverlapping + 77;
                values = i % 128;
                int i2 = i % 2;
                return false;
            } catch (Exception e) {
                throw e;
            }
        } else {
            int i3 = IsOverlapping + 97;
            values = i3 % 128;
            return (i3 % 2 == 0 ? 'Y' : 18) == 18;
        }
    }

    private boolean length(MotionEvent motionEvent) {
        int i = values + 65;
        IsOverlapping = i % 128;
        if (!(i % 2 != 0)) {
            try {
                try {
                    return this.svSearch.isClearImageViewRect((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            boolean isClearImageViewRect = this.svSearch.isClearImageViewRect((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            Object[] objArr = null;
            int length = objArr.length;
            return isClearImageViewRect;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if ((getMin(r5) ? '[' : '0') != '0') goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        if (r3 != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        if ((r0 instanceof android.widget.EditText) != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        return super.dispatchTouchEvent(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r0 != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = IsOverlapping
            int r0 = r0 + 93
            int r1 = r0 % 128
            values = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L_0x0017
            boolean r0 = r4.getMin(r5)
            int r2 = r1.length     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0074
            goto L_0x0026
        L_0x0015:
            r5 = move-exception
            throw r5
        L_0x0017:
            boolean r0 = r4.getMin(r5)
            r2 = 48
            if (r0 == 0) goto L_0x0022
            r0 = 91
            goto L_0x0024
        L_0x0022:
            r0 = 48
        L_0x0024:
            if (r0 == r2) goto L_0x0074
        L_0x0026:
            int r0 = r5.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0073
            int r0 = values     // Catch:{ Exception -> 0x0071 }
            int r0 = r0 + 103
            int r3 = r0 % 128
            IsOverlapping = r3     // Catch:{ Exception -> 0x0071 }
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x0045
            android.view.View r0 = r4.getCurrentFocus()
            boolean r3 = r0 instanceof android.widget.EditText
            int r1 = r1.length     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x0073
            goto L_0x004d
        L_0x0043:
            r5 = move-exception
            throw r5
        L_0x0045:
            android.view.View r0 = r4.getCurrentFocus()
            boolean r1 = r0 instanceof android.widget.EditText
            if (r1 == 0) goto L_0x0073
        L_0x004d:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.getGlobalVisibleRect(r1)
            float r3 = r5.getRawX()
            int r3 = (int) r3
            float r5 = r5.getRawY()
            int r5 = (int) r5
            boolean r5 = r1.contains(r3, r5)
            if (r5 != 0) goto L_0x0067
            r5 = 1
            goto L_0x0068
        L_0x0067:
            r5 = 0
        L_0x0068:
            if (r5 == 0) goto L_0x0073
            o.setOnWheelViewListener.getMax((android.app.Activity) r4)
            r0.clearFocus()
            goto L_0x0073
        L_0x0071:
            r5 = move-exception
            throw r5
        L_0x0073:
            return r2
        L_0x0074:
            boolean r5 = super.dispatchTouchEvent(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.referral.MyReferralDetailActivity.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onGetContactSyncFeature(boolean z) {
        if (z) {
            this.contactSelectorView.setContactHeaderColor(-657931);
            this.contactSelectorView.setListener(new ContactSelectorView.getMin() {
                public final void getMax() {
                }

                public final void setMax(boolean z) {
                    if (MyReferralDetailActivity.this.svSearch != null) {
                        MyReferralDetailActivity.this.svSearch.setVisibility(z ? 0 : 8);
                    }
                }
            });
            addDisposable(this.svSearch.getKeyword().subscribe(new removeSharedData(this)));
            this.contactSelectorView.setRecipientListener(new getSharedData(this));
            this.contactSelectorView.initContactList();
            this.contactSelectorView.checkPermission();
            this.contactSelectorView.setVisibility(0);
            this.tvReferralSearchTitle.setVisibility(0);
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) this.collapsingToolbarLayout.getLayoutParams();
            layoutParams.setScrollFlags(1);
            this.collapsingToolbarLayout.setLayoutParams(layoutParams);
            int i = values + 59;
            IsOverlapping = i % 128;
            int i2 = i % 2;
            return;
        }
        this.contactSelectorView.setVisibility(8);
        this.tvReferralSearchTitle.setVisibility(8);
        int i3 = IsOverlapping + 107;
        values = i3 % 128;
        if ((i3 % 2 == 0 ? 'Y' : '%') != '%') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    public void onCheckRegisteredUser(boolean z, String str) {
        if (z) {
            View inflate = getLayoutInflater().inflate(R.layout.view_top_toast, (ViewGroup) null);
            Toast toast = new Toast(this);
            toast.setView(inflate);
            toast.setDuration(0);
            toast.setGravity(55, 0, getSupportActionBar().length());
            toast.show();
            this.contactSelectorView.checkPermission();
            int i = values + 93;
            IsOverlapping = i % 128;
            int i2 = i % 2;
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        String format = String.format(getString(R.string.msg_referral_text), new Object[]{this.getMin, this.equals});
        try {
            StringBuilder sb = new StringBuilder("https://api.whatsapp.com/send?phone=");
            sb.append(str);
            sb.append("&text=");
            sb.append(URLEncoder.encode(format, getMin(new char[]{1, 2, 0, 5, 'Y'}, 6 - (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)), (byte) (getResources().getString(R.string.merchant_review_positive_subtitle).substring(1, 2).length() + 32)).intern()));
            String obj = sb.toString();
            intent.setPackage("com.whatsapp");
            intent.setData(Uri.parse(obj));
            if (!getLineColor.getMax(this, "com.whatsapp")) {
                startActivity(Intent.createChooser(getLineColor.getMin(String.format(getString(R.string.msg_referral_text_non_bold), new Object[]{this.getMin, this.equals})), getString(R.string.share_via)));
                return;
            }
            int i3 = IsOverlapping + 89;
            values = i3 % 128;
            int i4 = i3 % 2;
            startActivity(intent);
        } catch (Exception e) {
            updateActionSheetContent.exception(DanaLogConstants.BizType.URL_ENCODE, DanaLogConstants.ExceptionType.URL_ENCODE_EXCEPTION, e.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if ((setMax()) != true) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (setMax() != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        r0 = 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGetDeeplinkReferralSuccess(o.APWebSettings r6) {
        /*
            r5 = this;
            int r0 = IsOverlapping
            int r0 = r0 + 123
            int r1 = r0 % 128
            values = r1
            int r0 = r0 % 2
            r1 = 49
            if (r0 != 0) goto L_0x0011
            r0 = 99
            goto L_0x0013
        L_0x0011:
            r0 = 49
        L_0x0013:
            r2 = 2131365942(0x7f0a1036, float:1.8351764E38)
            r3 = 1
            r4 = 0
            if (r0 == r1) goto L_0x0044
            java.lang.String r6 = r6.getLink()     // Catch:{ Exception -> 0x0042 }
            r5.getMin = r6     // Catch:{ Exception -> 0x0040 }
            id.dana.referral.ReferralCodeSectionView r6 = r5.referralCodeSectionView     // Catch:{ Exception -> 0x0040 }
            r6.hideSkeleton()     // Catch:{ Exception -> 0x0040 }
            android.view.View r6 = r5.findViewById(r2)     // Catch:{ Exception -> 0x0040 }
            id.dana.richview.SearchView r6 = (id.dana.richview.SearchView) r6     // Catch:{ Exception -> 0x0040 }
            r5.svSearch = r6     // Catch:{ Exception -> 0x0040 }
            id.dana.richview.contactselector.ContactSelectorView r6 = r5.contactSelectorView     // Catch:{ Exception -> 0x0040 }
            boolean r0 = r5.setMax()     // Catch:{ Exception -> 0x0040 }
            r1 = 86
            int r1 = r1 / r4
            if (r0 == 0) goto L_0x003a
            r0 = 1
            goto L_0x003b
        L_0x003a:
            r0 = 0
        L_0x003b:
            if (r0 == r3) goto L_0x005f
            goto L_0x0061
        L_0x003e:
            r6 = move-exception
            throw r6
        L_0x0040:
            r6 = move-exception
            throw r6
        L_0x0042:
            r6 = move-exception
            throw r6
        L_0x0044:
            java.lang.String r6 = r6.getLink()
            r5.getMin = r6
            id.dana.referral.ReferralCodeSectionView r6 = r5.referralCodeSectionView
            r6.hideSkeleton()
            android.view.View r6 = r5.findViewById(r2)
            id.dana.richview.SearchView r6 = (id.dana.richview.SearchView) r6
            r5.svSearch = r6
            id.dana.richview.contactselector.ContactSelectorView r6 = r5.contactSelectorView
            boolean r0 = r5.setMax()
            if (r0 == 0) goto L_0x0061
        L_0x005f:
            r0 = 0
            goto L_0x0063
        L_0x0061:
            r0 = 8
        L_0x0063:
            r6.setVisibility(r0)
            id.dana.richview.SearchView r6 = r5.svSearch
            r0 = 2131888509(0x7f12097d, float:1.9411655E38)
            java.lang.String r0 = r5.getString(r0)
            r6.setSearchHint(r0)
            id.dana.referral.model.MyReferralConsult r6 = r5.getMax
            if (r6 != 0) goto L_0x0079
            java.lang.String r6 = ""
            goto L_0x007b
        L_0x0079:
            java.lang.String r6 = r6.length
        L_0x007b:
            r5.equals = r6
            id.dana.referral.ReferralCodeSectionView r0 = r5.referralCodeSectionView
            r0.setReferralCode(r6)
            id.dana.referral.ReferralCodeSectionView r6 = r5.referralCodeSectionView
            java.lang.String r0 = r5.getMin
            r6.setDeepLinkReferral(r0)
            id.dana.referral.ReferralCodeSectionView r6 = r5.referralCodeSectionView
            o.setSharedData r0 = new o.setSharedData
            r0.<init>(r5)
            r6.setListener(r0)
            o.ConstraintProxy$StorageNotLowProxy$setMin r6 = r5.referralTrackerPresenter
            r6.length()
            com.google.android.material.appbar.CollapsingToolbarLayout r6 = r5.collapsingToolbarLayout
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r6 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r6
            r6.setScrollFlags(r4)
            com.google.android.material.appbar.CollapsingToolbarLayout r0 = r5.collapsingToolbarLayout
            r0.setLayoutParams(r6)
            android.content.Context r6 = r5.getBaseContext()
            r0 = 56
            if (r6 == 0) goto L_0x00b3
            r1 = 56
            goto L_0x00b5
        L_0x00b3:
            r1 = 77
        L_0x00b5:
            if (r1 == r0) goto L_0x00b9
            r6 = 0
            goto L_0x00d1
        L_0x00b9:
            int r0 = IsOverlapping
            int r0 = r0 + 29
            int r1 = r0 % 128
            values = r1
            int r0 = r0 % 2
            android.content.Context r6 = r6.getApplicationContext()
            int r0 = IsOverlapping
            int r0 = r0 + 53
            int r1 = r0 % 128
            values = r1
            int r0 = r0 % 2
        L_0x00d1:
            if (r6 == 0) goto L_0x00d4
            r4 = 1
        L_0x00d4:
            if (r4 == r3) goto L_0x00d7
            goto L_0x00f2
        L_0x00d7:
            java.lang.String[] r0 = r6.fileList()
            int r0 = r0.length
            int r6 = o.dispatchOnCancelled.getMin(r6, r0)
            if (r0 == r6) goto L_0x00f2
            o.onCanceled r1 = new o.onCanceled
            r2 = 32
            r1.<init>(r0, r6, r2)
            r6 = 1167998254(0x459e3d2e, float:5063.6475)
            o.onCancelLoad.setMax(r6, r1)
            o.onCancelLoad.getMin(r6, r1)
        L_0x00f2:
            android.content.Intent r6 = r5.getIntent()
            android.os.Bundle r6 = r6.getExtras()
            java.lang.String r0 = "open_bottom_sheet_directly"
            boolean r6 = r6.getBoolean(r0)
            if (r6 == 0) goto L_0x0107
            id.dana.referral.ReferralCodeSectionView r6 = r5.referralCodeSectionView
            r6.onShareReferralCodeClicked()
        L_0x0107:
            o.ConstraintProxy$StorageNotLowProxy$setMin r6 = r5.referralTrackerPresenter
            r6.getMin()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.referral.MyReferralDetailActivity.onGetDeeplinkReferralSuccess(o.APWebSettings):void");
    }

    public static /* synthetic */ void getMax(MyReferralDetailActivity myReferralDetailActivity, RecipientModel recipientModel) {
        int i = values + 61;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        try {
            myReferralDetailActivity.referralTrackerPresenter.setMax(recipientModel.isInside);
            try {
                int i3 = values + 115;
                IsOverlapping = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static /* synthetic */ void setMax(MyReferralDetailActivity myReferralDetailActivity, String str) {
        try {
            int i = IsOverlapping + 27;
            values = i % 128;
            int i2 = i % 2;
            if ((str.trim().contains("https://link.dana.id/") ? 'N' : 'U') != 'N') {
                DanaH5.startContainerFullUrl(isShowMenu.setMin(str));
                return;
            }
            int i3 = values + 31;
            IsOverlapping = i3 % 128;
            if (i3 % 2 == 0) {
                myReferralDetailActivity.readDeepLinkPropertiesPresenter.setMax(str);
                return;
            }
            myReferralDetailActivity.readDeepLinkPropertiesPresenter.setMax(str);
            Object obj = null;
            super.hashCode();
        } catch (Exception e) {
            throw e;
        }
    }

    public static /* synthetic */ void length(MyReferralDetailActivity myReferralDetailActivity, String str) {
        try {
            int i = values + 35;
            IsOverlapping = i % 128;
            int i2 = i % 2;
            myReferralDetailActivity.contactSelectorView.observeContactPagedList(str);
            int i3 = IsOverlapping + 109;
            values = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        if ((r6 == r7) != true) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        if (r6 == r7) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r8 = o.onActivityPreStopped.setMin(r6, r1);
        r6 = o.onActivityPreStopped.length(r6, r1);
        r9 = o.onActivityPreStopped.setMin(r7, r1);
        r7 = o.onActivityPreStopped.length(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008e, code lost:
        if (r6 != r7) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0090, code lost:
        r8 = o.onActivityPreStopped.setMax(r8, r1);
        r9 = o.onActivityPreStopped.setMax(r9, r1);
        r6 = o.onActivityPreStopped.getMax(r8, r6, r1);
        r7 = o.onActivityPreStopped.getMax(r9, r7, r1);
        r2[r3] = r0[r6];
        r2[r3 + 1] = r0[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ab, code lost:
        if (r8 != r9) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ad, code lost:
        r6 = o.onActivityPreStopped.setMax(r6, r1);
        r7 = o.onActivityPreStopped.setMax(r7, r1);
        r6 = o.onActivityPreStopped.getMax(r8, r6, r1);
        r7 = o.onActivityPreStopped.getMax(r9, r7, r1);
        r2[r3] = r0[r6];
        r2[r3 + 1] = r0[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r7 = o.onActivityPreStopped.getMax(r8, r7, r1);
        r6 = o.onActivityPreStopped.getMax(r9, r6, r1);
        r2[r3] = r0[r7];
        r2[r3 + 1] = r0[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00de, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00df, code lost:
        throw r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMin(char[] r10, int r11, byte r12) {
        /*
            int r0 = IsOverlapping     // Catch:{ Exception -> 0x00e6 }
            int r0 = r0 + 113
            int r1 = r0 % 128
            values = r1     // Catch:{ Exception -> 0x00e6 }
            int r0 = r0 % 2
            char[] r0 = toFloatRange
            char r1 = toIntRange
            char[] r2 = new char[r11]
            int r3 = r11 % 2
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0038
            int r3 = values
            int r3 = r3 + 65
            int r6 = r3 % 128
            IsOverlapping = r6
            int r3 = r3 % 2
            if (r3 == 0) goto L_0x0024
            r3 = 0
            goto L_0x0025
        L_0x0024:
            r3 = 1
        L_0x0025:
            if (r3 == 0) goto L_0x0030
            int r11 = r11 + -1
            char r3 = r10[r11]
            int r3 = r3 - r12
            char r3 = (char) r3
            r2[r11] = r3
            goto L_0x0038
        L_0x0030:
            int r11 = r11 + 54
            char r3 = r10[r11]
            int r3 = r3 / r12
            char r3 = (char) r3
            r2[r11] = r3
        L_0x0038:
            if (r11 <= r5) goto L_0x00e0
            int r3 = values
            int r3 = r3 + 97
            int r6 = r3 % 128
            IsOverlapping = r6
            int r3 = r3 % 2
            r3 = 0
        L_0x0045:
            if (r3 >= r11) goto L_0x0049
            r6 = 0
            goto L_0x004a
        L_0x0049:
            r6 = 1
        L_0x004a:
            if (r6 == r5) goto L_0x00e0
            int r6 = IsOverlapping
            int r6 = r6 + 81
            int r7 = r6 % 128
            values = r7
            int r6 = r6 % 2
            if (r6 != 0) goto L_0x005a
            r6 = 0
            goto L_0x005b
        L_0x005a:
            r6 = 1
        L_0x005b:
            if (r6 == r5) goto L_0x006b
            char r6 = r10[r3]
            int r7 = r3 % 0
            char r7 = r10[r7]
            if (r6 != r7) goto L_0x0067
            r8 = 1
            goto L_0x0068
        L_0x0067:
            r8 = 0
        L_0x0068:
            if (r8 == r5) goto L_0x0073
            goto L_0x007e
        L_0x006b:
            char r6 = r10[r3]
            int r7 = r3 + 1
            char r7 = r10[r7]
            if (r6 != r7) goto L_0x007e
        L_0x0073:
            int r6 = r6 - r12
            char r6 = (char) r6
            r2[r3] = r6
            int r6 = r3 + 1
            int r7 = r7 - r12
            char r7 = (char) r7
            r2[r6] = r7
            goto L_0x00da
        L_0x007e:
            int r8 = o.onActivityPreStopped.setMin(r6, r1)     // Catch:{ Exception -> 0x00de }
            int r6 = o.onActivityPreStopped.length(r6, r1)     // Catch:{ Exception -> 0x00de }
            int r9 = o.onActivityPreStopped.setMin(r7, r1)     // Catch:{ Exception -> 0x00de }
            int r7 = o.onActivityPreStopped.length(r7, r1)     // Catch:{ Exception -> 0x00de }
            if (r6 != r7) goto L_0x00ab
            int r8 = o.onActivityPreStopped.setMax(r8, r1)
            int r9 = o.onActivityPreStopped.setMax(r9, r1)
            int r6 = o.onActivityPreStopped.getMax(r8, r6, r1)
            int r7 = o.onActivityPreStopped.getMax(r9, r7, r1)
            char r6 = r0[r6]
            r2[r3] = r6
            int r6 = r3 + 1
            char r7 = r0[r7]
            r2[r6] = r7
            goto L_0x00da
        L_0x00ab:
            if (r8 != r9) goto L_0x00c8
            int r6 = o.onActivityPreStopped.setMax(r6, r1)
            int r7 = o.onActivityPreStopped.setMax(r7, r1)
            int r6 = o.onActivityPreStopped.getMax(r8, r6, r1)
            int r7 = o.onActivityPreStopped.getMax(r9, r7, r1)
            char r6 = r0[r6]
            r2[r3] = r6
            int r6 = r3 + 1
            char r7 = r0[r7]
            r2[r6] = r7
            goto L_0x00da
        L_0x00c8:
            int r7 = o.onActivityPreStopped.getMax(r8, r7, r1)     // Catch:{ Exception -> 0x00e6 }
            int r6 = o.onActivityPreStopped.getMax(r9, r6, r1)     // Catch:{ Exception -> 0x00e6 }
            char r7 = r0[r7]     // Catch:{ Exception -> 0x00e6 }
            r2[r3] = r7     // Catch:{ Exception -> 0x00e6 }
            int r7 = r3 + 1
            char r6 = r0[r6]     // Catch:{ Exception -> 0x00e6 }
            r2[r7] = r6     // Catch:{ Exception -> 0x00e6 }
        L_0x00da:
            int r3 = r3 + 2
            goto L_0x0045
        L_0x00de:
            r10 = move-exception
            throw r10
        L_0x00e0:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r2)
            return r10
        L_0x00e6:
            r10 = move-exception
            goto L_0x00e9
        L_0x00e8:
            throw r10
        L_0x00e9:
            goto L_0x00e8
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.referral.MyReferralDetailActivity.getMin(char[], int, byte):java.lang.String");
    }
}
