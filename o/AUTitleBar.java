package o;

import dagger.Subcomponent;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.di.PerActivity;
import id.dana.sendmoney.feed.ShareToFeedsView;
import id.dana.social.contract.share.ShareToFeedsModule;
import id.dana.social.di.module.FeedCommentModule;
import id.dana.social.view.activity.detail.SocialActivityDetail;
import kotlin.Metadata;
import o.PrepareException;
import o.b;
import o.handleScrollChange;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lid/dana/social/contract/AccountDeactivationContract;", "", "()V", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AUTitleBar {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/social/di/component/FeedCommentComponent;", "", "inject", "", "socialActivityDetail", "Lid/dana/social/view/activity/detail/SocialActivityDetail;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @Subcomponent(modules = {FeedCommentModule.class, DeepLinkModule.class})
    @PerActivity
    public interface OnBackListener {
        void length(@NotNull SocialActivityDetail socialActivityDetail);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lid/dana/social/contract/AccountDeactivationContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onEmailAddressInvalid", "", "onEmailAddressValid", "onFailed", "onSuccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin extends parentColumns.getMax {
        void getMin();

        void length();

        void setMax();

        void setMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lid/dana/social/contract/AccountDeactivationContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "observeEmailAddress", "", "textChanges", "Lcom/jakewharton/rxbinding2/InitialValueObservable;", "", "sendTicketToZendesk", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMin extends parentColumns.setMin {
        void setMax(@NotNull AudioAttributesImplBase<CharSequence> audioAttributesImplBase);

        void setMin();
    }

    /* renamed from: o.AUTitleBar$1  reason: invalid class name */
    public final class AnonymousClass1 implements onPreemption {
        private b.C0007b<handleScrollChange.setMax> IsOverlapping;
        private b.C0007b<calculateRssi> getMax;
        private b.C0007b<getBeacons> getMin;
        private b.C0007b<handleScrollChange.getMin> isInside;
        private b.C0007b<getResponseString> length;
        private b.C0007b<setModel> setMax;
        private b.C0007b<MonitoringStatus> setMin;
        private b.C0007b<attachFlagToRightBtn> toFloatRange;
        private b.C0007b<isTracked> toIntRange;

        public /* synthetic */ AnonymousClass1(ShareToFeedsModule shareToFeedsModule, PrepareException.AnonymousClass1 r2, byte b) {
            this(shareToFeedsModule, r2);
        }

        private AnonymousClass1(ShareToFeedsModule shareToFeedsModule, PrepareException.AnonymousClass1 r6) {
            getMin getmin = new getMin(r6);
            this.length = getmin;
            this.setMin = addRegion.create(getmin);
            this.getMin = getFilter.create(this.length);
            getMax getmax = new getMax(r6);
            this.setMax = getmax;
            this.getMax = addMeasurement.create(getmax);
            this.toIntRange = isExpired.create(this.setMax);
            b.C0007b<handleScrollChange.setMax> min = isScrap.getMin(setRightButtonFont.getMax(shareToFeedsModule));
            this.IsOverlapping = min;
            setSegment length2 = setSegment.length(this.setMin, this.getMin, this.getMax, this.toIntRange, min);
            this.toFloatRange = length2;
            this.isInside = isScrap.getMin(setRightButtonEnabled.setMin(shareToFeedsModule, length2));
        }

        /* renamed from: o.AUTitleBar$1$setMin */
        public static final class setMin {
            public ShareToFeedsModule getMax;
            public PrepareException.AnonymousClass1 setMin;

            public /* synthetic */ setMin(byte b) {
                this();
            }

            private setMin() {
            }
        }

        /* renamed from: o.AUTitleBar$1$getMin */
        static class getMin implements b.C0007b<getResponseString> {
            private final PrepareException.AnonymousClass1 setMin;

            getMin(PrepareException.AnonymousClass1 r1) {
                this.setMin = r1;
            }

            public final /* synthetic */ Object get() {
                getResponseString IMediaControllerCallback = this.setMin.IMediaControllerCallback();
                if (IMediaControllerCallback != null) {
                    return IMediaControllerCallback;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        /* renamed from: o.AUTitleBar$1$getMax */
        static class getMax implements b.C0007b<setModel> {
            private final PrepareException.AnonymousClass1 setMin;

            getMax(PrepareException.AnonymousClass1 r1) {
                this.setMin = r1;
            }

            public final /* synthetic */ Object get() {
                setModel MediaBrowserCompat$MediaItem = this.setMin.MediaBrowserCompat$MediaItem();
                if (MediaBrowserCompat$MediaItem != null) {
                    return MediaBrowserCompat$MediaItem;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        public final void length(ShareToFeedsView shareToFeedsView) {
            ImageInfoBridgeExtension.getMin(shareToFeedsView, this.isInside.get());
        }
    }
}
