package o;

public final class MdapFileLogAppender {
    private int length;
    private String setMin;

    MdapFileLogAppender(int i, String str) {
        this.length = i;
        this.setMin = str;
    }

    MdapFileLogAppender(int i, String str, Object... objArr) {
        this.setMin = String.format(str, objArr);
        this.length = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.length);
        sb.append(": ");
        sb.append(this.setMin);
        return sb.toString();
    }
}
