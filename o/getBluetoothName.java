package o;

import java.util.List;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&J&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H&J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00120\u0003H&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003H&J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\u0006\u0010\u000b\u001a\u00020\u0006H&J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\u0006\u0010\u000b\u001a\u00020\u0006H&J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\u0006\u0010\u000b\u001a\u00020\u001bH&J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\u0006\u0010\u000b\u001a\u00020\u0006H&J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H&J.\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Lid/dana/domain/saving/SavingRepository;", "", "createSaving", "Lio/reactivex/Observable;", "Lid/dana/domain/saving/model/SavingGoalView;", "categoryCode", "", "title", "targetAmount", "getSavingDetail", "Lid/dana/domain/saving/model/SavingDetail;", "savingId", "topUpViewsPage", "", "topUpViewsSize", "getSavingSummary", "Lid/dana/domain/saving/model/SavingSummary;", "getWithdrawOption", "", "initSavingCreate", "Lid/dana/domain/saving/model/SavingCreateInit;", "initSavingTopUp", "Lid/dana/domain/saving/model/SavingTopUpInit;", "initSavingUpdate", "Lid/dana/domain/saving/model/SavingUpdateInit;", "initSavingWithdraw", "Lid/dana/domain/saving/model/SavingWithdrawInitResult;", "Lid/dana/domain/saving/model/SavingWithdrawInitRequest;", "revokeSaving", "", "topUpSaving", "fundAmount", "updateSaving", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface getBluetoothName {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<BeaconManager> createSaving(@NotNull String str, @NotNull String str2, @NotNull String str3);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<setRegionExitPeriod> getSavingDetail(@NotNull String str, long j, long j2);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<logDebug> getSavingSummary();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<List<String>> getWithdrawOption();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<getRegionExitPeriod> initSavingCreate();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<getDistanceModelUpdateUrl> initSavingTopUp(@NotNull String str);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<setDistanceModelUpdateUrl> initSavingUpdate(@NotNull String str);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<setUseTrackingCache> initSavingWithdraw(@NotNull getInstanceForApplication getinstanceforapplication);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> revokeSaving(@NotNull String str);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<String> topUpSaving(@NotNull String str, @NotNull String str2);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<BeaconManager> updateSaving(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4);
}
