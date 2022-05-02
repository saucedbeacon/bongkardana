package o;

import kotlin.Metadata;
import o.GriverExecutors;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0010\u001a\u00020\u0004H&J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0012\u001a\u00020\fH&J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\fH&J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0016\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lid/dana/domain/kycrenewal/KycRenewalRepository;", "", "getKYCRenewalButtonClick", "Lio/reactivex/Observable;", "", "getKYCRenewalDismissCount", "", "getKYCRenewalStatus", "Lid/dana/domain/kycrenewal/model/QueryKYCRenewalStatus;", "getKYCUserData", "Lid/dana/domain/kycrenewal/model/QueryKYCUserData;", "isNeedToQueryKYCRenewalDialog", "", "isNeedToShowKYCRenewalDialog", "Lid/dana/domain/kycrenewal/model/ShowDialogPreference;", "saveClickKYCRenewalButton", "click", "saveQueryKYCRenewalDialog", "timeStamp", "saveShowKYCRenewalDialog", "show", "setKYCRenewalDismissCount", "count", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface AbstractPriorityRunnable {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> getKYCRenewalButtonClick();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Integer> getKYCRenewalDismissCount();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<GriverExecutors.H5SingleThreadFactory> getKYCRenewalStatus();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<GriverInnerAppUtil> getKYCUserData();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Long> isNeedToQueryKYCRenewalDialog();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<uncaughtException> isNeedToShowKYCRenewalDialog();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> saveClickKYCRenewalButton(boolean z);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> saveQueryKYCRenewalDialog(long j);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> saveShowKYCRenewalDialog(boolean z, long j);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> setKYCRenewalDismissCount(int i);
}
