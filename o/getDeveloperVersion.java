package o;

import id.dana.data.user.source.network.request.UserInfoRequest;
import o.addAnimatorUpdateListener;

final class getDeveloperVersion implements addAnimatorUpdateListener.getMax {
    private final UserInfoRequest length;

    public getDeveloperVersion(UserInfoRequest userInfoRequest) {
        this.length = userInfoRequest;
    }

    public final Object processFacade(Object obj) {
        return ((getVhost) obj).getUserInfo(this.length);
    }
}
