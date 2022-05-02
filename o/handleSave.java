package o;

import id.dana.oauth.model.OauthParamsModel;

public final class handleSave extends setSpeed<isForMainFrame, OauthParamsModel> {
    public final /* synthetic */ Object map(Object obj) {
        isForMainFrame isformainframe = (isForMainFrame) obj;
        if (isformainframe == null) {
            return null;
        }
        OauthParamsModel oauthParamsModel = new OauthParamsModel();
        oauthParamsModel.getMin = isformainframe.getClientId();
        oauthParamsModel.isInside = isformainframe.getCodeChallenge();
        oauthParamsModel.setMax = isformainframe.getPhoneNumber();
        oauthParamsModel.getMax = isformainframe.getResponseType();
        oauthParamsModel.length = isformainframe.getScope();
        oauthParamsModel.setMin = isformainframe.getState();
        oauthParamsModel.toFloatRange = Boolean.valueOf(isformainframe.isNeedMobileToken());
        oauthParamsModel.IsOverlapping = isformainframe.getRedirectUrl();
        oauthParamsModel.equals = isformainframe.getMerchantId();
        oauthParamsModel.toDoubleRange = isformainframe.getMerchantName();
        oauthParamsModel.hashCode = isformainframe.getReferringLink();
        return oauthParamsModel;
    }
}
