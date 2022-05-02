package o;

import java.util.ArrayList;

final class SupportSQLiteQuery implements Runnable {
    private final ArrayList getMin;
    private final InitializationProvider setMax;

    public SupportSQLiteQuery(InitializationProvider initializationProvider, ArrayList arrayList) {
        this.setMax = initializationProvider;
        this.getMin = arrayList;
    }

    public final void run() {
        InitializationProvider.length(this.setMax, this.getMin);
    }
}
