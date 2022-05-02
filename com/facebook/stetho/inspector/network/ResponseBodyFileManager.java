package com.facebook.stetho.inspector.network;

import android.content.Context;
import android.util.Base64OutputStream;
import android.view.ViewConfiguration;
import com.facebook.stetho.common.ExceptionUtil;
import com.facebook.stetho.common.LogRedirector;
import com.facebook.stetho.common.Util;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.onActivityPostResumed;

public class ResponseBodyFileManager {
    private static final String FILENAME_PREFIX = "network-response-body-";
    private static final int PRETTY_PRINT_TIMEOUT_SEC = 10;
    private static final String TAG = "ResponseBodyFileManager";
    private final Context mContext;
    private final Map<String, AsyncPrettyPrinter> mRequestIdMap = Collections.synchronizedMap(new HashMap());

    public ResponseBodyFileManager(Context context) {
        this.mContext = context;
    }

    public void cleanupFiles() {
        for (File file : this.mContext.getFilesDir().listFiles()) {
            if (file.getName().startsWith(FILENAME_PREFIX) && !file.delete()) {
                StringBuilder sb = new StringBuilder("Failed to delete ");
                sb.append(file.getAbsolutePath());
                LogRedirector.w(TAG, sb.toString());
            }
        }
        LogRedirector.i(TAG, "Cleaned up temporary network files.");
    }

    public ResponseBodyData readFile(String str) throws IOException {
        FileInputStream openFileInput = this.mContext.openFileInput(getFilename(str));
        try {
            int read = openFileInput.read();
            if (read != -1) {
                ResponseBodyData responseBodyData = new ResponseBodyData();
                responseBodyData.base64Encoded = read != 0;
                AsyncPrettyPrinter asyncPrettyPrinter = this.mRequestIdMap.get(str);
                if (asyncPrettyPrinter != null) {
                    responseBodyData.data = prettyPrintContentWithTimeOut(asyncPrettyPrinter, openFileInput);
                } else {
                    responseBodyData.data = Util.readAsUTF8(openFileInput);
                }
                return responseBodyData;
            }
            throw new EOFException("Failed to read base64Encode byte");
        } finally {
            openFileInput.close();
        }
    }

    private String prettyPrintContentWithTimeOut(AsyncPrettyPrinter asyncPrettyPrinter, InputStream inputStream) throws IOException {
        AsyncPrettyPrintingCallable asyncPrettyPrintingCallable = new AsyncPrettyPrintingCallable(inputStream, asyncPrettyPrinter);
        ExecutorService executorService = AsyncPrettyPrinterExecutorHolder.getExecutorService();
        if (executorService == null) {
            return null;
        }
        Future submit = executorService.submit(asyncPrettyPrintingCallable);
        try {
            return (String) Util.getUninterruptibly(submit, 10, TimeUnit.SECONDS);
        } catch (TimeoutException unused) {
            submit.cancel(true);
            StringBuilder sb = new StringBuilder("Time out after 10 seconds of attempting to pretty print\n");
            sb.append(Util.readAsUTF8(inputStream));
            return sb.toString();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            ExceptionUtil.propagateIfInstanceOf(cause, IOException.class);
            throw ExceptionUtil.propagate(cause);
        }
    }

    public OutputStream openResponseBodyFile(String str, boolean z) throws IOException {
        FileOutputStream openFileOutput = this.mContext.openFileOutput(getFilename(str), 0);
        openFileOutput.write(z ? 1 : 0);
        return z ? new Base64OutputStream(openFileOutput, 0) : openFileOutput;
    }

    private static String getFilename(String str) {
        return FILENAME_PREFIX.concat(String.valueOf(str));
    }

    public void associateAsyncPrettyPrinterWithId(String str, AsyncPrettyPrinter asyncPrettyPrinter) {
        if (this.mRequestIdMap.put(str, asyncPrettyPrinter) != null) {
            throw new IllegalArgumentException("cannot associate different pretty printers with the same request id: ".concat(String.valueOf(str)));
        }
    }

    class AsyncPrettyPrintingCallable implements Callable<String> {
        private static int getMin = 0;
        private static int[] setMax = {918990877, -2052386655, 766748700, 1467019496, -134410966, 725357947, -532593331, -959374284, 1630652261, -950149837, -350758391, 1504811416, -941718456, -790385235, 1264162183, 1086797490, 1708930085, -1737337601};
        private static int setMin = 1;
        private final AsyncPrettyPrinter mAsyncPrettyPrinter;
        private final InputStream mInputStream;

        public AsyncPrettyPrintingCallable(InputStream inputStream, AsyncPrettyPrinter asyncPrettyPrinter) {
            this.mInputStream = inputStream;
            this.mAsyncPrettyPrinter = asyncPrettyPrinter;
        }

        public String call() throws IOException {
            int i = getMin + 91;
            setMin = i % 128;
            if (!(i % 2 == 0)) {
                return prettyPrintContent(this.mInputStream, this.mAsyncPrettyPrinter);
            }
            try {
                try {
                    String prettyPrintContent = prettyPrintContent(this.mInputStream, this.mAsyncPrettyPrinter);
                    Object[] objArr = null;
                    int length = objArr.length;
                    return prettyPrintContent;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }

        private String prettyPrintContent(InputStream inputStream, AsyncPrettyPrinter asyncPrettyPrinter) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
            asyncPrettyPrinter.printTo(printWriter, inputStream);
            printWriter.flush();
            String byteArrayOutputStream2 = byteArrayOutputStream.toString(getMin((ViewConfiguration.getLongPressTimeout() >> 16) + 5, new int[]{833320454, -1511764147, 1752378075, 1309989006}).intern());
            int i = getMin + 59;
            setMin = i % 128;
            if (!(i % 2 == 0)) {
                return byteArrayOutputStream2;
            }
            int i2 = 33 / 0;
            return byteArrayOutputStream2;
        }

        private static String getMin(int i, int[] iArr) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[(iArr.length << 1)];
            try {
                int[] iArr2 = (int[]) setMax.clone();
                int i2 = setMin + 87;
                getMin = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 0;
                while (true) {
                    if ((i4 < iArr.length ? 'V' : '7') != 'V') {
                        return new String(cArr2, 0, i);
                    }
                    try {
                        int i5 = setMin + 63;
                        getMin = i5 % 128;
                        int i6 = i5 % 2;
                        cArr[0] = (char) (iArr[i4] >> 16);
                        cArr[1] = (char) iArr[i4];
                        int i7 = i4 + 1;
                        cArr[2] = (char) (iArr[i7] >> 16);
                        cArr[3] = (char) iArr[i7];
                        onActivityPostResumed.getMin(cArr, iArr2, false);
                        int i8 = i4 << 1;
                        cArr2[i8] = cArr[0];
                        cArr2[i8 + 1] = cArr[1];
                        cArr2[i8 + 2] = cArr[2];
                        cArr2[i8 + 3] = cArr[3];
                        i4 += 2;
                    } catch (Exception e) {
                        throw e;
                    }
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }
}
