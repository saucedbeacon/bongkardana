package o;

public class RemoteCallClient {
    public String pubKey;

    final class IpcCallConn implements RedDotManager {
        private final ServiceBeanManagerImpl getMin;

        public IpcCallConn(ServiceBeanManagerImpl serviceBeanManagerImpl) {
            this.getMin = serviceBeanManagerImpl;
        }

        public final void accept(Object obj) {
            this.getMin.saveCategories((transSyncThreadNames) obj);
        }
    }
}
