package o;

import o.CreatePromptParam;
import o.b;

public final class getReason implements getBindingAdapter<Event$1> {
    private final b.C0007b<onCallBack> configEntityDataFactoryProvider;
    private final b.C0007b<CreatePromptParam.PositiveListener> geocodeEntityRepositoryProvider;
    private final b.C0007b<incrementRef> referralEntityDataFactoryProvider;

    public getReason(b.C0007b<CreatePromptParam.PositiveListener> bVar, b.C0007b<incrementRef> bVar2, b.C0007b<onCallBack> bVar3) {
        this.geocodeEntityRepositoryProvider = bVar;
        this.referralEntityDataFactoryProvider = bVar2;
        this.configEntityDataFactoryProvider = bVar3;
    }

    public static getBindingAdapter<Event$1> create(b.C0007b<CreatePromptParam.PositiveListener> bVar, b.C0007b<incrementRef> bVar2, b.C0007b<onCallBack> bVar3) {
        return new getReason(bVar, bVar2, bVar3);
    }

    public final void injectMembers(Event$1 event$1) {
        injectInjectDataFactory(event$1, this.geocodeEntityRepositoryProvider.get(), this.referralEntityDataFactoryProvider.get(), this.configEntityDataFactoryProvider.get());
    }

    public static void injectInjectDataFactory(Event$1 event$1, CreatePromptParam.PositiveListener positiveListener, incrementRef incrementref, onCallBack oncallback) {
        event$1.injectDataFactory(positiveListener, incrementref, oncallback);
    }
}
