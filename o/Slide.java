package o;

import android.app.Activity;
import com.iap.ac.android.acs.plugin.utils.Constants;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.APWebHistoryItem;
import o.APWebResourceRequest;
import o.AutoTransition;
import o.BindView;
import o.GriverOpenAuthExtension;
import o.LocationBridgeExtension;
import o.R;
import o.b;
import o.getRunningAnimators;
import o.onAnimationEnd;
import org.jetbrains.annotations.NotNull;

public final class Slide implements getAdapterPosition<getPath> {
    private final b.C0007b<getRunningAnimators.setMax> getMax;
    private final b.C0007b<R.id.getMax> getMin;
    private final b.C0007b<onAnimationEnd.length> length;
    private final b.C0007b<BindInt> setMax;
    private final b.C0007b<BindView.setMin> setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lid/dana/contract/deeplink/DeepLinkPresenter;", "Lid/dana/contract/deeplink/DeepLinkContract$Presenter;", "view", "Lid/dana/contract/deeplink/DeepLinkContract$View;", "initSessionDeepLink", "Lid/dana/domain/deeplink/interactor/InitSessionDeepLink;", "getDeepLinkPayload", "Lid/dana/domain/deeplink/interactor/GetDeepLinkPayload;", "getPhoneNumber", "Lid/dana/domain/account/interactor/GetPhoneNumber;", "deepLinkPayloadModelMapper", "Lid/dana/mapper/DeepLinkPayloadModelMapper;", "(Lid/dana/contract/deeplink/DeepLinkContract$View;Lid/dana/domain/deeplink/interactor/InitSessionDeepLink;Lid/dana/domain/deeplink/interactor/GetDeepLinkPayload;Lid/dana/domain/account/interactor/GetPhoneNumber;Lid/dana/mapper/DeepLinkPayloadModelMapper;)V", "fetchPayload", "", "fromRoot", "", "phoneNumber", "", "getPayload", "initSession", "activity", "Landroid/app/Activity;", "onDestroy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @PerActivity
    public final class GravityFlag implements AutoTransition.length {
        private final LocationBridgeExtension.AnonymousClass2 getMax;
        private final AutoTransition.setMax getMin;
        private final APWebHistoryItem length;
        private final APWebResourceRequest setMax;
        private final GriverOpenAuthExtension.RevokeCallback setMin;

        @Inject
        public GravityFlag(@NotNull AutoTransition.setMax setmax, @NotNull APWebResourceRequest aPWebResourceRequest, @NotNull APWebHistoryItem aPWebHistoryItem, @NotNull GriverOpenAuthExtension.RevokeCallback revokeCallback, @NotNull LocationBridgeExtension.AnonymousClass2 r6) {
            Intrinsics.checkNotNullParameter(setmax, "view");
            Intrinsics.checkNotNullParameter(aPWebResourceRequest, "initSessionDeepLink");
            Intrinsics.checkNotNullParameter(aPWebHistoryItem, "getDeepLinkPayload");
            Intrinsics.checkNotNullParameter(revokeCallback, Constants.JS_API_GET_PHONE_NUMBER);
            Intrinsics.checkNotNullParameter(r6, "deepLinkPayloadModelMapper");
            this.getMin = setmax;
            this.setMax = aPWebResourceRequest;
            this.length = aPWebHistoryItem;
            this.setMin = revokeCallback;
            this.getMax = r6;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/deeplink/DeepLinkPresenter$getPayload$1", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "e", "", "onNext", "phoneNumber", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMax extends GriverAppVirtualHostProxy<String> {
            final /* synthetic */ boolean getMax;
            final /* synthetic */ GravityFlag setMax;

            getMax(GravityFlag gravityFlag, boolean z) {
                this.setMax = gravityFlag;
                this.getMax = z;
            }

            public final /* synthetic */ void onNext(Object obj) {
                String str = (String) obj;
                Intrinsics.checkNotNullParameter(str, "phoneNumber");
                this.setMax.setMax(this.getMax, str);
            }

            public final void onError(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "e");
                updateActionSheetContent.e(DanaLogConstants.TAG.DEEPLINK_TAG, "Fail to get phone number from session, probably not exist", th);
                this.setMax.setMax(this.getMax, (String) null);
            }
        }

        public final void setMin(boolean z) {
            this.getMin.showProgress();
            this.setMin.execute(new getMax(this, z));
        }

        public final void getMin(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
            this.getMin.showProgress();
            APWebResourceRequest aPWebResourceRequest = this.setMax;
            AutoTransition.setMax setmax = this.getMin;
            aPWebResourceRequest.execute(new PatternPathMotion(setmax, true, setmax.length(), this.getMax), APWebResourceRequest.setMin.forInitSession(activity));
        }

        /* access modifiers changed from: private */
        public final void setMax(boolean z, String str) {
            APWebHistoryItem aPWebHistoryItem = this.length;
            AutoTransition.setMax setmax = this.getMin;
            aPWebHistoryItem.execute(new PatternPathMotion(setmax, setmax.length(), this.getMax, str), APWebHistoryItem.getMin.fromRoot(z));
        }

        public final void setMax() {
            this.setMin.dispose();
            this.length.dispose();
            this.setMax.dispose();
        }
    }

    private Slide(b.C0007b<R.id.getMax> bVar, b.C0007b<BindView.setMin> bVar2, b.C0007b<getRunningAnimators.setMax> bVar3, b.C0007b<onAnimationEnd.length> bVar4, b.C0007b<BindInt> bVar5) {
        this.getMin = bVar;
        this.setMin = bVar2;
        this.getMax = bVar3;
        this.length = bVar4;
        this.setMax = bVar5;
    }

    public static Slide getMin(b.C0007b<R.id.getMax> bVar, b.C0007b<BindView.setMin> bVar2, b.C0007b<getRunningAnimators.setMax> bVar3, b.C0007b<onAnimationEnd.length> bVar4, b.C0007b<BindInt> bVar5) {
        return new Slide(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public final /* synthetic */ Object get() {
        return new getPath(this.getMin.get(), this.setMin.get(), this.getMax.get(), this.length.get(), this.setMax.get());
    }
}
