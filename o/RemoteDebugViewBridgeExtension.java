package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import dagger.Lazy;
import id.dana.data.base.BasePersistenceDao;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.LocalAuthPermissionManager;
import o.TitleBarRightButtonView;

@Singleton
public class RemoteDebugViewBridgeExtension extends reverseAnimationSpeed implements onRemoteDebugExitClick {
    private final LocalAuthPermissionManager.a splitBillDetailResultMapper;
    private final LocalAuthPermissionManager.SCOPE splitBillHistoriesResultMapper;

    @Inject
    public RemoteDebugViewBridgeExtension(Lazy<BasePersistenceDao> lazy, LocalAuthPermissionManager.SCOPE scope, LocalAuthPermissionManager.a aVar) {
        super(lazy);
        this.splitBillHistoriesResultMapper = scope;
        this.splitBillDetailResultMapper = aVar;
    }

    public TitleBarRightButtonView.AnonymousClass1<Long> saveSplitBillHistory(sendNetworkResponse sendnetworkresponse) {
        return TitleBarRightButtonView.AnonymousClass1.defer(new showRemoteDebugPanel(this, sendnetworkresponse));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$saveSplitBillHistory$0(sendNetworkResponse sendnetworkresponse) throws Exception {
        Long saveSplitBillHistory = getDb().splitBillHistoryDao().saveSplitBillHistory(sendnetworkresponse);
        getSplitBillDao().deleteOldSplitBillHistories();
        return TitleBarRightButtonView.AnonymousClass1.just(saveSplitBillHistory);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getSplitBillHistories$1() throws Exception {
        TitleBarRightButtonView.AnonymousClass1<T> just = TitleBarRightButtonView.AnonymousClass1.just(getLocalHistories());
        LocalAuthPermissionManager.SCOPE scope = this.splitBillHistoriesResultMapper;
        Objects.requireNonNull(scope);
        return just.map(new RedDotDrawable(scope) {
            private final LocalAuthPermissionManager.SCOPE setMin;

            {
                this.setMin = r1;
            }

            public final Object apply(Object obj) {
                return this.setMin.apply(obj);
            }
        });
    }

    public TitleBarRightButtonView.AnonymousClass1<tyroRequest> getSplitBillHistories(int i) {
        return TitleBarRightButtonView.AnonymousClass1.defer(new showRemoteDebugMask(this));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> updateSplitBillHistories(List<sendNetworkResponse> list) {
        return TitleBarRightButtonView.AnonymousClass1.defer(new tinyAppStandardLog(this, list));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$updateSplitBillHistories$2(List list) throws Exception {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sendNetworkResponse sendnetworkresponse = (sendNetworkResponse) it.next();
            sendNetworkResponse historyById = getDb().splitBillHistoryDao().getHistoryById(sendnetworkresponse.getSplitBillId());
            if (historyById != null) {
                updateSplitBillStatus(sendnetworkresponse, historyById);
            } else {
                getSplitBillDao().saveSplitBillHistory(sendnetworkresponse);
            }
        }
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
    }

    public void clearAll() {
        getDb().splitBillHistoryDao().clearAll();
    }

    public TitleBarRightButtonView.AnonymousClass1<onSocketClose> getSplitBillDetail(String str) {
        return TitleBarRightButtonView.AnonymousClass1.defer(new Callable(this, str) {
            private final String getMin;
            private final RemoteDebugViewBridgeExtension setMin;

            public final java.lang.Object call(
/*
Method generation error in method: o.RemoteDebugBridgeExtension.1.call():java.lang.Object, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.RemoteDebugBridgeExtension.1.call():java.lang.Object, class status: UNLOADED
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
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getSplitBillDetail$3(String str) throws Exception {
        TitleBarRightButtonView.AnonymousClass1 just = TitleBarRightButtonView.AnonymousClass1.just(getSplitBillDao().getHistoryById(str));
        LocalAuthPermissionManager.a aVar = this.splitBillDetailResultMapper;
        Objects.requireNonNull(aVar);
        return just.map(new sendNetworkRequest(aVar));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> updateSplitBillDetail(sendNetworkResponse sendnetworkresponse) {
        return TitleBarRightButtonView.AnonymousClass1.defer(new RemoteDebugMessageUtils(this, sendnetworkresponse));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$updateSplitBillDetail$4(sendNetworkResponse sendnetworkresponse) throws Exception {
        sendNetworkResponse historyById = getDb().splitBillHistoryDao().getHistoryById(sendnetworkresponse.getSplitBillId());
        if (historyById != null) {
            updateSplitBillHistory(historyById, sendnetworkresponse);
        } else {
            getSplitBillDao().saveSplitBillHistory(sendnetworkresponse);
        }
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
    }

    private void updateSplitBillStatus(sendNetworkResponse sendnetworkresponse, sendNetworkResponse sendnetworkresponse2) {
        sendnetworkresponse2.setStatus(sendnetworkresponse.getStatus());
        sendnetworkresponse2.setLastUpdated(getBadgeList.getNowDateInEpoch());
        sendnetworkresponse2.setCreatedDate(sendnetworkresponse.getCreatedDate());
        getSplitBillDao().updateSplitBillHistoryEntity(sendnetworkresponse2);
    }

    private List<sendNetworkResponse> getLocalHistories() {
        return getSplitBillDao().getSplitBillHistories();
    }

    private void updateSplitBillHistory(sendNetworkResponse sendnetworkresponse, sendNetworkResponse sendnetworkresponse2) {
        sendnetworkresponse.setLastUpdated(getBadgeList.getNowDateInEpoch());
        sendnetworkresponse.setPayers(sendnetworkresponse2.getPayers());
        sendnetworkresponse.setStatus(sendnetworkresponse2.getStatus());
        getSplitBillDao().updateSplitBillHistoryEntity(sendnetworkresponse);
    }

    private isRemoteDebugMode getSplitBillDao() {
        return getDb().splitBillHistoryDao();
    }

    public TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> closePayers(List<String> list, String str) {
        throw new UnsupportedOperationException();
    }
}
