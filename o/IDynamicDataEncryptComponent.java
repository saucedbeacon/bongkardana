package o;

import androidx.annotation.NonNull;
import io.split.android.client.SplitFilter;
import io.split.android.client.validators.SplitValidator;
import java.util.ArrayList;
import java.util.List;

public class IDynamicDataEncryptComponent {
    private final List<SplitFilter> mFilters;

    private IDynamicDataEncryptComponent(List<SplitFilter> list) {
        this.mFilters = list;
    }

    public List<SplitFilter> getFilters() {
        return this.mFilters;
    }

    public static setMax builder() {
        return new setMax();
    }

    public static class setMax {
        private List<SplitFilter> mBuilderFilters = new ArrayList();
        private final SplitValidator mSplitValidator = new StatusBarUtil();

        public IDynamicDataEncryptComponent build() {
            ArrayList arrayList = new ArrayList();
            for (SplitFilter next : this.mBuilderFilters) {
                List<String> values = next.getValues();
                ArrayList arrayList2 = new ArrayList();
                for (String next2 : values) {
                    if (this.mSplitValidator.validateName(next2) != null) {
                        createLoadingDialog.w(String.format("Warning: Malformed %s value. Filter ignored: %s", new Object[]{next.getType().toString(), next2}));
                    } else {
                        arrayList2.add(next2);
                    }
                }
                if (arrayList2.size() > 0) {
                    arrayList.add(new SplitFilter(next.getType(), arrayList2));
                }
            }
            return new IDynamicDataEncryptComponent(arrayList);
        }

        public setMax addSplitFilter(@NonNull SplitFilter splitFilter) {
            if (splitFilter != null) {
                this.mBuilderFilters.add(splitFilter);
                return this;
            }
            throw new IllegalArgumentException("Filter can't be null");
        }
    }
}
