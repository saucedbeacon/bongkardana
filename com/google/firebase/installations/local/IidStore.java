package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.stats.CodePackage;
import com.google.common.base.Ascii;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import com.iap.ac.android.gol.google.supergw.SuperGwUtils;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

public class IidStore {
    private static final String[] ALLOWABLE_SCOPES = {"*", FirebaseMessaging.INSTANCE_ID_SCOPE, CodePackage.GCM, ""};
    private static final String IID_SHARED_PREFS_NAME = "com.google.android.gms.appid";
    private static final String JSON_ENCODED_PREFIX = "{";
    private static final String JSON_TOKEN_KEY = "token";
    private static final String STORE_KEY_ID = "|S|id";
    private static final String STORE_KEY_PUB = "|S||P|";
    private static final String STORE_KEY_SEPARATOR = "|";
    private static final String STORE_KEY_TOKEN = "|T|";
    private final String defaultSenderId;
    @GuardedBy("iidPrefs")
    private final SharedPreferences iidPrefs;

    public IidStore(@NonNull FirebaseApp firebaseApp) {
        this.iidPrefs = firebaseApp.getApplicationContext().getSharedPreferences(IID_SHARED_PREFS_NAME, 0);
        this.defaultSenderId = getDefaultSenderId(firebaseApp);
    }

    @VisibleForTesting
    public IidStore(@NonNull SharedPreferences sharedPreferences, @Nullable String str) {
        this.iidPrefs = sharedPreferences;
        this.defaultSenderId = str;
    }

    private static String getDefaultSenderId(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:") && !applicationId.startsWith("2:")) {
            return applicationId;
        }
        String[] split = applicationId.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private String createTokenKey(@NonNull String str, @NonNull String str2) {
        StringBuilder sb = new StringBuilder(STORE_KEY_TOKEN);
        sb.append(str);
        sb.append(STORE_KEY_SEPARATOR);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return r4;
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String readToken() {
        /*
            r7 = this;
            android.content.SharedPreferences r0 = r7.iidPrefs
            monitor-enter(r0)
            java.lang.String[] r1 = ALLOWABLE_SCOPES     // Catch:{ all -> 0x0034 }
            int r2 = r1.length     // Catch:{ all -> 0x0034 }
            r3 = 0
        L_0x0007:
            r4 = 0
            if (r3 >= r2) goto L_0x0032
            r5 = r1[r3]     // Catch:{ all -> 0x0034 }
            java.lang.String r6 = r7.defaultSenderId     // Catch:{ all -> 0x0034 }
            java.lang.String r5 = r7.createTokenKey(r6, r5)     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences r6 = r7.iidPrefs     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = r6.getString(r5, r4)     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x002f
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x0034 }
            if (r5 != 0) goto L_0x002f
            java.lang.String r1 = "{"
            boolean r1 = r4.startsWith(r1)     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x002d
            java.lang.String r4 = r7.parseIidTokenFromJson(r4)     // Catch:{ all -> 0x0034 }
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return r4
        L_0x002f:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x0032:
            monitor-exit(r0)
            return r4
        L_0x0034:
            r1 = move-exception
            monitor-exit(r0)
            goto L_0x0038
        L_0x0037:
            throw r1
        L_0x0038:
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.local.IidStore.readToken():java.lang.String");
    }

    private String parseIidTokenFromJson(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    public String readIid() {
        synchronized (this.iidPrefs) {
            String readInstanceIdFromLocalStorage = readInstanceIdFromLocalStorage();
            if (readInstanceIdFromLocalStorage != null) {
                return readInstanceIdFromLocalStorage;
            }
            String readPublicKeyFromLocalStorageAndCalculateInstanceId = readPublicKeyFromLocalStorageAndCalculateInstanceId();
            return readPublicKeyFromLocalStorageAndCalculateInstanceId;
        }
    }

    @Nullable
    private String readInstanceIdFromLocalStorage() {
        String string;
        synchronized (this.iidPrefs) {
            string = this.iidPrefs.getString(STORE_KEY_ID, (String) null);
        }
        return string;
    }

    @Nullable
    private String readPublicKeyFromLocalStorageAndCalculateInstanceId() {
        synchronized (this.iidPrefs) {
            String string = this.iidPrefs.getString(STORE_KEY_PUB, (String) null);
            if (string == null) {
                return null;
            }
            PublicKey parseKey = parseKey(string);
            if (parseKey == null) {
                return null;
            }
            String idFromPublicKey = getIdFromPublicKey(parseKey);
            return idFromPublicKey;
        }
    }

    @Nullable
    private static String getIdFromPublicKey(@NonNull PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & Ascii.SI) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @Nullable
    private PublicKey parseKey(String str) {
        try {
            return KeyFactory.getInstance(SuperGwUtils.SIGN_TYPE).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
            return null;
        }
    }
}
