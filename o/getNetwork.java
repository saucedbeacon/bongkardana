package o;

import kotlin.jvm.functions.Function1;

final class getNetwork implements Function1 {
    private final getTags setMax;

    public getNetwork(getTags gettags) {
        this.setMax = gettags;
    }

    public final Object invoke(Object obj) {
        return getTags.setMin(this.setMax, (GriverRVResourceManagerImpl) obj);
    }
}
