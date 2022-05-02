package o;

import android.content.Context;
import o.BaseEmbedView;
import o.TitleBarRightButtonView;

public final class setLastStartClientTimeStamp extends setRepeatCount<setSceneParams> implements BaseEmbedView.AnonymousClass1 {
    public setLastStartClientTimeStamp(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
    }

    public final Class<setSceneParams> getFacadeClass() {
        return setSceneParams.class;
    }

    public final TitleBarRightButtonView.AnonymousClass1<generateStartToken> getPocketNumInfoEntity(long j) {
        RVAppRecord rVAppRecord = new RVAppRecord();
        rVAppRecord.envInfo = generateMobileEnvInfo();
        rVAppRecord.setLastTimeUpdated(j);
        return wrapper(new getLastStartClientTimeStamp(rVAppRecord));
    }
}
