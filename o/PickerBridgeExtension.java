package o;

import dagger.Component;
import dagger.internal.InjectedFieldSignature;
import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.di.PerActivity;
import id.dana.twilio.trusteddevice.TrustedDeviceActivity;
import id.dana.twilio.trusteddevice.TrustedDeviceModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.PrepareException;
import o.b;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lid/dana/twilio/onboarding/model/request/TwilioConsultModel;", "", "source", "", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PickerBridgeExtension {
    @Nullable
    public final String setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/twilio/trusteddevice/TrustedDeviceContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.PickerBridgeExtension$4  reason: invalid class name */
    public interface AnonymousClass4 {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lid/dana/twilio/trusteddevice/TrustedDeviceContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "derollVerifyPush", "", "source", "", "getKycStatus", "verifiedDevice", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.PickerBridgeExtension$4$getMax */
        public interface getMax extends parentColumns.setMin {
            void getMin();

            void length();

            void setMin(@Nullable String str);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lid/dana/twilio/trusteddevice/TrustedDeviceContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onCheckVerification", "", "securityId", "", "challenge", "onDerollVerifyPushFailed", "onDerollVerifyPushSuccess", "onKycUser", "nickname", "onNonKycUser", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.PickerBridgeExtension$4$setMin */
        public interface setMin extends parentColumns.getMax {
            void getMin();

            void length();

            void setMax(@NotNull String str);

            void setMin();

            void setMin(@NotNull String str, @Nullable String str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/twilio/trusteddevice/TrustedDeviceComponent;", "", "inject", "", "trustedDeviceActivity", "Lid/dana/twilio/trusteddevice/TrustedDeviceActivity;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @PerActivity
    @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {TrustedDeviceModule.class})
    /* renamed from: o.PickerBridgeExtension$6  reason: invalid class name */
    public interface AnonymousClass6 {
        void setMax(@NotNull TrustedDeviceActivity trustedDeviceActivity);
    }

    public PickerBridgeExtension() {
        this((byte) 0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof PickerBridgeExtension) && Intrinsics.areEqual((Object) this.setMax, (Object) ((PickerBridgeExtension) obj).setMax);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.setMax;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TwilioConsultModel(source=");
        sb.append(this.setMax);
        sb.append(")");
        return sb.toString();
    }

    public PickerBridgeExtension(@Nullable String str) {
        this.setMax = str;
    }

    private /* synthetic */ PickerBridgeExtension(byte b) {
        this("");
    }

    /* renamed from: o.PickerBridgeExtension$3  reason: invalid class name */
    public final class AnonymousClass3 implements AnonymousClass6 {
        private b.C0007b<AnonymousClass4.getMax> FastBitmap$CoordinateSystem;
        private b.C0007b<disableDebug> IsOverlapping;
        private b.C0007b<isPacketDistinct> equals;
        private b.C0007b<onDescriptorWrite> getMax;
        private b.C0007b<getScheme> getMin;
        private b.C0007b<BootstrapNotifier> isInside;
        private b.C0007b<appxLoadFailed> length;
        private final PrepareException.AnonymousClass1 setMax;
        private b.C0007b<AnonymousClass4.setMin> setMin;
        private b.C0007b<AnonymousClass8> toDoubleRange;
        private b.C0007b<sendData> toFloatRange;
        private b.C0007b<onBatchScanResults> toIntRange;

        public /* synthetic */ AnonymousClass3(TrustedDeviceModule trustedDeviceModule, PrepareException.AnonymousClass1 r2, byte b) {
            this(trustedDeviceModule, r2);
        }

        private AnonymousClass3(TrustedDeviceModule trustedDeviceModule, PrepareException.AnonymousClass1 r5) {
            this.setMax = r5;
            this.setMin = isScrap.getMin(MultilevelSelectActivity.length(trustedDeviceModule));
            this.length = new length(r5);
            this.getMin = new setMax(r5);
            isInside isinside = new isInside(r5);
            this.getMax = isinside;
            this.toFloatRange = onConnectionStateChange.create(this.length, this.getMin, isinside);
            getMax getmax = new getMax(r5);
            this.toIntRange = getmax;
            this.IsOverlapping = notifyScannedDevice.create(getmax);
            setMin setmin = new setMin(r5);
            this.equals = setmin;
            BeaconSimulator create = BeaconSimulator.create(this.length, this.getMin, setmin);
            this.isInside = create;
            AnonymousClass7 length2 = AnonymousClass7.length(this.setMin, this.toFloatRange, this.IsOverlapping, create);
            this.toDoubleRange = length2;
            this.FastBitmap$CoordinateSystem = isScrap.getMin(AnonymousClass9.getMax(trustedDeviceModule, length2));
        }

        /* renamed from: o.PickerBridgeExtension$3$getMin */
        public static final class getMin {
            public TrustedDeviceModule setMax;
            public PrepareException.AnonymousClass1 setMin;

            public /* synthetic */ getMin(byte b) {
                this();
            }

            private getMin() {
            }
        }

        /* renamed from: o.PickerBridgeExtension$3$length */
        static class length implements b.C0007b<appxLoadFailed> {
            private final PrepareException.AnonymousClass1 setMax;

            length(PrepareException.AnonymousClass1 r1) {
                this.setMax = r1;
            }

            public final /* synthetic */ Object get() {
                appxLoadFailed length = this.setMax.length();
                if (length != null) {
                    return length;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        /* renamed from: o.PickerBridgeExtension$3$setMax */
        static class setMax implements b.C0007b<getScheme> {
            private final PrepareException.AnonymousClass1 getMin;

            setMax(PrepareException.AnonymousClass1 r1) {
                this.getMin = r1;
            }

            public final /* synthetic */ Object get() {
                getScheme min = this.getMin.getMin();
                if (min != null) {
                    return min;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        /* renamed from: o.PickerBridgeExtension$3$isInside */
        static class isInside implements b.C0007b<onDescriptorWrite> {
            private final PrepareException.AnonymousClass1 setMin;

            isInside(PrepareException.AnonymousClass1 r1) {
                this.setMin = r1;
            }

            public final /* synthetic */ Object get() {
                onDescriptorWrite doubleRange = this.setMin.toDoubleRange();
                if (doubleRange != null) {
                    return doubleRange;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        /* renamed from: o.PickerBridgeExtension$3$getMax */
        static class getMax implements b.C0007b<onBatchScanResults> {
            private final PrepareException.AnonymousClass1 setMin;

            getMax(PrepareException.AnonymousClass1 r1) {
                this.setMin = r1;
            }

            public final /* synthetic */ Object get() {
                onBatchScanResults validateRelationship = this.setMin.validateRelationship();
                if (validateRelationship != null) {
                    return validateRelationship;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        /* renamed from: o.PickerBridgeExtension$3$setMin */
        static class setMin implements b.C0007b<isPacketDistinct> {
            private final PrepareException.AnonymousClass1 getMin;

            setMin(PrepareException.AnonymousClass1 r1) {
                this.getMin = r1;
            }

            public final /* synthetic */ Object get() {
                isPacketDistinct mayLaunchUrl = this.getMin.mayLaunchUrl();
                if (mayLaunchUrl != null) {
                    return mayLaunchUrl;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        public final void setMax(TrustedDeviceActivity trustedDeviceActivity) {
            AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.setMax.IPostMessageService$Stub$Proxy();
            if (IPostMessageService$Stub$Proxy != null) {
                matchInfo.setMin(trustedDeviceActivity, IPostMessageService$Stub$Proxy);
                applyChanges ICustomTabsCallback$Stub = this.setMax.ICustomTabsCallback$Stub();
                if (ICustomTabsCallback$Stub != null) {
                    applyChanges applychanges = ICustomTabsCallback$Stub;
                    appxLoadFailed length2 = this.setMax.length();
                    if (length2 != null) {
                        appxLoadFailed appxloadfailed = length2;
                        getScheme min = this.setMax.getMin();
                        if (min != null) {
                            getScheme getscheme = min;
                            setDefaultFontSize updateVisuals = this.setMax.updateVisuals();
                            if (updateVisuals != null) {
                                matchInfo.length(trustedDeviceActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                                AnonymousClass2.setMax(trustedDeviceActivity, this.FastBitmap$CoordinateSystem.get());
                                return;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                        }
                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    /* renamed from: o.PickerBridgeExtension$2  reason: invalid class name */
    public final class AnonymousClass2 implements getBindingAdapter<TrustedDeviceActivity> {
        @InjectedFieldSignature("id.dana.twilio.trusteddevice.TrustedDeviceActivity.trustedDevicePresenter")
        public static void setMax(TrustedDeviceActivity trustedDeviceActivity, AnonymousClass4.getMax getmax) {
            trustedDeviceActivity.trustedDevicePresenter = getmax;
        }
    }
}
