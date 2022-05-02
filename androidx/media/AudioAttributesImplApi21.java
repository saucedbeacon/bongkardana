package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
class AudioAttributesImplApi21 implements AudioAttributesImpl {
    int getMin = -1;
    AudioAttributes length;

    AudioAttributesImplApi21() {
    }

    public int hashCode() {
        return this.length.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.length.equals(((AudioAttributesImplApi21) obj).length);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat: audioattributes=");
        sb.append(this.length);
        return sb.toString();
    }
}
