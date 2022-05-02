package o;

import com.alibaba.fastjson.JSON;
import id.dana.data.toggle.exception.SplitException;
import id.dana.data.toggle.exception.SplitNull;
import id.dana.data.toggle.exception.UnexpectedTreatment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/featureconfig/model/ExpressPayInfo;", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
final class AppUtils$Grayscale$Algorithm<T, R> implements RedDotDrawable<getRequestMainPackage, TitleBarRightButtonView.AnonymousClass4<? extends setAPWebViewListener>> {
    public static final AppUtils$Grayscale$Algorithm setMin = new AppUtils$Grayscale$Algorithm();

    AppUtils$Grayscale$Algorithm() {
    }

    public final /* synthetic */ Object apply(Object obj) {
        TitleBarRightButtonView.AnonymousClass1 r5;
        getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
        Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new setMax(getrequestmainpackage, "feature_show_expresspay", JSON.parseObject(getPositiveString.loadJSONFromAsset(getrequestmainpackage.length, BaseAppContext.DEFAULT_FEATURE_SHOW_EXPRESSPAY), setAPWebViewListener.class), false));
        Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …}\n            )\n        }");
        if (min instanceof getSecondFloorView) {
            r5 = ((getSecondFloorView) min).setMax();
        } else {
            setTitleLoading settitleloading = new setTitleLoading(min);
            RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
            r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
        }
        return r5;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/SingleEmitter;", "kotlin.jvm.PlatformType", "subscribe", "id/dana/data/toggle/traffictype/BaseTrafficType$getTreatmentWithConfigSdkReady$1", "id/dana/data/config/source/split/SplitConfigEntityData$getEnableExpressPayInfo$1$getConfigOnceReady$$inlined$getTreatmentWithConfigSdkReady$1"}, k = 3, mv = {1, 4, 2})
    public static final class setMax<T> implements updateProgress<T> {
        final /* synthetic */ Object $defaultValue;
        final /* synthetic */ boolean $isNeedToThrowWhenGotControl;
        final /* synthetic */ String $splitName;
        final /* synthetic */ getRequestMainPackage this$0;

        public setMax(getRequestMainPackage getrequestmainpackage, String str, Object obj, boolean z) {
            this.this$0 = getrequestmainpackage;
            this.$splitName = str;
            this.$defaultValue = obj;
            this.$isNeedToThrowWhenGotControl = z;
        }

        public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T> r8) {
            Intrinsics.checkNotNullParameter(r8, "emitter");
            isUesCacheLocation.getMax().getMin(this.$splitName, this.this$0.setMin(), setAPWebViewListener.class, this.$defaultValue, new KeyboardBridgeExtension<T>(this) {
                final /* synthetic */ setMax this$0;

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
