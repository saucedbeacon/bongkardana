package o;

import android.text.TextUtils;
import dagger.Lazy;
import id.dana.data.base.BasePersistenceDao;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.ExtensionInvoker;
import o.TitleBarRightButtonView;

@Singleton
public class invokeWithTargetExtensions extends reverseAnimationSpeed implements ExtensionInvoker {
    @Inject
    public invokeWithTargetExtensions(Lazy<BasePersistenceDao> lazy) {
        super(lazy);
    }

    public TitleBarRightButtonView.AnonymousClass1<Long> saveRecentBank(RemoteNormalExtensionInvoker remoteNormalExtensionInvoker) {
        return TitleBarRightButtonView.AnonymousClass1.defer(new proceed(this, remoteNormalExtensionInvoker));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$saveRecentBank$0(RemoteNormalExtensionInvoker remoteNormalExtensionInvoker) throws Exception {
        return TitleBarRightButtonView.AnonymousClass1.just(getDb().recentBankDao().insertOrUpdateRecentBank(remoteNormalExtensionInvoker));
    }

    public TitleBarRightButtonView.AnonymousClass1<Long[]> saveRecentBank(List<RemoteNormalExtensionInvoker> list) {
        return TitleBarRightButtonView.AnonymousClass1.defer(new ExtensionInvoker.InvokeResult(this, list));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$saveRecentBank$1(List list) throws Exception {
        return TitleBarRightButtonView.AnonymousClass1.just(getDb().recentBankDao().insertOrUpdateRecentBank((List<RemoteNormalExtensionInvoker>) list));
    }

    public TitleBarRightButtonView.AnonymousClass1<List<RemoteNormalExtensionInvoker>> getRecentBank() {
        return TitleBarRightButtonView.AnonymousClass1.defer(new proceedSafe(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getRecentBank$2() throws Exception {
        List<RemoteNormalExtensionInvoker> listRecentBank = getDb().recentBankDao().getListRecentBank();
        if (!listRecentBank.isEmpty()) {
            return TitleBarRightButtonView.AnonymousClass1.just(listRecentBank);
        }
        return TitleBarRightButtonView.AnonymousClass1.error(new Throwable("Empty bank list"));
    }

    public TitleBarRightButtonView.AnonymousClass1<List<RemoteNormalExtensionInvoker>> getRecentBank(String str, int i) {
        return TitleBarRightButtonView.AnonymousClass1.defer(new ExtensionInvoker.InvokeCallback(this, str, i));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getRecentBank$3(String str, int i) throws Exception {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            List<RemoteNormalExtensionInvoker> listRecentBank = getDb().recentBankDao().getListRecentBank();
            if (listRecentBank.size() > i) {
                removeOldestSavedBanks(i);
                listRecentBank = getDb().recentBankDao().getListRecentBank();
            }
            arrayList.addAll(listRecentBank);
        } else {
            arrayList.addAll(getDb().recentBankDao().getListRecentBank(str, i));
        }
        if (!arrayList.isEmpty()) {
            return TitleBarRightButtonView.AnonymousClass1.just(arrayList);
        }
        return TitleBarRightButtonView.AnonymousClass1.error(new Throwable("Empty bank list"));
    }

    public TitleBarRightButtonView.AnonymousClass1<List<InvokeException>> getOldRecentBank() {
        return TitleBarRightButtonView.AnonymousClass1.defer(new pending(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getOldRecentBank$4() throws Exception {
        List<InvokeException> oldListRecentBank = getDb().recentBankDao().getOldListRecentBank();
        if (!oldListRecentBank.isEmpty()) {
            return TitleBarRightButtonView.AnonymousClass1.just(oldListRecentBank);
        }
        return TitleBarRightButtonView.AnonymousClass1.error(new Throwable("Empty bank list"));
    }

    public TitleBarRightButtonView.AnonymousClass1<List<RemoteNormalExtensionInvoker>> removeAndUpdateRecentBank(String str, int i, RemoteNormalExtensionInvoker remoteNormalExtensionInvoker) {
        return TitleBarRightButtonView.AnonymousClass1.defer(new access$102(this, str, remoteNormalExtensionInvoker, i));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$removeAndUpdateRecentBank$5(String str, RemoteNormalExtensionInvoker remoteNormalExtensionInvoker, int i) throws Exception {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            removeRecentBankSelected(remoteNormalExtensionInvoker);
            arrayList.addAll(getDb().recentBankDao().getListRecentBank());
        } else {
            arrayList.addAll(getDb().recentBankDao().getListRecentBank(str, i));
        }
        return TitleBarRightButtonView.AnonymousClass1.just(arrayList);
    }

    public void clearAll() {
        getDb().recentBankDao().removeAllRecentBank();
    }

    private void removeRecentBankSelected(RemoteNormalExtensionInvoker remoteNormalExtensionInvoker) {
        List<RemoteNormalExtensionInvoker> listRecentBankByLastUpdate = getDb().recentBankDao().getListRecentBankByLastUpdate(true);
        getDb().recentBankDao().removeSingleRecentBank(remoteNormalExtensionInvoker);
        listRecentBankByLastUpdate.remove(remoteNormalExtensionInvoker);
    }

    private void removeOldestSavedBanks(int i) {
        List<RemoteNormalExtensionInvoker> listRecentBankByLastUpdate = getDb().recentBankDao().getListRecentBankByLastUpdate(true);
        while (listRecentBankByLastUpdate.size() > i) {
            getDb().recentBankDao().removeSingleRecentBank(listRecentBankByLastUpdate.get(0));
            listRecentBankByLastUpdate.remove(0);
        }
    }
}
