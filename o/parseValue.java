package o;

import id.dana.di.modules.RecipientHomeModule;
import o.getModifiedTime;

public final class parseValue implements getAdapterPosition<getModifiedTime.getMax> {
    private final RecipientHomeModule setMax;

    private parseValue(RecipientHomeModule recipientHomeModule) {
        this.setMax = recipientHomeModule;
    }

    public static parseValue setMax(RecipientHomeModule recipientHomeModule) {
        return new parseValue(recipientHomeModule);
    }

    public final /* synthetic */ Object get() {
        getModifiedTime.getMax min = this.setMax.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
