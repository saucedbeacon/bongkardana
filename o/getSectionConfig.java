package o;

import id.dana.di.modules.PromoCenterModule;
import o.b;
import o.execute;

public final class getSectionConfig implements getAdapterPosition<execute.getMin> {
    private final b.C0007b<getTags> getMin;
    private final PromoCenterModule setMin;

    public static execute.getMin getMin(PromoCenterModule promoCenterModule, getTags gettags) {
        execute.getMin length = promoCenterModule.length(gettags);
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        execute.getMin length = this.setMin.length(this.getMin.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
