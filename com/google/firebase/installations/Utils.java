package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.time.Clock;
import com.google.firebase.installations.time.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class Utils {
    private static final Pattern API_KEY_FORMAT = Pattern.compile("\\AA[\\w-]{38}\\z");
    private static final String APP_ID_IDENTIFICATION_SUBSTRING = ":";
    public static final long AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS = TimeUnit.HOURS.toSeconds(1);
    private static Utils singleton;
    private final Clock clock;

    private Utils(Clock clock2) {
        this.clock = clock2;
    }

    public static Utils getInstance() {
        return getInstance(SystemClock.getInstance());
    }

    public static Utils getInstance(Clock clock2) {
        if (singleton == null) {
            singleton = new Utils(clock2);
        }
        return singleton;
    }

    public final boolean isAuthTokenExpired(@NonNull PersistedInstallationEntry persistedInstallationEntry) {
        if (!TextUtils.isEmpty(persistedInstallationEntry.getAuthToken()) && persistedInstallationEntry.getTokenCreationEpochInSecs() + persistedInstallationEntry.getExpiresInSecs() >= currentTimeInSecs() + AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS) {
            return false;
        }
        return true;
    }

    public final long currentTimeInSecs() {
        return TimeUnit.MILLISECONDS.toSeconds(currentTimeInMillis());
    }

    public final long currentTimeInMillis() {
        return this.clock.currentTimeMillis();
    }

    static boolean isValidAppIdFormat(@Nullable String str) {
        return str.contains(APP_ID_IDENTIFICATION_SUBSTRING);
    }

    static boolean isValidApiKeyFormat(@Nullable String str) {
        return API_KEY_FORMAT.matcher(str).matches();
    }

    public final long getRandomDelayForSyncPrevention() {
        return (long) (Math.random() * 1000.0d);
    }
}
