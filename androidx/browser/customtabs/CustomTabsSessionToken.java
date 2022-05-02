package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.setCaptioningEnabled;

public class CustomTabsSessionToken {
    @Nullable
    private final setCaptioningEnabled getMax;
    @Nullable
    final ICustomTabsCallback getMin;
    @Nullable
    private final PendingIntent setMin;

    static class MockCallback extends ICustomTabsCallback.Stub {
        public IBinder asBinder() {
            return this;
        }

        public void extraCallback(String str, Bundle bundle) {
        }

        public Bundle extraCallbackWithResult(String str, Bundle bundle) {
            return null;
        }

        public void onMessageChannelReady(Bundle bundle) {
        }

        public void onNavigationEvent(int i, Bundle bundle) {
        }

        public void onPostMessage(String str, Bundle bundle) {
        }

        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
        }

        MockCallback() {
        }
    }

    CustomTabsSessionToken(@Nullable ICustomTabsCallback iCustomTabsCallback, @Nullable PendingIntent pendingIntent) {
        AnonymousClass3 r1;
        if (iCustomTabsCallback == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.getMin = iCustomTabsCallback;
        this.setMin = pendingIntent;
        if (iCustomTabsCallback == null) {
            r1 = null;
        } else {
            r1 = new setCaptioningEnabled() {
                public final void setMin(int i, @Nullable Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.getMin.onNavigationEvent(i, bundle);
                    } catch (RemoteException unused) {
                    }
                }

                public final void setMin(@NonNull String str, @Nullable Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.getMin.extraCallback(str, bundle);
                    } catch (RemoteException unused) {
                    }
                }

                @NonNull
                public final Bundle getMin(@NonNull String str, @Nullable Bundle bundle) {
                    try {
                        return CustomTabsSessionToken.this.getMin.extraCallbackWithResult(str, bundle);
                    } catch (RemoteException unused) {
                        return null;
                    }
                }

                public final void setMin(@Nullable Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.getMin.onMessageChannelReady(bundle);
                    } catch (RemoteException unused) {
                    }
                }

                public final void getMax(@NonNull String str, @Nullable Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.getMin.onPostMessage(str, bundle);
                    } catch (RemoteException unused) {
                    }
                }

                public final void getMin(int i, @NonNull Uri uri, boolean z, @Nullable Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.getMin.onRelationshipValidationResult(i, uri, z, bundle);
                    } catch (RemoteException unused) {
                    }
                }
            };
        }
        this.getMax = r1;
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.setMin;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        ICustomTabsCallback iCustomTabsCallback = this.getMin;
        if (iCustomTabsCallback != null) {
            return iCustomTabsCallback.asBinder().hashCode();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CustomTabsSessionToken)) {
            return false;
        }
        CustomTabsSessionToken customTabsSessionToken = (CustomTabsSessionToken) obj;
        PendingIntent pendingIntent = customTabsSessionToken.setMin;
        boolean z = true;
        boolean z2 = this.setMin == null;
        if (pendingIntent != null) {
            z = false;
        }
        if (z2 != z) {
            return false;
        }
        PendingIntent pendingIntent2 = this.setMin;
        if (pendingIntent2 != null) {
            return pendingIntent2.equals(pendingIntent);
        }
        ICustomTabsCallback iCustomTabsCallback = this.getMin;
        if (iCustomTabsCallback != null) {
            IBinder asBinder = iCustomTabsCallback.asBinder();
            ICustomTabsCallback iCustomTabsCallback2 = customTabsSessionToken.getMin;
            if (iCustomTabsCallback2 != null) {
                return asBinder.equals(iCustomTabsCallback2.asBinder());
            }
            throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }
}
