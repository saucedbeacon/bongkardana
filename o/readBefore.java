package o;

import dagger.Component;
import id.dana.contract.switchfaceauth.FaceAuthPopUpConsultationModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.ChangePhoneNumberH5EventModule;
import id.dana.di.modules.LogoutModule;
import id.dana.di.modules.SubMenuModule;
import id.dana.myprofile.SettingMoreProfileActivity;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {SubMenuModule.class, ChangePhoneNumberH5EventModule.class, LogoutModule.class, FaceAuthPopUpConsultationModule.class})
public interface readBefore {
    void getMin(SettingMoreProfileActivity settingMoreProfileActivity);
}
