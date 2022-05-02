package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.rewind;
import o.setCaptioningEnabled;

public class CustomTabsClient$2 extends ICustomTabsCallback.Stub {
    private Handler getMax = new Handler(Looper.getMainLooper());
    final /* synthetic */ rewind this$0;
    final /* synthetic */ setCaptioningEnabled val$callback;

    CustomTabsClient$2(rewind rewind, setCaptioningEnabled setcaptioningenabled) {
        this.this$0 = rewind;
        this.val$callback = setcaptioningenabled;
    }

    public void onNavigationEvent(final int i, final Bundle bundle) {
        if (this.val$callback != null) {
            this.getMax.post(new Runnable() {
                public final void run() {
                    CustomTabsClient$2.this.val$callback.setMin(i, bundle);
                }
            });
        }
    }

    public void extraCallback(final String str, final Bundle bundle) throws RemoteException {
        if (this.val$callback != null) {
            this.getMax.post(new Runnable() {
                public final void run() {
                    CustomTabsClient$2.this.val$callback.setMin(str, bundle);
                }
            });
        }
    }

    public Bundle extraCallbackWithResult(@NonNull String str, @Nullable Bundle bundle) throws RemoteException {
        setCaptioningEnabled setcaptioningenabled = this.val$callback;
        if (setcaptioningenabled == null) {
            return null;
        }
        return setcaptioningenabled.getMin(str, bundle);
    }

    public void onMessageChannelReady(final Bundle bundle) throws RemoteException {
        if (this.val$callback != null) {
            this.getMax.post(new Runnable() {
                public final void run() {
                    CustomTabsClient$2.this.val$callback.setMin(bundle);
                }
            });
        }
    }

    public void onPostMessage(final String str, final Bundle bundle) throws RemoteException {
        if (this.val$callback != null) {
            this.getMax.post(new Runnable() {
                public final void run() {
                    CustomTabsClient$2.this.val$callback.getMax(str, bundle);
                }
            });
        }
    }

    public void onRelationshipValidationResult(int i, Uri uri, boolean z, @Nullable Bundle bundle) throws RemoteException {
        if (this.val$callback != null) {
            final int i2 = i;
            final Uri uri2 = uri;
            final boolean z2 = z;
            final Bundle bundle2 = bundle;
            this.getMax.post(new Runnable() {
                public final void run() {
                    CustomTabsClient$2.this.val$callback.getMin(i2, uri2, z2, bundle2);
                }
            });
        }
    }
}
