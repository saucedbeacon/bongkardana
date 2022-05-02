package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import id.dana.danah5.share.file.ShareFileResultType;
import id.dana.util.media.MimeType;
import java.io.File;
import o.WindowBridgeExtension;
import o.customView;
import o.update;

public class DialogActionButtonLayout {
    /* access modifiers changed from: private */
    public static final String TAG = DialogActionButtonLayout.class.getSimpleName();
    private Activity activity;
    private BridgeCallback bridgeCallback;
    private customView.Cdefault entity;
    private WindowBridgeExtension.AnonymousClass2 iDownloadListener;

    public DialogActionButtonLayout(BridgeCallback bridgeCallback2, Activity activity2, WindowBridgeExtension.AnonymousClass2 r3) {
        this.bridgeCallback = bridgeCallback2;
        this.activity = activity2;
        this.iDownloadListener = r3;
    }

    public void processEvent() {
        if (this.entity == null) {
            sendGeneralError();
        } else if (setLeftSelectedIndex.length() <= this.entity.getMinStorageAvailable()) {
            this.bridgeCallback.sendJSONResponse(update.core.getResult(ShareFileResultType.STORAGE_RUNNING_OUT_ERROR));
        } else {
            processDownload(this.entity);
        }
    }

    private void processDownload(customView.Cdefault defaultR) {
        String str;
        File min = setLeftSelectedIndex.setMin(getContext());
        if (!min.exists()) {
            setLeftSelectedIndex.getMin(min.getAbsolutePath());
        }
        try {
            String str2 = "";
            if (defaultR.getFilePath() != null) {
                str2 = defaultR.getExtension(defaultR.getFilePath());
                str = defaultR.getFilePath();
            } else if (defaultR.getSource() != null) {
                str2 = defaultR.getExtension(defaultR.getSource());
                str = defaultR.getSource();
            } else {
                str = str2;
            }
            String fileName = defaultR.getFileName();
            Context context = getContext();
            StringBuilder sb = new StringBuilder();
            sb.append(fileName);
            sb.append(str2);
            this.iDownloadListener.download(str, setLeftSelectedIndex.setMin(context, sb.toString()).getPath(), defaultR.getFileType()).subscribe(new setGlobalUserData<File>() {
                public final void onNext(File file) {
                    DialogActionButtonLayout.this.shareImage(file);
                }

                public final void onError(Throwable th) {
                    LocationBridgeExtension.setMin(DialogActionButtonLayout.TAG, "processDownload", th);
                    DialogActionButtonLayout.this.sendGeneralError();
                }

                public final void onComplete() {
                    dispose();
                }
            });
        } catch (IllegalStateException e) {
            LocationBridgeExtension.setMin(TAG, "processDownload", (Throwable) e);
            this.bridgeCallback.sendJSONResponse(update.core.getResult("GENERAL_ERROR"));
        }
    }

    /* access modifiers changed from: private */
    public void sendGeneralError() {
        this.bridgeCallback.sendJSONResponse(update.core.getResult("GENERAL_ERROR"));
    }

    private Context getContext() {
        return WindowBridgeExtension.AnonymousClass1.getMax();
    }

    /* access modifiers changed from: private */
    public void shareImage(File file) {
        openChooserDialog(setLeftSelectedIndex.getMax(getContext(), file));
    }

    private void openChooserDialog(Uri uri) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(268435456);
        intent.setFlags(1);
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setType(MimeType.IMAGE_ALL);
        if (!this.activity.getBaseContext().getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            this.activity.startActivity(Intent.createChooser(intent, "Share via"));
            this.bridgeCallback.sendJSONResponse(update.core.getResult("SUCCESS"));
            return;
        }
        this.bridgeCallback.sendJSONResponse(update.core.getResult("NO_APP_SUPPORTED_ERROR"));
    }

    public void setInfo(customView.Cdefault defaultR) {
        this.entity = defaultR;
    }
}
