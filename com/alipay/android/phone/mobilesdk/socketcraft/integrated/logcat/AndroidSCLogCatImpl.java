package com.alipay.android.phone.mobilesdk.socketcraft.integrated.logcat;

import android.os.Process;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface;

public class AndroidSCLogCatImpl implements SCLogCatInterface {
    public void warn(String str, Throwable th) {
    }

    public void info(String str, String str2) {
        getPidAndTid();
    }

    public void verbose(String str, String str2) {
        getPidAndTid();
    }

    public void debug(String str, String str2) {
        getPidAndTid();
    }

    public void warn(String str, String str2) {
        getPidAndTid();
    }

    public void warn(String str, String str2, Throwable th) {
        getPidAndTid();
    }

    public void error(String str, String str2) {
        getPidAndTid();
    }

    public void error(String str, Throwable th) {
        getPidAndTid();
    }

    public void error(String str, String str2, Throwable th) {
        getPidAndTid();
    }

    public void printInfo(String str, String str2) {
        getPidAndTid();
    }

    public void printError(String str, Throwable th) {
        getPidAndTid();
    }

    private static final String getPidAndTid() {
        StringBuilder sb = new StringBuilder(" [");
        sb.append(Process.myPid());
        sb.append(":");
        sb.append(Thread.currentThread().getId());
        sb.append("] ");
        return sb.toString();
    }
}
