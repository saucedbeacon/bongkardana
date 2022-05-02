package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.danah5.share.ShareBridge;
import id.dana.data.risk.riskevent.sharetextbroadcast.ShareTextBroadcastReceiver;
import o.b;

public final class getCheckBoxPrompt implements getBindingAdapter<ShareBridge> {
    private final b.C0007b<ShareTextBroadcastReceiver> shareTextBroadcastReceiverProvider;

    public getCheckBoxPrompt(b.C0007b<ShareTextBroadcastReceiver> bVar) {
        this.shareTextBroadcastReceiverProvider = bVar;
    }

    public static getBindingAdapter<ShareBridge> create(b.C0007b<ShareTextBroadcastReceiver> bVar) {
        return new getCheckBoxPrompt(bVar);
    }

    public final void injectMembers(ShareBridge shareBridge) {
        injectShareTextBroadcastReceiver(shareBridge, this.shareTextBroadcastReceiverProvider.get());
    }

    @InjectedFieldSignature("id.dana.danah5.share.ShareBridge.shareTextBroadcastReceiver")
    public static void injectShareTextBroadcastReceiver(ShareBridge shareBridge, ShareTextBroadcastReceiver shareTextBroadcastReceiver) {
        shareBridge.shareTextBroadcastReceiver = shareTextBroadcastReceiver;
    }
}
