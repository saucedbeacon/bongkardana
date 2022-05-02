package o;

import java.util.List;
import javax.inject.Inject;
import o.AppMsgReceiver;
import o.ScanJob;
import o.TitleBarRightButtonView;

public class getH5AuthParams implements ScanJob.AnonymousClass1 {
    onCallBack configEntityDataFactory;

    @Inject
    public getH5AuthParams(onCallBack oncallback) {
        this.configEntityDataFactory = oncallback;
    }

    private AppMsgReceiver.AnonymousClass2 createConfigEntityData() {
        return this.configEntityDataFactory.createData("network");
    }

    public TitleBarRightButtonView.AnonymousClass1<List<String>> getSocialMediaCategoryShare() {
        return createConfigEntityData().getSocialMediaCategoryShare();
    }
}
