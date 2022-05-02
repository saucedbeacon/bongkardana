package org.mozilla.javascript;

public class WrappedException extends EvaluatorException {
    static final long serialVersionUID = -1551979216966520648L;
    private Throwable exception;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WrappedException(java.lang.Throwable r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Wrapped "
            r0.<init>(r1)
            java.lang.String r1 = r3.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.exception = r3
            o.getStyleId.setMax((java.lang.RuntimeException) r2, (java.lang.Throwable) r3)
            r3 = 1
            int[] r3 = new int[r3]
            r0 = 0
            r3[r0] = r0
            java.lang.String r1 = o.SecureQwertyKeyboard.AnonymousClass1.setMax((int[]) r3)
            r3 = r3[r0]
            if (r1 == 0) goto L_0x002b
            r2.initSourceName(r1)
        L_0x002b:
            if (r3 == 0) goto L_0x0030
            r2.initLineNumber(r3)
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.WrappedException.<init>(java.lang.Throwable):void");
    }

    public Throwable getWrappedException() {
        return this.exception;
    }

    @Deprecated
    public Object unwrap() {
        return getWrappedException();
    }
}
