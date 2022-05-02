package o;

import android.content.Context;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class setRequestBeginTime extends setRepeatCount<setRequestEndTime> implements setBeginTime {
    @Inject
    public setRequestBeginTime(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
    }

    public Class<setRequestEndTime> getFacadeClass() {
        return setRequestEndTime.class;
    }

    public TitleBarRightButtonView.AnonymousClass1<setInstallTime> getVerifyToken(String str, String str2) {
        getInstallTime getinstalltime = new getInstallTime();
        getinstalltime.setTokenScene(str);
        getinstalltime.setPhoneNumber(str2);
        getinstalltime.envInfo = generateMobileEnvInfo();
        return wrapper(new getRequestEndTime(getinstalltime));
    }
}
