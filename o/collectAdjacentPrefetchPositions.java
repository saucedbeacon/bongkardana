package o;

import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

public final class collectAdjacentPrefetchPositions {
    public static CodingErrorAction getMin = CodingErrorAction.REPORT;

    public static byte[] setMin(String str) {
        try {
            return str.getBytes("UTF8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] setMax(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String setMax(byte[] bArr, int i) {
        try {
            return new String(bArr, 0, i, "ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String setMin(ByteBuffer byteBuffer) throws InvalidDataException {
        CharsetDecoder newDecoder = Charset.forName("UTF8").newDecoder();
        newDecoder.onMalformedInput(getMin);
        newDecoder.onUnmappableCharacter(getMin);
        try {
            byteBuffer.mark();
            String obj = newDecoder.decode(byteBuffer).toString();
            byteBuffer.reset();
            return obj;
        } catch (CharacterCodingException e) {
            throw new InvalidDataException(1007, (Throwable) e);
        }
    }
}
