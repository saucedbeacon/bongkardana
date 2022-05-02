package o;

import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.di.PerActivity;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Unit;
import o.APWebSettings;
import o.getBlockNetworkImage;
import o.getRunningAnimators;

@PerActivity
public class getTargets implements getRunningAnimators.setMax {
    private final getBlockNetworkImage getMax;
    private final setEpicenterCallback getMin;
    private final APWebSettings.LayoutAlgorithm length;
    private final getAllInstallFiles setMax;
    /* access modifiers changed from: private */
    public final getRunningAnimators.getMin setMin;

    @Inject
    public getTargets(getRunningAnimators.getMin getmin, setEpicenterCallback setepicentercallback, getBlockNetworkImage getblocknetworkimage, APWebSettings.LayoutAlgorithm layoutAlgorithm, getAllInstallFiles getallinstallfiles) {
        this.setMin = getmin;
        this.getMin = setepicentercallback;
        this.getMax = getblocknetworkimage;
        this.length = layoutAlgorithm;
        this.setMax = getallinstallfiles;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMax(final java.lang.String r8, final java.util.Map<java.lang.String, java.lang.String> r9, final java.lang.String r10) {
        /*
            r7 = this;
            int r3 = r8.hashCode()
            switch(r3) {
                case -1049482625: goto L_0x004f;
                case 122673451: goto L_0x0045;
                case 337815220: goto L_0x003b;
                case 407644048: goto L_0x0031;
                case 516642788: goto L_0x0026;
                case 907407721: goto L_0x001c;
                case 1380077785: goto L_0x0012;
                case 1816389436: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0059
        L_0x0008:
            java.lang.String r3 = "allshops"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0059
            r3 = 5
            goto L_0x005a
        L_0x0012:
            java.lang.String r3 = "ipgregistration"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0059
            r3 = 1
            goto L_0x005a
        L_0x001c:
            java.lang.String r3 = "dummyQRISAlert"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0059
            r3 = 4
            goto L_0x005a
        L_0x0026:
            java.lang.String r3 = "setting_more"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0059
            r3 = 2
            goto L_0x005a
        L_0x0031:
            java.lang.String r3 = "nearbydetail"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0059
            r3 = 6
            goto L_0x005a
        L_0x003b:
            java.lang.String r3 = "miniprogramstore"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0059
            r3 = 3
            goto L_0x005a
        L_0x0045:
            java.lang.String r3 = "openservice"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0059
            r3 = 0
            goto L_0x005a
        L_0x004f:
            java.lang.String r3 = "nearby"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0059
            r3 = 7
            goto L_0x005a
        L_0x0059:
            r3 = -1
        L_0x005a:
            switch(r3) {
                case 0: goto L_0x00bd;
                case 1: goto L_0x0097;
                case 2: goto L_0x008b;
                case 3: goto L_0x008b;
                case 4: goto L_0x007e;
                case 5: goto L_0x006c;
                case 6: goto L_0x006c;
                case 7: goto L_0x006c;
                default: goto L_0x005d;
            }
        L_0x005d:
            o.getBlockNetworkImage r3 = r7.getMax
            o.getTargets$3 r4 = new o.getTargets$3
            r4.<init>(r8, r9, r10)
            o.getBlockNetworkImage$getMax r0 = o.getBlockNetworkImage.getMax.forAction(r8)
            r3.execute(r4, r0)
            return
        L_0x006c:
            o.getAllInstallFiles r3 = r7.setMax
            o.onReceivedIcon r4 = o.onReceivedIcon.INSTANCE
            o.captureValues r5 = new o.captureValues
            r5.<init>(r7, r9, r8, r10)
            o.getTargetTypes r6 = new o.getTargetTypes
            r6.<init>(r7, r9, r8, r10)
            r3.execute(r4, r5, r6)
            return
        L_0x007e:
            o.getRunningAnimators$getMin r0 = r7.setMin
            r4 = 1
            r5 = 1
            java.lang.String r1 = "dummyQRISAlert"
            java.lang.String r3 = ""
            r2 = r9
            r0.length(r1, r2, r3, r4, r5)
            return
        L_0x008b:
            o.getRunningAnimators$getMin r0 = r7.setMin
            r4 = 1
            r5 = 1
            java.lang.String r3 = ""
            r1 = r8
            r2 = r9
            r0.length(r1, r2, r3, r4, r5)
            return
        L_0x0097:
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            o.GriverShouldLoadUrlExtension$2 r1 = o.GriverShouldLoadUrlExtension.AnonymousClass2.setMax
            java.lang.String r1 = o.GriverShouldLoadUrlExtension.AnonymousClass2.getMax()
            java.lang.Object r1 = r9.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            java.lang.Object r0 = r0.fromJson((java.lang.String) r1, r2)
            r3 = r0
            java.util.Map r3 = (java.util.Map) r3
            o.getRunningAnimators$getMin r1 = r7.setMin
            r5 = 0
            r6 = 1
            java.lang.String r2 = "ipgregistration"
            java.lang.String r4 = ""
            r1.length(r2, r3, r4, r5, r6)
            return
        L_0x00bd:
            java.lang.String r0 = "service"
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x00fe
            java.lang.String r1 = "source"
            java.lang.Object r1 = r9.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x00df
            o.getRunningAnimators$getMin r2 = r7.setMin
            r2.getMax((java.lang.String) r1)
        L_0x00df:
            o.setEpicenterCallback r1 = r7.getMin
            java.lang.String r2 = ","
            java.lang.String[] r0 = r0.split(r2)
            java.util.List r0 = java.util.Arrays.asList(r0)
            o.getRunningAnimators$getMin r2 = r1.getMin
            r2.showProgress()
            o.getUniqueId r2 = r1.setMin
            o.setEpicenterCallback$2 r3 = new o.setEpicenterCallback$2
            r3.<init>()
            o.getUniqueId$setMax r0 = o.getUniqueId.setMax.forGetServicesByKey(r0)
            r2.execute(r3, r0)
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTargets.setMax(java.lang.String, java.util.Map, java.lang.String):void");
    }

    public final void getMax(addUnmatched addunmatched) {
        this.setMin.setMax(addunmatched);
    }

    public final void length(String str) {
        this.length.execute(isShowMenu.setMax(str), new clearValues(this, str), getTargetNames.length);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d A[RETURN] */
    @androidx.annotation.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMin(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 407644048(0x184c2790, float:2.6386356E-24)
            r2 = 1
            if (r0 == r1) goto L_0x001a
            r1 = 1816389436(0x6c43e73c, float:9.4733E26)
            if (r0 == r1) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "allshops"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "nearbydetail"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0024
            r0 = 0
            goto L_0x0025
        L_0x0024:
            r0 = -1
        L_0x0025:
            if (r0 == 0) goto L_0x002d
            if (r0 == r2) goto L_0x002a
            return r3
        L_0x002a:
            java.lang.String r3 = "nearbyshoplist"
            return r3
        L_0x002d:
            java.lang.String r3 = "merchantdetail"
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTargets.setMin(java.lang.String):java.lang.String");
    }

    public void setMax() {
        this.getMax.dispose();
        setEpicenterCallback setepicentercallback = this.getMin;
        setepicentercallback.setMax.dispose();
        setepicentercallback.setMin.dispose();
        this.setMin.getMax();
        this.length.dispose();
        this.setMax.dispose();
    }

    static /* synthetic */ Unit setMax(getTargets gettargets, final Map map, String str, final String str2) {
        map.put(FeatureParams.NEARBY_REVAMP, Boolean.FALSE.toString());
        final String min = setMin(str);
        gettargets.getMax.execute(new GriverAppVirtualHostProxy<getSettings>() {
            public final /* synthetic */ void onNext(Object obj) {
                getSettings getsettings = (getSettings) obj;
                if (getsettings.isFeatureNonAmcs()) {
                    getTargets.this.setMin.length(r8, r9, r10, true, true);
                    getTargets.this.setMin.getMax(true);
                    return;
                }
                getTargets.this.setMin.length(r8, r9, r10, false, getsettings.isFeatureActive());
                getTargets.this.setMin.getMax(getsettings.isFeatureActive());
            }

            public final void onError(Throwable th) {
                getTargets.this.setMin.getMax(true);
                getTargets.this.setMin.dismissProgress();
                super.onError(th);
            }
        }, getBlockNetworkImage.getMax.forAction(min));
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit length(getTargets gettargets, final Map map, final String str, final String str2, clearExpired clearexpired) {
        map.put(FeatureParams.NEARBY_REVAMP, Boolean.toString(clearexpired.getNearbyRevamp()));
        if (clearexpired.getNearbyRevamp()) {
            gettargets.getMax.execute(new GriverAppVirtualHostProxy<getSettings>() {
                public final /* synthetic */ void onNext(Object obj) {
                    getSettings getsettings = (getSettings) obj;
                    if (getsettings.isFeatureNonAmcs()) {
                        getTargets.this.setMin.length(r8, r9, r10, true, true);
                        getTargets.this.setMin.getMax(true);
                        return;
                    }
                    getTargets.this.setMin.length(r8, r9, r10, false, getsettings.isFeatureActive());
                    getTargets.this.setMin.getMax(getsettings.isFeatureActive());
                }

                public final void onError(Throwable th) {
                    getTargets.this.setMin.getMax(true);
                    getTargets.this.setMin.dismissProgress();
                    super.onError(th);
                }
            }, getBlockNetworkImage.getMax.forAction(str));
        } else {
            final String min = setMin(str);
            gettargets.getMax.execute(new GriverAppVirtualHostProxy<getSettings>() {
                public final /* synthetic */ void onNext(Object obj) {
                    getSettings getsettings = (getSettings) obj;
                    if (getsettings.isFeatureNonAmcs()) {
                        getTargets.this.setMin.length(r8, r9, r10, true, true);
                        getTargets.this.setMin.getMax(true);
                        return;
                    }
                    getTargets.this.setMin.length(r8, r9, r10, false, getsettings.isFeatureActive());
                    getTargets.this.setMin.getMax(getsettings.isFeatureActive());
                }

                public final void onError(Throwable th) {
                    getTargets.this.setMin.getMax(true);
                    getTargets.this.setMin.dismissProgress();
                    super.onError(th);
                }
            }, getBlockNetworkImage.getMax.forAction(min));
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit setMin(getTargets gettargets, String str, Boolean bool) {
        if (bool.booleanValue()) {
            gettargets.setMin.setMin(str);
        }
        return Unit.INSTANCE;
    }
}
