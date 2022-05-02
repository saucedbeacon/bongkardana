package o;

public final class NotificationCompat$NotificationVisibility {
    public static String getMin(String str, int i) {
        StringBuilder sb = new StringBuilder(str.length() + 4);
        sb.append(str);
        sb.append('!');
        sb.append(i);
        return sb.toString();
    }
}
