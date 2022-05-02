package o;

import com.iap.ac.android.biz.common.model.ResultCode;
import java.util.List;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\fH\u0002J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0002J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0010H\u0002J&\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004H\u0016J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0004H\u0016J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00042\u0006\u0010 \u001a\u00020\u0007H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\u0006\u0010 \u001a\u00020\u0007H\u0016J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00042\u0006\u0010,\u001a\u00020-H\u0016J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00042\u0006\u0010 \u001a\u00020\u0007H\u0016J&\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00042\u0006\u0010 \u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J.\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00042\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u00065"}, d2 = {"Lid/dana/data/saving/repository/source/mock/MockSavingEntityData;", "Lid/dana/data/saving/repository/SavingEntityData;", "()V", "createSaving", "Lio/reactivex/Observable;", "Lid/dana/data/saving/repository/source/network/response/GoalCreateSubmitResult;", "requestId", "", "categoryCode", "title", "targetAmount", "createSavingViewEntity", "Lid/dana/data/saving/model/SavingView;", "currentAmount", "createdTime", "generateCategoryCodes", "", "generateCurrentAmount", "Lid/dana/data/nearbyme/model/MoneyViewEntity;", "generateMaxAmount", "generateMaxTargetAmount", "generateMockInitSavingUpdate", "Lid/dana/data/saving/repository/source/network/response/GoalUpdateInitResult;", "generateMockSavingSummary", "Lid/dana/data/saving/repository/source/network/response/UserSavingSummaryConsultResult;", "generateSavingDetail", "Lid/dana/data/saving/repository/source/network/response/SavingDetailResult;", "generateSavingViewEntity", "generateSavingViews", "generateTopUpViewEntities", "Lid/dana/data/saving/model/TopUpViewEntity;", "getSavingDetail", "savingId", "topUpViewsPage", "", "topUpViewsSize", "getSavingSummary", "initSavingCreate", "Lid/dana/data/saving/repository/source/network/response/GoalCreateInitResult;", "initSavingTopUp", "Lid/dana/data/saving/repository/source/network/response/GoalTopUpInitResult;", "initSavingUpdate", "initSavingWithdraw", "Lid/dana/data/saving/repository/source/network/response/SavingWithdrawInitEntityResult;", "savingWithdrawInitRequest", "Lid/dana/domain/saving/model/SavingWithdrawInitRequest;", "revokeSaving", "Lid/dana/data/saving/repository/source/network/response/GoalRevokeResult;", "topUpSaving", "Lid/dana/data/saving/repository/source/network/response/SavingTopUpSubmitResult;", "fundAmount", "updateSaving", "Lid/dana/data/saving/repository/source/network/response/GoalUpdateSubmitResult;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isShortLinkOnly implements isResetCookie {
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<access$2100> getSavingSummary() {
        TitleBarRightButtonView.AnonymousClass1<access$2100> just = TitleBarRightButtonView.AnonymousClass1.just(generateMockSavingSummary());
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(\n       …erateMockSavingSummary())");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<shortLinkOnly> getSavingDetail(@NotNull String str, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        TitleBarRightButtonView.AnonymousClass1<shortLinkOnly> just = TitleBarRightButtonView.AnonymousClass1.just(generateSavingDetail());
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(generateSavingDetail())");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<disableEncrypt> initSavingCreate() {
        TitleBarRightButtonView.AnonymousClass1<disableEncrypt> just = TitleBarRightButtonView.AnonymousClass1.just(new disableEncrypt(generateCategoryCodes(), generateMaxTargetAmount()));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(\n       …tAmount()\n        )\n    )");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<allowBgLogin> createSaving(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "requestId");
        Intrinsics.checkNotNullParameter(str2, "categoryCode");
        Intrinsics.checkNotNullParameter(str3, "title");
        Intrinsics.checkNotNullParameter(str4, "targetAmount");
        TitleBarRightButtonView.AnonymousClass1<allowBgLogin> just = TitleBarRightButtonView.AnonymousClass1.just(new allowBgLogin(generateSavingViewEntity()));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(\n       …wEntity()\n        )\n    )");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<rpcLoggerLevel> initSavingUpdate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        TitleBarRightButtonView.AnonymousClass1<rpcLoggerLevel> just = TitleBarRightButtonView.AnonymousClass1.just(generateMockInitSavingUpdate());
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(generateMockInitSavingUpdate())");
        return just;
    }

    private final rpcLoggerLevel generateMockInitSavingUpdate() {
        return new rpcLoggerLevel(generateCategoryCodes(), generateMaxTargetAmount(), generateSavingViewEntity());
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<shortLinkIPList> updateSaving(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        Intrinsics.checkNotNullParameter(str2, "categoryCode");
        Intrinsics.checkNotNullParameter(str3, "title");
        Intrinsics.checkNotNullParameter(str4, "targetAmount");
        shortLinkIPList shortlinkiplist = new shortLinkIPList(generateSavingViewEntity());
        shortlinkiplist.success = true;
        TitleBarRightButtonView.AnonymousClass1<shortLinkIPList> just = TitleBarRightButtonView.AnonymousClass1.just(shortlinkiplist);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(\n       …ss = true\n        }\n    )");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<allowNonNet> revokeSaving(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        TitleBarRightButtonView.AnonymousClass1<allowNonNet> just = TitleBarRightButtonView.AnonymousClass1.just(new allowNonNet(Random.Default.nextBoolean()));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(GoalRevo…lt(Random.nextBoolean()))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<rpcV2> initSavingTopUp(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        TitleBarRightButtonView.AnonymousClass1<rpcV2> just = TitleBarRightButtonView.AnonymousClass1.just(new rpcV2(generateMaxAmount(), generateCurrentAmount(), generateMaxTargetAmount()));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(\n       …)\n            )\n        )");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<enableEncrypt> topUpSaving(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        Intrinsics.checkNotNullParameter(str2, "fundAmount");
        Intrinsics.checkNotNullParameter(str3, "requestId");
        String randomString = setEntryInfo.randomString();
        Intrinsics.checkNotNullExpressionValue(randomString, "randomString()");
        TitleBarRightButtonView.AnonymousClass1<enableEncrypt> just = TitleBarRightButtonView.AnonymousClass1.just(new enableEncrypt(randomString));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(\n       …itResult(randomString()))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<needSignature> initSavingWithdraw(@NotNull getInstanceForApplication getinstanceforapplication) {
        Intrinsics.checkNotNullParameter(getinstanceforapplication, "savingWithdrawInitRequest");
        throw new NotImplementedError("An operation is not implemented: ".concat("Not yet implemented"));
    }

    private final onWorkerReady generateMaxAmount() {
        return new onWorkerReady("103.000", "Rp", "Rp");
    }

    private final onWorkerReady generateCurrentAmount() {
        return new onWorkerReady("1.00.000", "Rp", "Rp");
    }

    private final onWorkerReady generateMaxTargetAmount() {
        return new onWorkerReady("2.000.000", "Rp", "Rp");
    }

    private final List<String> generateCategoryCodes() {
        return CollectionsKt.listOf("entertainment", "fashion", "gadget", "electronic", "travelling", "general");
    }

    private final shortLinkOnly generateSavingDetail() {
        shortLinkOnly shortlinkonly = new shortLinkOnly(generateSavingViewEntity(), generateTopUpViewEntities(), true);
        shortlinkonly.success = true;
        return shortlinkonly;
    }

    private final List<useSpdy> generateTopUpViewEntities() {
        return CollectionsKt.listOf(new useSpdy("202004161013012101010016677091155599", new onWorkerReady("30000", "Rp", "Rp"), "SUCCESS", "2020-04-16T15:11:50+07:00", "2020-04-16T15:12:12+07:00", MapsKt.emptyMap()), new useSpdy("202004161013012101010016677091155598", new onWorkerReady("10000", "Rp", "Rp"), "SUCCESS", "2020-04-16T09:45:22+07:00", "2020-04-16T09:45:49+07:00", MapsKt.emptyMap()), new useSpdy("202004161013012101010016677091155597", new onWorkerReady("50000", "Rp", "Rp"), "SUCCESS", "2020-04-15T23:39:19+07:00", "2020-04-15T23:39:58+07:00", MapsKt.emptyMap()));
    }

    private final headers generateSavingViewEntity() {
        return new headers("202004161013012001010016677091197714", "Beli baju Avengers", "fashion", new onWorkerReady("155000", (String) null, (String) null, 6, (DefaultConstructorMarker) null), new onWorkerReady("275000", (String) null, (String) null, 6, (DefaultConstructorMarker) null), ResultCode.PROCESSING, "", "2020-04-15T14:14:00+07:00", "", "");
    }

    private final access$2100 generateMockSavingSummary() {
        access$2100 access_2100 = new access$2100(new onWorkerReady("300000", (String) null, (String) null, 6, (DefaultConstructorMarker) null), new onWorkerReady("8000000", (String) null, (String) null, 6, (DefaultConstructorMarker) null), 10, new onWorkerReady("7700000", (String) null, (String) null, 6, (DefaultConstructorMarker) null), 2, generateSavingViews(), false);
        access_2100.success = true;
        return access_2100;
    }

    private final List<headers> generateSavingViews() {
        return CollectionsKt.listOf(createSavingViewEntity("Title 1", "entertainment", "250.000", "1.000.000", "2020-01-16T18:30:03+07:00"), createSavingViewEntity("Title 2", "fashion", "100.000", "100.000", "2020-04-16T18:30:03+08:00"), createSavingViewEntity("Title 3", "electronic", "600.000", "900.000", "2020-09-16T18:30:03+07:00"), createSavingViewEntity("Title 4", "gadget", "1.100.000", "1.100.000", "2020-05-09T18:30:03+07:00"), createSavingViewEntity("Title 5", "electronic", "40.000", "800.000", "2020-03-16T18:30:03+07:00"), createSavingViewEntity("Title 6", "travelling", "500.000", "600.000", "2020-02-12T18:30:03+07:00"), createSavingViewEntity("Title 7", "general", "10.000", "700.000", "2020-04-15T18:30:03+07:00"));
    }

    private final headers createSavingViewEntity(String str, String str2, String str3, String str4, String str5) {
        String randomString = setEntryInfo.randomString();
        Intrinsics.checkNotNullExpressionValue(randomString, "randomString()");
        onWorkerReady onworkerready = new onWorkerReady(str3, (String) null, (String) null, 6, (DefaultConstructorMarker) null);
        onWorkerReady onworkerready2 = new onWorkerReady(str4, (String) null, (String) null, 6, (DefaultConstructorMarker) null);
        String randomString2 = setEntryInfo.randomString();
        Intrinsics.checkNotNullExpressionValue(randomString2, "randomString()");
        return new headers(randomString, str, str2, onworkerready, onworkerready2, randomString2, setEntryInfo.randomString(), str5, setEntryInfo.randomString(), setEntryInfo.randomString());
    }
}
