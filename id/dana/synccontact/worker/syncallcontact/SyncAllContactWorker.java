package id.dana.synccontact.worker.syncallcontact;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.synccontact.worker.BaseSyncContactWorker;
import java.util.List;
import o.CornerMarkingDataProvider;
import o.CycledLeScanner;
import o.CycledLeScannerForJellyBeanMr2;
import o.GriverAppVirtualHostProxy;
import o.TitleBarRightButtonView;
import o.getApFromDimen;
import o.getApFromString;
import o.scanLeDevice;
import o.updateActionSheetContent;

public class SyncAllContactWorker extends BaseSyncContactWorker {
    private static final String hashCode = SyncAllContactWorker.class.getSimpleName();
    public CycledLeScanner.AnonymousClass2 IsOverlapping;
    public scanLeDevice toDoubleRange;

    public SyncAllContactWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters, getApFromString getapfromstring, getApFromDimen getapfromdimen) {
        super(context, workerParameters, getapfromstring, getapfromdimen);
    }

    public final void setMax(final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<ListenableWorker.setMax> r3) {
        this.toDoubleRange.executeInBackground(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    r3.onSuccess(ListenableWorker.setMax.getMin());
                } else {
                    SyncAllContactWorker.this.length.executeInBackground(new GriverAppVirtualHostProxy<CycledLeScannerForJellyBeanMr2.AnonymousClass2>(r3) {
                        public final /* synthetic */ void onNext(Object obj) {
                            SyncAllContactWorker.this.toIntRange = (CycledLeScannerForJellyBeanMr2.AnonymousClass2) obj;
                            SyncAllContactWorker.setMax(SyncAllContactWorker.this, r3);
                        }

                        public final void onError(Throwable th) {
                            super.onError(th);
                            SyncAllContactWorker.setMax(SyncAllContactWorker.this, r3);
                        }
                    });
                }
            }
        });
    }

    public void onStopped() {
        this.IsOverlapping.dispose();
        this.toDoubleRange.dispose();
        super.onStopped();
    }

    static /* synthetic */ void setMax(SyncAllContactWorker syncAllContactWorker, final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1 r4) {
        String str;
        if (syncAllContactWorker.toIntRange == null) {
            str = "";
        } else {
            str = CornerMarkingDataProvider.setMin() ? syncAllContactWorker.toIntRange.getLastUpdatedTime() : syncAllContactWorker.toIntRange.getRawId();
        }
        List<String> length = syncAllContactWorker.length(str);
        if (!length.isEmpty()) {
            syncAllContactWorker.setMax.executeInBackground(new GriverAppVirtualHostProxy<Boolean>() {
                public final /* synthetic */ void onNext(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        SyncAllContactWorker.this.getMax.setMax(SyncAllContactWorker.this.getApplicationContext(), "sync_all_contact_worker", SyncAllContactWorker.class);
                        r4.onSuccess(ListenableWorker.setMax.getMin());
                        return;
                    }
                    r4.onSuccess(ListenableWorker.setMax.setMax());
                }

                public final void onError(Throwable th) {
                    super.onError(th);
                    r4.onSuccess(ListenableWorker.setMax.setMin());
                    StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.CONTACT_SYNC_PREFIX);
                    sb.append(getClass().getName());
                    updateActionSheetContent.exception(sb.toString(), DanaLogConstants.ExceptionType.CONTACT_SYNC_EXCEPTION, th.toString());
                }
            }, CycledLeScanner.AnonymousClass1.length.forSyncContact(length, (CycledLeScannerForJellyBeanMr2.AnonymousClass2) syncAllContactWorker.setMin.apply(syncAllContactWorker.equals)));
        } else {
            syncAllContactWorker.IsOverlapping.executeInBackground(new GriverAppVirtualHostProxy());
        }
    }
}
