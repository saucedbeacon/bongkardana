package o;

import id.dana.data.toggle.exception.SplitException;
import id.dana.data.toggle.exception.SplitNull;
import id.dana.data.toggle.exception.UnexpectedTreatment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/data/config/source/amcs/result/DonationCampaignConfigResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
final class AppUtils$FastBitmap$CoordinateSystem<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends performBack>> {
    public static final AppUtils$FastBitmap$CoordinateSystem length = new AppUtils$FastBitmap$CoordinateSystem();

    AppUtils$FastBitmap$CoordinateSystem() {
    }

    public final /* synthetic */ Object apply(Object obj) {
        TitleBarRightButtonView.AnonymousClass1 r11;
        getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
        Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMin(getrequestmainpackage, "widget_donation_campaign", new performBack(false, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null), true));
        Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
        if (min instanceof getSecondFloorView) {
            r11 = ((getSecondFloorView) min).setMax();
        } else {
            setTitleLoading settitleloading = new setTitleLoading(min);
            RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
            r11 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
        }
        return r11;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getDonationCampaignConfig$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
    public static final class getMin<T> implements updateProgress<T> {
        final /* synthetic */ Object $defaultValue;
        final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
        final /* synthetic */ String $splitName;
        final /* synthetic */ getRequestMainPackage this$0;

        public getMin(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
            this.this$0 = getrequestmainpackage;
            this.$splitName = str;
            this.$defaultValue = obj;
            this.$isNeedToThrowWhenGotControl = z;
        }

        public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
            Intrinsics.checkNotNullParameter(r8, "emitter");
            isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), performBack.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                final /* synthetic */ getMin this$0;

                {
                    this.this$0 = r1;
                }

                public final void onComplete(@NotNull String str, @Nullable T t) {
                    Intrinsics.checkNotNullParameter(str, "treatment");
                    this.this$0.this$0.getMax(this.this$0.$splitName, str, t);
                    if (t == null) {
                        r8.onError(new SplitNull(this.this$0.$splitName));
                    } else if (!this.this$0.$isNeedToThrowWhenGotControl || !Intrinsics.areEqual((Object) str, (Object) "control")) {
                        r8.onSuccess(t);
                    } else {
                        r8.onError(new UnexpectedTreatment(this.this$0.$splitName));
                    }
                }

                public final void onError() {
                    r8.onError(new SplitException("Error when get toggle config"));
                }
            });
        }
    }
}
