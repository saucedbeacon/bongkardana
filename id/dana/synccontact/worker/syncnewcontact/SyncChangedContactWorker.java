package id.dana.synccontact.worker.syncnewcontact;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.synccontact.worker.BaseSyncContactWorker;
import java.util.ArrayList;
import java.util.List;
import o.CornerMarkingDataProvider;
import o.CycledLeScanner;
import o.CycledLeScannerForJellyBeanMr2;
import o.GriverAppVirtualHostProxy;
import o.TitleBarRightButtonView;
import o.getApFromDimen;
import o.getApFromString;
import o.updateActionSheetContent;

public class SyncChangedContactWorker extends BaseSyncContactWorker {
    /* access modifiers changed from: private */
    public static final String IsOverlapping = SyncChangedContactWorker.class.getSimpleName();

    public SyncChangedContactWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters, getApFromString getapfromstring, getApFromDimen getapfromdimen) {
        super(context, workerParameters, getapfromstring, getapfromdimen);
    }

    public final void setMax(final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<ListenableWorker.setMax> r3) {
        this.length.executeInBackground(new GriverAppVirtualHostProxy<CycledLeScannerForJellyBeanMr2.AnonymousClass2>() {
            public final /* synthetic */ void onNext(@NonNull Object obj) {
                SyncChangedContactWorker.this.toIntRange = (CycledLeScannerForJellyBeanMr2.AnonymousClass2) obj;
                String length = SyncChangedContactWorker.length(SyncChangedContactWorker.this);
                if (!TextUtils.isEmpty(length)) {
                    SyncChangedContactWorker.getMax(SyncChangedContactWorker.this, r3, length);
                } else {
                    r3.onSuccess(ListenableWorker.setMax.getMin());
                }
            }

            public final void onError(Throwable th) {
                super.onError(th);
                StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.CONTACT_SYNC_PREFIX);
                sb.append(getClass().getName());
                updateActionSheetContent.exception(sb.toString(), DanaLogConstants.ExceptionType.CONTACT_SYNC_EXCEPTION, th.toString());
                r3.onSuccess(ListenableWorker.setMax.setMax());
            }
        });
    }

    static /* synthetic */ String length(SyncChangedContactWorker syncChangedContactWorker) {
        if (syncChangedContactWorker.toIntRange == null) {
            return "";
        }
        return CornerMarkingDataProvider.setMin() ? syncChangedContactWorker.toIntRange.getLastUpdatedTime() : syncChangedContactWorker.toIntRange.getRawId();
    }

    static /* synthetic */ void getMax(SyncChangedContactWorker syncChangedContactWorker, final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1 r4, String str) {
        List<String> list;
        try {
            list = syncChangedContactWorker.length(str);
        } catch (Exception e) {
            ArrayList arrayList = new ArrayList();
            FirebaseCrashlytics.getInstance().recordException(new Exception("CursorWindow error while sync contacts", e));
            list = arrayList;
        }
        if (!list.isEmpty()) {
            syncChangedContactWorker.setMax.executeInBackground(new GriverAppVirtualHostProxy<Boolean>() {
                public final /* synthetic */ void onNext(@NonNull Object obj) {
                    if (Boolean.TRUE.equals((Boolean) obj)) {
                        SyncChangedContactWorker.this.getMax.setMax(SyncChangedContactWorker.this.getApplicationContext(), "sync_changed_contact_worker", SyncChangedContactWorker.class);
                        r4.onSuccess(ListenableWorker.setMax.getMin());
                        return;
                    }
                    r4.onSuccess(ListenableWorker.setMax.setMax());
                }

                public final void onError(Throwable th) {
                    super.onError(th);
                    r4.onSuccess(ListenableWorker.setMax.setMin());
                    String min = SyncChangedContactWorker.IsOverlapping;
                    StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.CONTACT_SYNC_PREFIX);
                    sb.append(getClass().getName());
                    sb.append(":onError");
                    updateActionSheetContent.e(min, sb.toString(), th);
                    StringBuilder sb2 = new StringBuilder(DanaLogConstants.Prefix.CONTACT_SYNC_PREFIX);
                    sb2.append(getClass().getName());
                    updateActionSheetContent.exception(sb2.toString(), DanaLogConstants.ExceptionType.CONTACT_SYNC_EXCEPTION, th.toString());
                }
            }, CycledLeScanner.AnonymousClass1.length.forSyncContact(list, (CycledLeScannerForJellyBeanMr2.AnonymousClass2) syncChangedContactWorker.setMin.apply(syncChangedContactWorker.equals)));
            return;
        }
        r4.onSuccess(ListenableWorker.setMax.setMax());
    }
}
