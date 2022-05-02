package o;

import com.google.android.datatransport.cct.CctTransportBackend;
import com.google.android.datatransport.runtime.retries.Function;

public final class requireContext implements Function {
    private final CctTransportBackend getMax;

    public requireContext(CctTransportBackend cctTransportBackend) {
        this.getMax = cctTransportBackend;
    }

    public final Object apply(Object obj) {
        return this.getMax.doSend((CctTransportBackend.HttpRequest) obj);
    }
}
