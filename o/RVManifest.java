package o;

import com.alibaba.fastjson.JSONObject;
import id.dana.data.config.source.amcs.result.PlayStoreReviewConfig;
import javax.inject.Inject;
import o.RVMain;
import o.TitleBarRightButtonView;
import o.b;

public class RVManifest {
    private String action;
    private String actionTime;
    private String triggerTime;

    final class IProxyManifest implements RedDotDrawable {
        private final RVMain.AnonymousClass4 length;

        public IProxyManifest(RVMain.AnonymousClass4 r1) {
            this.length = r1;
        }

        public final Object apply(Object obj) {
            return this.length.apply(obj);
        }
    }

    public final class BridgeExtensionManifest implements getAdapterPosition<RVMain.AnonymousClass4> {

        static final class getMax {
            /* access modifiers changed from: private */
            public static final BridgeExtensionManifest getMin = new BridgeExtensionManifest();
        }

        public final RVMain.AnonymousClass4 get() {
            return newInstance();
        }

        public static BridgeExtensionManifest create() {
            return getMax.getMin;
        }

        public static RVMain.AnonymousClass4 newInstance() {
            return new setSpeed<JSONObject, PlayStoreReviewConfig>() {
                public id.dana.data.config.source.amcs.result.PlayStoreReviewConfig map(
/*
Method generation error in method: o.RVMain.4.map(com.alibaba.fastjson.JSONObject):id.dana.data.config.source.amcs.result.PlayStoreReviewConfig, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.RVMain.4.map(com.alibaba.fastjson.JSONObject):id.dana.data.config.source.amcs.result.PlayStoreReviewConfig, class status: UNLOADED
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
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
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
            };
        }
    }

    public final class ServiceBeanManifest implements RVMain.AnonymousClass5 {
        private final getViewId playStoreReviewPreference;

        public ServiceBeanManifest(getViewId getviewid) {
            this.playStoreReviewPreference = getviewid;
        }

        public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveLastPlayStoreReviewShow(String str, long j, long j2) {
            return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.playStoreReviewPreference.saveLastPlayStoreReviewShow(new RVManifest(str, String.valueOf(j), String.valueOf(j2)))));
        }

        public final TitleBarRightButtonView.AnonymousClass1<RVManifest> getLastPlayStoreReviewShow() {
            return TitleBarRightButtonView.AnonymousClass1.just(this.playStoreReviewPreference.getLastPlayStoreReviewShow());
        }

        public final TitleBarRightButtonView.AnonymousClass1<Integer> getTransactionSuccessCount() {
            return TitleBarRightButtonView.AnonymousClass1.just(Integer.valueOf(this.playStoreReviewPreference.getTransactionSuccessCount()));
        }

        public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveSuccessTransaction(int i) {
            return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.playStoreReviewPreference.saveFirstSuccessTransactionResult(i)));
        }
    }

    public RVManifest() {
    }

    public RVManifest(String str, String str2, String str3) {
        this.action = str;
        this.actionTime = str2;
        this.triggerTime = str3;
    }

    public class LazyProxyManifest extends uncheckItems<RVMain.AnonymousClass5> {
        private final getViewId playStoreReviewPreference;

        @Inject
        public LazyProxyManifest(getViewId getviewid) {
            this.playStoreReviewPreference = getviewid;
        }

        public RVMain.AnonymousClass5 createData(String str) {
            return new ServiceBeanManifest(this.playStoreReviewPreference);
        }
    }

    public final class ProxyManifest implements getAdapterPosition<onFragmentCreate> {
        private final b.C0007b<onCallBack> configEntityDataFactoryProvider;
        private final b.C0007b<LazyProxyManifest> playStoreReviewDataFactoryProvider;
        private final b.C0007b<RVMain.AnonymousClass4> playStoreReviewEntityMapperProvider;

        public ProxyManifest(b.C0007b<LazyProxyManifest> bVar, b.C0007b<onCallBack> bVar2, b.C0007b<RVMain.AnonymousClass4> bVar3) {
            this.playStoreReviewDataFactoryProvider = bVar;
            this.configEntityDataFactoryProvider = bVar2;
            this.playStoreReviewEntityMapperProvider = bVar3;
        }

        public final onFragmentCreate get() {
            return newInstance(this.playStoreReviewDataFactoryProvider.get(), this.configEntityDataFactoryProvider.get(), this.playStoreReviewEntityMapperProvider.get());
        }

        public static ProxyManifest create(b.C0007b<LazyProxyManifest> bVar, b.C0007b<onCallBack> bVar2, b.C0007b<RVMain.AnonymousClass4> bVar3) {
            return new ProxyManifest(bVar, bVar2, bVar3);
        }

        public static onFragmentCreate newInstance(LazyProxyManifest lazyProxyManifest, onCallBack oncallback, RVMain.AnonymousClass4 r3) {
            return new onFragmentCreate(lazyProxyManifest, oncallback, r3);
        }
    }

    public String getTriggerTime() {
        return this.triggerTime;
    }

    public void setTriggerTime(String str) {
        this.triggerTime = str;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public String getActionTime() {
        return this.actionTime;
    }

    public void setActionTime(String str) {
        this.actionTime = str;
    }
}
