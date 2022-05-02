package o;

import id.dana.domain.statement.StatementType;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0011B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0002J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/domain/statement/interactor/GetAllStatementDetail;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/statement/model/UserStatementDetail;", "Lid/dana/domain/statement/interactor/GetAllStatementDetail$Params;", "userStatementRepository", "Lid/dana/domain/statement/UserStatementRepository;", "(Lid/dana/domain/statement/UserStatementRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "getStatementDetail", "type", "Lid/dana/domain/statement/StatementType;", "toUserStatementDetail", "incomes", "expenses", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getCallbackPackageName extends APWebChromeClient<List<? extends deferScanIfNeeded>, setMax> {
    private final getBackgroundFlag userStatementRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getCallbackPackageName(@NotNull getBackgroundFlag getbackgroundflag) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getbackgroundflag, "userStatementRepository");
        this.userStatementRepository = getbackgroundflag;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<deferScanIfNeeded>> buildUseCase(@NotNull setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "params");
        TitleBarRightButtonView.AnonymousClass1<R> zipWith = getStatementDetail(setmax, StatementType.INCOME).zipWith(getStatementDetail(setmax, StatementType.EXPENSE), new removeNode() {
            public final /* synthetic */ java.lang.Object setMax(
/*
Method generation error in method: o.StartRMData.1.setMax(java.lang.Object, java.lang.Object):java.lang.Object, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.StartRMData.1.setMax(java.lang.Object, java.lang.Object):java.lang.Object, class status: UNLOADED
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
        Intrinsics.checkNotNullExpressionValue(zipWith, "getStatementDetail(param…::toUserStatementDetail))");
        return zipWith;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lid/dana/domain/statement/model/UserStatementDetail;", "p1", "p2", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class getMin extends FunctionReferenceImpl implements Function2<deferScanIfNeeded, deferScanIfNeeded, List<? extends deferScanIfNeeded>> {
        getMin(getCallbackPackageName getcallbackpackagename) {
            super(2, getcallbackpackagename, getCallbackPackageName.class, "toUserStatementDetail", "toUserStatementDetail(Lid/dana/domain/statement/model/UserStatementDetail;Lid/dana/domain/statement/model/UserStatementDetail;)Ljava/util/List;", 0);
        }

        @NotNull
        public final List<deferScanIfNeeded> invoke(@NotNull deferScanIfNeeded deferscanifneeded, @NotNull deferScanIfNeeded deferscanifneeded2) {
            Intrinsics.checkNotNullParameter(deferscanifneeded, "p1");
            Intrinsics.checkNotNullParameter(deferscanifneeded2, "p2");
            return ((getCallbackPackageName) this.receiver).toUserStatementDetail(deferscanifneeded, deferscanifneeded2);
        }
    }

    private final TitleBarRightButtonView.AnonymousClass1<deferScanIfNeeded> getStatementDetail(setMax setmax, StatementType statementType) {
        return this.userStatementRepository.getStatementDetail(setmax.getDateStart(), setmax.getDateEnd(), statementType);
    }

    /* access modifiers changed from: private */
    public final List<deferScanIfNeeded> toUserStatementDetail(deferScanIfNeeded deferscanifneeded, deferScanIfNeeded deferscanifneeded2) {
        ArrayList arrayList = new ArrayList();
        deferscanifneeded.setStatementType(StatementType.INCOME);
        deferscanifneeded2.setStatementType(StatementType.EXPENSE);
        arrayList.add(deferscanifneeded);
        arrayList.add(deferscanifneeded2);
        return arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lid/dana/domain/statement/interactor/GetAllStatementDetail$Params;", "", "dateStart", "", "dateEnd", "(JJ)V", "getDateEnd", "()J", "getDateStart", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private final long dateEnd;
        private final long dateStart;

        public static /* synthetic */ setMax copy$default(setMax setmax, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = setmax.dateStart;
            }
            if ((i & 2) != 0) {
                j2 = setmax.dateEnd;
            }
            return setmax.copy(j, j2);
        }

        public final long component1() {
            return this.dateStart;
        }

        public final long component2() {
            return this.dateEnd;
        }

        @NotNull
        public final setMax copy(long j, long j2) {
            return new setMax(j, j2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof setMax)) {
                return false;
            }
            setMax setmax = (setMax) obj;
            return this.dateStart == setmax.dateStart && this.dateEnd == setmax.dateEnd;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(dateStart=");
            sb.append(this.dateStart);
            sb.append(", dateEnd=");
            sb.append(this.dateEnd);
            sb.append(")");
            return sb.toString();
        }

        public setMax(long j, long j2) {
            this.dateStart = j;
            this.dateEnd = j2;
        }

        public final long getDateStart() {
            return this.dateStart;
        }

        public final long getDateEnd() {
            return this.dateEnd;
        }

        public final int hashCode() {
            return (Long.valueOf(this.dateStart).hashCode() * 31) + Long.valueOf(this.dateEnd).hashCode();
        }
    }
}
