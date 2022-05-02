package o;

import android.location.Location;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import o.GriverRVResourceManagerImpl;
import o.WebViewType;
import o.ZoomRecyclerView;
import o.execute;
import o.getDefaultAsyncJsApiList;
import o.useSysWebWillCrash;

public final class getTags extends registerCallback implements execute.getMin {
    /* access modifiers changed from: private */
    public final onDoubleTap FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public Boolean Grayscale$Algorithm = Boolean.FALSE;
    /* access modifiers changed from: private */
    public final execute.setMax IsOverlapping;
    getDefaultAsyncJsApiList equals;
    @VisibleForTesting
    String getMax = null;
    @VisibleForTesting
    String getMin = null;
    private final ZoomRecyclerView.GestureListener hashCode;
    private GriverAppVirtualHostProxy invoke;
    private GriverRVResourceManagerImpl invokeSuspend = null;
    useSysWebWillCrash isInside;
    @VisibleForTesting
    String length = "";
    @VisibleForTesting
    int setMax = 1;
    @VisibleForTesting
    Location setMin = null;
    private GriverAppVirtualHostProxy<resourceTypeMonitor> toDoubleRange;
    WebViewType toFloatRange;
    WorkerApiConfig toIntRange;
    private GriverAppVirtualHostProxy<GriverRVResourceManagerImpl.AnonymousClass3> toString;
    /* access modifiers changed from: private */
    public Boolean valueOf = Boolean.FALSE;
    /* access modifiers changed from: private */
    public final onDoubleTapEvent values;

    @Inject
    getTags(execute.setMax setmax, ZoomRecyclerView.GestureListener gestureListener, onDoubleTap ondoubletap, onDoubleTapEvent ondoubletapevent) {
        this.IsOverlapping = setmax;
        this.hashCode = gestureListener;
        this.FastBitmap$CoordinateSystem = ondoubletap;
        this.values = ondoubletapevent;
    }

    public final void setMin(boolean z) {
        this.length = "";
        getMax(z, new ArrayList());
    }

    public final void setMax(String str, boolean z) {
        this.getMin = str;
        if (!z) {
            return;
        }
        if (!TextUtils.isEmpty(this.length)) {
            setMax(false);
            return;
        }
        this.length = "";
        getMax(false, new ArrayList());
    }

    public final void getMax(String str, boolean z, Location location) {
        this.getMax = str;
        this.setMin = location;
        if (z) {
            setMax(false);
        }
    }

    public final void setMin(boolean z, String str) {
        this.length = str;
        setMax(z);
    }

    public final void getMin(Location location) {
        this.setMin = location;
        if (this.invokeSuspend == null) {
            this.toIntRange.execute(onReceivedIcon.INSTANCE, new getNetwork(this), new getTriggeredContentUris(this));
        } else {
            getMin();
        }
    }

    public final void length() {
        getMin((Location) null);
    }

    private void getMin() {
        if (this.invokeSuspend.getEnable()) {
            int numberOfItemBatch = this.invokeSuspend.getNumberOfItemBatch();
            GriverAppVirtualHostProxy griverAppVirtualHostProxy = this.invoke;
            if (griverAppVirtualHostProxy != null) {
                griverAppVirtualHostProxy.dispose();
                this.invoke = null;
            }
            useSysWebWillCrash usesyswebwillcrash = this.isInside;
            if (this.invoke == null) {
                this.invoke = new GriverAppVirtualHostProxy<GriverRVResourceManagerImpl.AnonymousClass1>() {
                    public final /* synthetic */ void onNext(Object obj) {
                        getTags.this.IsOverlapping.dismissProgress();
                        execute.setMax min = getTags.this.IsOverlapping;
                        onDoubleTapEvent unused = getTags.this.values;
                        min.onGetPromoAdsSuccess(onDoubleTapEvent.getMax(((GriverRVResourceManagerImpl.AnonymousClass1) obj).getAdsList()));
                        getTags.this.valueOf = Boolean.TRUE;
                        getTags.setMax(getTags.this);
                    }

                    public final void onError(Throwable th) {
                        super.onError(th);
                        getTags.this.IsOverlapping.dismissProgress();
                        getTags.this.IsOverlapping.onGetPromoAdsError();
                        getTags.this.valueOf = Boolean.TRUE;
                        getTags.setMax(getTags.this);
                    }
                };
            }
            GriverAppVirtualHostProxy griverAppVirtualHostProxy2 = this.invoke;
            Location location = this.setMin;
            double d = 0.0d;
            double latitude = location != null ? location.getLatitude() : 0.0d;
            Location location2 = this.setMin;
            if (location2 != null) {
                d = location2.getLongitude();
            }
            usesyswebwillcrash.execute(griverAppVirtualHostProxy2, new useSysWebWillCrash.getMin(numberOfItemBatch, latitude, d));
            return;
        }
        this.IsOverlapping.onGetPromoAdsError();
    }

    private void setMax(final boolean z) {
        if (z) {
            this.setMax++;
        } else {
            this.setMax = 1;
            this.IsOverlapping.showProgress();
        }
        getMax();
        getDefaultAsyncJsApiList getdefaultasyncjsapilist = this.equals;
        if (this.toDoubleRange == null) {
            this.toDoubleRange = new GriverAppVirtualHostProxy<resourceTypeMonitor>() {
                public final /* synthetic */ void onNext(@NonNull Object obj) {
                    resourceTypeMonitor resourcetypemonitor = (resourceTypeMonitor) obj;
                    if (resourcetypemonitor.getPromoList() == null || resourcetypemonitor.getPromoList().isEmpty()) {
                        getTags.length(getTags.this, resourcetypemonitor, z);
                        return;
                    }
                    getTags gettags = getTags.this;
                    gettags.length((onScaleEnd) gettags.FastBitmap$CoordinateSystem.apply(resourcetypemonitor));
                }

                public final void onError(Throwable th) {
                    super.onError(th);
                    getTags.setMax(getTags.this, z);
                    updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.PROMO_CENTER_GET_CATEGORIZED_PROMO_PREFIX, DanaLogConstants.ExceptionType.PROMO_CENTER_EXCEPTION, th);
                }

                public final void onComplete() {
                    if (!z) {
                        getTags.this.IsOverlapping.dismissProgress();
                    }
                }
            };
        }
        GriverAppVirtualHostProxy<resourceTypeMonitor> griverAppVirtualHostProxy = this.toDoubleRange;
        int i = this.setMax;
        String str = this.length;
        String str2 = this.getMin;
        String str3 = this.getMax;
        Location location = this.setMin;
        double latitude = location != null ? location.getLatitude() : 0.0d;
        Location location2 = this.setMin;
        getdefaultasyncjsapilist.execute(griverAppVirtualHostProxy, getDefaultAsyncJsApiList.setMax.forGetPromoCategorizedList(10, i, str, str2, str3, latitude, location2 != null ? location2.getLongitude() : 0.0d));
    }

    public final void getMax(final boolean z, final List<GriverRVResourceManagerImpl.AnonymousClass2> list) {
        if (z) {
            this.setMax++;
        } else {
            this.setMax = 1;
            this.IsOverlapping.showProgress();
        }
        getMax();
        WebViewType webViewType = this.toFloatRange;
        AnonymousClass2 r1 = new GriverAppVirtualHostProxy<GriverRVResourceManagerImpl.AnonymousClass3>() {
            public final /* synthetic */ void onNext(@NonNull Object obj) {
                GriverRVResourceManagerImpl.AnonymousClass3 r3 = (GriverRVResourceManagerImpl.AnonymousClass3) obj;
                getTags.this.IsOverlapping.dismissProgress();
                List min = getTags.getMin((List) r3.getPromoList(), list);
                if (getTags.getMin(r3, (List<GriverRVResourceManagerImpl.AnonymousClass2>) min)) {
                    getTags.this.getMax(z, min);
                } else {
                    r3.setPromoList(min);
                    getTags.setMax(getTags.this, r3, z);
                }
                getTags.this.Grayscale$Algorithm = Boolean.TRUE;
                getTags.setMax(getTags.this);
            }

            public final void onError(Throwable th) {
                getTags.this.IsOverlapping.dismissProgress();
                super.onError(th);
                getTags.getMin(getTags.this, z);
                updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.PROMO_CENTER_GET_PROMO_LIST_PREFIX, DanaLogConstants.ExceptionType.PROMO_CENTER_EXCEPTION, th);
                getTags.this.Grayscale$Algorithm = Boolean.TRUE;
                getTags.setMax(getTags.this);
            }

            public final void onComplete() {
                if (!z) {
                    getTags.this.IsOverlapping.dismissProgress();
                }
            }
        };
        this.toString = r1;
        webViewType.execute(r1, WebViewType.length.forGetPromo(10, this.setMax, this.getMin));
    }

    public final void setMax() {
        this.toFloatRange.dispose();
        this.equals.dispose();
        this.toIntRange.dispose();
        this.isInside.dispose();
    }

    private static boolean getMin(List list) {
        return list.size() < 10;
    }

    /* access modifiers changed from: private */
    public static boolean getMin(GriverRVResourceManagerImpl.AnonymousClass3 r0, List<GriverRVResourceManagerImpl.AnonymousClass2> list) {
        return r0.isHasMore() && getMin((List) list);
    }

    /* access modifiers changed from: private */
    public void length(onScaleEnd onscaleend) {
        this.IsOverlapping.dismissProgress();
        if (this.setMax > 1) {
            this.IsOverlapping.onSuccessLoadMorePromo(onscaleend);
        } else {
            this.IsOverlapping.onSuccessGetPromoList(onscaleend);
        }
    }

    private void getMax() {
        GriverAppVirtualHostProxy<GriverRVResourceManagerImpl.AnonymousClass3> griverAppVirtualHostProxy = this.toString;
        if (griverAppVirtualHostProxy != null) {
            griverAppVirtualHostProxy.dispose();
            this.toString = null;
        }
        GriverAppVirtualHostProxy<resourceTypeMonitor> griverAppVirtualHostProxy2 = this.toDoubleRange;
        if (griverAppVirtualHostProxy2 != null) {
            griverAppVirtualHostProxy2.dispose();
            this.toDoubleRange = null;
        }
    }

    static /* synthetic */ void setMax(getTags gettags) {
        if (gettags.Grayscale$Algorithm.booleanValue() && gettags.valueOf.booleanValue()) {
            gettags.Grayscale$Algorithm = Boolean.FALSE;
            gettags.valueOf = Boolean.FALSE;
            gettags.IsOverlapping.onAllPromoSectionsCompleted();
        }
    }

    static /* synthetic */ List getMin(List list, List list2) {
        if (list != null) {
            list2.addAll(list);
        }
        return list2;
    }

    static /* synthetic */ void setMax(getTags gettags, GriverRVResourceManagerImpl.AnonymousClass3 r2, boolean z) {
        if (!r2.getPromoList().isEmpty()) {
            gettags.length((onScaleEnd) gettags.hashCode.apply(r2));
        } else if (z) {
            gettags.setMax--;
            gettags.IsOverlapping.onErrorLoadMorePromo(((onScaleEnd) gettags.hashCode.apply(r2)).setMax());
        } else {
            gettags.IsOverlapping.onEmptyGetPromoList();
        }
    }

    static /* synthetic */ void getMin(getTags gettags, boolean z) {
        if (z) {
            gettags.setMax--;
            gettags.IsOverlapping.onErrorLoadMorePromo(true);
            return;
        }
        gettags.IsOverlapping.onErrorGetPromo();
    }

    static /* synthetic */ void length(getTags gettags, resourceTypeMonitor resourcetypemonitor, boolean z) {
        if (z) {
            gettags.setMax--;
            gettags.IsOverlapping.onErrorLoadMorePromo(((onScaleEnd) gettags.FastBitmap$CoordinateSystem.apply(resourcetypemonitor)).setMax());
            return;
        }
        gettags.IsOverlapping.onEmptyGetPromoCategorized();
    }

    static /* synthetic */ void setMax(getTags gettags, boolean z) {
        if (z) {
            gettags.setMax--;
            gettags.IsOverlapping.onErrorLoadMorePromo(true);
            return;
        }
        gettags.IsOverlapping.onErrorGetPromoCategorized();
    }

    static /* synthetic */ Unit setMin(getTags gettags, GriverRVResourceManagerImpl griverRVResourceManagerImpl) {
        gettags.invokeSuspend = griverRVResourceManagerImpl;
        gettags.getMin();
        return null;
    }
}
