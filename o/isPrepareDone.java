package o;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class isPrepareDone extends uncheckItems<handleMessage> {
    private final handleMessage amcsConfigEntityData;

    @Inject
    public isPrepareDone(handleMessage handlemessage) {
        this.amcsConfigEntityData = handlemessage;
    }

    public handleMessage createData(String str) {
        return this.amcsConfigEntityData;
    }
}
