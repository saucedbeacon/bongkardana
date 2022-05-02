package o;

import android.content.Context;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.List;
import javax.inject.Inject;
import o.BackoffPolicy;
import o.ZoomRecyclerView;
import o.getDefaultSyncJsApiSet;

public final class DirectExecutor extends registerCallback implements BackoffPolicy.length {
    private final getDefaultSyncJsApiSet getMax;
    private final BackoffPolicy.setMax getMin;
    private final ZoomRecyclerView.AnonymousClass1 length;
    private final Context setMax;
    private int setMin = 1;

    @Inject
    DirectExecutor(BackoffPolicy.setMax setmax, getDefaultSyncJsApiSet getdefaultsyncjsapiset, ZoomRecyclerView.AnonymousClass1 r4, Context context) {
        this.getMin = setmax;
        this.getMax = getdefaultsyncjsapiset;
        this.length = r4;
        this.setMax = context;
    }

    public final void setMax() {
        this.getMax.dispose();
    }

    private static boolean length(installPackage installpackage) {
        return installpackage == null || installpackage.getPromoCategories() == null || installpackage.getPromoCategories().isEmpty();
    }

    public final void setMin(final boolean z) {
        if (z) {
            this.getMin.showShimmerView();
        } else {
            this.getMin.showProgress();
        }
        int i = 1;
        if (z) {
            i = 1 + this.setMin;
            this.setMin = i;
        }
        this.setMin = i;
        this.getMax.execute(new GriverAppVirtualHostProxy<installPackage>() {
            public final /* synthetic */ void onNext(Object obj) {
                DirectExecutor.length(DirectExecutor.this, z, (installPackage) obj);
            }

            public final void onError(Throwable th) {
                super.onError(th);
                DirectExecutor.getMax(DirectExecutor.this, z);
                updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.PROMO_CENTER_GET_CATEGORY_LIST_PREFIX, DanaLogConstants.ExceptionType.PROMO_CENTER_EXCEPTION, th);
            }

            public final void onComplete() {
                DirectExecutor.setMax(DirectExecutor.this, z);
            }
        }, getDefaultSyncJsApiSet.setMin.forGetCategory(20, this.setMin, z));
    }

    static /* synthetic */ void length(DirectExecutor directExecutor, boolean z, installPackage installpackage) {
        if (length(installpackage)) {
            if (!z) {
                directExecutor.getMin.onFailGetCategories();
            }
        } else if (z) {
            directExecutor.getMin.onSuccessLoadMoreCategories(installpackage.getTotalCategory(), (List) directExecutor.length.apply(installpackage.getPromoCategories()));
        } else {
            directExecutor.getMin.onSuccessGetCategories(installpackage.getTotalCategory(), (List) directExecutor.length.apply(installpackage.getPromoCategories()));
        }
    }

    static /* synthetic */ void getMax(DirectExecutor directExecutor, boolean z) {
        if (!z) {
            directExecutor.getMin.onFailGetCategories();
        }
    }

    static /* synthetic */ void setMax(DirectExecutor directExecutor, boolean z) {
        if (z) {
            directExecutor.getMin.hideShimmerView();
        } else {
            directExecutor.getMin.dismissProgress();
        }
    }
}
