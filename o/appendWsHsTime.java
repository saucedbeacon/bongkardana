package o;

public final class appendWsHsTime implements setOkButtonText {
    public final char getMax() {
        return '~';
    }

    public final int getMin() {
        return 2;
    }

    public final char length() {
        return '~';
    }

    public final int getMax(getEditText getedittext, getEditText getedittext2) {
        return (getedittext.getMax() < 2 || getedittext2.getMax() < 2) ? 0 : 2;
    }

    public final void getMax(WSContextUtil wSContextUtil, WSContextUtil wSContextUtil2, int i) {
        appendSSLTime appendssltime = new appendSSLTime();
        Base64$OutputStream base64$OutputStream = wSContextUtil.IsOverlapping;
        while (base64$OutputStream != null && base64$OutputStream != wSContextUtil2) {
            Base64$OutputStream base64$OutputStream2 = base64$OutputStream.IsOverlapping;
            appendssltime.getMax(base64$OutputStream);
            base64$OutputStream = base64$OutputStream2;
        }
        wSContextUtil.setMin(appendssltime);
    }
}
