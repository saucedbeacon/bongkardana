package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.AppMsgReceiver;

@Singleton
public class onFinish extends uncheckItems<AppMsgReceiver.AnonymousClass2> {
    private final handleMessage amcsConfigEntityData;

    @Inject
    public onFinish(handleMessage handlemessage) {
        this.amcsConfigEntityData = handlemessage;
    }

    public AppMsgReceiver.AnonymousClass2 createData(String str) {
        return this.amcsConfigEntityData;
    }
}
