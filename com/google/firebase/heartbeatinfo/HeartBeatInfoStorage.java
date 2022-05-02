package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class HeartBeatInfoStorage {
    private static final SimpleDateFormat FORMATTER = new SimpleDateFormat("dd/MM/yyyy z");
    private static final String GLOBAL = "fire-global";
    private static final int HEART_BEAT_COUNT_LIMIT = 200;
    private static final String HEART_BEAT_COUNT_TAG = "fire-count";
    private static final String PREFERENCES_NAME = "FirebaseAppHeartBeat";
    private static final String STORAGE_PREFERENCES_NAME = "FirebaseAppHeartBeatStorage";
    private static HeartBeatInfoStorage instance;
    private final SharedPreferences heartBeatSharedPreferences;
    private final SharedPreferences sharedPreferences;

    private HeartBeatInfoStorage(Context context) {
        this.sharedPreferences = context.getSharedPreferences(PREFERENCES_NAME, 0);
        this.heartBeatSharedPreferences = context.getSharedPreferences(STORAGE_PREFERENCES_NAME, 0);
    }

    @VisibleForTesting
    @RestrictTo({RestrictTo.Scope.TESTS})
    HeartBeatInfoStorage(SharedPreferences sharedPreferences2, SharedPreferences sharedPreferences3) {
        this.sharedPreferences = sharedPreferences2;
        this.heartBeatSharedPreferences = sharedPreferences3;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    @RestrictTo({RestrictTo.Scope.TESTS})
    public int getHeartBeatCount() {
        return (int) this.sharedPreferences.getLong(HEART_BEAT_COUNT_TAG, 0);
    }

    /* access modifiers changed from: package-private */
    public static synchronized HeartBeatInfoStorage getInstance(Context context) {
        HeartBeatInfoStorage heartBeatInfoStorage;
        synchronized (HeartBeatInfoStorage.class) {
            if (instance == null) {
                instance = new HeartBeatInfoStorage(context);
            }
            heartBeatInfoStorage = instance;
        }
        return heartBeatInfoStorage;
    }

    /* access modifiers changed from: package-private */
    public synchronized void storeHeartBeatInformation(String str, long j) {
        long j2 = this.sharedPreferences.getLong(HEART_BEAT_COUNT_TAG, 0);
        this.heartBeatSharedPreferences.edit().putString(String.valueOf(j), str).apply();
        long j3 = j2 + 1;
        this.sharedPreferences.edit().putLong(HEART_BEAT_COUNT_TAG, j3).apply();
        if (j3 > 200) {
            cleanUpStoredHeartBeats();
        }
    }

    private synchronized void cleanUpStoredHeartBeats() {
        long j = this.sharedPreferences.getLong(HEART_BEAT_COUNT_TAG, 0);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> key : this.heartBeatSharedPreferences.getAll().entrySet()) {
            arrayList.add(Long.valueOf(Long.parseLong((String) key.getKey())));
        }
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.heartBeatSharedPreferences.edit().remove(String.valueOf((Long) it.next())).apply();
            j--;
            this.sharedPreferences.edit().putLong(HEART_BEAT_COUNT_TAG, j).apply();
            if (j <= 100) {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized long getLastGlobalHeartBeat() {
        return this.sharedPreferences.getLong(GLOBAL, -1);
    }

    /* access modifiers changed from: package-private */
    public synchronized void updateGlobalHeartBeat(long j) {
        this.sharedPreferences.edit().putLong(GLOBAL, j).apply();
    }

    /* access modifiers changed from: package-private */
    public synchronized List<SdkHeartBeatResult> getStoredHeartBeats(boolean z) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry next : this.heartBeatSharedPreferences.getAll().entrySet()) {
            arrayList.add(SdkHeartBeatResult.create((String) next.getValue(), Long.parseLong((String) next.getKey())));
        }
        Collections.sort(arrayList);
        if (z) {
            clearStoredHeartBeats();
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public synchronized void clearStoredHeartBeats() {
        this.heartBeatSharedPreferences.edit().clear().apply();
        this.sharedPreferences.edit().remove(HEART_BEAT_COUNT_TAG).apply();
    }

    static boolean isSameDateUtc(long j, long j2) {
        return !FORMATTER.format(new Date(j)).equals(FORMATTER.format(new Date(j2)));
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean shouldSendSdkHeartBeat(String str, long j) {
        if (!this.sharedPreferences.contains(str)) {
            this.sharedPreferences.edit().putLong(str, j).apply();
            return true;
        } else if (!isSameDateUtc(this.sharedPreferences.getLong(str, -1), j)) {
            return false;
        } else {
            this.sharedPreferences.edit().putLong(str, j).apply();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean shouldSendGlobalHeartBeat(long j) {
        return shouldSendSdkHeartBeat(GLOBAL, j);
    }
}
