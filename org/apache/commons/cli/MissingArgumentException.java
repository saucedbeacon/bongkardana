package org.apache.commons.cli;

import o.appendCode;

public class MissingArgumentException extends ParseException {
    private appendCode option;

    public MissingArgumentException(String str) {
        super(str);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MissingArgumentException(o.appendCode r3) {
        /*
            r2 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.String r1 = "Missing argument for option: "
            r0.<init>(r1)
            java.lang.String r1 = r3.getKey()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>((java.lang.String) r0)
            r2.option = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.cli.MissingArgumentException.<init>(o.appendCode):void");
    }

    public appendCode getOption() {
        return this.option;
    }
}
