package com.google.android.exoplayer2.text.cea;

import java.util.Collections;
import java.util.List;

public final class Cea708InitializationData {
    public final boolean isWideAspectRatio;

    private Cea708InitializationData(List<byte[]> list) {
        this.isWideAspectRatio = list.get(0)[0] != 0;
    }

    public static Cea708InitializationData fromData(List<byte[]> list) {
        return new Cea708InitializationData(list);
    }

    public static List<byte[]> buildData(boolean z) {
        return Collections.singletonList(new byte[]{z ? (byte) 1 : 0});
    }
}
