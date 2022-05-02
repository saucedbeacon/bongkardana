package o;

import o.GriverAmcsLiteConfig;
import o.PopManager;
import o.b;

public final class ItemCategory implements getAdapterPosition<PopManager.AnonymousClass1> {
    private final b.C0007b<NetworkBridgeExtension> getMax;
    private final b.C0007b<PopManager.length> length;
    private final b.C0007b<getGriverSectionConfig> setMin;

    private ItemCategory(b.C0007b<PopManager.length> bVar, b.C0007b<getGriverSectionConfig> bVar2, b.C0007b<NetworkBridgeExtension> bVar3) {
        this.length = bVar;
        this.setMin = bVar2;
        this.getMax = bVar3;
    }

    public static ItemCategory setMin(b.C0007b<PopManager.length> bVar, b.C0007b<getGriverSectionConfig> bVar2, b.C0007b<NetworkBridgeExtension> bVar3) {
        return new ItemCategory(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new PopManager.getMax(this.length.get(), this.setMin.get(), this.getMax.get()) {
            /* access modifiers changed from: private */
            public final length getMax;
            private final getGriverSectionConfig length;
            /* access modifiers changed from: private */
            public final NetworkBridgeExtension setMin;

            {
                this.getMax = r1;
                this.length = r2;
                this.setMin = r3;
            }

            public final void setMin() {
                this.length.execute(new GriverAppVirtualHostProxy<GriverAmcsLiteConfig.AnonymousClass2>() {
                    public final /* synthetic */ void onNext(Object obj) {
                        AnonymousClass1.this.getMax.onFinishGetHomeInfo(AnonymousClass1.this.setMin.length((GriverAmcsLiteConfig.AnonymousClass2) obj));
                    }
                });
            }

            public final void setMax() {
                this.length.dispose();
            }
        };
    }
}
