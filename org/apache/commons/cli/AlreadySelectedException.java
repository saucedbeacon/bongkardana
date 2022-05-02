package org.apache.commons.cli;

import o.appendCode;
import o.appendUrl;

public class AlreadySelectedException extends ParseException {
    private appendUrl group;
    private appendCode option;

    public AlreadySelectedException(String str) {
        super(str);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AlreadySelectedException(o.appendUrl r3, o.appendCode r4) {
        /*
            r2 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.String r1 = "The option '"
            r0.<init>(r1)
            java.lang.String r1 = r4.getKey()
            r0.append(r1)
            java.lang.String r1 = "' was specified but an option from this group has already been selected: '"
            r0.append(r1)
            java.lang.String r1 = r3.getSelected()
            r0.append(r1)
            java.lang.String r1 = "'"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.group = r3
            r2.option = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.cli.AlreadySelectedException.<init>(o.appendUrl, o.appendCode):void");
    }

    public appendUrl getOptionGroup() {
        return this.group;
    }

    public appendCode getOption() {
        return this.option;
    }
}
