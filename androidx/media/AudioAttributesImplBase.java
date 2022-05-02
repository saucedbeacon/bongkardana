package androidx.media;

import com.alipay.iap.android.aplog.util.zip.LZMA_Base;
import java.util.Arrays;

class AudioAttributesImplBase implements AudioAttributesImpl {
    int getMin = 0;
    int length = -1;
    int setMax = 0;
    int setMin = 0;

    AudioAttributesImplBase() {
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.getMin), Integer.valueOf(this.setMin), Integer.valueOf(this.setMax), Integer.valueOf(this.length)});
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.getMin == audioAttributesImplBase.getMin) {
            int i = this.setMin;
            int i2 = audioAttributesImplBase.setMin;
            int i3 = audioAttributesImplBase.length;
            if (i3 == -1) {
                i3 = AudioAttributesCompat.setMin(false, i2, audioAttributesImplBase.setMax);
            }
            if (i3 == 6) {
                i2 |= 4;
            } else if (i3 == 7) {
                i2 |= 1;
            }
            if (i == (i2 & LZMA_Base.kMatchMaxLen) && this.setMax == audioAttributesImplBase.setMax && this.length == audioAttributesImplBase.length) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.length != -1) {
            sb.append(" stream=");
            sb.append(this.length);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.setMin(this.setMax));
        sb.append(" content=");
        sb.append(this.getMin);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.setMin).toUpperCase());
        return sb.toString();
    }
}
