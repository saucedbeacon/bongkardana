package o;

import kotlin.jvm.functions.Function1;
import o.FalconFacade;

final class PathToLocalUtil implements Function1 {
    private final FalconFacade.FalconInterface setMax;

    public PathToLocalUtil(FalconFacade.FalconInterface falconInterface) {
        this.setMax = falconInterface;
    }

    public final Object invoke(Object obj) {
        return this.setMax.values.setMax();
    }
}
