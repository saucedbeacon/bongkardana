package com.facebook.stetho.inspector.network;

import com.facebook.stetho.common.Util;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.annotation.Nullable;

public abstract class DownloadingAsyncPrettyPrinterFactory implements AsyncPrettyPrinterFactory {
    /* access modifiers changed from: protected */
    public abstract void doPrint(PrintWriter printWriter, InputStream inputStream, String str) throws IOException;

    /* access modifiers changed from: protected */
    @Nullable
    public abstract MatchResult matchAndParseHeader(String str, String str2);

    public AsyncPrettyPrinter getInstance(String str, String str2) {
        final MatchResult matchAndParseHeader = matchAndParseHeader(str, str2);
        if (matchAndParseHeader == null) {
            return null;
        }
        URL parseURL = parseURL(matchAndParseHeader.getSchemaUri());
        if (parseURL == null) {
            return getErrorAsyncPrettyPrinter(str, str2);
        }
        ExecutorService executorService = AsyncPrettyPrinterExecutorHolder.getExecutorService();
        if (executorService == null) {
            return null;
        }
        final Future submit = executorService.submit(new Request(parseURL));
        return new AsyncPrettyPrinter() {
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
                r1 = new java.lang.StringBuilder("Encountered spurious interrupt while downloading schema for pretty printing: ");
                r1.append(r0.getMessage());
                com.facebook.stetho.inspector.network.DownloadingAsyncPrettyPrinterFactory.access$000(r4, r5, r1.toString());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Removed duplicated region for block: B:5:0x000e A[Catch:{ ExecutionException -> 0x0010, InterruptedException -> 0x000e, InterruptedException -> 0x000e, ExecutionException -> 0x0034 }, ExcHandler: InterruptedException (r0v3 'e' java.lang.InterruptedException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:0:0x0000] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void printTo(java.io.PrintWriter r4, java.io.InputStream r5) throws java.io.IOException {
                /*
                    r3 = this;
                    java.util.concurrent.Future r0 = r4     // Catch:{ ExecutionException -> 0x0010, InterruptedException -> 0x000e }
                    java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x0010, InterruptedException -> 0x000e }
                    java.lang.String r0 = (java.lang.String) r0     // Catch:{ ExecutionException -> 0x0010, InterruptedException -> 0x000e }
                    com.facebook.stetho.inspector.network.DownloadingAsyncPrettyPrinterFactory r1 = com.facebook.stetho.inspector.network.DownloadingAsyncPrettyPrinterFactory.this     // Catch:{ InterruptedException -> 0x000e, ExecutionException -> 0x0034 }
                    r1.doPrint(r4, r5, r0)     // Catch:{ InterruptedException -> 0x000e, ExecutionException -> 0x0034 }
                    return
                L_0x000e:
                    r0 = move-exception
                    goto L_0x003e
                L_0x0010:
                    r0 = move-exception
                    java.lang.Throwable r1 = r0.getCause()     // Catch:{ InterruptedException -> 0x000e, ExecutionException -> 0x0034 }
                    java.lang.Class<java.io.IOException> r2 = java.io.IOException.class
                    boolean r1 = r2.isInstance(r1)     // Catch:{ InterruptedException -> 0x000e, ExecutionException -> 0x0034 }
                    if (r1 == 0) goto L_0x0033
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x000e, ExecutionException -> 0x0034 }
                    java.lang.String r2 = "Cannot successfully download schema: "
                    r1.<init>(r2)     // Catch:{ InterruptedException -> 0x000e, ExecutionException -> 0x0034 }
                    java.lang.String r0 = r0.getMessage()     // Catch:{ InterruptedException -> 0x000e, ExecutionException -> 0x0034 }
                    r1.append(r0)     // Catch:{ InterruptedException -> 0x000e, ExecutionException -> 0x0034 }
                    java.lang.String r0 = r1.toString()     // Catch:{ InterruptedException -> 0x000e, ExecutionException -> 0x0034 }
                    com.facebook.stetho.inspector.network.DownloadingAsyncPrettyPrinterFactory.doErrorPrint(r4, r5, r0)     // Catch:{ InterruptedException -> 0x000e, ExecutionException -> 0x0034 }
                    return
                L_0x0033:
                    throw r0     // Catch:{ InterruptedException -> 0x000e, ExecutionException -> 0x0034 }
                L_0x0034:
                    r4 = move-exception
                    java.lang.Throwable r4 = r4.getCause()
                    java.lang.RuntimeException r4 = com.facebook.stetho.common.ExceptionUtil.propagate(r4)
                    throw r4
                L_0x003e:
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "Encountered spurious interrupt while downloading schema for pretty printing: "
                    r1.<init>(r2)
                    java.lang.String r0 = r0.getMessage()
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    com.facebook.stetho.inspector.network.DownloadingAsyncPrettyPrinterFactory.doErrorPrint(r4, r5, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.inspector.network.DownloadingAsyncPrettyPrinterFactory.AnonymousClass1.printTo(java.io.PrintWriter, java.io.InputStream):void");
            }

            public PrettyPrinterDisplayType getPrettifiedType() {
                return matchAndParseHeader.getDisplayType();
            }
        };
    }

    @Nullable
    private static URL parseURL(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void doErrorPrint(PrintWriter printWriter, InputStream inputStream, String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\n");
        sb.append(Util.readAsUTF8(inputStream));
        printWriter.print(sb.toString());
    }

    private static AsyncPrettyPrinter getErrorAsyncPrettyPrinter(final String str, final String str2) {
        return new AsyncPrettyPrinter() {
            public final void printTo(PrintWriter printWriter, InputStream inputStream) throws IOException {
                StringBuilder sb = new StringBuilder("[Failed to parse header: ");
                sb.append(str);
                sb.append(" : ");
                sb.append(str2);
                sb.append(" ]");
                DownloadingAsyncPrettyPrinterFactory.doErrorPrint(printWriter, inputStream, sb.toString());
            }

            public final PrettyPrinterDisplayType getPrettifiedType() {
                return PrettyPrinterDisplayType.TEXT;
            }
        };
    }

    protected class MatchResult {
        private final PrettyPrinterDisplayType mDisplayType;
        private final String mSchemaUri;

        public MatchResult(String str, PrettyPrinterDisplayType prettyPrinterDisplayType) {
            this.mSchemaUri = str;
            this.mDisplayType = prettyPrinterDisplayType;
        }

        public String getSchemaUri() {
            return this.mSchemaUri;
        }

        public PrettyPrinterDisplayType getDisplayType() {
            return this.mDisplayType;
        }
    }

    static class Request implements Callable<String> {
        private URL url;

        public Request(URL url2) {
            this.url = url2;
        }

        public String call() throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(this.url.openConnection()));
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    return Util.readAsUTF8(inputStream);
                } finally {
                    inputStream.close();
                }
            } else {
                StringBuilder sb = new StringBuilder("Got status code: ");
                sb.append(responseCode);
                sb.append(" while downloading schema with url: ");
                sb.append(this.url.toString());
                throw new IOException(sb.toString());
            }
        }
    }
}
