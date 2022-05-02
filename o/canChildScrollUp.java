package o;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import id.dana.R;
import id.dana.sendmoney.contact.provider.ContactProvider;
import id.dana.synccontact.worker.syncallcontact.SyncAllContactWorker;
import id.dana.synccontact.worker.syncnewcontact.SyncChangedContactWorker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import o.CycledLeScannerForJellyBeanMr2;
import o.GriverProgressBar;
import o.GriverResourcePreset;
import o.TitleBarRightButtonView;
import o.moveToStart;

public final class canChildScrollUp extends registerCallback implements moveToStart.setMin {
    private final getBeacons IsOverlapping;
    private final getApFromDimen equals;
    /* access modifiers changed from: private */
    public final Context getMax;
    private final scanLeDevice getMin;
    /* access modifiers changed from: private */
    public final moveToStart.getMin isInside;
    private final GriverResourcePreset.AnonymousClass2.AnonymousClass1 length;
    @VisibleForTesting
    GriverProgressBar.UpdateRunnable setMax;
    private final getDefaultFontSize setMin;
    private ContactProvider toFloatRange;
    private final getWakeUpOperation toIntRange;

    @Inject
    public canChildScrollUp(Context context, moveToStart.getMin getmin, GriverResourcePreset.AnonymousClass2.AnonymousClass1 r3, scanLeDevice scanledevice, getWakeUpOperation getwakeupoperation, getDefaultFontSize getdefaultfontsize, getApFromDimen getapfromdimen, getBeacons getbeacons, ContactProvider contactProvider) {
        this.isInside = getmin;
        this.length = r3;
        this.getMax = context;
        this.getMin = scanledevice;
        this.toIntRange = getwakeupoperation;
        this.setMin = getdefaultfontsize;
        this.equals = getapfromdimen;
        this.IsOverlapping = getbeacons;
        this.toFloatRange = contactProvider;
    }

    public final void setMin() {
        this.length.execute(new GriverAppVirtualHostProxy<List<String>>() {
            public final /* synthetic */ void onNext(Object obj) {
                canChildScrollUp.this.isInside.onGetDanaUserContactSuccess((List) obj);
            }

            public final void onError(Throwable th) {
                super.onError(th);
                canChildScrollUp.this.isInside.onError(canChildScrollUp.this.getMax.getString(R.string.general_error_msg));
            }
        });
    }

    public final void length() {
        this.setMin.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    canChildScrollUp.this.isInside.onEnableContactSyncFeature();
                }
            }
        });
    }

    public final void getMin() {
        GriverProgressBar.UpdateRunnable subscribe = TitleBarRightButtonView.AnonymousClass1.interval(3, TimeUnit.SECONDS, getSecureSignatureComp.setMin()).startWith(0L).subscribe(new setTargetOffsetTopAndBottom(this));
        this.setMax = subscribe;
        length(subscribe);
    }

    public final void setMax() {
        this.length.dispose();
        this.setMin.dispose();
        this.getMin.dispose();
        this.toIntRange.dispose();
        this.IsOverlapping.dispose();
    }

    static /* synthetic */ void setMin(canChildScrollUp canchildscrollup) {
        if (!canchildscrollup.equals.setMin(canchildscrollup.getMax)) {
            canchildscrollup.equals.setMax(canchildscrollup.getMax, "sync_all_contact_worker", SyncAllContactWorker.class);
        }
    }

    static /* synthetic */ void setMax(canChildScrollUp canchildscrollup, CycledLeScannerForJellyBeanMr2.AnonymousClass2 r3) {
        List list;
        if (r3 != null) {
            String lastUpdatedTime = CornerMarkingDataProvider.setMin() ? r3.getLastUpdatedTime() : r3.getRawId();
            ContactProvider contactProvider = canchildscrollup.toFloatRange;
            if (TextUtils.isEmpty(lastUpdatedTime)) {
                list = new ArrayList();
            } else {
                list = contactProvider.setMax(1, lastUpdatedTime);
            }
            if (!list.isEmpty() && !canchildscrollup.equals.setMax(canchildscrollup.getMax)) {
                canchildscrollup.equals.setMax(canchildscrollup.getMax, "sync_changed_contact_worker", SyncChangedContactWorker.class);
            }
        }
    }
}
