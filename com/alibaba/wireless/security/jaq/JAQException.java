package com.alibaba.wireless.security.jaq;

import java.io.PrintStream;
import java.io.PrintWriter;

public class JAQException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private int f10636a;

    public JAQException(int i) {
        this.f10636a = i;
    }

    public JAQException(String str, int i) {
        super(str);
        this.f10636a = i;
    }

    public JAQException(String str, Throwable th, int i) {
        super(str, th);
        this.f10636a = i;
    }

    public JAQException(Throwable th, int i) {
        super(th);
        this.f10636a = i;
    }

    public int getErrorCode() {
        return this.f10636a;
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
        this.f10636a = i;
    }
}
