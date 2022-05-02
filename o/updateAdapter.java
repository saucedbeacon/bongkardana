package o;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.R;
import id.dana.data.base.NetworkException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.domain.foundation.logger.PerformanceConstant;
import id.dana.domain.merchant.MerchantCategoryType;
import id.dana.nearbyme.model.ShopModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AppInfoUtils;
import o.DeviceManifest;
import o.GriverProgressBar;
import o.H5Worker;
import o.TitleBarRightButtonView;
import o.a;
import o.g;
import o.getInstallThreadName;
import o.installPathValid;
import o.isEmbeddedApp;
import o.k;
import o.setGriverAppVirtualHostProxy;
import o.setTextSpacing;
import o.transferApPathToLocalPath;

public final class updateAdapter implements setTextSpacing.setMin, GriverProgressBar.UpdateRunnable {
    private final isEmbeddedApp FastBitmap$CoordinateSystem;
    private final deletePreDownloadFileByAppId Grayscale$Algorithm;
    private final AppInfoUtils.AnonymousClass2 ICustomTabsCallback;
    private GriverProgressBar.UpdateRunnable ICustomTabsCallback$Default;
    private int ICustomTabsCallback$Stub = 0;
    private IRedDotManager ICustomTabsCallback$Stub$Proxy;
    /* access modifiers changed from: private */
    public H5Worker.RenderReadyListener ICustomTabsService;
    private final GriverRVKVStorageProxyImpl IsOverlapping;
    private final getInstallThreadName Mean$Arithmetic;
    /* access modifiers changed from: private */
    public Location asBinder;
    /* access modifiers changed from: private */
    public int asInterface = 0;
    /* access modifiers changed from: private */
    public final IComponent<List<ShopModel>> b = IComponent.setMax();
    /* access modifiers changed from: private */
    public final fetchAppList create;
    private final getPluginState equals;
    /* access modifiers changed from: private */
    public final setTextSpacing.getMin extraCallback;
    private int extraCallbackWithResult = 0;
    private final IComponent<Location> getCause = IComponent.setMax();
    /* access modifiers changed from: private */
    public List<ShopModel> getDefaultImpl = new ArrayList();
    /* access modifiers changed from: private */
    public List<ShopModel> getInterfaceDescriptor = new ArrayList();
    @VisibleForTesting
    a.C0056a getMax;
    @VisibleForTesting
    String getMin = "";
    private final getAllInstallFiles hashCode;
    private final IComponent<List<g.AnonymousClass1>> invoke = IComponent.setMax();
    private final setGriverAppVirtualHostProxy invokeSuspend;
    private final AppStatus isInside;
    @VisibleForTesting
    boolean length;
    private boolean mayLaunchUrl = false;
    /* access modifiers changed from: private */
    public boolean onMessageChannelReady;
    /* access modifiers changed from: private */
    public final setUserId onNavigationEvent;
    /* access modifiers changed from: private */
    public final DeviceManifest.AnonymousClass2 onPostMessage;
    private final IComponent<List<g.AnonymousClass1>> onRelationshipValidationResult = IComponent.setMax();
    private GriverAppVirtualHostProxy<H5FileUtil> onTransact;
    private int setDefaultImpl = 1;
    String setMax;
    @VisibleForTesting
    int setMin = 0;
    private final getLocalPathFromId toDoubleRange;
    private final IRedDotManager toFloatRange;
    /* access modifiers changed from: private */
    public final Context toIntRange;
    private final transferApPathToLocalPath toString;
    private final IComponent<List<g.AnonymousClass1>> valueOf = IComponent.setMax();
    private final installPathValid values;
    private boolean warmup = false;

    static /* synthetic */ TitleBarRightButtonView.AnonymousClass4 getMax(TitleBarRightButtonView.AnonymousClass1 r0) {
        return r0;
    }

    static /* synthetic */ TitleBarRightButtonView.AnonymousClass4 setMin(TitleBarRightButtonView.AnonymousClass1 r0) {
        return r0;
    }

    static /* synthetic */ int IsOverlapping(updateAdapter updateadapter) {
        int i = updateadapter.setDefaultImpl;
        updateadapter.setDefaultImpl = i + 1;
        return i;
    }

    @Inject
    public updateAdapter(Context context, getPluginState getpluginstate, installPathValid installpathvalid, setGriverAppVirtualHostProxy setgriverappvirtualhostproxy, setTextSpacing.getMin getmin, fetchAppList fetchapplist, getInstallThreadName getinstallthreadname, getLocalPathFromId getlocalpathfromid, isEmbeddedApp isembeddedapp, setUserId setuserid, deletePreDownloadFileByAppId deletepredownloadfilebyappid, transferApPathToLocalPath transferappathtolocalpath, AppInfoUtils.AnonymousClass2 r16, GriverRVKVStorageProxyImpl griverRVKVStorageProxyImpl, AppStatus appStatus, getAllInstallFiles getallinstallfiles, DeviceManifest.AnonymousClass2 r20) {
        this.invokeSuspend = setgriverappvirtualhostproxy;
        this.equals = getpluginstate;
        this.values = installpathvalid;
        this.extraCallback = getmin;
        this.create = fetchapplist;
        this.toIntRange = context;
        this.Mean$Arithmetic = getinstallthreadname;
        this.toDoubleRange = getlocalpathfromid;
        this.FastBitmap$CoordinateSystem = isembeddedapp;
        this.toString = transferappathtolocalpath;
        this.onNavigationEvent = setuserid;
        this.Grayscale$Algorithm = deletepredownloadfilebyappid;
        this.ICustomTabsCallback = r16;
        this.IsOverlapping = griverRVKVStorageProxyImpl;
        this.isInside = appStatus;
        this.hashCode = getallinstallfiles;
        this.onPostMessage = r20;
        this.toFloatRange = new IRedDotManager();
    }

    public final void setMax() {
        dispose();
    }

    public final void dispose() {
        if (!isDisposed()) {
            this.toFloatRange.dispose();
        }
        GriverAppVirtualHostProxy<H5FileUtil> griverAppVirtualHostProxy = this.onTransact;
        if (griverAppVirtualHostProxy != null) {
            griverAppVirtualHostProxy.dispose();
            this.onTransact = null;
        }
        this.equals.dispose();
        this.values.dispose();
        this.invokeSuspend.dispose();
        this.Mean$Arithmetic.dispose();
        this.toDoubleRange.dispose();
        this.FastBitmap$CoordinateSystem.dispose();
        this.ICustomTabsCallback.dispose();
        this.Grayscale$Algorithm.dispose();
        this.toString.dispose();
        this.IsOverlapping.dispose();
        this.isInside.dispose();
        GriverProgressBar.UpdateRunnable updateRunnable = this.ICustomTabsCallback$Default;
        if (updateRunnable != null) {
            updateRunnable.dispose();
        }
        this.hashCode.dispose();
    }

    public final boolean isDisposed() {
        return this.toFloatRange.isDisposed();
    }

    public final String getMax() {
        return this.setMax;
    }

    public final void length(String str) {
        this.setMax = str;
    }

    public final void getMin() {
        this.equals.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(@NonNull Object obj) {
                Boolean bool = (Boolean) obj;
                updateAdapter.this.extraCallback.getMax(bool.booleanValue());
                if (bool.booleanValue()) {
                    updateAdapter.this.hashCode.execute(onReceivedIcon.INSTANCE, new getTextSpacing(updateAdapter.this), setNonPrimaryAlpha.getMin);
                }
            }
        });
    }

    public final void getMin(Location location) {
        this.invokeSuspend.execute(new GriverAppVirtualHostProxy<H5FileUtil>() {
            public final /* synthetic */ void onNext(@NonNull Object obj) {
                updateAdapter.this.create.setMin = false;
                updateAdapter updateadapter = updateAdapter.this;
                updateadapter.getMax = (a.C0056a) updateadapter.create.apply((H5FileUtil) obj);
                a.C0056a aVar = updateAdapter.this.getMax;
                updateAdapter updateadapter2 = updateAdapter.this;
                List<ShopModel> list = updateadapter2.getMax.getMax;
                if (list != null) {
                    Collections.sort(list, new getClientWidth(updateadapter2));
                }
                aVar.getMax = k.AnonymousClass2.setMax(list, updateAdapter.this.setMin);
                updateAdapter.this.setMin += updateAdapter.this.getMax.getMax.size();
                if (updateAdapter.this.getMax.getMin()) {
                    updateAdapter.IsOverlapping(updateAdapter.this);
                }
                updateAdapter.this.getInterfaceDescriptor.addAll(updateAdapter.this.getMax.getMax);
                updateAdapter.this.b.onNext(updateAdapter.this.getMax.getMax);
                updateAdapter.this.extraCallback.getMin(updateAdapter.this.getMax.getMax);
            }

            public final void onError(Throwable th) {
                updateAdapter.this.extraCallback.setMin(new ArrayList(), false);
            }
        }, new setGriverAppVirtualHostProxy.length(location.getLatitude(), location.getLongitude(), this.setDefaultImpl, 20, this.getMin, this.onMessageChannelReady, FirebaseAnalytics.Event.SEARCH));
    }

    public final void setMax(Location location, int i, boolean z) {
        if (!this.length) {
            this.extraCallback.showProgress();
        }
        GriverAppVirtualHostProxy<H5FileUtil> griverAppVirtualHostProxy = this.onTransact;
        if (griverAppVirtualHostProxy != null) {
            griverAppVirtualHostProxy.dispose();
            this.onTransact = null;
        }
        getInstallThreadName getinstallthreadname = this.Mean$Arithmetic;
        if (this.onTransact == null) {
            this.onTransact = new GriverAppVirtualHostProxy<H5FileUtil>() {
                public final /* synthetic */ void onNext(@NonNull Object obj) {
                    H5FileUtil h5FileUtil = (H5FileUtil) obj;
                    updateAdapter.this.create.setMin = updateAdapter.this.onMessageChannelReady;
                    updateAdapter.this.extraCallback.dismissProgress();
                    updateAdapter.length(updateAdapter.this, h5FileUtil);
                    a.C0056a aVar = (a.C0056a) updateAdapter.this.create.apply(h5FileUtil);
                    updateAdapter updateadapter = updateAdapter.this;
                    List<ShopModel> list = aVar.getMax;
                    if (updateadapter.setMax != null) {
                        Collections.sort(list, setCurrentItemInternal.getMax);
                    } else if (list != null) {
                        Collections.sort(list, new getClientWidth(updateadapter));
                    }
                    if (!updateAdapter.this.length) {
                        updateAdapter.this.getDefaultImpl.clear();
                    }
                    updateAdapter.this.getDefaultImpl.addAll(list);
                    updateAdapter.this.getMax = aVar;
                    updateAdapter.this.length = false;
                    updateAdapter.this.b.onNext(list);
                    updateAdapter.this.extraCallback.getMin(list);
                }

                public final void onError(Throwable th) {
                    String str;
                    super.onError(th);
                    updateAdapter.this.extraCallback.dismissProgress();
                    int unused = updateAdapter.this.asInterface = 0;
                    setTextSpacing.getMin max = updateAdapter.this.extraCallback;
                    Context isInside = updateAdapter.this.toIntRange;
                    if (th instanceof NetworkException) {
                        str = ((NetworkException) th).getMessage();
                    } else {
                        str = isInside.getString(R.string.general_error_msg);
                    }
                    max.onError(str);
                    setTextSpacing.getMin unused2 = updateAdapter.this.extraCallback;
                }
            };
        }
        getinstallthreadname.execute(this.onTransact, new getInstallThreadName.setMin(location, i, this.setDefaultImpl, 20, z, this.onMessageChannelReady, "", ""));
    }

    public final void setMin(Location location, int i) {
        H5Worker.RenderReadyListener renderReadyListener = this.ICustomTabsService;
        if (renderReadyListener == null || !renderReadyListener.getMin()) {
            setMax(location, i, false);
        } else {
            this.getCause.onNext(location);
        }
    }

    public final void getMax(List<g.AnonymousClass1> list) {
        this.onRelationshipValidationResult.onNext(list);
    }

    public final List<ShopModel> length(List<ShopModel> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (ShopModel next : list) {
            if (next.Grayscale$Algorithm.equals(str)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final void length() {
        this.ICustomTabsCallback.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final void onError(Throwable th) {
                StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.SAVE_SHOW_TOOLTIP_PREFIX);
                sb.append(getClass().getName());
                sb.append("on Error");
                updateActionSheetContent.e("Nearby", sb.toString(), th);
            }
        }, onReceivedIcon.INSTANCE);
    }

    public final void setMin() {
        this.extraCallback.showProgress();
        this.Grayscale$Algorithm.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(@NonNull Object obj) {
                updateAdapter.this.extraCallback.dismissProgress();
                updateAdapter.this.extraCallback.setMin(((Boolean) obj).booleanValue());
            }

            public final void onError(Throwable th) {
                updateAdapter.this.extraCallback.dismissProgress();
                updateAdapter.this.extraCallback.setMin(false);
                StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.IS_NEED_TO_SHOW_TOOLTIP_PREFIX);
                sb.append(getClass().getName());
                sb.append("on Error");
                updateActionSheetContent.e("Nearby", sb.toString(), th);
            }
        }, onReceivedIcon.INSTANCE);
    }

    public final List<ShopModel> getMin(List<ShopModel> list) {
        if (list != null) {
            Collections.sort(list, new getClientWidth(this));
        }
        return list;
    }

    public final void setMax(List<ShopModel> list) {
        Collections.sort(list, setCurrentItemInternal.getMax);
    }

    public final void getMax(Location location) {
        this.toString.execute(new GriverAppVirtualHostProxy<String>() {
            public final /* synthetic */ void onNext(@NonNull Object obj) {
                updateAdapter.this.extraCallback.getMax((String) obj);
            }

            public final void onError(Throwable th) {
                super.onError(th);
                StringBuilder sb = new StringBuilder("onError: ");
                sb.append(th.getMessage());
                updateActionSheetContent.e("Nearby", sb.toString());
            }
        }, new transferApPathToLocalPath.setMax(location));
    }

    public final void toIntRange() {
        this.IsOverlapping.execute(new GriverAppVirtualHostProxy<getCacheDir>() {
            public final /* synthetic */ void onNext(@NonNull Object obj) {
                getCacheDir getcachedir = (getCacheDir) obj;
                updateAdapter updateadapter = updateAdapter.this;
                H5Worker.RenderReadyListener.getMax getmax = H5Worker.RenderReadyListener.getMax;
                Intrinsics.checkNotNullParameter(getcachedir, "config");
                H5Worker.RenderReadyListener unused = updateadapter.ICustomTabsService = new H5Worker.RenderReadyListener(getcachedir.getEnabled(), getcachedir.getInterval(), getcachedir.getThreshold());
                updateAdapter updateadapter2 = updateAdapter.this;
                updateAdapter.setMin(updateadapter2, updateadapter2.ICustomTabsService);
            }

            public final void onError(Throwable th) {
                super.onError(th);
                updateActionSheetContent.e(DanaLogConstants.ExceptionType.NEARBY_EXCEPTION, th.getMessage(), th);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean getMin(H5Worker.RenderReadyListener renderReadyListener, Location location) throws Exception {
        Location location2 = this.asBinder;
        if (location2 == null) {
            return true;
        }
        double distanceTo = (double) location2.distanceTo(location);
        Double.isNaN(distanceTo);
        return (distanceTo / 1000.0d) * 1000.0d >= ((double) renderReadyListener.setMax);
    }

    public final void equals() {
        this.isInside.execute(new GriverAppVirtualHostProxy<GriverCommonResourceProxy>() {
            public final /* synthetic */ void onNext(Object obj) {
                updateAdapter.this.extraCallback.setMin((GriverCommonResourceProxy) obj);
            }
        });
    }

    public final void toFloatRange() {
        IComponent<List<g.AnonymousClass1>> iComponent = this.invoke;
        ArrayList arrayList = new ArrayList();
        arrayList.add(g.AnonymousClass1.setMin);
        GriverProgressBar.UpdateRunnable subscribe = TitleBarRightButtonView.AnonymousClass1.combineLatest(iComponent.startWith(arrayList), this.valueOf.startWith(new ArrayList()), this.b, new removeOnPageChangeListener(this)).subscribeOn(getSecureSignatureComp.setMin()).flatMap(clearOnPageChangeListeners.length).flatMap(new addOnAdapterChangeListener(this)).observeOn(hideProgress.length()).subscribe(new ViewPager(this));
        if (subscribe != null) {
            this.toFloatRange.getMin(subscribe);
        }
    }

    public final void setMin(List<g.AnonymousClass1> list, MerchantCategoryType merchantCategoryType) {
        this.setMin = 0;
        this.warmup = true;
        if (merchantCategoryType == MerchantCategoryType.LIST) {
            this.valueOf.onNext(list);
        } else {
            this.invoke.onNext(list);
        }
    }

    public final void setMin(boolean z) {
        this.onMessageChannelReady = z;
        this.onPostMessage.setMin = z;
        this.values.execute(new GriverAppVirtualHostProxy<clearTempPath>() {
            public final /* synthetic */ void onNext(@NonNull Object obj) {
                clearTempPath cleartemppath = (clearTempPath) obj;
                DeviceManifest.AnonymousClass2 min = updateAdapter.this.onPostMessage;
                Integer radius = cleartemppath.getRadius();
                Integer valueOf = Integer.valueOf(cleartemppath.getRating());
                Integer valueOf2 = Integer.valueOf(cleartemppath.getReview());
                if (radius != null) {
                    double intValue = (double) radius.intValue();
                    Double.isNaN(intValue);
                    min.getMax = intValue / 100.0d;
                }
                if (valueOf != null) {
                    double intValue2 = (double) valueOf.intValue();
                    Double.isNaN(intValue2);
                    min.length = intValue2 / 100.0d;
                }
                if (valueOf2 != null) {
                    double intValue3 = (double) valueOf2.intValue();
                    Double.isNaN(intValue3);
                    min.getMin = intValue3 / 100.0d;
                }
            }

            public final void onError(Throwable th) {
                StringBuilder sb = new StringBuilder("onError: ");
                sb.append(th.getMessage());
                updateActionSheetContent.e("Nearby", sb.toString());
            }
        }, new installPathValid.length(z));
    }

    public final void getMin(String str) {
        this.setDefaultImpl = 2;
        this.getMin = str;
    }

    public final boolean isInside() {
        a.C0056a aVar = this.getMax;
        if (aVar == null) {
            return false;
        }
        return aVar.getMin();
    }

    public final void getMax(boolean z) {
        this.getMax.length = z;
    }

    public final void setMin(Location location) {
        if (!isInside() || this.getDefaultImpl.size() > 100) {
            this.getMax.length = false;
            return;
        }
        this.setDefaultImpl++;
        this.length = true;
        setMax(location, 5000, false);
    }

    public final void IsOverlapping() {
        this.setDefaultImpl = 1;
        this.length = false;
        this.mayLaunchUrl = false;
        this.warmup = false;
        this.setMin = 0;
        this.getMax = null;
        this.getInterfaceDescriptor.clear();
        this.getDefaultImpl.clear();
    }

    public final void setMin(a.C0056a aVar) {
        this.mayLaunchUrl = true;
        this.getMax = aVar;
        this.setMin = aVar.getMax.size();
        this.getInterfaceDescriptor.clear();
        this.getInterfaceDescriptor.addAll(aVar.getMax);
    }

    public final int values() {
        return this.setDefaultImpl;
    }

    private static boolean length(List<ShopModel> list) {
        return list.size() % 5 > 0;
    }

    /* access modifiers changed from: private */
    @VisibleForTesting
    public static boolean getMin(ShopModel shopModel, String str) {
        if (!TextUtils.isEmpty(str)) {
            return !TextUtils.isEmpty(shopModel.invoke) && shopModel.invoke.toLowerCase().contains(str);
        }
        return true;
    }

    /* access modifiers changed from: private */
    @VisibleForTesting
    public static boolean setMin(ShopModel shopModel, List<g.AnonymousClass1> list) {
        if (list.contains(g.AnonymousClass1.setMin)) {
            return true;
        }
        return shopModel.setMax(list);
    }

    public final void setMax(Location location) {
        if (this.asInterface == 0) {
            this.extraCallback.showProgress();
        }
        this.invokeSuspend.execute(new GriverAppVirtualHostProxy<H5FileUtil>() {
            public final /* synthetic */ void onNext(@NonNull Object obj) {
                H5FileUtil h5FileUtil = (H5FileUtil) obj;
                updateAdapter.this.create.setMin = false;
                updateAdapter.this.extraCallback.dismissProgress();
                if (h5FileUtil.getShops() != null) {
                    updateAdapter.this.extraCallback.getMin((a.C0056a) updateAdapter.this.create.apply(h5FileUtil));
                }
                updateAdapter.length(updateAdapter.this, h5FileUtil);
            }

            public final void onError(Throwable th) {
                String str;
                super.onError(th);
                updateAdapter.this.extraCallback.dismissProgress();
                int unused = updateAdapter.this.asInterface = 0;
                setTextSpacing.getMin max = updateAdapter.this.extraCallback;
                Context isInside = updateAdapter.this.toIntRange;
                if (th instanceof NetworkException) {
                    str = ((NetworkException) th).getMessage();
                } else {
                    str = isInside.getString(R.string.general_error_msg);
                }
                max.onError(str);
            }
        }, new setGriverAppVirtualHostProxy.length(location.getLatitude(), location.getLongitude(), 1, 7, "", this.onMessageChannelReady, PerformanceConstant.PAGE_HOME));
    }

    public final void getMin(TitleBarRightButtonView.AnonymousClass1<String> r4) {
        IComponent<List<g.AnonymousClass1>> iComponent = this.onRelationshipValidationResult;
        ArrayList arrayList = new ArrayList();
        arrayList.add(g.AnonymousClass1.setMin);
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = TitleBarRightButtonView.AnonymousClass1.combineLatest(r4, iComponent.startWith(arrayList), this.b, new removeOnAdapterChangeListener(this)).subscribeOn(getSecureSignatureComp.setMin()).observeOn(hideProgress.length()).flatMap(removeNonDecorViews.setMin);
        setTextSpacing.getMin getmin = this.extraCallback;
        Objects.requireNonNull(getmin);
        GriverProgressBar.UpdateRunnable subscribe = flatMap.subscribe((RedDotManager<? super R>) new initViewPager(getmin));
        if (subscribe != null) {
            this.toFloatRange.getMin(subscribe);
        }
    }

    public final void setMin(final List<ShopModel> list) {
        int i;
        IRedDotManager iRedDotManager = this.ICustomTabsCallback$Stub$Proxy;
        if (iRedDotManager != null) {
            iRedDotManager.dispose();
            this.ICustomTabsCallback$Stub$Proxy = null;
        }
        int i2 = 0;
        this.extraCallbackWithResult = 0;
        this.ICustomTabsCallback$Stub = 0;
        while (true) {
            if (length(list)) {
                i = list.size() / 5;
            } else {
                i = (list.size() / 5) - 1;
            }
            if (i2 <= i) {
                int i3 = this.extraCallbackWithResult + 5;
                this.ICustomTabsCallback$Stub = i3;
                List<ShopModel> subList = list.subList(this.extraCallbackWithResult, Math.min(i3, list.size()));
                this.extraCallbackWithResult = this.ICustomTabsCallback$Stub;
                ArrayList arrayList = new ArrayList();
                for (ShopModel next : subList) {
                    arrayList.add(new getUtdidEncrypt(next.Grayscale$Algorithm, next.b));
                }
                AnonymousClass1 r1 = new GriverAppVirtualHostProxy<List<getTempPath>>() {
                    public final /* synthetic */ void onNext(@NonNull Object obj) {
                        updateAdapter.this.extraCallback.getMax(updateAdapter.this.onNavigationEvent.setMax(list, (List) obj));
                    }

                    public final void onError(Throwable th) {
                        super.onError(th);
                        updateActionSheetContent.logNetworkException(DanaLogConstants.ExceptionType.NEARBY_EXCEPTION, DanaLogConstants.Prefix.GET_NEARBY_PROMO, th);
                    }
                };
                this.FastBitmap$CoordinateSystem.execute(r1, new isEmbeddedApp.getMax(arrayList));
                if (this.ICustomTabsCallback$Stub$Proxy == null) {
                    this.ICustomTabsCallback$Stub$Proxy = new IRedDotManager();
                }
                this.ICustomTabsCallback$Stub$Proxy.getMin(r1);
                i2++;
            } else {
                return;
            }
        }
    }

    static /* synthetic */ void length(updateAdapter updateadapter, H5FileUtil h5FileUtil) {
        if (h5FileUtil.getShops() != null) {
            updateadapter.asInterface = h5FileUtil.getShops().size();
        } else {
            updateadapter.asInterface = 0;
        }
    }

    static /* synthetic */ void setMin(updateAdapter updateadapter, H5Worker.RenderReadyListener renderReadyListener) {
        if (renderReadyListener.getMin()) {
            updateadapter.toFloatRange.getMin(updateadapter.getCause.debounce((long) renderReadyListener.length, TimeUnit.MILLISECONDS).filter(new addOnPageChangeListener(updateadapter, renderReadyListener)).map(new setPageTransformer(updateadapter)).observeOn(hideProgress.length()).subscribe(new setOnPageChangeListener(updateadapter)));
        }
    }

    static /* synthetic */ TitleBarRightButtonView.AnonymousClass4 length(updateAdapter updateadapter, List list) {
        int i = updateadapter.setMin;
        Intrinsics.checkNotNullParameter(list, "$this$toRankedShopModelsObservable");
        TitleBarRightButtonView.AnonymousClass1 fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new k.AnonymousClass2.getMin(list, i));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …opModel(lastRankedShop) }");
        return fromCallable;
    }

    static /* synthetic */ void getMax(updateAdapter updateadapter, List list) {
        updateadapter.setMin += list.size();
        updateadapter.warmup = false;
        if (updateadapter.mayLaunchUrl) {
            updateadapter.extraCallback.setMin(list, updateadapter.getMax.getMin());
        } else {
            updateadapter.extraCallback.length(list);
        }
    }

    static /* synthetic */ Unit setMax(updateAdapter updateadapter, clearExpired clearexpired) {
        updateadapter.onPostMessage.setMin = clearexpired.getNearbyRevamp();
        updateadapter.extraCallback.getMin(clearexpired.getNearbyRevamp());
        return Unit.INSTANCE;
    }

    static /* synthetic */ void getMax(updateAdapter updateadapter, Location location) {
        updateadapter.IsOverlapping();
        updateadapter.setMax(location, updateadapter.onMessageChannelReady ? 5000 : 3000, false);
    }

    static /* synthetic */ TitleBarRightButtonView.AnonymousClass1 getMax(updateAdapter updateadapter, List list, List list2, List<ShopModel> list3) {
        if (updateadapter.mayLaunchUrl) {
            if (updateadapter.warmup) {
                list3 = updateadapter.getInterfaceDescriptor;
            }
        } else if (updateadapter.warmup) {
            list3 = updateadapter.getDefaultImpl;
        }
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<List<T>> list4 = TitleBarRightButtonView.AnonymousClass1.fromIterable(list3).filter(new setCurrentItem(list2, list)).toList();
        if (list4 instanceof getSecondFloorView) {
            return ((getSecondFloorView) list4).setMax();
        }
        setTitleLoading settitleloading = new setTitleLoading(list4);
        RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
        return redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
    }

    static /* synthetic */ TitleBarRightButtonView.AnonymousClass1 setMin(updateAdapter updateadapter, String str, List list, List list2) {
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 list3 = TitleBarRightButtonView.AnonymousClass1.fromIterable(list2).filter(new scrollToItem(updateadapter, str)).filter(new getCurrentItem(updateadapter, list)).toList();
        if (list3 instanceof getSecondFloorView) {
            return ((getSecondFloorView) list3).setMax();
        }
        setTitleLoading settitleloading = new setTitleLoading(list3);
        RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
        return redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
    }
}
