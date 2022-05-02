package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rH\u0002J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\rH\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lid/dana/data/twilio/repository/TwilioDialogEntityRepository;", "Lid/dana/domain/twilio/TwilioDialogRepository;", "twilioDialogDataFactory", "Lid/dana/data/twilio/repository/source/TwilioDialogDataFactory;", "accountEntityDataFactory", "Lid/dana/data/account/repository/source/AccountEntityDataFactory;", "(Lid/dana/data/twilio/repository/source/TwilioDialogDataFactory;Lid/dana/data/account/repository/source/AccountEntityDataFactory;)V", "createAccountData", "Lid/dana/data/account/repository/source/AccountEntityData;", "kotlin.jvm.PlatformType", "createTwilioDialogData", "Lid/dana/data/twilio/repository/source/TwilioDialogEntityData;", "getNeverShowTwilioDialog", "Lio/reactivex/Observable;", "", "getPhoneNumber", "", "getTwilioDialogDismissCount", "Lid/dana/domain/twilio/model/TwilioDialogParam;", "saveNeverShowTwilioDialog", "neverShow", "saveTwilioDialogDismissCount", "dismissCount", "", "dateTimeStamp", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AppxNgRuntimeChecker implements clearDetections {
    private final DialogLayout getMax;
    private final AbstractResource setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "phoneNumber", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<String, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
        final /* synthetic */ AppxNgRuntimeChecker length;
        final /* synthetic */ boolean setMax;

        getMax(AppxNgRuntimeChecker appxNgRuntimeChecker, boolean z) {
            this.length = appxNgRuntimeChecker;
            this.setMax = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "phoneNumber");
            return AppxNgRuntimeChecker.length(this.length).length(this.setMax, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/twilio/model/TwilioDialogParam;", "kotlin.jvm.PlatformType", "phoneNumber", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<String, TitleBarRightButtonView.AnonymousClass4<? extends openBluetoothAdapter>> {
        final /* synthetic */ AppxNgRuntimeChecker setMax;

        getMin(AppxNgRuntimeChecker appxNgRuntimeChecker) {
            this.setMax = appxNgRuntimeChecker;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "phoneNumber");
            return AppxNgRuntimeChecker.length(this.setMax).length(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "phoneNumber", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<String, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
        final /* synthetic */ AppxNgRuntimeChecker setMin;

        length(AppxNgRuntimeChecker appxNgRuntimeChecker) {
            this.setMin = appxNgRuntimeChecker;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "phoneNumber");
            return AppxNgRuntimeChecker.length(this.setMin).getMax(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "phoneNumber", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<String, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
        final /* synthetic */ AppxNgRuntimeChecker getMin;
        final /* synthetic */ long length;
        final /* synthetic */ int setMax;

        setMax(AppxNgRuntimeChecker appxNgRuntimeChecker, int i, long j) {
            this.getMin = appxNgRuntimeChecker;
            this.setMax = i;
            this.length = j;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "phoneNumber");
            return AppxNgRuntimeChecker.length(this.getMin).length(this.setMax, this.length, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/account/AccountEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<attach, String> {
        public static final setMin getMin = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            attach attach = (attach) obj;
            Intrinsics.checkNotNullParameter(attach, "it");
            return attach.getPhoneNumber();
        }
    }

    @Inject
    public AppxNgRuntimeChecker(@NotNull AbstractResource abstractResource, @NotNull DialogLayout dialogLayout) {
        Intrinsics.checkNotNullParameter(abstractResource, "twilioDialogDataFactory");
        Intrinsics.checkNotNullParameter(dialogLayout, "accountEntityDataFactory");
        this.setMax = abstractResource;
        this.getMax = dialogLayout;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<openBluetoothAdapter> getTwilioDialogDismissCount() {
        setDrawDivider createData = this.getMax.createData("local");
        Intrinsics.checkNotNullExpressionValue(createData, "createAccountData()");
        TitleBarRightButtonView.AnonymousClass1<R> map = createData.getAccount().map(setMin.getMin);
        Intrinsics.checkNotNullExpressionValue(map, "createAccountData().account.map { it.phoneNumber }");
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = map.flatMap(new getMin(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "getPhoneNumber().flatMap…nt(phoneNumber)\n        }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveTwilioDialogDismissCount(int i, long j) {
        setDrawDivider createData = this.getMax.createData("local");
        Intrinsics.checkNotNullExpressionValue(createData, "createAccountData()");
        TitleBarRightButtonView.AnonymousClass1<R> map = createData.getAccount().map(setMin.getMin);
        Intrinsics.checkNotNullExpressionValue(map, "createAccountData().account.map { it.phoneNumber }");
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = map.flatMap(new setMax(this, i, j));
        Intrinsics.checkNotNullExpressionValue(flatMap, "getPhoneNumber().flatMap…mp,phoneNumber)\n        }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getNeverShowTwilioDialog() {
        setDrawDivider createData = this.getMax.createData("local");
        Intrinsics.checkNotNullExpressionValue(createData, "createAccountData()");
        TitleBarRightButtonView.AnonymousClass1<R> map = createData.getAccount().map(setMin.getMin);
        Intrinsics.checkNotNullExpressionValue(map, "createAccountData().account.map { it.phoneNumber }");
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = map.flatMap(new length(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "getPhoneNumber().flatMap…og(phoneNumber)\n        }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveNeverShowTwilioDialog(boolean z) {
        setDrawDivider createData = this.getMax.createData("local");
        Intrinsics.checkNotNullExpressionValue(createData, "createAccountData()");
        TitleBarRightButtonView.AnonymousClass1<R> map = createData.getAccount().map(setMin.getMin);
        Intrinsics.checkNotNullExpressionValue(map, "createAccountData().account.map { it.phoneNumber }");
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = map.flatMap(new getMax(this, z));
        Intrinsics.checkNotNullExpressionValue(flatMap, "getPhoneNumber().flatMap…w, phoneNumber)\n        }");
        return flatMap;
    }

    public static final /* synthetic */ getRuntimeRequired length(AppxNgRuntimeChecker appxNgRuntimeChecker) {
        return new getOriginUrl(appxNgRuntimeChecker.setMax.setMin);
    }
}
