package o;

import android.opengl.GLSurfaceView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.overlay.Overlay;
import com.otaliastudios.cameraview.preview.RendererThread;
import com.otaliastudios.cameraview.video.encoding.EncoderThread;
import o.didChildRangeChange;

@RequiresApi(api = 18)
public class processAdapterUpdatesAndSetAnimationFlags extends findNextViewToFocus implements isAccessibilityEnabled, didChildRangeChange.length {
    private static final String getMax;
    private static final CameraLogger setMin;
    private int FastBitmap$CoordinateSystem;
    private final Object IsOverlapping = new Object();
    private setItemAnimator equals;
    private addOnItemTouchListener hashCode;
    private int isInside;
    private didChildRangeChange length;
    private Overlay toDoubleRange;
    private int toFloatRange;
    private int toIntRange;
    private setChildDrawingOrderCallback toString;
    private boolean values;

    static {
        String simpleName = processAdapterUpdatesAndSetAnimationFlags.class.getSimpleName();
        getMax = simpleName;
        setMin = CameraLogger.setMin(simpleName);
    }

    public processAdapterUpdatesAndSetAnimationFlags(@NonNull initChildrenHelper initchildrenhelper, @NonNull setItemAnimator setitemanimator, @Nullable Overlay overlay, int i) {
        super(initchildrenhelper);
        boolean z = true;
        this.isInside = 1;
        this.toIntRange = 1;
        this.toFloatRange = 0;
        this.equals = setitemanimator;
        this.toDoubleRange = overlay;
        this.values = (overlay == null || !overlay.drawsOn(Overlay.Target.VIDEO_SNAPSHOT)) ? false : z;
        this.FastBitmap$CoordinateSystem = i;
    }

    /* access modifiers changed from: protected */
    public final void setMin() {
        setItemAnimator setitemanimator = this.equals;
        ((GLSurfaceView) setitemanimator.getMax).queueEvent(new Runnable(this) {
            final /* synthetic */ isAccessibilityEnabled setMax;

            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setItemAnimator.3.run():void, class status: UNLOADED
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
            /*  JADX ERROR: Method generation error: Method args not loaded: o.setItemAnimator.3.run():void, class status: UNLOADED
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setItemAnimator.3.run():void, class status: UNLOADED
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
            public final void run(
/*
Method generation error in method: o.setItemAnimator.3.run():void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setItemAnimator.3.run():void, class status: UNLOADED
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
        this.toIntRange = 0;
        isInside();
    }

    /* access modifiers changed from: protected */
    public final void length(boolean z) {
        if (z) {
            setMin.getMax(1, "Stopping the encoder engine from isCameraShutdown.");
            this.toIntRange = 1;
            this.isInside = 1;
            synchronized (this.IsOverlapping) {
                if (this.length != null) {
                    this.length.length();
                    this.length = null;
                }
            }
            return;
        }
        this.toIntRange = 1;
    }

    @RendererThread
    public final void setMax(int i) {
        this.toFloatRange = i;
        if (this.values) {
            this.hashCode = new addOnItemTouchListener(this.toDoubleRange, this.getMin.length);
        }
    }

    @RendererThread
    public final void setMax(@NonNull setChildDrawingOrderCallback setchilddrawingordercallback) {
        setChildDrawingOrderCallback min = setchilddrawingordercallback.setMin();
        this.toString = min;
        min.getMax(this.getMin.length.getMax, this.getMin.length.getMin);
        synchronized (this.IsOverlapping) {
            if (this.length != null) {
                this.length.getMin("filter", this.toString);
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0266  */
    @com.otaliastudios.cameraview.preview.RendererThread
    public final void length(@androidx.annotation.NonNull android.graphics.SurfaceTexture r25, float r26, float r27) {
        /*
            r24 = this;
            r9 = r24
            int r0 = r9.isInside
            r11 = 0
            r12 = 1
            if (r0 != r12) goto L_0x02b6
            int r0 = r9.toIntRange
            if (r0 != 0) goto L_0x02b6
            com.otaliastudios.cameraview.CameraLogger r0 = setMin
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.String r2 = "Starting the encoder engine."
            r1[r11] = r2
            r0.getMax(r12, r1)
            o.exceptionLabel$setMax r0 = r9.getMin
            int r0 = r0.FastBitmap$CoordinateSystem
            if (r0 > 0) goto L_0x0023
            o.exceptionLabel$setMax r0 = r9.getMin
            r1 = 30
            r0.FastBitmap$CoordinateSystem = r1
        L_0x0023:
            o.exceptionLabel$setMax r0 = r9.getMin
            int r0 = r0.toString
            if (r0 > 0) goto L_0x0046
            o.exceptionLabel$setMax r0 = r9.getMin
            o.exceptionLabel$setMax r1 = r9.getMin
            o.shouldDeferAccessibilityEvent r1 = r1.length
            o.exceptionLabel$setMax r2 = r9.getMin
            int r2 = r2.FastBitmap$CoordinateSystem
            r3 = 1032805417(0x3d8f5c29, float:0.07)
            int r4 = r1.getMax
            float r4 = (float) r4
            float r4 = r4 * r3
            int r1 = r1.getMin
            float r1 = (float) r1
            float r4 = r4 * r1
            float r1 = (float) r2
            float r4 = r4 * r1
            int r1 = (int) r4
            r0.toString = r1
        L_0x0046:
            o.exceptionLabel$setMax r0 = r9.getMin
            int r0 = r0.values
            if (r0 > 0) goto L_0x0053
            o.exceptionLabel$setMax r0 = r9.getMin
            r1 = 64000(0xfa00, float:8.9683E-41)
            r0.values = r1
        L_0x0053:
            int[] r0 = o.processAdapterUpdatesAndSetAnimationFlags.AnonymousClass5.getMax
            o.exceptionLabel$setMax r1 = r9.getMin
            com.otaliastudios.cameraview.controls.VideoCodec r1 = r1.toFloatRange
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 3
            r13 = 2
            if (r0 == r12) goto L_0x0071
            if (r0 == r13) goto L_0x006e
            if (r0 == r1) goto L_0x006b
            java.lang.String r0 = ""
        L_0x0069:
            r8 = r0
            goto L_0x0074
        L_0x006b:
            java.lang.String r0 = "video/avc"
            goto L_0x0069
        L_0x006e:
            java.lang.String r0 = "video/avc"
            goto L_0x0069
        L_0x0071:
            java.lang.String r0 = "video/3gpp"
            goto L_0x0069
        L_0x0074:
            java.lang.String r14 = "audio/mp4a-latm"
            o.animateDisappearance r15 = new o.animateDisappearance
            r15.<init>()
            o.recoverFocusFromState r7 = new o.recoverFocusFromState
            r7.<init>()
            o.exceptionLabel$setMax r0 = r9.getMin
            com.otaliastudios.cameraview.controls.Audio r0 = r0.toIntRange
            com.otaliastudios.cameraview.controls.Audio r2 = com.otaliastudios.cameraview.controls.Audio.ON
            if (r0 != r2) goto L_0x008c
            int r0 = r7.setMin
            r6 = r0
            goto L_0x00a1
        L_0x008c:
            o.exceptionLabel$setMax r0 = r9.getMin
            com.otaliastudios.cameraview.controls.Audio r0 = r0.toIntRange
            com.otaliastudios.cameraview.controls.Audio r2 = com.otaliastudios.cameraview.controls.Audio.MONO
            if (r0 != r2) goto L_0x0096
            r6 = 1
            goto L_0x00a1
        L_0x0096:
            o.exceptionLabel$setMax r0 = r9.getMin
            com.otaliastudios.cameraview.controls.Audio r0 = r0.toIntRange
            com.otaliastudios.cameraview.controls.Audio r2 = com.otaliastudios.cameraview.controls.Audio.STEREO
            if (r0 != r2) goto L_0x00a0
            r6 = 2
            goto L_0x00a1
        L_0x00a0:
            r6 = 0
        L_0x00a1:
            if (r6 <= 0) goto L_0x00a6
            r16 = 1
            goto L_0x00a8
        L_0x00a6:
            r16 = 0
        L_0x00a8:
            r0 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
        L_0x00b7:
            if (r17 != 0) goto L_0x01bf
            com.otaliastudios.cameraview.CameraLogger r2 = setMin
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "Checking DeviceEncoders..."
            r3[r11] = r4
            java.lang.String r4 = "videoOffset:"
            r3[r12] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r18)
            r3[r13] = r4
            java.lang.String r4 = "audioOffset:"
            r3[r1] = r4
            r4 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r19)
            r3[r4] = r5
            r2.getMax(r12, r3)
            com.otaliastudios.cameraview.internal.DeviceEncoders r2 = new com.otaliastudios.cameraview.internal.DeviceEncoders     // Catch:{ RuntimeException -> 0x019c }
            r3 = 0
            r4 = r8
            r5 = r14
            r1 = r6
            r6 = r18
            r10 = r7
            r7 = r19
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ RuntimeException -> 0x019e }
            com.otaliastudios.cameraview.internal.DeviceEncoders r7 = new com.otaliastudios.cameraview.internal.DeviceEncoders
            r3 = 1
            r2 = r7
            r4 = r8
            r5 = r14
            r6 = r18
            r12 = r7
            r7 = r19
            r2.<init>(r3, r4, r5, r6, r7)
            o.exceptionLabel$setMax r0 = r9.getMin     // Catch:{ VideoException -> 0x0180, AudioException -> 0x016a }
            o.shouldDeferAccessibilityEvent r0 = r0.length     // Catch:{ VideoException -> 0x0180, AudioException -> 0x016a }
            o.shouldDeferAccessibilityEvent r2 = r12.setMax(r0)     // Catch:{ VideoException -> 0x0180, AudioException -> 0x016a }
            o.exceptionLabel$setMax r0 = r9.getMin     // Catch:{ VideoException -> 0x0166, AudioException -> 0x0162 }
            int r0 = r0.toString     // Catch:{ VideoException -> 0x0166, AudioException -> 0x0162 }
            int r3 = r12.getMax(r0)     // Catch:{ VideoException -> 0x0166, AudioException -> 0x0162 }
            o.exceptionLabel$setMax r0 = r9.getMin     // Catch:{ VideoException -> 0x015c, AudioException -> 0x0156 }
            int r0 = r0.FastBitmap$CoordinateSystem     // Catch:{ VideoException -> 0x015c, AudioException -> 0x0156 }
            int r4 = r12.length(r2, r0)     // Catch:{ VideoException -> 0x015c, AudioException -> 0x0156 }
            r12.length((java.lang.String) r8, (o.shouldDeferAccessibilityEvent) r2, (int) r4, (int) r3)     // Catch:{ VideoException -> 0x014e, AudioException -> 0x0146 }
            if (r16 == 0) goto L_0x0137
            o.exceptionLabel$setMax r0 = r9.getMin     // Catch:{ VideoException -> 0x014e, AudioException -> 0x0146 }
            int r0 = r0.values     // Catch:{ VideoException -> 0x014e, AudioException -> 0x0146 }
            int r5 = r12.getMin(r0)     // Catch:{ VideoException -> 0x014e, AudioException -> 0x0146 }
            int r0 = r10.getMin     // Catch:{ VideoException -> 0x012d, AudioException -> 0x0123 }
            r12.length((java.lang.String) r14, (int) r5, (int) r0, (int) r1)     // Catch:{ VideoException -> 0x012d, AudioException -> 0x0123 }
            r22 = r5
            goto L_0x0137
        L_0x0123:
            r0 = move-exception
            r20 = r2
            r21 = r3
            r23 = r4
            r22 = r5
            goto L_0x016b
        L_0x012d:
            r0 = move-exception
            r20 = r2
            r21 = r3
            r23 = r4
            r22 = r5
            goto L_0x0181
        L_0x0137:
            r6 = r1
            r20 = r2
            r21 = r3
            r23 = r4
            r7 = r10
            r0 = r12
            r1 = 3
            r12 = 1
            r17 = 1
            goto L_0x00b7
        L_0x0146:
            r0 = move-exception
            r20 = r2
            r21 = r3
            r23 = r4
            goto L_0x016b
        L_0x014e:
            r0 = move-exception
            r20 = r2
            r21 = r3
            r23 = r4
            goto L_0x0181
        L_0x0156:
            r0 = move-exception
            r20 = r2
            r21 = r3
            goto L_0x016b
        L_0x015c:
            r0 = move-exception
            r20 = r2
            r21 = r3
            goto L_0x0181
        L_0x0162:
            r0 = move-exception
            r20 = r2
            goto L_0x016b
        L_0x0166:
            r0 = move-exception
            r20 = r2
            goto L_0x0181
        L_0x016a:
            r0 = move-exception
        L_0x016b:
            com.otaliastudios.cameraview.CameraLogger r2 = setMin
            java.lang.Object[] r3 = new java.lang.Object[r13]
            java.lang.String r4 = "Got AudioException:"
            r3[r11] = r4
            java.lang.String r0 = r0.getMessage()
            r4 = 1
            r3[r4] = r0
            r2.getMax(r4, r3)
            int r19 = r19 + 1
            goto L_0x0195
        L_0x0180:
            r0 = move-exception
        L_0x0181:
            r4 = 1
            com.otaliastudios.cameraview.CameraLogger r2 = setMin
            java.lang.Object[] r3 = new java.lang.Object[r13]
            java.lang.String r5 = "Got VideoException:"
            r3[r11] = r5
            java.lang.String r0 = r0.getMessage()
            r3[r4] = r0
            r2.getMax(r4, r3)
            int r18 = r18 + 1
        L_0x0195:
            r6 = r1
            r7 = r10
            r0 = r12
            r1 = 3
            r12 = 1
            goto L_0x00b7
        L_0x019c:
            r1 = r6
            r10 = r7
        L_0x019e:
            r4 = 1
            com.otaliastudios.cameraview.CameraLogger r2 = setMin
            java.lang.Object[] r3 = new java.lang.Object[r13]
            java.lang.String r5 = "Could not respect encoders parameters."
            r3[r11] = r5
            java.lang.String r5 = "Going on again without checking encoders, possibly failing."
            r3[r4] = r5
            r2.getMax(r13, r3)
            o.exceptionLabel$setMax r2 = r9.getMin
            o.shouldDeferAccessibilityEvent r2 = r2.length
            o.exceptionLabel$setMax r3 = r9.getMin
            int r3 = r3.toString
            o.exceptionLabel$setMax r4 = r9.getMin
            int r4 = r4.FastBitmap$CoordinateSystem
            o.exceptionLabel$setMax r5 = r9.getMin
            int r5 = r5.values
            goto L_0x01c9
        L_0x01bf:
            r1 = r6
            r10 = r7
            r2 = r20
            r3 = r21
            r5 = r22
            r4 = r23
        L_0x01c9:
            o.exceptionLabel$setMax r6 = r9.getMin
            r6.length = r2
            o.exceptionLabel$setMax r2 = r9.getMin
            r2.toString = r3
            o.exceptionLabel$setMax r2 = r9.getMin
            r2.values = r5
            o.exceptionLabel$setMax r2 = r9.getMin
            r2.FastBitmap$CoordinateSystem = r4
            o.exceptionLabel$setMax r2 = r9.getMin
            o.shouldDeferAccessibilityEvent r2 = r2.length
            int r2 = r2.getMax
            r15.equals = r2
            o.exceptionLabel$setMax r2 = r9.getMin
            o.shouldDeferAccessibilityEvent r2 = r2.length
            int r2 = r2.getMin
            r15.isInside = r2
            o.exceptionLabel$setMax r2 = r9.getMin
            int r2 = r2.toString
            r15.toFloatRange = r2
            o.exceptionLabel$setMax r2 = r9.getMin
            int r2 = r2.FastBitmap$CoordinateSystem
            r15.hashCode = r2
            o.exceptionLabel$setMax r2 = r9.getMin
            int r2 = r2.getMax
            r15.values = r2
            r15.toDoubleRange = r8
            android.media.MediaCodecInfo r2 = r0.getMin
            if (r2 == 0) goto L_0x0208
            android.media.MediaCodecInfo r2 = r0.getMin
            java.lang.String r2 = r2.getName()
            goto L_0x0209
        L_0x0208:
            r2 = 0
        L_0x0209:
            r15.FastBitmap$CoordinateSystem = r2
            int r2 = r9.toFloatRange
            r15.setMin = r2
            r2 = r26
            r15.getMin = r2
            r2 = r27
            r15.toIntRange = r2
            android.opengl.EGLContext r2 = android.opengl.EGL14.eglGetCurrentContext()
            r15.IsOverlapping = r2
            boolean r2 = r9.values
            if (r2 == 0) goto L_0x022d
            com.otaliastudios.cameraview.overlay.Overlay$Target r2 = com.otaliastudios.cameraview.overlay.Overlay.Target.VIDEO_SNAPSHOT
            r15.getMax = r2
            o.addOnItemTouchListener r2 = r9.hashCode
            r15.length = r2
            int r2 = r9.FastBitmap$CoordinateSystem
            r15.setMax = r2
        L_0x022d:
            o.animateAppearance r3 = new o.animateAppearance
            r3.<init>(r15)
            o.exceptionLabel$setMax r2 = r9.getMin
            r2.getMax = r11
            o.setChildDrawingOrderCallback r2 = r9.toString
            o.exceptionLabel$setMax r4 = r9.getMin
            o.shouldDeferAccessibilityEvent r4 = r4.length
            int r4 = r4.getMax
            o.exceptionLabel$setMax r5 = r9.getMin
            o.shouldDeferAccessibilityEvent r5 = r5.length
            int r5 = r5.getMax
            r2.getMax(r4, r5)
            if (r16 == 0) goto L_0x0266
            o.exceptionLabel$setMax r2 = r9.getMin
            int r2 = r2.values
            r10.setMax = r2
            r10.setMin = r1
            android.media.MediaCodecInfo r1 = r0.getMax
            if (r1 == 0) goto L_0x025c
            android.media.MediaCodecInfo r0 = r0.getMax
            java.lang.String r0 = r0.getName()
            goto L_0x025d
        L_0x025c:
            r0 = 0
        L_0x025d:
            r10.length = r0
            o.getDeepestFocusedViewWithId r0 = new o.getDeepestFocusedViewWithId
            r0.<init>(r10)
            r4 = r0
            goto L_0x0267
        L_0x0266:
            r4 = 0
        L_0x0267:
            java.lang.Object r10 = r9.IsOverlapping
            monitor-enter(r10)
            o.didChildRangeChange r0 = new o.didChildRangeChange     // Catch:{ all -> 0x02b3 }
            o.exceptionLabel$setMax r1 = r9.getMin     // Catch:{ all -> 0x02b3 }
            java.io.File r2 = r1.setMin     // Catch:{ all -> 0x02b3 }
            o.exceptionLabel$setMax r1 = r9.getMin     // Catch:{ all -> 0x02b3 }
            int r5 = r1.hashCode     // Catch:{ all -> 0x02b3 }
            o.exceptionLabel$setMax r1 = r9.getMin     // Catch:{ all -> 0x02b3 }
            long r6 = r1.IsOverlapping     // Catch:{ all -> 0x02b3 }
            r1 = r0
            r8 = r24
            r1.<init>(r2, r3, r4, r5, r6, r8)     // Catch:{ all -> 0x02b3 }
            r9.length = r0     // Catch:{ all -> 0x02b3 }
            java.lang.String r1 = "filter"
            o.setChildDrawingOrderCallback r2 = r9.toString     // Catch:{ all -> 0x02b3 }
            r0.getMin(r1, r2)     // Catch:{ all -> 0x02b3 }
            o.didChildRangeChange r0 = r9.length     // Catch:{ all -> 0x02b3 }
            com.otaliastudios.cameraview.CameraLogger r1 = o.didChildRangeChange.getMax     // Catch:{ all -> 0x02b3 }
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ all -> 0x02b3 }
            java.lang.String r3 = "Passing event to encoders:"
            r2[r11] = r3     // Catch:{ all -> 0x02b3 }
            java.lang.String r3 = "START"
            r4 = 1
            r2[r4] = r3     // Catch:{ all -> 0x02b3 }
            r1.getMax(r4, r2)     // Catch:{ all -> 0x02b3 }
            java.util.List<o.dispatchLayoutStep3> r0 = r0.setMax     // Catch:{ all -> 0x02b3 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x02b3 }
        L_0x029f:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x02b3 }
            if (r1 == 0) goto L_0x02af
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x02b3 }
            o.dispatchLayoutStep3 r1 = (o.dispatchLayoutStep3) r1     // Catch:{ all -> 0x02b3 }
            r1.IsOverlapping()     // Catch:{ all -> 0x02b3 }
            goto L_0x029f
        L_0x02af:
            monitor-exit(r10)     // Catch:{ all -> 0x02b3 }
            r9.isInside = r11
            goto L_0x02b6
        L_0x02b3:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x02b6:
            int r0 = r9.isInside
            if (r0 != 0) goto L_0x031c
            com.otaliastudios.cameraview.CameraLogger r0 = setMin
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "scheduling frame."
            r2[r11] = r3
            r0.getMax(r1, r2)
            java.lang.Object r2 = r9.IsOverlapping
            monitor-enter(r2)
            o.didChildRangeChange r0 = r9.length     // Catch:{ all -> 0x0319 }
            if (r0 == 0) goto L_0x0317
            com.otaliastudios.cameraview.CameraLogger r0 = setMin     // Catch:{ all -> 0x0319 }
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x0319 }
            java.lang.String r4 = "dispatching frame."
            r3[r11] = r4     // Catch:{ all -> 0x0319 }
            r0.getMax(r1, r3)     // Catch:{ all -> 0x0319 }
            o.didChildRangeChange r0 = r9.length     // Catch:{ all -> 0x0319 }
            java.util.List<o.dispatchLayoutStep3> r0 = r0.setMax     // Catch:{ all -> 0x0319 }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x0319 }
            o.clearOldPositions r0 = (o.clearOldPositions) r0     // Catch:{ all -> 0x0319 }
            o.animateAppearance r0 = (o.animateAppearance) r0     // Catch:{ all -> 0x0319 }
            o.ensureRightGlow<o.animateAppearance$getMin> r1 = r0.getMin     // Catch:{ all -> 0x0319 }
            boolean r1 = r1.setMax()     // Catch:{ all -> 0x0319 }
            if (r1 != 0) goto L_0x030f
            o.ensureRightGlow<o.animateAppearance$getMin> r0 = r0.getMin     // Catch:{ all -> 0x0319 }
            java.lang.Object r0 = r0.length()     // Catch:{ all -> 0x0319 }
            o.animateAppearance$getMin r0 = (o.animateAppearance.getMin) r0     // Catch:{ all -> 0x0319 }
            long r3 = r25.getTimestamp()     // Catch:{ all -> 0x0319 }
            r0.getMax = r3     // Catch:{ all -> 0x0319 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0319 }
            r0.getMin = r3     // Catch:{ all -> 0x0319 }
            float[] r1 = r0.setMin     // Catch:{ all -> 0x0319 }
            r3 = r25
            r3.getTransformMatrix(r1)     // Catch:{ all -> 0x0319 }
            o.didChildRangeChange r1 = r9.length     // Catch:{ all -> 0x0319 }
            java.lang.String r3 = "frame"
            r1.getMin(r3, r0)     // Catch:{ all -> 0x0319 }
            goto L_0x0317
        L_0x030f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0319 }
            java.lang.String r1 = "Need more frames than this! Please increase the pool size."
            r0.<init>(r1)     // Catch:{ all -> 0x0319 }
            throw r0     // Catch:{ all -> 0x0319 }
        L_0x0317:
            monitor-exit(r2)     // Catch:{ all -> 0x0319 }
            goto L_0x031c
        L_0x0319:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x031c:
            int r0 = r9.isInside
            if (r0 != 0) goto L_0x0346
            int r0 = r9.toIntRange
            r1 = 1
            if (r0 != r1) goto L_0x0346
            com.otaliastudios.cameraview.CameraLogger r0 = setMin
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "Stopping the encoder engine."
            r2[r11] = r3
            r0.setMax(r2)
            r9.isInside = r1
            java.lang.Object r1 = r9.IsOverlapping
            monitor-enter(r1)
            o.didChildRangeChange r0 = r9.length     // Catch:{ all -> 0x0343 }
            if (r0 == 0) goto L_0x0341
            o.didChildRangeChange r0 = r9.length     // Catch:{ all -> 0x0343 }
            r0.length()     // Catch:{ all -> 0x0343 }
            r2 = 0
            r9.length = r2     // Catch:{ all -> 0x0343 }
        L_0x0341:
            monitor-exit(r1)     // Catch:{ all -> 0x0343 }
            return
        L_0x0343:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0346:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.processAdapterUpdatesAndSetAnimationFlags.length(android.graphics.SurfaceTexture, float, float):void");
    }

    /* renamed from: o.processAdapterUpdatesAndSetAnimationFlags$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] getMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.otaliastudios.cameraview.controls.VideoCodec[] r0 = com.otaliastudios.cameraview.controls.VideoCodec.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                getMax = r0
                com.otaliastudios.cameraview.controls.VideoCodec r1 = com.otaliastudios.cameraview.controls.VideoCodec.H_263     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x001d }
                com.otaliastudios.cameraview.controls.VideoCodec r1 = com.otaliastudios.cameraview.controls.VideoCodec.H_264     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.otaliastudios.cameraview.controls.VideoCodec r1 = com.otaliastudios.cameraview.controls.VideoCodec.DEVICE_DEFAULT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.processAdapterUpdatesAndSetAnimationFlags.AnonymousClass5.<clinit>():void");
        }
    }

    public final void setMax() {
        toIntRange();
    }

    @EncoderThread
    public final void getMin(int i, @Nullable Exception exc) {
        if (exc != null) {
            setMin.getMax(3, "Error onEncodingEnd", exc);
            this.getMin = null;
            this.setMax = exc;
        } else if (i == 1) {
            setMin.getMax(1, "onEncodingEnd because of max duration.");
            this.getMin.toDoubleRange = 2;
        } else if (i == 2) {
            setMin.getMax(1, "onEncodingEnd because of max size.");
            this.getMin.toDoubleRange = 1;
        } else {
            setMin.getMax(1, "onEncodingEnd because of user.");
        }
        this.isInside = 1;
        this.toIntRange = 1;
        this.equals.hashCode.remove(this);
        this.equals = null;
        addOnItemTouchListener addonitemtouchlistener = this.hashCode;
        if (addonitemtouchlistener != null) {
            addonitemtouchlistener.getMin();
            this.hashCode = null;
        }
        synchronized (this.IsOverlapping) {
            this.length = null;
        }
        getMin();
    }
}
