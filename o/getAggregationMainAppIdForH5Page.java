package o;

import android.content.Context;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;

@Singleton
public class getAggregationMainAppIdForH5Page extends setRepeatCount<RVFlag> implements parsePermissionJson {
    @Inject
    public getAggregationMainAppIdForH5Page(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
    }

    public Class<RVFlag> getFacadeClass() {
        return RVFlag.class;
    }

    public TitleBarRightButtonView.AnonymousClass1<String> shorten(String str, String str2) {
        getOpenAuthGrantFlag getopenauthgrantflag = new getOpenAuthGrantFlag();
        getopenauthgrantflag.bizType = str;
        getopenauthgrantflag.originalUrl = str2;
        return wrapper(new getAggregationMainAppId(getopenauthgrantflag)).map(BizPermissionManager.setMax);
    }

    public TitleBarRightButtonView.AnonymousClass1<String> restore(String str) {
        PermissionManager permissionManager = new PermissionManager();
        permissionManager.shortUrl = str;
        return wrapper(new parseJsApiPermission(permissionManager)).map(checkBizParamPermission.getMin);
    }
}
