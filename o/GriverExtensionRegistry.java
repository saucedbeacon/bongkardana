package o;

import android.content.Context;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import id.dana.tracker.TrackerKey;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.ConfirmPopup;
import o.GriverBridgeManifest;
import o.convertDipToPx;
import o.isOverride;
import o.setMenus;
import org.jetbrains.annotations.NotNull;

@PerActivity
public class GriverExtensionRegistry implements GriverBridgeManifest.getMin {
    public static final String length = GriverExtensionRegistry.class.getSimpleName();
    private GriverAppVirtualHostProxy<GriverAMCSLiteAppUpdater> FastBitmap$CoordinateSystem;
    private final setReset IsOverlapping;
    private final setOverride equals;
    /* access modifiers changed from: private */
    public final getSharedPreferenceForApp getMax;
    private final setMinimumLogicalFontSize getMin;
    private final Context hashCode;
    private final isOverride isInside;
    /* access modifiers changed from: private */
    public final GriverBridgeManifest.setMax setMax;
    private final savePassword setMin;
    private final GriverAppUpdater toFloatRange;
    private final setMenus toIntRange;
    private GriverAppVirtualHostProxy<getPageUrl> toString;

    @Inject
    public GriverExtensionRegistry(savePassword savepassword, GriverBridgeManifest.setMax setmax, GriverAppUpdater griverAppUpdater, setMinimumLogicalFontSize setminimumlogicalfontsize, getSharedPreferenceForApp getsharedpreferenceforapp, isOverride isoverride, setReset setreset, setOverride setoverride, setMenus setmenus, Context context) {
        this.setMin = savepassword;
        this.setMax = setmax;
        this.toFloatRange = griverAppUpdater;
        this.getMin = setminimumlogicalfontsize;
        this.getMax = getsharedpreferenceforapp;
        this.isInside = isoverride;
        this.IsOverlapping = setreset;
        this.equals = setoverride;
        this.toIntRange = setmenus;
        this.hashCode = context;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int length(getIcontype geticontype, getIcontype geticontype2) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(geticontype.getGmtCreate()).compareTo(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(geticontype2.getGmtCreate()));
        } catch (ParseException e) {
            updateActionSheetContent.e(length, e.getMessage());
            return -1;
        }
    }

    private static ArrayList<getIcontype> setMin(List<? extends getIcontype> list) {
        String widgetType;
        ArrayList<getIcontype> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        for (getIcontype geticontype : list) {
            if (!getMin(geticontype.getExpirationDate()) && (widgetType = geticontype.getWidgetType()) != null) {
                if (widgetType.equalsIgnoreCase("PRE")) {
                    arrayList.add(geticontype);
                } else if (widgetType.equalsIgnoreCase("POST")) {
                    arrayList2.add(geticontype);
                }
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public void setMax() {
        this.toFloatRange.dispose();
        this.getMin.dispose();
        this.isInside.dispose();
        this.setMin.dispose();
    }

    public final void getMin() {
        GriverAppVirtualHostProxy<getPageUrl> griverAppVirtualHostProxy = this.toString;
        if (griverAppVirtualHostProxy != null) {
            griverAppVirtualHostProxy.dispose();
            this.toString = null;
        }
        savePassword savepassword = this.setMin;
        if (this.toString == null) {
            this.toString = new GriverAppVirtualHostProxy<getPageUrl>() {
                public final /* synthetic */ void onNext(@NotNull Object obj) {
                    GriverExtensionRegistry.this.setMax.onFinishGetPromoCenterConfig((getPageUrl) obj);
                }
            };
        }
        savepassword.execute(this.toString);
    }

    public final void setMin() {
        this.getMin.execute(null, new GriverEmptyMonitor(this), new GriverIAPCommonMonitor(this));
    }

    private void getMax() {
        GriverAppVirtualHostProxy<GriverAMCSLiteAppUpdater> griverAppVirtualHostProxy = this.FastBitmap$CoordinateSystem;
        if (griverAppVirtualHostProxy != null) {
            griverAppVirtualHostProxy.dispose();
            this.FastBitmap$CoordinateSystem = null;
        }
        GriverAppUpdater griverAppUpdater = this.toFloatRange;
        if (this.FastBitmap$CoordinateSystem == null) {
            this.FastBitmap$CoordinateSystem = new GriverAppVirtualHostProxy<GriverAMCSLiteAppUpdater>((List) null) {
                public final /* synthetic */ void onNext(@NotNull Object obj) {
                    LoadingBridgeExtension loadingBridgeExtension = (LoadingBridgeExtension) GriverExtensionRegistry.this.getMax.apply((GriverAMCSLiteAppUpdater) obj);
                    if (!(loadingBridgeExtension.setMin == null || loadingBridgeExtension.setMin.isEmpty() || r0 == null)) {
                        ArrayList arrayList = new ArrayList(r0);
                        arrayList.addAll(loadingBridgeExtension.setMin);
                        loadingBridgeExtension.setMin = arrayList;
                    }
                    GriverExtensionRegistry.this.setMax.onGetPromoCentreBannerSuccess(loadingBridgeExtension);
                }

                public final void onError(Throwable th) {
                    super.onError(th);
                    GriverExtensionRegistry.this.setMax.onError(th.getMessage());
                    StringBuilder sb = new StringBuilder("onError: ");
                    sb.append(th.getMessage());
                    updateActionSheetContent.e(DanaLogConstants.TAG.PROMO_CENTER_BANNER, sb.toString());
                }
            };
        }
        griverAppUpdater.execute(this.FastBitmap$CoordinateSystem);
    }

    private static boolean getMin(String str) {
        return ConfirmPopup.AnonymousClass1.getMax(str, "yyyy-MM-dd HH:mm:ss", Locale.getDefault());
    }

    static /* synthetic */ Unit setMin(GriverExtensionRegistry griverExtensionRegistry, Throwable th) {
        griverExtensionRegistry.getMax();
        updateActionSheetContent.e(length, th.getMessage());
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit getMin(GriverExtensionRegistry griverExtensionRegistry, List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            getIcontype geticontype = (getIcontype) it.next();
            boolean z = true;
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(geticontype.getId())) {
                    z = false;
                }
            }
            if (z) {
                String id2 = geticontype.getId();
                convertDipToPx.length length2 = new convertDipToPx.length(griverExtensionRegistry.hashCode);
                length2.getMax = TrackerKey.Event.ANNOUNCEMENT_WIDGET_SHOW;
                length2.setMin();
                convertDipToPx convertdiptopx = new convertDipToPx(length2, (byte) 0);
                List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
                genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
                griverExtensionRegistry.toIntRange.execute(new setMenus.getMax(id2), GriverLifeCycleMonitorExtension.setMax, pageEnd.getMax);
            }
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit length(GriverExtensionRegistry griverExtensionRegistry, List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new Comparator(griverExtensionRegistry) {
            private final GriverExtensionRegistry getMin;

            {
                this.getMin = r1;
            }

            public final int compare(Object obj, Object obj2) {
                return GriverExtensionRegistry.length((getIcontype) obj, (getIcontype) obj2);
            }
        });
        ArrayList<getIcontype> min = setMin(arrayList);
        griverExtensionRegistry.IsOverlapping.execute(onReceivedIcon.INSTANCE, new GriverIAPLogMonitor(griverExtensionRegistry, min), new getPathFromUrl(griverExtensionRegistry));
        griverExtensionRegistry.equals.execute(onReceivedIcon.INSTANCE, new GriverIAPLiteMonitor(griverExtensionRegistry, min), getSpmId.getMin);
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit length(GriverExtensionRegistry griverExtensionRegistry, Throwable th) {
        griverExtensionRegistry.getMax();
        updateActionSheetContent.e(length, th.getMessage());
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit length(GriverExtensionRegistry griverExtensionRegistry, Boolean bool) {
        if (bool.booleanValue()) {
            HashMap hashMap = new HashMap();
            hashMap.put("widgetTypes", "PRE,POST");
            griverExtensionRegistry.isInside.execute(new isOverride.getMin("", hashMap), new Function1(griverExtensionRegistry) {
                private final GriverExtensionRegistry length;

                {
                    this.length = r1;
                }

                public final Object invoke(Object obj) {
                    return GriverExtensionRegistry.length(this.length, (List) obj);
                }
            }, new GriverACCommonMonitor(griverExtensionRegistry));
        } else {
            griverExtensionRegistry.getMax();
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit setMax(GriverExtensionRegistry griverExtensionRegistry, List list, List list2) {
        final ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            getIcontype geticontype = (getIcontype) it.next();
            if (!list2.contains(geticontype.getId())) {
                arrayList.add(isUpdated.setMax(geticontype));
                break;
            }
        }
        GriverAppVirtualHostProxy<GriverAMCSLiteAppUpdater> griverAppVirtualHostProxy = griverExtensionRegistry.FastBitmap$CoordinateSystem;
        if (griverAppVirtualHostProxy != null) {
            griverAppVirtualHostProxy.dispose();
            griverExtensionRegistry.FastBitmap$CoordinateSystem = null;
        }
        GriverAppUpdater griverAppUpdater = griverExtensionRegistry.toFloatRange;
        if (griverExtensionRegistry.FastBitmap$CoordinateSystem == null) {
            griverExtensionRegistry.FastBitmap$CoordinateSystem = new GriverAppVirtualHostProxy<GriverAMCSLiteAppUpdater>() {
                public final /* synthetic */ void onNext(@NotNull Object obj) {
                    LoadingBridgeExtension loadingBridgeExtension = (LoadingBridgeExtension) GriverExtensionRegistry.this.getMax.apply((GriverAMCSLiteAppUpdater) obj);
                    if (!(loadingBridgeExtension.setMin == null || loadingBridgeExtension.setMin.isEmpty() || arrayList == null)) {
                        ArrayList arrayList = new ArrayList(arrayList);
                        arrayList.addAll(loadingBridgeExtension.setMin);
                        loadingBridgeExtension.setMin = arrayList;
                    }
                    GriverExtensionRegistry.this.setMax.onGetPromoCentreBannerSuccess(loadingBridgeExtension);
                }

                public final void onError(Throwable th) {
                    super.onError(th);
                    GriverExtensionRegistry.this.setMax.onError(th.getMessage());
                    StringBuilder sb = new StringBuilder("onError: ");
                    sb.append(th.getMessage());
                    updateActionSheetContent.e(DanaLogConstants.TAG.PROMO_CENTER_BANNER, sb.toString());
                }
            };
        }
        griverAppUpdater.execute(griverExtensionRegistry.FastBitmap$CoordinateSystem);
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit getMax(GriverExtensionRegistry griverExtensionRegistry, Throwable th) {
        griverExtensionRegistry.getMax();
        updateActionSheetContent.e(length, th.getMessage());
        return Unit.INSTANCE;
    }
}
