package o;

import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H&J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003H&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003H&J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\u0006\u0010\f\u001a\u00020\u0006H&J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\u0006\u0010\f\u001a\u00020\u0006H&J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\u0006\u0010\f\u001a\u00020\u0006H&J&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H&J.\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006#À\u0006\u0001"}, d2 = {"Lid/dana/data/saving/repository/SavingEntityData;", "", "createSaving", "Lio/reactivex/Observable;", "Lid/dana/data/saving/repository/source/network/response/GoalCreateSubmitResult;", "requestId", "", "categoryCode", "title", "targetAmount", "getSavingDetail", "Lid/dana/data/saving/repository/source/network/response/SavingDetailResult;", "savingId", "topUpViewsPage", "", "topUpViewsSize", "getSavingSummary", "Lid/dana/data/saving/repository/source/network/response/UserSavingSummaryConsultResult;", "initSavingCreate", "Lid/dana/data/saving/repository/source/network/response/GoalCreateInitResult;", "initSavingTopUp", "Lid/dana/data/saving/repository/source/network/response/GoalTopUpInitResult;", "initSavingUpdate", "Lid/dana/data/saving/repository/source/network/response/GoalUpdateInitResult;", "initSavingWithdraw", "Lid/dana/data/saving/repository/source/network/response/SavingWithdrawInitEntityResult;", "savingWithdrawInitRequest", "Lid/dana/domain/saving/model/SavingWithdrawInitRequest;", "revokeSaving", "Lid/dana/data/saving/repository/source/network/response/GoalRevokeResult;", "topUpSaving", "Lid/dana/data/saving/repository/source/network/response/SavingTopUpSubmitResult;", "fundAmount", "updateSaving", "Lid/dana/data/saving/repository/source/network/response/GoalUpdateSubmitResult;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface isResetCookie {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<allowBgLogin> createSaving(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<shortLinkOnly> getSavingDetail(@NotNull String str, long j, long j2);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<access$2100> getSavingSummary();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<disableEncrypt> initSavingCreate();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<rpcV2> initSavingTopUp(@NotNull String str);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<rpcLoggerLevel> initSavingUpdate(@NotNull String str);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<needSignature> initSavingWithdraw(@NotNull getInstanceForApplication getinstanceforapplication);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<allowNonNet> revokeSaving(@NotNull String str);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<enableEncrypt> topUpSaving(@NotNull String str, @NotNull String str2, @NotNull String str3);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<shortLinkIPList> updateSaving(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4);
}
