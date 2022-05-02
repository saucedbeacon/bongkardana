package o;

import id.dana.oauth.OauthConstant;
import id.dana.oauth.model.OauthParamsModel;

public final class setScreenAutolock {
    public final String setMax;

    public setScreenAutolock(String str) {
        this.setMax = str;
    }

    public final String setMin(OauthParamsModel oauthParamsModel, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(oauthParamsModel.getMax(this.setMax));
        sb.append(setH5OptionMenuTextFlag.setMin("?state={stateCode}&error={errorCode}&error_description={errorDescription}").setMax("errorCode", str).setMax(OauthConstant.PathParams.ERROR_DESCRIPTION, str2).setMax(OauthConstant.PathParams.STATE_CODE, oauthParamsModel.setMin).getMax());
        return sb.toString();
    }
}
