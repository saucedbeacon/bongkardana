package o;

import id.dana.contract.account.FirstTimeModule;
import o.b;
import o.setProgressBackgroundColorSchemeResource;

public final class setProgressBackgroundColor implements getAdapterPosition<setProgressBackgroundColorSchemeResource.setMax> {
    private final FirstTimeModule getMin;
    private final b.C0007b<setDistanceToTriggerSync> length;

    private setProgressBackgroundColor(FirstTimeModule firstTimeModule, b.C0007b<setDistanceToTriggerSync> bVar) {
        this.getMin = firstTimeModule;
        this.length = bVar;
    }

    public static setProgressBackgroundColor length(FirstTimeModule firstTimeModule, b.C0007b<setDistanceToTriggerSync> bVar) {
        return new setProgressBackgroundColor(firstTimeModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setProgressBackgroundColorSchemeResource.setMax length2 = this.getMin.length(this.length.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
