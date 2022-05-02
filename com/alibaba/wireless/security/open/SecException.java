package com.alibaba.wireless.security.open;

import java.io.PrintStream;
import java.io.PrintWriter;

public class SecException extends Exception {
    public static final int ERROR_NULL_CONTEXT = -100;

    /* renamed from: a  reason: collision with root package name */
    private int f9220a;

    public SecException(int i) {
        this.f9220a = i;
    }

    public SecException(String str, int i) {
        super(str);
        this.f9220a = i;
    }

    public SecException(String str, Throwable th, int i) {
        super(str, th);
        this.f9220a = i;
    }

    public SecException(Throwable th, int i) {
        super(th);
        this.f9220a = i;
    }

    public int getErrorCode() {
        return this.f9220a;
    }

    public void printStackTrace(PrintStream printStream) {
        StringBuilder sb = new StringBuilder("ErrorCode = ");
        sb.append(getErrorCode());
        printStream.println(sb.toString());
        super.printStackTrace(printStream);
    }

    public void printStackTrace(PrintWriter printWriter) {
        StringBuilder sb = new StringBuilder("ErrorCode = ");
        sb.append(getErrorCode());
        printWriter.println(sb.toString());
        super.printStackTrace(printWriter);
    }

    public void setErrorCode(int i) {
        this.f9220a = i;
    }
}
