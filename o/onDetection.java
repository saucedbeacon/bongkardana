package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.base.Preconditions;
import io.split.android.client.SplitFilter;
import io.split.android.client.dtos.Split;
import io.split.android.client.service.executor.SplitTask;
import io.split.android.client.service.executor.SplitTaskType;
import io.split.android.client.storage.splits.PersistentSplitsStorage;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class onDetection implements SplitTask {
    private static final String PREFIX_SEPARATOR = "__";
    private final List<SplitFilter> mSplitsFilter;
    private final String mSplitsFilterQueryString;
    private final PersistentSplitsStorage mSplitsStorage;

    private String sanitizeString(String str) {
        return str != null ? str : "";
    }

    public onDetection(@NonNull PersistentSplitsStorage persistentSplitsStorage, @NonNull List<SplitFilter> list, @Nullable String str) {
        this.mSplitsStorage = (PersistentSplitsStorage) Preconditions.checkNotNull(persistentSplitsStorage);
        this.mSplitsFilter = (List) Preconditions.checkNotNull(list);
        this.mSplitsFilterQueryString = str;
    }

    @NonNull
    public loadLibrarySync execute() {
        if (!queryStringHasChanged()) {
            return loadLibrarySync.success(SplitTaskType.FILTER_SPLITS_CACHE);
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (SplitFilter next : this.mSplitsFilter) {
            int i = AnonymousClass1.$SwitchMap$io$split$android$client$SplitFilter$Type[next.getType().ordinal()];
            if (i == 1) {
                hashSet.addAll(next.getValues());
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder("Unknown filter type");
                sb.append(next.getType().toString());
                createLoadingDialog.e(sb.toString());
            } else {
                hashSet2.addAll(next.getValues());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Split next2 : this.mSplitsStorage.getAll()) {
            String str = next2.name;
            String prefix = getPrefix(str);
            if (!hashSet.contains(next2.name) && (prefix == null || !hashSet2.contains(prefix))) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() > 0) {
            this.mSplitsStorage.delete(arrayList);
        }
        return loadLibrarySync.success(SplitTaskType.FILTER_SPLITS_CACHE);
    }

    /* renamed from: o.onDetection$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$split$android$client$SplitFilter$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.split.android.client.SplitFilter$Type[] r0 = io.split.android.client.SplitFilter.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$split$android$client$SplitFilter$Type = r0
                io.split.android.client.SplitFilter$Type r1 = io.split.android.client.SplitFilter.Type.BY_NAME     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$split$android$client$SplitFilter$Type     // Catch:{ NoSuchFieldError -> 0x001d }
                io.split.android.client.SplitFilter$Type r1 = io.split.android.client.SplitFilter.Type.BY_PREFIX     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onDetection.AnonymousClass1.<clinit>():void");
        }
    }

    private String getPrefix(String str) {
        int indexOf = str.indexOf("__");
        if (indexOf <= 0) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    private boolean queryStringHasChanged() {
        return !sanitizeString(this.mSplitsStorage.getFilterQueryString()).equals(sanitizeString(this.mSplitsFilterQueryString));
    }
}
