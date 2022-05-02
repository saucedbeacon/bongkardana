package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import o.isUserInputEnabled;

public abstract class FragmentStateAdapter$2<T> extends setGlobalUserData<T> {
    private final copyBackForwardList getMax;
    final isUserInputEnabled.length setMax;

    public void onComplete() {
    }

    /* access modifiers changed from: protected */
    public abstract boolean setMax(T t);

    /* access modifiers changed from: protected */
    public abstract String setMin(T t);

    public FragmentStateAdapter$2(copyBackForwardList copybackforwardlist, isUserInputEnabled.length length) {
        this.getMax = copybackforwardlist;
        this.setMax = length;
    }

    public void onNext(T t) {
        this.getMax.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    FragmentStateAdapter$2.this.setMax.dismissProgress();
                }
            }
        });
        if (setMax(t)) {
            this.setMax.length();
            StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.QRCODE_GENERATE_PREFIX);
            sb.append(getClass().getName());
            sb.append("response:code empty");
            updateActionSheetContent.w(DanaLogConstants.TAG.QRCODE_TAG, sb.toString());
            return;
        }
        this.setMax.getMin(setMin(t));
    }

    public void onError(Throwable th) {
        StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.QRCODE_GENERATE_PREFIX);
        sb.append(getClass().getName());
        sb.append("get code onError");
        updateActionSheetContent.e(DanaLogConstants.TAG.QRCODE_TAG, sb.toString(), th);
        this.getMax.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    FragmentStateAdapter$2.this.setMax.dismissProgress();
                }
            }
        });
        this.setMax.length();
    }
}
