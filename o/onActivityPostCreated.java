package o;

public final class onActivityPostCreated {
    public static void setMax(char[] cArr, char c, char c2, char c3, char c4) {
        char c5 = 58224;
        for (int i = 0; i < 16; i++) {
            cArr[1] = (char) (cArr[1] - (((cArr[0] + c5) ^ ((cArr[0] << 4) + c3)) ^ ((cArr[0] >>> 5) + c4)));
            cArr[0] = (char) (cArr[0] - (((cArr[1] >>> 5) + c2) ^ ((cArr[1] + c5) ^ ((cArr[1] << 4) + c))));
            c5 = (char) (c5 - 40503);
        }
    }
}
