package o;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import id.dana.R;
import id.dana.danah5.DanaH5;
import id.dana.data.base.NetworkException;
import id.dana.model.CdpContentModel;
import javax.inject.Inject;
import o.GriverRVAppUpdaterImpl;
import o.openRecordMode;

public final class isSupportCaptureFlush implements openRecordMode.setMin {
    private final execJavaScript4EmbedView IsOverlapping;
    @VisibleForTesting
    String getMax;
    /* access modifiers changed from: private */
    public final Context getMin;
    private final StorageBridgeExtension isInside;
    @VisibleForTesting
    String length;
    final GriverRVAppUpdaterImpl.AnonymousClass1.AnonymousClass1 setMax;
    /* access modifiers changed from: private */
    public final openRecordMode.setMax setMin;

    @Inject
    public isSupportCaptureFlush(Context context, openRecordMode.setMax setmax, GriverRVAppUpdaterImpl.AnonymousClass1.AnonymousClass1 r3, execJavaScript4EmbedView execjavascript4embedview, StorageBridgeExtension storageBridgeExtension) {
        this.getMin = context;
        this.setMin = setmax;
        this.setMax = r3;
        this.IsOverlapping = execjavascript4embedview;
        this.isInside = storageBridgeExtension;
    }

    public final void setMax() {
        this.setMax.dispose();
        this.IsOverlapping.dispose();
    }

    public final void setMin() {
        this.setMin.showProgress();
        this.IsOverlapping.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(@NonNull Object obj) {
                Boolean bool = (Boolean) obj;
                isSupportCaptureFlush.this.setMin.enableBanner(bool.booleanValue());
                if (Boolean.TRUE.equals(bool)) {
                    isSupportCaptureFlush issupportcaptureflush = isSupportCaptureFlush.this;
                    issupportcaptureflush.setMax.execute(new GriverAppVirtualHostProxy<GriverAMCSLiteAppUpdater>() {
                        public final /* synthetic */ void onNext(@NonNull Object obj) {
                            isSupportCaptureFlush.setMax(isSupportCaptureFlush.this, (GriverAMCSLiteAppUpdater) obj);
                        }

                        public final void onError(Throwable th) {
                            String str;
                            super.onError(th);
                            openRecordMode.setMax min = isSupportCaptureFlush.this.setMin;
                            Context max = isSupportCaptureFlush.this.getMin;
                            if (th instanceof NetworkException) {
                                str = ((NetworkException) th).getMessage();
                            } else {
                                str = max.getString(R.string.general_error_msg);
                            }
                            min.onError(str);
                        }

                        public final void onComplete() {
                            if (isSupportCaptureFlush.this.length == null || isSupportCaptureFlush.this.getMax == null) {
                                isSupportCaptureFlush.this.setMin.enableBanner(false);
                            }
                        }
                    });
                }
            }

            public final void onError(Throwable th) {
                super.onError(th);
                isSupportCaptureFlush.this.setMin.enableBanner(false);
            }
        });
    }

    public final void getMin() {
        String str = this.length;
        if (str != null) {
            DanaH5.startContainerFullUrl(str);
        }
    }

    static /* synthetic */ void setMax(isSupportCaptureFlush issupportcaptureflush, GriverAMCSLiteAppUpdater griverAMCSLiteAppUpdater) {
        internalAPI internalapi;
        CdpContentModel cdpContentModel;
        if (!(griverAMCSLiteAppUpdater.getCdpContents() == null || (internalapi = (internalAPI) issupportcaptureflush.isInside.apply(griverAMCSLiteAppUpdater)) == null || (cdpContentModel = internalapi.setMin) == null)) {
            issupportcaptureflush.length = cdpContentModel.toDoubleRange;
            String str = cdpContentModel.setMax;
            issupportcaptureflush.getMax = str;
            if (!(issupportcaptureflush.length == null || str == null)) {
                issupportcaptureflush.setMin.onLoadBanner(str);
                issupportcaptureflush.setMin.dismissProgress();
                return;
            }
        }
        issupportcaptureflush.setMin.enableBanner(false);
    }
}
