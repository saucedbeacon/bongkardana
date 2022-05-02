package o;

import android.content.Context;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;

@Singleton
public class addNormalState extends setRepeatCount<TabStateListDrawable> implements TabBarUtils {
    @Inject
    public addNormalState(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
    }

    public TitleBarRightButtonView.AnonymousClass1<renderView> getLazadaRegistrationUrl(String str, String str2) {
        EmbedAppContext embedAppContext = new EmbedAppContext();
        embedAppContext.setBizType(str2);
        embedAppContext.setDeviceId(str);
        embedAppContext.envInfo = generateMobileEnvInfo();
        return wrapper(new generateEmptyTopDrawable(embedAppContext));
    }

    public Class<TabStateListDrawable> getFacadeClass() {
        return TabStateListDrawable.class;
    }
}
