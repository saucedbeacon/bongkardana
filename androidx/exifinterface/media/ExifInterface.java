package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alipay.iap.android.aplog.util.zip.LZMA_Base;
import com.google.android.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

public final class ExifInterface {
    private static final byte[] FastBitmap$CoordinateSystem = {109, 105, 102, Framer.STDOUT_FRAME_PREFIX};
    private static final byte[] Grayscale$Algorithm = {79, 76, 89, 77, 80, 0};
    private static final setMax ICustomTabsCallback = new setMax("StripOffsets", LZMA_Base.kMatchMaxLen, 3);
    private static final setMax ICustomTabsCallback$Default = new setMax("JPEGInterchangeFormatLength", 514, 4);
    private static final setMax ICustomTabsCallback$Stub = new setMax("JPEGInterchangeFormat", 513, 4);
    private static final byte[] ICustomTabsService = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(equals);
    private static final Pattern IPostMessageService$Stub$Proxy = Pattern.compile(".*[1-9].*");
    static final int[] IsOverlapping = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    private static SimpleDateFormat Mean$Arithmetic;
    private static final HashMap<String, setMax>[] asBinder;
    private static final HashMap<Integer, setMax>[] asInterface;
    private static final setMax[] b = {new setMax("GPSVersionID", 0, 1), new setMax("GPSLatitudeRef", 1, 2), new setMax("GPSLatitude", 2, 5), new setMax("GPSLongitudeRef", 3, 2), new setMax("GPSLongitude", 4, 5), new setMax("GPSAltitudeRef", 5, 1), new setMax("GPSAltitude", 6, 5), new setMax("GPSTimeStamp", 7, 5), new setMax("GPSSatellites", 8, 2), new setMax("GPSStatus", 9, 2), new setMax("GPSMeasureMode", 10, 2), new setMax("GPSDOP", 11, 5), new setMax("GPSSpeedRef", 12, 2), new setMax("GPSSpeed", 13, 5), new setMax("GPSTrackRef", 14, 2), new setMax("GPSTrack", 15, 5), new setMax("GPSImgDirectionRef", 16, 2), new setMax("GPSImgDirection", 17, 5), new setMax("GPSMapDatum", 18, 2), new setMax("GPSDestLatitudeRef", 19, 2), new setMax("GPSDestLatitude", 20, 5), new setMax("GPSDestLongitudeRef", 21, 2), new setMax("GPSDestLongitude", 22, 5), new setMax("GPSDestBearingRef", 23, 2), new setMax("GPSDestBearing", 24, 5), new setMax("GPSDestDistanceRef", 25, 2), new setMax("GPSDestDistance", 26, 5), new setMax("GPSProcessingMethod", 27, 7), new setMax("GPSAreaInformation", 28, 7), new setMax("GPSDateStamp", 29, 2), new setMax("GPSDifferential", 30, 3)};
    private static final setMax[] create = {new setMax("InteroperabilityIndex", 1, 2)};
    static final Charset equals;
    private static final setMax[] extraCallback = {new setMax("AspectFrame", 4371, 3)};
    private static final setMax[] extraCallbackWithResult = {new setMax("SubIFDPointer", 330, 4), new setMax("ExifIFDPointer", 34665, 4), new setMax("GPSInfoIFDPointer", 34853, 4), new setMax("InteroperabilityIFDPointer", 40965, 4), new setMax("CameraSettingsIFDPointer", 8224, 1), new setMax("ImageProcessingIFDPointer", 8256, 1)};
    private static final setMax[] getCause = {new setMax("NewSubfileType", 254, 4), new setMax("SubfileType", 255, 4), new setMax("ThumbnailImageWidth", 256), new setMax("ThumbnailImageLength", 257), new setMax("BitsPerSample", 258, 3), new setMax("Compression", 259, 3), new setMax("PhotometricInterpretation", 262, 3), new setMax("ImageDescription", 270, 2), new setMax("Make", 271, 2), new setMax("Model", LZMA_Base.kNumLenSymbols, 2), new setMax("StripOffsets", LZMA_Base.kMatchMaxLen), new setMax("ThumbnailOrientation", 274, 3), new setMax("SamplesPerPixel", 277, 3), new setMax("RowsPerStrip", 278), new setMax("StripByteCounts", 279), new setMax("XResolution", 282, 5), new setMax("YResolution", 283, 5), new setMax("PlanarConfiguration", 284, 3), new setMax("ResolutionUnit", 296, 3), new setMax("TransferFunction", 301, 3), new setMax("Software", SecExceptionCode.SEC_ERROR_STA_INCORRECT_DATA_FILE_DATA, 2), new setMax("DateTime", SecExceptionCode.SEC_ERROR_STA_KEY_NOT_EXISTED, 2), new setMax("Artist", 315, 2), new setMax("WhitePoint", 318, 5), new setMax("PrimaryChromaticities", 319, 5), new setMax("SubIFDPointer", 330, 4), new setMax("JPEGInterchangeFormat", 513, 4), new setMax("JPEGInterchangeFormatLength", 514, 4), new setMax("YCbCrCoefficients", 529, 5), new setMax("YCbCrSubSampling", 530, 3), new setMax("YCbCrPositioning", 531, 3), new setMax("ReferenceBlackWhite", 532, 5), new setMax("Copyright", 33432, 2), new setMax("ExifIFDPointer", 34665, 4), new setMax("GPSInfoIFDPointer", 34853, 4), new setMax("DNGVersion", 50706, 1), new setMax("DefaultCropSize", 50720)};
    private static final HashMap<Integer, Integer> getDefaultImpl = new HashMap<>();
    static final byte[] getMax = {-1, -40, -1};
    static final String[] getMin = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    private static final List<Integer> hashCode = Arrays.asList(new Integer[]{1, 6, 3, 8});
    private static final setMax[] invoke = {new setMax("NewSubfileType", 254, 4), new setMax("SubfileType", 255, 4), new setMax("ImageWidth", 256), new setMax("ImageLength", 257), new setMax("BitsPerSample", 258, 3), new setMax("Compression", 259, 3), new setMax("PhotometricInterpretation", 262, 3), new setMax("ImageDescription", 270, 2), new setMax("Make", 271, 2), new setMax("Model", LZMA_Base.kNumLenSymbols, 2), new setMax("StripOffsets", LZMA_Base.kMatchMaxLen), new setMax("Orientation", 274, 3), new setMax("SamplesPerPixel", 277, 3), new setMax("RowsPerStrip", 278), new setMax("StripByteCounts", 279), new setMax("XResolution", 282, 5), new setMax("YResolution", 283, 5), new setMax("PlanarConfiguration", 284, 3), new setMax("ResolutionUnit", 296, 3), new setMax("TransferFunction", 301, 3), new setMax("Software", SecExceptionCode.SEC_ERROR_STA_INCORRECT_DATA_FILE_DATA, 2), new setMax("DateTime", SecExceptionCode.SEC_ERROR_STA_KEY_NOT_EXISTED, 2), new setMax("Artist", 315, 2), new setMax("WhitePoint", 318, 5), new setMax("PrimaryChromaticities", 319, 5), new setMax("SubIFDPointer", 330, 4), new setMax("JPEGInterchangeFormat", 513, 4), new setMax("JPEGInterchangeFormatLength", 514, 4), new setMax("YCbCrCoefficients", 529, 5), new setMax("YCbCrSubSampling", 530, 3), new setMax("YCbCrPositioning", 531, 3), new setMax("ReferenceBlackWhite", 532, 5), new setMax("Copyright", 33432, 2), new setMax("ExifIFDPointer", 34665, 4), new setMax("GPSInfoIFDPointer", 34853, 4), new setMax("SensorTopBorder", 4, 4), new setMax("SensorLeftBorder", 5, 4), new setMax("SensorBottomBorder", 6, 4), new setMax("SensorRightBorder", 7, 4), new setMax("ISO", 23, 3), new setMax("JpgFromRaw", 46, 7), new setMax("Xmp", 700, 1)};
    private static final byte[] invokeSuspend = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    static final byte[] isInside = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final int[] length = {8};
    private static final Pattern onExtraCallback = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    private static final setMax[] onMessageChannelReady;
    private static final setMax[] onNavigationEvent = {new setMax("ExposureTime", 33434, 5), new setMax("FNumber", 33437, 5), new setMax("ExposureProgram", 34850, 3), new setMax("SpectralSensitivity", 34852, 2), new setMax("PhotographicSensitivity", 34855, 3), new setMax("OECF", 34856, 7), new setMax("ExifVersion", 36864, 2), new setMax("DateTimeOriginal", 36867, 2), new setMax("DateTimeDigitized", 36868, 2), new setMax("ComponentsConfiguration", 37121, 7), new setMax("CompressedBitsPerPixel", 37122, 5), new setMax("ShutterSpeedValue", 37377, 10), new setMax("ApertureValue", 37378, 5), new setMax("BrightnessValue", 37379, 10), new setMax("ExposureBiasValue", 37380, 10), new setMax("MaxApertureValue", 37381, 5), new setMax("SubjectDistance", 37382, 5), new setMax("MeteringMode", 37383, 3), new setMax("LightSource", 37384, 3), new setMax("Flash", 37385, 3), new setMax("FocalLength", 37386, 5), new setMax("SubjectArea", 37396, 3), new setMax("MakerNote", 37500, 7), new setMax("UserComment", 37510, 7), new setMax("SubSecTime", 37520, 2), new setMax("SubSecTimeOriginal", 37521, 2), new setMax("SubSecTimeDigitized", 37522, 2), new setMax("FlashpixVersion", 40960, 7), new setMax("ColorSpace", 40961, 3), new setMax("PixelXDimension", 40962), new setMax("PixelYDimension", 40963), new setMax("RelatedSoundFile", 40964, 2), new setMax("InteroperabilityIFDPointer", 40965, 4), new setMax("FlashEnergy", 41483, 5), new setMax("SpatialFrequencyResponse", 41484, 7), new setMax("FocalPlaneXResolution", 41486, 5), new setMax("FocalPlaneYResolution", 41487, 5), new setMax("FocalPlaneResolutionUnit", 41488, 3), new setMax("SubjectLocation", 41492, 3), new setMax("ExposureIndex", 41493, 5), new setMax("SensingMethod", 41495, 3), new setMax("FileSource", 41728, 7), new setMax("SceneType", 41729, 7), new setMax("CFAPattern", 41730, 7), new setMax("CustomRendered", 41985, 3), new setMax("ExposureMode", 41986, 3), new setMax("WhiteBalance", 41987, 3), new setMax("DigitalZoomRatio", 41988, 5), new setMax("FocalLengthIn35mmFilm", 41989, 3), new setMax("SceneCaptureType", 41990, 3), new setMax("GainControl", 41991, 3), new setMax("Contrast", 41992, 3), new setMax("Saturation", 41993, 3), new setMax("Sharpness", 41994, 3), new setMax("DeviceSettingDescription", 41995, 7), new setMax("SubjectDistanceRange", 41996, 3), new setMax("ImageUniqueID", 42016, 2), new setMax("DNGVersion", 50706, 1), new setMax("DefaultCropSize", 50720)};
    private static final setMax[] onPostMessage = {new setMax("ThumbnailImage", 256, 7), new setMax("CameraSettingsIFDPointer", 8224, 4), new setMax("ImageProcessingIFDPointer", 8256, 4)};
    private static final setMax[] onRelationshipValidationResult = {new setMax("PreviewImageStart", 257, 4), new setMax("PreviewImageLength", 258, 4)};
    private static final HashSet<String> onTransact = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    public static final int[] setMax = {8, 8, 8};
    public static final int[] setMin = {4};
    private static final List<Integer> toDoubleRange = Arrays.asList(new Integer[]{2, 7, 4, 5});
    static final setMax[][] toFloatRange;
    static final byte[] toIntRange;
    private static final boolean toString = Log.isLoggable("ExifInterface", 3);
    private static final byte[] valueOf = {104, 101, 105, 99};
    private static final byte[] values = {102, 116, 121, 112};
    private AssetManager.AssetInputStream ICustomTabsCallback$Stub$Proxy;
    private int ICustomTabsService$Default;
    private boolean ICustomTabsService$Stub;
    private int ICustomTabsService$Stub$Proxy;
    private int IPostMessageService;
    private int extraCommand;
    private String getInterfaceDescriptor;
    private final HashMap<String, getMax>[] mayLaunchUrl = new HashMap[toFloatRange.length];
    private boolean newSession;
    private Set<Integer> newSessionWithExtras = new HashSet(toFloatRange.length);
    private int postMessage;
    private int receiveFile;
    private byte[] requestPostMessageChannel;
    private int requestPostMessageChannelWithExtras;
    private FileDescriptor setDefaultImpl;
    private int updateVisuals;
    private int validateRelationship;
    private ByteOrder warmup = ByteOrder.BIG_ENDIAN;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface IfdType {
    }

    static {
        setMax[] setmaxArr = {new setMax("ColorSpace", 55, 3)};
        onMessageChannelReady = setmaxArr;
        setMax[] setmaxArr2 = invoke;
        toFloatRange = new setMax[][]{setmaxArr2, onNavigationEvent, b, create, getCause, setmaxArr2, onPostMessage, onRelationshipValidationResult, extraCallback, setmaxArr};
        setMax[][] setmaxArr3 = toFloatRange;
        asInterface = new HashMap[setmaxArr3.length];
        asBinder = new HashMap[setmaxArr3.length];
        Charset forName = Charset.forName(C.ASCII_NAME);
        equals = forName;
        toIntRange = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        Mean$Arithmetic = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        for (int i = 0; i < toFloatRange.length; i++) {
            asInterface[i] = new HashMap<>();
            asBinder[i] = new HashMap<>();
            for (setMax setmax : toFloatRange[i]) {
                asInterface[i].put(Integer.valueOf(setmax.setMin), setmax);
                asBinder[i].put(setmax.getMax, setmax);
            }
        }
        getDefaultImpl.put(Integer.valueOf(extraCallbackWithResult[0].setMin), 5);
        getDefaultImpl.put(Integer.valueOf(extraCallbackWithResult[1].setMin), 1);
        getDefaultImpl.put(Integer.valueOf(extraCallbackWithResult[2].setMin), 2);
        getDefaultImpl.put(Integer.valueOf(extraCallbackWithResult[3].setMin), 3);
        getDefaultImpl.put(Integer.valueOf(extraCallbackWithResult[4].setMin), 7);
        getDefaultImpl.put(Integer.valueOf(extraCallbackWithResult[5].setMin), 8);
    }

    static class getMin {
        public final long getMax;
        public final long setMin;

        getMin(long j, long j2) {
            if (j2 == 0) {
                this.getMax = 0;
                this.setMin = 1;
                return;
            }
            this.getMax = j;
            this.setMin = j2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.getMax);
            sb.append("/");
            sb.append(this.setMin);
            return sb.toString();
        }
    }

    static class getMax {
        public final long getMax;
        public final byte[] getMin;
        public final int setMax;
        public final int setMin;

        private getMax(int i, int i2, byte[] bArr) {
            this(i, i2, -1, bArr);
        }

        getMax(int i, int i2, long j, byte[] bArr) {
            this.setMax = i;
            this.setMin = i2;
            this.getMax = j;
            this.getMin = bArr;
        }

        public static getMax setMin(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.IsOverlapping[3] * 1)]);
            wrap.order(byteOrder);
            for (int i = 0; i <= 0; i++) {
                wrap.putShort((short) iArr[0]);
            }
            return new getMax(3, 1, wrap.array());
        }

        public static getMax setMax(int i, ByteOrder byteOrder) {
            return setMin(new int[]{i}, byteOrder);
        }

        public static getMax getMax(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.IsOverlapping[4] * 1)]);
            wrap.order(byteOrder);
            for (int i = 0; i <= 0; i++) {
                wrap.putInt((int) jArr[0]);
            }
            return new getMax(4, 1, wrap.array());
        }

        public static getMax setMin(long j, ByteOrder byteOrder) {
            return getMax(new long[]{j}, byteOrder);
        }

        public static getMax getMax(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(0);
            byte[] bytes = sb.toString().getBytes(ExifInterface.equals);
            return new getMax(2, bytes.length, bytes);
        }

        public static getMax getMax(getMin[] getminArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.IsOverlapping[5] * 1)]);
            wrap.order(byteOrder);
            for (int i = 0; i <= 0; i++) {
                getMin getmin = getminArr[0];
                wrap.putInt((int) getmin.getMax);
                wrap.putInt((int) getmin.setMin);
            }
            return new getMax(5, 1, wrap.array());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(ExifInterface.getMin[this.setMax]);
            sb.append(", data length:");
            sb.append(this.getMin.length);
            sb.append(")");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x0162 A[SYNTHETIC, Splitter:B:141:0x0162] */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x0169 A[SYNTHETIC, Splitter:B:148:0x0169] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object setMin(java.nio.ByteOrder r11) {
            /*
                r10 = this;
                r0 = 0
                androidx.exifinterface.media.ExifInterface$length r1 = new androidx.exifinterface.media.ExifInterface$length     // Catch:{ IOException -> 0x0166, all -> 0x015f }
                byte[] r2 = r10.getMin     // Catch:{ IOException -> 0x0166, all -> 0x015f }
                r1.<init>((byte[]) r2)     // Catch:{ IOException -> 0x0166, all -> 0x015f }
                r1.setMax = r11     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                int r11 = r10.setMax     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
                r4 = 1
                r5 = 0
                switch(r11) {
                    case 1: goto L_0x0127;
                    case 2: goto L_0x00de;
                    case 3: goto L_0x00c9;
                    case 4: goto L_0x00b2;
                    case 5: goto L_0x0090;
                    case 6: goto L_0x0127;
                    case 7: goto L_0x00de;
                    case 8: goto L_0x007b;
                    case 9: goto L_0x0066;
                    case 10: goto L_0x0046;
                    case 11: goto L_0x0030;
                    case 12: goto L_0x001b;
                    default: goto L_0x0016;
                }
            L_0x0016:
                r1.close()     // Catch:{ IOException -> 0x0159 }
                goto L_0x0159
            L_0x001b:
                int r11 = r10.setMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x015d, all -> 0x015a }
            L_0x001f:
                int r2 = r10.setMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                if (r5 >= r2) goto L_0x002c
                double r2 = r1.readDouble()     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                r11[r5] = r2     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                int r5 = r5 + 1
                goto L_0x001f
            L_0x002c:
                r1.close()     // Catch:{ IOException -> 0x002f }
            L_0x002f:
                return r11
            L_0x0030:
                int r11 = r10.setMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x015d, all -> 0x015a }
            L_0x0034:
                int r2 = r10.setMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                if (r5 >= r2) goto L_0x0042
                float r2 = r1.readFloat()     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                double r2 = (double) r2     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                r11[r5] = r2     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                int r5 = r5 + 1
                goto L_0x0034
            L_0x0042:
                r1.close()     // Catch:{ IOException -> 0x0045 }
            L_0x0045:
                return r11
            L_0x0046:
                int r11 = r10.setMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                androidx.exifinterface.media.ExifInterface$getMin[] r11 = new androidx.exifinterface.media.ExifInterface.getMin[r11]     // Catch:{ IOException -> 0x015d, all -> 0x015a }
            L_0x004a:
                int r2 = r10.setMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                if (r5 >= r2) goto L_0x0062
                int r2 = r1.readInt()     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                long r2 = (long) r2     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                int r4 = r1.readInt()     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                long r6 = (long) r4     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                androidx.exifinterface.media.ExifInterface$getMin r4 = new androidx.exifinterface.media.ExifInterface$getMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                r4.<init>(r2, r6)     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                r11[r5] = r4     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                int r5 = r5 + 1
                goto L_0x004a
            L_0x0062:
                r1.close()     // Catch:{ IOException -> 0x0065 }
            L_0x0065:
                return r11
            L_0x0066:
                int r11 = r10.setMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x015d, all -> 0x015a }
            L_0x006a:
                int r2 = r10.setMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                if (r5 >= r2) goto L_0x0077
                int r2 = r1.readInt()     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                r11[r5] = r2     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                int r5 = r5 + 1
                goto L_0x006a
            L_0x0077:
                r1.close()     // Catch:{ IOException -> 0x007a }
            L_0x007a:
                return r11
            L_0x007b:
                int r11 = r10.setMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x015d, all -> 0x015a }
            L_0x007f:
                int r2 = r10.setMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                if (r5 >= r2) goto L_0x008c
                short r2 = r1.readShort()     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                r11[r5] = r2     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                int r5 = r5 + 1
                goto L_0x007f
            L_0x008c:
                r1.close()     // Catch:{ IOException -> 0x008f }
            L_0x008f:
                return r11
            L_0x0090:
                int r11 = r10.setMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                androidx.exifinterface.media.ExifInterface$getMin[] r11 = new androidx.exifinterface.media.ExifInterface.getMin[r11]     // Catch:{ IOException -> 0x015d, all -> 0x015a }
            L_0x0094:
                int r4 = r10.setMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                if (r5 >= r4) goto L_0x00ae
                int r4 = r1.readInt()     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                long r6 = (long) r4     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                long r6 = r6 & r2
                int r4 = r1.readInt()     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                long r8 = (long) r4     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                long r8 = r8 & r2
                androidx.exifinterface.media.ExifInterface$getMin r4 = new androidx.exifinterface.media.ExifInterface$getMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                r11[r5] = r4     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                int r5 = r5 + 1
                goto L_0x0094
            L_0x00ae:
                r1.close()     // Catch:{ IOException -> 0x00b1 }
            L_0x00b1:
                return r11
            L_0x00b2:
                int r11 = r10.setMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                long[] r11 = new long[r11]     // Catch:{ IOException -> 0x015d, all -> 0x015a }
            L_0x00b6:
                int r4 = r10.setMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                if (r5 >= r4) goto L_0x00c5
                int r4 = r1.readInt()     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                long r6 = (long) r4     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                long r6 = r6 & r2
                r11[r5] = r6     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                int r5 = r5 + 1
                goto L_0x00b6
            L_0x00c5:
                r1.close()     // Catch:{ IOException -> 0x00c8 }
            L_0x00c8:
                return r11
            L_0x00c9:
                int r11 = r10.setMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x015d, all -> 0x015a }
            L_0x00cd:
                int r2 = r10.setMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                if (r5 >= r2) goto L_0x00da
                int r2 = r1.readUnsignedShort()     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                r11[r5] = r2     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                int r5 = r5 + 1
                goto L_0x00cd
            L_0x00da:
                r1.close()     // Catch:{ IOException -> 0x00dd }
            L_0x00dd:
                return r11
            L_0x00de:
                int r11 = r10.setMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                byte[] r2 = androidx.exifinterface.media.ExifInterface.isInside     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                int r2 = r2.length     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                if (r11 < r2) goto L_0x00ff
                r11 = 0
            L_0x00e6:
                byte[] r2 = androidx.exifinterface.media.ExifInterface.isInside     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                int r2 = r2.length     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                if (r11 >= r2) goto L_0x00fa
                byte[] r2 = r10.getMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                byte r2 = r2[r11]     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                byte[] r3 = androidx.exifinterface.media.ExifInterface.isInside     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                byte r3 = r3[r11]     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                if (r2 == r3) goto L_0x00f7
                r4 = 0
                goto L_0x00fa
            L_0x00f7:
                int r11 = r11 + 1
                goto L_0x00e6
            L_0x00fa:
                if (r4 == 0) goto L_0x00ff
                byte[] r11 = androidx.exifinterface.media.ExifInterface.isInside     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                int r5 = r11.length     // Catch:{ IOException -> 0x015d, all -> 0x015a }
            L_0x00ff:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                r11.<init>()     // Catch:{ IOException -> 0x015d, all -> 0x015a }
            L_0x0104:
                int r2 = r10.setMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                if (r5 >= r2) goto L_0x011f
                byte[] r2 = r10.getMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                byte r2 = r2[r5]     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                if (r2 == 0) goto L_0x011f
                r3 = 32
                if (r2 < r3) goto L_0x0117
                char r2 = (char) r2     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                r11.append(r2)     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                goto L_0x011c
            L_0x0117:
                r2 = 63
                r11.append(r2)     // Catch:{ IOException -> 0x015d, all -> 0x015a }
            L_0x011c:
                int r5 = r5 + 1
                goto L_0x0104
            L_0x011f:
                java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                r1.close()     // Catch:{ IOException -> 0x0126 }
            L_0x0126:
                return r11
            L_0x0127:
                byte[] r11 = r10.getMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                int r11 = r11.length     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                if (r11 != r4) goto L_0x014c
                byte[] r11 = r10.getMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                if (r11 < 0) goto L_0x014c
                byte[] r11 = r10.getMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                if (r11 > r4) goto L_0x014c
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                char[] r2 = new char[r4]     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                byte[] r3 = r10.getMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                byte r3 = r3[r5]     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                int r3 = r3 + 48
                char r3 = (char) r3     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                r2[r5] = r3     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                r11.<init>(r2)     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                r1.close()     // Catch:{ IOException -> 0x014b }
            L_0x014b:
                return r11
            L_0x014c:
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                byte[] r2 = r10.getMin     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                java.nio.charset.Charset r3 = androidx.exifinterface.media.ExifInterface.equals     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                r11.<init>(r2, r3)     // Catch:{ IOException -> 0x015d, all -> 0x015a }
                r1.close()     // Catch:{ IOException -> 0x0158 }
            L_0x0158:
                return r11
            L_0x0159:
                return r0
            L_0x015a:
                r11 = move-exception
                r0 = r1
                goto L_0x0160
            L_0x015d:
                goto L_0x0167
            L_0x015f:
                r11 = move-exception
            L_0x0160:
                if (r0 == 0) goto L_0x0165
                r0.close()     // Catch:{ IOException -> 0x0165 }
            L_0x0165:
                throw r11
            L_0x0166:
                r1 = r0
            L_0x0167:
                if (r1 == 0) goto L_0x016c
                r1.close()     // Catch:{ IOException -> 0x016c }
            L_0x016c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.getMax.setMin(java.nio.ByteOrder):java.lang.Object");
        }

        public final int getMax(ByteOrder byteOrder) {
            Object min = setMin(byteOrder);
            if (min == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (min instanceof String) {
                return Integer.parseInt((String) min);
            } else {
                if (min instanceof long[]) {
                    long[] jArr = (long[]) min;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (min instanceof int[]) {
                    int[] iArr = (int[]) min;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public final String getMin(ByteOrder byteOrder) {
            Object min = setMin(byteOrder);
            if (min == null) {
                return null;
            }
            if (min instanceof String) {
                return (String) min;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (min instanceof long[]) {
                long[] jArr = (long[]) min;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (min instanceof int[]) {
                int[] iArr = (int[]) min;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (min instanceof double[]) {
                double[] dArr = (double[]) min;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(min instanceof getMin[])) {
                return null;
            } else {
                getMin[] getminArr = (getMin[]) min;
                while (i < getminArr.length) {
                    sb.append(getminArr[i].getMax);
                    sb.append('/');
                    sb.append(getminArr[i].setMin);
                    i++;
                    if (i != getminArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }
    }

    static class setMax {
        public final String getMax;
        public final int length;
        public final int setMax;
        public final int setMin;

        setMax(String str, int i, int i2) {
            this.getMax = str;
            this.setMin = i;
            this.length = i2;
            this.setMax = -1;
        }

        setMax(String str, int i) {
            this.getMax = str;
            this.setMin = i;
            this.length = 3;
            this.setMax = 4;
        }

        /* access modifiers changed from: package-private */
        public final boolean getMax(int i) {
            int i2;
            int i3 = this.length;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.setMax) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((this.length == 9 || this.setMax == 9) && i == 8) {
                return true;
            }
            if ((this.length == 12 || this.setMax == 12) && i == 11) {
                return true;
            }
            return false;
        }
    }

    public ExifInterface(@NonNull InputStream inputStream) throws IOException {
        if (inputStream != null) {
            this.getInterfaceDescriptor = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.ICustomTabsCallback$Stub$Proxy = (AssetManager.AssetInputStream) inputStream;
                this.setDefaultImpl = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (getMin(fileInputStream.getFD())) {
                        this.ICustomTabsCallback$Stub$Proxy = null;
                        this.setDefaultImpl = fileInputStream.getFD();
                    }
                }
                this.ICustomTabsCallback$Stub$Proxy = null;
                this.setDefaultImpl = null;
            }
            getMin(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    @Nullable
    private getMax getMax(@NonNull String str) {
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                str = "PhotographicSensitivity";
            }
            for (int i = 0; i < toFloatRange.length; i++) {
                getMax getmax = this.mayLaunchUrl[i].get(str);
                if (getmax != null) {
                    return getmax;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    @Nullable
    private String length(@NonNull String str) {
        double d;
        getMax max = getMax(str);
        if (max != null) {
            if (!onTransact.contains(str)) {
                return max.getMin(this.warmup);
            }
            if (!str.equals("GPSTimeStamp")) {
                try {
                    Object min = max.setMin(this.warmup);
                    if (min != null) {
                        if (min instanceof String) {
                            d = Double.parseDouble((String) min);
                        } else if (min instanceof long[]) {
                            long[] jArr = (long[]) min;
                            if (jArr.length == 1) {
                                d = (double) jArr[0];
                            } else {
                                throw new NumberFormatException("There are more than one component");
                            }
                        } else if (min instanceof int[]) {
                            int[] iArr = (int[]) min;
                            if (iArr.length == 1) {
                                d = (double) iArr[0];
                            } else {
                                throw new NumberFormatException("There are more than one component");
                            }
                        } else if (min instanceof double[]) {
                            double[] dArr = (double[]) min;
                            if (dArr.length == 1) {
                                d = dArr[0];
                            } else {
                                throw new NumberFormatException("There are more than one component");
                            }
                        } else if (min instanceof getMin[]) {
                            getMin[] getminArr = (getMin[]) min;
                            if (getminArr.length == 1) {
                                getMin getmin = getminArr[0];
                                double d2 = (double) getmin.getMax;
                                double d3 = (double) getmin.setMin;
                                Double.isNaN(d2);
                                Double.isNaN(d3);
                                d = d2 / d3;
                            } else {
                                throw new NumberFormatException("There are more than one component");
                            }
                        } else {
                            throw new NumberFormatException("Couldn't find a double value");
                        }
                        return Double.toString(d);
                    }
                    throw new NumberFormatException("NULL can't be converted to a double value");
                } catch (NumberFormatException unused) {
                }
            } else if (max.setMax != 5 && max.setMax != 10) {
                return null;
            } else {
                getMin[] getminArr2 = (getMin[]) max.setMin(this.warmup);
                if (getminArr2 == null || getminArr2.length != 3) {
                    Arrays.toString(getminArr2);
                    return null;
                }
                return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) getminArr2[0].getMax) / ((float) getminArr2[0].setMin))), Integer.valueOf((int) (((float) getminArr2[1].getMax) / ((float) getminArr2[1].setMin))), Integer.valueOf((int) (((float) getminArr2[2].getMax) / ((float) getminArr2[2].setMin)))});
            }
        }
        return null;
    }

    public final int length(@NonNull String str, int i) {
        getMax max = getMax(str);
        if (max == null) {
            return 1;
        }
        try {
            return max.getMax(this.warmup);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02b4, code lost:
        r2 = r1.mayLaunchUrl[4];
        r3 = r2.get("Compression");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02c1, code lost:
        if (r3 == null) goto L_0x02e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02c3, code lost:
        r3 = r3.getMax(r1.warmup);
        r1.postMessage = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02cb, code lost:
        if (r3 == 1) goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02cd, code lost:
        if (r3 == 6) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02cf, code lost:
        if (r3 == 7) goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02d2, code lost:
        length(r0, (java.util.HashMap) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02da, code lost:
        if (length((java.util.HashMap) r2) == false) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02dc, code lost:
        setMax(r0, (java.util.HashMap) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02e0, code lost:
        r1.postMessage = 6;
        length(r0, (java.util.HashMap) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02e5, code lost:
        r1.ICustomTabsService$Stub = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02e7, code lost:
        setMin();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02ec, code lost:
        if (toString == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02ee, code lost:
        getMin();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02f1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:141:0x02f4 */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02fd A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void getMin(@androidx.annotation.NonNull java.io.InputStream r18) throws java.io.IOException {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            java.lang.String r2 = "PhotographicSensitivity"
            java.lang.String r3 = "yes"
            if (r0 == 0) goto L_0x030c
            r4 = 0
            r5 = 0
        L_0x000d:
            androidx.exifinterface.media.ExifInterface$setMax[][] r6 = toFloatRange     // Catch:{ IOException -> 0x02f4 }
            int r6 = r6.length     // Catch:{ IOException -> 0x02f4 }
            if (r5 >= r6) goto L_0x001e
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r6 = r1.mayLaunchUrl     // Catch:{ IOException -> 0x02f4 }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ IOException -> 0x02f4 }
            r7.<init>()     // Catch:{ IOException -> 0x02f4 }
            r6[r5] = r7     // Catch:{ IOException -> 0x02f4 }
            int r5 = r5 + 1
            goto L_0x000d
        L_0x001e:
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x02f4 }
            r6 = 5000(0x1388, float:7.006E-42)
            r5.<init>(r0, r6)     // Catch:{ IOException -> 0x02f4 }
            r0 = r5
            java.io.BufferedInputStream r0 = (java.io.BufferedInputStream) r0     // Catch:{ IOException -> 0x02f4 }
            r0.mark(r6)     // Catch:{ IOException -> 0x02f4 }
            byte[] r6 = new byte[r6]     // Catch:{ IOException -> 0x02f4 }
            r0.read(r6)     // Catch:{ IOException -> 0x02f4 }
            r0.reset()     // Catch:{ IOException -> 0x02f4 }
            boolean r0 = getMax((byte[]) r6)     // Catch:{ IOException -> 0x02f4 }
            r8 = 7
            if (r0 == 0) goto L_0x003c
            r0 = 4
            goto L_0x0060
        L_0x003c:
            boolean r0 = setMax((byte[]) r6)     // Catch:{ IOException -> 0x02f4 }
            if (r0 == 0) goto L_0x0045
            r0 = 9
            goto L_0x0060
        L_0x0045:
            boolean r0 = getMin((byte[]) r6)     // Catch:{ IOException -> 0x02f4 }
            if (r0 == 0) goto L_0x004e
            r0 = 12
            goto L_0x0060
        L_0x004e:
            boolean r0 = r1.length((byte[]) r6)     // Catch:{ IOException -> 0x02f4 }
            if (r0 == 0) goto L_0x0056
            r0 = 7
            goto L_0x0060
        L_0x0056:
            boolean r0 = r1.setMin((byte[]) r6)     // Catch:{ IOException -> 0x02f4 }
            if (r0 == 0) goto L_0x005f
            r0 = 10
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            r1.extraCommand = r0     // Catch:{ IOException -> 0x02f4 }
            androidx.exifinterface.media.ExifInterface$length r0 = new androidx.exifinterface.media.ExifInterface$length     // Catch:{ IOException -> 0x02f4 }
            r0.<init>((java.io.InputStream) r5)     // Catch:{ IOException -> 0x02f4 }
            int r5 = r1.extraCommand     // Catch:{ IOException -> 0x02f4 }
            java.lang.String r9 = "ImageLength"
            java.lang.String r10 = "ImageWidth"
            r12 = 5
            r13 = 6
            r14 = 1
            switch(r5) {
                case 0: goto L_0x02b1;
                case 1: goto L_0x02b1;
                case 2: goto L_0x02b1;
                case 3: goto L_0x02b1;
                case 4: goto L_0x02ad;
                case 5: goto L_0x02b1;
                case 6: goto L_0x02b1;
                case 7: goto L_0x01d2;
                case 8: goto L_0x02b1;
                case 9: goto L_0x01cd;
                case 10: goto L_0x0194;
                case 11: goto L_0x02b1;
                case 12: goto L_0x0075;
                default: goto L_0x0073;
            }
        L_0x0073:
            goto L_0x02b4
        L_0x0075:
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever     // Catch:{ IOException -> 0x02f4 }
            r2.<init>()     // Catch:{ IOException -> 0x02f4 }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x018f }
            r12 = 23
            if (r5 < r12) goto L_0x0089
            androidx.exifinterface.media.ExifInterface$3 r5 = new androidx.exifinterface.media.ExifInterface$3     // Catch:{ all -> 0x018f }
            r5.<init>(r0)     // Catch:{ all -> 0x018f }
            r2.setDataSource(r5)     // Catch:{ all -> 0x018f }
            goto L_0x009c
        L_0x0089:
            java.io.FileDescriptor r5 = r1.setDefaultImpl     // Catch:{ all -> 0x018f }
            if (r5 == 0) goto L_0x0093
            java.io.FileDescriptor r5 = r1.setDefaultImpl     // Catch:{ all -> 0x018f }
            r2.setDataSource(r5)     // Catch:{ all -> 0x018f }
            goto L_0x009c
        L_0x0093:
            java.lang.String r5 = r1.getInterfaceDescriptor     // Catch:{ all -> 0x018f }
            if (r5 == 0) goto L_0x018a
            java.lang.String r5 = r1.getInterfaceDescriptor     // Catch:{ all -> 0x018f }
            r2.setDataSource(r5)     // Catch:{ all -> 0x018f }
        L_0x009c:
            r5 = 33
            java.lang.String r5 = r2.extractMetadata(r5)     // Catch:{ all -> 0x018f }
            r12 = 34
            java.lang.String r12 = r2.extractMetadata(r12)     // Catch:{ all -> 0x018f }
            r15 = 26
            java.lang.String r15 = r2.extractMetadata(r15)     // Catch:{ all -> 0x018f }
            r11 = 17
            java.lang.String r11 = r2.extractMetadata(r11)     // Catch:{ all -> 0x018f }
            boolean r15 = r3.equals(r15)     // Catch:{ all -> 0x018f }
            r16 = 0
            if (r15 == 0) goto L_0x00cf
            r3 = 29
            java.lang.String r16 = r2.extractMetadata(r3)     // Catch:{ all -> 0x018f }
            r3 = 30
            java.lang.String r3 = r2.extractMetadata(r3)     // Catch:{ all -> 0x018f }
            r11 = 31
            java.lang.String r11 = r2.extractMetadata(r11)     // Catch:{ all -> 0x018f }
            goto L_0x00eb
        L_0x00cf:
            boolean r3 = r3.equals(r11)     // Catch:{ all -> 0x018f }
            if (r3 == 0) goto L_0x00e8
            r3 = 18
            java.lang.String r16 = r2.extractMetadata(r3)     // Catch:{ all -> 0x018f }
            r3 = 19
            java.lang.String r3 = r2.extractMetadata(r3)     // Catch:{ all -> 0x018f }
            r11 = 24
            java.lang.String r11 = r2.extractMetadata(r11)     // Catch:{ all -> 0x018f }
            goto L_0x00eb
        L_0x00e8:
            r3 = r16
            r11 = r3
        L_0x00eb:
            if (r16 == 0) goto L_0x00fe
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r15 = r1.mayLaunchUrl     // Catch:{ all -> 0x018f }
            r15 = r15[r4]     // Catch:{ all -> 0x018f }
            int r7 = java.lang.Integer.parseInt(r16)     // Catch:{ all -> 0x018f }
            java.nio.ByteOrder r6 = r1.warmup     // Catch:{ all -> 0x018f }
            androidx.exifinterface.media.ExifInterface$getMax r6 = androidx.exifinterface.media.ExifInterface.getMax.setMax(r7, r6)     // Catch:{ all -> 0x018f }
            r15.put(r10, r6)     // Catch:{ all -> 0x018f }
        L_0x00fe:
            if (r3 == 0) goto L_0x0111
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r6 = r1.mayLaunchUrl     // Catch:{ all -> 0x018f }
            r6 = r6[r4]     // Catch:{ all -> 0x018f }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ all -> 0x018f }
            java.nio.ByteOrder r7 = r1.warmup     // Catch:{ all -> 0x018f }
            androidx.exifinterface.media.ExifInterface$getMax r3 = androidx.exifinterface.media.ExifInterface.getMax.setMax(r3, r7)     // Catch:{ all -> 0x018f }
            r6.put(r9, r3)     // Catch:{ all -> 0x018f }
        L_0x0111:
            if (r11 == 0) goto L_0x013a
            int r3 = java.lang.Integer.parseInt(r11)     // Catch:{ all -> 0x018f }
            r6 = 90
            if (r3 == r6) goto L_0x012a
            r6 = 180(0xb4, float:2.52E-43)
            if (r3 == r6) goto L_0x0128
            r6 = 270(0x10e, float:3.78E-43)
            if (r3 == r6) goto L_0x0125
            r6 = 1
            goto L_0x012b
        L_0x0125:
            r6 = 8
            goto L_0x012b
        L_0x0128:
            r6 = 3
            goto L_0x012b
        L_0x012a:
            r6 = 6
        L_0x012b:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r3 = r1.mayLaunchUrl     // Catch:{ all -> 0x018f }
            r3 = r3[r4]     // Catch:{ all -> 0x018f }
            java.lang.String r7 = "Orientation"
            java.nio.ByteOrder r9 = r1.warmup     // Catch:{ all -> 0x018f }
            androidx.exifinterface.media.ExifInterface$getMax r6 = androidx.exifinterface.media.ExifInterface.getMax.setMax(r6, r9)     // Catch:{ all -> 0x018f }
            r3.put(r7, r6)     // Catch:{ all -> 0x018f }
        L_0x013a:
            if (r5 == 0) goto L_0x018a
            if (r12 == 0) goto L_0x018a
            int r3 = java.lang.Integer.parseInt(r5)     // Catch:{ all -> 0x018f }
            int r5 = java.lang.Integer.parseInt(r12)     // Catch:{ all -> 0x018f }
            if (r5 <= r13) goto L_0x0182
            long r6 = (long) r3     // Catch:{ all -> 0x018f }
            r0.setMax(r6)     // Catch:{ all -> 0x018f }
            byte[] r3 = new byte[r13]     // Catch:{ all -> 0x018f }
            int r6 = r0.read(r3)     // Catch:{ all -> 0x018f }
            if (r6 != r13) goto L_0x017a
            int r5 = r5 + -6
            byte[] r6 = toIntRange     // Catch:{ all -> 0x018f }
            boolean r3 = java.util.Arrays.equals(r3, r6)     // Catch:{ all -> 0x018f }
            if (r3 == 0) goto L_0x0172
            byte[] r3 = new byte[r5]     // Catch:{ all -> 0x018f }
            int r6 = r0.read(r3)     // Catch:{ all -> 0x018f }
            if (r6 != r5) goto L_0x016a
            r1.setMax((byte[]) r3, (int) r4)     // Catch:{ all -> 0x018f }
            goto L_0x018a
        L_0x016a:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x018f }
            java.lang.String r3 = "Can't read exif"
            r0.<init>(r3)     // Catch:{ all -> 0x018f }
            throw r0     // Catch:{ all -> 0x018f }
        L_0x0172:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x018f }
            java.lang.String r3 = "Invalid identifier"
            r0.<init>(r3)     // Catch:{ all -> 0x018f }
            throw r0     // Catch:{ all -> 0x018f }
        L_0x017a:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x018f }
            java.lang.String r3 = "Can't read identifier"
            r0.<init>(r3)     // Catch:{ all -> 0x018f }
            throw r0     // Catch:{ all -> 0x018f }
        L_0x0182:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x018f }
            java.lang.String r3 = "Invalid exif length"
            r0.<init>(r3)     // Catch:{ all -> 0x018f }
            throw r0     // Catch:{ all -> 0x018f }
        L_0x018a:
            r2.release()     // Catch:{ IOException -> 0x02f4 }
            goto L_0x02b4
        L_0x018f:
            r0 = move-exception
            r2.release()     // Catch:{ IOException -> 0x02f4 }
            throw r0     // Catch:{ IOException -> 0x02f4 }
        L_0x0194:
            r1.setMax((androidx.exifinterface.media.ExifInterface.length) r0)     // Catch:{ IOException -> 0x02f4 }
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r3 = r1.mayLaunchUrl     // Catch:{ IOException -> 0x02f4 }
            r3 = r3[r4]     // Catch:{ IOException -> 0x02f4 }
            java.lang.String r5 = "JpgFromRaw"
            java.lang.Object r3 = r3.get(r5)     // Catch:{ IOException -> 0x02f4 }
            androidx.exifinterface.media.ExifInterface$getMax r3 = (androidx.exifinterface.media.ExifInterface.getMax) r3     // Catch:{ IOException -> 0x02f4 }
            if (r3 == 0) goto L_0x01aa
            int r3 = r1.IPostMessageService     // Catch:{ IOException -> 0x02f4 }
            r1.getMin(r0, r3, r12)     // Catch:{ IOException -> 0x02f4 }
        L_0x01aa:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r3 = r1.mayLaunchUrl     // Catch:{ IOException -> 0x02f4 }
            r3 = r3[r4]     // Catch:{ IOException -> 0x02f4 }
            java.lang.String r5 = "ISO"
            java.lang.Object r3 = r3.get(r5)     // Catch:{ IOException -> 0x02f4 }
            androidx.exifinterface.media.ExifInterface$getMax r3 = (androidx.exifinterface.media.ExifInterface.getMax) r3     // Catch:{ IOException -> 0x02f4 }
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r5 = r1.mayLaunchUrl     // Catch:{ IOException -> 0x02f4 }
            r5 = r5[r14]     // Catch:{ IOException -> 0x02f4 }
            java.lang.Object r5 = r5.get(r2)     // Catch:{ IOException -> 0x02f4 }
            androidx.exifinterface.media.ExifInterface$getMax r5 = (androidx.exifinterface.media.ExifInterface.getMax) r5     // Catch:{ IOException -> 0x02f4 }
            if (r3 == 0) goto L_0x02b4
            if (r5 != 0) goto L_0x02b4
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r5 = r1.mayLaunchUrl     // Catch:{ IOException -> 0x02f4 }
            r5 = r5[r14]     // Catch:{ IOException -> 0x02f4 }
            r5.put(r2, r3)     // Catch:{ IOException -> 0x02f4 }
            goto L_0x02b4
        L_0x01cd:
            r1.length((androidx.exifinterface.media.ExifInterface.length) r0)     // Catch:{ IOException -> 0x02f4 }
            goto L_0x02b4
        L_0x01d2:
            r1.setMax((androidx.exifinterface.media.ExifInterface.length) r0)     // Catch:{ IOException -> 0x02f4 }
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r2 = r1.mayLaunchUrl     // Catch:{ IOException -> 0x02f4 }
            r2 = r2[r14]     // Catch:{ IOException -> 0x02f4 }
            java.lang.String r3 = "MakerNote"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ IOException -> 0x02f4 }
            androidx.exifinterface.media.ExifInterface$getMax r2 = (androidx.exifinterface.media.ExifInterface.getMax) r2     // Catch:{ IOException -> 0x02f4 }
            if (r2 == 0) goto L_0x02b4
            androidx.exifinterface.media.ExifInterface$length r3 = new androidx.exifinterface.media.ExifInterface$length     // Catch:{ IOException -> 0x02f4 }
            byte[] r2 = r2.getMin     // Catch:{ IOException -> 0x02f4 }
            r3.<init>((byte[]) r2)     // Catch:{ IOException -> 0x02f4 }
            java.nio.ByteOrder r2 = r1.warmup     // Catch:{ IOException -> 0x02f4 }
            r3.setMax = r2     // Catch:{ IOException -> 0x02f4 }
            byte[] r2 = Grayscale$Algorithm     // Catch:{ IOException -> 0x02f4 }
            int r2 = r2.length     // Catch:{ IOException -> 0x02f4 }
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x02f4 }
            r3.readFully(r2)     // Catch:{ IOException -> 0x02f4 }
            r5 = 0
            r3.setMax(r5)     // Catch:{ IOException -> 0x02f4 }
            byte[] r5 = invokeSuspend     // Catch:{ IOException -> 0x02f4 }
            int r5 = r5.length     // Catch:{ IOException -> 0x02f4 }
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x02f4 }
            r3.readFully(r5)     // Catch:{ IOException -> 0x02f4 }
            byte[] r6 = Grayscale$Algorithm     // Catch:{ IOException -> 0x02f4 }
            boolean r2 = java.util.Arrays.equals(r2, r6)     // Catch:{ IOException -> 0x02f4 }
            if (r2 == 0) goto L_0x0211
            r5 = 8
            r3.setMax(r5)     // Catch:{ IOException -> 0x02f4 }
            goto L_0x021e
        L_0x0211:
            byte[] r2 = invokeSuspend     // Catch:{ IOException -> 0x02f4 }
            boolean r2 = java.util.Arrays.equals(r5, r2)     // Catch:{ IOException -> 0x02f4 }
            if (r2 == 0) goto L_0x021e
            r5 = 12
            r3.setMax(r5)     // Catch:{ IOException -> 0x02f4 }
        L_0x021e:
            r1.getMin(r3, r13)     // Catch:{ IOException -> 0x02f4 }
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r2 = r1.mayLaunchUrl     // Catch:{ IOException -> 0x02f4 }
            r2 = r2[r8]     // Catch:{ IOException -> 0x02f4 }
            java.lang.String r3 = "PreviewImageStart"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ IOException -> 0x02f4 }
            androidx.exifinterface.media.ExifInterface$getMax r2 = (androidx.exifinterface.media.ExifInterface.getMax) r2     // Catch:{ IOException -> 0x02f4 }
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r3 = r1.mayLaunchUrl     // Catch:{ IOException -> 0x02f4 }
            r3 = r3[r8]     // Catch:{ IOException -> 0x02f4 }
            java.lang.String r5 = "PreviewImageLength"
            java.lang.Object r3 = r3.get(r5)     // Catch:{ IOException -> 0x02f4 }
            androidx.exifinterface.media.ExifInterface$getMax r3 = (androidx.exifinterface.media.ExifInterface.getMax) r3     // Catch:{ IOException -> 0x02f4 }
            if (r2 == 0) goto L_0x024f
            if (r3 == 0) goto L_0x024f
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r5 = r1.mayLaunchUrl     // Catch:{ IOException -> 0x02f4 }
            r5 = r5[r12]     // Catch:{ IOException -> 0x02f4 }
            java.lang.String r6 = "JPEGInterchangeFormat"
            r5.put(r6, r2)     // Catch:{ IOException -> 0x02f4 }
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r2 = r1.mayLaunchUrl     // Catch:{ IOException -> 0x02f4 }
            r2 = r2[r12]     // Catch:{ IOException -> 0x02f4 }
            java.lang.String r5 = "JPEGInterchangeFormatLength"
            r2.put(r5, r3)     // Catch:{ IOException -> 0x02f4 }
        L_0x024f:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r2 = r1.mayLaunchUrl     // Catch:{ IOException -> 0x02f4 }
            r3 = 8
            r2 = r2[r3]     // Catch:{ IOException -> 0x02f4 }
            java.lang.String r3 = "AspectFrame"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ IOException -> 0x02f4 }
            androidx.exifinterface.media.ExifInterface$getMax r2 = (androidx.exifinterface.media.ExifInterface.getMax) r2     // Catch:{ IOException -> 0x02f4 }
            if (r2 == 0) goto L_0x02b4
            java.nio.ByteOrder r3 = r1.warmup     // Catch:{ IOException -> 0x02f4 }
            java.lang.Object r2 = r2.setMin(r3)     // Catch:{ IOException -> 0x02f4 }
            int[] r2 = (int[]) r2     // Catch:{ IOException -> 0x02f4 }
            if (r2 == 0) goto L_0x02a9
            int r3 = r2.length     // Catch:{ IOException -> 0x02f4 }
            r5 = 4
            if (r3 == r5) goto L_0x026e
            goto L_0x02a9
        L_0x026e:
            r3 = 2
            r5 = r2[r3]     // Catch:{ IOException -> 0x02f4 }
            r6 = r2[r4]     // Catch:{ IOException -> 0x02f4 }
            if (r5 <= r6) goto L_0x02b4
            r5 = 3
            r6 = r2[r5]     // Catch:{ IOException -> 0x02f4 }
            r7 = r2[r14]     // Catch:{ IOException -> 0x02f4 }
            if (r6 <= r7) goto L_0x02b4
            r3 = r2[r3]     // Catch:{ IOException -> 0x02f4 }
            r6 = r2[r4]     // Catch:{ IOException -> 0x02f4 }
            int r3 = r3 - r6
            int r3 = r3 + r14
            r5 = r2[r5]     // Catch:{ IOException -> 0x02f4 }
            r2 = r2[r14]     // Catch:{ IOException -> 0x02f4 }
            int r5 = r5 - r2
            int r5 = r5 + r14
            if (r3 >= r5) goto L_0x028e
            int r3 = r3 + r5
            int r5 = r3 - r5
            int r3 = r3 - r5
        L_0x028e:
            java.nio.ByteOrder r2 = r1.warmup     // Catch:{ IOException -> 0x02f4 }
            androidx.exifinterface.media.ExifInterface$getMax r2 = androidx.exifinterface.media.ExifInterface.getMax.setMax(r3, r2)     // Catch:{ IOException -> 0x02f4 }
            java.nio.ByteOrder r3 = r1.warmup     // Catch:{ IOException -> 0x02f4 }
            androidx.exifinterface.media.ExifInterface$getMax r3 = androidx.exifinterface.media.ExifInterface.getMax.setMax(r5, r3)     // Catch:{ IOException -> 0x02f4 }
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r5 = r1.mayLaunchUrl     // Catch:{ IOException -> 0x02f4 }
            r5 = r5[r4]     // Catch:{ IOException -> 0x02f4 }
            r5.put(r10, r2)     // Catch:{ IOException -> 0x02f4 }
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r2 = r1.mayLaunchUrl     // Catch:{ IOException -> 0x02f4 }
            r2 = r2[r4]     // Catch:{ IOException -> 0x02f4 }
            r2.put(r9, r3)     // Catch:{ IOException -> 0x02f4 }
            goto L_0x02b4
        L_0x02a9:
            java.util.Arrays.toString(r2)     // Catch:{ IOException -> 0x02f4 }
            goto L_0x02b4
        L_0x02ad:
            r1.getMin(r0, r4, r4)     // Catch:{ IOException -> 0x02f4 }
            goto L_0x02b4
        L_0x02b1:
            r1.setMax((androidx.exifinterface.media.ExifInterface.length) r0)     // Catch:{ IOException -> 0x02f4 }
        L_0x02b4:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r2 = r1.mayLaunchUrl     // Catch:{ IOException -> 0x02f4 }
            r3 = 4
            r2 = r2[r3]     // Catch:{ IOException -> 0x02f4 }
            java.lang.String r3 = "Compression"
            java.lang.Object r3 = r2.get(r3)     // Catch:{ IOException -> 0x02f4 }
            androidx.exifinterface.media.ExifInterface$getMax r3 = (androidx.exifinterface.media.ExifInterface.getMax) r3     // Catch:{ IOException -> 0x02f4 }
            if (r3 == 0) goto L_0x02e0
            java.nio.ByteOrder r5 = r1.warmup     // Catch:{ IOException -> 0x02f4 }
            int r3 = r3.getMax((java.nio.ByteOrder) r5)     // Catch:{ IOException -> 0x02f4 }
            r1.postMessage = r3     // Catch:{ IOException -> 0x02f4 }
            if (r3 == r14) goto L_0x02d6
            if (r3 == r13) goto L_0x02d2
            if (r3 == r8) goto L_0x02d6
            goto L_0x02e5
        L_0x02d2:
            r1.length((androidx.exifinterface.media.ExifInterface.length) r0, (java.util.HashMap) r2)     // Catch:{ IOException -> 0x02f4 }
            goto L_0x02e5
        L_0x02d6:
            boolean r3 = r1.length((java.util.HashMap) r2)     // Catch:{ IOException -> 0x02f4 }
            if (r3 == 0) goto L_0x02e5
            r1.setMax((androidx.exifinterface.media.ExifInterface.length) r0, (java.util.HashMap) r2)     // Catch:{ IOException -> 0x02f4 }
            goto L_0x02e5
        L_0x02e0:
            r1.postMessage = r13     // Catch:{ IOException -> 0x02f4 }
            r1.length((androidx.exifinterface.media.ExifInterface.length) r0, (java.util.HashMap) r2)     // Catch:{ IOException -> 0x02f4 }
        L_0x02e5:
            r1.ICustomTabsService$Stub = r14     // Catch:{ IOException -> 0x02f4 }
            r17.setMin()
            boolean r0 = toString
            if (r0 == 0) goto L_0x0300
            r17.getMin()
            return
        L_0x02f2:
            r0 = move-exception
            goto L_0x0301
        L_0x02f4:
            r1.ICustomTabsService$Stub = r4     // Catch:{ all -> 0x02f2 }
            r17.setMin()
            boolean r0 = toString
            if (r0 == 0) goto L_0x0300
            r17.getMin()
        L_0x0300:
            return
        L_0x0301:
            r17.setMin()
            boolean r2 = toString
            if (r2 == 0) goto L_0x030b
            r17.getMin()
        L_0x030b:
            throw r0
        L_0x030c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "inputstream shouldn't be null"
            r0.<init>(r2)
            goto L_0x0315
        L_0x0314:
            throw r0
        L_0x0315:
            goto L_0x0314
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.getMin(java.io.InputStream):void");
    }

    private static boolean getMin(FileDescriptor fileDescriptor) throws IOException {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                Os.lseek(fileDescriptor, 0, OsConstants.SEEK_CUR);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private void getMin() {
        int i = 0;
        while (true) {
            HashMap<String, getMax>[] hashMapArr = this.mayLaunchUrl;
            if (i < hashMapArr.length) {
                hashMapArr[i].size();
                for (Map.Entry next : this.mayLaunchUrl[i].entrySet()) {
                    next.getKey();
                    ((getMax) next.getValue()).getMin(this.warmup);
                }
                i++;
            } else {
                return;
            }
        }
    }

    private static boolean getMax(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = getMax;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    private static boolean setMax(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean getMin(byte[] r14) throws java.io.IOException {
        /*
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.ExifInterface$length r2 = new androidx.exifinterface.media.ExifInterface$length     // Catch:{ Exception -> 0x0093, all -> 0x008c }
            r2.<init>((byte[]) r14)     // Catch:{ Exception -> 0x0093, all -> 0x008c }
            java.nio.ByteOrder r14 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            r2.setMax = r14     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            int r14 = r2.readInt()     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            long r3 = (long) r14     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            r14 = 4
            byte[] r1 = new byte[r14]     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            r2.read(r1)     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            byte[] r5 = values     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            boolean r1 = java.util.Arrays.equals(r1, r5)     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            if (r1 != 0) goto L_0x0022
            r2.close()
            return r0
        L_0x0022:
            r5 = 16
            r7 = 8
            r9 = 1
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x0038
            long r3 = r2.readLong()     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0039
            r2.close()
            return r0
        L_0x0038:
            r5 = r7
        L_0x0039:
            r11 = 5000(0x1388, double:2.4703E-320)
            int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r1 <= 0) goto L_0x0040
            r3 = r11
        L_0x0040:
            long r3 = r3 - r5
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0049
            r2.close()
            return r0
        L_0x0049:
            byte[] r1 = new byte[r14]     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            r5 = 0
            r7 = 0
            r8 = 0
        L_0x004f:
            r11 = 4
            long r11 = r3 / r11
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0083
            int r11 = r2.read(r1)     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            if (r11 == r14) goto L_0x0061
            r2.close()
            return r0
        L_0x0061:
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0081
            byte[] r11 = FastBitmap$CoordinateSystem     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            boolean r11 = java.util.Arrays.equals(r1, r11)     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            r12 = 1
            if (r11 == 0) goto L_0x0070
            r7 = 1
            goto L_0x0079
        L_0x0070:
            byte[] r11 = valueOf     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            boolean r11 = java.util.Arrays.equals(r1, r11)     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            if (r11 == 0) goto L_0x0079
            r8 = 1
        L_0x0079:
            if (r7 == 0) goto L_0x0081
            if (r8 == 0) goto L_0x0081
            r2.close()
            return r12
        L_0x0081:
            long r5 = r5 + r9
            goto L_0x004f
        L_0x0083:
            r2.close()
            goto L_0x0099
        L_0x0087:
            r14 = move-exception
            r1 = r2
            goto L_0x008d
        L_0x008a:
            r1 = r2
            goto L_0x0094
        L_0x008c:
            r14 = move-exception
        L_0x008d:
            if (r1 == 0) goto L_0x0092
            r1.close()
        L_0x0092:
            throw r14
        L_0x0093:
        L_0x0094:
            if (r1 == 0) goto L_0x0099
            r1.close()
        L_0x0099:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.getMin(byte[]):boolean");
    }

    private boolean length(byte[] bArr) throws IOException {
        length length2 = new length(bArr);
        ByteOrder min = getMin(length2);
        this.warmup = min;
        length2.setMax = min;
        short readShort = length2.readShort();
        length2.close();
        return readShort == 20306 || readShort == 21330;
    }

    private boolean setMin(byte[] bArr) throws IOException {
        length length2 = new length(bArr);
        ByteOrder min = getMin(length2);
        this.warmup = min;
        length2.setMax = min;
        short readShort = length2.readShort();
        length2.close();
        return readShort == 85;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x008c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void getMin(androidx.exifinterface.media.ExifInterface.length r20, int r21, int r22) throws java.io.IOException {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            r1.setMax = r4
            long r4 = (long) r2
            r1.setMax(r4)
            byte r4 = r20.readByte()
            java.lang.String r5 = "Invalid marker: "
            r6 = -1
            if (r4 != r6) goto L_0x016a
            r7 = 1
            int r2 = r2 + r7
            byte r8 = r20.readByte()
            r9 = -40
            if (r8 != r9) goto L_0x0152
            int r2 = r2 + r7
        L_0x0024:
            byte r4 = r20.readByte()
            if (r4 != r6) goto L_0x0138
            int r2 = r2 + r7
            byte r4 = r20.readByte()
            int r2 = r2 + r7
            r5 = -39
            if (r4 == r5) goto L_0x0133
            r5 = -38
            if (r4 == r5) goto L_0x0133
            int r5 = r20.readUnsignedShort()
            int r5 = r5 + -2
            int r2 = r2 + 2
            java.lang.String r8 = "Invalid length"
            if (r5 < 0) goto L_0x012d
            r9 = -31
            r10 = 0
            if (r4 == r9) goto L_0x0094
            r9 = -2
            if (r4 == r9) goto L_0x00e9
            switch(r4) {
                case -64: goto L_0x005a;
                case -63: goto L_0x005a;
                case -62: goto L_0x005a;
                case -61: goto L_0x005a;
                default: goto L_0x004f;
            }
        L_0x004f:
            switch(r4) {
                case -59: goto L_0x005a;
                case -58: goto L_0x005a;
                case -57: goto L_0x005a;
                default: goto L_0x0052;
            }
        L_0x0052:
            switch(r4) {
                case -55: goto L_0x005a;
                case -54: goto L_0x005a;
                case -53: goto L_0x005a;
                default: goto L_0x0055;
            }
        L_0x0055:
            switch(r4) {
                case -51: goto L_0x005a;
                case -50: goto L_0x005a;
                case -49: goto L_0x005a;
                default: goto L_0x0058;
            }
        L_0x0058:
            goto L_0x010c
        L_0x005a:
            int r4 = r1.skipBytes(r7)
            if (r4 != r7) goto L_0x008c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r4 = r0.mayLaunchUrl
            r4 = r4[r3]
            int r9 = r20.readUnsignedShort()
            long r9 = (long) r9
            java.nio.ByteOrder r11 = r0.warmup
            androidx.exifinterface.media.ExifInterface$getMax r9 = androidx.exifinterface.media.ExifInterface.getMax.setMin((long) r9, (java.nio.ByteOrder) r11)
            java.lang.String r10 = "ImageLength"
            r4.put(r10, r9)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r4 = r0.mayLaunchUrl
            r4 = r4[r3]
            int r9 = r20.readUnsignedShort()
            long r9 = (long) r9
            java.nio.ByteOrder r11 = r0.warmup
            androidx.exifinterface.media.ExifInterface$getMax r9 = androidx.exifinterface.media.ExifInterface.getMax.setMin((long) r9, (java.nio.ByteOrder) r11)
            java.lang.String r10 = "ImageWidth"
            r4.put(r10, r9)
            int r5 = r5 + -5
            goto L_0x010c
        L_0x008c:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid SOFx"
            r1.<init>(r2)
            throw r1
        L_0x0094:
            byte[] r4 = new byte[r5]
            r1.readFully(r4)
            int r9 = r2 + r5
            byte[] r11 = toIntRange
            boolean r11 = setMax((byte[]) r4, (byte[]) r11)
            if (r11 == 0) goto L_0x00b4
            byte[] r11 = toIntRange
            int r12 = r11.length
            int r2 = r2 + r12
            long r12 = (long) r2
            int r2 = r11.length
            byte[] r2 = java.util.Arrays.copyOfRange(r4, r2, r5)
            r0.setMax((byte[]) r2, (int) r3)
            int r2 = (int) r12
            r0.updateVisuals = r2
            goto L_0x00e7
        L_0x00b4:
            byte[] r11 = ICustomTabsService
            boolean r11 = setMax((byte[]) r4, (byte[]) r11)
            if (r11 == 0) goto L_0x00e7
            byte[] r11 = ICustomTabsService
            int r12 = r11.length
            int r2 = r2 + r12
            long r14 = (long) r2
            int r2 = r11.length
            byte[] r2 = java.util.Arrays.copyOfRange(r4, r2, r5)
            java.lang.String r4 = "Xmp"
            java.lang.String r5 = r0.length((java.lang.String) r4)
            if (r5 != 0) goto L_0x00e7
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r5 = r0.mayLaunchUrl
            r5 = r5[r10]
            androidx.exifinterface.media.ExifInterface$getMax r11 = new androidx.exifinterface.media.ExifInterface$getMax
            r13 = 1
            int r12 = r2.length
            r16 = r12
            r12 = r11
            r17 = r14
            r14 = r16
            r15 = r17
            r17 = r2
            r12.<init>(r13, r14, r15, r17)
            r5.put(r4, r11)
        L_0x00e7:
            r2 = r9
            r5 = 0
        L_0x00e9:
            byte[] r4 = new byte[r5]
            int r9 = r1.read(r4)
            if (r9 != r5) goto L_0x0125
            java.lang.String r5 = "UserComment"
            java.lang.String r9 = r0.length((java.lang.String) r5)
            if (r9 != 0) goto L_0x010b
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r9 = r0.mayLaunchUrl
            r9 = r9[r7]
            java.lang.String r11 = new java.lang.String
            java.nio.charset.Charset r12 = equals
            r11.<init>(r4, r12)
            androidx.exifinterface.media.ExifInterface$getMax r4 = androidx.exifinterface.media.ExifInterface.getMax.getMax((java.lang.String) r11)
            r9.put(r5, r4)
        L_0x010b:
            r5 = 0
        L_0x010c:
            if (r5 < 0) goto L_0x011f
            int r4 = r1.skipBytes(r5)
            if (r4 != r5) goto L_0x0117
            int r2 = r2 + r5
            goto L_0x0024
        L_0x0117:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid JPEG segment"
            r1.<init>(r2)
            throw r1
        L_0x011f:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r8)
            throw r1
        L_0x0125:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        L_0x012d:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r8)
            throw r1
        L_0x0133:
            java.nio.ByteOrder r2 = r0.warmup
            r1.setMax = r2
            return
        L_0x0138:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid marker:"
            r2.<init>(r3)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0152:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x016a:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            goto L_0x0183
        L_0x0182:
            throw r1
        L_0x0183:
            goto L_0x0182
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.getMin(androidx.exifinterface.media.ExifInterface$length, int, int):void");
    }

    private void setMax(length length2) throws IOException {
        getMax getmax;
        length(length2, length2.available());
        getMin(length2, 0);
        setMax(length2, 0);
        setMax(length2, 5);
        setMax(length2, 4);
        setMax();
        if (this.extraCommand == 8 && (getmax = this.mayLaunchUrl[1].get("MakerNote")) != null) {
            length length3 = new length(getmax.getMin);
            length3.setMax = this.warmup;
            length3.setMax(6);
            getMin(length3, 9);
            getMax getmax2 = this.mayLaunchUrl[9].get("ColorSpace");
            if (getmax2 != null) {
                this.mayLaunchUrl[1].put("ColorSpace", getmax2);
            }
        }
    }

    private void length(length length2) throws IOException {
        length2.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        length2.read(bArr);
        length2.skipBytes(4);
        length2.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        getMin(length2, i, 5);
        length2.setMax((long) i2);
        length2.setMax = ByteOrder.BIG_ENDIAN;
        int readInt = length2.readInt();
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = length2.readUnsignedShort();
            int readUnsignedShort2 = length2.readUnsignedShort();
            if (readUnsignedShort == ICustomTabsCallback.setMin) {
                int readShort = length2.readShort();
                int readShort2 = length2.readShort();
                int[] iArr = {readShort};
                getMax min = getMax.setMin(iArr, this.warmup);
                int[] iArr2 = {readShort2};
                getMax min2 = getMax.setMin(iArr2, this.warmup);
                this.mayLaunchUrl[0].put("ImageLength", min);
                this.mayLaunchUrl[0].put("ImageWidth", min2);
                return;
            }
            length2.skipBytes(readUnsignedShort2);
        }
    }

    private void setMax(byte[] bArr, int i) throws IOException {
        length length2 = new length(bArr);
        length(length2, bArr.length);
        getMin(length2, i);
    }

    private void setMin() {
        String length2 = length("DateTimeOriginal");
        if (length2 != null && length("DateTime") == null) {
            this.mayLaunchUrl[0].put("DateTime", getMax.getMax(length2));
        }
        if (length("ImageWidth") == null) {
            long[] jArr = {0};
            this.mayLaunchUrl[0].put("ImageWidth", getMax.getMax(jArr, this.warmup));
        }
        if (length("ImageLength") == null) {
            long[] jArr2 = {0};
            this.mayLaunchUrl[0].put("ImageLength", getMax.getMax(jArr2, this.warmup));
        }
        if (length("Orientation") == null) {
            long[] jArr3 = {0};
            this.mayLaunchUrl[0].put("Orientation", getMax.getMax(jArr3, this.warmup));
        }
        if (length("LightSource") == null) {
            long[] jArr4 = {0};
            this.mayLaunchUrl[1].put("LightSource", getMax.getMax(jArr4, this.warmup));
        }
    }

    private static ByteOrder getMin(length length2) throws IOException {
        short readShort = length2.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        StringBuilder sb = new StringBuilder("Invalid byte order: ");
        sb.append(Integer.toHexString(readShort));
        throw new IOException(sb.toString());
    }

    private void length(length length2, int i) throws IOException {
        ByteOrder min = getMin(length2);
        this.warmup = min;
        length2.setMax = min;
        int readUnsignedShort = length2.readUnsignedShort();
        int i2 = this.extraCommand;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = length2.readInt();
            if (readInt < 8 || readInt >= i) {
                throw new IOException("Invalid first Ifd offset: ".concat(String.valueOf(readInt)));
            }
            int i3 = readInt - 8;
            if (i3 > 0 && length2.skipBytes(i3) != i3) {
                throw new IOException("Couldn't jump to first Ifd: ".concat(String.valueOf(i3)));
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Invalid start code: ");
        sb.append(Integer.toHexString(readUnsignedShort));
        throw new IOException(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void getMin(androidx.exifinterface.media.ExifInterface.length r26, int r27) throws java.io.IOException {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r4 = r27
        L_0x0006:
            java.util.Set<java.lang.Integer> r5 = r0.newSessionWithExtras
            int r6 = r1.getMin
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.add(r6)
            int r5 = r1.getMin
            int r5 = r5 + 2
            int r6 = r1.setMin
            if (r5 <= r6) goto L_0x001a
            return
        L_0x001a:
            short r5 = r26.readShort()
            int r6 = r1.getMin
            int r7 = r5 * 12
            int r6 = r6 + r7
            int r7 = r1.setMin
            if (r6 > r7) goto L_0x02a6
            if (r5 > 0) goto L_0x002b
            goto L_0x02a6
        L_0x002b:
            r7 = 0
        L_0x002c:
            r8 = 0
            if (r7 >= r5) goto L_0x025e
            int r10 = r26.readUnsignedShort()
            int r11 = r26.readUnsignedShort()
            int r14 = r26.readInt()
            int r12 = r1.getMin
            long r12 = (long) r12
            r15 = 4
            long r12 = r12 + r15
            java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface$setMax>[] r17 = asInterface
            r2 = r17[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            java.lang.Object r2 = r2.get(r3)
            androidx.exifinterface.media.ExifInterface$setMax r2 = (androidx.exifinterface.media.ExifInterface.setMax) r2
            boolean r3 = toString
            if (r3 == 0) goto L_0x0064
            java.lang.Integer.valueOf(r4)
            java.lang.Integer.valueOf(r10)
            if (r2 == 0) goto L_0x005e
            java.lang.String r3 = r2.getMax
        L_0x005e:
            java.lang.Integer.valueOf(r11)
            java.lang.Integer.valueOf(r14)
        L_0x0064:
            r3 = 7
            if (r2 != 0) goto L_0x006d
            boolean r17 = toString
        L_0x0069:
            r6 = r4
            r16 = r10
            goto L_0x00a7
        L_0x006d:
            if (r11 <= 0) goto L_0x00a2
            int[] r6 = IsOverlapping
            int r6 = r6.length
            if (r11 < r6) goto L_0x0075
            goto L_0x00a2
        L_0x0075:
            boolean r6 = r2.getMax(r11)
            if (r6 != 0) goto L_0x007e
            boolean r6 = toString
            goto L_0x0069
        L_0x007e:
            if (r11 != r3) goto L_0x0082
            int r11 = r2.length
        L_0x0082:
            r6 = r4
            long r3 = (long) r14
            int[] r19 = IsOverlapping
            r15 = r19[r11]
            r16 = r10
            r19 = r11
            long r10 = (long) r15
            long r3 = r3 * r10
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x009f
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r15 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r15 <= 0) goto L_0x009b
            goto L_0x009f
        L_0x009b:
            r11 = r19
            r10 = 1
            goto L_0x00a9
        L_0x009f:
            r11 = r19
            goto L_0x00a8
        L_0x00a2:
            r6 = r4
            r16 = r10
            boolean r3 = toString
        L_0x00a7:
            r3 = r8
        L_0x00a8:
            r10 = 0
        L_0x00a9:
            if (r10 != 0) goto L_0x00b8
            r1.setMax(r12)
            r21 = r5
            r22 = r6
            r27 = r7
            r18 = 0
            goto L_0x0255
        L_0x00b8:
            java.lang.String r10 = "Compression"
            r19 = 4
            int r15 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r15 <= 0) goto L_0x016b
            int r15 = r26.readInt()
            int r8 = r0.extraCommand
            r9 = 7
            if (r8 != r9) goto L_0x013e
            java.lang.String r8 = r2.getMax
            java.lang.String r9 = "MakerNote"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x00d6
            r0.receiveFile = r15
            goto L_0x0133
        L_0x00d6:
            r8 = 6
            if (r6 != r8) goto L_0x0133
            java.lang.String r9 = r2.getMax
            java.lang.String r8 = "ThumbnailImage"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0133
            r0.ICustomTabsService$Stub$Proxy = r15
            r0.ICustomTabsService$Default = r14
            java.nio.ByteOrder r8 = r0.warmup
            r21 = r5
            r9 = 1
            int[] r5 = new int[r9]
            r17 = 6
            r18 = 0
            r5[r18] = r17
            androidx.exifinterface.media.ExifInterface$getMax r5 = androidx.exifinterface.media.ExifInterface.getMax.setMin((int[]) r5, (java.nio.ByteOrder) r8)
            int r8 = r0.ICustomTabsService$Stub$Proxy
            r27 = r7
            long r7 = (long) r8
            r22 = r6
            java.nio.ByteOrder r6 = r0.warmup
            r17 = r14
            long[] r14 = new long[r9]
            r14[r18] = r7
            androidx.exifinterface.media.ExifInterface$getMax r6 = androidx.exifinterface.media.ExifInterface.getMax.getMax((long[]) r14, (java.nio.ByteOrder) r6)
            int r7 = r0.ICustomTabsService$Default
            long r7 = (long) r7
            java.nio.ByteOrder r14 = r0.warmup
            long[] r9 = new long[r9]
            r9[r18] = r7
            androidx.exifinterface.media.ExifInterface$getMax r7 = androidx.exifinterface.media.ExifInterface.getMax.getMax((long[]) r9, (java.nio.ByteOrder) r14)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r8 = r0.mayLaunchUrl
            r9 = 4
            r8 = r8[r9]
            r8.put(r10, r5)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r5 = r0.mayLaunchUrl
            r5 = r5[r9]
            java.lang.String r8 = "JPEGInterchangeFormat"
            r5.put(r8, r6)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r5 = r0.mayLaunchUrl
            r5 = r5[r9]
            java.lang.String r6 = "JPEGInterchangeFormatLength"
            r5.put(r6, r7)
            goto L_0x0158
        L_0x0133:
            r21 = r5
            r22 = r6
            r27 = r7
            r17 = r14
            r18 = 0
            goto L_0x0158
        L_0x013e:
            r21 = r5
            r22 = r6
            r27 = r7
            r17 = r14
            r18 = 0
            r5 = 10
            if (r8 != r5) goto L_0x0158
            java.lang.String r5 = r2.getMax
            java.lang.String r6 = "JpgFromRaw"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0158
            r0.IPostMessageService = r15
        L_0x0158:
            long r5 = (long) r15
            long r7 = r5 + r3
            int r9 = r1.setMin
            long r14 = (long) r9
            int r9 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r9 > 0) goto L_0x0166
            r1.setMax(r5)
            goto L_0x0175
        L_0x0166:
            r1.setMax(r12)
            goto L_0x0255
        L_0x016b:
            r21 = r5
            r22 = r6
            r27 = r7
            r17 = r14
            r18 = 0
        L_0x0175:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r5 = getDefaultImpl
            java.lang.Integer r6 = java.lang.Integer.valueOf(r16)
            java.lang.Object r5 = r5.get(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            r6 = 8
            r7 = 3
            if (r5 == 0) goto L_0x01e5
            r3 = -1
            if (r11 == r7) goto L_0x01ae
            r7 = 4
            if (r11 == r7) goto L_0x01a2
            if (r11 == r6) goto L_0x019d
            r6 = 9
            if (r11 == r6) goto L_0x0198
            r6 = 13
            if (r11 == r6) goto L_0x0198
            goto L_0x01b3
        L_0x0198:
            int r3 = r26.readInt()
            goto L_0x01b2
        L_0x019d:
            short r3 = r26.readShort()
            goto L_0x01b2
        L_0x01a2:
            int r3 = r26.readInt()
            long r3 = (long) r3
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            goto L_0x01b3
        L_0x01ae:
            int r3 = r26.readUnsignedShort()
        L_0x01b2:
            long r3 = (long) r3
        L_0x01b3:
            boolean r6 = toString
            if (r6 == 0) goto L_0x01bc
            java.lang.Long.valueOf(r3)
            java.lang.String r2 = r2.getMax
        L_0x01bc:
            r6 = 0
            int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x01e0
            int r2 = r1.setMin
            long r6 = (long) r2
            int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x01e0
            java.util.Set<java.lang.Integer> r2 = r0.newSessionWithExtras
            int r6 = (int) r3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r2 = r2.contains(r6)
            if (r2 != 0) goto L_0x01e0
            r1.setMax(r3)
            int r2 = r5.intValue()
            r0.getMin(r1, r2)
        L_0x01e0:
            r1.setMax(r12)
            goto L_0x0255
        L_0x01e5:
            int r5 = r1.getMin
            int r4 = (int) r3
            byte[] r3 = new byte[r4]
            r1.readFully(r3)
            androidx.exifinterface.media.ExifInterface$getMax r4 = new androidx.exifinterface.media.ExifInterface$getMax
            long r8 = (long) r5
            r14 = r12
            r12 = r4
            r13 = r11
            r23 = r14
            r14 = r17
            r15 = r8
            r17 = r3
            r12.<init>(r13, r14, r15, r17)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r3 = r0.mayLaunchUrl
            r3 = r3[r22]
            java.lang.String r5 = r2.getMax
            r3.put(r5, r4)
            java.lang.String r3 = r2.getMax
            java.lang.String r5 = "DNGVersion"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0212
            r0.extraCommand = r7
        L_0x0212:
            java.lang.String r3 = r2.getMax
            java.lang.String r5 = "Make"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x0226
            java.lang.String r3 = r2.getMax
            java.lang.String r5 = "Model"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0234
        L_0x0226:
            java.nio.ByteOrder r3 = r0.warmup
            java.lang.String r3 = r4.getMin(r3)
            java.lang.String r5 = "PENTAX"
            boolean r3 = r3.contains(r5)
            if (r3 != 0) goto L_0x0247
        L_0x0234:
            java.lang.String r2 = r2.getMax
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x0249
            java.nio.ByteOrder r2 = r0.warmup
            int r2 = r4.getMax((java.nio.ByteOrder) r2)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r3) goto L_0x0249
        L_0x0247:
            r0.extraCommand = r6
        L_0x0249:
            int r2 = r1.getMin
            long r2 = (long) r2
            r12 = r23
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x0255
            r1.setMax(r12)
        L_0x0255:
            int r7 = r27 + 1
            short r7 = (short) r7
            r5 = r21
            r4 = r22
            goto L_0x002c
        L_0x025e:
            int r2 = r1.getMin
            r3 = 4
            int r2 = r2 + r3
            int r3 = r1.setMin
            if (r2 > r3) goto L_0x02a6
            int r2 = r26.readInt()
            boolean r3 = toString
            if (r3 == 0) goto L_0x0271
            java.lang.Integer.valueOf(r2)
        L_0x0271:
            long r3 = (long) r2
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x02a6
            int r5 = r1.setMin
            if (r2 >= r5) goto L_0x02a6
            java.util.Set<java.lang.Integer> r5 = r0.newSessionWithExtras
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r5.contains(r2)
            if (r2 != 0) goto L_0x02a6
            r1.setMax(r3)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r2 = r0.mayLaunchUrl
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0299
            r4 = 4
            goto L_0x0006
        L_0x0299:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$getMax>[] r2 = r0.mayLaunchUrl
            r4 = 5
            r2 = r2[r4]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02a6
            goto L_0x0006
        L_0x02a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.getMin(androidx.exifinterface.media.ExifInterface$length, int):void");
    }

    private void setMin(length length2, int i) throws IOException {
        getMax getmax;
        getMax getmax2 = this.mayLaunchUrl[i].get("ImageLength");
        getMax getmax3 = this.mayLaunchUrl[i].get("ImageWidth");
        if ((getmax2 == null || getmax3 == null) && (getmax = this.mayLaunchUrl[i].get("JPEGInterchangeFormat")) != null) {
            getMin(length2, getmax.getMax(this.warmup), i);
        }
    }

    private void length(length length2, HashMap hashMap) throws IOException {
        int i;
        getMax getmax = (getMax) hashMap.get("JPEGInterchangeFormat");
        getMax getmax2 = (getMax) hashMap.get("JPEGInterchangeFormatLength");
        if (getmax != null && getmax2 != null) {
            int max = getmax.getMax(this.warmup);
            int min = Math.min(getmax2.getMax(this.warmup), length2.setMin - max);
            int i2 = this.extraCommand;
            if (i2 == 4 || i2 == 9 || i2 == 10) {
                i = this.updateVisuals;
            } else {
                if (i2 == 7) {
                    i = this.receiveFile;
                }
                if (max > 0 && min > 0) {
                    this.newSession = true;
                    this.requestPostMessageChannelWithExtras = max;
                    this.validateRelationship = min;
                    if (this.getInterfaceDescriptor == null && this.ICustomTabsCallback$Stub$Proxy == null && this.setDefaultImpl == null) {
                        byte[] bArr = new byte[min];
                        length2.setMax((long) max);
                        length2.readFully(bArr);
                        this.requestPostMessageChannel = bArr;
                        return;
                    }
                    return;
                }
            }
            max += i;
            if (max > 0) {
            }
        }
    }

    private void setMax(length length2, HashMap hashMap) throws IOException {
        getMax getmax = (getMax) hashMap.get("StripOffsets");
        getMax getmax2 = (getMax) hashMap.get("StripByteCounts");
        if (getmax != null && getmax2 != null) {
            long[] length3 = length(getmax.setMin(this.warmup));
            long[] length4 = length(getmax2.setMin(this.warmup));
            if (length3 != null && length4 != null) {
                long j = 0;
                for (long j2 : length4) {
                    j += j2;
                }
                int i = (int) j;
                byte[] bArr = new byte[i];
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < length3.length; i4++) {
                    int i5 = (int) length3[i4];
                    int i6 = (int) length4[i4];
                    int i7 = i5 - i2;
                    length2.setMax((long) i7);
                    int i8 = i2 + i7;
                    byte[] bArr2 = new byte[i6];
                    length2.read(bArr2);
                    i2 = i8 + i6;
                    System.arraycopy(bArr2, 0, bArr, i3, i6);
                    i3 += i6;
                }
                this.newSession = true;
                this.requestPostMessageChannel = bArr;
                this.validateRelationship = i;
            }
        }
    }

    private boolean length(HashMap hashMap) throws IOException {
        getMax getmax;
        getMax getmax2 = (getMax) hashMap.get("BitsPerSample");
        if (getmax2 == null) {
            return false;
        }
        int[] iArr = (int[]) getmax2.setMin(this.warmup);
        if (Arrays.equals(setMax, iArr)) {
            return true;
        }
        if (this.extraCommand != 3 || (getmax = (getMax) hashMap.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int max = getmax.getMax(this.warmup);
        if ((max != 1 || !Arrays.equals(iArr, length)) && (max != 6 || !Arrays.equals(iArr, setMax))) {
            return false;
        }
        return true;
    }

    private boolean setMin(HashMap hashMap) throws IOException {
        getMax getmax = (getMax) hashMap.get("ImageLength");
        getMax getmax2 = (getMax) hashMap.get("ImageWidth");
        if (getmax == null || getmax2 == null) {
            return false;
        }
        return getmax.getMax(this.warmup) <= 512 && getmax2.getMax(this.warmup) <= 512;
    }

    private void setMax() throws IOException {
        setMin(0, 5);
        setMin(0, 4);
        setMin(5, 4);
        getMax getmax = this.mayLaunchUrl[1].get("PixelXDimension");
        getMax getmax2 = this.mayLaunchUrl[1].get("PixelYDimension");
        if (!(getmax == null || getmax2 == null)) {
            this.mayLaunchUrl[0].put("ImageWidth", getmax);
            this.mayLaunchUrl[0].put("ImageLength", getmax2);
        }
        if (this.mayLaunchUrl[4].isEmpty() && setMin((HashMap) this.mayLaunchUrl[5])) {
            HashMap<String, getMax>[] hashMapArr = this.mayLaunchUrl;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        setMin((HashMap) this.mayLaunchUrl[4]);
    }

    private void setMax(length length2, int i) throws IOException {
        getMax getmax;
        getMax getmax2;
        getMax getmax3 = this.mayLaunchUrl[i].get("DefaultCropSize");
        getMax getmax4 = this.mayLaunchUrl[i].get("SensorTopBorder");
        getMax getmax5 = this.mayLaunchUrl[i].get("SensorLeftBorder");
        getMax getmax6 = this.mayLaunchUrl[i].get("SensorBottomBorder");
        getMax getmax7 = this.mayLaunchUrl[i].get("SensorRightBorder");
        if (getmax3 != null) {
            if (getmax3.setMax == 5) {
                getMin[] getminArr = (getMin[]) getmax3.setMin(this.warmup);
                if (getminArr == null || getminArr.length != 2) {
                    Arrays.toString(getminArr);
                    return;
                }
                getMin getmin = getminArr[0];
                getMin[] getminArr2 = {getmin};
                getmax2 = getMax.getMax(getminArr2, this.warmup);
                getMin getmin2 = getminArr[1];
                getMin[] getminArr3 = {getmin2};
                getmax = getMax.getMax(getminArr3, this.warmup);
            } else {
                int[] iArr = (int[]) getmax3.setMin(this.warmup);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                }
                int i2 = iArr[0];
                int[] iArr2 = {i2};
                getmax2 = getMax.setMin(iArr2, this.warmup);
                int i3 = iArr[1];
                int[] iArr3 = {i3};
                getmax = getMax.setMin(iArr3, this.warmup);
            }
            this.mayLaunchUrl[i].put("ImageWidth", getmax2);
            this.mayLaunchUrl[i].put("ImageLength", getmax);
        } else if (getmax4 == null || getmax5 == null || getmax6 == null || getmax7 == null) {
            setMin(length2, i);
        } else {
            int max = getmax4.getMax(this.warmup);
            int max2 = getmax6.getMax(this.warmup);
            int max3 = getmax7.getMax(this.warmup);
            int max4 = getmax5.getMax(this.warmup);
            if (max2 > max && max3 > max4) {
                int i4 = max2 - max;
                int i5 = max3 - max4;
                int[] iArr4 = {i4};
                getMax min = getMax.setMin(iArr4, this.warmup);
                int[] iArr5 = {i5};
                getMax min2 = getMax.setMin(iArr5, this.warmup);
                this.mayLaunchUrl[i].put("ImageLength", min);
                this.mayLaunchUrl[i].put("ImageWidth", min2);
            }
        }
    }

    static class length extends InputStream implements DataInput {
        private static final ByteOrder getMax = ByteOrder.BIG_ENDIAN;
        private static final ByteOrder length = ByteOrder.LITTLE_ENDIAN;
        int getMin;
        ByteOrder setMax;
        final int setMin;
        private DataInputStream toIntRange;

        public final String readLine() throws IOException {
            return null;
        }

        public length(InputStream inputStream) throws IOException {
            this.setMax = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.toIntRange = dataInputStream;
            int available = dataInputStream.available();
            this.setMin = available;
            this.getMin = 0;
            this.toIntRange.mark(available);
        }

        public length(byte[] bArr) throws IOException {
            this((InputStream) new ByteArrayInputStream(bArr));
        }

        public final void setMax(long j) throws IOException {
            int i = this.getMin;
            if (((long) i) > j) {
                this.getMin = 0;
                this.toIntRange.reset();
                this.toIntRange.mark(this.setMin);
            } else {
                j -= (long) i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public final int available() throws IOException {
            return this.toIntRange.available();
        }

        public final int read() throws IOException {
            this.getMin++;
            return this.toIntRange.read();
        }

        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.toIntRange.read(bArr, i, i2);
            this.getMin += read;
            return read;
        }

        public final int readUnsignedByte() throws IOException {
            this.getMin++;
            return this.toIntRange.readUnsignedByte();
        }

        public final boolean readBoolean() throws IOException {
            this.getMin++;
            return this.toIntRange.readBoolean();
        }

        public final char readChar() throws IOException {
            this.getMin += 2;
            return this.toIntRange.readChar();
        }

        public final String readUTF() throws IOException {
            this.getMin += 2;
            return this.toIntRange.readUTF();
        }

        public final void readFully(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.getMin + i2;
            this.getMin = i3;
            if (i3 > this.setMin) {
                throw new EOFException();
            } else if (this.toIntRange.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public final void readFully(byte[] bArr) throws IOException {
            int length2 = this.getMin + bArr.length;
            this.getMin = length2;
            if (length2 > this.setMin) {
                throw new EOFException();
            } else if (this.toIntRange.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public final byte readByte() throws IOException {
            int i = this.getMin + 1;
            this.getMin = i;
            if (i <= this.setMin) {
                int read = this.toIntRange.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final short readShort() throws IOException {
            int i = this.getMin + 2;
            this.getMin = i;
            if (i <= this.setMin) {
                int read = this.toIntRange.read();
                int read2 = this.toIntRange.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.setMax;
                    if (byteOrder == length) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == getMax) {
                        return (short) ((read << 8) + read2);
                    }
                    StringBuilder sb = new StringBuilder("Invalid byte order: ");
                    sb.append(this.setMax);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final int readInt() throws IOException {
            int i = this.getMin + 4;
            this.getMin = i;
            if (i <= this.setMin) {
                int read = this.toIntRange.read();
                int read2 = this.toIntRange.read();
                int read3 = this.toIntRange.read();
                int read4 = this.toIntRange.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.setMax;
                    if (byteOrder == length) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == getMax) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    StringBuilder sb = new StringBuilder("Invalid byte order: ");
                    sb.append(this.setMax);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final int skipBytes(int i) throws IOException {
            int min = Math.min(i, this.setMin - this.getMin);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.toIntRange.skipBytes(min - i2);
            }
            this.getMin += i2;
            return i2;
        }

        public final int readUnsignedShort() throws IOException {
            int i = this.getMin + 2;
            this.getMin = i;
            if (i <= this.setMin) {
                int read = this.toIntRange.read();
                int read2 = this.toIntRange.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.setMax;
                    if (byteOrder == length) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == getMax) {
                        return (read << 8) + read2;
                    }
                    StringBuilder sb = new StringBuilder("Invalid byte order: ");
                    sb.append(this.setMax);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final long readLong() throws IOException {
            int i = this.getMin + 8;
            this.getMin = i;
            if (i <= this.setMin) {
                int read = this.toIntRange.read();
                int read2 = this.toIntRange.read();
                int read3 = this.toIntRange.read();
                int read4 = this.toIntRange.read();
                int read5 = this.toIntRange.read();
                int read6 = this.toIntRange.read();
                int read7 = this.toIntRange.read();
                int read8 = this.toIntRange.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.setMax;
                    if (byteOrder == length) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    int i2 = read2;
                    if (byteOrder == getMax) {
                        return (((long) read) << 56) + (((long) i2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    StringBuilder sb = new StringBuilder("Invalid byte order: ");
                    sb.append(this.setMax);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }
    }

    private void setMin(int i, int i2) throws IOException {
        if (!this.mayLaunchUrl[i].isEmpty() && !this.mayLaunchUrl[i2].isEmpty()) {
            getMax getmax = this.mayLaunchUrl[i].get("ImageLength");
            getMax getmax2 = this.mayLaunchUrl[i].get("ImageWidth");
            getMax getmax3 = this.mayLaunchUrl[i2].get("ImageLength");
            getMax getmax4 = this.mayLaunchUrl[i2].get("ImageWidth");
            if (getmax == null || getmax2 == null) {
                if (toString) {
                }
            } else if (getmax3 != null && getmax4 != null) {
                int max = getmax.getMax(this.warmup);
                int max2 = getmax2.getMax(this.warmup);
                int max3 = getmax3.getMax(this.warmup);
                int max4 = getmax4.getMax(this.warmup);
                if (max < max3 && max2 < max4) {
                    HashMap<String, getMax>[] hashMapArr = this.mayLaunchUrl;
                    HashMap<String, getMax> hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            } else if (!toString) {
            }
        }
    }

    private static long[] length(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    private static boolean setMax(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
