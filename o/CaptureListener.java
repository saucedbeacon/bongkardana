package o;

import android.content.Context;
import android.text.TextUtils;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import id.dana.model.CdpContentModel;
import javax.inject.Inject;
import o.GriverProgressBar;
import o.GriverRVAppUpdaterImpl;
import o.MovableFrameLayout;
import o.ScanBridgeExtension;
import o.TakePictureProcessor;
import o.TitleBarRightButtonView;
import o.onAction;

@PerActivity
public final class CaptureListener implements onAction.setMax {
    /* access modifiers changed from: private */
    public ScanBridgeExtension FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public GriverAMCSLiteAppUpdater Grayscale$Algorithm;
    private final StorageBridgeExtension IsOverlapping;
    private String Mean$Arithmetic;
    private final IRedDotManager equals;
    private final Context getMax;
    private final GriverRVAppUpdaterImpl.AnonymousClass1 getMin;
    private final IComponent<Boolean> hashCode = IComponent.setMax();
    private String invokeSuspend;
    private final GriverRVAppInfoManagerImpl isInside;
    private final MovableFrameLayout.AnonymousClass1 length;
    private final BluetoothManifest setMax;
    private final ScanBridgeExtension.AnonymousClass1 setMin;
    /* access modifiers changed from: private */
    public result toDoubleRange;
    private final getTotalSize toFloatRange;
    /* access modifiers changed from: private */
    public final onAction.length toIntRange;
    /* access modifiers changed from: private */
    public final IComponent<Boolean> toString = IComponent.setMax();
    /* access modifiers changed from: private */
    public ScanBridgeExtension values;

    @Inject
    public CaptureListener(Context context, ScanBridgeExtension.AnonymousClass1 r3, BluetoothManifest bluetoothManifest, MovableFrameLayout.AnonymousClass1 r5, GriverRVAppUpdaterImpl.AnonymousClass1 r6, GriverRVAppInfoManagerImpl griverRVAppInfoManagerImpl, StorageBridgeExtension storageBridgeExtension, getTotalSize gettotalsize, onAction.length length2) {
        this.getMax = context;
        this.setMin = r3;
        this.length = r5;
        this.getMin = r6;
        this.isInside = griverRVAppInfoManagerImpl;
        this.IsOverlapping = storageBridgeExtension;
        this.toFloatRange = gettotalsize;
        this.setMax = bluetoothManifest;
        this.toIntRange = length2;
        this.equals = new IRedDotManager();
    }

    public final void setMax() {
        this.setMin.dispose();
        this.setMax.dispose();
        this.length.dispose();
        this.getMin.dispose();
        this.isInside.dispose();
        this.equals.dispose();
    }

    public final void getMax() {
        GriverProgressBar.UpdateRunnable subscribe = TitleBarRightButtonView.AnonymousClass1.zip(this.hashCode, this.toString, TakePictureProcessor.AnonymousClass5.getMax).subscribe(new setDataType(this));
        if (subscribe != null) {
            this.equals.getMin(subscribe);
        }
    }

    public final void length() {
        this.toIntRange.showProgress();
        this.setMin.execute(new GriverAppVirtualHostProxy<ScanBridgeExtension>() {
            public final /* synthetic */ void onNext(Object obj) {
                ScanBridgeExtension unused = CaptureListener.this.FastBitmap$CoordinateSystem = (ScanBridgeExtension) obj;
                CaptureListener.this.setMax.execute(new GriverAppVirtualHostProxy<ScanBridgeExtension>() {
                    public final /* synthetic */ void onNext(Object obj) {
                        ScanBridgeExtension unused = CaptureListener.this.values = (ScanBridgeExtension) obj;
                        if (CaptureListener.this.setMin()) {
                            CaptureListener.getMin(CaptureListener.this);
                            CaptureListener.this.length.execute(new GriverAppVirtualHostProxy<result>() {
                                public final /* synthetic */ void onNext(Object obj) {
                                    result unused = CaptureListener.this.toDoubleRange = (result) obj;
                                    CaptureListener.this.toString.onNext(Boolean.TRUE);
                                }

                                public final void onError(Throwable th) {
                                    super.onError(th);
                                    updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.REFERRAL_GET_REFERRAL_STATUS_CONSULT, DanaLogConstants.ExceptionType.PROMO_CENTER_EXCEPTION, th);
                                }
                            });
                            return;
                        }
                        CaptureListener.this.toIntRange.dismissProgress();
                        CaptureListener.this.IsOverlapping();
                    }

                    public final void onError(Throwable th) {
                        super.onError(th);
                        StringBuilder sb = new StringBuilder("onError: ");
                        sb.append(th.getMessage());
                        updateActionSheetContent.e(DanaLogConstants.TAG.HOME_REFERRAL, sb.toString());
                    }
                });
            }

            public final void onError(Throwable th) {
                super.onError(th);
                StringBuilder sb = new StringBuilder("onError: ");
                sb.append(th.getMessage());
                updateActionSheetContent.e(DanaLogConstants.TAG.HOME_REFERRAL, sb.toString());
            }
        });
    }

    /* access modifiers changed from: private */
    public boolean setMin() {
        return this.FastBitmap$CoordinateSystem.isEnabled() || this.values.isEnabled();
    }

    private boolean getMin() {
        return this.Grayscale$Algorithm != null && !TextUtils.isEmpty(this.Mean$Arithmetic) && !TextUtils.isEmpty(this.invokeSuspend);
    }

    /* access modifiers changed from: private */
    public void IsOverlapping() {
        boolean z = true;
        this.toIntRange.enableEntryPoint(getMin() && setMin());
        onAction.length length2 = this.toIntRange;
        if (!getMin() || !setMin()) {
            z = false;
        }
        length2.enableBanner(z);
    }

    static /* synthetic */ void getMin(CaptureListener captureListener) {
        if (captureListener.values.isEnabled()) {
            captureListener.getMin.execute(new GriverAppVirtualHostProxy<GriverAMCSLiteAppUpdater>() {
                public final /* synthetic */ void onNext(Object obj) {
                    GriverAMCSLiteAppUpdater griverAMCSLiteAppUpdater = (GriverAMCSLiteAppUpdater) obj;
                    GriverAMCSLiteAppUpdater unused = CaptureListener.this.Grayscale$Algorithm = griverAMCSLiteAppUpdater;
                    CaptureListener.length(CaptureListener.this, griverAMCSLiteAppUpdater);
                }

                public final void onError(Throwable th) {
                    super.onError(th);
                    CaptureListener.this.toIntRange.dismissProgress();
                    CaptureListener.this.IsOverlapping();
                    updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.REFERRAL_GET_HOME_REFERRAL_P2P_BANNER, DanaLogConstants.ExceptionType.PROMO_CENTER_EXCEPTION, th);
                }
            });
        } else {
            captureListener.isInside.execute(new GriverAppVirtualHostProxy<GriverAMCSLiteAppUpdater>() {
                public final /* synthetic */ void onNext(Object obj) {
                    GriverAMCSLiteAppUpdater griverAMCSLiteAppUpdater = (GriverAMCSLiteAppUpdater) obj;
                    GriverAMCSLiteAppUpdater unused = CaptureListener.this.Grayscale$Algorithm = griverAMCSLiteAppUpdater;
                    CaptureListener.length(CaptureListener.this, griverAMCSLiteAppUpdater);
                }

                public final void onError(Throwable th) {
                    super.onError(th);
                    CaptureListener.this.toIntRange.dismissProgress();
                    CaptureListener.this.IsOverlapping();
                    updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.REFERRAL_GET_HOME_REFERRAL_BANNER, DanaLogConstants.ExceptionType.PROMO_CENTER_EXCEPTION, th);
                }
            });
        }
    }

    static /* synthetic */ void length(CaptureListener captureListener, GriverAMCSLiteAppUpdater griverAMCSLiteAppUpdater) {
        internalAPI internalapi;
        CdpContentModel cdpContentModel;
        if (!(griverAMCSLiteAppUpdater.getCdpContents() == null || (internalapi = (internalAPI) captureListener.IsOverlapping.apply(griverAMCSLiteAppUpdater)) == null || (cdpContentModel = internalapi.setMin) == null)) {
            captureListener.Mean$Arithmetic = cdpContentModel.toDoubleRange;
            captureListener.invokeSuspend = cdpContentModel.setMax;
            if (!TextUtils.isEmpty(captureListener.Mean$Arithmetic) && !TextUtils.isEmpty(captureListener.invokeSuspend)) {
                captureListener.toIntRange.saveEntryPointUrl(captureListener.Mean$Arithmetic);
                captureListener.toIntRange.onLoadBanner(captureListener.invokeSuspend);
                captureListener.hashCode.onNext(Boolean.TRUE);
                return;
            }
        }
        captureListener.toIntRange.dismissProgress();
        captureListener.IsOverlapping();
    }

    static /* synthetic */ Boolean length(Boolean bool, Boolean bool2) {
        return Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
    }

    static /* synthetic */ void getMin(CaptureListener captureListener, Boolean bool) {
        if (bool.booleanValue()) {
            captureListener.toIntRange.dismissProgress();
            captureListener.IsOverlapping();
            if (captureListener.getMin() && captureListener.setMin()) {
                captureListener.toIntRange.onGetReferralStatusConsultSuccess((handleLoggingAction) captureListener.toFloatRange.apply(captureListener.toDoubleRange));
            }
        }
    }
}
