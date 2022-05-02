package o;

import java.util.List;
import o.TitleBarRightButtonView;

public interface onConnectClosed {
    void clearAll();

    TitleBarRightButtonView.AnonymousClass1<List<RemoteDebugUtils>> getRecentPayers(int i);

    TitleBarRightButtonView.AnonymousClass1<List<Long>> saveRecentPayers(List<RemoteDebugUtils> list);
}
