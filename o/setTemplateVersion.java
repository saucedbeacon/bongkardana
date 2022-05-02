package o;

import id.dana.data.account.repository.AccountEntityRepository;
import java.util.Objects;
import javax.inject.Inject;
import o.TitleBarRightButtonView;
import o.b;

public class setTemplateVersion extends setMinProgress implements onNotifyCharacteristicValue {
    private final getTemplateVersion mapper;
    private final getExtObj userProfileInfoEntityDataFactory;

    @Inject
    public setTemplateVersion(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, getExtObj getextobj, getTemplateVersion gettemplateversion, getAppLaunchParams getapplaunchparams) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.userProfileInfoEntityDataFactory = getextobj;
        this.mapper = gettemplateversion;
    }

    public TitleBarRightButtonView.AnonymousClass1<onWriteValue> updateUserProfileInfo(String str) {
        TitleBarRightButtonView.AnonymousClass1<getTabBarObject> authenticatedRequest = authenticatedRequest(createUserProfileInfo().updateUserProfileInfo(AccountEntityRepository.UpdateType.AVATAR, str));
        getTemplateVersion gettemplateversion = this.mapper;
        Objects.requireNonNull(gettemplateversion);
        return authenticatedRequest.map(new setTemplateId(gettemplateversion));
    }

    public TitleBarRightButtonView.AnonymousClass1<onWriteValue> updateNicknameProfile(String str) {
        TitleBarRightButtonView.AnonymousClass1<getTabBarObject> updateUserProfileInfo = createUserProfileInfo().updateUserProfileInfo("nickname", str);
        getTemplateVersion gettemplateversion = this.mapper;
        Objects.requireNonNull(gettemplateversion);
        return authenticatedRequest(updateUserProfileInfo.map(new setTemplateId(gettemplateversion)));
    }

    private setExtModel createUserProfileInfo() {
        return this.userProfileInfoEntityDataFactory.createData("network");
    }
}
