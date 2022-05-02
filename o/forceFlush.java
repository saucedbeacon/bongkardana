package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/twilio/interactor/TwilioVerifySecurityProduct;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/twilio/model/VerifySecurityInfo;", "Lid/dana/domain/twilio/interactor/TwilioVerifySecurityProduct$Param;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "twilioRepository", "Lid/dana/domain/twilio/TwilioRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/twilio/TwilioRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Param", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class forceFlush extends parseFailed<getConnectedBluetoothDevices, setMax> {
    private final onBatchScanResults twilioRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public forceFlush(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull onBatchScanResults onbatchscanresults) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(onbatchscanresults, "twilioRepository");
        this.twilioRepository = onbatchscanresults;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getConnectedBluetoothDevices> buildUseCaseObservable(@NotNull setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "params");
        return this.twilioRepository.verifySecurityProduct(setmax.getTwilioVerify());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lid/dana/domain/twilio/interactor/TwilioVerifySecurityProduct$Param;", "", "twilioVerify", "Lid/dana/domain/twilio/model/TwilioVerify;", "(Lid/dana/domain/twilio/model/TwilioVerify;)V", "getTwilioVerify", "()Lid/dana/domain/twilio/model/TwilioVerify;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        @NotNull
        private final getBluetoothDevices twilioVerify;

        public static /* synthetic */ setMax copy$default(setMax setmax, getBluetoothDevices getbluetoothdevices, int i, Object obj) {
            if ((i & 1) != 0) {
                getbluetoothdevices = setmax.twilioVerify;
            }
            return setmax.copy(getbluetoothdevices);
        }

        @NotNull
        public final getBluetoothDevices component1() {
            return this.twilioVerify;
        }

        @NotNull
        public final setMax copy(@NotNull getBluetoothDevices getbluetoothdevices) {
            Intrinsics.checkNotNullParameter(getbluetoothdevices, "twilioVerify");
            return new setMax(getbluetoothdevices);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof setMax) && Intrinsics.areEqual((Object) this.twilioVerify, (Object) ((setMax) obj).twilioVerify);
            }
            return true;
        }

        public final int hashCode() {
            getBluetoothDevices getbluetoothdevices = this.twilioVerify;
            if (getbluetoothdevices != null) {
                return getbluetoothdevices.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Param(twilioVerify=");
            sb.append(this.twilioVerify);
            sb.append(")");
            return sb.toString();
        }

        public setMax(@NotNull getBluetoothDevices getbluetoothdevices) {
            Intrinsics.checkNotNullParameter(getbluetoothdevices, "twilioVerify");
            this.twilioVerify = getbluetoothdevices;
        }

        @NotNull
        public final getBluetoothDevices getTwilioVerify() {
            return this.twilioVerify;
        }
    }
}
