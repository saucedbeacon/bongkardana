package o;

import java.util.ArrayList;

final class SupportSQLiteOpenHelper implements Runnable {
    private final InitializationProvider length;
    private final ArrayList setMax;

    final class Configuration implements Runnable {
        private final InitializationProvider length;
        private final ArrayList setMax;

        public Configuration(InitializationProvider initializationProvider, ArrayList arrayList) {
            this.length = initializationProvider;
            this.setMax = arrayList;
        }

        public final void run() {
            InitializationProvider.getMax(this.length, this.setMax);
        }
    }

    public SupportSQLiteOpenHelper(InitializationProvider initializationProvider, ArrayList arrayList) {
        this.length = initializationProvider;
        this.setMax = arrayList;
    }

    public final void run() {
        InitializationProvider.setMin(this.length, this.setMax);
    }
}
