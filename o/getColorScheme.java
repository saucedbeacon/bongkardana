package o;

import android.content.Context;
import java.util.List;
import o.TitleBarRightButtonView;

public class getColorScheme extends setRepeatCount<ColorSchemeType> implements getStatusBarHeight {
    public getColorScheme(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
    }

    public Class<ColorSchemeType> getFacadeClass() {
        return ColorSchemeType.class;
    }

    public TitleBarRightButtonView.AnonymousClass1<createTitleBar> getUniPaymentResult(List<String> list, String str, String str2) {
        createPageContainer createpagecontainer = new createPageContainer(list, str, str2);
        createpagecontainer.envInfo = generateMobileEnvInfo();
        return wrapper(new ThemeUtils(createpagecontainer));
    }
}
