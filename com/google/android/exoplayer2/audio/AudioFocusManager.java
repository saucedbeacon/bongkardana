package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class AudioFocusManager {
    private static final int AUDIO_FOCUS_STATE_HAVE_FOCUS = 1;
    private static final int AUDIO_FOCUS_STATE_LOSS_TRANSIENT = 2;
    private static final int AUDIO_FOCUS_STATE_LOSS_TRANSIENT_DUCK = 3;
    private static final int AUDIO_FOCUS_STATE_LOST_FOCUS = -1;
    private static final int AUDIO_FOCUS_STATE_NO_FOCUS = 0;
    public static final int PLAYER_COMMAND_DO_NOT_PLAY = -1;
    public static final int PLAYER_COMMAND_PLAY_WHEN_READY = 1;
    public static final int PLAYER_COMMAND_WAIT_FOR_CALLBACK = 0;
    private static final String TAG = "AudioFocusManager";
    private static final float VOLUME_MULTIPLIER_DEFAULT = 1.0f;
    private static final float VOLUME_MULTIPLIER_DUCK = 0.2f;
    @Nullable
    private AudioAttributes audioAttributes;
    private AudioFocusRequest audioFocusRequest;
    /* access modifiers changed from: private */
    public int audioFocusState;
    @Nullable
    private final AudioManager audioManager;
    private int focusGain;
    private final AudioFocusListener focusListener;
    /* access modifiers changed from: private */
    public final PlayerControl playerControl;
    private boolean rebuildAudioFocusRequest;
    /* access modifiers changed from: private */
    public float volumeMultiplier = 1.0f;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayerCommand {
    }

    public interface PlayerControl {
        void executePlayerCommand(int i);

        void setVolumeMultiplier(float f);
    }

    public AudioFocusManager(@Nullable Context context, PlayerControl playerControl2) {
        this.audioManager = context == null ? null : (AudioManager) context.getApplicationContext().getSystemService("audio");
        this.playerControl = playerControl2;
        this.focusListener = new AudioFocusListener();
        this.audioFocusState = 0;
    }

    public final float getVolumeMultiplier() {
        return this.volumeMultiplier;
    }

    public final int setAudioAttributes(@Nullable AudioAttributes audioAttributes2, boolean z, int i) {
        if (audioAttributes2 == null) {
            return 1;
        }
        Assertions.checkNotNull(this.audioManager, "SimpleExoPlayer must be created with a context to handle audio focus.");
        if (!Util.areEqual(this.audioAttributes, audioAttributes2)) {
            this.audioAttributes = audioAttributes2;
            int convertAudioAttributesToFocusGain = convertAudioAttributesToFocusGain(audioAttributes2);
            this.focusGain = convertAudioAttributesToFocusGain;
            Assertions.checkArgument(convertAudioAttributesToFocusGain == 1 || convertAudioAttributesToFocusGain == 0, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
            if (z && (i == 2 || i == 3)) {
                return requestAudioFocus();
            }
        }
        if (i == 1) {
            return 0;
        }
        return handlePrepare(z);
    }

    public final int handlePrepare(boolean z) {
        if (this.audioManager == null) {
            return 1;
        }
        if (z) {
            return requestAudioFocus();
        }
        return -1;
    }

    public final int handleSetPlayWhenReady(boolean z, int i) {
        if (this.audioManager == null) {
            return 1;
        }
        if (!z) {
            abandonAudioFocus();
            return -1;
        } else if (i != 1) {
            return requestAudioFocus();
        } else {
            if (this.focusGain != 0) {
                return 0;
            }
            return 1;
        }
    }

    public final void handleStop() {
        if (this.audioManager != null) {
            abandonAudioFocus(true);
        }
    }

    private int requestAudioFocus() {
        int i;
        if (this.focusGain == 0) {
            if (this.audioFocusState != 0) {
                abandonAudioFocus(true);
            }
            return 1;
        }
        if (this.audioFocusState == 0) {
            if (Util.SDK_INT >= 26) {
                i = requestAudioFocusV26();
            } else {
                i = requestAudioFocusDefault();
            }
            this.audioFocusState = i == 1 ? 1 : 0;
        }
        int i2 = this.audioFocusState;
        if (i2 == 0) {
            return -1;
        }
        if (i2 == 2) {
            return 0;
        }
        return 1;
    }

    private void abandonAudioFocus() {
        abandonAudioFocus(false);
    }

    /* access modifiers changed from: private */
    public void abandonAudioFocus(boolean z) {
        if (this.focusGain != 0 || this.audioFocusState != 0) {
            if (this.focusGain != 1 || this.audioFocusState == -1 || z) {
                if (Util.SDK_INT >= 26) {
                    abandonAudioFocusV26();
                } else {
                    abandonAudioFocusDefault();
                }
                this.audioFocusState = 0;
            }
        }
    }

    private int requestAudioFocusDefault() {
        return ((AudioManager) Assertions.checkNotNull(this.audioManager)).requestAudioFocus(this.focusListener, Util.getStreamTypeForAudioUsage(((AudioAttributes) Assertions.checkNotNull(this.audioAttributes)).usage), this.focusGain);
    }

    @RequiresApi(26)
    private int requestAudioFocusV26() {
        if (this.audioFocusRequest == null || this.rebuildAudioFocusRequest) {
            this.audioFocusRequest = (this.audioFocusRequest == null ? new AudioFocusRequest.Builder(this.focusGain) : new AudioFocusRequest.Builder(this.audioFocusRequest)).setAudioAttributes(((AudioAttributes) Assertions.checkNotNull(this.audioAttributes)).getAudioAttributesV21()).setWillPauseWhenDucked(willPauseWhenDucked()).setOnAudioFocusChangeListener(this.focusListener).build();
            this.rebuildAudioFocusRequest = false;
        }
        return ((AudioManager) Assertions.checkNotNull(this.audioManager)).requestAudioFocus(this.audioFocusRequest);
    }

    private void abandonAudioFocusDefault() {
        ((AudioManager) Assertions.checkNotNull(this.audioManager)).abandonAudioFocus(this.focusListener);
    }

    @RequiresApi(26)
    private void abandonAudioFocusV26() {
        if (this.audioFocusRequest != null) {
            ((AudioManager) Assertions.checkNotNull(this.audioManager)).abandonAudioFocusRequest(this.audioFocusRequest);
        }
    }

    /* access modifiers changed from: private */
    public boolean willPauseWhenDucked() {
        AudioAttributes audioAttributes2 = this.audioAttributes;
        return audioAttributes2 != null && audioAttributes2.contentType == 1;
    }

    private static int convertAudioAttributesToFocusGain(@Nullable AudioAttributes audioAttributes2) {
        if (audioAttributes2 == null) {
            return 0;
        }
        switch (audioAttributes2.usage) {
            case 0:
                Log.w(TAG, "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (audioAttributes2.contentType == 1) {
                    return 2;
                }
                break;
            case 16:
                if (Util.SDK_INT >= 19) {
                    return 4;
                }
                return 2;
            default:
                StringBuilder sb = new StringBuilder("Unidentified audio usage: ");
                sb.append(audioAttributes2.usage);
                Log.w(TAG, sb.toString());
                return 0;
        }
        return 3;
    }

    class AudioFocusListener implements AudioManager.OnAudioFocusChangeListener {
        private AudioFocusListener() {
        }

        public void onAudioFocusChange(int i) {
            if (i != -3) {
                if (i == -2) {
                    int unused = AudioFocusManager.this.audioFocusState = 2;
                } else if (i == -1) {
                    int unused2 = AudioFocusManager.this.audioFocusState = -1;
                } else if (i != 1) {
                    Log.w(AudioFocusManager.TAG, "Unknown focus change type: ".concat(String.valueOf(i)));
                    return;
                } else {
                    int unused3 = AudioFocusManager.this.audioFocusState = 1;
                }
            } else if (AudioFocusManager.this.willPauseWhenDucked()) {
                int unused4 = AudioFocusManager.this.audioFocusState = 2;
            } else {
                int unused5 = AudioFocusManager.this.audioFocusState = 3;
            }
            int access$100 = AudioFocusManager.this.audioFocusState;
            if (access$100 == -1) {
                AudioFocusManager.this.playerControl.executePlayerCommand(-1);
                AudioFocusManager.this.abandonAudioFocus(true);
            } else if (access$100 != 0) {
                if (access$100 == 1) {
                    AudioFocusManager.this.playerControl.executePlayerCommand(1);
                } else if (access$100 == 2) {
                    AudioFocusManager.this.playerControl.executePlayerCommand(0);
                } else if (access$100 != 3) {
                    StringBuilder sb = new StringBuilder("Unknown audio focus state: ");
                    sb.append(AudioFocusManager.this.audioFocusState);
                    throw new IllegalStateException(sb.toString());
                }
            }
            float f = AudioFocusManager.this.audioFocusState == 3 ? 0.2f : 1.0f;
            if (AudioFocusManager.this.volumeMultiplier != f) {
                float unused6 = AudioFocusManager.this.volumeMultiplier = f;
                AudioFocusManager.this.playerControl.setVolumeMultiplier(f);
            }
        }
    }
}
