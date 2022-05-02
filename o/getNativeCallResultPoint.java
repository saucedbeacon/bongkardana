package o;

import o.b;

public final class getNativeCallResultPoint implements getAdapterPosition<BaseRenderBridgeImpl> {
    private final b.C0007b<EventSendInterceptorPoint> configBankAccountResultMapperProvider;
    private final b.C0007b<doCheckPermission> configOpenBankAccountDataFactoryProvider;

    public getNativeCallResultPoint(b.C0007b<doCheckPermission> bVar, b.C0007b<EventSendInterceptorPoint> bVar2) {
        this.configOpenBankAccountDataFactoryProvider = bVar;
        this.configBankAccountResultMapperProvider = bVar2;
    }

    public final BaseRenderBridgeImpl get() {
        return newInstance(this.configOpenBankAccountDataFactoryProvider.get(), this.configBankAccountResultMapperProvider.get());
    }

    public static getNativeCallResultPoint create(b.C0007b<doCheckPermission> bVar, b.C0007b<EventSendInterceptorPoint> bVar2) {
        return new getNativeCallResultPoint(bVar, bVar2);
    }

    public static BaseRenderBridgeImpl newInstance(doCheckPermission docheckpermission, EventSendInterceptorPoint eventSendInterceptorPoint) {
        return new BaseRenderBridgeImpl(docheckpermission, eventSendInterceptorPoint);
    }
}
