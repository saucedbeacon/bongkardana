package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.danah5.locationpicker.MiniProgramLocationPickerActivity;
import o.b;

public final class invalidateBackgroundColorAndRadius implements getBindingAdapter<MiniProgramLocationPickerActivity> {
    private final b.C0007b<AppLifeCycleObserver> appLifeCycleObserverProvider;
    private final b.C0007b<ConnectionStatusReceiver> connectionStatusReceiverProvider;
    private final b.C0007b<GriverDefaultLoadingView> mapHelperProvider;
    private final b.C0007b<updateText> presenterProvider;

    public invalidateBackgroundColorAndRadius(b.C0007b<AppLifeCycleObserver> bVar, b.C0007b<ConnectionStatusReceiver> bVar2, b.C0007b<updateText> bVar3, b.C0007b<GriverDefaultLoadingView> bVar4) {
        this.appLifeCycleObserverProvider = bVar;
        this.connectionStatusReceiverProvider = bVar2;
        this.presenterProvider = bVar3;
        this.mapHelperProvider = bVar4;
    }

    public static getBindingAdapter<MiniProgramLocationPickerActivity> create(b.C0007b<AppLifeCycleObserver> bVar, b.C0007b<ConnectionStatusReceiver> bVar2, b.C0007b<updateText> bVar3, b.C0007b<GriverDefaultLoadingView> bVar4) {
        return new invalidateBackgroundColorAndRadius(bVar, bVar2, bVar3, bVar4);
    }

    public final void injectMembers(MiniProgramLocationPickerActivity miniProgramLocationPickerActivity) {
        matchInfo.setMin(miniProgramLocationPickerActivity, this.appLifeCycleObserverProvider.get());
        matchInfo.length(miniProgramLocationPickerActivity, this.connectionStatusReceiverProvider.get());
        injectPresenter(miniProgramLocationPickerActivity, this.presenterProvider.get());
        injectMapHelper(miniProgramLocationPickerActivity, this.mapHelperProvider.get());
    }

    @InjectedFieldSignature("id.dana.danah5.locationpicker.MiniProgramLocationPickerActivity.presenter")
    public static void injectPresenter(MiniProgramLocationPickerActivity miniProgramLocationPickerActivity, updateText updatetext) {
        miniProgramLocationPickerActivity.presenter = updatetext;
    }

    @InjectedFieldSignature("id.dana.danah5.locationpicker.MiniProgramLocationPickerActivity.mapHelper")
    public static void injectMapHelper(MiniProgramLocationPickerActivity miniProgramLocationPickerActivity, GriverDefaultLoadingView griverDefaultLoadingView) {
        miniProgramLocationPickerActivity.mapHelper = griverDefaultLoadingView;
    }
}
