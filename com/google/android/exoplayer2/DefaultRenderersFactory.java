package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.metadata.MetadataRenderer;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.text.TextRenderer;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.video.MediaCodecVideoRenderer;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.spherical.CameraMotionRenderer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

public class DefaultRenderersFactory implements RenderersFactory {
    public static final long DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS = 5000;
    public static final int EXTENSION_RENDERER_MODE_OFF = 0;
    public static final int EXTENSION_RENDERER_MODE_ON = 1;
    public static final int EXTENSION_RENDERER_MODE_PREFER = 2;
    protected static final int MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY = 50;
    private static final String TAG = "DefaultRenderersFactory";
    private final long allowedVideoJoiningTimeMs;
    private final Context context;
    @Nullable
    private final DrmSessionManager<FrameworkMediaCrypto> drmSessionManager;
    private final int extensionRendererMode;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ExtensionRendererMode {
    }

    /* access modifiers changed from: protected */
    public AudioProcessor[] buildAudioProcessors() {
        return new AudioProcessor[0];
    }

    /* access modifiers changed from: protected */
    public void buildMiscellaneousRenderers(Context context2, Handler handler, int i, ArrayList<Renderer> arrayList) {
    }

    public DefaultRenderersFactory(Context context2) {
        this(context2, 0);
    }

    @Deprecated
    public DefaultRenderersFactory(Context context2, @Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager2) {
        this(context2, drmSessionManager2, 0);
    }

    public DefaultRenderersFactory(Context context2, int i) {
        this(context2, i, 5000);
    }

    @Deprecated
    public DefaultRenderersFactory(Context context2, @Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager2, int i) {
        this(context2, drmSessionManager2, i, 5000);
    }

    public DefaultRenderersFactory(Context context2, int i, long j) {
        this.context = context2;
        this.extensionRendererMode = i;
        this.allowedVideoJoiningTimeMs = j;
        this.drmSessionManager = null;
    }

    @Deprecated
    public DefaultRenderersFactory(Context context2, @Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager2, int i, long j) {
        this.context = context2;
        this.extensionRendererMode = i;
        this.allowedVideoJoiningTimeMs = j;
        this.drmSessionManager = drmSessionManager2;
    }

    public Renderer[] createRenderers(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput, @Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager2) {
        DrmSessionManager<FrameworkMediaCrypto> drmSessionManager3 = drmSessionManager2 == null ? this.drmSessionManager : drmSessionManager2;
        ArrayList arrayList = new ArrayList();
        DrmSessionManager<FrameworkMediaCrypto> drmSessionManager4 = drmSessionManager3;
        buildVideoRenderers(this.context, drmSessionManager4, this.allowedVideoJoiningTimeMs, handler, videoRendererEventListener, this.extensionRendererMode, arrayList);
        buildAudioRenderers(this.context, drmSessionManager4, buildAudioProcessors(), handler, audioRendererEventListener, this.extensionRendererMode, arrayList);
        ArrayList arrayList2 = arrayList;
        buildTextRenderers(this.context, textOutput, handler.getLooper(), this.extensionRendererMode, arrayList2);
        buildMetadataRenderers(this.context, metadataOutput, handler.getLooper(), this.extensionRendererMode, arrayList2);
        buildCameraMotionRenderers(this.context, this.extensionRendererMode, arrayList);
        Handler handler2 = handler;
        buildMiscellaneousRenderers(this.context, handler, this.extensionRendererMode, arrayList);
        return (Renderer[]) arrayList.toArray(new Renderer[arrayList.size()]);
    }

    /* access modifiers changed from: protected */
    public void buildVideoRenderers(Context context2, @Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager2, long j, Handler handler, VideoRendererEventListener videoRendererEventListener, int i, ArrayList<Renderer> arrayList) {
        int i2 = i;
        ArrayList<Renderer> arrayList2 = arrayList;
        arrayList2.add(new MediaCodecVideoRenderer(context2, MediaCodecSelector.DEFAULT, j, drmSessionManager2, false, handler, videoRendererEventListener, 50));
        if (i2 != 0) {
            int size = arrayList.size();
            if (i2 == 2) {
                size--;
            }
            try {
                arrayList2.add(size, (Renderer) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(new Class[]{Boolean.TYPE, Long.TYPE, Handler.class, VideoRendererEventListener.class, Integer.TYPE}).newInstance(new Object[]{Boolean.TRUE, Long.valueOf(j), handler, videoRendererEventListener, 50}));
                Log.i(TAG, "Loaded LibvpxVideoRenderer.");
            } catch (ClassNotFoundException unused) {
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating VP9 extension", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        throw new java.lang.RuntimeException("Error instantiating Opus extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a5, code lost:
        throw new java.lang.RuntimeException("Error instantiating FLAC extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0060 A[ExcHandler: Exception (r0v7 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d A[ExcHandler: Exception (r0v6 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:20:0x006c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void buildAudioRenderers(android.content.Context r14, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionManager<com.google.android.exoplayer2.drm.FrameworkMediaCrypto> r15, com.google.android.exoplayer2.audio.AudioProcessor[] r16, android.os.Handler r17, com.google.android.exoplayer2.audio.AudioRendererEventListener r18, int r19, java.util.ArrayList<com.google.android.exoplayer2.Renderer> r20) {
        /*
            r13 = this;
            r0 = r19
            r10 = r20
            java.lang.String r11 = "DefaultRenderersFactory"
            com.google.android.exoplayer2.audio.MediaCodecAudioRenderer r12 = new com.google.android.exoplayer2.audio.MediaCodecAudioRenderer
            com.google.android.exoplayer2.mediacodec.MediaCodecSelector r3 = com.google.android.exoplayer2.mediacodec.MediaCodecSelector.DEFAULT
            com.google.android.exoplayer2.audio.AudioCapabilities r8 = com.google.android.exoplayer2.audio.AudioCapabilities.getCapabilities((android.content.Context) r14)
            r5 = 0
            r1 = r12
            r2 = r14
            r4 = r15
            r6 = r17
            r7 = r18
            r9 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.add(r12)
            if (r0 != 0) goto L_0x0021
            return
        L_0x0021:
            int r1 = r20.size()
            r2 = 2
            if (r0 != r2) goto L_0x002a
            int r1 = r1 + -1
        L_0x002a:
            r0 = 0
            r3 = 3
            r4 = 1
            java.lang.String r5 = "com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            r6[r0] = r7     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            java.lang.Class<com.google.android.exoplayer2.audio.AudioRendererEventListener> r7 = com.google.android.exoplayer2.audio.AudioRendererEventListener.class
            r6[r4] = r7     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            java.lang.Class<com.google.android.exoplayer2.audio.AudioProcessor[]> r7 = com.google.android.exoplayer2.audio.AudioProcessor[].class
            r6[r2] = r7     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            java.lang.reflect.Constructor r5 = r5.getConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            r6[r0] = r17     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            r6[r4] = r18     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            r6[r2] = r16     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            java.lang.Object r5 = r5.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            com.google.android.exoplayer2.Renderer r5 = (com.google.android.exoplayer2.Renderer) r5     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            int r6 = r1 + 1
            r10.add(r1, r5)     // Catch:{ ClassNotFoundException -> 0x005e, Exception -> 0x0060 }
            java.lang.String r1 = "Loaded LibopusAudioRenderer."
            com.google.android.exoplayer2.util.Log.i(r11, r1)     // Catch:{ ClassNotFoundException -> 0x005e, Exception -> 0x0060 }
            goto L_0x006a
        L_0x005e:
            r1 = r6
            goto L_0x0069
        L_0x0060:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating Opus extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x0069:
            r6 = r1
        L_0x006a:
            java.lang.String r1 = "com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009d }
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009d }
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            r5[r0] = r7     // Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009d }
            java.lang.Class<com.google.android.exoplayer2.audio.AudioRendererEventListener> r7 = com.google.android.exoplayer2.audio.AudioRendererEventListener.class
            r5[r4] = r7     // Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009d }
            java.lang.Class<com.google.android.exoplayer2.audio.AudioProcessor[]> r7 = com.google.android.exoplayer2.audio.AudioProcessor[].class
            r5[r2] = r7     // Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009d }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r5)     // Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009d }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009d }
            r5[r0] = r17     // Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009d }
            r5[r4] = r18     // Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009d }
            r5[r2] = r16     // Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009d }
            java.lang.Object r1 = r1.newInstance(r5)     // Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009d }
            com.google.android.exoplayer2.Renderer r1 = (com.google.android.exoplayer2.Renderer) r1     // Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009d }
            int r5 = r6 + 1
            r10.add(r6, r1)     // Catch:{ ClassNotFoundException -> 0x009b, Exception -> 0x009d }
            java.lang.String r1 = "Loaded LibflacAudioRenderer."
            com.google.android.exoplayer2.util.Log.i(r11, r1)     // Catch:{ ClassNotFoundException -> 0x009b, Exception -> 0x009d }
            goto L_0x00a7
        L_0x009b:
            r6 = r5
            goto L_0x00a6
        L_0x009d:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FLAC extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00a6:
            r5 = r6
        L_0x00a7:
            java.lang.String r1 = "com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00df, Exception -> 0x00d6 }
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x00df, Exception -> 0x00d6 }
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            r6[r0] = r7     // Catch:{ ClassNotFoundException -> 0x00df, Exception -> 0x00d6 }
            java.lang.Class<com.google.android.exoplayer2.audio.AudioRendererEventListener> r7 = com.google.android.exoplayer2.audio.AudioRendererEventListener.class
            r6[r4] = r7     // Catch:{ ClassNotFoundException -> 0x00df, Exception -> 0x00d6 }
            java.lang.Class<com.google.android.exoplayer2.audio.AudioProcessor[]> r7 = com.google.android.exoplayer2.audio.AudioProcessor[].class
            r6[r2] = r7     // Catch:{ ClassNotFoundException -> 0x00df, Exception -> 0x00d6 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x00df, Exception -> 0x00d6 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x00df, Exception -> 0x00d6 }
            r3[r0] = r17     // Catch:{ ClassNotFoundException -> 0x00df, Exception -> 0x00d6 }
            r3[r4] = r18     // Catch:{ ClassNotFoundException -> 0x00df, Exception -> 0x00d6 }
            r3[r2] = r16     // Catch:{ ClassNotFoundException -> 0x00df, Exception -> 0x00d6 }
            java.lang.Object r0 = r1.newInstance(r3)     // Catch:{ ClassNotFoundException -> 0x00df, Exception -> 0x00d6 }
            com.google.android.exoplayer2.Renderer r0 = (com.google.android.exoplayer2.Renderer) r0     // Catch:{ ClassNotFoundException -> 0x00df, Exception -> 0x00d6 }
            r10.add(r5, r0)     // Catch:{ ClassNotFoundException -> 0x00df, Exception -> 0x00d6 }
            java.lang.String r0 = "Loaded FfmpegAudioRenderer."
            com.google.android.exoplayer2.util.Log.i(r11, r0)     // Catch:{ ClassNotFoundException -> 0x00df, Exception -> 0x00d6 }
            return
        L_0x00d6:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FFmpeg extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.DefaultRenderersFactory.buildAudioRenderers(android.content.Context, com.google.android.exoplayer2.drm.DrmSessionManager, com.google.android.exoplayer2.audio.AudioProcessor[], android.os.Handler, com.google.android.exoplayer2.audio.AudioRendererEventListener, int, java.util.ArrayList):void");
    }

    /* access modifiers changed from: protected */
    public void buildTextRenderers(Context context2, TextOutput textOutput, Looper looper, int i, ArrayList<Renderer> arrayList) {
        arrayList.add(new TextRenderer(textOutput, looper));
    }

    /* access modifiers changed from: protected */
    public void buildMetadataRenderers(Context context2, MetadataOutput metadataOutput, Looper looper, int i, ArrayList<Renderer> arrayList) {
        arrayList.add(new MetadataRenderer(metadataOutput, looper));
    }

    /* access modifiers changed from: protected */
    public void buildCameraMotionRenderers(Context context2, int i, ArrayList<Renderer> arrayList) {
        arrayList.add(new CameraMotionRenderer());
    }
}
