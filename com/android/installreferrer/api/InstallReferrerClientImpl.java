package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import o.inflateMenu;
import o.setContentInsetsAbsolute;

public final class InstallReferrerClientImpl extends InstallReferrerClient {
    private ServiceConnection getMin;
    /* access modifiers changed from: private */
    public IGetInstallReferrerService length;
    private final Context setMax;
    /* access modifiers changed from: private */
    public int setMin = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    public InstallReferrerClientImpl(Context context) {
        this.setMax = context.getApplicationContext();
    }

    public final boolean length() {
        return (this.setMin != 2 || this.length == null || this.getMin == null) ? false : true;
    }

    final class setMax implements ServiceConnection {
        private final inflateMenu getMin;

        private setMax(inflateMenu inflatemenu) {
            if (inflatemenu != null) {
                this.getMin = inflatemenu;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }

        /* synthetic */ setMax(InstallReferrerClientImpl installReferrerClientImpl, inflateMenu inflatemenu, byte b) {
            this(inflatemenu);
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IGetInstallReferrerService unused = InstallReferrerClientImpl.this.length = IGetInstallReferrerService.Stub.a(iBinder);
            int unused2 = InstallReferrerClientImpl.this.setMin = 2;
            this.getMin.onInstallReferrerSetupFinished(0);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            IGetInstallReferrerService unused = InstallReferrerClientImpl.this.length = null;
            int unused2 = InstallReferrerClientImpl.this.setMin = 0;
            this.getMin.onInstallReferrerServiceDisconnected();
        }
    }

    public final void getMax() {
        this.setMin = 3;
        ServiceConnection serviceConnection = this.getMin;
        if (serviceConnection != null) {
            this.setMax.unbindService(serviceConnection);
            this.getMin = null;
        }
        this.length = null;
    }

    public final setContentInsetsAbsolute getMin() throws RemoteException {
        if (length()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.setMax.getPackageName());
            try {
                return new setContentInsetsAbsolute(this.length.a(bundle));
            } catch (RemoteException e) {
                this.setMin = 0;
                throw e;
            }
        } else {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
    }

    private boolean setMax() {
        try {
            if (this.setMax.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final void setMin(inflateMenu inflatemenu) {
        if (!length()) {
            int i = this.setMin;
            if (i == 1) {
                inflatemenu.onInstallReferrerSetupFinished(3);
            } else if (i != 3) {
                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                List<ResolveInfo> queryIntentServices = this.setMax.getPackageManager().queryIntentServices(intent, 0);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    ResolveInfo resolveInfo = queryIntentServices.get(0);
                    if (resolveInfo.serviceInfo != null) {
                        String str = resolveInfo.serviceInfo.packageName;
                        String str2 = resolveInfo.serviceInfo.name;
                        if ("com.android.vending".equals(str) && str2 != null && setMax()) {
                            Intent intent2 = new Intent(intent);
                            setMax setmax = new setMax(this, inflatemenu, (byte) 0);
                            this.getMin = setmax;
                            if (!this.setMax.bindService(intent2, setmax, 1)) {
                                this.setMin = 0;
                                inflatemenu.onInstallReferrerSetupFinished(1);
                                return;
                            }
                            return;
                        }
                        this.setMin = 0;
                        inflatemenu.onInstallReferrerSetupFinished(2);
                        return;
                    }
                }
                this.setMin = 0;
                inflatemenu.onInstallReferrerSetupFinished(2);
            } else {
                inflatemenu.onInstallReferrerSetupFinished(3);
            }
        } else {
            inflatemenu.onInstallReferrerSetupFinished(0);
        }
    }
}
