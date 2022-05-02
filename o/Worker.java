package o;

import java.util.List;
import o.b;
import o.getWorkerFactory;

public final class Worker implements getAdapterPosition<doWork> {
    private final b.C0007b<setGriverAppStorageProxy> setMax;
    private final b.C0007b<getWorkerFactory.length> setMin;

    final class WorkerReadyListener implements RedDotDrawable {
        private final List setMax;

        public WorkerReadyListener(List list) {
            this.setMax = list;
        }

        public final Object apply(Object obj) {
            return setTargetExtension.lambda$removeMerchantInfoFoundInCache$11(this.setMax, (EngineInitCallback) obj);
        }
    }

    private Worker(b.C0007b<getWorkerFactory.length> bVar, b.C0007b<setGriverAppStorageProxy> bVar2) {
        this.setMin = bVar;
        this.setMax = bVar2;
    }

    public static Worker length(b.C0007b<getWorkerFactory.length> bVar, b.C0007b<setGriverAppStorageProxy> bVar2) {
        return new Worker(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new doWork(this.setMin.get(), this.setMax.get());
    }
}
