package com.google.android.gms.signin.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;

@KeepForSdk
public class SignInClientImpl extends GmsClient<zae> implements zad {
    private final boolean zaa;
    private final ClientSettings zab;
    private final Bundle zac;
    @Nullable
    private final Integer zad;

    public SignInClientImpl(Context context, Looper looper, boolean z, ClientSettings clientSettings, Bundle bundle, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zaa = z;
        this.zab = clientSettings;
        this.zac = bundle;
        this.zad = clientSettings.zad();
    }

    public int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    public SignInClientImpl(Context context, Looper looper, boolean z, ClientSettings clientSettings, SignInOptions signInOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, true, clientSettings, createBundleFromClientSettings(clientSettings), connectionCallbacks, onConnectionFailedListener);
    }

    public boolean requiresSignIn() {
        return this.zaa;
    }

    public final void zaa(IAccountAccessor iAccountAccessor, boolean z) {
        try {
            ((zae) getService()).zaa(iAccountAccessor, ((Integer) Preconditions.checkNotNull(this.zad)).intValue(), z);
        } catch (RemoteException unused) {
        }
    }

    public final void zaa() {
        try {
            ((zae) getService()).zaa(((Integer) Preconditions.checkNotNull(this.zad)).intValue());
        } catch (RemoteException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r5.zaa(new com.google.android.gms.signin.internal.zam(8));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0042 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zaa(com.google.android.gms.signin.internal.zac r5) {
        /*
            r4 = this;
            java.lang.String r0 = "Expecting a valid ISignInCallbacks"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r0)
            com.google.android.gms.common.internal.ClientSettings r0 = r4.zab     // Catch:{ RemoteException -> 0x0042 }
            android.accounts.Account r0 = r0.getAccountOrDefault()     // Catch:{ RemoteException -> 0x0042 }
            r1 = 0
            java.lang.String r2 = "<<default account>>"
            java.lang.String r3 = r0.name     // Catch:{ RemoteException -> 0x0042 }
            boolean r2 = r2.equals(r3)     // Catch:{ RemoteException -> 0x0042 }
            if (r2 == 0) goto L_0x0022
            android.content.Context r1 = r4.getContext()     // Catch:{ RemoteException -> 0x0042 }
            com.google.android.gms.auth.api.signin.internal.Storage r1 = com.google.android.gms.auth.api.signin.internal.Storage.getInstance(r1)     // Catch:{ RemoteException -> 0x0042 }
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.getSavedDefaultGoogleSignInAccount()     // Catch:{ RemoteException -> 0x0042 }
        L_0x0022:
            com.google.android.gms.common.internal.zas r2 = new com.google.android.gms.common.internal.zas     // Catch:{ RemoteException -> 0x0042 }
            java.lang.Integer r3 = r4.zad     // Catch:{ RemoteException -> 0x0042 }
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch:{ RemoteException -> 0x0042 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ RemoteException -> 0x0042 }
            int r3 = r3.intValue()     // Catch:{ RemoteException -> 0x0042 }
            r2.<init>(r0, r3, r1)     // Catch:{ RemoteException -> 0x0042 }
            android.os.IInterface r0 = r4.getService()     // Catch:{ RemoteException -> 0x0042 }
            com.google.android.gms.signin.internal.zae r0 = (com.google.android.gms.signin.internal.zae) r0     // Catch:{ RemoteException -> 0x0042 }
            com.google.android.gms.signin.internal.zak r1 = new com.google.android.gms.signin.internal.zak     // Catch:{ RemoteException -> 0x0042 }
            r1.<init>(r2)     // Catch:{ RemoteException -> 0x0042 }
            r0.zaa(r1, r5)     // Catch:{ RemoteException -> 0x0042 }
            return
        L_0x0042:
            com.google.android.gms.signin.internal.zam r0 = new com.google.android.gms.signin.internal.zam     // Catch:{ RemoteException -> 0x004c }
            r1 = 8
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x004c }
            r5.zaa((com.google.android.gms.signin.internal.zam) r0)     // Catch:{ RemoteException -> 0x004c }
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.signin.internal.SignInClientImpl.zaa(com.google.android.gms.signin.internal.zac):void");
    }

    public Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.zab.getRealClientPackageName())) {
            this.zac.putString("com.google.android.gms.signin.internal.realClientPackageName", this.zab.getRealClientPackageName());
        }
        return this.zac;
    }

    public final void zab() {
        connect(new BaseGmsClient.LegacyClientCallbackAdapter());
    }

    @KeepForSdk
    public static Bundle createBundleFromClientSettings(ClientSettings clientSettings) {
        SignInOptions zac2 = clientSettings.zac();
        Integer zad2 = clientSettings.zad();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", clientSettings.getAccount());
        if (zad2 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", zad2.intValue());
        }
        if (zac2 != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", zac2.zaa());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", zac2.zab());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", zac2.zac());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", zac2.zad());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", zac2.zae());
            bundle.putString("com.google.android.gms.signin.internal.logSessionId", zac2.zaf());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", zac2.zag());
            Long zah = zac2.zah();
            if (zah != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", zah.longValue());
            }
            Long zai = zac2.zai();
            if (zai != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", zai.longValue());
            }
        }
        return bundle;
    }

    public /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof zae) {
            return (zae) queryLocalInterface;
        }
        return new zah(iBinder);
    }
}
