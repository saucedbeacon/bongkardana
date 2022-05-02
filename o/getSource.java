package o;

import o.NativeCallContext;
import o.b;

public final class getSource implements getAdapterPosition<setSource> {
    private final b.C0007b<NativeCallContext.AnonymousClass1> merchantInfoPreferencesProvider;

    public getSource(b.C0007b<NativeCallContext.AnonymousClass1> bVar) {
        this.merchantInfoPreferencesProvider = bVar;
    }

    public final setSource get() {
        return newInstance(this.merchantInfoPreferencesProvider.get());
    }

    public static getSource create(b.C0007b<NativeCallContext.AnonymousClass1> bVar) {
        return new getSource(bVar);
    }

    public static setSource newInstance(NativeCallContext.AnonymousClass1 r1) {
        return new setSource(r1);
    }
}
