package o;

import android.app.Activity;
import id.dana.oauth.activity.OauthGrantActivity;
import id.dana.oauth.model.OauthParamsModel;
import javax.inject.Inject;
import o.onAnimationEnd;

public final class getStrokeAlpha implements onAnimationEnd.getMin {
    public Activity setMin;

    public final void dismissProgress() {
    }

    public final void onError(String str) {
    }

    public final void showProgress() {
    }

    @Inject
    getStrokeAlpha() {
    }

    public final void setMax(OauthParamsModel oauthParamsModel) {
        Activity activity = this.setMin;
        if (activity != null) {
            activity.startActivity(OauthGrantActivity.createOauthGrantIntent(activity, oauthParamsModel));
        }
    }
}
