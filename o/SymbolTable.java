package o;

import android.content.Context;
import id.dana.di.modules.ApplicationModule;
import javax.annotation.Nullable;
import o.b;

public final class SymbolTable implements getAdapterPosition<clearDetections> {
    private final b.C0007b<AppxNgRuntimeChecker> getMin;
    private final ApplicationModule setMin;

    public final class Entry implements getAdapterPosition<RecyclerView$Adapter$StateRestorationPolicy> {
        private final b.C0007b<Context> length;
        private final ApplicationModule setMin;

        private Entry(ApplicationModule applicationModule, b.C0007b<Context> bVar) {
            this.setMin = applicationModule;
            this.length = bVar;
        }

        public static Entry getMax(ApplicationModule applicationModule, b.C0007b<Context> bVar) {
            return new Entry(applicationModule, bVar);
        }

        @Nullable
        public final /* synthetic */ Object get() {
            return this.setMin.getMax(this.length.get());
        }
    }

    private SymbolTable(ApplicationModule applicationModule, b.C0007b<AppxNgRuntimeChecker> bVar) {
        this.setMin = applicationModule;
        this.getMin = bVar;
    }

    public static SymbolTable setMin(ApplicationModule applicationModule, b.C0007b<AppxNgRuntimeChecker> bVar) {
        return new SymbolTable(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        clearDetections max = this.setMin.getMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
