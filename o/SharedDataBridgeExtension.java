package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import id.dana.model.QrisCrossBorderContentModel;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AppPreDownloadConfig;
import o.startUCMIntentLoadUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\t\u0018\u0000 -2\u00020\u0001:\u0001-B_\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aJ\u0016\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#J\u0014\u0010\n\u001a\u00020\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0%J\u000e\u0010\u0014\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aJ\b\u0010&\u001a\u00020\u001dH\u0016J\u0006\u0010'\u001a\u00020\u001dJ\b\u0010(\u001a\u00020\u001dH\u0016J\u0016\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001aJ\u0016\u0010+\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#J\u000e\u0010,\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lid/dana/qriscrossborder/QrisCrossBorderPresenter;", "Lid/dana/qriscrossborder/QrisCrossBorderContract$Presenter;", "context", "Landroid/content/Context;", "view", "Lid/dana/qriscrossborder/QrisCrossBorderContract$View;", "getQrisCrossBorderConfig", "Lid/dana/domain/qriscrossborder/interactor/GetQrisCrossBorderConfig;", "getQrisCrossBorderCountries", "Lid/dana/domain/qriscrossborder/interactor/GetQrisCrossBorderCountries;", "getQrisCountryCodeByLocation", "Lid/dana/domain/qriscrossborder/interactor/GetQrisCountryCodeByLocation;", "getQrisCurrentCountryCode", "Lid/dana/domain/qriscrossborder/interactor/GetQrisCurrentCountryCode;", "getQrisOriginCountryCode", "Lid/dana/domain/qriscrossborder/interactor/GetQrisOriginCountryCode;", "saveQrisOriginCountryCode", "Lid/dana/domain/qriscrossborder/interactor/SaveQrisOriginCountryCode;", "saveQrisCurrentCountryCode", "Lid/dana/domain/qriscrossborder/interactor/SaveQrisCurrentCountryCode;", "getQrisCrossBorderContent", "Lid/dana/domain/qriscrossborder/interactor/GetQrisCrossBorderContent;", "sendRiskEventWithParams", "Lid/dana/domain/qriscrossborder/interactor/SendRiskEventWithParams;", "(Landroid/content/Context;Lid/dana/qriscrossborder/QrisCrossBorderContract$View;Lid/dana/domain/qriscrossborder/interactor/GetQrisCrossBorderConfig;Lid/dana/domain/qriscrossborder/interactor/GetQrisCrossBorderCountries;Lid/dana/domain/qriscrossborder/interactor/GetQrisCountryCodeByLocation;Lid/dana/domain/qriscrossborder/interactor/GetQrisCurrentCountryCode;Lid/dana/domain/qriscrossborder/interactor/GetQrisOriginCountryCode;Lid/dana/domain/qriscrossborder/interactor/SaveQrisOriginCountryCode;Lid/dana/domain/qriscrossborder/interactor/SaveQrisCurrentCountryCode;Lid/dana/domain/qriscrossborder/interactor/GetQrisCrossBorderContent;Lid/dana/domain/qriscrossborder/interactor/SendRiskEventWithParams;)V", "tag", "", "kotlin.jvm.PlatformType", "checkQrisCrossBorderFeatureSwitch", "", "getCurrentCountryCode", "countryCode", "getOriginCountryCode", "currentCountryCode", "supportedCountry", "", "supportedCountries", "", "getQrisCrossBorderLocation", "getQrisCrossBorderSupportedCountries", "onDestroy", "sendRiskEvent", "originCountryCode", "setCurrentCountryCode", "setOriginCountryCode", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SharedDataBridgeExtension implements startUCMIntentLoadUrl.getMin {
    @NotNull
    public static final setMax toIntRange = new setMax((byte) 0);
    private final AppPreDownloadConfig IsOverlapping;
    /* access modifiers changed from: private */
    public final startUCMIntentLoadUrl.setMin equals;
    final getMaxConcurrentCount getMax;
    Context getMin;
    /* access modifiers changed from: private */
    public final String isInside = SharedDataBridgeExtension.class.getSimpleName();
    final getAvailableExpiredTime length;
    final addApp setMax;
    final setAvailableExpiredTime setMin;
    private final setMaxConcurrentCount toDoubleRange;
    final AppPreDownloadConfig.ConfigUnitsBean toFloatRange;
    private final getFireMoment toString;
    private final getConfigUnits values;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ SharedDataBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(SharedDataBridgeExtension sharedDataBridgeExtension) {
            super(1);
            this.this$0 = sharedDataBridgeExtension;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.equals.onError(th.getMessage());
            updateActionSheetContent.e(this.this$0.isInside, th.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "currentCountryCode", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ List $supportedCountries;
        final /* synthetic */ SharedDataBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(SharedDataBridgeExtension sharedDataBridgeExtension, List list) {
            super(1);
            this.this$0 = sharedDataBridgeExtension;
            this.$supportedCountries = list;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "currentCountryCode");
            int i = 0;
            boolean z = false;
            for (String areEqual : this.$supportedCountries) {
                if (Intrinsics.areEqual((Object) areEqual, (Object) str)) {
                    z = true;
                }
            }
            if (!(!Intrinsics.areEqual((Object) str, (Object) "ID")) || !z) {
                this.this$0.getMin(str, false);
                return;
            }
            SharedDataBridgeExtension sharedDataBridgeExtension = this.this$0;
            if (str != null) {
                i = str.length();
            }
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(223781336, oncanceled);
                onCancelLoad.getMin(223781336, oncanceled);
            }
            Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
            sharedDataBridgeExtension.getMax.execute(onReceivedIcon.INSTANCE, new length(sharedDataBridgeExtension, str), new setMin(sharedDataBridgeExtension));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ SharedDataBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(SharedDataBridgeExtension sharedDataBridgeExtension) {
            super(1);
            this.this$0 = sharedDataBridgeExtension;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z) {
                SharedDataBridgeExtension sharedDataBridgeExtension = this.this$0;
                sharedDataBridgeExtension.setMin.execute(onReceivedIcon.INSTANCE, new SharedDataBridgeExtension$FastBitmap$CoordinateSystem(sharedDataBridgeExtension), new toString(sharedDataBridgeExtension));
                return;
            }
            this.this$0.equals.setMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ SharedDataBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(SharedDataBridgeExtension sharedDataBridgeExtension) {
            super(1);
            this.this$0 = sharedDataBridgeExtension;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.equals.onError(th.getMessage());
            updateActionSheetContent.e(this.this$0.isInside, th.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class hashCode extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ SharedDataBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        hashCode(SharedDataBridgeExtension sharedDataBridgeExtension) {
            super(1);
            this.this$0 = sharedDataBridgeExtension;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.equals.onError(th.getMessage());
            updateActionSheetContent.e(this.this$0.isInside, th.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class invoke extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ SharedDataBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        invoke(SharedDataBridgeExtension sharedDataBridgeExtension) {
            super(1);
            this.this$0 = sharedDataBridgeExtension;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.equals.onError(th.getMessage());
            updateActionSheetContent.e(this.this$0.isInside, th.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class invokeSuspend extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ SharedDataBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        invokeSuspend(SharedDataBridgeExtension sharedDataBridgeExtension) {
            super(1);
            this.this$0 = sharedDataBridgeExtension;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.equals.setMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ SharedDataBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(SharedDataBridgeExtension sharedDataBridgeExtension) {
            super(1);
            this.this$0 = sharedDataBridgeExtension;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.equals.onError(th.getMessage());
            updateActionSheetContent.e(this.this$0.isInside, th.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ String $countryCode;
        final /* synthetic */ SharedDataBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(SharedDataBridgeExtension sharedDataBridgeExtension, String str) {
            super(1);
            this.this$0 = sharedDataBridgeExtension;
            this.$countryCode = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            if ((str.length() == 0) || (!Intrinsics.areEqual((Object) str, (Object) this.$countryCode))) {
                this.this$0.getMax(this.$countryCode, true);
            } else {
                this.this$0.equals.setMax();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ SharedDataBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(SharedDataBridgeExtension sharedDataBridgeExtension) {
            super(1);
            this.this$0 = sharedDataBridgeExtension;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.equals.onError(th.getMessage());
            updateActionSheetContent.e(this.this$0.isInside, th.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ String $currentCountryCode;
        final /* synthetic */ SharedDataBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toDoubleRange(SharedDataBridgeExtension sharedDataBridgeExtension, String str) {
            super(1);
            this.this$0 = sharedDataBridgeExtension;
            this.$currentCountryCode = str;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.setMax(this.$currentCountryCode);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "qcbContent", "Lid/dana/domain/qriscrossborder/model/QrisCrossBorderContent;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function1<setConfigUnits, Unit> {
        final /* synthetic */ String $countryCode;
        final /* synthetic */ SharedDataBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(SharedDataBridgeExtension sharedDataBridgeExtension, String str) {
            super(1);
            this.this$0 = sharedDataBridgeExtension;
            this.$countryCode = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((setConfigUnits) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull setConfigUnits setconfigunits) {
            Intrinsics.checkNotNullParameter(setconfigunits, "qcbContent");
            startUCMIntentLoadUrl.setMin max = this.this$0.equals;
            Intrinsics.checkNotNullParameter(setconfigunits, "$this$toQrisCrossBorderContentModel");
            QrisCrossBorderContentModel qrisCrossBorderContentModel = new QrisCrossBorderContentModel(setconfigunits.getTitle(), setconfigunits.getSubtitle(), setconfigunits.getButtonTitle(), setconfigunits.getImageUrl(), setconfigunits.getDescription());
            String str = this.$countryCode;
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.getDefault()");
            if (str != null) {
                String lowerCase = str.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                max.getMin(qrisCrossBorderContentModel, lowerCase);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ String $currentCountryCode;
        final /* synthetic */ boolean $supportedCountry;
        final /* synthetic */ SharedDataBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(SharedDataBridgeExtension sharedDataBridgeExtension, boolean z, String str) {
            super(1);
            this.this$0 = sharedDataBridgeExtension;
            this.$supportedCountry = z;
            this.$currentCountryCode = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            boolean z = this.$supportedCountry;
            boolean z2 = false;
            if (!z) {
                this.this$0.setMax(this.$currentCountryCode);
                this.this$0.getMax(this.$currentCountryCode, false);
            } else if (z) {
                if (str.length() == 0) {
                    z2 = true;
                }
                if (z2) {
                    str = this.$currentCountryCode;
                }
                SharedDataBridgeExtension sharedDataBridgeExtension = this.this$0;
                String str2 = this.$currentCountryCode;
                Intrinsics.checkNotNullParameter(str, "originCountryCode");
                Intrinsics.checkNotNullParameter(str2, "currentCountryCode");
                sharedDataBridgeExtension.toFloatRange.execute(AppPreDownloadConfig.ConfigUnitsBean.length.Companion.forSendRiskEventWithParams(str, str2), new toDoubleRange(sharedDataBridgeExtension, str2), new hashCode(sharedDataBridgeExtension));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toString extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ SharedDataBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toString(SharedDataBridgeExtension sharedDataBridgeExtension) {
            super(1);
            this.this$0 = sharedDataBridgeExtension;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.equals.onError(th.getMessage());
            updateActionSheetContent.e(this.this$0.isInside, th.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class values extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ SharedDataBridgeExtension this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        values(SharedDataBridgeExtension sharedDataBridgeExtension) {
            super(1);
            this.this$0 = sharedDataBridgeExtension;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.equals.onError(th.getMessage());
            updateActionSheetContent.e(this.this$0.isInside, th.getMessage());
        }
    }

    @Inject
    public SharedDataBridgeExtension(@NotNull Context context, @NotNull startUCMIntentLoadUrl.setMin setmin, @NotNull AppPreDownloadConfig appPreDownloadConfig, @NotNull setAvailableExpiredTime setavailableexpiredtime, @NotNull addApp addapp, @NotNull getMaxConcurrentCount getmaxconcurrentcount, @NotNull getConfigUnits getconfigunits, @NotNull getFireMoment getfiremoment, @NotNull setMaxConcurrentCount setmaxconcurrentcount, @NotNull getAvailableExpiredTime getavailableexpiredtime, @NotNull AppPreDownloadConfig.ConfigUnitsBean configUnitsBean) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(setmin, "view");
        Intrinsics.checkNotNullParameter(appPreDownloadConfig, "getQrisCrossBorderConfig");
        Intrinsics.checkNotNullParameter(setavailableexpiredtime, "getQrisCrossBorderCountries");
        Intrinsics.checkNotNullParameter(addapp, "getQrisCountryCodeByLocation");
        Intrinsics.checkNotNullParameter(getmaxconcurrentcount, "getQrisCurrentCountryCode");
        Intrinsics.checkNotNullParameter(getconfigunits, "getQrisOriginCountryCode");
        Intrinsics.checkNotNullParameter(getfiremoment, "saveQrisOriginCountryCode");
        Intrinsics.checkNotNullParameter(setmaxconcurrentcount, "saveQrisCurrentCountryCode");
        Intrinsics.checkNotNullParameter(getavailableexpiredtime, "getQrisCrossBorderContent");
        Intrinsics.checkNotNullParameter(configUnitsBean, "sendRiskEventWithParams");
        this.getMin = context;
        this.equals = setmin;
        this.IsOverlapping = appPreDownloadConfig;
        this.setMin = setavailableexpiredtime;
        this.setMax = addapp;
        this.getMax = getmaxconcurrentcount;
        this.values = getconfigunits;
        this.toString = getfiremoment;
        this.toDoubleRange = setmaxconcurrentcount;
        this.length = getavailableexpiredtime;
        this.toFloatRange = configUnitsBean;
    }

    public final void getMin(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "currentCountryCode");
        this.values.execute(onReceivedIcon.INSTANCE, new toIntRange(this, z, str), new isInside(this));
    }

    public final void getMax(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "currentCountryCode");
        this.toDoubleRange.execute(str, new SharedDataBridgeExtension$Grayscale$Algorithm(this, z, str), new SharedDataBridgeExtension$Mean$Arithmetic(this));
    }

    public final void setMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        this.toString.execute(str, new invokeSuspend(this), new invoke(this));
    }

    public final void setMax() {
        this.IsOverlapping.dispose();
        this.setMin.dispose();
        this.setMax.dispose();
        this.getMax.dispose();
        this.values.dispose();
        this.length.dispose();
        this.toString.dispose();
        this.toDoubleRange.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/qriscrossborder/QrisCrossBorderPresenter$Companion;", "", "()V", "COUNTRY_CODE_ID", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public final void setMin() {
        this.IsOverlapping.execute(onReceivedIcon.INSTANCE, new getMax(this), new getMin(this));
    }
}
