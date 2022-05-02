package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.alipay.iap.android.common.log.LoggerWrapper;
import id.dana.playstorereview.PlayStoreReviewActivity;
import id.dana.plugin.bca.oneklik.registration.RegistrationBcaOneKlikActivity;
import id.dana.plugin.bca.oneklik.updatelimit.UpdateLimitBcaOneKlikActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.CommonUtil;
import o.PdfImageSource;
import o.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/playstorereview/model/AppReviewInfoModel;", "", "show", "", "inApp", "(ZZ)V", "getInApp", "()Z", "getShow", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PdfViewerActivity {
    private final boolean getMax;
    private final boolean setMax;

    /* renamed from: o.PdfViewerActivity$1  reason: invalid class name */
    public final class AnonymousClass1 {

        /* renamed from: o.PdfViewerActivity$1$getMax */
        public static final class getMax {
            public static final int getMax = 2131363166;
            public static final int getMin = 2131363165;
            public static final int length = 2131363167;
            public static final int setMax = 2131363168;
        }

        /* renamed from: o.PdfViewerActivity$1$getMin */
        public static final class getMin {

            /* renamed from: length */
            public static final int bca_oneklik_add_card = 2131886280;

            /* renamed from: setMax */
            public static final int bca_oneklik_change_limit = 2131886281;
        }

        /* renamed from: o.PdfViewerActivity$1$length */
        public static final class length {
            public static final int getMin = 2131165414;
        }

        /* renamed from: o.PdfViewerActivity$1$setMax */
        public static final class setMax {

            /* renamed from: setMax */
            public static final int bca_oneklik_arrow_left = 2131231054;
        }

        /* renamed from: o.PdfViewerActivity$1$setMin */
        public static final class setMin {

            /* renamed from: setMax */
            public static final int activity_bca_xco = 2131558453;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdfViewerActivity)) {
            return false;
        }
        PdfViewerActivity pdfViewerActivity = (PdfViewerActivity) obj;
        return this.setMax == pdfViewerActivity.setMax && this.getMax == pdfViewerActivity.getMax;
    }

    public final int hashCode() {
        boolean z = this.setMax;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.getMax;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AppReviewInfoModel(show=");
        sb.append(this.setMax);
        sb.append(", inApp=");
        sb.append(this.getMax);
        sb.append(")");
        return sb.toString();
    }

    public PdfViewerActivity(boolean z, boolean z2) {
        this.setMax = z;
        this.getMax = z2;
    }

    public final boolean getMax() {
        return this.getMax;
    }

    public final boolean getMin() {
        return this.setMax;
    }

    public final class DividerGridItemDecoration implements getAdapterPosition<PageAdapter.AnonymousClass1> {
        private final b.C0007b<PdfImageSource.length> getMin;
        private final b.C0007b<CommonUtil> length;
        private final b.C0007b<stringify> setMin;

        private DividerGridItemDecoration(b.C0007b<stringify> bVar, b.C0007b<CommonUtil> bVar2, b.C0007b<PdfImageSource.length> bVar3) {
            this.setMin = bVar;
            this.length = bVar2;
            this.getMin = bVar3;
        }

        public static DividerGridItemDecoration setMax(b.C0007b<stringify> bVar, b.C0007b<CommonUtil> bVar2, b.C0007b<PdfImageSource.length> bVar3) {
            return new DividerGridItemDecoration(bVar, bVar2, bVar3);
        }

        public final /* synthetic */ Object get() {
            return new PdfImageSource.setMin(this.setMin.get(), this.length.get(), this.getMin.get()) {
                /* access modifiers changed from: private */
                public static final String getMax = AnonymousClass1.class.getSimpleName();
                @NotNull
                public static final getMax setMin = new getMax((byte) 0);
                /* access modifiers changed from: private */
                public final PdfImageSource.length getMin;
                private final stringify length;
                private final CommonUtil setMax;

                {
                    Intrinsics.checkNotNullParameter(r2, "isNeedToShowPlayStoreReview");
                    Intrinsics.checkNotNullParameter(r3, "saveLastPlayStoreReviewShow");
                    Intrinsics.checkNotNullParameter(r4, "view");
                    this.length = r2;
                    this.setMax = r3;
                    this.getMin = r4;
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/playstorereview/PlayStoreReviewPresenter$checkNeedToShowPlayStoreReview$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/playstorereview/model/AppReviewInfo;", "onError", "", "e", "", "onNext", "appReviewInfo", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
                /* renamed from: o.PdfViewerActivity$PageAdapter$1$length */
                public static final class length extends GriverAppVirtualHostProxy<CommonUtil.AnonymousClass1> {
                    final /* synthetic */ AnonymousClass1 length;

                    length(AnonymousClass1 r1) {
                        this.length = r1;
                    }

                    public final /* synthetic */ void onNext(Object obj) {
                        CommonUtil.AnonymousClass1 r4 = (CommonUtil.AnonymousClass1) obj;
                        Intrinsics.checkNotNullParameter(r4, "appReviewInfo");
                        PdfImageSource.length length2 = this.length.getMin;
                        Intrinsics.checkNotNullParameter(r4, "$this$toAppReviewInfoModel");
                        length2.getMin(new PdfViewerActivity(r4.getShow(), r4.getInApp()));
                    }

                    public final void onError(@NotNull Throwable th) {
                        Intrinsics.checkNotNullParameter(th, "e");
                        getMax getmax = AnonymousClass1.setMin;
                        LoggerWrapper.e(AnonymousClass1.getMax, th.getMessage());
                    }
                }

                public final void length() {
                    this.length.execute(new length(this));
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/playstorereview/PlayStoreReviewPresenter$saveLastPlayStoreReviewShow$1", "Lid/dana/domain/DefaultObserver;", "", "onNext", "", "success", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
                /* renamed from: o.PdfViewerActivity$PageAdapter$1$setMax */
                public static final class setMax extends GriverAppVirtualHostProxy<Boolean> {
                    final /* synthetic */ AnonymousClass1 setMin;

                    setMax(AnonymousClass1 r1) {
                        this.setMin = r1;
                    }

                    public final /* synthetic */ void onNext(Object obj) {
                        this.setMin.getMin.setMin();
                    }
                }

                public final void length(@Nullable String str, long j, long j2) {
                    this.setMax.execute(new setMax(this), CommonUtil.getMin.forSaveLastPlayStoreReviewParams(str, j, j2));
                }

                public final void setMax() {
                    this.length.dispose();
                    this.setMax.dispose();
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lid/dana/playstorereview/PlayStoreReviewPresenter$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
                /* renamed from: o.PdfViewerActivity$PageAdapter$1$getMax */
                public static final class getMax {
                    private getMax() {
                    }

                    public /* synthetic */ getMax(byte b) {
                        this();
                    }
                }
            };
        }
    }

    public class PageAdapter implements PdfImageSource.length {
        private final Activity length;

        public final class PageImageHolder {
            private static final String setMax = "ConfigChecker";

            public static boolean getMax(Context context) {
                if (context.getPackageManager().queryIntentActivities(new Intent(context, UpdateLimitBcaOneKlikActivity.class), 0).size() != 0) {
                    return true;
                }
                String str = setMax;
                StringBuilder sb = new StringBuilder();
                sb.append(UpdateLimitBcaOneKlikActivity.class.getName());
                sb.append(" is not registered as an activity in your application, so update limit oneklik page can't be shown.");
                LocationBridgeExtension.length(str, sb.toString());
                LocationBridgeExtension.length(setMax, "Please add the child tag <activity android:name=\"id.dana.plugin.bca.oneklik.updatelimit.UpdateLimitBcaOneKlikActivity\" /> to your <application> tag.");
                return false;
            }

            public static boolean setMax(Context context) {
                if (context.getPackageManager().queryIntentActivities(new Intent(context, RegistrationBcaOneKlikActivity.class), 0).size() != 0) {
                    return true;
                }
                String str = setMax;
                StringBuilder sb = new StringBuilder();
                sb.append(RegistrationBcaOneKlikActivity.class.getSimpleName());
                sb.append(" is not registered as an activity in your application, so register oneklik page can't be shown.");
                LocationBridgeExtension.length(str, sb.toString());
                LocationBridgeExtension.length(setMax, "Please add the child tag <activity android:name=\"id.dana.plugin.bca.oneklik.registration.RegistrationBcaOneKlikActivity\" /> to your <application> tag.");
                return false;
            }
        }

        public void dismissProgress() {
        }

        public void onError(String str) {
        }

        public void showProgress() {
        }

        public PageAdapter(Activity activity) {
            this.length = activity;
        }

        public void getMin(PdfViewerActivity pdfViewerActivity) {
            if (setMin(pdfViewerActivity)) {
                this.length.startActivity(new Intent(this.length, PlayStoreReviewActivity.class).putExtra("in_app_review", pdfViewerActivity.getMax()));
            }
        }

        public final void setMin() {
            this.length.finish();
        }

        private boolean setMin(PdfViewerActivity pdfViewerActivity) {
            return (pdfViewerActivity == null || !pdfViewerActivity.getMin() || this.length == null) ? false : true;
        }
    }
}
