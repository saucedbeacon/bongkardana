package com.google.android.exoplayer2.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

public final class AudioCapabilitiesReceiver {
    @Nullable
    AudioCapabilities audioCapabilities;
    private final Context context;
    @Nullable
    private final Handler handler;
    /* access modifiers changed from: private */
    public final Listener listener;
    @Nullable
    private final BroadcastReceiver receiver;

    public interface Listener {
        void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities);
    }

    public AudioCapabilitiesReceiver(Context context2, Listener listener2) {
        this(context2, (Handler) null, listener2);
    }

    public AudioCapabilitiesReceiver(Context context2, @Nullable Handler handler2, Listener listener2) {
        this.context = (Context) Assertions.checkNotNull(context2);
        this.handler = handler2;
        this.listener = (Listener) Assertions.checkNotNull(listener2);
        this.receiver = Util.SDK_INT >= 21 ? new HdmiAudioPlugBroadcastReceiver() : null;
    }

    public final AudioCapabilities register() {
        Intent intent = null;
        if (this.receiver != null) {
            IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
            Handler handler2 = this.handler;
            if (handler2 != null) {
                intent = this.context.registerReceiver(this.receiver, intentFilter, (String) null, handler2);
            } else {
                intent = this.context.registerReceiver(this.receiver, intentFilter);
            }
        }
        AudioCapabilities capabilities = AudioCapabilities.getCapabilities(intent);
        this.audioCapabilities = capabilities;
        return capabilities;
    }

    public final void unregister() {
        BroadcastReceiver broadcastReceiver = this.receiver;
        if (broadcastReceiver != null) {
            this.context.unregisterReceiver(broadcastReceiver);
        }
    }

    final class HdmiAudioPlugBroadcastReceiver extends BroadcastReceiver {
        private HdmiAudioPlugBroadcastReceiver() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                AudioCapabilities capabilities = AudioCapabilities.getCapabilities(intent);
                if (!capabilities.equals(AudioCapabilitiesReceiver.this.audioCapabilities)) {
                    AudioCapabilitiesReceiver.this.audioCapabilities = capabilities;
                    AudioCapabilitiesReceiver.this.listener.onAudioCapabilitiesChanged(capabilities);
                }
            }
        }
    }
}
