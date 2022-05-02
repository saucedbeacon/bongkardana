package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.NoSuchElementException;
import o.PlaybackStateCompat;

public abstract class CustomTabsService extends Service {
    public static final String ACTION_CUSTOM_TABS_CONNECTION = "android.support.customtabs.action.CustomTabsService";
    public static final String CATEGORY_COLOR_SCHEME_CUSTOMIZATION = "androidx.browser.customtabs.category.ColorSchemeCustomization";
    public static final String CATEGORY_NAVBAR_COLOR_CUSTOMIZATION = "androidx.browser.customtabs.category.NavBarColorCustomization";
    public static final String CATEGORY_TRUSTED_WEB_ACTIVITY_IMMERSIVE_MODE = "androidx.browser.trusted.category.ImmersiveMode";
    public static final String CATEGORY_WEB_SHARE_TARGET_V2 = "androidx.browser.trusted.category.WebShareTargetV2";
    public static final int FILE_PURPOSE_TRUSTED_WEB_ACTIVITY_SPLASH_IMAGE = 1;
    public static final String KEY_SUCCESS = "androidx.browser.customtabs.SUCCESS";
    public static final String KEY_URL = "android.support.customtabs.otherurls.URL";
    public static final int RELATION_HANDLE_ALL_URLS = 2;
    public static final int RELATION_USE_AS_ORIGIN = 1;
    public static final int RESULT_FAILURE_DISALLOWED = -1;
    public static final int RESULT_FAILURE_MESSAGING_ERROR = -3;
    public static final int RESULT_FAILURE_REMOTE_ERROR = -2;
    public static final int RESULT_SUCCESS = 0;
    public static final String TRUSTED_WEB_ACTIVITY_CATEGORY = "androidx.browser.trusted.category.TrustedWebActivities";
    private ICustomTabsService.Stub length = new ICustomTabsService.Stub() {
        public boolean warmup(long j) {
            return CustomTabsService.this.warmup(j);
        }

        public boolean newSession(@NonNull ICustomTabsCallback iCustomTabsCallback) {
            return length(iCustomTabsCallback, (PendingIntent) null);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
            return false;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean length(@androidx.annotation.NonNull android.support.customtabs.ICustomTabsCallback r5, @androidx.annotation.Nullable android.app.PendingIntent r6) {
            /*
                r4 = this;
                androidx.browser.customtabs.CustomTabsSessionToken r0 = new androidx.browser.customtabs.CustomTabsSessionToken
                r0.<init>(r5, r6)
                r6 = 0
                o.seekTo r1 = new o.seekTo     // Catch:{ RemoteException -> 0x002d }
                r1.<init>(r4, r0)     // Catch:{ RemoteException -> 0x002d }
                androidx.browser.customtabs.CustomTabsService r2 = androidx.browser.customtabs.CustomTabsService.this     // Catch:{ RemoteException -> 0x002d }
                o.PlaybackStateCompat$RepeatMode<android.os.IBinder, android.os.IBinder$DeathRecipient> r2 = r2.mDeathRecipientMap     // Catch:{ RemoteException -> 0x002d }
                monitor-enter(r2)     // Catch:{ RemoteException -> 0x002d }
                android.os.IBinder r3 = r5.asBinder()     // Catch:{ all -> 0x002a }
                r3.linkToDeath(r1, r6)     // Catch:{ all -> 0x002a }
                androidx.browser.customtabs.CustomTabsService r3 = androidx.browser.customtabs.CustomTabsService.this     // Catch:{ all -> 0x002a }
                o.PlaybackStateCompat$RepeatMode<android.os.IBinder, android.os.IBinder$DeathRecipient> r3 = r3.mDeathRecipientMap     // Catch:{ all -> 0x002a }
                android.os.IBinder r5 = r5.asBinder()     // Catch:{ all -> 0x002a }
                r3.put(r5, r1)     // Catch:{ all -> 0x002a }
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                androidx.browser.customtabs.CustomTabsService r5 = androidx.browser.customtabs.CustomTabsService.this     // Catch:{ RemoteException -> 0x002d }
                boolean r5 = r5.newSession(r0)     // Catch:{ RemoteException -> 0x002d }
                return r5
            L_0x002a:
                r5 = move-exception
                monitor-exit(r2)     // Catch:{ RemoteException -> 0x002d }
                throw r5     // Catch:{ RemoteException -> 0x002d }
            L_0x002d:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.browser.customtabs.CustomTabsService.AnonymousClass1.length(android.support.customtabs.ICustomTabsCallback, android.app.PendingIntent):boolean");
        }

        public boolean mayLaunchUrl(@Nullable ICustomTabsCallback iCustomTabsCallback, @Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list) {
            PendingIntent pendingIntent;
            CustomTabsService customTabsService = CustomTabsService.this;
            if (bundle == null) {
                pendingIntent = null;
            } else {
                bundle.remove("android.support.customtabs.extra.SESSION_ID");
                pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            }
            return customTabsService.mayLaunchUrl(new CustomTabsSessionToken(iCustomTabsCallback, pendingIntent), uri, bundle, list);
        }

        public Bundle extraCommand(@NonNull String str, @Nullable Bundle bundle) {
            return CustomTabsService.this.extraCommand(str, bundle);
        }

        public boolean updateVisuals(@NonNull ICustomTabsCallback iCustomTabsCallback, @Nullable Bundle bundle) {
            PendingIntent pendingIntent;
            CustomTabsService customTabsService = CustomTabsService.this;
            if (bundle == null) {
                pendingIntent = null;
            } else {
                bundle.remove("android.support.customtabs.extra.SESSION_ID");
                pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            }
            return customTabsService.updateVisuals(new CustomTabsSessionToken(iCustomTabsCallback, pendingIntent), bundle);
        }

        public boolean requestPostMessageChannel(@NonNull ICustomTabsCallback iCustomTabsCallback, @NonNull Uri uri) {
            return CustomTabsService.this.requestPostMessageChannel(new CustomTabsSessionToken(iCustomTabsCallback, (PendingIntent) null), uri);
        }

        public boolean requestPostMessageChannelWithExtras(@NonNull ICustomTabsCallback iCustomTabsCallback, @NonNull Uri uri, @NonNull Bundle bundle) {
            PendingIntent pendingIntent;
            CustomTabsService customTabsService = CustomTabsService.this;
            if (bundle == null) {
                pendingIntent = null;
            } else {
                bundle.remove("android.support.customtabs.extra.SESSION_ID");
                pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            }
            return customTabsService.requestPostMessageChannel(new CustomTabsSessionToken(iCustomTabsCallback, pendingIntent), uri);
        }

        public int postMessage(@NonNull ICustomTabsCallback iCustomTabsCallback, @NonNull String str, @Nullable Bundle bundle) {
            PendingIntent pendingIntent;
            CustomTabsService customTabsService = CustomTabsService.this;
            if (bundle == null) {
                pendingIntent = null;
            } else {
                bundle.remove("android.support.customtabs.extra.SESSION_ID");
                pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            }
            return customTabsService.postMessage(new CustomTabsSessionToken(iCustomTabsCallback, pendingIntent), str, bundle);
        }

        public boolean validateRelationship(@NonNull ICustomTabsCallback iCustomTabsCallback, int i, @NonNull Uri uri, @Nullable Bundle bundle) {
            PendingIntent pendingIntent;
            CustomTabsService customTabsService = CustomTabsService.this;
            if (bundle == null) {
                pendingIntent = null;
            } else {
                bundle.remove("android.support.customtabs.extra.SESSION_ID");
                pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            }
            return customTabsService.validateRelationship(new CustomTabsSessionToken(iCustomTabsCallback, pendingIntent), i, uri, bundle);
        }

        public boolean receiveFile(@NonNull ICustomTabsCallback iCustomTabsCallback, @NonNull Uri uri, int i, @Nullable Bundle bundle) {
            PendingIntent pendingIntent;
            CustomTabsService customTabsService = CustomTabsService.this;
            if (bundle == null) {
                pendingIntent = null;
            } else {
                bundle.remove("android.support.customtabs.extra.SESSION_ID");
                pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            }
            return customTabsService.receiveFile(new CustomTabsSessionToken(iCustomTabsCallback, pendingIntent), uri, i, bundle);
        }

        public boolean newSessionWithExtras(@NonNull ICustomTabsCallback iCustomTabsCallback, @Nullable Bundle bundle) {
            PendingIntent pendingIntent;
            if (bundle == null) {
                pendingIntent = null;
            } else {
                bundle.remove("android.support.customtabs.extra.SESSION_ID");
                pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            }
            return length(iCustomTabsCallback, pendingIntent);
        }
    };
    final PlaybackStateCompat.RepeatMode<IBinder, IBinder.DeathRecipient> mDeathRecipientMap = new PlaybackStateCompat.RepeatMode<>();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FilePurpose {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Relation {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Result {
    }

    /* access modifiers changed from: protected */
    @Nullable
    public abstract Bundle extraCommand(@NonNull String str, @Nullable Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract boolean mayLaunchUrl(@NonNull CustomTabsSessionToken customTabsSessionToken, @Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list);

    /* access modifiers changed from: protected */
    public abstract boolean newSession(@NonNull CustomTabsSessionToken customTabsSessionToken);

    /* access modifiers changed from: protected */
    public abstract int postMessage(@NonNull CustomTabsSessionToken customTabsSessionToken, @NonNull String str, @Nullable Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract boolean receiveFile(@NonNull CustomTabsSessionToken customTabsSessionToken, @NonNull Uri uri, int i, @Nullable Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract boolean requestPostMessageChannel(@NonNull CustomTabsSessionToken customTabsSessionToken, @NonNull Uri uri);

    /* access modifiers changed from: protected */
    public abstract boolean updateVisuals(@NonNull CustomTabsSessionToken customTabsSessionToken, @Nullable Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract boolean validateRelationship(@NonNull CustomTabsSessionToken customTabsSessionToken, int i, @NonNull Uri uri, @Nullable Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract boolean warmup(long j);

    @NonNull
    public IBinder onBind(@Nullable Intent intent) {
        return this.length;
    }

    /* access modifiers changed from: protected */
    public boolean cleanUpSession(@NonNull CustomTabsSessionToken customTabsSessionToken) {
        IBinder iBinder;
        try {
            synchronized (this.mDeathRecipientMap) {
                if (customTabsSessionToken.getMin == null) {
                    iBinder = null;
                } else {
                    iBinder = customTabsSessionToken.getMin.asBinder();
                }
                if (iBinder == null) {
                    return false;
                }
                iBinder.unlinkToDeath(this.mDeathRecipientMap.get(iBinder), 0);
                this.mDeathRecipientMap.remove(iBinder);
                return true;
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }
}
