package com.google.firebase.installations.local;

import android.graphics.PointF;
import android.os.Process;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.firebase.FirebaseApp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class PersistedInstallation {
    private static final String AUTH_TOKEN_KEY = "AuthToken";
    private static final String EXPIRES_IN_SECONDS_KEY = "ExpiresInSecs";
    private static final String FIREBASE_INSTALLATION_ID_KEY = "Fid";
    private static final String FIS_ERROR_KEY = "FisError";
    private static final String PERSISTED_STATUS_KEY = "Status";
    private static final String REFRESH_TOKEN_KEY = "RefreshToken";
    private static final String SETTINGS_FILE_NAME_PREFIX = "PersistedInstallation";
    private static final String TOKEN_CREATION_TIME_IN_SECONDS_KEY = "TokenCreationEpochInSecs";
    private static int getMax = 0;
    private static char[] getMin = {'U', 13144, 26206, 39177, 52232};
    private static int setMax = 1;
    private static long setMin = -3668199585915915508L;
    private final File dataFile;
    @NonNull
    private final FirebaseApp firebaseApp;

    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(@NonNull FirebaseApp firebaseApp2) {
        try {
            File filesDir = firebaseApp2.getApplicationContext().getFilesDir();
            StringBuilder sb = new StringBuilder("PersistedInstallation.");
            sb.append(firebaseApp2.getPersistenceKey());
            sb.append(".json");
            this.dataFile = new File(filesDir, sb.toString());
            this.firebaseApp = firebaseApp2;
        } catch (Exception e) {
            throw e;
        }
    }

    @NonNull
    public PersistedInstallationEntry readPersistedInstallationEntryValue() {
        try {
            int i = setMax + 11;
            getMax = i % 128;
            int i2 = i % 2;
            JSONObject readJSONFromFile = readJSONFromFile();
            String optString = readJSONFromFile.optString(FIREBASE_INSTALLATION_ID_KEY, (String) null);
            int optInt = readJSONFromFile.optInt(PERSISTED_STATUS_KEY, RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
            String optString2 = readJSONFromFile.optString(AUTH_TOKEN_KEY, (String) null);
            String optString3 = readJSONFromFile.optString(REFRESH_TOKEN_KEY, (String) null);
            long optLong = readJSONFromFile.optLong(TOKEN_CREATION_TIME_IN_SECONDS_KEY, 0);
            long optLong2 = readJSONFromFile.optLong(EXPIRES_IN_SECONDS_KEY, 0);
            PersistedInstallationEntry build = PersistedInstallationEntry.builder().setFirebaseInstallationId(optString).setRegistrationStatus(RegistrationStatus.values()[optInt]).setAuthToken(optString2).setRefreshToken(optString3).setTokenCreationEpochInSecs(optLong).setExpiresInSecs(optLong2).setFisError(readJSONFromFile.optString(FIS_ERROR_KEY, (String) null)).build();
            int i3 = getMax + 63;
            setMax = i3 % 128;
            int i4 = i3 % 2;
            return build;
        } catch (Exception e) {
            throw e;
        }
    }

    private JSONObject readJSONFromFile() {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(this.dataFile);
            int i = getMax + 21;
            setMax = i % 128;
            int i2 = i % 2;
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (!(read >= 0)) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                int i3 = setMax + 107;
                getMax = i3 % 128;
                if (i3 % 2 == 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.write(bArr, 1, read);
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @NonNull
    public PersistedInstallationEntry insertOrUpdatePersistedInstallationEntry(@NonNull PersistedInstallationEntry persistedInstallationEntry) {
        char c = 22;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FIREBASE_INSTALLATION_ID_KEY, persistedInstallationEntry.getFirebaseInstallationId());
            jSONObject.put(PERSISTED_STATUS_KEY, persistedInstallationEntry.getRegistrationStatus().ordinal());
            jSONObject.put(AUTH_TOKEN_KEY, persistedInstallationEntry.getAuthToken());
            jSONObject.put(REFRESH_TOKEN_KEY, persistedInstallationEntry.getRefreshToken());
            jSONObject.put(TOKEN_CREATION_TIME_IN_SECONDS_KEY, persistedInstallationEntry.getTokenCreationEpochInSecs());
            jSONObject.put(EXPIRES_IN_SECONDS_KEY, persistedInstallationEntry.getExpiresInSecs());
            jSONObject.put(FIS_ERROR_KEY, persistedInstallationEntry.getFisError());
            File createTempFile = File.createTempFile(SETTINGS_FILE_NAME_PREFIX, "tmp", this.firebaseApp.getApplicationContext().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(setMin(View.MeasureSpec.getMode(0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 5 - (Process.myPid() >> 22)).intern()));
            fileOutputStream.close();
            if (createTempFile.renameTo(this.dataFile)) {
                int i = setMax + 31;
                getMax = i % 128;
                if (i % 2 == 0) {
                    c = 5;
                }
                if (c == 5) {
                    return persistedInstallationEntry;
                }
                Object obj = null;
                super.hashCode();
                return persistedInstallationEntry;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    public void clearForTesting() {
        int i = setMax + 99;
        getMax = i % 128;
        if ((i % 2 != 0 ? '9' : 30) != '9') {
            this.dataFile.delete();
            return;
        }
        try {
            this.dataFile.delete();
            Object obj = null;
            super.hashCode();
        } catch (Exception e) {
            throw e;
        }
    }

    private static String setMin(int i, char c, int i2) {
        int i3 = getMax + 33;
        setMax = i3 % 128;
        int i4 = i3 % 2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (true) {
            if (i5 >= i2) {
                return new String(cArr);
            }
            int i6 = getMax + 109;
            setMax = i6 % 128;
            int i7 = i6 % 2;
            cArr[i5] = (char) ((int) ((((long) getMin[i + i5]) ^ (((long) i5) * setMin)) ^ ((long) c)));
            i5++;
        }
    }
}
