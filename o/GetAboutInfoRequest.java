package o;

import java.util.List;
import o.GetAboutInfoResult;

final class GetAboutInfoRequest implements RedDotManager {
    private final GetAboutInfoResult.getMin setMax;

    public GetAboutInfoRequest(GetAboutInfoResult.getMin getmin) {
        this.setMax = getmin;
    }

    public final void accept(Object obj) {
        this.setMax.setMax((List) obj);
    }
}
