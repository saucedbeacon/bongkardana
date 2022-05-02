package o;

import io.split.android.client.SplitFilter;
import java.util.ArrayList;
import java.util.List;

public final class getLocation {
    final IDynamicDataEncryptComponent setMax;

    /* synthetic */ getLocation(IDynamicDataEncryptComponent iDynamicDataEncryptComponent, byte b) {
        this(iDynamicDataEncryptComponent);
    }

    private getLocation(IDynamicDataEncryptComponent iDynamicDataEncryptComponent) {
        this.setMax = iDynamicDataEncryptComponent;
    }

    public static class getMin {
        private final List<SplitFilter> getMax = new ArrayList();

        public final getLocation getMax() {
            for (SplitFilter addSplitFilter : this.getMax) {
                IDynamicDataEncryptComponent.builder().addSplitFilter(addSplitFilter);
            }
            return new getLocation(IDynamicDataEncryptComponent.builder().build(), (byte) 0);
        }
    }
}
