package o;

import java.util.List;
import o.TitleBarRightButtonView;

final class ScheduleExtensionInvoker implements RedDotDrawable {
    public static final ScheduleExtensionInvoker setMin = new ScheduleExtensionInvoker();

    /* renamed from: o.ScheduleExtensionInvoker$3  reason: invalid class name */
    public interface AnonymousClass3 {
        void clearAll();

        TitleBarRightButtonView.AnonymousClass1<List<String>> getDanaUserContact();

        TitleBarRightButtonView.AnonymousClass1<List<NodeAware>> getRecentContact();

        TitleBarRightButtonView.AnonymousClass1<List<NodeAware>> getRecentContact(int i);

        TitleBarRightButtonView.AnonymousClass1<Long> saveDanaUserContact(DataNode dataNode);

        TitleBarRightButtonView.AnonymousClass1<Long> saveRecentContact(NodeAware nodeAware);
    }

    public final Object apply(Object obj) {
        return ResolveExtensionInvoker.lambda$saveDanaUserContact$1((Long) obj);
    }
}
