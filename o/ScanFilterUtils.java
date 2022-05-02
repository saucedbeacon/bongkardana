package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/twilio/interactor/CreateTwilioFactor;", "Lid/dana/domain/UseCase;", "", "Lid/dana/domain/twilio/interactor/CreateTwilioFactor$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "twilioSdkRepository", "Lid/dana/domain/twilio/TwilioSdkRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/twilio/TwilioSdkRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class ScanFilterUtils extends parseFailed<String, length> {
    private final isPacketDistinct twilioSdkRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public ScanFilterUtils(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull isPacketDistinct ispacketdistinct) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(ispacketdistinct, "twilioSdkRepository");
        this.twilioSdkRepository = ispacketdistinct;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0002\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/twilio/interactor/GetNeverShowTwilioDialog;", "Lid/dana/domain/UseCase;", "", "", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "twilioDialogRepository", "Lid/dana/domain/twilio/TwilioDialogRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/twilio/TwilioDialogRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "(Lkotlin/Unit;)Lio/reactivex/Observable;", "domain_release"}, k = 1, mv = {1, 4, 2})
    public final class ScanFilterData extends parseFailed<Boolean, Unit> {
        private final clearDetections twilioDialogRepository;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @Inject
        public ScanFilterData(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull clearDetections cleardetections) {
            super(appxloadfailed, getscheme);
            Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
            Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
            Intrinsics.checkNotNullParameter(cleardetections, "twilioDialogRepository");
            this.twilioDialogRepository = cleardetections;
        }

        /* access modifiers changed from: protected */
        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(@Nullable Unit unit) {
            return this.twilioDialogRepository.getNeverShowTwilioDialog();
        }
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> buildUseCaseObservable(@NotNull length length2) {
        TitleBarRightButtonView.AnonymousClass1<String> r5;
        Intrinsics.checkNotNullParameter(length2, "params");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<String> createFactor = this.twilioSdkRepository.createFactor(length2.getServiceSid(), length2.getIdentity(), length2.getPushToken(), length2.getAccessToken());
        if (createFactor instanceof getSecondFloorView) {
            r5 = ((getSecondFloorView) createFactor).setMax();
        } else {
            setTitleLoading settitleloading = new setTitleLoading(createFactor);
            RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
            r5 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
        }
        Intrinsics.checkNotNullExpressionValue(r5, "twilioSdkRepository.crea…\n        ).toObservable()");
        return r5;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lid/dana/domain/twilio/interactor/CreateTwilioFactor$Params;", "", "serviceSid", "", "identity", "pushToken", "accessToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getIdentity", "getPushToken", "getServiceSid", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        @NotNull
        private final String accessToken;
        @NotNull
        private final String identity;
        @NotNull
        private final String pushToken;
        @NotNull
        private final String serviceSid;

        public length(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "serviceSid");
            Intrinsics.checkNotNullParameter(str2, "identity");
            Intrinsics.checkNotNullParameter(str3, "pushToken");
            Intrinsics.checkNotNullParameter(str4, "accessToken");
            this.serviceSid = str;
            this.identity = str2;
            this.pushToken = str3;
            this.accessToken = str4;
        }

        @NotNull
        public final String getServiceSid() {
            return this.serviceSid;
        }

        @NotNull
        public final String getIdentity() {
            return this.identity;
        }

        @NotNull
        public final String getPushToken() {
            return this.pushToken;
        }

        @NotNull
        public final String getAccessToken() {
            return this.accessToken;
        }
    }
}
