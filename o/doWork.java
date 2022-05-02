package o;

import android.text.TextUtils;
import id.dana.data.base.NetworkException;
import javax.inject.Inject;
import o.getWorkerFactory;
import o.setGriverAppStorageProxy;

public final class doWork implements getWorkerFactory.setMax {
    private final setGriverAppStorageProxy length;
    /* access modifiers changed from: private */
    public final getWorkerFactory.length setMax;

    @Inject
    public doWork(getWorkerFactory.length length2, setGriverAppStorageProxy setgriverappstorageproxy) {
        this.setMax = length2;
        this.length = setgriverappstorageproxy;
    }

    public final void getMax(String str, final String str2, final boolean z) {
        this.length.execute(new GriverAppVirtualHostProxy<GriverAppInfoDBHelper>() {
            public final /* synthetic */ void onNext(Object obj) {
                GriverAppInfoDBHelper griverAppInfoDBHelper = (GriverAppInfoDBHelper) obj;
                if (griverAppInfoDBHelper == null) {
                    doWork.this.setMax.setMax();
                } else if (griverAppInfoDBHelper.isTrackResult()) {
                    doWork.setMin(doWork.this, griverAppInfoDBHelper.isRedeemResult(), z, str2);
                } else {
                    doWork.getMax(doWork.this, griverAppInfoDBHelper.getQuestRedirectType(), griverAppInfoDBHelper.getQuestRedirectValue());
                }
            }

            public final void onError(Throwable th) {
                super.onError(th);
                if (th instanceof NetworkException) {
                    doWork.this.setMax.onError(th.getMessage());
                }
                doWork.this.setMax.setMax();
            }
        }, setGriverAppStorageProxy.setMin.forTrackUserQuest(str, str2, false));
    }

    public final void setMax() {
        this.length.dispose();
    }

    static /* synthetic */ void setMin(doWork dowork, boolean z, boolean z2, String str) {
        if (!z) {
            dowork.setMax.getMin(z2, str);
        }
    }

    static /* synthetic */ void getMax(doWork dowork, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            dowork.setMax.setMax();
        } else {
            dowork.setMax.getMin(str, str2);
        }
    }
}
