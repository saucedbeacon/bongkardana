package o;

import com.j256.ormlite.stmt.query.SimpleComparison;
import io.split.android.client.SplitFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class getSecurityBodyComp {
    private static final int MAX_BY_NAME_VALUES = 400;
    private static final int MAX_BY_PREFIX_VALUES = 50;
    private final getUMIDComp mFilterGrouper = new getUMIDComp();
    private final List<SplitFilter> mFilters = new ArrayList();

    static class length implements Comparator<SplitFilter> {
        private length() {
        }

        public final int compare(SplitFilter splitFilter, SplitFilter splitFilter2) {
            return splitFilter.getType().compareTo(splitFilter2.getType());
        }
    }

    public getSecurityBodyComp addFilters(List<SplitFilter> list) {
        this.mFilters.addAll(list);
        return this;
    }

    public String build() {
        if (this.mFilters.size() == 0) {
            return "";
        }
        showTipToast showtiptoast = new showTipToast();
        StringBuilder sb = new StringBuilder("");
        ArrayList<SplitFilter> arrayList = new ArrayList<>(this.mFilterGrouper.group(this.mFilters));
        Collections.sort(arrayList, new length());
        for (SplitFilter splitFilter : arrayList) {
            SplitFilter.Type type = splitFilter.getType();
            TreeSet treeSet = new TreeSet(splitFilter.getValues());
            if (treeSet.size() < splitFilter.getValues().size()) {
                StringBuilder sb2 = new StringBuilder("Warning: Some duplicated values for ");
                sb2.append(type.toString());
                sb2.append(" filter  were removed.");
                createLoadingDialog.w(sb2.toString());
            }
            if (treeSet.size() != 0) {
                validateFilterSize(type, treeSet.size());
                sb.append("&");
                sb.append(type.queryStringField());
                sb.append(SimpleComparison.EQUAL_TO_OPERATION);
                sb.append(showtiptoast.join(",", (Iterable<String>) treeSet));
            }
        }
        return sb.toString();
    }

    private void validateFilterSize(SplitFilter.Type type, int i) {
        if (i > type.maxValuesCount()) {
            StringBuilder sb = new StringBuilder("Error: ");
            sb.append(type.maxValuesCount());
            sb.append(" different split ");
            sb.append(type.queryStringField());
            sb.append(" can be specified at most. You passed ");
            sb.append(i);
            sb.append(". Please consider reducing the amount or using prefixes to target specific groups of splits.");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
