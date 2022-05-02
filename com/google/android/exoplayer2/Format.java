package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new Parcelable.Creator<Format>() {
        public final Format createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        public final Format[] newArray(int i) {
            return new Format[i];
        }
    };
    public static final int NO_VALUE = -1;
    public static final long OFFSET_SAMPLE_RELATIVE = Long.MAX_VALUE;
    public final int accessibilityChannel;
    public final int bitrate;
    public final int channelCount;
    @Nullable
    public final String codecs;
    @Nullable
    public final ColorInfo colorInfo;
    @Nullable
    public final String containerMimeType;
    @Nullable
    public final DrmInitData drmInitData;
    public final int encoderDelay;
    public final int encoderPadding;
    public final float frameRate;
    private int hashCode;
    public final int height;
    @Nullable

    /* renamed from: id  reason: collision with root package name */
    public final String f9530id;
    public final List<byte[]> initializationData;
    @Nullable
    public final String label;
    @Nullable
    public final String language;
    public final int maxInputSize;
    @Nullable
    public final Metadata metadata;
    public final int pcmEncoding;
    public final float pixelWidthHeightRatio;
    @Nullable
    public final byte[] projectionData;
    public final int rotationDegrees;
    @Nullable
    public final String sampleMimeType;
    public final int sampleRate;
    public final int selectionFlags;
    public final int stereoMode;
    public final long subsampleOffsetUs;
    public final int width;

    public final int describeContents() {
        return 0;
    }

    @Deprecated
    public static Format createVideoContainerFormat(@Nullable String str, @Nullable String str2, String str3, String str4, int i, int i2, int i3, float f, @Nullable List<byte[]> list, int i4) {
        return createVideoContainerFormat(str, (String) null, str2, str3, str4, i, i2, i3, f, list, i4);
    }

    public static Format createVideoContainerFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, String str4, String str5, int i, int i2, int i3, float f, @Nullable List<byte[]> list, int i4) {
        return new Format(str, str2, str3, str4, str5, i, -1, i2, i3, f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, i4, (String) null, -1, Long.MAX_VALUE, list, (DrmInitData) null, (Metadata) null);
    }

    public static Format createVideoSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, float f, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData2) {
        return createVideoSampleFormat(str, str2, str3, i, i2, i3, i4, f, list, -1, -1.0f, drmInitData2);
    }

    public static Format createVideoSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, float f, @Nullable List<byte[]> list, int i5, float f2, @Nullable DrmInitData drmInitData2) {
        return createVideoSampleFormat(str, str2, str3, i, i2, i3, i4, f, list, i5, f2, (byte[]) null, -1, (ColorInfo) null, drmInitData2);
    }

    public static Format createVideoSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, float f, @Nullable List<byte[]> list, int i5, float f2, byte[] bArr, int i6, @Nullable ColorInfo colorInfo2, @Nullable DrmInitData drmInitData2) {
        return new Format(str, (String) null, (String) null, str2, str3, i, i2, i3, i4, f, i5, f2, bArr, i6, colorInfo2, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, list, drmInitData2, (Metadata) null);
    }

    @Deprecated
    public static Format createAudioContainerFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, int i3, @Nullable List<byte[]> list, int i4, @Nullable String str5) {
        return createAudioContainerFormat(str, (String) null, str2, str3, str4, i, i2, i3, list, i4, str5);
    }

    public static Format createAudioContainerFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i, int i2, int i3, @Nullable List<byte[]> list, int i4, @Nullable String str6) {
        return new Format(str, str2, str3, str4, str5, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, i2, i3, -1, -1, -1, i4, str6, -1, Long.MAX_VALUE, list, (DrmInitData) null, (Metadata) null);
    }

    public static Format createAudioSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData2, int i5, @Nullable String str4) {
        return createAudioSampleFormat(str, str2, str3, i, i2, i3, i4, -1, list, drmInitData2, i5, str4);
    }

    public static Format createAudioSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, int i5, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData2, int i6, @Nullable String str4) {
        return createAudioSampleFormat(str, str2, str3, i, i2, i3, i4, i5, -1, -1, list, drmInitData2, i6, str4, (Metadata) null);
    }

    public static Format createAudioSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData2, int i8, @Nullable String str4, @Nullable Metadata metadata2) {
        return new Format(str, (String) null, (String) null, str2, str3, i, i2, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, i3, i4, i5, i6, i7, i8, str4, -1, Long.MAX_VALUE, list, drmInitData2, metadata2);
    }

    @Deprecated
    public static Format createTextContainerFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, @Nullable String str5) {
        return createTextContainerFormat(str, (String) null, str2, str3, str4, i, i2, str5);
    }

    public static Format createTextContainerFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i, int i2, @Nullable String str6) {
        return createTextContainerFormat(str, str2, str3, str4, str5, i, i2, str6, -1);
    }

    public static Format createTextContainerFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i, int i2, @Nullable String str6, int i3) {
        return new Format(str, str2, str3, str4, str5, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, i2, str6, i3, Long.MAX_VALUE, (List<byte[]>) null, (DrmInitData) null, (Metadata) null);
    }

    public static Format createTextSampleFormat(@Nullable String str, String str2, int i, @Nullable String str3) {
        return createTextSampleFormat(str, str2, i, str3, (DrmInitData) null);
    }

    public static Format createTextSampleFormat(@Nullable String str, String str2, int i, @Nullable String str3, @Nullable DrmInitData drmInitData2) {
        return createTextSampleFormat(str, str2, (String) null, -1, i, str3, -1, drmInitData2, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format createTextSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable String str4, int i3, @Nullable DrmInitData drmInitData2) {
        return createTextSampleFormat(str, str2, str3, i, i2, str4, i3, drmInitData2, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format createTextSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable String str4, @Nullable DrmInitData drmInitData2, long j) {
        return createTextSampleFormat(str, str2, str3, i, i2, str4, -1, drmInitData2, j, Collections.emptyList());
    }

    public static Format createTextSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable String str4, int i3, @Nullable DrmInitData drmInitData2, long j, List<byte[]> list) {
        return new Format(str, (String) null, (String) null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, i2, str4, i3, j, list, drmInitData2, (Metadata) null);
    }

    public static Format createImageSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable List<byte[]> list, @Nullable String str4, @Nullable DrmInitData drmInitData2) {
        return new Format(str, (String) null, (String) null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, i2, str4, -1, Long.MAX_VALUE, list, drmInitData2, (Metadata) null);
    }

    @Deprecated
    public static Format createContainerFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, @Nullable String str5) {
        return createContainerFormat(str, (String) null, str2, str3, str4, i, i2, str5);
    }

    public static Format createContainerFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i, int i2, @Nullable String str6) {
        return new Format(str, str2, str3, str4, str5, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, i2, str6, -1, Long.MAX_VALUE, (List<byte[]>) null, (DrmInitData) null, (Metadata) null);
    }

    public static Format createSampleFormat(@Nullable String str, @Nullable String str2, long j) {
        return new Format(str, (String) null, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, 0, (String) null, -1, j, (List<byte[]>) null, (DrmInitData) null, (Metadata) null);
    }

    public static Format createSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, @Nullable DrmInitData drmInitData2) {
        return new Format(str, (String) null, (String) null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, drmInitData2, (Metadata) null);
    }

    Format(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i, int i2, int i3, int i4, float f, int i5, float f2, @Nullable byte[] bArr, int i6, @Nullable ColorInfo colorInfo2, int i7, int i8, int i9, int i10, int i11, int i12, @Nullable String str6, int i13, long j, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData2, @Nullable Metadata metadata2) {
        this.f9530id = str;
        this.label = str2;
        this.containerMimeType = str3;
        this.sampleMimeType = str4;
        this.codecs = str5;
        this.bitrate = i;
        this.maxInputSize = i2;
        this.width = i3;
        this.height = i4;
        this.frameRate = f;
        int i14 = i5;
        this.rotationDegrees = i14 == -1 ? 0 : i14;
        this.pixelWidthHeightRatio = f2 == -1.0f ? 1.0f : f2;
        this.projectionData = bArr;
        this.stereoMode = i6;
        this.colorInfo = colorInfo2;
        this.channelCount = i7;
        this.sampleRate = i8;
        this.pcmEncoding = i9;
        int i15 = i10;
        this.encoderDelay = i15 == -1 ? 0 : i15;
        int i16 = i11;
        this.encoderPadding = i16 == -1 ? 0 : i16;
        this.selectionFlags = i12;
        this.language = str6;
        this.accessibilityChannel = i13;
        this.subsampleOffsetUs = j;
        this.initializationData = list == null ? Collections.emptyList() : list;
        this.drmInitData = drmInitData2;
        this.metadata = metadata2;
    }

    Format(Parcel parcel) {
        this.f9530id = parcel.readString();
        this.label = parcel.readString();
        this.containerMimeType = parcel.readString();
        this.sampleMimeType = parcel.readString();
        this.codecs = parcel.readString();
        this.bitrate = parcel.readInt();
        this.maxInputSize = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.frameRate = parcel.readFloat();
        this.rotationDegrees = parcel.readInt();
        this.pixelWidthHeightRatio = parcel.readFloat();
        this.projectionData = Util.readBoolean(parcel) ? parcel.createByteArray() : null;
        this.stereoMode = parcel.readInt();
        this.colorInfo = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.channelCount = parcel.readInt();
        this.sampleRate = parcel.readInt();
        this.pcmEncoding = parcel.readInt();
        this.encoderDelay = parcel.readInt();
        this.encoderPadding = parcel.readInt();
        this.selectionFlags = parcel.readInt();
        this.language = parcel.readString();
        this.accessibilityChannel = parcel.readInt();
        this.subsampleOffsetUs = parcel.readLong();
        int readInt = parcel.readInt();
        this.initializationData = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.initializationData.add(parcel.createByteArray());
        }
        this.drmInitData = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.metadata = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
    }

    public final Format copyWithMaxInputSize(int i) {
        String str = this.f9530id;
        return new Format(str, this.label, this.containerMimeType, this.sampleMimeType, this.codecs, this.bitrate, i, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.selectionFlags, this.language, this.accessibilityChannel, this.subsampleOffsetUs, this.initializationData, this.drmInitData, this.metadata);
    }

    public final Format copyWithSubsampleOffsetUs(long j) {
        return new Format(this.f9530id, this.label, this.containerMimeType, this.sampleMimeType, this.codecs, this.bitrate, this.maxInputSize, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.selectionFlags, this.language, this.accessibilityChannel, j, this.initializationData, this.drmInitData, this.metadata);
    }

    public final Format copyWithContainerInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, int i3, int i4, @Nullable String str5) {
        return new Format(str, str2, this.containerMimeType, str3, str4, i, this.maxInputSize, i2, i3, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, i4, str5, this.accessibilityChannel, this.subsampleOffsetUs, this.initializationData, this.drmInitData, this.metadata);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r6 = r1.language;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.exoplayer2.Format copyWithManifestFormatInfo(com.google.android.exoplayer2.Format r33) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            if (r0 != r1) goto L_0x0007
            return r0
        L_0x0007:
            java.lang.String r2 = r0.sampleMimeType
            int r2 = com.google.android.exoplayer2.util.MimeTypes.getTrackType(r2)
            java.lang.String r4 = r1.f9530id
            java.lang.String r3 = r1.label
            if (r3 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            java.lang.String r3 = r0.label
        L_0x0016:
            r5 = r3
            java.lang.String r3 = r0.language
            r6 = 3
            r7 = 1
            if (r2 == r6) goto L_0x001f
            if (r2 != r7) goto L_0x0026
        L_0x001f:
            java.lang.String r6 = r1.language
            if (r6 == 0) goto L_0x0026
            r25 = r6
            goto L_0x0028
        L_0x0026:
            r25 = r3
        L_0x0028:
            int r3 = r0.bitrate
            r6 = -1
            if (r3 != r6) goto L_0x002f
            int r3 = r1.bitrate
        L_0x002f:
            r9 = r3
            java.lang.String r3 = r0.codecs
            if (r3 != 0) goto L_0x0043
            java.lang.String r6 = r1.codecs
            java.lang.String r6 = com.google.android.exoplayer2.util.Util.getCodecsOfType(r6, r2)
            java.lang.String[] r8 = com.google.android.exoplayer2.util.Util.splitCodecs(r6)
            int r8 = r8.length
            if (r8 != r7) goto L_0x0043
            r8 = r6
            goto L_0x0044
        L_0x0043:
            r8 = r3
        L_0x0044:
            float r3 = r0.frameRate
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0053
            r6 = 2
            if (r2 != r6) goto L_0x0053
            float r2 = r1.frameRate
            r13 = r2
            goto L_0x0054
        L_0x0053:
            r13 = r3
        L_0x0054:
            int r2 = r0.selectionFlags
            int r3 = r1.selectionFlags
            r24 = r2 | r3
            com.google.android.exoplayer2.drm.DrmInitData r1 = r1.drmInitData
            com.google.android.exoplayer2.drm.DrmInitData r2 = r0.drmInitData
            com.google.android.exoplayer2.drm.DrmInitData r30 = com.google.android.exoplayer2.drm.DrmInitData.createSessionCreationData(r1, r2)
            com.google.android.exoplayer2.Format r1 = new com.google.android.exoplayer2.Format
            r3 = r1
            java.lang.String r6 = r0.containerMimeType
            java.lang.String r7 = r0.sampleMimeType
            int r10 = r0.maxInputSize
            int r11 = r0.width
            int r12 = r0.height
            int r14 = r0.rotationDegrees
            float r15 = r0.pixelWidthHeightRatio
            byte[] r2 = r0.projectionData
            r16 = r2
            int r2 = r0.stereoMode
            r17 = r2
            com.google.android.exoplayer2.video.ColorInfo r2 = r0.colorInfo
            r18 = r2
            int r2 = r0.channelCount
            r19 = r2
            int r2 = r0.sampleRate
            r20 = r2
            int r2 = r0.pcmEncoding
            r21 = r2
            int r2 = r0.encoderDelay
            r22 = r2
            int r2 = r0.encoderPadding
            r23 = r2
            int r2 = r0.accessibilityChannel
            r26 = r2
            r33 = r1
            long r1 = r0.subsampleOffsetUs
            r27 = r1
            java.util.List<byte[]> r1 = r0.initializationData
            r29 = r1
            com.google.android.exoplayer2.metadata.Metadata r1 = r0.metadata
            r31 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31)
            return r33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.Format.copyWithManifestFormatInfo(com.google.android.exoplayer2.Format):com.google.android.exoplayer2.Format");
    }

    public final Format copyWithGaplessInfo(int i, int i2) {
        String str = this.f9530id;
        return new Format(str, this.label, this.containerMimeType, this.sampleMimeType, this.codecs, this.bitrate, this.maxInputSize, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, i, i2, this.selectionFlags, this.language, this.accessibilityChannel, this.subsampleOffsetUs, this.initializationData, this.drmInitData, this.metadata);
    }

    public final Format copyWithDrmInitData(@Nullable DrmInitData drmInitData2) {
        String str = this.f9530id;
        return new Format(str, this.label, this.containerMimeType, this.sampleMimeType, this.codecs, this.bitrate, this.maxInputSize, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.selectionFlags, this.language, this.accessibilityChannel, this.subsampleOffsetUs, this.initializationData, drmInitData2, this.metadata);
    }

    public final Format copyWithMetadata(@Nullable Metadata metadata2) {
        String str = this.f9530id;
        return new Format(str, this.label, this.containerMimeType, this.sampleMimeType, this.codecs, this.bitrate, this.maxInputSize, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.selectionFlags, this.language, this.accessibilityChannel, this.subsampleOffsetUs, this.initializationData, this.drmInitData, metadata2);
    }

    public final Format copyWithRotationDegrees(int i) {
        String str = this.f9530id;
        return new Format(str, this.label, this.containerMimeType, this.sampleMimeType, this.codecs, this.bitrate, this.maxInputSize, this.width, this.height, this.frameRate, i, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.selectionFlags, this.language, this.accessibilityChannel, this.subsampleOffsetUs, this.initializationData, this.drmInitData, this.metadata);
    }

    public final int getPixelCount() {
        int i;
        int i2 = this.width;
        if (i2 == -1 || (i = this.height) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f9530id);
        sb.append(", ");
        sb.append(this.label);
        sb.append(", ");
        sb.append(this.containerMimeType);
        sb.append(", ");
        sb.append(this.sampleMimeType);
        sb.append(", ");
        sb.append(this.codecs);
        sb.append(", ");
        sb.append(this.bitrate);
        sb.append(", ");
        sb.append(this.language);
        sb.append(", [");
        sb.append(this.width);
        sb.append(", ");
        sb.append(this.height);
        sb.append(", ");
        sb.append(this.frameRate);
        sb.append("], [");
        sb.append(this.channelCount);
        sb.append(", ");
        sb.append(this.sampleRate);
        sb.append("])");
        return sb.toString();
    }

    public final int hashCode() {
        if (this.hashCode == 0) {
            String str = this.f9530id;
            int i = 0;
            int hashCode2 = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.containerMimeType;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.sampleMimeType;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.codecs;
            int hashCode5 = (((((((((((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.bitrate) * 31) + this.width) * 31) + this.height) * 31) + this.channelCount) * 31) + this.sampleRate) * 31;
            String str5 = this.language;
            int hashCode6 = (((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.accessibilityChannel) * 31;
            DrmInitData drmInitData2 = this.drmInitData;
            int hashCode7 = (hashCode6 + (drmInitData2 == null ? 0 : drmInitData2.hashCode())) * 31;
            Metadata metadata2 = this.metadata;
            int hashCode8 = (hashCode7 + (metadata2 == null ? 0 : metadata2.hashCode())) * 31;
            String str6 = this.label;
            if (str6 != null) {
                i = str6.hashCode();
            }
            this.hashCode = ((((((((((((((((((((hashCode8 + i) * 31) + this.maxInputSize) * 31) + ((int) this.subsampleOffsetUs)) * 31) + Float.floatToIntBits(this.frameRate)) * 31) + Float.floatToIntBits(this.pixelWidthHeightRatio)) * 31) + this.rotationDegrees) * 31) + this.stereoMode) * 31) + this.pcmEncoding) * 31) + this.encoderDelay) * 31) + this.encoderPadding) * 31) + this.selectionFlags;
        }
        return this.hashCode;
    }

    public final boolean equals(@Nullable Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Format format = (Format) obj;
            int i2 = this.hashCode;
            if ((i2 == 0 || (i = format.hashCode) == 0 || i2 == i) && this.bitrate == format.bitrate && this.maxInputSize == format.maxInputSize && this.width == format.width && this.height == format.height && Float.compare(this.frameRate, format.frameRate) == 0 && this.rotationDegrees == format.rotationDegrees && Float.compare(this.pixelWidthHeightRatio, format.pixelWidthHeightRatio) == 0 && this.stereoMode == format.stereoMode && this.channelCount == format.channelCount && this.sampleRate == format.sampleRate && this.pcmEncoding == format.pcmEncoding && this.encoderDelay == format.encoderDelay && this.encoderPadding == format.encoderPadding && this.subsampleOffsetUs == format.subsampleOffsetUs && this.selectionFlags == format.selectionFlags && Util.areEqual(this.f9530id, format.f9530id) && Util.areEqual(this.label, format.label) && Util.areEqual(this.language, format.language) && this.accessibilityChannel == format.accessibilityChannel && Util.areEqual(this.containerMimeType, format.containerMimeType) && Util.areEqual(this.sampleMimeType, format.sampleMimeType) && Util.areEqual(this.codecs, format.codecs) && Util.areEqual(this.drmInitData, format.drmInitData) && Util.areEqual(this.metadata, format.metadata) && Util.areEqual(this.colorInfo, format.colorInfo) && Arrays.equals(this.projectionData, format.projectionData) && initializationDataEquals(format)) {
                return true;
            }
        }
        return false;
    }

    public final boolean initializationDataEquals(Format format) {
        if (this.initializationData.size() != format.initializationData.size()) {
            return false;
        }
        for (int i = 0; i < this.initializationData.size(); i++) {
            if (!Arrays.equals(this.initializationData.get(i), format.initializationData.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static String toLogString(@Nullable Format format) {
        if (format == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(format.f9530id);
        sb.append(", mimeType=");
        sb.append(format.sampleMimeType);
        if (format.bitrate != -1) {
            sb.append(", bitrate=");
            sb.append(format.bitrate);
        }
        if (format.codecs != null) {
            sb.append(", codecs=");
            sb.append(format.codecs);
        }
        if (!(format.width == -1 || format.height == -1)) {
            sb.append(", res=");
            sb.append(format.width);
            sb.append("x");
            sb.append(format.height);
        }
        if (format.frameRate != -1.0f) {
            sb.append(", fps=");
            sb.append(format.frameRate);
        }
        if (format.channelCount != -1) {
            sb.append(", channels=");
            sb.append(format.channelCount);
        }
        if (format.sampleRate != -1) {
            sb.append(", sample_rate=");
            sb.append(format.sampleRate);
        }
        if (format.language != null) {
            sb.append(", language=");
            sb.append(format.language);
        }
        if (format.label != null) {
            sb.append(", label=");
            sb.append(format.label);
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9530id);
        parcel.writeString(this.label);
        parcel.writeString(this.containerMimeType);
        parcel.writeString(this.sampleMimeType);
        parcel.writeString(this.codecs);
        parcel.writeInt(this.bitrate);
        parcel.writeInt(this.maxInputSize);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.frameRate);
        parcel.writeInt(this.rotationDegrees);
        parcel.writeFloat(this.pixelWidthHeightRatio);
        Util.writeBoolean(parcel, this.projectionData != null);
        byte[] bArr = this.projectionData;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.stereoMode);
        parcel.writeParcelable(this.colorInfo, i);
        parcel.writeInt(this.channelCount);
        parcel.writeInt(this.sampleRate);
        parcel.writeInt(this.pcmEncoding);
        parcel.writeInt(this.encoderDelay);
        parcel.writeInt(this.encoderPadding);
        parcel.writeInt(this.selectionFlags);
        parcel.writeString(this.language);
        parcel.writeInt(this.accessibilityChannel);
        parcel.writeLong(this.subsampleOffsetUs);
        int size = this.initializationData.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.initializationData.get(i2));
        }
        parcel.writeParcelable(this.drmInitData, 0);
        parcel.writeParcelable(this.metadata, 0);
    }
}
