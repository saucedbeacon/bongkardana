package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.valueOf;
import java.util.List;
import o.changeMenuMode;
import o.removeItemAt;

public abstract class setGroupEnabled<T, VH extends RecyclerView.valueOf> extends RecyclerView.Adapter<VH> {
    private final removeItemAt.setMin<T> setMax = new removeItemAt.setMin<T>() {
    };
    public final removeItemAt<T> setMin;

    public setGroupEnabled(@NonNull changeMenuMode.setMin<T> setmin) {
        removeItemAt<T> removeitemat = new removeItemAt<>(this, setmin);
        this.setMin = removeitemat;
        removeitemat.getMax.add(this.setMax);
    }

    public final void setMin(@Nullable setExclusiveItemChecked<T> setexclusiveitemchecked) {
        setExclusiveItemChecked<T> setexclusiveitemchecked2;
        int i;
        removeItemAt<T> removeitemat = this.setMin;
        if (setexclusiveitemchecked != null) {
            if (removeitemat.toFloatRange == null && removeitemat.IsOverlapping == null) {
                removeitemat.getMin = setexclusiveitemchecked.setMin();
            } else if (setexclusiveitemchecked.setMin() != removeitemat.getMin) {
                throw new IllegalArgumentException("AsyncPagedListDiffer cannot handle both contiguous and non-contiguous lists.");
            }
        }
        int i2 = removeitemat.equals + 1;
        removeitemat.equals = i2;
        if (setexclusiveitemchecked == removeitemat.toFloatRange) {
            return;
        }
        if (setexclusiveitemchecked == null) {
            if (removeitemat.toFloatRange != null) {
                i = removeitemat.toFloatRange.size();
            } else {
                i = removeitemat.IsOverlapping == null ? 0 : removeitemat.IsOverlapping.size();
            }
            if (removeitemat.toFloatRange != null) {
                removeitemat.toFloatRange.getMax(removeitemat.isInside);
                removeitemat.toFloatRange = null;
            } else if (removeitemat.IsOverlapping != null) {
                removeitemat.IsOverlapping = null;
            }
            removeitemat.setMin.length(0, i);
            removeitemat.getMax((Runnable) null);
        } else if (removeitemat.toFloatRange == null && removeitemat.IsOverlapping == null) {
            removeitemat.toFloatRange = setexclusiveitemchecked;
            setexclusiveitemchecked.setMax((List<T>) null, removeitemat.isInside);
            removeitemat.setMin.setMax(0, setexclusiveitemchecked.size());
            removeitemat.getMax((Runnable) null);
        } else {
            if (removeitemat.toFloatRange != null) {
                removeitemat.toFloatRange.getMax(removeitemat.isInside);
                setExclusiveItemChecked<T> setexclusiveitemchecked3 = removeitemat.toFloatRange;
                if (!setexclusiveitemchecked3.toIntRange()) {
                    setexclusiveitemchecked3 = new findGroupIndex<>(setexclusiveitemchecked3);
                }
                removeitemat.IsOverlapping = setexclusiveitemchecked3;
                removeitemat.toFloatRange = null;
            }
            if (removeitemat.IsOverlapping == null || removeitemat.toFloatRange != null) {
                throw new IllegalStateException("must be in snapshot state to diff");
            }
            setExclusiveItemChecked<T> setexclusiveitemchecked4 = removeitemat.IsOverlapping;
            if (setexclusiveitemchecked.toIntRange()) {
                setexclusiveitemchecked2 = setexclusiveitemchecked;
            } else {
                setexclusiveitemchecked2 = new findGroupIndex<>(setexclusiveitemchecked);
            }
            removeitemat.length.setMin.execute(new Runnable(setexclusiveitemchecked4, setexclusiveitemchecked2, i2, setexclusiveitemchecked) {
                final /* synthetic */ setExclusiveItemChecked getMax;
                final /* synthetic */ setExclusiveItemChecked getMin;
                final /* synthetic */ Runnable length;
                final /* synthetic */ setExclusiveItemChecked setMax;
                final /* synthetic */ int setMin;

                public final void run(
/*
Method generation error in method: o.removeItemAt.1.run():void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.removeItemAt.1.run():void, class status: UNLOADED
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
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final T length(int i) {
        removeItemAt<T> removeitemat = this.setMin;
        if (removeitemat.toFloatRange != null) {
            removeitemat.toFloatRange.getMax(i);
            return removeitemat.toFloatRange.get(i);
        } else if (removeitemat.IsOverlapping != null) {
            return removeitemat.IsOverlapping.get(i);
        } else {
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
    }

    public int getItemCount() {
        removeItemAt<T> removeitemat = this.setMin;
        if (removeitemat.toFloatRange != null) {
            return removeitemat.toFloatRange.size();
        }
        if (removeitemat.IsOverlapping == null) {
            return 0;
        }
        return removeitemat.IsOverlapping.size();
    }
}
