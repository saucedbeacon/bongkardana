package o;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/domain/twilio/interactor/VerifyTwilioFactor;", "Lid/dana/domain/UseCase;", "", "", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "twilioSdkRepository", "Lid/dana/domain/twilio/TwilioSdkRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/twilio/TwilioSdkRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getStartIndex extends parseFailed<List<? extends String>, String> {
    private final isPacketDistinct twilioSdkRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getStartIndex(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull isPacketDistinct ispacketdistinct) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(ispacketdistinct, "twilioSdkRepository");
        this.twilioSdkRepository = ispacketdistinct;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> buildUseCaseObservable(@NotNull String str) {
        TitleBarRightButtonView.AnonymousClass1<List<String>> r2;
        Intrinsics.checkNotNullParameter(str, "params");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<List<String>> verifyFactor = this.twilioSdkRepository.verifyFactor(str);
        if (verifyFactor instanceof getSecondFloorView) {
            r2 = ((getSecondFloorView) verifyFactor).setMax();
        } else {
            setTitleLoading settitleloading = new setTitleLoading(verifyFactor);
            RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
            r2 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
        }
        Intrinsics.checkNotNullExpressionValue(r2, "twilioSdkRepository.veri…or(params).toObservable()");
        return r2;
    }
}
