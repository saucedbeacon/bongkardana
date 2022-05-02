package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.setMax = versionedParcel.getMin(audioAttributesImplBase.setMax, 1);
        audioAttributesImplBase.getMin = versionedParcel.getMin(audioAttributesImplBase.getMin, 2);
        audioAttributesImplBase.setMin = versionedParcel.getMin(audioAttributesImplBase.setMin, 3);
        audioAttributesImplBase.length = versionedParcel.getMin(audioAttributesImplBase.length, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.getMax(audioAttributesImplBase.setMax, 1);
        versionedParcel.getMax(audioAttributesImplBase.getMin, 2);
        versionedParcel.getMax(audioAttributesImplBase.setMin, 3);
        versionedParcel.getMax(audioAttributesImplBase.length, 4);
    }
}
