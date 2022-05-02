package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;
import o.b;

@Singleton
public class getPermissionModel extends setMinProgress implements AndroidModel {
    private final getPermissionAppId urlShortenerEntityDataFactory;

    @Inject
    public getPermissionModel(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, getPermissionAppId getpermissionappid, getAppLaunchParams getapplaunchparams) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.urlShortenerEntityDataFactory = getpermissionappid;
    }

    public TitleBarRightButtonView.AnonymousClass1<String> shorten(String str, String str2) {
        return authenticatedRequest(createUrlShortenerData().shorten(str, str2));
    }

    private parsePermissionJson createUrlShortenerData() {
        return this.urlShortenerEntityDataFactory.createData("network");
    }

    public TitleBarRightButtonView.AnonymousClass1<String> restore(String str) {
        return authenticatedRequest(createUrlShortenerData().restore(str));
    }
}
