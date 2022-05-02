package o;

import com.google.android.exoplayer2.util.MimeTypes;

public final class recoverFocusFromState {
    final int IsOverlapping = 2;
    final int equals = (44100 * 2);
    public String getMax = MimeTypes.AUDIO_AAC;
    public int getMin = 44100;
    public String length;
    public int setMax;
    public int setMin = 1;
    final int toFloatRange = 2;

    /* access modifiers changed from: package-private */
    public final int setMin() {
        int i = this.setMin;
        if (i == 1) {
            return 16;
        }
        if (i == 2) {
            return 12;
        }
        StringBuilder sb = new StringBuilder("Invalid number of channels: ");
        sb.append(this.setMin);
        throw new RuntimeException(sb.toString());
    }
}
