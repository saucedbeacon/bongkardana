package in.srain.cube.views.ptr.header;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import in.srain.cube.views.ptr.PtrFrameLayout;
import java.util.ArrayList;
import o.TinyAppActionStateManager;
import o.TinyBlurMenu;

public class StoreHouseHeader extends View implements TinyAppActionStateManager.Holder {
    private float FastBitmap$CoordinateSystem = 0.4f;
    private boolean Grayscale$Algorithm = false;
    private float IsOverlapping = 0.0f;
    private int Mean$Arithmetic = -1;
    private int equals = 0;
    private float getMax = 1.0f;
    private int getMin = -1;
    /* access modifiers changed from: private */
    public float hashCode = 1.0f;
    private Transformation invoke = new Transformation();
    /* access modifiers changed from: private */
    public int invokeSuspend = 400;
    private int isInside = 0;
    private int length = -1;
    public ArrayList<TinyBlurMenu.AnonymousClass11> mItemList = new ArrayList<>();
    private float setMax = 0.7f;
    private int setMin = -1;
    /* access modifiers changed from: private */
    public float toDoubleRange = 0.4f;
    private int toFloatRange = 0;
    private int toIntRange = 0;
    /* access modifiers changed from: private */
    public int toString = 1000;
    private length valueOf = new length(this, (byte) 0);
    /* access modifiers changed from: private */
    public int values = 1000;

    public void onUIRefreshPrepare(PtrFrameLayout ptrFrameLayout) {
    }

    public StoreHouseHeader(Context context) {
        super(context);
        length();
    }

    public StoreHouseHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        length();
    }

    public StoreHouseHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        length();
    }

    private void length() {
        TinyBlurMenu.AnonymousClass6.length(getContext());
        this.getMin = (int) ((TinyBlurMenu.AnonymousClass6.setMin * 1.0f) + 0.5f);
        this.setMin = (int) ((TinyBlurMenu.AnonymousClass6.setMin * 40.0f) + 0.5f);
        this.length = TinyBlurMenu.AnonymousClass6.getMax / 2;
    }

    public int getLoadingAniDuration() {
        return this.values;
    }

    public void setLoadingAniDuration(int i) {
        this.values = i;
        this.toString = i;
    }

    public StoreHouseHeader setLineWidth(int i) {
        this.getMin = i;
        for (int i2 = 0; i2 < this.mItemList.size(); i2++) {
            this.mItemList.get(i2).getMax(i);
        }
        return this;
    }

    public StoreHouseHeader setTextColor(int i) {
        this.Mean$Arithmetic = i;
        for (int i2 = 0; i2 < this.mItemList.size(); i2++) {
            this.mItemList.get(i2).setMax.setColor(i);
        }
        return this;
    }

    public StoreHouseHeader setDropHeight(int i) {
        this.setMin = i;
        return this;
    }

    public void initWithString(String str) {
        initWithString(str, 25);
    }

    public void initWithString(String str, int i) {
        initWithPointList(TinyBlurMenu.AnonymousClass10.getMin(str, ((float) i) * 0.01f));
    }

    public void initWithStringArray(int i) {
        String[] stringArray = getResources().getStringArray(i);
        ArrayList arrayList = new ArrayList();
        for (String split : stringArray) {
            String[] split2 = split.split(",");
            float[] fArr = new float[4];
            for (int i2 = 0; i2 < 4; i2++) {
                fArr[i2] = Float.parseFloat(split2[i2]);
            }
            arrayList.add(fArr);
        }
        initWithPointList(arrayList);
    }

    public float getScale() {
        return this.getMax;
    }

    public void setScale(float f) {
        this.getMax = f;
    }

    public void initWithPointList(ArrayList<float[]> arrayList) {
        boolean z = this.mItemList.size() > 0;
        this.mItemList.clear();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < arrayList.size(); i++) {
            float[] fArr = arrayList.get(i);
            PointF pointF = new PointF(((float) ((int) ((fArr[0] * TinyBlurMenu.AnonymousClass6.setMin) + 0.5f))) * this.getMax, ((float) ((int) ((fArr[1] * TinyBlurMenu.AnonymousClass6.setMin) + 0.5f))) * this.getMax);
            PointF pointF2 = new PointF(((float) ((int) ((fArr[2] * TinyBlurMenu.AnonymousClass6.setMin) + 0.5f))) * this.getMax, ((float) ((int) ((fArr[3] * TinyBlurMenu.AnonymousClass6.setMin) + 0.5f))) * this.getMax);
            f = Math.max(Math.max(f, pointF.x), pointF2.x);
            f2 = Math.max(Math.max(f2, pointF.y), pointF2.y);
            TinyBlurMenu.AnonymousClass11 r5 = new Animation(i, pointF, pointF2, this.Mean$Arithmetic, this.getMin) {
                private float IsOverlapping;
                private float equals;
                public PointF getMax;
                public int getMin;
                public PointF length;
                public final Paint setMax;
                public float setMin;
                public PointF toIntRange;

                public final void getMax(
/*
Method generation error in method: o.TinyBlurMenu.11.getMax(int):void, dex: classes6.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.TinyBlurMenu.11.getMax(int):void, class status: UNLOADED
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
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:221)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
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

                public final void setMin(
/*
Method generation error in method: o.TinyBlurMenu.11.setMin(int):void, dex: classes6.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.TinyBlurMenu.11.setMin(int):void, class status: UNLOADED
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
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:221)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
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

                public final void applyTransformation(
/*
Method generation error in method: o.TinyBlurMenu.11.applyTransformation(float, android.view.animation.Transformation):void, dex: classes6.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.TinyBlurMenu.11.applyTransformation(float, android.view.animation.Transformation):void, class status: UNLOADED
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
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:221)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
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

                public final void getMax(
/*
Method generation error in method: o.TinyBlurMenu.11.getMax(float, float):void, dex: classes6.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.TinyBlurMenu.11.getMax(float, float):void, class status: UNLOADED
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
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:221)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
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
            };
            r5.setMin(this.length);
            this.mItemList.add(r5);
        }
        this.isInside = (int) Math.ceil((double) f);
        this.toIntRange = (int) Math.ceil((double) f2);
        if (z) {
            requestLayout();
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.IsOverlapping;
        int save = canvas.save();
        int size = this.mItemList.size();
        for (int i = 0; i < size; i++) {
            canvas.save();
            TinyBlurMenu.AnonymousClass11 r4 = this.mItemList.get(i);
            float f2 = ((float) this.toFloatRange) + r4.length.x;
            float f3 = ((float) this.equals) + r4.length.y;
            if (this.Grayscale$Algorithm) {
                r4.getTransformation(getDrawingTime(), this.invoke);
                canvas.translate(f2, f3);
            } else {
                float f4 = 0.0f;
                if (f == 0.0f) {
                    r4.setMin(this.length);
                } else {
                    float f5 = this.setMax;
                    float f6 = ((1.0f - f5) * ((float) i)) / ((float) size);
                    float f7 = (1.0f - f5) - f6;
                    if (f == 1.0f || f >= 1.0f - f7) {
                        canvas.translate(f2, f3);
                        r4.setMax.setAlpha((int) (this.FastBitmap$CoordinateSystem * 255.0f));
                    } else {
                        if (f > f6) {
                            f4 = Math.min(1.0f, (f - f6) / f5);
                        }
                        float f8 = 1.0f - f4;
                        float f9 = f2 + (r4.setMin * f8);
                        float f10 = f3 + (((float) (-this.setMin)) * f8);
                        Matrix matrix = new Matrix();
                        matrix.postRotate(360.0f * f4);
                        matrix.postScale(f4, f4);
                        matrix.postTranslate(f9, f10);
                        r4.setMax.setAlpha((int) (this.FastBitmap$CoordinateSystem * f4 * 255.0f));
                        canvas.concat(matrix);
                    }
                }
            }
            canvas.drawLine(r4.getMax.x, r4.getMax.y, r4.toIntRange.x, r4.toIntRange.y, r4.setMax);
            canvas.restore();
        }
        if (this.Grayscale$Algorithm) {
            invalidate();
        }
        canvas.restoreToCount(save);
    }

    class length implements Runnable {
        int getMax;
        boolean getMin;
        int length;
        int setMax;
        int setMin;

        private length() {
            this.length = 0;
            this.getMax = 0;
            this.setMin = 0;
            this.setMax = 0;
            this.getMin = true;
        }

        /* synthetic */ length(StoreHouseHeader storeHouseHeader, byte b) {
            this();
        }

        public final void run() {
            int i = this.length % this.getMax;
            for (int i2 = 0; i2 < this.setMin; i2++) {
                int i3 = (this.getMax * i2) + i;
                if (i3 <= this.length) {
                    TinyBlurMenu.AnonymousClass11 r3 = StoreHouseHeader.this.mItemList.get(i3 % StoreHouseHeader.this.mItemList.size());
                    r3.setFillAfter(false);
                    r3.setFillEnabled(true);
                    r3.setFillBefore(false);
                    r3.setDuration((long) StoreHouseHeader.this.invokeSuspend);
                    r3.getMax(StoreHouseHeader.this.hashCode, StoreHouseHeader.this.toDoubleRange);
                }
            }
            this.length++;
            if (this.getMin) {
                StoreHouseHeader.this.postDelayed(this, (long) this.setMax);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingTop() + ((int) ((TinyBlurMenu.AnonymousClass6.setMin * 10.0f) + 0.5f)) + this.toIntRange + getPaddingBottom() + ((int) ((TinyBlurMenu.AnonymousClass6.setMin * 10.0f) + 0.5f)), 1073741824));
        this.toFloatRange = (getMeasuredWidth() - this.isInside) / 2;
        this.equals = getPaddingTop() + ((int) ((TinyBlurMenu.AnonymousClass6.setMin * 10.0f) + 0.5f));
        this.setMin = getPaddingTop() + ((int) ((TinyBlurMenu.AnonymousClass6.setMin * 10.0f) + 0.5f));
    }

    public void onUIReset(PtrFrameLayout ptrFrameLayout) {
        this.Grayscale$Algorithm = false;
        length length2 = this.valueOf;
        length2.getMin = false;
        StoreHouseHeader.this.removeCallbacks(length2);
        for (int i = 0; i < this.mItemList.size(); i++) {
            this.mItemList.get(i).setMin(this.length);
        }
    }

    public void onUIRefreshBegin(PtrFrameLayout ptrFrameLayout) {
        this.Grayscale$Algorithm = true;
        length length2 = this.valueOf;
        length2.getMin = true;
        length2.length = 0;
        length2.setMax = StoreHouseHeader.this.values / StoreHouseHeader.this.mItemList.size();
        length2.getMax = StoreHouseHeader.this.toString / length2.setMax;
        length2.setMin = (StoreHouseHeader.this.mItemList.size() / length2.getMax) + 1;
        length2.run();
        invalidate();
    }

    public void onUIRefreshComplete(PtrFrameLayout ptrFrameLayout) {
        this.Grayscale$Algorithm = false;
        length length2 = this.valueOf;
        length2.getMin = false;
        StoreHouseHeader.this.removeCallbacks(length2);
    }

    public void onUIPositionChange(PtrFrameLayout ptrFrameLayout, boolean z, byte b, TinyBlurMenu.AnonymousClass1 r4) {
        this.IsOverlapping = Math.min(1.0f, r4.IsOverlapping == 0 ? 0.0f : (((float) r4.getMin) * 1.0f) / ((float) r4.IsOverlapping));
        invalidate();
    }
}
