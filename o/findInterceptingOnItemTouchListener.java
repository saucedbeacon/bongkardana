package o;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.otaliastudios.cameraview.controls.Facing;
import com.otaliastudios.cameraview.engine.offset.Axis;
import com.otaliastudios.cameraview.engine.offset.Reference;
import com.otaliastudios.cameraview.overlay.Overlay;
import com.otaliastudios.cameraview.preview.RendererThread;
import o.calculateDtToFit;

public class findInterceptingOnItemTouchListener extends cancelScroll {
    boolean IsOverlapping;
    float[] equals;
    Overlay getMax;
    addOnItemTouchListener isInside;
    predictiveItemAnimationsEnabled setMin;
    getMinFlingVelocity toFloatRange;
    int toIntRange;
    /* access modifiers changed from: private */
    public setItemAnimator toString;
    private initChildrenHelper values;

    public findInterceptingOnItemTouchListener(@NonNull calculateDtToFit.length length, @NonNull initChildrenHelper initchildrenhelper, @NonNull setItemAnimator setitemanimator, @NonNull predictiveItemAnimationsEnabled predictiveitemanimationsenabled) {
        super(length, initchildrenhelper);
        this.values = initchildrenhelper;
        this.toString = setitemanimator;
        this.setMin = predictiveitemanimationsenabled;
        Overlay ICustomTabsCallback = initchildrenhelper.ICustomTabsCallback();
        this.getMax = ICustomTabsCallback;
        this.IsOverlapping = ICustomTabsCallback != null && ICustomTabsCallback.drawsOn(Overlay.Target.PICTURE_SNAPSHOT);
    }

    @TargetApi(19)
    public void getMax() {
        setItemAnimator setitemanimator = this.toString;
        ((GLSurfaceView) setitemanimator.getMax).queueEvent(new Runnable(new isAccessibilityEnabled() {
            @RendererThread
            public final void setMax(int i) {
                findInterceptingOnItemTouchListener findinterceptingonitemtouchlistener = findInterceptingOnItemTouchListener.this;
                findinterceptingonitemtouchlistener.toIntRange = i;
                findinterceptingonitemtouchlistener.toFloatRange = new getMinFlingVelocity();
                Rect max = pullGlows.setMax(findinterceptingonitemtouchlistener.length.getMax, findinterceptingonitemtouchlistener.setMin);
                findinterceptingonitemtouchlistener.length.getMax = new shouldDeferAccessibilityEvent(max.width(), max.height());
                findinterceptingonitemtouchlistener.equals = new float[16];
                Matrix.setIdentityM(findinterceptingonitemtouchlistener.equals, 0);
                if (findinterceptingonitemtouchlistener.IsOverlapping) {
                    findinterceptingonitemtouchlistener.isInside = new addOnItemTouchListener(findinterceptingonitemtouchlistener.getMax, findinterceptingonitemtouchlistener.length.getMax);
                }
            }

            @RendererThread
            public final void setMax(@NonNull setChildDrawingOrderCallback setchilddrawingordercallback) {
                findInterceptingOnItemTouchListener.this.toFloatRange.setMin = setchilddrawingordercallback.setMin();
            }

            @RendererThread
            public final void length(@NonNull SurfaceTexture surfaceTexture, float f, float f2) {
                findInterceptingOnItemTouchListener.this.toString.hashCode.remove(this);
                ensureTopGlow.setMax(new Runnable(surfaceTexture, f, f2, EGL14.eglGetCurrentContext()) {
                    final /* synthetic */ float getMax;
                    final /* synthetic */ EGLContext getMin;
                    final /* synthetic */ float length;
                    final /* synthetic */ SurfaceTexture setMin;

                    {
                        this.setMin = r2;
                        this.getMax = r3;
                        this.length = r4;
                        this.getMin = r5;
                    }

                    public final void run() {
                        findInterceptingOnItemTouchListener.this.length(this.setMin, this.getMax, this.length, this.getMin);
                    }
                });
            }
        }) {
            final /* synthetic */ isAccessibilityEnabled setMax;

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
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    @TargetApi(19)
    public final void length(@NonNull SurfaceTexture surfaceTexture, float f, float f2, @NonNull EGLContext eGLContext) {
        SurfaceTexture surfaceTexture2 = new SurfaceTexture(9999);
        surfaceTexture2.setDefaultBufferSize(this.length.getMax.getMax, this.length.getMax.getMin);
        isLayoutSuppressed islayoutsuppressed = new isLayoutSuppressed(eGLContext, 1);
        considerReleasingGlowsOnScroll considerreleasingglowsonscroll = new considerReleasingGlowsOnScroll(islayoutsuppressed, surfaceTexture2);
        considerreleasingglowsonscroll.length();
        boolean min = this.values.invoke().getMin(Reference.VIEW, Reference.SENSOR);
        float f3 = min ? f2 : f;
        float f4 = min ? f : f2;
        Matrix.translateM(this.equals, 0, (1.0f - f3) / 2.0f, (1.0f - f4) / 2.0f, 0.0f);
        Matrix.scaleM(this.equals, 0, f3, f4, 1.0f);
        Matrix.translateM(this.equals, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(this.equals, 0, (float) (-this.length.length), 0.0f, 0.0f, 1.0f);
        this.length.length = 0;
        if (this.length.setMin == Facing.FRONT) {
            Matrix.scaleM(this.equals, 0, -1.0f, 1.0f, 1.0f);
        }
        Matrix.translateM(this.equals, 0, -0.5f, -0.5f, 0.0f);
        if (this.IsOverlapping) {
            this.isInside.setMin(Overlay.Target.PICTURE_SNAPSHOT);
            int min2 = this.values.invoke().getMin(Reference.VIEW, Reference.OUTPUT, Axis.ABSOLUTE);
            Matrix.translateM(this.isInside.length, 0, 0.5f, 0.5f, 0.0f);
            Matrix.rotateM(this.isInside.length, 0, (float) min2, 0.0f, 0.0f, 1.0f);
            Matrix.scaleM(this.isInside.length, 0, 1.0f, -1.0f, 1.0f);
            Matrix.translateM(this.isInside.length, 0, -0.5f, -0.5f, 0.0f);
        }
        FastBitmap$CoordinateSystem.setMax("takeFrame:", "timestampUs:", Long.valueOf(surfaceTexture.getTimestamp() / 1000));
        this.toFloatRange.setMax(this.toIntRange, this.equals);
        if (this.IsOverlapping) {
            this.isInside.length();
        }
        this.length.isInside = considerreleasingglowsonscroll.length(Bitmap.CompressFormat.JPEG);
        considerreleasingglowsonscroll.getMin();
        getMinFlingVelocity getminflingvelocity = this.toFloatRange;
        if (getminflingvelocity.length != -1) {
            getminflingvelocity.setMax.getMax();
            GLES20.glDeleteProgram(getminflingvelocity.length);
            getminflingvelocity.length = -1;
        }
        surfaceTexture2.release();
        if (this.IsOverlapping) {
            this.isInside.getMin();
        }
        islayoutsuppressed.setMax();
        getMin();
    }

    /* access modifiers changed from: protected */
    public void getMin() {
        this.values = null;
        this.setMin = null;
        super.getMin();
    }
}
