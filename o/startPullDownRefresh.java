package o;

import id.dana.myprofile.MyProfileFragment;
import kotlin.jvm.functions.Function1;

public final class startPullDownRefresh implements Function1 {
    private final MyProfileFragment length;

    public startPullDownRefresh(MyProfileFragment myProfileFragment) {
        this.length = myProfileFragment;
    }

    public final Object invoke(Object obj) {
        return this.length.myProfilePresenter.isInside();
    }
}
