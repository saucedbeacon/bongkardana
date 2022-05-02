package o;

import java.util.List;
import java.util.concurrent.Callable;
import o.TitleBarRightButtonView;

public interface ExtensionInvoker {

    final class InvokeCallback implements Callable {
        private final invokeWithTargetExtensions getMax;
        private final int length;
        private final String setMin;

        public InvokeCallback(invokeWithTargetExtensions invokewithtargetextensions, String str, int i) {
            this.getMax = invokewithtargetextensions;
            this.setMin = str;
            this.length = i;
        }

        public final Object call() {
            return this.getMax.lambda$getRecentBank$3(this.setMin, this.length);
        }
    }

    final class InvokeResult implements Callable {
        private final invokeWithTargetExtensions length;
        private final List setMin;

        public InvokeResult(invokeWithTargetExtensions invokewithtargetextensions, List list) {
            this.length = invokewithtargetextensions;
            this.setMin = list;
        }

        public final Object call() {
            return this.length.lambda$saveRecentBank$1(this.setMin);
        }
    }

    void clearAll();

    TitleBarRightButtonView.AnonymousClass1<List<InvokeException>> getOldRecentBank();

    TitleBarRightButtonView.AnonymousClass1<List<RemoteNormalExtensionInvoker>> getRecentBank();

    TitleBarRightButtonView.AnonymousClass1<List<RemoteNormalExtensionInvoker>> getRecentBank(String str, int i);

    TitleBarRightButtonView.AnonymousClass1<List<RemoteNormalExtensionInvoker>> removeAndUpdateRecentBank(String str, int i, RemoteNormalExtensionInvoker remoteNormalExtensionInvoker);

    TitleBarRightButtonView.AnonymousClass1<Long[]> saveRecentBank(List<RemoteNormalExtensionInvoker> list);

    TitleBarRightButtonView.AnonymousClass1<Long> saveRecentBank(RemoteNormalExtensionInvoker remoteNormalExtensionInvoker);
}
