package o;

import java.util.Map;
import o.IPostMessageService;

final class addSystemView implements IPostMessageService.Default {
    private final getCurrentContentInsetEnd setMax;

    public addSystemView(getCurrentContentInsetEnd getcurrentcontentinsetend) {
        this.setMax = getcurrentcontentinsetend;
    }

    public final void onActivityResult(Object obj) {
        getCurrentContentInsetEnd.length(this.setMax, (Map) obj);
    }
}
