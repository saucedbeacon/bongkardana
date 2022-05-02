package androidx.browser.trusted;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;
import o.MediaControllerCompat$Callback$StubCompat;

public class TrustedWebActivityServiceConnection$1 extends ITrustedWebActivityCallback.Stub {
    final /* synthetic */ MediaControllerCompat$Callback$StubCompat val$callback;

    public void onExtraCallback(String str, Bundle bundle) throws RemoteException {
    }

    TrustedWebActivityServiceConnection$1(MediaControllerCompat$Callback$StubCompat mediaControllerCompat$Callback$StubCompat) {
        this.val$callback = mediaControllerCompat$Callback$StubCompat;
    }
}
