package o;

import id.dana.di.modules.RecipientHomeModule;
import o.b;
import o.getModifiedTime;

public final class GriverACMenuExtension implements getAdapterPosition<getModifiedTime.getMin> {
    private final b.C0007b<setRightText> getMin;
    private final RecipientHomeModule setMin;

    private GriverACMenuExtension(RecipientHomeModule recipientHomeModule, b.C0007b<setRightText> bVar) {
        this.setMin = recipientHomeModule;
        this.getMin = bVar;
    }

    public static GriverACMenuExtension setMax(RecipientHomeModule recipientHomeModule, b.C0007b<setRightText> bVar) {
        return new GriverACMenuExtension(recipientHomeModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getModifiedTime.getMin max = this.setMin.setMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
