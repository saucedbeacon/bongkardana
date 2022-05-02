package o;

import o.b;

public final class toggleDebugPanel implements getAdapterPosition<initConsoleView> {
    private final b.C0007b<permit> mockMerchantManagementEntityDataProvider;
    private final b.C0007b<getPoint> networkMerchantManagementEntityDataProvider;

    public toggleDebugPanel(b.C0007b<getPoint> bVar, b.C0007b<permit> bVar2) {
        this.networkMerchantManagementEntityDataProvider = bVar;
        this.mockMerchantManagementEntityDataProvider = bVar2;
    }

    public final initConsoleView get() {
        return newInstance(this.networkMerchantManagementEntityDataProvider.get(), this.mockMerchantManagementEntityDataProvider.get());
    }

    public static toggleDebugPanel create(b.C0007b<getPoint> bVar, b.C0007b<permit> bVar2) {
        return new toggleDebugPanel(bVar, bVar2);
    }

    public static initConsoleView newInstance(getPoint getpoint, permit permit) {
        return new initConsoleView(getpoint, permit);
    }
}
