package o;

import java.util.Objects;
import javax.inject.Inject;
import o.BaseEmbedView;
import o.TitleBarRightButtonView;
import o.b;

public class setAppModel extends setMinProgress implements resetBugMeSettings {
    private final setReceivedRemoteReady pocketInfoDataFactory;
    private final BaseEmbedView pocketMapper;

    @Inject
    public setAppModel(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, setReceivedRemoteReady setreceivedremoteready, BaseEmbedView baseEmbedView, getAppLaunchParams getapplaunchparams) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.pocketMapper = baseEmbedView;
        this.pocketInfoDataFactory = setreceivedremoteready;
    }

    private BaseEmbedView.AnonymousClass1 createPocketEntityDataRepository() {
        return this.pocketInfoDataFactory.createData("network");
    }

    public TitleBarRightButtonView.AnonymousClass1<setBooleanConfig> getPocketNumUpdated(long j) {
        TitleBarRightButtonView.AnonymousClass1<generateStartToken> authenticatedRequest = authenticatedRequest(createPocketEntityDataRepository().getPocketNumInfoEntity(j));
        BaseEmbedView baseEmbedView = this.pocketMapper;
        Objects.requireNonNull(baseEmbedView);
        return authenticatedRequest.map(new getAppModel(baseEmbedView));
    }
}
