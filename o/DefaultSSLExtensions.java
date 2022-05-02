package o;

public abstract class DefaultSSLExtensions implements setOkButtonText {
    private final char setMin;

    public final int getMin() {
        return 1;
    }

    protected DefaultSSLExtensions(char c) {
        this.setMin = c;
    }

    public final char length() {
        return this.setMin;
    }

    public final char getMax() {
        return this.setMin;
    }

    public final int getMax(getEditText getedittext, getEditText getedittext2) {
        if ((getedittext.setMax() || getedittext2.length()) && (getedittext.setMin() + getedittext2.setMin()) % 3 == 0) {
            return 0;
        }
        return (getedittext.getMax() < 2 || getedittext2.getMax() < 2) ? 1 : 2;
    }

    public final void getMax(WSContextUtil wSContextUtil, WSContextUtil wSContextUtil2, int i) {
        Base64$OutputStream base64$OutputStream;
        String valueOf = String.valueOf(length());
        if (i == 1) {
            base64$OutputStream = new decode4to3(valueOf);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(valueOf);
            sb.append(valueOf);
            base64$OutputStream = new utf8Bytes(sb.toString());
        }
        Base64$OutputStream base64$OutputStream2 = wSContextUtil.IsOverlapping;
        while (base64$OutputStream2 != null && base64$OutputStream2 != wSContextUtil2) {
            Base64$OutputStream base64$OutputStream3 = base64$OutputStream2.IsOverlapping;
            base64$OutputStream.getMax(base64$OutputStream2);
            base64$OutputStream2 = base64$OutputStream3;
        }
        wSContextUtil.setMin(base64$OutputStream);
    }
}
