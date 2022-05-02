package o;

import android.app.Application;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class RVJSApiHandlerProxy extends uncheckItems<getSyncTimeout> {
    private final Application application;
    private getSyncTimeout paymentEntityData;
    private final RVJsStatTrackService paymentModelMapper;

    @Inject
    public RVJSApiHandlerProxy(Application application2, RVJsStatTrackService rVJsStatTrackService) {
        this.application = application2;
        this.paymentModelMapper = rVJsStatTrackService;
    }

    public getSyncTimeout createData(String str) {
        if (this.paymentEntityData == null) {
            this.paymentEntityData = new getStream(this.application, this.paymentModelMapper);
        }
        return this.paymentEntityData;
    }
}
