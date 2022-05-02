package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.social.view.activity.ChangeUsernameActivity;
import o.getTitleText;
import o.setLeftBtnInfo;

public final class isCreateInUIThread implements getBindingAdapter<ChangeUsernameActivity> {
    @InjectedFieldSignature("id.dana.social.view.activity.ChangeUsernameActivity.usernamePresenter")
    public static void getMax(ChangeUsernameActivity changeUsernameActivity, setLeftBtnInfo.length length) {
        changeUsernameActivity.usernamePresenter = length;
    }

    @InjectedFieldSignature("id.dana.social.view.activity.ChangeUsernameActivity.settingPresenter")
    public static void length(ChangeUsernameActivity changeUsernameActivity, getTitleText.getMin getmin) {
        changeUsernameActivity.settingPresenter = getmin;
    }
}
