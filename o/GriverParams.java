package o;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import id.dana.tracker.TrackerKey;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.ConfirmPopup;
import o.GriverManifest;
import o.c;
import o.convertDipToPx;
import o.isOverride;
import o.setMenus;

@PerActivity
public final class GriverParams implements GriverManifest.AnonymousClass8.setMax {
    public static final String getMax = GriverExtensionRegistry.class.getSimpleName();
    private final setMenus FastBitmap$CoordinateSystem;
    private final isOverride IsOverlapping;
    private final setMinimumLogicalFontSize equals;
    @VisibleForTesting
    GriverAppVirtualHostProxy<getPageUrl> getMin;
    /* access modifiers changed from: private */
    public final GriverManifest.AnonymousClass8.length isInside;
    @VisibleForTesting
    GriverAppVirtualHostProxy<GriverAMCSLiteAppUpdater> length;
    /* access modifiers changed from: private */
    public final getSharedPreferenceForApp setMax;
    private final savePassword setMin;
    private final setOverride toDoubleRange;
    private final GriverAppUpdater toFloatRange;
    private final setReset toIntRange;
    private final Context values;

    final class LaunchParams implements Function1 {
        private final GriverParams setMax;

        public LaunchParams(GriverParams griverParams) {
            this.setMax = griverParams;
        }

        public final Object invoke(Object obj) {
            return GriverParams.length(this.setMax, (Boolean) obj);
        }
    }

    final class SchemeParams implements Function1 {
        public static final SchemeParams length = new SchemeParams();

        public final Object invoke(Object obj) {
            return updateActionSheetContent.e(GriverExtensionRegistry.class.getSimpleName(), ((Throwable) obj).getMessage());
        }
    }

    @Inject
    public GriverParams(savePassword savepassword, GriverManifest.AnonymousClass8.length length2, GriverAppUpdater griverAppUpdater, getSharedPreferenceForApp getsharedpreferenceforapp, setMinimumLogicalFontSize setminimumlogicalfontsize, isOverride isoverride, setReset setreset, setOverride setoverride, setMenus setmenus, Context context) {
        this.setMin = savepassword;
        this.isInside = length2;
        this.toFloatRange = griverAppUpdater;
        this.setMax = getsharedpreferenceforapp;
        this.equals = setminimumlogicalfontsize;
        this.IsOverlapping = isoverride;
        this.toIntRange = setreset;
        this.toDoubleRange = setoverride;
        this.FastBitmap$CoordinateSystem = setmenus;
        this.values = context;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int setMin(getIcontype geticontype, getIcontype geticontype2) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(geticontype.getSubscriptionDueDate()).compareTo(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(geticontype2.getSubscriptionDueDate()));
        } catch (ParseException e) {
            updateActionSheetContent.e(getMax, e.getMessage());
            return -1;
        }
    }

    private static ArrayList<getIcontype> getMin(List<? extends getIcontype> list) {
        String widgetType;
        ArrayList<getIcontype> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        for (getIcontype geticontype : list) {
            if (!setMin(geticontype.getExpirationDate()) && (widgetType = geticontype.getWidgetType()) != null) {
                if (widgetType.equalsIgnoreCase("SUBSCRIPTION_SUMMARY")) {
                    arrayList.add(geticontype);
                } else if (widgetType.equalsIgnoreCase("SUBSCRIPTION_PAY_STATUS")) {
                    arrayList2.add(geticontype);
                }
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final void setMax() {
        this.toFloatRange.dispose();
        this.setMin.dispose();
        this.equals.dispose();
        this.IsOverlapping.dispose();
    }

    public final void getMax() {
        GriverAppVirtualHostProxy<getPageUrl> griverAppVirtualHostProxy = this.getMin;
        if (griverAppVirtualHostProxy != null) {
            griverAppVirtualHostProxy.dispose();
            this.getMin = null;
        }
        savePassword savepassword = this.setMin;
        AnonymousClass4 r1 = new GriverAppVirtualHostProxy<getPageUrl>() {
            public final /* synthetic */ void onNext(@NonNull Object obj) {
                GriverParams.this.isInside.onFinishGetPromoCenterConfig((getPageUrl) obj);
            }
        };
        this.getMin = r1;
        savepassword.execute(r1);
    }

    public final void length() {
        this.equals.execute(null, new LaunchParams(this), new GriverParam(this));
    }

    private void setMin() {
        GriverAppVirtualHostProxy<GriverAMCSLiteAppUpdater> griverAppVirtualHostProxy = this.length;
        if (griverAppVirtualHostProxy != null) {
            griverAppVirtualHostProxy.dispose();
            this.length = null;
        }
        GriverAppUpdater griverAppUpdater = this.toFloatRange;
        AnonymousClass3 r2 = new GriverAppVirtualHostProxy<GriverAMCSLiteAppUpdater>((List) null) {
            public final /* synthetic */ void onNext(@NonNull Object obj) {
                LoadingBridgeExtension loadingBridgeExtension = (LoadingBridgeExtension) GriverParams.this.setMax.apply((GriverAMCSLiteAppUpdater) obj);
                if (!(loadingBridgeExtension.setMin == null || loadingBridgeExtension.setMin.isEmpty() || null == null)) {
                    ArrayList arrayList = new ArrayList(null);
                    arrayList.addAll(loadingBridgeExtension.setMin);
                    loadingBridgeExtension.setMin = arrayList;
                }
                GriverParams.this.isInside.onGetPromoCenterBannerSuccess(loadingBridgeExtension);
            }

            public final void onError(Throwable th) {
                super.onError(th);
                GriverParams.this.isInside.onError("");
                StringBuilder sb = new StringBuilder("onError: ");
                sb.append(th.getMessage());
                updateActionSheetContent.e(DanaLogConstants.TAG.PROMO_CENTER_BANNER, sb.toString());
            }
        };
        this.length = r2;
        griverAppUpdater.execute(r2);
    }

    private static boolean setMin(String str) {
        return ConfirmPopup.AnonymousClass1.getMax(str, "yyyy-MM-dd HH:mm:ss", Locale.getDefault());
    }

    static /* synthetic */ Unit length(GriverParams griverParams, Boolean bool) {
        if (bool.booleanValue()) {
            HashMap hashMap = new HashMap();
            hashMap.put("widgetTypes", "SUBSCRIPTION_SUMMARY,SUBSCRIPTION_PAY_STATUS");
            griverParams.IsOverlapping.execute(new isOverride.getMin("", hashMap), new Function1(griverParams) {
                private final GriverParams getMax;

                public final java.lang.Object invoke(
/*
Method generation error in method: o.GriverManifest.9.invoke(java.lang.Object):java.lang.Object, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.GriverManifest.9.invoke(java.lang.Object):java.lang.Object, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            }, new getBridgeInterceptor(griverParams));
        } else {
            griverParams.setMin();
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit setMin(GriverParams griverParams, Throwable th) {
        griverParams.setMin();
        updateActionSheetContent.e(getMax, th.getMessage());
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit length(GriverParams griverParams, Throwable th) {
        griverParams.setMin();
        updateActionSheetContent.e(getMax, th.getMessage());
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit setMax(GriverParams griverParams, Throwable th) {
        griverParams.setMin();
        updateActionSheetContent.e(getMax, th.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ kotlin.Unit getMin(o.GriverParams r6, java.util.List r7, java.util.List r8) {
        /*
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0060
            id.dana.model.CdpContentModel r0 = new id.dana.model.CdpContentModel
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0015:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x004b
            java.lang.Object r3 = r7.next()
            o.getIcontype r3 = (o.getIcontype) r3
            java.lang.String r4 = r3.getId()
            boolean r4 = r8.contains(r4)
            if (r4 != 0) goto L_0x0015
            java.lang.String r4 = r3.getWidgetType()
            java.lang.String r5 = "SUBSCRIPTION_SUMMARY"
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 != 0) goto L_0x0043
            java.lang.String r4 = r3.getWidgetType()
            java.lang.String r5 = "SUBSCRIPTION_PAY_STATUS"
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L_0x0015
        L_0x0043:
            id.dana.model.CdpContentModel r3 = o.isUpdated.setMax(r3)
            r2.add(r3)
            goto L_0x0015
        L_0x004b:
            boolean r7 = r2.isEmpty()
            if (r7 != 0) goto L_0x0060
            r0.create = r2
            java.lang.String r7 = "SUBSCRIPTION"
            r0.setMin = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r7.add(r0)
            goto L_0x0061
        L_0x0060:
            r7 = r1
        L_0x0061:
            o.GriverAppVirtualHostProxy<o.GriverAMCSLiteAppUpdater> r8 = r6.length
            if (r8 == 0) goto L_0x006a
            r8.dispose()
            r6.length = r1
        L_0x006a:
            o.GriverAppUpdater r8 = r6.toFloatRange
            o.GriverParams$3 r0 = new o.GriverParams$3
            r0.<init>(r7)
            r6.length = r0
            r8.execute(r0)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GriverParams.getMin(o.GriverParams, java.util.List, java.util.List):kotlin.Unit");
    }

    static /* synthetic */ Unit getMin(GriverParams griverParams, List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new GriverPageConfiguration(griverParams));
        ArrayList<getIcontype> min = getMin((List<? extends getIcontype>) arrayList);
        griverParams.toIntRange.execute(onReceivedIcon.INSTANCE, new setClassName(griverParams, min), new setActionList(griverParams));
        griverParams.toDoubleRange.execute(onReceivedIcon.INSTANCE, new GriverBridgeExtensionRegistry(griverParams, min), SchemeParams.length);
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit setMax(GriverParams griverParams, List list, List list2) {
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
                convertDipToPx.length length2 = new convertDipToPx.length(griverParams.values);
                length2.getMax = TrackerKey.Event.ANNOUNCEMENT_WIDGET_SHOW;
                length2.setMin();
                convertDipToPx convertdiptopx = new convertDipToPx(length2, (byte) 0);
                List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
                genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
                griverParams.FastBitmap$CoordinateSystem.execute(new setMenus.getMax(id2), BridgeInterceptorManager.setMin, c.a.setMax);
            }
        }
        return Unit.INSTANCE;
    }
}
