package org.yaml.snakeyaml.error;

import o.InitParams;

public class MarkedYAMLException extends YAMLException {
    private static final long serialVersionUID = -9119388488683035101L;
    private String context;
    private InitParams.AnonymousClass1 contextMark;
    private String note;
    private String problem;
    private InitParams.AnonymousClass1 problemMark;

    public MarkedYAMLException(String str, InitParams.AnonymousClass1 r9, String str2, InitParams.AnonymousClass1 r11, String str3) {
        this(str, r9, str2, r11, str3, (Throwable) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MarkedYAMLException(java.lang.String r3, o.InitParams.AnonymousClass1 r4, java.lang.String r5, o.InitParams.AnonymousClass1 r6, java.lang.String r7, java.lang.Throwable r8) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = "; "
            r0.append(r1)
            r0.append(r5)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r8)
            r2.context = r3
            r2.contextMark = r4
            r2.problem = r5
            r2.problemMark = r6
            r2.note = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.yaml.snakeyaml.error.MarkedYAMLException.<init>(java.lang.String, o.InitParams$1, java.lang.String, o.InitParams$1, java.lang.String, java.lang.Throwable):void");
    }

    public MarkedYAMLException(String str, InitParams.AnonymousClass1 r9, String str2, InitParams.AnonymousClass1 r11) {
        this(str, r9, str2, r11, (String) null, (Throwable) null);
    }

    public MarkedYAMLException(String str, InitParams.AnonymousClass1 r9, String str2, InitParams.AnonymousClass1 r11, Throwable th) {
        this(str, r9, str2, r11, (String) null, th);
    }

    public String getMessage() {
        return toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.context;
        if (str != null) {
            sb.append(str);
            sb.append("\n");
        }
        InitParams.AnonymousClass1 r1 = this.contextMark;
        if (r1 != null && (this.problem == null || this.problemMark == null || r1.getName().equals(this.problemMark.getName()) || this.contextMark.getLine() != this.problemMark.getLine() || this.contextMark.getColumn() != this.problemMark.getColumn())) {
            sb.append(this.contextMark.toString());
            sb.append("\n");
        }
        String str2 = this.problem;
        if (str2 != null) {
            sb.append(str2);
            sb.append("\n");
        }
        InitParams.AnonymousClass1 r12 = this.problemMark;
        if (r12 != null) {
            sb.append(r12.toString());
            sb.append("\n");
        }
        String str3 = this.note;
        if (str3 != null) {
            sb.append(str3);
            sb.append("\n");
        }
        return sb.toString();
    }

    public String getContext() {
        return this.context;
    }

    public InitParams.AnonymousClass1 getContextMark() {
        return this.contextMark;
    }

    public String getProblem() {
        return this.problem;
    }

    public InitParams.AnonymousClass1 getProblemMark() {
        return this.problemMark;
    }
}
