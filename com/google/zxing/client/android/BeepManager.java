package com.google.zxing.client.android;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Vibrator;
import java.io.IOException;
import o.onActivityDestroyed;
import o.onActivitySaveInstanceState;

public final class BeepManager {
    private static final float BEEP_VOLUME = 0.1f;
    private static final String TAG = BeepManager.class.getSimpleName();
    private static final long VIBRATE_DURATION = 200;
    private boolean beepEnabled = true;
    private final Context context;
    private boolean vibrateEnabled = false;

    public BeepManager(Activity activity) {
        activity.setVolumeControlStream(3);
        this.context = activity.getApplicationContext();
    }

    public final boolean isBeepEnabled() {
        return this.beepEnabled;
    }

    public final void setBeepEnabled(boolean z) {
        this.beepEnabled = z;
    }

    public final boolean isVibrateEnabled() {
        return this.vibrateEnabled;
    }

    public final void setVibrateEnabled(boolean z) {
        this.vibrateEnabled = z;
    }

    @SuppressLint({"MissingPermission"})
    public final synchronized void playBeepSoundAndVibrate() {
        Vibrator vibrator;
        if (this.beepEnabled) {
            playBeepSound();
        }
        if (this.vibrateEnabled && (vibrator = (Vibrator) this.context.getSystemService("vibrator")) != null) {
            vibrator.vibrate(VIBRATE_DURATION);
        }
    }

    public final MediaPlayer playBeepSound() {
        AssetFileDescriptor openRawResourceFd;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setOnCompletionListener(onActivitySaveInstanceState.getMin);
        mediaPlayer.setOnErrorListener(onActivityDestroyed.setMax);
        try {
            openRawResourceFd = this.context.getResources().openRawResourceFd(R.raw.zxing_beep);
            mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            openRawResourceFd.close();
            mediaPlayer.setVolume(0.1f, 0.1f);
            mediaPlayer.prepare();
            mediaPlayer.start();
            return mediaPlayer;
        } catch (IOException unused) {
            mediaPlayer.reset();
            mediaPlayer.release();
            return null;
        } catch (Throwable th) {
            openRawResourceFd.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$playBeepSound$0(MediaPlayer mediaPlayer) {
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$playBeepSound$1(MediaPlayer mediaPlayer, int i, int i2) {
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        return true;
    }
}
