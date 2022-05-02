package o;

import java.security.SecureRandom;

public final class setEntryInfo {
    private static final String ALPHANUMERIC = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int DEFAULT_LENGTH = 10;
    private static final SecureRandom RANDOM = new SecureRandom();

    public static String randomString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(ALPHANUMERIC.charAt(RANDOM.nextInt(62)));
        }
        return sb.toString();
    }

    public static char randomChar() {
        return ALPHANUMERIC.charAt(RANDOM.nextInt(61));
    }

    public static String randomString(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(ALPHANUMERIC.charAt(RANDOM.nextInt(62)));
        }
        return sb.toString();
    }

    public static int randomInt() {
        return RANDOM.nextInt(10);
    }

    public static int randomInt(int i) {
        return RANDOM.nextInt(i);
    }

    public static boolean randomBoolean() {
        return Math.random() < 0.5d;
    }

    public static long randomLong() {
        return RANDOM.nextLong();
    }
}
