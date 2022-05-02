package com.google.android.exoplayer2.drm;

import android.annotation.TargetApi;
import android.media.MediaCrypto;
import com.google.android.exoplayer2.util.Assertions;

@TargetApi(16)
public final class FrameworkMediaCrypto implements ExoMediaCrypto {
    private final boolean forceAllowInsecureDecoderComponents;
    private final MediaCrypto mediaCrypto;

    public FrameworkMediaCrypto(MediaCrypto mediaCrypto2) {
        this(mediaCrypto2, false);
    }

    public FrameworkMediaCrypto(MediaCrypto mediaCrypto2, boolean z) {
        this.mediaCrypto = (MediaCrypto) Assertions.checkNotNull(mediaCrypto2);
        this.forceAllowInsecureDecoderComponents = z;
    }

    public final MediaCrypto getWrappedMediaCrypto() {
        return this.mediaCrypto;
    }

    public final boolean requiresSecureDecoderComponent(String str) {
        return !this.forceAllowInsecureDecoderComponents && this.mediaCrypto.requiresSecureDecoderComponent(str);
    }
}
