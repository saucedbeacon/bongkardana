package id.dana.data.util.download;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.MalformedURLException;
import o.NotSendableException;
import o.PrepareController;
import o.PrepareData;
import o.TitleBarRightButtonView;
import o.executeSerial;
import o.getAppenderManager;
import o.getSecureSignatureComp;
import o.recordMonitorOfSndMsg;
import o.registerReceiever;
import o.setAppInfoQuery;
import o.setupAppInfo;
import o.updateActionSheetContent;

public final class DownloadUtil {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ExtensionFileType {
        public static final String JPG = ".jpg";
        public static final String PDF = ".pdf";
        public static final String PNG = ".png";
    }

    private DownloadUtil() {
    }

    public static TitleBarRightButtonView.AnonymousClass1<File> downloadFile(String str, String str2, @NonNull String str3) throws MalformedURLException {
        if (!URLUtil.isValidUrl(str)) {
            return downloadFileFromUri(str);
        }
        registerReceiever registerreceiever = new registerReceiever(str);
        char c = 65535;
        int hashCode = str3.hashCode();
        if (hashCode != 1475827) {
            if (hashCode != 1481220) {
                if (hashCode == 1481531 && str3.equals(".png")) {
                    c = 1;
                }
            } else if (str3.equals(".pdf")) {
                c = 2;
            }
        } else if (str3.equals(".jpg")) {
            c = 0;
        }
        if (c == 0) {
            return downloadImage(registerreceiever, str2, Bitmap.CompressFormat.JPEG);
        }
        if (c == 1) {
            return downloadImage(registerreceiever, str2, Bitmap.CompressFormat.PNG);
        }
        if (c != 2) {
            return downloadPDF(registerreceiever, str2);
        }
        return downloadPDF(registerreceiever, str2);
    }

    private static TitleBarRightButtonView.AnonymousClass1<File> downloadImage(registerReceiever registerreceiever, String str, Bitmap.CompressFormat compressFormat) {
        return registerreceiever.downloadFile().flatMap(new setupAppInfo(str, compressFormat)).subscribeOn(getSecureSignatureComp.setMin()).observeOn(getSecureSignatureComp.setMin());
    }

    private static TitleBarRightButtonView.AnonymousClass1<File> downloadPDF(registerReceiever registerreceiever, String str) {
        return registerreceiever.downloadFile().flatMap(new PrepareController(str)).subscribeOn(getSecureSignatureComp.setMin()).observeOn(getSecureSignatureComp.setMin());
    }

    private static TitleBarRightButtonView.AnonymousClass1<File> downloadFileFromUri(String str) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new setAppInfoQuery(str));
    }

    public static /* synthetic */ File lambda$downloadFileFromUri$2(String str) throws Exception {
        File file = new File(str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static TitleBarRightButtonView.AnonymousClass4<File> decodeResponse(@NonNull InputStream inputStream, @NonNull String str, @NonNull Bitmap.CompressFormat compressFormat) {
        return TitleBarRightButtonView.AnonymousClass1.create(new PrepareData(inputStream, str, compressFormat));
    }

    public static /* synthetic */ void lambda$decodeResponse$3(InputStream inputStream, String str, Bitmap.CompressFormat compressFormat, TitleBarRightButtonView.AnonymousClass2 r3) throws Exception {
        try {
            saveToInternalStorage(BitmapFactory.decodeStream(inputStream), str, compressFormat, r3);
        } catch (Exception e) {
            updateActionSheetContent.e(DanaLogConstants.TAG.DOWNLOAD_UTIL_TAG, "decodeResponse", e);
            r3.onError(e);
        }
    }

    /* access modifiers changed from: private */
    public static TitleBarRightButtonView.AnonymousClass1<File> createTemporaryFile(final getAppenderManager<NotSendableException> getappendermanager, final String str) {
        return TitleBarRightButtonView.AnonymousClass1.create(new TitleBarRightButtonView.AnonymousClass2.AnonymousClass1<File>() {
            public final void subscribe(TitleBarRightButtonView.AnonymousClass2<File> r4) {
                try {
                    File file = new File(str);
                    executeSerial max = recordMonitorOfSndMsg.getMax(recordMonitorOfSndMsg.getMax(file));
                    max.getMin(((NotSendableException) getappendermanager.setMin).getMax());
                    max.close();
                    r4.onNext(file);
                    r4.onComplete();
                } catch (IOException e) {
                    updateActionSheetContent.e(DanaLogConstants.TAG.DOWNLOAD_UTIL_TAG, "createTemporaryFile", e);
                    r4.onError(e);
                }
            }
        });
    }

    private static void saveToInternalStorage(@NonNull Bitmap bitmap, @NonNull String str, @NonNull Bitmap.CompressFormat compressFormat, @NonNull TitleBarRightButtonView.AnonymousClass2<File> r5) {
        try {
            File file = new File(str);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(compressFormat, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            r5.onNext(file);
        } catch (IOException e) {
            updateActionSheetContent.e(DanaLogConstants.TAG.DOWNLOAD_UTIL_TAG, "saveToInternalStorage", e);
            r5.onError(e);
        }
    }
}
