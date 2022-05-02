package androidx.browser.trusted;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import androidx.annotation.BinderThread;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Locale;
import o.IMediaSession;
import o.InspectableProperty;
import o.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
import o.MediaSessionCompat$MediaSessionImplApi21$ExtraSession;
import o.setShuffleMode;
import o.setShuffleModeEnabledRemoved;

public abstract class TrustedWebActivityService extends Service {
    @SuppressLint({"ActionValue", "ServiceName"})
    public static final String ACTION_TRUSTED_WEB_ACTIVITY_SERVICE = "android.support.customtabs.trusted.TRUSTED_WEB_ACTIVITY_SERVICE";
    public static final String KEY_SMALL_ICON_BITMAP = "android.support.customtabs.trusted.SMALL_ICON_BITMAP";
    public static final String KEY_SUCCESS = "androidx.browser.trusted.SUCCESS";
    public static final String META_DATA_NAME_SMALL_ICON = "android.support.customtabs.trusted.SMALL_ICON";
    public static final int SMALL_ICON_NOT_SET = -1;
    private final ITrustedWebActivityService.Stub getMin = new ITrustedWebActivityService.Stub() {
        public Bundle areNotificationsEnabled(Bundle bundle) {
            setMax();
            if (bundle.containsKey("android.support.customtabs.trusted.CHANNEL_NAME")) {
                IMediaSession.Stub.Proxy.setMax setmax = new IMediaSession.Stub.Proxy.setMax(TrustedWebActivityService.this.onAreNotificationsEnabled(new IMediaSession.Stub.Proxy.getMin(bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME")).getMax));
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", setmax.setMax);
                return bundle2;
            }
            throw new IllegalArgumentException("Bundle must contain ".concat("android.support.customtabs.trusted.CHANNEL_NAME"));
        }

        public Bundle notifyNotificationWithChannel(Bundle bundle) {
            setMax();
            if (!bundle.containsKey("android.support.customtabs.trusted.PLATFORM_TAG")) {
                throw new IllegalArgumentException("Bundle must contain ".concat("android.support.customtabs.trusted.PLATFORM_TAG"));
            } else if (!bundle.containsKey("android.support.customtabs.trusted.PLATFORM_ID")) {
                throw new IllegalArgumentException("Bundle must contain ".concat("android.support.customtabs.trusted.PLATFORM_ID"));
            } else if (!bundle.containsKey("android.support.customtabs.trusted.NOTIFICATION")) {
                throw new IllegalArgumentException("Bundle must contain ".concat("android.support.customtabs.trusted.NOTIFICATION"));
            } else if (bundle.containsKey("android.support.customtabs.trusted.CHANNEL_NAME")) {
                IMediaSession.Stub.Proxy.getMax getmax = new IMediaSession.Stub.Proxy.getMax(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"), (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION"), bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
                IMediaSession.Stub.Proxy.setMax setmax = new IMediaSession.Stub.Proxy.setMax(TrustedWebActivityService.this.onNotifyNotificationWithChannel(getmax.getMin, getmax.setMax, getmax.getMax, getmax.length));
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", setmax.setMax);
                return bundle2;
            } else {
                throw new IllegalArgumentException("Bundle must contain ".concat("android.support.customtabs.trusted.CHANNEL_NAME"));
            }
        }

        public void cancelNotification(Bundle bundle) {
            setMax();
            if (!bundle.containsKey("android.support.customtabs.trusted.PLATFORM_TAG")) {
                throw new IllegalArgumentException("Bundle must contain ".concat("android.support.customtabs.trusted.PLATFORM_TAG"));
            } else if (bundle.containsKey("android.support.customtabs.trusted.PLATFORM_ID")) {
                IMediaSession.Stub.Proxy.length length = new IMediaSession.Stub.Proxy.length(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"));
                TrustedWebActivityService.this.onCancelNotification(length.getMin, length.length);
            } else {
                throw new IllegalArgumentException("Bundle must contain ".concat("android.support.customtabs.trusted.PLATFORM_ID"));
            }
        }

        public Bundle getActiveNotifications() {
            setMax();
            IMediaSession.Stub.Proxy.setMin setmin = new IMediaSession.Stub.Proxy.setMin(TrustedWebActivityService.this.onGetActiveNotifications());
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", setmin.getMax);
            return bundle;
        }

        public int getSmallIconId() {
            setMax();
            return TrustedWebActivityService.this.onGetSmallIconId();
        }

        public Bundle getSmallIconBitmap() {
            setMax();
            return TrustedWebActivityService.this.onGetSmallIconBitmap();
        }

        public Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) {
            setMax();
            return TrustedWebActivityService.this.onExtraCommand(str, bundle, MediaSessionCompat$MediaSessionImplApi21$ExtraSession.getMin(iBinder));
        }

        private void setMax() {
            if (TrustedWebActivityService.this.mVerifiedUid == -1) {
                String[] packagesForUid = TrustedWebActivityService.this.getPackageManager().getPackagesForUid(getCallingUid());
                int i = 0;
                if (packagesForUid == null) {
                    packagesForUid = new String[0];
                }
                IMediaSession.Stub length = TrustedWebActivityService.this.getTokenStore().length();
                PackageManager packageManager = TrustedWebActivityService.this.getPackageManager();
                if (length != null) {
                    int length2 = packagesForUid.length;
                    while (true) {
                        if (i >= length2) {
                            break;
                        } else if (length.setMin(packagesForUid[i], packageManager)) {
                            TrustedWebActivityService.this.mVerifiedUid = getCallingUid();
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            if (TrustedWebActivityService.this.mVerifiedUid != getCallingUid()) {
                throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
            }
        }
    };
    int mVerifiedUid = -1;
    private NotificationManager setMin;

    @BinderThread
    @NonNull
    public abstract MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver getTokenStore();

    @BinderThread
    @Nullable
    public Bundle onExtraCommand(@NonNull String str, @NonNull Bundle bundle, @Nullable MediaSessionCompat$MediaSessionImplApi21$ExtraSession mediaSessionCompat$MediaSessionImplApi21$ExtraSession) {
        return null;
    }

    @CallSuper
    @MainThread
    public void onCreate() {
        super.onCreate();
        this.setMin = (NotificationManager) getSystemService("notification");
    }

    @BinderThread
    @NonNull
    public Bundle onGetSmallIconBitmap() {
        int onGetSmallIconId = onGetSmallIconId();
        Bundle bundle = new Bundle();
        if (onGetSmallIconId == -1) {
            return bundle;
        }
        bundle.putParcelable(KEY_SMALL_ICON_BITMAP, BitmapFactory.decodeResource(getResources(), onGetSmallIconId));
        return bundle;
    }

    @BinderThread
    public int onGetSmallIconId() {
        try {
            ServiceInfo serviceInfo = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128);
            if (serviceInfo.metaData == null) {
                return -1;
            }
            return serviceInfo.metaData.getInt(META_DATA_NAME_SMALL_ICON, -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    @MainThread
    @Nullable
    public final IBinder onBind(@Nullable Intent intent) {
        return this.getMin;
    }

    @MainThread
    public final boolean onUnbind(@Nullable Intent intent) {
        this.mVerifiedUid = -1;
        return super.onUnbind(intent);
    }

    private static String getMax(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.toLowerCase(Locale.ROOT).replace(' ', '_'));
        sb.append("_channel_id");
        return sb.toString();
    }

    @BinderThread
    public boolean onAreNotificationsEnabled(@NonNull String str) {
        if (this.setMin == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        } else if (!InspectableProperty.ValueType.getMin((Context) this).length()) {
            return false;
        } else {
            if (Build.VERSION.SDK_INT < 26) {
                return true;
            }
            return setShuffleModeEnabledRemoved.getMin(this.setMin, getMax(str));
        }
    }

    @BinderThread
    public boolean onNotifyNotificationWithChannel(@NonNull String str, int i, @NonNull Notification notification, @NonNull String str2) {
        if (this.setMin == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        } else if (!InspectableProperty.ValueType.getMin((Context) this).length()) {
            return false;
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                String max = getMax(str2);
                notification = setShuffleModeEnabledRemoved.getMin(this, this.setMin, notification, max, str2);
                if (!setShuffleModeEnabledRemoved.getMin(this.setMin, max)) {
                    return false;
                }
            }
            this.setMin.notify(str, i, notification);
            return true;
        }
    }

    @BinderThread
    public void onCancelNotification(@NonNull String str, int i) {
        NotificationManager notificationManager = this.setMin;
        if (notificationManager != null) {
            notificationManager.cancel(str, i);
            return;
        }
        throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
    }

    @BinderThread
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Parcelable[] onGetActiveNotifications() {
        if (this.setMin == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        } else if (Build.VERSION.SDK_INT >= 23) {
            return setShuffleMode.setMin(this.setMin);
        } else {
            throw new IllegalStateException("onGetActiveNotifications cannot be called pre-M.");
        }
    }
}
