package com.google.android.youtube.player;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.youtube.player.internal.ab;
import com.google.android.youtube.player.internal.y;

public enum YouTubeInitializationResult {
    SUCCESS,
    INTERNAL_ERROR,
    UNKNOWN_ERROR,
    SERVICE_MISSING,
    SERVICE_VERSION_UPDATE_REQUIRED,
    SERVICE_DISABLED,
    SERVICE_INVALID,
    ERROR_CONNECTING_TO_SERVICE,
    CLIENT_LIBRARY_UPDATE_REQUIRED,
    NETWORK_ERROR,
    DEVELOPER_KEY_INVALID,
    INVALID_APPLICATION_SIGNATURE;

    /* renamed from: com.google.android.youtube.player.YouTubeInitializationResult$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11008a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.android.youtube.player.YouTubeInitializationResult[] r0 = com.google.android.youtube.player.YouTubeInitializationResult.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11008a = r0
                com.google.android.youtube.player.YouTubeInitializationResult r1 = com.google.android.youtube.player.YouTubeInitializationResult.SERVICE_MISSING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11008a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.android.youtube.player.YouTubeInitializationResult r1 = com.google.android.youtube.player.YouTubeInitializationResult.SERVICE_DISABLED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11008a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.android.youtube.player.YouTubeInitializationResult r1 = com.google.android.youtube.player.YouTubeInitializationResult.SERVICE_VERSION_UPDATE_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.youtube.player.YouTubeInitializationResult.AnonymousClass1.<clinit>():void");
        }
    }

    static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f11009a;
        private final Intent b;
        private final int c;

        public a(Activity activity, Intent intent, int i) {
            this.f11009a = (Activity) ab.a(activity);
            this.b = (Intent) ab.a(intent);
            this.c = ((Integer) ab.a(Integer.valueOf(i))).intValue();
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            try {
                this.f11009a.startActivityForResult(this.b, this.c);
                dialogInterface.dismiss();
            } catch (ActivityNotFoundException e) {
                y.a("Can't perform resolution for YouTubeInitalizationError", (Throwable) e);
            }
        }
    }

    public final Dialog getErrorDialog(Activity activity, int i) {
        return getErrorDialog(activity, i, (DialogInterface.OnCancelListener) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Dialog getErrorDialog(android.app.Activity r6, int r7, android.content.DialogInterface.OnCancelListener r8) {
        /*
            r5 = this;
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r6)
            if (r8 == 0) goto L_0x000a
            r0.setOnCancelListener(r8)
        L_0x000a:
            int[] r8 = com.google.android.youtube.player.YouTubeInitializationResult.AnonymousClass1.f11008a
            int r1 = r5.ordinal()
            r8 = r8[r1]
            r1 = 3
            r2 = 2
            r3 = 1
            if (r8 == r3) goto L_0x0026
            if (r8 == r2) goto L_0x001d
            if (r8 == r1) goto L_0x0026
            r8 = 0
            goto L_0x002e
        L_0x001d:
            java.lang.String r8 = com.google.android.youtube.player.internal.z.a((android.content.Context) r6)
            android.content.Intent r8 = com.google.android.youtube.player.internal.z.a((java.lang.String) r8)
            goto L_0x002e
        L_0x0026:
            java.lang.String r8 = com.google.android.youtube.player.internal.z.a((android.content.Context) r6)
            android.content.Intent r8 = com.google.android.youtube.player.internal.z.b((java.lang.String) r8)
        L_0x002e:
            com.google.android.youtube.player.YouTubeInitializationResult$a r4 = new com.google.android.youtube.player.YouTubeInitializationResult$a
            r4.<init>(r6, r8, r7)
            com.google.android.youtube.player.internal.m r7 = new com.google.android.youtube.player.internal.m
            r7.<init>(r6)
            int[] r6 = com.google.android.youtube.player.YouTubeInitializationResult.AnonymousClass1.f11008a
            int r8 = r5.ordinal()
            r6 = r6[r8]
            if (r6 == r3) goto L_0x008d
            if (r6 == r2) goto L_0x007e
            if (r6 == r1) goto L_0x0067
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Unexpected errorReason: "
            java.lang.String r8 = r5.name()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r0 = r8.length()
            if (r0 == 0) goto L_0x005d
            java.lang.String r7 = r7.concat(r8)
            goto L_0x0063
        L_0x005d:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r7)
            r7 = r8
        L_0x0063:
            r6.<init>(r7)
            throw r6
        L_0x0067:
            java.lang.String r6 = r7.h
            android.app.AlertDialog$Builder r6 = r0.setTitle(r6)
            java.lang.String r8 = r7.i
            android.app.AlertDialog$Builder r6 = r6.setMessage(r8)
            java.lang.String r7 = r7.j
        L_0x0075:
            android.app.AlertDialog$Builder r6 = r6.setPositiveButton(r7, r4)
            android.app.AlertDialog r6 = r6.create()
            return r6
        L_0x007e:
            java.lang.String r6 = r7.e
            android.app.AlertDialog$Builder r6 = r0.setTitle(r6)
            java.lang.String r8 = r7.f
            android.app.AlertDialog$Builder r6 = r6.setMessage(r8)
            java.lang.String r7 = r7.g
            goto L_0x0075
        L_0x008d:
            java.lang.String r6 = r7.b
            android.app.AlertDialog$Builder r6 = r0.setTitle(r6)
            java.lang.String r8 = r7.c
            android.app.AlertDialog$Builder r6 = r6.setMessage(r8)
            java.lang.String r7 = r7.d
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.youtube.player.YouTubeInitializationResult.getErrorDialog(android.app.Activity, int, android.content.DialogInterface$OnCancelListener):android.app.Dialog");
    }

    public final boolean isUserRecoverableError() {
        int i = AnonymousClass1.f11008a[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
