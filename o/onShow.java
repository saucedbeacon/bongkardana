package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import o.TitleBarRightButtonView;
import o.WindowBridgeExtension;
import o.checkBoxPrompt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class onShow {
    private static final String FILE_NAME_FORMAT = "QR_";
    private static final String IMAGE_FORMAT = ".jpg";
    private static final long MINIMUM_STORAGE_AVAILABLE = 100;
    private final Activity activity;
    private final BridgeCallback bridgeCallback;
    private final isCheckPromptChecked shareBusinessAccountFileEntity;

    public onShow(@NotNull Activity activity2, @Nullable isCheckPromptChecked ischeckpromptchecked, @NotNull BridgeCallback bridgeCallback2) {
        this.activity = activity2;
        this.bridgeCallback = bridgeCallback2;
        this.shareBusinessAccountFileEntity = ischeckpromptchecked;
    }

    public void processEvent() {
        if (setLeftSelectedIndex.length() <= MINIMUM_STORAGE_AVAILABLE) {
            sendGeneralError();
            return;
        }
        isCheckPromptChecked ischeckpromptchecked = this.shareBusinessAccountFileEntity;
        if (ischeckpromptchecked != null) {
            processDownload(ischeckpromptchecked);
        } else {
            sendGeneralError();
        }
    }

    /* access modifiers changed from: private */
    public void sendGeneralError() {
        this.bridgeCallback.sendJSONResponse(getCustomView.getResult("GENERAL_ERROR"));
    }

    private void processDownload(final isCheckPromptChecked ischeckpromptchecked) {
        try {
            new registerReceiever(ischeckpromptchecked.getUrl()).downloadFile().flatMap(new customView(this, ischeckpromptchecked)).subscribeOn(getSecureSignatureComp.setMin()).observeOn(hideProgress.length()).subscribe(new setGlobalUserData<Boolean>() {
                public final void onComplete() {
                }

                public final void onNext(Boolean bool) {
                    if (bool.booleanValue()) {
                        onShow.this.shareImage(ischeckpromptchecked.getBusinessName());
                    }
                }

                public final void onError(Throwable th) {
                    onShow.this.sendGeneralError();
                }
            });
        } catch (MalformedURLException unused) {
            sendGeneralError();
        }
    }

    private TitleBarRightButtonView.AnonymousClass4<Boolean> decodeResponse(InputStream inputStream, String str) {
        return TitleBarRightButtonView.AnonymousClass1.create(new checkBoxPrompt.Cdefault(this, inputStream, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$decodeResponse$1(InputStream inputStream, String str, TitleBarRightButtonView.AnonymousClass2 r3) throws Exception {
        try {
            saveToInternalStorage(BitmapFactory.decodeStream(inputStream), str, r3);
        } catch (Exception e) {
            r3.onError(e);
        }
    }

    /* access modifiers changed from: private */
    public void shareImage(String str) {
        Context context = getContext();
        StringBuilder sb = new StringBuilder(FILE_NAME_FORMAT);
        sb.append(str);
        sb.append(".jpg");
        openChooserDialog(setLeftSelectedIndex.getMax(getContext(), setLeftSelectedIndex.setMin(context, sb.toString())));
    }

    private void saveToInternalStorage(Bitmap bitmap, String str, TitleBarRightButtonView.AnonymousClass2<Boolean> r7) {
        File min = setLeftSelectedIndex.setMin(getContext());
        if (!min.exists()) {
            setLeftSelectedIndex.getMin(min.getAbsolutePath());
        }
        try {
            StringBuilder sb = new StringBuilder(FILE_NAME_FORMAT);
            sb.append(str);
            sb.append(".jpg");
            FileOutputStream fileOutputStream = new FileOutputStream(new File(min, sb.toString()));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            r7.onNext(Boolean.TRUE);
        } catch (IOException unused) {
            sendGeneralError();
        }
    }

    private Context getContext() {
        return WindowBridgeExtension.AnonymousClass1.getMax();
    }

    private void openChooserDialog(Uri uri) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(268435456);
        intent.setFlags(1);
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setType("image/jpeg");
        if (!this.activity.getBaseContext().getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            this.activity.startActivity(Intent.createChooser(intent, "Share via"));
            this.bridgeCallback.sendJSONResponse(getCustomView.getResult("SUCCESS"));
            return;
        }
        this.bridgeCallback.sendJSONResponse(getCustomView.getResult("NO_APP_SUPPORTED_ERROR"));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$processDownload$0(isCheckPromptChecked ischeckpromptchecked, getAppenderManager getappendermanager) throws Exception {
        return decodeResponse(((NotSendableException) getappendermanager.setMin).getMax().setMin(), ischeckpromptchecked.getBusinessName());
    }
}
