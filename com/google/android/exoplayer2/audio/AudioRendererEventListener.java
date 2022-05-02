package com.google.android.exoplayer2.audio;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.util.Assertions;
import o.getView;
import o.onCreateAnimator;
import o.onMultiWindowModeChanged;
import o.onPictureInPictureModeChanged;
import o.requireView;
import o.restoreChildFragmentState;

public interface AudioRendererEventListener {
    void onAudioDecoderInitialized(String str, long j, long j2);

    void onAudioDisabled(DecoderCounters decoderCounters);

    void onAudioEnabled(DecoderCounters decoderCounters);

    void onAudioInputFormatChanged(Format format);

    void onAudioSessionId(int i);

    void onAudioSinkUnderrun(int i, long j, long j2);

    public static final class EventDispatcher {
        @Nullable
        private final Handler handler;
        @Nullable
        private final AudioRendererEventListener listener;

        public EventDispatcher(@Nullable Handler handler2, @Nullable AudioRendererEventListener audioRendererEventListener) {
            this.handler = audioRendererEventListener != null ? (Handler) Assertions.checkNotNull(handler2) : null;
            this.listener = audioRendererEventListener;
        }

        public final void enabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new getView(this, decoderCounters));
            }
        }

        public final /* synthetic */ void lambda$enabled$0(DecoderCounters decoderCounters) {
            this.listener.onAudioEnabled(decoderCounters);
        }

        public final void decoderInitialized(String str, long j, long j2) {
            if (this.listener != null) {
                this.handler.post(new onCreateAnimator(this, str, j, j2));
            }
        }

        public final /* synthetic */ void lambda$decoderInitialized$1(String str, long j, long j2) {
            this.listener.onAudioDecoderInitialized(str, j, j2);
        }

        public final void inputFormatChanged(Format format) {
            if (this.listener != null) {
                this.handler.post(new restoreChildFragmentState(this, format));
            }
        }

        public final /* synthetic */ void lambda$inputFormatChanged$2(Format format) {
            this.listener.onAudioInputFormatChanged(format);
        }

        public final void audioTrackUnderrun(int i, long j, long j2) {
            if (this.listener != null) {
                this.handler.post(new onMultiWindowModeChanged(this, i, j, j2));
            }
        }

        public final /* synthetic */ void lambda$audioTrackUnderrun$3(int i, long j, long j2) {
            this.listener.onAudioSinkUnderrun(i, j, j2);
        }

        public final void disabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new onPictureInPictureModeChanged(this, decoderCounters));
            }
        }

        public final /* synthetic */ void lambda$disabled$4(DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            this.listener.onAudioDisabled(decoderCounters);
        }

        public final void audioSessionId(int i) {
            if (this.listener != null) {
                this.handler.post(new requireView(this, i));
            }
        }

        public final /* synthetic */ void lambda$audioSessionId$5(int i) {
            this.listener.onAudioSessionId(i);
        }
    }
}
