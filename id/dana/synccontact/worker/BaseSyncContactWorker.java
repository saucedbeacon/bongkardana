package id.dana.synccontact.worker;

import android.content.Context;
import android.provider.ContactsContract;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.sendmoney.contact.provider.ContactModel;
import id.dana.sendmoney.contact.provider.ContactProvider;
import java.util.ArrayList;
import java.util.List;
import o.CornerMarkingDataProvider;
import o.CycledLeScanner;
import o.CycledLeScannerForJellyBeanMr2;
import o.GVErrorView;
import o.GriverAppVirtualHostProxy;
import o.TitleBarRightButtonView;
import o.getAPDensity;
import o.getApFromDimen;
import o.getApFromString;
import o.getWakeUpOperation;
import o.isOriginHasAppInfo;
import o.setStateOn;
import o.setWakeUpAlarm;
import o.updateActionSheetContent;

public abstract class BaseSyncContactWorker extends RxWorker {
    /* access modifiers changed from: private */
    public static final String IsOverlapping = BaseSyncContactWorker.class.getSimpleName();
    public ContactModel equals;
    public final getApFromDimen getMax;
    /* access modifiers changed from: private */
    public int hashCode;
    public GVErrorView isInside;
    public getWakeUpOperation length;
    public CycledLeScanner.AnonymousClass1 setMax;
    public final getApFromString setMin;
    public setWakeUpAlarm toFloatRange;
    public CycledLeScannerForJellyBeanMr2.AnonymousClass2 toIntRange;
    private ContactProvider values;

    public abstract void setMax(TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<ListenableWorker.setMax> r1);

    public BaseSyncContactWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters, getApFromString getapfromstring, getApFromDimen getapfromdimen) {
        super(context, workerParameters);
        this.setMin = getapfromstring;
        this.getMax = getapfromdimen;
        this.values = new ContactProvider(context.getContentResolver());
    }

    public final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<ListenableWorker.setMax> setMax() {
        return TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getAPDensity(this));
    }

    public final List<String> length(String str) {
        int i;
        List<ContactModel> list;
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        int i2 = this.hashCode;
        if (i2 > 2) {
            i2 = 2;
        }
        boolean z = true;
        while (true) {
            if (!z || !length()) {
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i3 = this.hashCode;
            } else {
                ContactProvider contactProvider = this.values;
                if (TextUtils.isEmpty(str)) {
                    if (CornerMarkingDataProvider.setMin()) {
                        strArr = ContactProvider.setMax;
                    } else {
                        strArr = ContactProvider.getMax;
                    }
                    list = ContactProvider.getMin(contactProvider.length.query(ContactsContract.Data.CONTENT_URI, strArr, "mimetype = ?", ContactProvider.length("vnd.android.cursor.item/phone_v2"), ContactProvider.getMin(CornerMarkingDataProvider.setMin() ? "contact_last_updated_timestamp" : "raw_contact_id", i2)));
                } else {
                    list = contactProvider.setMax(i2, str);
                }
                if (!list.isEmpty()) {
                    arrayList.addAll(list);
                    ContactModel contactModel = list.get(list.size() - 1);
                    if (CornerMarkingDataProvider.setMin()) {
                        str = contactModel.isInside;
                    } else {
                        str = contactModel.IsOverlapping;
                    }
                }
                if (arrayList.size() >= this.hashCode || list.isEmpty()) {
                    z = false;
                }
            }
        }
        ArrayList arrayList22 = new ArrayList();
        int size2 = arrayList.size();
        int i32 = this.hashCode;
        if (size2 < i32) {
            i32 = arrayList.size();
        }
        for (i = 0; i < i32; i++) {
            arrayList22.add(isOriginHasAppInfo.getClearPhoneNumber(((ContactModel) arrayList.get(i)).toFloatRange));
            if (i == i32 - 1) {
                this.equals = (ContactModel) arrayList.get(i);
            }
        }
        return arrayList22;
    }

    private boolean length() {
        return setStateOn.getMin(getApplicationContext(), "android.permission.READ_CONTACTS");
    }

    public void onStopped() {
        this.toFloatRange.dispose();
        this.setMax.dispose();
        this.length.dispose();
        this.isInside.dispose();
        super.onStopped();
    }

    public static /* synthetic */ void getMin(BaseSyncContactWorker baseSyncContactWorker, final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1 r3) {
        if (!baseSyncContactWorker.length() || baseSyncContactWorker.values.setMax() || baseSyncContactWorker.getRunAttemptCount() > 3) {
            r3.onSuccess(ListenableWorker.setMax.setMax());
        }
        baseSyncContactWorker.toFloatRange.executeInBackground(new GriverAppVirtualHostProxy<CycledLeScannerForJellyBeanMr2.AnonymousClass3>() {
            public final /* synthetic */ void onNext(Object obj) {
                CycledLeScannerForJellyBeanMr2.AnonymousClass3 r2 = (CycledLeScannerForJellyBeanMr2.AnonymousClass3) obj;
                if (r2.isSynchronizeContactEnable()) {
                    int unused = BaseSyncContactWorker.this.hashCode = r2.getMaxContactSyncBatchSize();
                    BaseSyncContactWorker.this.setMax(r3);
                    return;
                }
                r3.onSuccess(ListenableWorker.setMax.getMin());
            }

            public final void onError(Throwable th) {
                super.onError(th);
                String min = BaseSyncContactWorker.IsOverlapping;
                StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.CONTACT_SYNC_PREFIX);
                sb.append(getClass().getName());
                sb.append(":onError");
                updateActionSheetContent.e(min, sb.toString(), th);
                r3.onSuccess(ListenableWorker.setMax.setMax());
            }
        });
    }
}
