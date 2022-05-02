package io.reactivex.internal.operators.flowable;

import o.RedDotManager;
import o.getFmt;

public final class FlowableInternalHelper {

    public enum RequestMax implements RedDotManager<getFmt> {
        INSTANCE;

        public final void accept(getFmt getfmt) throws Exception {
            getfmt.request(Long.MAX_VALUE);
        }
    }
}
