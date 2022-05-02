package o;

import com.alibaba.fastjson.JSONObject;
import id.dana.data.Source;
import id.dana.data.config.source.amcs.result.PlayStoreReviewConfig;
import id.dana.domain.playstorereview.PlayStoreReviewActionKey;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.AppMsgReceiver;
import o.CommonUtil;
import o.RVMain;
import o.RVManifest;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
public class onFragmentCreate implements dynamicProxy {
    private static final long SIXTY_ONE_DAY_IN_MILLIS = 5270400000L;
    private final onCallBack configEntityDataFactory;
    private final RVManifest.LazyProxyManifest playStoreReviewDataFactory;
    private final RVMain.AnonymousClass4 playStoreReviewEntityMapper;

    @Inject
    public onFragmentCreate(RVManifest.LazyProxyManifest lazyProxyManifest, onCallBack oncallback, RVMain.AnonymousClass4 r3) {
        this.playStoreReviewDataFactory = lazyProxyManifest;
        this.configEntityDataFactory = oncallback;
        this.playStoreReviewEntityMapper = r3;
    }

    public static long getDifferenceDays(long j, long j2) {
        return TimeUnit.DAYS.convert(j - j2, TimeUnit.MILLISECONDS);
    }

    public TitleBarRightButtonView.AnonymousClass1<CommonUtil.AnonymousClass1> isNeedToShowPlayStoreReview() {
        return createData().getTransactionSuccessCount().flatMap(new make(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$isNeedToShowPlayStoreReview$0(Integer num) throws Exception {
        int i = 1;
        if (num.intValue() >= 0) {
            i = 1 + num.intValue();
        }
        return onGotTransactionSuccessCount(i);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveLastPlayStoreReviewShow(String str, long j, long j2) {
        return createData().saveLastPlayStoreReviewShow(str, j, j2);
    }

    private RVMain.AnonymousClass5 createData() {
        return this.playStoreReviewDataFactory.createData("local");
    }

    private TitleBarRightButtonView.AnonymousClass1<CommonUtil.AnonymousClass1> onGotTransactionSuccessCount(int i) {
        return createData().saveSuccessTransaction(i).flatMap(new makeRaw(this, i));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$onGotTransactionSuccessCount$1(int i, Boolean bool) throws Exception {
        return onSavedTransactionSuccessCount(i);
    }

    private TitleBarRightButtonView.AnonymousClass1<CommonUtil.AnonymousClass1> onSavedTransactionSuccessCount(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1610865567, oncanceled);
            onCancelLoad.getMin(1610865567, oncanceled);
        }
        if (i <= 1) {
            return TitleBarRightButtonView.AnonymousClass1.just(createDefaultAppReviewInfo());
        }
        TitleBarRightButtonView.AnonymousClass1<JSONObject> onErrorResumeNext = createSplitDataConfig().getPlayStoreReviewFeature().onErrorResumeNext(createAMCSDataConfig().getPlayStoreReviewFeature());
        RVMain.AnonymousClass4 r0 = this.playStoreReviewEntityMapper;
        Objects.requireNonNull(r0);
        return onErrorResumeNext.map(new RVManifest.IProxyManifest(r0)).flatMap(new addBridgeExtensionDSL(this));
    }

    private AppMsgReceiver.AnonymousClass2 createAMCSDataConfig() {
        return this.configEntityDataFactory.createData("amcs");
    }

    private AppMsgReceiver.AnonymousClass2 createSplitDataConfig() {
        return this.configEntityDataFactory.createData(Source.SPLIT);
    }

    /* access modifiers changed from: private */
    public TitleBarRightButtonView.AnonymousClass1<CommonUtil.AnonymousClass1> onGotPlayStoreReviewFeature(PlayStoreReviewConfig playStoreReviewConfig) {
        if (playStoreReviewConfig.isShowReviewEntrance()) {
            return createData().getLastPlayStoreReviewShow().flatMap(new RedDotDrawable(this, playStoreReviewConfig) {
                private final PlayStoreReviewConfig getMax;
                private final onFragmentCreate setMax;

                {
                    this.setMax = r1;
                    this.getMax = r2;
                }

                public final Object apply(Object obj) {
                    return this.setMax.lambda$onGotPlayStoreReviewFeature$2(this.getMax, (RVManifest) obj);
                }
            });
        }
        return TitleBarRightButtonView.AnonymousClass1.just(createDefaultAppReviewInfo());
    }

    private CommonUtil.AnonymousClass1 createDefaultAppReviewInfo() {
        return new Object(false, false) {
            private final boolean inApp;
            private final boolean show;

            public static /* synthetic */ AnonymousClass1 copy$default(AnonymousClass1 r0, boolean z, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = r0.show;
                }
                if ((i & 2) != 0) {
                    z2 = r0.inApp;
                }
                return r0.copy(z, z2);
            }

            public final boolean component1() {
                return this.show;
            }

            public final boolean component2() {
                return this.inApp;
            }

            @NotNull
            public final AnonymousClass1 copy(boolean z, boolean z2) {
                return 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: RETURN  
                      (wrap: o.CommonUtil$1 : 0x0003: CONSTRUCTOR  (r0v0 o.CommonUtil$1) = false, false call: o.CommonUtil.1.<init>(boolean, boolean):void type: CONSTRUCTOR)
                     in method: o.onFragmentCreate.createDefaultAppReviewInfo():o.CommonUtil$1, dex: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0003: CONSTRUCTOR  (r0v0 o.CommonUtil$1) = false, false call: o.CommonUtil.1.<init>(boolean, boolean):void type: CONSTRUCTOR in method: o.onFragmentCreate.createDefaultAppReviewInfo():o.CommonUtil$1, dex: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 29 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Method generation error
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:274)
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
                    	... 33 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0005: RETURN  
                      (wrap: o.CommonUtil$1 : 0x0002: CONSTRUCTOR  (r0v0 o.CommonUtil$1) = (r2v0 'z' boolean), (r3v0 'z2' boolean) call: o.CommonUtil.1.<init>(boolean, boolean):void type: CONSTRUCTOR)
                     in method: o.CommonUtil.1.copy(boolean, boolean):o.CommonUtil$1, dex: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	... 50 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  (r0v0 o.CommonUtil$1) = (r2v0 'z' boolean), (r3v0 'z2' boolean) call: o.CommonUtil.1.<init>(boolean, boolean):void type: CONSTRUCTOR in method: o.CommonUtil.1.copy(boolean, boolean):o.CommonUtil$1, dex: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 59 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: o.CommonUtil.1
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:649)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	... 63 more
                    */
                /*
                    this = this;
                    o.CommonUtil$1 r0 = new o.CommonUtil$1
                    r1 = 0
                    r0.<init>(r1, r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.onFragmentCreate.createDefaultAppReviewInfo():o.CommonUtil$1");
            }

            /* access modifiers changed from: private */
            /* renamed from: onGetLastPlayStoreReviewShow */
            public TitleBarRightButtonView.AnonymousClass1<CommonUtil.AnonymousClass1> lambda$onGotPlayStoreReviewFeature$2(RVManifest rVManifest, PlayStoreReviewConfig playStoreReviewConfig) {
                boolean z;
                if (rVManifest == null || rVManifest.getTriggerTime() == null) {
                    z = true;
                } else {
                    long time = new Date().getTime() - SIXTY_ONE_DAY_IN_MILLIS;
                    try {
                        time = Long.parseLong(rVManifest.getActionTime());
                    } catch (Exception unused) {
                    }
                    long differenceDays = getDifferenceDays(new Date().getTime(), time);
                    z = PlayStoreReviewActionKey.OPEN.equals(rVManifest.getAction()) ? isExpire(differenceDays, playStoreReviewConfig.getOptionRateCountdown()).booleanValue() : isExpire(differenceDays, playStoreReviewConfig.getOptionSkipCountdown()).booleanValue();
                }
                return TitleBarRightButtonView.AnonymousClass1.just(new CommonUtil.AnonymousClass1(z, playStoreReviewConfig.isShowInAppReview()));
            }

            private Boolean isExpire(long j, int i) {
                return Boolean.valueOf(j > ((long) i));
            }
        }
