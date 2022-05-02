package com.facebook.stetho.dumpapp.plugins;

import android.content.Context;
import android.os.Debug;
import com.facebook.stetho.dumpapp.DumpException;
import com.facebook.stetho.dumpapp.DumpUsageException;
import com.facebook.stetho.dumpapp.DumperContext;
import com.facebook.stetho.dumpapp.DumperPlugin;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;

public class HprofDumperPlugin implements DumperPlugin {
    private static final String NAME = "hprof";
    private final Context mContext;

    public String getName() {
        return NAME;
    }

    public HprofDumperPlugin(Context context) {
        this.mContext = context;
    }

    public void dump(DumperContext dumperContext) throws DumpException {
        PrintStream stdout = dumperContext.getStdout();
        Iterator<String> it = dumperContext.getArgsAsList().iterator();
        String next = it.hasNext() ? it.next() : null;
        if (next == null) {
            usage(stdout);
        } else if ("-".equals(next)) {
            handlePipeOutput(stdout);
        } else {
            File file = new File(next);
            if (!file.isAbsolute()) {
                file = this.mContext.getFileStreamPath(next);
            }
            writeHprof(file);
            stdout.println("Wrote to ".concat(String.valueOf(file)));
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0029 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void handlePipeOutput(java.io.OutputStream r4) throws com.facebook.stetho.dumpapp.DumpException {
        /*
            r3 = this;
            android.content.Context r0 = r3.mContext
            java.lang.String r1 = "hprof-dump.hprof"
            java.io.File r0 = r0.getFileStreamPath(r1)
            r3.writeHprof(r0)     // Catch:{ all -> 0x0042 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0029 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0029 }
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x0024 }
            com.facebook.stetho.common.Util.copy(r1, r4, r2)     // Catch:{ all -> 0x0024 }
            r1.close()     // Catch:{ IOException -> 0x0029 }
            boolean r4 = r0.exists()
            if (r4 == 0) goto L_0x0023
            r0.delete()
        L_0x0023:
            return
        L_0x0024:
            r4 = move-exception
            r1.close()     // Catch:{ IOException -> 0x0029 }
            throw r4     // Catch:{ IOException -> 0x0029 }
        L_0x0029:
            com.facebook.stetho.dumpapp.DumpException r4 = new com.facebook.stetho.dumpapp.DumpException     // Catch:{ all -> 0x0042 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "Failure copying "
            r1.<init>(r2)     // Catch:{ all -> 0x0042 }
            r1.append(r0)     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = " to dumper output"
            r1.append(r2)     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0042 }
            r4.<init>(r1)     // Catch:{ all -> 0x0042 }
            throw r4     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r4 = move-exception
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x004c
            r0.delete()
        L_0x004c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.dumpapp.plugins.HprofDumperPlugin.handlePipeOutput(java.io.OutputStream):void");
    }

    private void writeHprof(File file) throws DumpException {
        try {
            truncateAndDeleteFile(file);
            Debug.dumpHprofData(file.getAbsolutePath());
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder("Failure writing to ");
            sb.append(file);
            sb.append(": ");
            sb.append(e.getMessage());
            throw new DumpException(sb.toString());
        }
    }

    private static void truncateAndDeleteFile(File file) throws IOException {
        new FileOutputStream(file).close();
        if (!file.delete()) {
            throw new IOException("Failed to delete ".concat(String.valueOf(file)));
        }
    }

    private void usage(PrintStream printStream) throws DumpUsageException {
        printStream.println("Usage: dumpapp hprof [ path ]");
        printStream.println("Dump HPROF memory usage data from the running application.");
        printStream.println();
        printStream.println("Where path can be any of:");
        printStream.println("  -           Output directly to stdout");
        printStream.println("  <path>      Full path to a writable file on the device");
        printStream.println("  <filename>  Relative filename that will be stored in the app internal storage");
        throw new DumpUsageException("Missing path");
    }
}
