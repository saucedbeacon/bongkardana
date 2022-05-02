package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.IMtopProxy;
import o.TitleBarRightButtonView;

@Singleton
public class requestInnerSync implements onFormResubmission {
    private final requestAsync featureNonAMCSEntityDataFactory;

    @Inject
    public requestInnerSync(requestAsync requestasync) {
        this.featureNonAMCSEntityDataFactory = requestasync;
    }

    private IMtopProxy.Callback createFeatureNonAmcs() {
        return this.featureNonAMCSEntityDataFactory.createData("local");
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureNonAMCS(String str) {
        return createFeatureNonAmcs().isFeatureNonAMCS(str);
    }
}
