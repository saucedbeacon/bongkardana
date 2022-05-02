package o;

import id.dana.di.modules.AddOutletReceiverModule;
import o.ImageInfoBridgeExtension;
import o.b;

public final class TypeReference implements getAdapterPosition<ImageInfoBridgeExtension.AnonymousClass1.setMin> {
    private final b.C0007b<trimFilePath> getMax;
    private final AddOutletReceiverModule setMax;

    private TypeReference(AddOutletReceiverModule addOutletReceiverModule, b.C0007b<trimFilePath> bVar) {
        this.setMax = addOutletReceiverModule;
        this.getMax = bVar;
    }

    public static TypeReference getMin(AddOutletReceiverModule addOutletReceiverModule, b.C0007b<trimFilePath> bVar) {
        return new TypeReference(addOutletReceiverModule, bVar);
    }

    public final /* synthetic */ Object get() {
        ImageInfoBridgeExtension.AnonymousClass1.setMin max = this.setMax.setMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
