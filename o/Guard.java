package o;

import java.util.List;

final class Guard implements RedDotDrawable {
    public static final Guard getMin = new Guard();

    public final Object apply(Object obj) {
        return RemoteControlManagement.toRecentRecipients((List) obj);
    }
}
