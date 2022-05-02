package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.length = (AudioAttributes) versionedParcel.setMax(audioAttributesImplApi21.length, 1);
        audioAttributesImplApi21.getMin = versionedParcel.getMin(audioAttributesImplApi21.getMin, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.getMax((Parcelable) audioAttributesImplApi21.length, 1);
        versionedParcel.getMax(audioAttributesImplApi21.getMin, 2);
    }
}
