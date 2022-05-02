package o;

public final class BisBehavLog extends LogItem {
    public static final Double extraCallbackWithResult = Double.valueOf(1.0d);
    public static final Double onPostMessage = Double.valueOf(0.0d);
    public static final Double onRelationshipValidationResult = Double.valueOf(-1.0d);

    static String setMax(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        char[] cArr = new char[((length * 2) + 1)];
        cArr[0] = 1;
        for (int i = 0; i != length; i++) {
            int i2 = iArr[i];
            int i3 = (i * 2) + 1;
            cArr[i3] = (char) (i2 >>> 16);
            cArr[i3 + 1] = (char) i2;
        }
        return new String(cArr);
    }
}
