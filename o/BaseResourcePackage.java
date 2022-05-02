package o;

import android.content.Context;
import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.danah5.locationpicker.MiniProgramLocationPickerActivity;
import id.dana.di.modules.NearbyMerchantLocationSearchModule;
import id.dana.di.modules.NearbySearchModule;
import id.dana.model.CurrencyAmountModel;
import id.dana.nearbyme.NearbyMerchantLocationSearchView;
import id.dana.nearbyme.di.module.OtherStoreListModule;
import id.dana.nearbyme.model.ContactAddressModel;
import id.dana.nearbyme.model.ShopModel;
import id.dana.nearbyrevamp.otherstore.OtherStoreResultView;
import id.dana.nearbyrevamp.search.NearbySearchFragment;
import kotlin.jvm.internal.Intrinsics;
import o.AuthGuideExtension;
import o.GriverBaseActivity;
import o.PrepareException;
import o.b;
import o.d;
import o.f;
import o.setTextColor;
import o.showOpenSettingView;
import org.jetbrains.annotations.NotNull;

public final class BaseResourcePackage implements WSConstant {
    private b.C0007b<Context> getMax;
    private final PrepareException.AnonymousClass1 getMin;
    private b.C0007b<t> length;
    private b.C0007b<s> setMax;
    private final NearbyMerchantLocationSearchModule setMin;

    public final class HotUpdatePackageInstallCallback implements RVWebSocketManager {
        private final OtherStoreListModule getMax;
        private final PrepareException.AnonymousClass1 setMax;

        public /* synthetic */ HotUpdatePackageInstallCallback(OtherStoreListModule otherStoreListModule, PrepareException.AnonymousClass1 r2, byte b) {
            this(otherStoreListModule, r2);
        }

        private HotUpdatePackageInstallCallback(OtherStoreListModule otherStoreListModule, PrepareException.AnonymousClass1 r2) {
            this.setMax = r2;
            this.getMax = otherStoreListModule;
        }

        public static final class setMax {
            public OtherStoreListModule getMin;
            public PrepareException.AnonymousClass1 setMax;

            public /* synthetic */ setMax(byte b) {
                this();
            }

            private setMax() {
            }
        }

        public final void getMax(OtherStoreResultView otherStoreResultView) {
            OtherStoreListModule otherStoreListModule = this.getMax;
            isRooted ITrustedWebActivityService = this.setMax.ITrustedWebActivityService();
            if (ITrustedWebActivityService != null) {
                setPublishingStatus setpublishingstatus = new setPublishingStatus(ITrustedWebActivityService);
                appxLoadFailed length = this.setMax.length();
                if (length != null) {
                    appxLoadFailed appxloadfailed = length;
                    getScheme min = this.setMax.getMin();
                    if (min != null) {
                        getScheme getscheme = min;
                        isRooted ITrustedWebActivityService2 = this.setMax.ITrustedWebActivityService();
                        if (ITrustedWebActivityService2 != null) {
                            AuthGuideExtension.AnonymousClass1.setMin(otherStoreResultView, onCompletion.setMin(otherStoreListModule, new dataSetChanged(setpublishingstatus, new isEmbeddedApp(appxloadfailed, getscheme, ITrustedWebActivityService2), new setUserId(new setSpeed<stopBleScan, CurrencyAmountModel>() {
                                public final /* synthetic */ Object map(Object obj) {
                                    stopBleScan stopblescan = (stopBleScan) obj;
                                    if (stopblescan != null) {
                                        return new CurrencyAmountModel(stopblescan.getAmount(), stopblescan.getCurrency(), stopblescan.isPlaceholder());
                                    }
                                    return null;
                                }
                            }), f.AnonymousClass4.getMin(this.getMax), new GriverBaseActivity(new GriverBaseActivity.Main(), new setSpeed<getMacEncrypt, ContactAddressModel>() {
                                public final /* synthetic */ java.lang.Object map(
/*
Method generation error in method: o.k.9.map(java.lang.Object):java.lang.Object, dex: classes3.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.k.9.map(java.lang.Object):java.lang.Object, class status: UNLOADED
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
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
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
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
                                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
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
                            }, new GriverPage(new setSpeed<stopBleScan, CurrencyAmountModel>() {
                                public final /* synthetic */ Object map(Object obj) {
                                    stopBleScan stopblescan = (stopBleScan) obj;
                                    if (stopblescan != null) {
                                        return new CurrencyAmountModel(stopblescan.getAmount(), stopblescan.getCurrency(), stopblescan.isPlaceholder());
                                    }
                                    return null;
                                }
                            }, new NebulaAppContext()), new MiniProgramFacade()))));
                            OtherStoreListModule otherStoreListModule2 = this.getMax;
                            Context max = this.setMax.getMax();
                            if (max != null) {
                                AuthGuideExtension.AnonymousClass1.getMax(otherStoreResultView, showDefaultErrorPage.getMin(otherStoreListModule2, new s(max)));
                                return;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                        }
                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    /* renamed from: o.BaseResourcePackage$1  reason: invalid class name */
    public final class AnonymousClass1 implements DefaultRVWebSocketClient {
        private b.C0007b<t> IsOverlapping;
        private b.C0007b<Context> getMax;
        private final PrepareException.AnonymousClass1 getMin;
        private b.C0007b<s> length;
        private final NearbySearchModule setMax;
        private final NearbyMerchantLocationSearchModule setMin;

        public /* synthetic */ AnonymousClass1(NearbySearchModule nearbySearchModule, NearbyMerchantLocationSearchModule nearbyMerchantLocationSearchModule, PrepareException.AnonymousClass1 r3, byte b) {
            this(nearbySearchModule, nearbyMerchantLocationSearchModule, r3);
        }

        private AnonymousClass1(NearbySearchModule nearbySearchModule, NearbyMerchantLocationSearchModule nearbyMerchantLocationSearchModule, PrepareException.AnonymousClass1 r3) {
            this.setMax = nearbySearchModule;
            this.getMin = r3;
            this.setMin = nearbyMerchantLocationSearchModule;
            length length2 = new length(r3);
            this.getMax = length2;
            d.AnonymousClass3.AnonymousClass1 length3 = d.AnonymousClass3.AnonymousClass1.length(length2);
            this.length = length3;
            this.IsOverlapping = isScrap.getMin(getField0.length(nearbyMerchantLocationSearchModule, length3));
        }

        /* renamed from: o.BaseResourcePackage$1$getMin */
        public static final class getMin {
            public NearbyMerchantLocationSearchModule getMax;
            public NearbySearchModule length;
            public PrepareException.AnonymousClass1 setMin;

            public /* synthetic */ getMin(byte b) {
                this();
            }

            private getMin() {
            }
        }

        /* renamed from: o.BaseResourcePackage$1$length */
        static class length implements b.C0007b<Context> {
            private final PrepareException.AnonymousClass1 getMin;

            length(PrepareException.AnonymousClass1 r1) {
                this.getMin = r1;
            }

            public final /* synthetic */ Object get() {
                Context max = this.getMin.getMax();
                if (max != null) {
                    return max;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        public final void setMax(NearbySearchFragment nearbySearchFragment) {
            NearbySearchFragment nearbySearchFragment2 = nearbySearchFragment;
            NearbySearchModule nearbySearchModule = this.setMax;
            showOpenSettingView.getMax length2 = setAccessible.length(this.setMax);
            localIdToUrl tag = this.getMin.getTag();
            if (tag != null) {
                AuthGuideExtension.setMax(nearbySearchFragment2, getCollectionItemType.getMin(nearbySearchModule, new ShowAuthGuideBridgeExtension(length2, new getFileMD5(tag))));
                NearbyMerchantLocationSearchModule nearbyMerchantLocationSearchModule = this.setMin;
                setTextColor.getMin min = decapitalize.setMin(this.setMin);
                appxLoadFailed length3 = this.getMin.length();
                if (length3 != null) {
                    appxLoadFailed appxloadfailed = length3;
                    getScheme min2 = this.getMin.getMin();
                    if (min2 != null) {
                        getScheme getscheme = min2;
                        GriverWebViewUtils onEvent = this.getMin.onEvent();
                        if (onEvent != null) {
                            isFile isfile = new isFile(appxloadfailed, getscheme, onEvent);
                            appxLoadFailed length4 = this.getMin.length();
                            if (length4 != null) {
                                appxLoadFailed appxloadfailed2 = length4;
                                getScheme min3 = this.getMin.getMin();
                                if (min3 != null) {
                                    getScheme getscheme2 = min3;
                                    GriverWebViewUtils onEvent2 = this.getMin.onEvent();
                                    if (onEvent2 != null) {
                                        getFileSHA1 getfilesha1 = new getFileSHA1(appxloadfailed2, getscheme2, onEvent2);
                                        appxLoadFailed length5 = this.getMin.length();
                                        if (length5 != null) {
                                            appxLoadFailed appxloadfailed3 = length5;
                                            getScheme min4 = this.getMin.getMin();
                                            if (min4 != null) {
                                                getScheme getscheme3 = min4;
                                                isRooted ITrustedWebActivityService = this.getMin.ITrustedWebActivityService();
                                                if (ITrustedWebActivityService != null) {
                                                    setGriverAppVirtualHostProxy setgriverappvirtualhostproxy = new setGriverAppVirtualHostProxy(appxloadfailed3, getscheme3, ITrustedWebActivityService);
                                                    appxLoadFailed length6 = this.getMin.length();
                                                    if (length6 != null) {
                                                        appxLoadFailed appxloadfailed4 = length6;
                                                        getScheme min5 = this.getMin.getMin();
                                                        if (min5 != null) {
                                                            getScheme getscheme4 = min5;
                                                            isRooted ITrustedWebActivityService2 = this.getMin.ITrustedWebActivityService();
                                                            if (ITrustedWebActivityService2 != null) {
                                                                isEmbeddedApp isembeddedapp = new isEmbeddedApp(appxloadfailed4, getscheme4, ITrustedWebActivityService2);
                                                                getPerformanceTracker onTransact = this.getMin.onTransact();
                                                                if (onTransact != null) {
                                                                    getPerformanceTracker getperformancetracker = onTransact;
                                                                    APWebViewPerformance RatingCompat$StarStyle = this.getMin.RatingCompat$StarStyle();
                                                                    if (RatingCompat$StarStyle != null) {
                                                                        RVFileAbilityProxy rVFileAbilityProxy = new RVFileAbilityProxy(RatingCompat$StarStyle);
                                                                        fetchAppList fetchapplist = new fetchAppList(new MiniProgramFacade(), new GriverBaseActivity.Main());
                                                                        setUserId setuserid = new setUserId(new setSpeed<stopBleScan, CurrencyAmountModel>() {
                                                                            public final /* synthetic */ Object map(Object obj) {
                                                                                stopBleScan stopblescan = (stopBleScan) obj;
                                                                                if (stopblescan != null) {
                                                                                    return new CurrencyAmountModel(stopblescan.getAmount(), stopblescan.getCurrency(), stopblescan.isPlaceholder());
                                                                                }
                                                                                return null;
                                                                            }
                                                                        });
                                                                        appxLoadFailed length7 = this.getMin.length();
                                                                        if (length7 != null) {
                                                                            appxLoadFailed appxloadfailed5 = length7;
                                                                            String str = "Cannot return null from a non-@Nullable component method";
                                                                            getScheme min6 = this.getMin.getMin();
                                                                            if (min6 != null) {
                                                                                getScheme getscheme5 = min6;
                                                                                isRooted ITrustedWebActivityService3 = this.getMin.ITrustedWebActivityService();
                                                                                if (ITrustedWebActivityService3 != null) {
                                                                                    setTextColor.length length8 = getClass.length(nearbyMerchantLocationSearchModule, new updateText(min, isfile, getfilesha1, setgriverappvirtualhostproxy, isembeddedapp, getperformancetracker, rVFileAbilityProxy, fetchapplist, setuserid, new installPathValid(appxloadfailed5, getscheme5, ITrustedWebActivityService3), new Object() {
                                                                                        public double getMax;
                                                                                        public double getMin;
                                                                                        public double length;
                                                                                        public boolean setMin;

                                                                                        public final double getMax(@NotNull ShopModel shopModel) {
                                                                                            double d;
                                                                                            Intrinsics.checkNotNullParameter(shopModel, "shopModel");
                                                                                            double d2 = this.getMax;
                                                                                            double min = (double) setMin(shopModel);
                                                                                            Double.isNaN(min);
                                                                                            double d3 = d2 * min;
                                                                                            double d4 = this.length;
                                                                                            if (this.setMin) {
                                                                                                d = shopModel.create;
                                                                                            } else {
                                                                                                d = Math.ceil(shopModel.create);
                                                                                            }
                                                                                            double d5 = d3 + (d4 * d);
                                                                                            double d6 = this.getMin;
                                                                                            double min2 = (double) getMin(shopModel);
                                                                                            Double.isNaN(min2);
                                                                                            return d5 + (d6 * min2);
                                                                                        }

                                                                                        private final int setMin(ShopModel shopModel) {
                                                                                            if (this.setMin) {
                                                                                                double d = shopModel.toFloatRange;
                                                                                                if (d >= 0.0d && d <= 1.0d) {
                                                                                                    return 5;
                                                                                                }
                                                                                                if (d >= 1.1d && d <= 2.0d) {
                                                                                                    return 4;
                                                                                                }
                                                                                                if (d < 2.1d || d > 3.0d) {
                                                                                                    return (d < 3.1d || d > 4.0d) ? 1 : 2;
                                                                                                }
                                                                                                return 3;
                                                                                            }
                                                                                            double d2 = shopModel.toFloatRange;
                                                                                            if (d2 >= 0.0d && d2 <= 0.6d) {
                                                                                                return 5;
                                                                                            }
                                                                                            if (d2 >= 0.7d && d2 <= 1.2d) {
                                                                                                return 4;
                                                                                            }
                                                                                            if (d2 < 1.3d || d2 > 1.8d) {
                                                                                                return (d2 < 1.9d || d2 > 2.4d) ? 1 : 2;
                                                                                            }
                                                                                            return 3;
                                                                                        }

                                                                                        private static int getMin(ShopModel shopModel) {
                                                                                            double d = shopModel.onNavigationEvent;
                                                                                            if (d > 25.0d) {
                                                                                                return 5;
                                                                                            }
                                                                                            if (d >= 21.0d && d <= 25.0d) {
                                                                                                return 4;
                                                                                            }
                                                                                            if (d < 16.0d || d > 20.0d) {
                                                                                                return (d < 11.0d || d > 15.0d) ? 1 : 2;
                                                                                            }
                                                                                            return 3;
                                                                                        }
                                                                                    }));
                                                                                    NearbySearchFragment nearbySearchFragment3 = nearbySearchFragment;
                                                                                    AuthGuideExtension.setMin(nearbySearchFragment3, length8);
                                                                                    AuthGuideExtension.length(nearbySearchFragment3, this.IsOverlapping.get());
                                                                                    return;
                                                                                }
                                                                                throw new NullPointerException(str);
                                                                            }
                                                                            throw new NullPointerException(str);
                                                                        }
                                                                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                                    }
                                                                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                                }
                                                                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                            }
                                                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                        }
                                                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                    }
                                                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                }
                                                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                            }
                                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                        }
                                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                    }
                                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                }
                                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                        }
                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    /* synthetic */ BaseResourcePackage(NearbyMerchantLocationSearchModule nearbyMerchantLocationSearchModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(nearbyMerchantLocationSearchModule, r2);
    }

    private BaseResourcePackage(NearbyMerchantLocationSearchModule nearbyMerchantLocationSearchModule, PrepareException.AnonymousClass1 r3) {
        this.setMin = nearbyMerchantLocationSearchModule;
        this.getMin = r3;
        setMin setmin = new setMin(r3);
        this.getMax = setmin;
        d.AnonymousClass3.AnonymousClass1 length2 = d.AnonymousClass3.AnonymousClass1.length(setmin);
        this.setMax = length2;
        this.length = isScrap.getMin(getField0.length(nearbyMerchantLocationSearchModule, length2));
    }

    private updateText setMin() {
        setTextColor.getMin min = decapitalize.setMin(this.setMin);
        appxLoadFailed length2 = this.getMin.length();
        if (length2 != null) {
            appxLoadFailed appxloadfailed = length2;
            getScheme min2 = this.getMin.getMin();
            if (min2 != null) {
                getScheme getscheme = min2;
                GriverWebViewUtils onEvent = this.getMin.onEvent();
                if (onEvent != null) {
                    isFile isfile = new isFile(appxloadfailed, getscheme, onEvent);
                    appxLoadFailed length3 = this.getMin.length();
                    if (length3 != null) {
                        appxLoadFailed appxloadfailed2 = length3;
                        getScheme min3 = this.getMin.getMin();
                        if (min3 != null) {
                            getScheme getscheme2 = min3;
                            GriverWebViewUtils onEvent2 = this.getMin.onEvent();
                            if (onEvent2 != null) {
                                getFileSHA1 getfilesha1 = new getFileSHA1(appxloadfailed2, getscheme2, onEvent2);
                                appxLoadFailed length4 = this.getMin.length();
                                if (length4 != null) {
                                    appxLoadFailed appxloadfailed3 = length4;
                                    getScheme min4 = this.getMin.getMin();
                                    if (min4 != null) {
                                        getScheme getscheme3 = min4;
                                        isRooted ITrustedWebActivityService = this.getMin.ITrustedWebActivityService();
                                        if (ITrustedWebActivityService != null) {
                                            setGriverAppVirtualHostProxy setgriverappvirtualhostproxy = new setGriverAppVirtualHostProxy(appxloadfailed3, getscheme3, ITrustedWebActivityService);
                                            appxLoadFailed length5 = this.getMin.length();
                                            if (length5 != null) {
                                                appxLoadFailed appxloadfailed4 = length5;
                                                getScheme min5 = this.getMin.getMin();
                                                if (min5 != null) {
                                                    getScheme getscheme4 = min5;
                                                    isRooted ITrustedWebActivityService2 = this.getMin.ITrustedWebActivityService();
                                                    if (ITrustedWebActivityService2 != null) {
                                                        isEmbeddedApp isembeddedapp = new isEmbeddedApp(appxloadfailed4, getscheme4, ITrustedWebActivityService2);
                                                        getPerformanceTracker onTransact = this.getMin.onTransact();
                                                        if (onTransact != null) {
                                                            getPerformanceTracker getperformancetracker = onTransact;
                                                            APWebViewPerformance RatingCompat$StarStyle = this.getMin.RatingCompat$StarStyle();
                                                            if (RatingCompat$StarStyle != null) {
                                                                RVFileAbilityProxy rVFileAbilityProxy = new RVFileAbilityProxy(RatingCompat$StarStyle);
                                                                fetchAppList fetchapplist = new fetchAppList(new MiniProgramFacade(), new GriverBaseActivity.Main());
                                                                setUserId setuserid = new setUserId(new setSpeed<stopBleScan, CurrencyAmountModel>() {
                                                                    public final /* synthetic */ Object map(Object obj) {
                                                                        stopBleScan stopblescan = (stopBleScan) obj;
                                                                        if (stopblescan != null) {
                                                                            return new CurrencyAmountModel(stopblescan.getAmount(), stopblescan.getCurrency(), stopblescan.isPlaceholder());
                                                                        }
                                                                        return null;
                                                                    }
                                                                });
                                                                appxLoadFailed length6 = this.getMin.length();
                                                                if (length6 != null) {
                                                                    appxLoadFailed appxloadfailed5 = length6;
                                                                    getScheme min6 = this.getMin.getMin();
                                                                    if (min6 != null) {
                                                                        getScheme getscheme5 = min6;
                                                                        isRooted ITrustedWebActivityService3 = this.getMin.ITrustedWebActivityService();
                                                                        if (ITrustedWebActivityService3 != null) {
                                                                            return new updateText(min, isfile, getfilesha1, setgriverappvirtualhostproxy, isembeddedapp, getperformancetracker, rVFileAbilityProxy, fetchapplist, setuserid, new installPathValid(appxloadfailed5, getscheme5, ITrustedWebActivityService3), new Object() {
                                                                                public double getMax;
                                                                                public double getMin;
                                                                                public double length;
                                                                                public boolean setMin;

                                                                                public final double getMax(@NotNull ShopModel shopModel) {
                                                                                    double d;
                                                                                    Intrinsics.checkNotNullParameter(shopModel, "shopModel");
                                                                                    double d2 = this.getMax;
                                                                                    double min = (double) setMin(shopModel);
                                                                                    Double.isNaN(min);
                                                                                    double d3 = d2 * min;
                                                                                    double d4 = this.length;
                                                                                    if (this.setMin) {
                                                                                        d = shopModel.create;
                                                                                    } else {
                                                                                        d = Math.ceil(shopModel.create);
                                                                                    }
                                                                                    double d5 = d3 + (d4 * d);
                                                                                    double d6 = this.getMin;
                                                                                    double min2 = (double) getMin(shopModel);
                                                                                    Double.isNaN(min2);
                                                                                    return d5 + (d6 * min2);
                                                                                }

                                                                                private final int setMin(ShopModel shopModel) {
                                                                                    if (this.setMin) {
                                                                                        double d = shopModel.toFloatRange;
                                                                                        if (d >= 0.0d && d <= 1.0d) {
                                                                                            return 5;
                                                                                        }
                                                                                        if (d >= 1.1d && d <= 2.0d) {
                                                                                            return 4;
                                                                                        }
                                                                                        if (d < 2.1d || d > 3.0d) {
                                                                                            return (d < 3.1d || d > 4.0d) ? 1 : 2;
                                                                                        }
                                                                                        return 3;
                                                                                    }
                                                                                    double d2 = shopModel.toFloatRange;
                                                                                    if (d2 >= 0.0d && d2 <= 0.6d) {
                                                                                        return 5;
                                                                                    }
                                                                                    if (d2 >= 0.7d && d2 <= 1.2d) {
                                                                                        return 4;
                                                                                    }
                                                                                    if (d2 < 1.3d || d2 > 1.8d) {
                                                                                        return (d2 < 1.9d || d2 > 2.4d) ? 1 : 2;
                                                                                    }
                                                                                    return 3;
                                                                                }

                                                                                private static int getMin(ShopModel shopModel) {
                                                                                    double d = shopModel.onNavigationEvent;
                                                                                    if (d > 25.0d) {
                                                                                        return 5;
                                                                                    }
                                                                                    if (d >= 21.0d && d <= 25.0d) {
                                                                                        return 4;
                                                                                    }
                                                                                    if (d < 16.0d || d > 20.0d) {
                                                                                        return (d < 11.0d || d > 15.0d) ? 1 : 2;
                                                                                    }
                                                                                    return 3;
                                                                                }
                                                                            });
                                                                        }
                                                                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                                    }
                                                                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                                }
                                                                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                            }
                                                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                        }
                                                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                    }
                                                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                }
                                                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                            }
                                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                        }
                                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                    }
                                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                }
                                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                        }
                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }

    public static final class getMin {
        public PrepareException.AnonymousClass1 getMin;
        public NearbyMerchantLocationSearchModule setMax;

        public /* synthetic */ getMin(byte b) {
            this();
        }

        private getMin() {
        }

        public final WSConstant getMax() {
            stopIgnoring.setMin(this.setMax, NearbyMerchantLocationSearchModule.class);
            stopIgnoring.setMin(this.getMin, PrepareException.AnonymousClass1.class);
            return new BaseResourcePackage(this.setMax, this.getMin, (byte) 0);
        }
    }

    static class setMin implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 getMin;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            Context max = this.getMin.getMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void getMin(NearbyMerchantLocationSearchView nearbyMerchantLocationSearchView) {
        setExceedAppIdList.getMax(nearbyMerchantLocationSearchView, getClass.length(this.setMin, setMin()));
        setExceedAppIdList.getMin(nearbyMerchantLocationSearchView, this.length.get());
    }

    public final void getMin(MiniProgramLocationPickerActivity miniProgramLocationPickerActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.getMin.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy != null) {
            matchInfo.setMin(miniProgramLocationPickerActivity, IPostMessageService$Stub$Proxy);
            applyChanges ICustomTabsCallback$Stub = this.getMin.ICustomTabsCallback$Stub();
            if (ICustomTabsCallback$Stub != null) {
                applyChanges applychanges = ICustomTabsCallback$Stub;
                appxLoadFailed length2 = this.getMin.length();
                if (length2 != null) {
                    appxLoadFailed appxloadfailed = length2;
                    getScheme min = this.getMin.getMin();
                    if (min != null) {
                        getScheme getscheme = min;
                        setDefaultFontSize updateVisuals = this.getMin.updateVisuals();
                        if (updateVisuals != null) {
                            matchInfo.length(miniProgramLocationPickerActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                            invalidateBackgroundColorAndRadius.injectPresenter(miniProgramLocationPickerActivity, setMin());
                            Context max = this.getMin.getMax();
                            if (max != null) {
                                invalidateBackgroundColorAndRadius.injectMapHelper(miniProgramLocationPickerActivity, new GriverDefaultLoadingView(max));
                                return;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                        }
                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
