package o;

import android.media.session.PlaybackState;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import com.google.common.base.Ascii;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ICustomTabsService {
    public static final ICustomTabsService setMax = new ICustomTabsService();
    public static final char[] setMin;

    public interface Default {
        void length();
    }

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "(this as java.lang.String).toCharArray()");
        setMin = charArray;
    }

    @NotNull
    public static String getMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "cardNumber");
        String substring = str.substring(0, 4);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String substring2 = str.substring(4, 8);
        Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String substring3 = str.substring(8, 12);
        Intrinsics.checkNotNullExpressionValue(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String substring4 = str.substring(12);
        Intrinsics.checkNotNullExpressionValue(substring4, "(this as java.lang.String).substring(startIndex)");
        StringBuilder sb = new StringBuilder();
        sb.append(substring);
        sb.append(' ');
        sb.append(substring2);
        sb.append(' ');
        sb.append(substring3);
        sb.append(' ');
        sb.append(substring4);
        return sb.toString();
    }

    @NotNull
    public static String getMin(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "bytes");
        char[] cArr = new char[(bArr.length * 2)];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = setMin;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & Ascii.SI];
        }
        return new String(cArr);
    }

    @NotNull
    public static byte[] length(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "s");
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    @RequiresApi(21)
    public class Stub {

        @RequiresApi(22)
        public class Proxy {
            public static Bundle setMax(Object obj) {
                return ((PlaybackState) obj).getExtras();
            }
        }

        public static int getMin(Object obj) {
            return ((PlaybackState) obj).getState();
        }

        public static long length(Object obj) {
            return ((PlaybackState) obj).getPosition();
        }

        public static long getMax(Object obj) {
            return ((PlaybackState) obj).getBufferedPosition();
        }

        public static float setMin(Object obj) {
            return ((PlaybackState) obj).getPlaybackSpeed();
        }

        public static long setMax(Object obj) {
            return ((PlaybackState) obj).getActions();
        }

        public static CharSequence IsOverlapping(Object obj) {
            return ((PlaybackState) obj).getErrorMessage();
        }

        public static long toFloatRange(Object obj) {
            return ((PlaybackState) obj).getLastPositionUpdateTime();
        }

        public static List<Object> isInside(Object obj) {
            return ((PlaybackState) obj).getCustomActions();
        }

        public static long toIntRange(Object obj) {
            return ((PlaybackState) obj).getActiveQueueItemId();
        }

        public static final class length {
            public static String getMin(Object obj) {
                return ((PlaybackState.CustomAction) obj).getAction();
            }

            public static CharSequence getMax(Object obj) {
                return ((PlaybackState.CustomAction) obj).getName();
            }

            public static int length(Object obj) {
                return ((PlaybackState.CustomAction) obj).getIcon();
            }

            public static Bundle setMax(Object obj) {
                return ((PlaybackState.CustomAction) obj).getExtras();
            }
        }
    }
}
