package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0002J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lid/dana/data/twilio/repository/source/local/PreferenceTwilioDialogEntityData;", "Lid/dana/data/twilio/repository/source/TwilioDialogEntityData;", "twilioDialogPreference", "Lid/dana/data/twilio/repository/source/local/TwilioDialogPreference;", "(Lid/dana/data/twilio/repository/source/local/TwilioDialogPreference;)V", "getNeverShowTwilioDialog", "Lio/reactivex/Observable;", "", "phoneNumber", "", "getTwilioDialogDismissCount", "Lid/dana/domain/twilio/model/TwilioDialogParam;", "getTwilioDialogTimestamp", "", "saveNeverShowTwilioDialog", "neverShow", "saveTwilioDialogDismissCount", "dismissCount", "", "dateTimeStamp", "saveTwilioDialogTimestamp", "", "dateTimestamp", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getOriginUrl implements getRuntimeRequired {
    private final addRequestHeader getMin;

    @Inject
    public getOriginUrl(@NotNull addRequestHeader addrequestheader) {
        Intrinsics.checkNotNullParameter(addrequestheader, "twilioDialogPreference");
        this.getMin = addrequestheader;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<openBluetoothAdapter> length(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        addRequestHeader addrequestheader = this.getMin;
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        Integer integer = addrequestheader.setMax.getInteger("twilio_dialog_dismiss_count".concat(String.valueOf(str)));
        Intrinsics.checkNotNullExpressionValue(integer, "preferenceFacade.getInte…MISS_COUNT + phoneNumber)");
        int intValue = integer.intValue();
        addRequestHeader addrequestheader2 = this.getMin;
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        Long l = addrequestheader2.setMax.getLong("never_show_twilio_dialog_timestamp".concat(String.valueOf(str)));
        Intrinsics.checkNotNullExpressionValue(l, "preferenceFacade.getLong…_TIMESTAMP + phoneNumber)");
        TitleBarRightButtonView.AnonymousClass1<openBluetoothAdapter> just = TitleBarRightButtonView.AnonymousClass1.just(new openBluetoothAdapter(intValue, l.longValue()));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(TwilioDi…issCount, dateTimestamp))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.getMin.setMax(str)));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(twilioDi…wilioDialog(phoneNumber))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> length(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.getMin.getMax(z, str)));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(twilioDi…(neverShow, phoneNumber))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> length(int i, long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        this.getMin.length(j, str);
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.getMin.length(i, str)));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(twilioDi…smissCount, phoneNumber))");
        return just;
    }
}
