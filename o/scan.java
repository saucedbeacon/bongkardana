package o;

import o.OpenAPIBridgeExtension;
import o.b;

public final class scan implements getAdapterPosition<BluetoothManifest> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<OpenAPIBridgeExtension.AnonymousClass1.C00041> referralConfigRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public scan(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<OpenAPIBridgeExtension.AnonymousClass1.C00041> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.referralConfigRepositoryProvider = bVar3;
    }

    public final BluetoothManifest get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.referralConfigRepositoryProvider.get());
    }

    public static scan create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<OpenAPIBridgeExtension.AnonymousClass1.C00041> bVar3) {
        return new scan(bVar, bVar2, bVar3);
    }

    public static BluetoothManifest newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, OpenAPIBridgeExtension.AnonymousClass1.C00041 r3) {
        return new BluetoothManifest(appxloadfailed, getscheme, r3);
    }
}
