package o;

import android.content.Context;
import dagger.Component;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.BillerX2BModule;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.RecipientActivityModule;
import id.dana.di.modules.RecipientHomeModule;
import id.dana.sendmoney_v2.landing.SendMoneyActivity;
import id.dana.sendmoney_v2.landing.di.module.SendMoneyLandingModule;
import id.dana.sendmoney_v2.landing.view.RecipientSelectorView;
import kotlin.Metadata;
import o.GriverAppXInterceptor;
import o.PrepareException;
import o.b;
import o.getModifiedTime;
import o.getTitleIcon_White;
import org.jetbrains.annotations.NotNull;

public final class ImageObserver implements ImageFileObserver {
    private b.C0007b<fromInt> IsOverlapping;
    private b.C0007b<removeMonitorNotifier> equals;
    private b.C0007b<removeAllRangeNotifiers> getMax;
    private b.C0007b<GriverAppXInterceptor.AnonymousClass1> getMin;
    private b.C0007b<getModifiedTime.getMin> hashCode;
    private b.C0007b<getJSBridge> isInside;
    private b.C0007b<appxLoadFailed> length;
    private b.C0007b<getModifiedTime.getMax> setMax;
    private b.C0007b<getScheme> setMin;
    private b.C0007b<Context> toFloatRange;
    private b.C0007b<getForegroundBetweenScanPeriod> toIntRange;
    private b.C0007b<setRightText> toString;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/sendmoney_v2/landing/di/component/SendMoneyLandingComponent;", "", "inject", "", "view", "Lid/dana/sendmoney_v2/landing/SendMoneyActivity;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @PerActivity
    @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {RecipientActivityModule.class, BottomSheetOnBoardingModule.class, DeepLinkModule.class, SendMoneyLandingModule.class, BillerX2BModule.class})
    /* renamed from: o.ImageObserver$2  reason: invalid class name */
    public interface AnonymousClass2 {
        void getMax(@NotNull SendMoneyActivity sendMoneyActivity);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/sendmoney_v2/landing/di/component/RecipientSelectorComponent;", "", "inject", "", "recipientSelectorView", "Lid/dana/sendmoney_v2/landing/view/RecipientSelectorView;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @PerActivity
    @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {RecipientHomeModule.class})
    public interface ImageFileObserver {
        void getMin(@NotNull RecipientSelectorView recipientSelectorView);
    }

    public final class SafeRunnable implements getAdapterPosition<getTitleIcon_White.getMax> {
        private final SendMoneyLandingModule setMax;
        private final b.C0007b<loadThumbPhoto> setMin;

        private SafeRunnable(SendMoneyLandingModule sendMoneyLandingModule, b.C0007b<loadThumbPhoto> bVar) {
            this.setMax = sendMoneyLandingModule;
            this.setMin = bVar;
        }

        public static SafeRunnable setMax(SendMoneyLandingModule sendMoneyLandingModule, b.C0007b<loadThumbPhoto> bVar) {
            return new SafeRunnable(sendMoneyLandingModule, bVar);
        }

        public final /* synthetic */ Object get() {
            getTitleIcon_White.getMax max = this.setMax.setMax(this.setMin.get());
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public /* synthetic */ ImageObserver(RecipientHomeModule recipientHomeModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(recipientHomeModule, r2);
    }

    private ImageObserver(RecipientHomeModule recipientHomeModule, PrepareException.AnonymousClass1 r10) {
        this.setMax = isScrap.getMin(parseValue.setMax(recipientHomeModule));
        this.length = new toFloatRange(r10);
        this.setMin = new setMax(r10);
        setMin setmin = new setMin(r10);
        this.getMin = setmin;
        this.getMax = addMonitorNotifier.create(this.length, this.setMin, setmin);
        getMin getmin = new getMin(r10);
        this.IsOverlapping = getmin;
        this.equals = removeAllMonitorNotifiers.create(this.length, this.setMin, getmin);
        this.toIntRange = setRangeNotifier.create(this.length, this.setMin, this.getMin);
        this.toFloatRange = new length(r10);
        this.isInside = onReceivedLoginRequest.create(this.length, this.setMin, this.IsOverlapping);
        b.C0007b<setRightText> min = isScrap.getMin(getPhotoSize.getMin(this.setMax, this.getMax, getTinyLocalStorage.getMin(), this.equals, getSystemInfoInner.length(), this.toIntRange, this.toFloatRange, this.isInside));
        this.toString = min;
        this.hashCode = isScrap.getMin(GriverACMenuExtension.setMax(recipientHomeModule, min));
    }

    public static final class getMax {
        public RecipientHomeModule getMin;
        public PrepareException.AnonymousClass1 setMin;

        public /* synthetic */ getMax(byte b) {
            this();
        }

        private getMax() {
        }
    }

    static class toFloatRange implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 getMin;

        toFloatRange(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            appxLoadFailed length = this.getMin.length();
            if (length != null) {
                return length;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMax implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 setMax;

        setMax(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            getScheme min = this.setMax.getMin();
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMin implements b.C0007b<GriverAppXInterceptor.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 setMin;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            GriverAppXInterceptor.AnonymousClass1 b = this.setMin.b();
            if (b != null) {
                return b;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMin implements b.C0007b<fromInt> {
        private final PrepareException.AnonymousClass1 setMin;

        getMin(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            fromInt onNavigationEvent = this.setMin.onNavigationEvent();
            if (onNavigationEvent != null) {
                return onNavigationEvent;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class length implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 getMin;

        length(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            Context max = this.getMin.getMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void getMin(RecipientSelectorView recipientSelectorView) {
        PhotoUtil.setMin(recipientSelectorView, this.hashCode.get());
    }
}
