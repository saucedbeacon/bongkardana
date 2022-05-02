package io.split.android.client;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

public class SplitFilter {
    private final Type mType;
    private final List<String> mValues;

    /* renamed from: io.split.android.client.SplitFilter$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
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
            throw new UnsupportedOperationException("Method not decompiled: io.split.android.client.SplitFilter.AnonymousClass4.<clinit>():void");
        }
    }

    public enum Type {
        BY_NAME,
        BY_PREFIX;

        public final String toString() {
            int i = AnonymousClass4.$SwitchMap$io$split$android$client$SplitFilter$Type[ordinal()];
            if (i != 1) {
                return i != 2 ? "Invalid type" : "by split prefix";
            }
            return "by split name";
        }

        public final String queryStringField() {
            int i = AnonymousClass4.$SwitchMap$io$split$android$client$SplitFilter$Type[ordinal()];
            if (i != 1) {
                return i != 2 ? "unknown" : "prefixes";
            }
            return "names";
        }

        public final int maxValuesCount() {
            int i = AnonymousClass4.$SwitchMap$io$split$android$client$SplitFilter$Type[ordinal()];
            if (i != 1) {
                return i != 2 ? 0 : 50;
            }
            return 400;
        }
    }

    public static SplitFilter byName(@NonNull List<String> list) {
        return new SplitFilter(Type.BY_NAME, list);
    }

    public static SplitFilter byPrefix(@NonNull List<String> list) {
        return new SplitFilter(Type.BY_PREFIX, list);
    }

    public SplitFilter(Type type, List<String> list) {
        if (list != null) {
            this.mType = type;
            this.mValues = new ArrayList(list);
            return;
        }
        StringBuilder sb = new StringBuilder("Values can't be null for ");
        sb.append(type.toString());
        sb.append(" filter");
        throw new IllegalArgumentException(sb.toString());
    }

    public Type getType() {
        return this.mType;
    }

    public List<String> getValues() {
        return this.mValues;
    }

    public void updateValues(List<String> list) {
        this.mValues.clear();
        this.mValues.addAll(list);
    }
}
