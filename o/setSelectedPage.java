package o;

import o.SwitchTabPoint;
import o.TitleBarRightButtonView;

final class setSelectedPage implements SwitchTabPoint.getMax {
    private final TitleBarRightButtonView.AnonymousClass2 setMin;

    public setSelectedPage(TitleBarRightButtonView.AnonymousClass2 r1) {
        this.setMin = r1;
    }

    public final void onChangePhoneFinished(getStatus getstatus) {
        onSwitchTab.lambda$getChangePhoneNumberH5Event$0(this.setMin, getstatus);
    }
}
