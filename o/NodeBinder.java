package o;

import o.b;

public final class NodeBinder implements getAdapterPosition<contains> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<b.AnonymousClass12> challengeManagerProvider;
    private final b.C0007b<JsApiStatTrackServiceImpl> otpEntityDataFactoryProvider;
    private final b.C0007b<ParamBinder> otpMapperProvider;
    private final b.C0007b<RequestBinder> otpRetryManagerProvider;
    private final b.C0007b<getLogType> processManagerProvider;

    public NodeBinder(b.C0007b<JsApiStatTrackServiceImpl> bVar, b.C0007b<DialogLayout> bVar2, b.C0007b<getLogType> bVar3, b.C0007b<b.AnonymousClass12> bVar4, b.C0007b<RequestBinder> bVar5, b.C0007b<ParamBinder> bVar6) {
        this.otpEntityDataFactoryProvider = bVar;
        this.accountEntityDataFactoryProvider = bVar2;
        this.processManagerProvider = bVar3;
        this.challengeManagerProvider = bVar4;
        this.otpRetryManagerProvider = bVar5;
        this.otpMapperProvider = bVar6;
    }

    public final contains get() {
        return newInstance(this.otpEntityDataFactoryProvider.get(), this.accountEntityDataFactoryProvider.get(), this.processManagerProvider.get(), this.challengeManagerProvider.get(), this.otpRetryManagerProvider.get(), this.otpMapperProvider.get());
    }

    public static NodeBinder create(b.C0007b<JsApiStatTrackServiceImpl> bVar, b.C0007b<DialogLayout> bVar2, b.C0007b<getLogType> bVar3, b.C0007b<b.AnonymousClass12> bVar4, b.C0007b<RequestBinder> bVar5, b.C0007b<ParamBinder> bVar6) {
        return new NodeBinder(bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }

    public static contains newInstance(JsApiStatTrackServiceImpl jsApiStatTrackServiceImpl, DialogLayout dialogLayout, getLogType getlogtype, b.AnonymousClass12 r11, RequestBinder requestBinder, ParamBinder paramBinder) {
        return new contains(jsApiStatTrackServiceImpl, dialogLayout, getlogtype, r11, requestBinder, paramBinder);
    }
}
