package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import javax.inject.Inject;
import o.ResourceDownloadType;
import o.enqueueWorkRequests;
import o.setH5ErrorPage;

@PerActivity
public final class cancelUniqueWork implements enqueueWorkRequests.length {
    private final BluetoothManifest getMax;
    /* access modifiers changed from: private */
    public final enqueueWorkRequests.setMax getMin;
    private final ResourceDownloadType length;
    private final setH5ErrorPage setMax;
    private final getManifestCheckingDisabled setMin;

    @Inject
    public cancelUniqueWork(enqueueWorkRequests.setMax setmax, getManifestCheckingDisabled getmanifestcheckingdisabled, BluetoothManifest bluetoothManifest, ResourceDownloadType resourceDownloadType, setH5ErrorPage seth5errorpage) {
        this.getMin = setmax;
        this.setMin = getmanifestcheckingdisabled;
        this.getMax = bluetoothManifest;
        this.length = resourceDownloadType;
        this.setMax = seth5errorpage;
    }

    public final void getMax() {
        this.setMin.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                cancelUniqueWork.this.getMin.onGetFeatureBelowKitkatConfigSuccess(((Boolean) obj).booleanValue());
            }
        });
    }

    public final void getMin() {
        this.getMax.execute(new GriverAppVirtualHostProxy<ScanBridgeExtension>() {
            public final /* synthetic */ void onNext(Object obj) {
                ScanBridgeExtension scanBridgeExtension = (ScanBridgeExtension) obj;
                cancelUniqueWork.this.getMin.onFinishCheckReferralSendMoney(scanBridgeExtension.isEnabled(), scanBridgeExtension.getHowToUrl());
            }

            public final void onError(Throwable th) {
                super.onError(th);
                StringBuilder sb = new StringBuilder("onError: ");
                sb.append(th.getMessage());
                updateActionSheetContent.e(DanaLogConstants.TAG.REFERRAL_TAG, sb.toString());
            }
        });
    }

    public final void setMax() {
        this.setMin.dispose();
        this.getMax.dispose();
        this.setMax.dispose();
        this.length.dispose();
    }

    public final void getMin(increaseCount increasecount) {
        final increaseCount increasecount2 = increasecount;
        if (increasecount2.values == 4) {
            this.length.execute(new GriverAppVirtualHostProxy<Boolean>() {
                public final /* synthetic */ void onNext(Object obj) {
                    cancelUniqueWork.this.getMin.onSuccessRemoveRecentTransaction(((Boolean) obj).booleanValue(), increasecount2);
                }
            }, ResourceDownloadType.setMax.forSaveRecentBank(increasecount.length(), increasecount2.length, increasecount2.isInside, increasecount.getMax(), increasecount2.setMin, increasecount.getMin(), increasecount2.length, increasecount2.toIntRange, increasecount2.toFloatRange, increasecount2.equals, increasecount.setMin(), increasecount2.isInside, increasecount.toIntRange(), increasecount2.FastBitmap$CoordinateSystem, false));
        } else if (increasecount2.values == 2) {
            this.setMax.execute(new GriverAppVirtualHostProxy<Boolean>() {
                public final /* synthetic */ void onNext(Object obj) {
                    cancelUniqueWork.this.getMin.onSuccessRemoveRecentTransaction(((Boolean) obj).booleanValue(), increasecount2);
                }
            }, setH5ErrorPage.setMax.forRecentContact(increasecount.length(), increasecount2.isInside, increasecount.getMin(), increasecount.getMax(), increasecount2.FastBitmap$CoordinateSystem, false));
        }
    }
}
