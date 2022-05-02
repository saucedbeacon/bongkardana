package io.split.android.client.impressions;

import java.util.List;
import o.dynamicDecryptDDp;

public interface ImpressionListener {
    void close();

    void log(dynamicDecryptDDp dynamicdecryptddp);

    public static final class setMax implements ImpressionListener {
        private List<ImpressionListener> _delegates;

        public setMax(List<ImpressionListener> list) {
            this._delegates = list;
        }

        public final void log(dynamicDecryptDDp dynamicdecryptddp) {
            for (ImpressionListener log : this._delegates) {
                log.log(dynamicdecryptddp);
            }
        }

        public final void close() {
            for (ImpressionListener close : this._delegates) {
                close.close();
            }
        }
    }
}
