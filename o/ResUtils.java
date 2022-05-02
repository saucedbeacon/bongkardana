package o;

public final class ResUtils extends EditTextUtil {
    private static final int Id_length = 1;
    private static final int Id_name = 3;
    private boolean myLength = true;
    private boolean myName = true;

    public ResUtils(printExceptionStackTrace printexceptionstacktrace, Object obj, int i, String str, int i2, LogUtils logUtils) {
        super(printexceptionstacktrace, obj, i, str, i2, logUtils);
    }

    /* access modifiers changed from: protected */
    public final int findInstanceIdInfo(String str) {
        if (str.equals("length")) {
            return instanceIdInfo(3, 1);
        }
        if (str.equals("name")) {
            return instanceIdInfo(3, 3);
        }
        return super.findInstanceIdInfo(str);
    }

    /* access modifiers changed from: protected */
    public final Object getInstanceIdValue(int i) {
        if (i == 1 && !this.myLength) {
            return getMax;
        }
        if (i != 3 || this.myName) {
            return super.getInstanceIdValue(i);
        }
        return getMax;
    }

    /* access modifiers changed from: protected */
    public final void setInstanceIdValue(int i, Object obj) {
        if (i == 1 && obj == getMax) {
            this.myLength = false;
        } else if (i == 3 && obj == getMax) {
            this.myName = false;
        } else {
            super.setInstanceIdValue(i, obj);
        }
    }
}
