package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class setExtensionFilter implements getExtensionByName {
    private final setRemoteControlManagement promoPreference;

    @Inject
    public setExtensionFilter(setRemoteControlManagement setremotecontrolmanagement) {
        this.promoPreference = setremotecontrolmanagement;
    }

    public setFavoriteBtnVisibility setFreeTransferCount(String str, int i) {
        return setFavoriteBtnVisibility.length(new getBridgeExtensionByAction(this, str, i));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setFreeTransferCount$0(String str, int i) throws Exception {
        this.promoPreference.setFreeTransferCount(str, i);
    }

    public TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Integer> getFreeTransferCountFromLocal(String str) {
        return TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.getMax(Integer.valueOf(this.promoPreference.getFreeTransferCount(str)));
    }

    public setFavoriteBtnVisibility decrementFreeTransferCount(String str) {
        return setFavoriteBtnVisibility.length(new setExtensionSorter(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$decrementFreeTransferCount$1(String str) throws Exception {
        this.promoPreference.decrementFreeTransferCount(str);
    }

    public TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Integer> getMonthOfFetchFreeTransfer() {
        return TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.getMax(Integer.valueOf(this.promoPreference.getMonthOfFetchFreeTransfer()));
    }

    public setFavoriteBtnVisibility saveMonthOfFetchFreeTransfer(Integer num) {
        return setFavoriteBtnVisibility.length(new enterNode(this, num));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$saveMonthOfFetchFreeTransfer$2(Integer num) throws Exception {
        this.promoPreference.saveMonthOfFetchFreeTransfer(num.intValue());
    }
}
