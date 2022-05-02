package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\r\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/data/sendmoney/repository/source/local/PreferenceSendMoneyEntityData;", "Lid/dana/data/sendmoney/repository/SendMoneyPreferenceEntityData;", "sendMoneyPreference", "Lid/dana/data/sendmoney/repository/source/local/SendMoneyPreference;", "(Lid/dana/data/sendmoney/repository/source/local/SendMoneyPreference;)V", "getStateSendMoneyShareFeed", "Lio/reactivex/Observable;", "", "isNeedToShowExternalOnboardingDialog", "", "saveIsNeedToShowExternalOnboardingDialog", "isShow", "saveStateSendMoneyShareFeed", "state", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class parseAriverCodeUrl {
    private final getCORSUrl sendMoneyPreference;

    @Inject
    public parseAriverCodeUrl(@NotNull getCORSUrl getcorsurl) {
        Intrinsics.checkNotNullParameter(getcorsurl, "sendMoneyPreference");
        this.sendMoneyPreference = getcorsurl;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveIsNeedToShowExternalOnboardingDialog(boolean z) {
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.sendMoneyPreference.saveIsNeedToShowExternalOnboardingDialog(z)));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(sendMone…OnboardingDialog(isShow))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isNeedToShowExternalOnboardingDialog() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.sendMoneyPreference.isNeedToShowExternalOnboardingDialog()));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(sendMone…ternalOnboardingDialog())");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveStateSendMoneyShareFeed(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "state");
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.sendMoneyPreference.saveStateSendMoneyShareFeed(str)));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(sendMone…endMoneyShareFeed(state))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> getStateSendMoneyShareFeed() {
        TitleBarRightButtonView.AnonymousClass1<String> just = TitleBarRightButtonView.AnonymousClass1.just(this.sendMoneyPreference.getStateSendMoneyShareFeed());
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(sendMone…tateSendMoneyShareFeed())");
        return just;
    }
}
