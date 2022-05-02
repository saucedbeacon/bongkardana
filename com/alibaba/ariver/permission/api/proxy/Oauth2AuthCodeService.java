package com.alibaba.ariver.permission.api.proxy;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.Proxiable;
import com.alibaba.ariver.permission.openauth.model.request.AuthExecuteRequestModel;
import com.alibaba.ariver.permission.openauth.model.request.AuthSkipRequestModel;
import com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel;
import com.alibaba.ariver.permission.openauth.model.result.AuthSkipResultModel;

public interface Oauth2AuthCodeService extends Proxiable {
    AuthExecuteResultModel executeAuth(AuthExecuteRequestModel authExecuteRequestModel);

    AuthSkipResultModel getAuthSkipResult(String str, App app, AuthSkipRequestModel authSkipRequestModel);
}
