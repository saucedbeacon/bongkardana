package o;

import o.b;

public final class ServiceBeanManager implements getAdapterPosition<retryLocalCall> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<UniformIpcUtils> favoriteServicesPreferenceProvider;

    public ServiceBeanManager(b.C0007b<UniformIpcUtils> bVar, b.C0007b<DialogLayout> bVar2) {
        this.favoriteServicesPreferenceProvider = bVar;
        this.accountEntityDataFactoryProvider = bVar2;
    }

    public final retryLocalCall get() {
        return newInstance(this.favoriteServicesPreferenceProvider.get(), this.accountEntityDataFactoryProvider.get());
    }

    public static ServiceBeanManager create(b.C0007b<UniformIpcUtils> bVar, b.C0007b<DialogLayout> bVar2) {
        return new ServiceBeanManager(bVar, bVar2);
    }

    public static retryLocalCall newInstance(UniformIpcUtils uniformIpcUtils, DialogLayout dialogLayout) {
        return new retryLocalCall(uniformIpcUtils, dialogLayout);
    }
}
