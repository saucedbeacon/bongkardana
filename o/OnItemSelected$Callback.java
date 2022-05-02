package o;

import android.content.Context;
import android.net.Uri;
import com.google.zxing.Result;
import id.dana.R;
import id.dana.data.base.NetworkException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import javax.inject.Inject;
import o.DecodeResult;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;
import o.callback;

@PerActivity
public final class OnItemSelected$Callback implements callback.setMax {
    /* access modifiers changed from: private */
    public final callback.getMin getMin;
    private final decodeByImageDecoder setMax;
    /* access modifiers changed from: private */
    public final Context setMin;

    @Inject
    public OnItemSelected$Callback(callback.getMin getmin, decodeByImageDecoder decodebyimagedecoder, Context context) {
        this.getMin = getmin;
        this.setMax = decodebyimagedecoder;
        this.setMin = context;
    }

    public final void length(Uri uri) {
        this.getMin.showProgress();
        decodeByImageDecoder decodebyimagedecoder = this.setMax;
        GriverProgressBar.UpdateRunnable updateRunnable = (GriverProgressBar.UpdateRunnable) TitleBarRightButtonView.AnonymousClass1.just(uri).subscribeOn(getSecureSignatureComp.length()).observeOn(hideProgress.length()).map(new DecodeResult.EXTRA(decodebyimagedecoder)).flatMap(onHeaderDecoded.getMin).subscribeWith(new GriverAppVirtualHostProxy<Result>() {
            public final /* synthetic */ void onNext(Object obj) {
                Result result = (Result) obj;
                if (result != null) {
                    result.getText();
                    OnItemSelected$Callback.this.getMin.dismissProgress();
                    OnItemSelected$Callback.this.getMin.setMin(result.getText());
                    return;
                }
                StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.SCAN_QRCODE_PREFIX);
                sb.append(getClass().getName());
                sb.append("decodeFromGallery:decodeFromGalleryResult = false");
                updateActionSheetContent.e(DanaLogConstants.TAG.QRCODE_TAG, sb.toString());
                OnItemSelected$Callback.this.getMin.dismissProgress();
                OnItemSelected$Callback.this.getMin.onError("");
            }

            public final void onError(Throwable th) {
                String str;
                StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.SCAN_QRCODE_PREFIX);
                sb.append(getClass().getName());
                sb.append("decodeFromGallery:decodeFromGallery = false");
                updateActionSheetContent.e(DanaLogConstants.TAG.QRCODE_TAG, sb.toString());
                callback.getMin max = OnItemSelected$Callback.this.getMin;
                Context min = OnItemSelected$Callback.this.setMin;
                if (th instanceof NetworkException) {
                    str = ((NetworkException) th).getMessage();
                } else {
                    str = min.getString(R.string.general_error_msg);
                }
                max.onError(str);
            }
        });
        if (updateRunnable == null) {
            throw null;
        } else if (decodebyimagedecoder.length != null) {
            decodebyimagedecoder.length.getMin(updateRunnable);
        } else {
            throw null;
        }
    }

    public final void setMax() {
        decodeByImageDecoder decodebyimagedecoder = this.setMax;
        if (!decodebyimagedecoder.length.isDisposed()) {
            decodebyimagedecoder.length.dispose();
        }
    }
}
