package o;

import dagger.Lazy;
import id.dana.data.base.BasePersistenceDao;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class RemoteDebugBridgeExtension extends reverseAnimationSpeed implements onConnectClosed {
    @Inject
    public RemoteDebugBridgeExtension(Lazy<BasePersistenceDao> lazy) {
        super(lazy);
    }

    public TitleBarRightButtonView.AnonymousClass1<List<Long>> saveRecentPayers(List<RemoteDebugUtils> list) {
        return TitleBarRightButtonView.AnonymousClass1.defer(new onSocketError(this, list));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$saveRecentPayers$0(List list) throws Exception {
        Long l;
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i <= list.size() - 1; i++) {
            RemoteDebugUtils recentContactByPhoneNumber = getRecentContactByPhoneNumber(((RemoteDebugUtils) list.get(i)).getUserPhoneNumber());
            if (recentContactByPhoneNumber == null) {
                recentContactByPhoneNumber = getRecentContactByUserId(((RemoteDebugUtils) list.get(i)).getUserId());
            }
            if (recentContactByPhoneNumber == null) {
                l = getDb().recentPayerSplitBillDao().saveRecentContactSplitBill((RemoteDebugUtils) list.get(i));
            } else {
                l = Long.valueOf((long) getDb().recentPayerSplitBillDao().updateRecentContact(mapper((RemoteDebugUtils) list.get(i), recentContactByPhoneNumber)));
            }
            arrayList.add(l);
        }
        deleteOldRecentPayer();
        return TitleBarRightButtonView.AnonymousClass1.just(arrayList);
    }

    public TitleBarRightButtonView.AnonymousClass1<List<RemoteDebugUtils>> getRecentPayers(int i) {
        return TitleBarRightButtonView.AnonymousClass1.defer(new RemoteDebugStatePoint(this, i));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getRecentPayers$1(int i) throws Exception {
        return TitleBarRightButtonView.AnonymousClass1.just(getDb().recentPayerSplitBillDao().getSomeRecentPayer(i));
    }

    public void clearAll() {
        getDb().recentPayerSplitBillDao().removeAllRecentContact();
    }

    private void deleteOldRecentPayer() {
        getDb().recentPayerSplitBillDao().deleteOldRecentPayer();
    }

    private RemoteDebugUtils getRecentContactByPhoneNumber(String str) {
        return getDb().recentPayerSplitBillDao().getRecentContactByPhoneNumber(str);
    }

    private RemoteDebugUtils getRecentContactByUserId(String str) {
        return getDb().recentPayerSplitBillDao().getRecentContactByUserId(str);
    }

    private RemoteDebugUtils mapper(RemoteDebugUtils remoteDebugUtils, RemoteDebugUtils remoteDebugUtils2) {
        remoteDebugUtils2.setUserId(remoteDebugUtils.getUserId());
        remoteDebugUtils2.setUserPhoneNumber(isOriginHasAppInfo.getPhoneNumberWithoutMasking(remoteDebugUtils2.getUserPhoneNumber(), remoteDebugUtils.getUserPhoneNumber()));
        remoteDebugUtils2.setAvatar(remoteDebugUtils.getAvatar());
        remoteDebugUtils2.setUserNickname(remoteDebugUtils.getUserNickname());
        remoteDebugUtils2.setLastUpdated(remoteDebugUtils.getLastUpdated());
        return remoteDebugUtils2;
    }
}
