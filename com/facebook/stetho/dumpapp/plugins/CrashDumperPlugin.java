package com.facebook.stetho.dumpapp.plugins;

import android.os.Process;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.facebook.stetho.common.ExceptionUtil;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.dumpapp.ArgsHelper;
import com.facebook.stetho.dumpapp.DumpException;
import com.facebook.stetho.dumpapp.DumpUsageException;
import com.facebook.stetho.dumpapp.DumperContext;
import com.facebook.stetho.dumpapp.DumperPlugin;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import javax.annotation.Nullable;

public class CrashDumperPlugin implements DumperPlugin {
    private static final String NAME = "crash";
    private static final String OPTION_EXIT_DEFAULT = "0";
    private static final String OPTION_KILL_DEFAULT = "9";
    private static final String OPTION_THROW_DEFAULT = "java.lang.Error";

    public String getName() {
        return "crash";
    }

    public void dump(DumperContext dumperContext) throws DumpException {
        Iterator<String> it = dumperContext.getArgsAsList().iterator();
        String nextOptionalArg = ArgsHelper.nextOptionalArg(it, (String) null);
        if ("throw".equals(nextOptionalArg)) {
            doUncaughtException(it);
        } else if ("kill".equals(nextOptionalArg)) {
            doKill(dumperContext, it);
        } else if (HummerConstants.EXIT_H5_PAGE.equals(nextOptionalArg)) {
            doSystemExit(it);
        } else {
            doUsage(dumperContext.getStdout());
            if (nextOptionalArg != null) {
                throw new DumpUsageException("Unsupported command: ".concat(String.valueOf(nextOptionalArg)));
            }
        }
    }

    private void doUsage(PrintStream printStream) {
        StringBuilder sb = new StringBuilder();
        sb.append("Usage: dumpapp crash ");
        sb.append("<command> [command-options]");
        printStream.println(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Usage: dumpapp crash ");
        sb2.append("throw");
        printStream.println(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("       dumpapp crash ");
        sb3.append("kill");
        printStream.println(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("       dumpapp crash ");
        sb4.append(HummerConstants.EXIT_H5_PAGE);
        printStream.println(sb4.toString());
        printStream.println();
        printStream.println("dumpapp crash throw: Throw an uncaught exception (simulates a program crash)");
        printStream.println("    <Throwable>: Throwable class to use (default: java.lang.Error)");
        printStream.println();
        printStream.println("dumpapp crash kill: Send a signal to this process (simulates the low memory killer)");
        printStream.println("    <SIGNAL>: Either signal name or number to send (default: 9)");
        printStream.println("              See `adb shell kill -l` for more information");
        printStream.println();
        printStream.println("dumpapp crash exit: Invoke System.exit (simulates an abnormal Android exit strategy)");
        printStream.println("    <code>: Exit code (default: 0)");
    }

    private void doSystemExit(Iterator<String> it) {
        System.exit(Integer.parseInt(ArgsHelper.nextOptionalArg(it, "0")));
    }

    private void doKill(DumperContext dumperContext, Iterator<String> it) throws DumpException {
        Process start;
        String nextOptionalArg = ArgsHelper.nextOptionalArg(it, OPTION_KILL_DEFAULT);
        try {
            start = new ProcessBuilder(new String[0]).command(new String[]{"/system/bin/kill", "-".concat(String.valueOf(nextOptionalArg)), String.valueOf(Process.myPid())}).redirectErrorStream(true).start();
            Util.copy(start.getInputStream(), dumperContext.getStdout(), new byte[1024]);
            start.destroy();
        } catch (IOException e) {
            throw new DumpException("Failed to invoke kill: ".concat(String.valueOf(e)));
        } catch (Throwable th) {
            start.destroy();
            throw th;
        }
    }

    private void doUncaughtException(Iterator<String> it) throws DumpException {
        Throwable th;
        try {
            Class<?> cls = Class.forName(ArgsHelper.nextOptionalArg(it, OPTION_THROW_DEFAULT));
            Constructor<? extends Object> tryGetDeclaredConstructor = tryGetDeclaredConstructor(cls, String.class);
            if (tryGetDeclaredConstructor != null) {
                th = (Throwable) tryGetDeclaredConstructor.newInstance(new Object[]{"Uncaught exception triggered by Stetho"});
            } else {
                th = (Throwable) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            Thread thread = new Thread(new ThrowRunnable(th));
            thread.start();
            Util.joinUninterruptibly(thread);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException e) {
            throw new DumpException("Invalid supplied Throwable class: ".concat(String.valueOf(e)));
        } catch (InvocationTargetException e2) {
            throw ExceptionUtil.propagate(e2.getCause());
        }
    }

    @Nullable
    private static <T> Constructor<? extends T> tryGetDeclaredConstructor(Class<T> cls, Class<?>... clsArr) {
        try {
            return cls.getDeclaredConstructor(clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    static class ThrowRunnable implements Runnable {
        private final Throwable mThrowable;

        public ThrowRunnable(Throwable th) {
            this.mThrowable = th;
        }

        public void run() {
            ExceptionUtil.sneakyThrow(this.mThrowable);
        }
    }
}
