package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Base64;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.ConvertUtils;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVG$FastBitmap$CoordinateSystem;
import com.caverock.androidsvg.SVG$Grayscale$Algorithm;
import com.caverock.androidsvg.SVG$ICustomTabsService$Stub$Proxy;
import com.caverock.androidsvg.SVG$Mean$Arithmetic;
import com.caverock.androidsvg.SVGParser;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

public class offsetChildToAnchor {
    private static /* synthetic */ int[] $SWITCH_TABLE$com$caverock$androidsvg$PreserveAspectRatio$Alignment = null;
    private static /* synthetic */ int[] $SWITCH_TABLE$com$caverock$androidsvg$SVG$Style$FillRule = null;
    private static /* synthetic */ int[] $SWITCH_TABLE$com$caverock$androidsvg$SVG$Style$LineCaps = null;
    private static /* synthetic */ int[] $SWITCH_TABLE$com$caverock$androidsvg$SVG$Style$LineJoin = null;
    private static final float BEZIER_ARC_FACTOR = 0.5522848f;
    private static final String DEFAULT_FONT_FAMILY = "sans-serif";
    private static final int LUMINANCE_FACTOR_SHIFT = 15;
    private static final int LUMINANCE_TO_ALPHA_BLUE = 2362;
    private static final int LUMINANCE_TO_ALPHA_GREEN = 23442;
    private static final int LUMINANCE_TO_ALPHA_RED = 6963;
    private static final String TAG = "SVGAndroidRenderer";
    private Stack<Bitmap> bitmapStack;
    /* access modifiers changed from: private */
    public Canvas canvas;
    private Stack<Canvas> canvasStack;
    private SVG.length canvasViewPort;
    private boolean directRenderingMode;
    private SVG document;
    private float dpi;
    private Stack<Matrix> matrixStack;
    private Stack<SVG.onTransact> parentStack;
    /* access modifiers changed from: private */
    public IsOverlapping state;
    private Stack<IsOverlapping> stateStack;

    private int clamp255(float f) {
        int i = (int) (f * 256.0f);
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    /* access modifiers changed from: private */
    public static void debug(String str, Object... objArr) {
    }

    /* access modifiers changed from: private */
    public static void error(String str, Object... objArr) {
    }

    private static void info(String str, Object... objArr) {
    }

    /* access modifiers changed from: private */
    public static void warn(String str, Object... objArr) {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(22:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|(2:22|23)|24|26) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0028 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0031 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0044 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x004d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0057 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0060 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0015 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ int[] $SWITCH_TABLE$com$caverock$androidsvg$PreserveAspectRatio$Alignment() {
        /*
            int[] r0 = $SWITCH_TABLE$com$caverock$androidsvg$PreserveAspectRatio$Alignment
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            com.caverock.androidsvg.PreserveAspectRatio$Alignment[] r0 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.None     // Catch:{ NoSuchFieldError -> 0x0015 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0015 }
            r2 = 1
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0015 }
        L_0x0015:
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.XMaxYMax     // Catch:{ NoSuchFieldError -> 0x001f }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 10
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.XMaxYMid     // Catch:{ NoSuchFieldError -> 0x0028 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
            r2 = 7
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
        L_0x0028:
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.XMaxYMin     // Catch:{ NoSuchFieldError -> 0x0031 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0031 }
            r2 = 4
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0031 }
        L_0x0031:
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.XMidYMax     // Catch:{ NoSuchFieldError -> 0x003b }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
            r2 = 9
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
        L_0x003b:
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.XMidYMid     // Catch:{ NoSuchFieldError -> 0x0044 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
            r2 = 6
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
        L_0x0044:
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.XMidYMin     // Catch:{ NoSuchFieldError -> 0x004d }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
            r2 = 3
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
        L_0x004d:
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.XMinYMax     // Catch:{ NoSuchFieldError -> 0x0057 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0057 }
            r2 = 8
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0057 }
        L_0x0057:
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.XMinYMid     // Catch:{ NoSuchFieldError -> 0x0060 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
            r2 = 5
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
        L_0x0060:
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.XMinYMin     // Catch:{ NoSuchFieldError -> 0x0069 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
            r2 = 2
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0069 }
        L_0x0069:
            $SWITCH_TABLE$com$caverock$androidsvg$PreserveAspectRatio$Alignment = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.offsetChildToAnchor.$SWITCH_TABLE$com$caverock$androidsvg$PreserveAspectRatio$Alignment():int[]");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:3|4|5|6|7|8|10) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ int[] $SWITCH_TABLE$com$caverock$androidsvg$SVG$Style$FillRule() {
        /*
            int[] r0 = $SWITCH_TABLE$com$caverock$androidsvg$SVG$Style$FillRule
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            com.caverock.androidsvg.SVG$Style$FillRule[] r0 = com.caverock.androidsvg.SVG.Style.FillRule.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            com.caverock.androidsvg.SVG$Style$FillRule r1 = com.caverock.androidsvg.SVG.Style.FillRule.EvenOdd     // Catch:{ NoSuchFieldError -> 0x0015 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0015 }
            r2 = 2
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0015 }
        L_0x0015:
            com.caverock.androidsvg.SVG$Style$FillRule r1 = com.caverock.androidsvg.SVG.Style.FillRule.NonZero     // Catch:{ NoSuchFieldError -> 0x001e }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001e }
            r2 = 1
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001e }
        L_0x001e:
            $SWITCH_TABLE$com$caverock$androidsvg$SVG$Style$FillRule = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.offsetChildToAnchor.$SWITCH_TABLE$com$caverock$androidsvg$SVG$Style$FillRule():int[]");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:3|4|5|6|7|8|9|10|12) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0015 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ int[] $SWITCH_TABLE$com$caverock$androidsvg$SVG$Style$LineCaps() {
        /*
            int[] r0 = $SWITCH_TABLE$com$caverock$androidsvg$SVG$Style$LineCaps
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            com.caverock.androidsvg.SVG$Style$LineCaps[] r0 = com.caverock.androidsvg.SVG.Style.LineCaps.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            com.caverock.androidsvg.SVG$Style$LineCaps r1 = com.caverock.androidsvg.SVG.Style.LineCaps.Butt     // Catch:{ NoSuchFieldError -> 0x0015 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0015 }
            r2 = 1
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0015 }
        L_0x0015:
            com.caverock.androidsvg.SVG$Style$LineCaps r1 = com.caverock.androidsvg.SVG.Style.LineCaps.Round     // Catch:{ NoSuchFieldError -> 0x001e }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001e }
            r2 = 2
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001e }
        L_0x001e:
            com.caverock.androidsvg.SVG$Style$LineCaps r1 = com.caverock.androidsvg.SVG.Style.LineCaps.Square     // Catch:{ NoSuchFieldError -> 0x0027 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0027 }
            r2 = 3
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0027 }
        L_0x0027:
            $SWITCH_TABLE$com$caverock$androidsvg$SVG$Style$LineCaps = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.offsetChildToAnchor.$SWITCH_TABLE$com$caverock$androidsvg$SVG$Style$LineCaps():int[]");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:3|4|5|6|7|8|9|10|12) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0015 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ int[] $SWITCH_TABLE$com$caverock$androidsvg$SVG$Style$LineJoin() {
        /*
            int[] r0 = $SWITCH_TABLE$com$caverock$androidsvg$SVG$Style$LineJoin
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            com.caverock.androidsvg.SVG$Style$LineJoin[] r0 = com.caverock.androidsvg.SVG.Style.LineJoin.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            com.caverock.androidsvg.SVG$Style$LineJoin r1 = com.caverock.androidsvg.SVG.Style.LineJoin.Bevel     // Catch:{ NoSuchFieldError -> 0x0015 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0015 }
            r2 = 3
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0015 }
        L_0x0015:
            com.caverock.androidsvg.SVG$Style$LineJoin r1 = com.caverock.androidsvg.SVG.Style.LineJoin.Miter     // Catch:{ NoSuchFieldError -> 0x001e }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001e }
            r2 = 1
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001e }
        L_0x001e:
            com.caverock.androidsvg.SVG$Style$LineJoin r1 = com.caverock.androidsvg.SVG.Style.LineJoin.Round     // Catch:{ NoSuchFieldError -> 0x0027 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0027 }
            r2 = 2
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0027 }
        L_0x0027:
            $SWITCH_TABLE$com$caverock$androidsvg$SVG$Style$LineJoin = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.offsetChildToAnchor.$SWITCH_TABLE$com$caverock$androidsvg$SVG$Style$LineJoin():int[]");
    }

    class IsOverlapping implements Cloneable {
        public boolean directRendering;
        public Paint fillPaint;
        public boolean hasFill;
        public boolean hasStroke;
        public boolean spacePreserve;
        public Paint strokePaint;
        public SVG.Style style = SVG.Style.getDefaultStyle();
        public SVG.length viewBox;
        public SVG.length viewPort;

        public IsOverlapping() {
            Paint paint = new Paint();
            this.fillPaint = paint;
            paint.setFlags(385);
            this.fillPaint.setStyle(Paint.Style.FILL);
            this.fillPaint.setTypeface(Typeface.DEFAULT);
            Paint paint2 = new Paint();
            this.strokePaint = paint2;
            paint2.setFlags(385);
            this.strokePaint.setStyle(Paint.Style.STROKE);
            this.strokePaint.setTypeface(Typeface.DEFAULT);
        }

        /* access modifiers changed from: protected */
        public Object clone() {
            try {
                IsOverlapping isOverlapping = (IsOverlapping) super.clone();
                isOverlapping.style = (SVG.Style) this.style.clone();
                isOverlapping.fillPaint = new Paint(this.fillPaint);
                isOverlapping.strokePaint = new Paint(this.strokePaint);
                return isOverlapping;
            } catch (CloneNotSupportedException e) {
                throw new InternalError(e.toString());
            }
        }
    }

    private void resetState() {
        this.state = new IsOverlapping();
        this.stateStack = new Stack<>();
        updateStyle(this.state, SVG.Style.getDefaultStyle());
        this.state.viewPort = this.canvasViewPort;
        this.state.spacePreserve = false;
        this.state.directRendering = this.directRenderingMode;
        this.stateStack.push((IsOverlapping) this.state.clone());
        this.canvasStack = new Stack<>();
        this.bitmapStack = new Stack<>();
        this.matrixStack = new Stack<>();
        this.parentStack = new Stack<>();
    }

    public offsetChildToAnchor(Canvas canvas2, SVG.length length2, float f) {
        this.canvas = canvas2;
        this.dpi = f;
        this.canvasViewPort = length2;
    }

    public float getDPI() {
        return this.dpi;
    }

    public float getCurrentFontSize() {
        return this.state.fillPaint.getTextSize();
    }

    public float getCurrentFontXHeight() {
        return this.state.fillPaint.getTextSize() / 2.0f;
    }

    public SVG.length getCurrentViewPortInUserUnits() {
        if (this.state.viewBox != null) {
            return this.state.viewBox;
        }
        return this.state.viewPort;
    }

    public void renderDocument(SVG svg, SVG.length length2, PreserveAspectRatio preserveAspectRatio, boolean z) {
        this.document = svg;
        this.directRenderingMode = z;
        SVG.extraCallback rootElement = svg.getRootElement();
        if (rootElement == null) {
            warn("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        resetState();
        checkXMLSpaceAttribute(rootElement);
        SVG.values values = rootElement.width;
        SVG.values values2 = rootElement.height;
        if (length2 == null) {
            length2 = rootElement.viewBox;
        }
        SVG.length length3 = length2;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = rootElement.preserveAspectRatio;
        }
        render(rootElement, values, values2, length3, preserveAspectRatio);
    }

    private void render(SVG.ICustomTabsCallback.Stub.Proxy proxy) {
        if (!(proxy instanceof SVG$Mean$Arithmetic)) {
            statePush();
            checkXMLSpaceAttribute(proxy);
            if (proxy instanceof SVG.extraCallback) {
                render((SVG.extraCallback) proxy);
            } else if (proxy instanceof SVG$ICustomTabsService$Stub$Proxy) {
                render((SVG$ICustomTabsService$Stub$Proxy) proxy);
            } else if (proxy instanceof SVG.warmup) {
                render((SVG.warmup) proxy);
            } else if (proxy instanceof SVG.toDoubleRange) {
                render((SVG.toDoubleRange) proxy);
            } else if (proxy instanceof SVG.toString) {
                render((SVG.toString) proxy);
            } else if (proxy instanceof SVG.invokeSuspend) {
                render((SVG.invokeSuspend) proxy);
            } else if (proxy instanceof SVG.extraCallbackWithResult) {
                render((SVG.extraCallbackWithResult) proxy);
            } else if (proxy instanceof SVG.getMax) {
                render((SVG.getMax) proxy);
            } else if (proxy instanceof SVG.equals) {
                render((SVG.equals) proxy);
            } else if (proxy instanceof SVG$FastBitmap$CoordinateSystem) {
                render((SVG$FastBitmap$CoordinateSystem) proxy);
            } else if (proxy instanceof SVG.b) {
                render((SVG.b) proxy);
            } else if (proxy instanceof SVG.onNavigationEvent) {
                render((SVG.onNavigationEvent) proxy);
            } else if (proxy instanceof SVG.postMessage) {
                render((SVG.postMessage) proxy);
            }
            statePop();
        }
    }

    private void renderChildren(SVG.onTransact ontransact, boolean z) {
        if (z) {
            parentPush(ontransact);
        }
        for (SVG.ICustomTabsCallback.Stub.Proxy render : ontransact.getChildren()) {
            render(render);
        }
        if (z) {
            parentPop();
        }
    }

    private void statePush() {
        this.canvas.save();
        this.stateStack.push(this.state);
        this.state = (IsOverlapping) this.state.clone();
    }

    private void statePop() {
        this.canvas.restore();
        this.state = this.stateStack.pop();
    }

    private void parentPush(SVG.onTransact ontransact) {
        this.parentStack.push(ontransact);
        this.matrixStack.push(this.canvas.getMatrix());
    }

    private void parentPop() {
        this.parentStack.pop();
        this.matrixStack.pop();
    }

    private void updateStyleForElement(IsOverlapping isOverlapping, SVG.ICustomTabsCallback.Stub stub) {
        isOverlapping.style.resetNonInheritingProperties(stub.parent == null);
        if (stub.baseStyle != null) {
            updateStyle(isOverlapping, stub.baseStyle);
        }
        if (this.document.hasCSSRules()) {
            for (CSSParser.getMax next : this.document.getCSSRules()) {
                if (CSSParser.ruleMatch(next.selector, stub)) {
                    updateStyle(isOverlapping, next.style);
                }
            }
        }
        if (stub.style != null) {
            updateStyle(isOverlapping, stub.style);
        }
    }

    private void checkXMLSpaceAttribute(SVG.ICustomTabsCallback.Stub.Proxy proxy) {
        if (proxy instanceof SVG.ICustomTabsCallback.Stub) {
            SVG.ICustomTabsCallback.Stub stub = (SVG.ICustomTabsCallback.Stub) proxy;
            if (stub.spacePreserve != null) {
                this.state.spacePreserve = stub.spacePreserve.booleanValue();
            }
        }
    }

    private void doFilledPath(SVG.ICustomTabsCallback.Default defaultR, Path path) {
        if (this.state.style.fill instanceof SVG.invoke) {
            SVG.ICustomTabsCallback.Stub.Proxy resolveIRI = this.document.resolveIRI(((SVG.invoke) this.state.style.fill).href);
            if (resolveIRI instanceof SVG.ICustomTabsCallback) {
                fillWithPattern(defaultR, path, (SVG.ICustomTabsCallback) resolveIRI);
                return;
            }
        }
        this.canvas.drawPath(path, this.state.fillPaint);
    }

    private void doStroke(Path path) {
        if (this.state.style.vectorEffect == SVG.Style.VectorEffect.NonScalingStroke) {
            Matrix matrix = this.canvas.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            this.canvas.setMatrix(new Matrix());
            Shader shader = this.state.strokePaint.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.canvas.drawPath(path2, this.state.strokePaint);
            this.canvas.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        this.canvas.drawPath(path, this.state.strokePaint);
    }

    private void render(SVG.extraCallback extracallback) {
        render(extracallback, extracallback.width, extracallback.height);
    }

    private void render(SVG.extraCallback extracallback, SVG.values values, SVG.values values2) {
        render(extracallback, values, values2, extracallback.viewBox, extracallback.preserveAspectRatio);
    }

    private void render(SVG.extraCallback extracallback, SVG.values values, SVG.values values2, SVG.length length2, PreserveAspectRatio preserveAspectRatio) {
        float f;
        debug("Svg render", new Object[0]);
        if (values != null && values.isZero()) {
            return;
        }
        if (values2 == null || !values2.isZero()) {
            if (preserveAspectRatio == null) {
                preserveAspectRatio = extracallback.preserveAspectRatio != null ? extracallback.preserveAspectRatio : PreserveAspectRatio.LETTERBOX;
            }
            updateStyleForElement(this.state, extracallback);
            if (display()) {
                float f2 = 0.0f;
                if (extracallback.parent != null) {
                    float floatValueX = extracallback.x != null ? extracallback.x.floatValueX(this) : 0.0f;
                    if (extracallback.y != null) {
                        f2 = extracallback.y.floatValueY(this);
                    }
                    float f3 = f2;
                    f2 = floatValueX;
                    f = f3;
                } else {
                    f = 0.0f;
                }
                SVG.length currentViewPortInUserUnits = getCurrentViewPortInUserUnits();
                this.state.viewPort = new SVG.length(f2, f, values != null ? values.floatValueX(this) : currentViewPortInUserUnits.width, values2 != null ? values2.floatValueY(this) : currentViewPortInUserUnits.height);
                if (!this.state.style.overflow.booleanValue()) {
                    setClipRect(this.state.viewPort.minX, this.state.viewPort.minY, this.state.viewPort.width, this.state.viewPort.height);
                }
                checkForClipPath(extracallback, this.state.viewPort);
                if (length2 != null) {
                    this.canvas.concat(calculateViewBoxTransform(this.state.viewPort, length2, preserveAspectRatio));
                    this.state.viewBox = extracallback.viewBox;
                } else {
                    this.canvas.translate(f2, f);
                }
                boolean pushLayer = pushLayer();
                viewportFill();
                renderChildren(extracallback, true);
                if (pushLayer) {
                    popLayer(extracallback);
                }
                updateParentBoundingBox(extracallback);
            }
        }
    }

    private void render(SVG.toDoubleRange todoublerange) {
        debug("Group render", new Object[0]);
        updateStyleForElement(this.state, todoublerange);
        if (display()) {
            if (todoublerange.transform != null) {
                this.canvas.concat(todoublerange.transform);
            }
            checkForClipPath(todoublerange);
            boolean pushLayer = pushLayer();
            renderChildren(todoublerange, true);
            if (pushLayer) {
                popLayer(todoublerange);
            }
            updateParentBoundingBox(todoublerange);
        }
    }

    private void updateParentBoundingBox(SVG.ICustomTabsCallback.Default defaultR) {
        if (defaultR.parent != null && defaultR.boundingBox != null) {
            Matrix matrix = new Matrix();
            if (this.matrixStack.peek().invert(matrix)) {
                float[] fArr = {defaultR.boundingBox.minX, defaultR.boundingBox.minY, defaultR.boundingBox.maxX(), defaultR.boundingBox.minY, defaultR.boundingBox.maxX(), defaultR.boundingBox.maxY(), defaultR.boundingBox.minX, defaultR.boundingBox.maxY()};
                matrix.preConcat(this.canvas.getMatrix());
                matrix.mapPoints(fArr);
                RectF rectF = new RectF(fArr[0], fArr[1], fArr[0], fArr[1]);
                for (int i = 2; i <= 6; i += 2) {
                    if (fArr[i] < rectF.left) {
                        rectF.left = fArr[i];
                    }
                    if (fArr[i] > rectF.right) {
                        rectF.right = fArr[i];
                    }
                    int i2 = i + 1;
                    if (fArr[i2] < rectF.top) {
                        rectF.top = fArr[i2];
                    }
                    if (fArr[i2] > rectF.bottom) {
                        rectF.bottom = fArr[i2];
                    }
                }
                SVG.ICustomTabsCallback.Default defaultR2 = (SVG.ICustomTabsCallback.Default) this.parentStack.peek();
                if (defaultR2.boundingBox == null) {
                    defaultR2.boundingBox = SVG.length.fromLimits(rectF.left, rectF.top, rectF.right, rectF.bottom);
                } else {
                    defaultR2.boundingBox.union(SVG.length.fromLimits(rectF.left, rectF.top, rectF.right, rectF.bottom));
                }
            }
        }
    }

    private boolean pushLayer() {
        if (!requiresCompositing()) {
            return false;
        }
        this.canvas.saveLayerAlpha((RectF) null, clamp255(this.state.style.opacity.floatValue()), 4);
        this.stateStack.push(this.state);
        IsOverlapping isOverlapping = (IsOverlapping) this.state.clone();
        this.state = isOverlapping;
        if (isOverlapping.style.mask != null && this.state.directRendering) {
            SVG.ICustomTabsCallback.Stub.Proxy resolveIRI = this.document.resolveIRI(this.state.style.mask);
            if (resolveIRI == null || !(resolveIRI instanceof SVG$Grayscale$Algorithm)) {
                error("Mask reference '%s' not found", this.state.style.mask);
                this.state.style.mask = null;
            } else {
                this.canvasStack.push(this.canvas);
                duplicateCanvas();
            }
        }
        return true;
    }

    private void popLayer(SVG.ICustomTabsCallback.Default defaultR) {
        if (this.state.style.mask != null && this.state.directRendering) {
            SVG.ICustomTabsCallback.Stub.Proxy resolveIRI = this.document.resolveIRI(this.state.style.mask);
            duplicateCanvas();
            renderMask((SVG$Grayscale$Algorithm) resolveIRI, defaultR);
            Bitmap processMaskBitmaps = processMaskBitmaps();
            Canvas pop = this.canvasStack.pop();
            this.canvas = pop;
            pop.save();
            this.canvas.setMatrix(new Matrix());
            this.canvas.drawBitmap(processMaskBitmaps, 0.0f, 0.0f, this.state.fillPaint);
            processMaskBitmaps.recycle();
            this.canvas.restore();
        }
        statePop();
    }

    private boolean requiresCompositing() {
        if (this.state.style.mask != null && !this.state.directRendering) {
            warn("Masks are not supported when using getPicture()", new Object[0]);
        }
        if (this.state.style.opacity.floatValue() < 1.0f) {
            return true;
        }
        if (this.state.style.mask == null || !this.state.directRendering) {
            return false;
        }
        return true;
    }

    private void duplicateCanvas() {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(this.canvas.getWidth(), this.canvas.getHeight(), Bitmap.Config.ARGB_8888);
            this.bitmapStack.push(createBitmap);
            Canvas canvas2 = new Canvas(createBitmap);
            canvas2.setMatrix(this.canvas.getMatrix());
            this.canvas = canvas2;
        } catch (OutOfMemoryError e) {
            error("Not enough memory to create temporary bitmaps for mask processing", new Object[0]);
            throw e;
        }
    }

    private Bitmap processMaskBitmaps() {
        Bitmap pop = this.bitmapStack.pop();
        Bitmap pop2 = this.bitmapStack.pop();
        int width = pop.getWidth();
        int height = pop.getHeight();
        int[] iArr = new int[width];
        int[] iArr2 = new int[width];
        int i = 0;
        while (i < height) {
            pop.getPixels(iArr, 0, width, 0, i, width, 1);
            int i2 = i;
            pop2.getPixels(iArr2, 0, width, 0, i, width, 1);
            for (int i3 = 0; i3 < width; i3++) {
                int i4 = iArr[i3];
                int i5 = i4 & 255;
                int i6 = (i4 >> 8) & 255;
                int i7 = (i4 >> 16) & 255;
                int i8 = (i4 >> 24) & 255;
                if (i8 == 0) {
                    iArr2[i3] = 0;
                } else {
                    int i9 = iArr2[i3];
                    iArr2[i3] = (i9 & FlexItem.MAX_SIZE) | (((((i9 >> 24) & 255) * (((((i7 * LUMINANCE_TO_ALPHA_RED) + (i6 * LUMINANCE_TO_ALPHA_GREEN)) + (i5 * LUMINANCE_TO_ALPHA_BLUE)) * i8) / 8355840)) / 255) << 24);
                }
            }
            pop2.setPixels(iArr2, 0, width, 0, i2, width, 1);
            i = i2 + 1;
        }
        pop.recycle();
        return pop2;
    }

    private void render(SVG.warmup warmup) {
        debug("Switch render", new Object[0]);
        updateStyleForElement(this.state, warmup);
        if (display()) {
            if (warmup.transform != null) {
                this.canvas.concat(warmup.transform);
            }
            checkForClipPath(warmup);
            boolean pushLayer = pushLayer();
            renderSwitchChild(warmup);
            if (pushLayer) {
                popLayer(warmup);
            }
            updateParentBoundingBox(warmup);
        }
    }

    private void renderSwitchChild(SVG.warmup warmup) {
        Set<String> systemLanguage;
        String language = Locale.getDefault().getLanguage();
        hasDependencies fileResolver = this.document.getFileResolver();
        for (SVG.ICustomTabsCallback.Stub.Proxy next : warmup.getChildren()) {
            if (next instanceof SVG.onPostMessage) {
                SVG.onPostMessage onpostmessage = (SVG.onPostMessage) next;
                if (onpostmessage.getRequiredExtensions() == null && ((systemLanguage = onpostmessage.getSystemLanguage()) == null || (!systemLanguage.isEmpty() && systemLanguage.contains(language)))) {
                    Set<String> requiredFeatures = onpostmessage.getRequiredFeatures();
                    if (requiredFeatures == null || (!requiredFeatures.isEmpty() && SVGParser.supportedFeatures.containsAll(requiredFeatures))) {
                        Set<String> requiredFormats = onpostmessage.getRequiredFormats();
                        if (requiredFormats != null) {
                            if (!requiredFormats.isEmpty() && fileResolver != null) {
                                Iterator<String> it = requiredFormats.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (!fileResolver.isFormatSupported(it.next())) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                        Set<String> requiredFonts = onpostmessage.getRequiredFonts();
                        if (requiredFonts != null) {
                            if (!requiredFonts.isEmpty() && fileResolver != null) {
                                for (String resolveFont : requiredFonts) {
                                    if (fileResolver.resolveFont(resolveFont, this.state.style.fontWeight.intValue(), String.valueOf(this.state.style.fontStyle)) == null) {
                                    }
                                }
                            }
                        }
                        render(next);
                        return;
                    }
                }
            }
        }
    }

    private void render(SVG$ICustomTabsService$Stub$Proxy sVG$ICustomTabsService$Stub$Proxy) {
        debug("Use render", new Object[0]);
        if (sVG$ICustomTabsService$Stub$Proxy.width != null && sVG$ICustomTabsService$Stub$Proxy.width.isZero()) {
            return;
        }
        if (sVG$ICustomTabsService$Stub$Proxy.height == null || !sVG$ICustomTabsService$Stub$Proxy.height.isZero()) {
            updateStyleForElement(this.state, sVG$ICustomTabsService$Stub$Proxy);
            if (display()) {
                SVG.ICustomTabsCallback.Stub.Proxy resolveIRI = sVG$ICustomTabsService$Stub$Proxy.document.resolveIRI(sVG$ICustomTabsService$Stub$Proxy.href);
                if (resolveIRI == null) {
                    error("Use reference '%s' not found", sVG$ICustomTabsService$Stub$Proxy.href);
                    return;
                }
                if (sVG$ICustomTabsService$Stub$Proxy.transform != null) {
                    this.canvas.concat(sVG$ICustomTabsService$Stub$Proxy.transform);
                }
                Matrix matrix = new Matrix();
                float f = 0.0f;
                float floatValueX = sVG$ICustomTabsService$Stub$Proxy.x != null ? sVG$ICustomTabsService$Stub$Proxy.x.floatValueX(this) : 0.0f;
                if (sVG$ICustomTabsService$Stub$Proxy.y != null) {
                    f = sVG$ICustomTabsService$Stub$Proxy.y.floatValueY(this);
                }
                matrix.preTranslate(floatValueX, f);
                this.canvas.concat(matrix);
                checkForClipPath(sVG$ICustomTabsService$Stub$Proxy);
                boolean pushLayer = pushLayer();
                parentPush(sVG$ICustomTabsService$Stub$Proxy);
                if (resolveIRI instanceof SVG.extraCallback) {
                    statePush();
                    SVG.extraCallback extracallback = (SVG.extraCallback) resolveIRI;
                    render(extracallback, sVG$ICustomTabsService$Stub$Proxy.width != null ? sVG$ICustomTabsService$Stub$Proxy.width : extracallback.width, sVG$ICustomTabsService$Stub$Proxy.height != null ? sVG$ICustomTabsService$Stub$Proxy.height : extracallback.height);
                    statePop();
                } else if (resolveIRI instanceof SVG.newSessionWithExtras) {
                    SVG.values values = sVG$ICustomTabsService$Stub$Proxy.width != null ? sVG$ICustomTabsService$Stub$Proxy.width : new SVG.values(100.0f, SVG.Unit.percent);
                    SVG.values values2 = sVG$ICustomTabsService$Stub$Proxy.height != null ? sVG$ICustomTabsService$Stub$Proxy.height : new SVG.values(100.0f, SVG.Unit.percent);
                    statePush();
                    render((SVG.newSessionWithExtras) resolveIRI, values, values2);
                    statePop();
                } else {
                    render(resolveIRI);
                }
                parentPop();
                if (pushLayer) {
                    popLayer(sVG$ICustomTabsService$Stub$Proxy);
                }
                updateParentBoundingBox(sVG$ICustomTabsService$Stub$Proxy);
            }
        }
    }

    private void render(SVG.invokeSuspend invokesuspend) {
        debug("Path render", new Object[0]);
        updateStyleForElement(this.state, invokesuspend);
        if (!display() || !visible()) {
            return;
        }
        if (this.state.hasStroke || this.state.hasFill) {
            if (invokesuspend.transform != null) {
                this.canvas.concat(invokesuspend.transform);
            }
            Path path = new getMin(invokesuspend.d).getPath();
            if (invokesuspend.boundingBox == null) {
                invokesuspend.boundingBox = calculatePathBounds(path);
            }
            updateParentBoundingBox(invokesuspend);
            checkForGradiantsAndPatterns(invokesuspend);
            checkForClipPath(invokesuspend);
            boolean pushLayer = pushLayer();
            if (this.state.hasFill) {
                path.setFillType(getFillTypeFromState());
                doFilledPath(invokesuspend, path);
            }
            if (this.state.hasStroke) {
                doStroke(path);
            }
            renderMarkers(invokesuspend);
            if (pushLayer) {
                popLayer(invokesuspend);
            }
        }
    }

    private SVG.length calculatePathBounds(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new SVG.length(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private void render(SVG.extraCallbackWithResult extracallbackwithresult) {
        debug("Rect render", new Object[0]);
        if (extracallbackwithresult.width != null && extracallbackwithresult.height != null && !extracallbackwithresult.width.isZero() && !extracallbackwithresult.height.isZero()) {
            updateStyleForElement(this.state, extracallbackwithresult);
            if (display() && visible()) {
                if (extracallbackwithresult.transform != null) {
                    this.canvas.concat(extracallbackwithresult.transform);
                }
                Path makePathAndBoundingBox = makePathAndBoundingBox(extracallbackwithresult);
                updateParentBoundingBox(extracallbackwithresult);
                checkForGradiantsAndPatterns(extracallbackwithresult);
                checkForClipPath(extracallbackwithresult);
                boolean pushLayer = pushLayer();
                if (this.state.hasFill) {
                    doFilledPath(extracallbackwithresult, makePathAndBoundingBox);
                }
                if (this.state.hasStroke) {
                    doStroke(makePathAndBoundingBox);
                }
                if (pushLayer) {
                    popLayer(extracallbackwithresult);
                }
            }
        }
    }

    private void render(SVG.getMax getmax) {
        debug("Circle render", new Object[0]);
        if (getmax.r != null && !getmax.r.isZero()) {
            updateStyleForElement(this.state, getmax);
            if (display() && visible()) {
                if (getmax.transform != null) {
                    this.canvas.concat(getmax.transform);
                }
                Path makePathAndBoundingBox = makePathAndBoundingBox(getmax);
                updateParentBoundingBox(getmax);
                checkForGradiantsAndPatterns(getmax);
                checkForClipPath(getmax);
                boolean pushLayer = pushLayer();
                if (this.state.hasFill) {
                    doFilledPath(getmax, makePathAndBoundingBox);
                }
                if (this.state.hasStroke) {
                    doStroke(makePathAndBoundingBox);
                }
                if (pushLayer) {
                    popLayer(getmax);
                }
            }
        }
    }

    private void render(SVG.equals equals2) {
        debug("Ellipse render", new Object[0]);
        if (equals2.rx != null && equals2.ry != null && !equals2.rx.isZero() && !equals2.ry.isZero()) {
            updateStyleForElement(this.state, equals2);
            if (display() && visible()) {
                if (equals2.transform != null) {
                    this.canvas.concat(equals2.transform);
                }
                Path makePathAndBoundingBox = makePathAndBoundingBox(equals2);
                updateParentBoundingBox(equals2);
                checkForGradiantsAndPatterns(equals2);
                checkForClipPath(equals2);
                boolean pushLayer = pushLayer();
                if (this.state.hasFill) {
                    doFilledPath(equals2, makePathAndBoundingBox);
                }
                if (this.state.hasStroke) {
                    doStroke(makePathAndBoundingBox);
                }
                if (pushLayer) {
                    popLayer(equals2);
                }
            }
        }
    }

    private void render(SVG$FastBitmap$CoordinateSystem sVG$FastBitmap$CoordinateSystem) {
        debug("Line render", new Object[0]);
        updateStyleForElement(this.state, sVG$FastBitmap$CoordinateSystem);
        if (display() && visible() && this.state.hasStroke) {
            if (sVG$FastBitmap$CoordinateSystem.transform != null) {
                this.canvas.concat(sVG$FastBitmap$CoordinateSystem.transform);
            }
            Path makePathAndBoundingBox = makePathAndBoundingBox(sVG$FastBitmap$CoordinateSystem);
            updateParentBoundingBox(sVG$FastBitmap$CoordinateSystem);
            checkForGradiantsAndPatterns(sVG$FastBitmap$CoordinateSystem);
            checkForClipPath(sVG$FastBitmap$CoordinateSystem);
            boolean pushLayer = pushLayer();
            doStroke(makePathAndBoundingBox);
            renderMarkers(sVG$FastBitmap$CoordinateSystem);
            if (pushLayer) {
                popLayer(sVG$FastBitmap$CoordinateSystem);
            }
        }
    }

    private List<getMax> calculateMarkerPositions(SVG$FastBitmap$CoordinateSystem sVG$FastBitmap$CoordinateSystem) {
        float floatValueX = sVG$FastBitmap$CoordinateSystem.x1 != null ? sVG$FastBitmap$CoordinateSystem.x1.floatValueX(this) : 0.0f;
        float floatValueY = sVG$FastBitmap$CoordinateSystem.y1 != null ? sVG$FastBitmap$CoordinateSystem.y1.floatValueY(this) : 0.0f;
        float floatValueX2 = sVG$FastBitmap$CoordinateSystem.x2 != null ? sVG$FastBitmap$CoordinateSystem.x2.floatValueX(this) : 0.0f;
        float floatValueY2 = sVG$FastBitmap$CoordinateSystem.y2 != null ? sVG$FastBitmap$CoordinateSystem.y2.floatValueY(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f = floatValueX2 - floatValueX;
        float f2 = floatValueY2 - floatValueY;
        arrayList.add(new getMax(floatValueX, floatValueY, f, f2));
        arrayList.add(new getMax(floatValueX2, floatValueY2, f, f2));
        return arrayList;
    }

    private void render(SVG.onNavigationEvent onnavigationevent) {
        debug("PolyLine render", new Object[0]);
        updateStyleForElement(this.state, onnavigationevent);
        if (!display() || !visible()) {
            return;
        }
        if (this.state.hasStroke || this.state.hasFill) {
            if (onnavigationevent.transform != null) {
                this.canvas.concat(onnavigationevent.transform);
            }
            if (onnavigationevent.points.length >= 2) {
                Path makePathAndBoundingBox = makePathAndBoundingBox(onnavigationevent);
                updateParentBoundingBox(onnavigationevent);
                checkForGradiantsAndPatterns(onnavigationevent);
                checkForClipPath(onnavigationevent);
                boolean pushLayer = pushLayer();
                if (this.state.hasFill) {
                    doFilledPath(onnavigationevent, makePathAndBoundingBox);
                }
                if (this.state.hasStroke) {
                    doStroke(makePathAndBoundingBox);
                }
                renderMarkers(onnavigationevent);
                if (pushLayer) {
                    popLayer(onnavigationevent);
                }
            }
        }
    }

    private List<getMax> calculateMarkerPositions(SVG.onNavigationEvent onnavigationevent) {
        SVG.onNavigationEvent onnavigationevent2 = onnavigationevent;
        int length2 = onnavigationevent2.points.length;
        int i = 2;
        if (length2 < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        getMax getmax = new getMax(onnavigationevent2.points[0], onnavigationevent2.points[1], 0.0f, 0.0f);
        float f = 0.0f;
        float f2 = 0.0f;
        while (i < length2) {
            f = onnavigationevent2.points[i];
            f2 = onnavigationevent2.points[i + 1];
            getmax.add(f, f2);
            arrayList.add(getmax);
            i += 2;
            getmax = new getMax(f, f2, f - getmax.x, f2 - getmax.y);
        }
        if (!(onnavigationevent2 instanceof SVG.b)) {
            arrayList.add(getmax);
        } else if (!(f == onnavigationevent2.points[0] || f2 == onnavigationevent2.points[1])) {
            float f3 = onnavigationevent2.points[0];
            float f4 = onnavigationevent2.points[1];
            getmax.add(f3, f4);
            arrayList.add(getmax);
            getMax getmax2 = new getMax(f3, f4, f3 - getmax.x, f4 - getmax.y);
            getmax2.add((getMax) arrayList.get(0));
            arrayList.add(getmax2);
            arrayList.set(0, getmax2);
        }
        return arrayList;
    }

    private void render(SVG.b bVar) {
        debug("Polygon render", new Object[0]);
        updateStyleForElement(this.state, bVar);
        if (!display() || !visible()) {
            return;
        }
        if (this.state.hasStroke || this.state.hasFill) {
            if (bVar.transform != null) {
                this.canvas.concat(bVar.transform);
            }
            if (bVar.points.length >= 2) {
                Path makePathAndBoundingBox = makePathAndBoundingBox((SVG.onNavigationEvent) bVar);
                updateParentBoundingBox(bVar);
                checkForGradiantsAndPatterns(bVar);
                checkForClipPath(bVar);
                boolean pushLayer = pushLayer();
                if (this.state.hasFill) {
                    doFilledPath(bVar, makePathAndBoundingBox);
                }
                if (this.state.hasStroke) {
                    doStroke(makePathAndBoundingBox);
                }
                renderMarkers(bVar);
                if (pushLayer) {
                    popLayer(bVar);
                }
            }
        }
    }

    private void render(SVG.postMessage postmessage) {
        debug("Text render", new Object[0]);
        updateStyleForElement(this.state, postmessage);
        if (display()) {
            if (postmessage.transform != null) {
                this.canvas.concat(postmessage.transform);
            }
            float f = 0.0f;
            float floatValueX = (postmessage.x == null || postmessage.x.size() == 0) ? 0.0f : ((SVG.values) postmessage.x.get(0)).floatValueX(this);
            float floatValueY = (postmessage.y == null || postmessage.y.size() == 0) ? 0.0f : ((SVG.values) postmessage.y.get(0)).floatValueY(this);
            float floatValueX2 = (postmessage.dx == null || postmessage.dx.size() == 0) ? 0.0f : ((SVG.values) postmessage.dx.get(0)).floatValueX(this);
            if (!(postmessage.dy == null || postmessage.dy.size() == 0)) {
                f = ((SVG.values) postmessage.dy.get(0)).floatValueY(this);
            }
            SVG.Style.TextAnchor anchorPosition = getAnchorPosition();
            if (anchorPosition != SVG.Style.TextAnchor.Start) {
                float calculateTextWidth = calculateTextWidth(postmessage);
                if (anchorPosition == SVG.Style.TextAnchor.Middle) {
                    calculateTextWidth /= 2.0f;
                }
                floatValueX -= calculateTextWidth;
            }
            if (postmessage.boundingBox == null) {
                isInside isinside = new isInside(floatValueX, floatValueY);
                enumerateTextSpans(postmessage, isinside);
                postmessage.boundingBox = new SVG.length(isinside.bbox.left, isinside.bbox.top, isinside.bbox.width(), isinside.bbox.height());
            }
            updateParentBoundingBox(postmessage);
            checkForGradiantsAndPatterns(postmessage);
            checkForClipPath(postmessage);
            boolean pushLayer = pushLayer();
            enumerateTextSpans(postmessage, new setMax(floatValueX + floatValueX2, floatValueY + f));
            if (pushLayer) {
                popLayer(postmessage);
            }
        }
    }

    private SVG.Style.TextAnchor getAnchorPosition() {
        if (this.state.style.direction == SVG.Style.TextDirection.LTR || this.state.style.textAnchor == SVG.Style.TextAnchor.Middle) {
            return this.state.style.textAnchor;
        }
        return this.state.style.textAnchor == SVG.Style.TextAnchor.Start ? SVG.Style.TextAnchor.End : SVG.Style.TextAnchor.Start;
    }

    class setMax extends toIntRange {
        public float x;
        public float y;

        public setMax(float f, float f2) {
            super(offsetChildToAnchor.this, (toIntRange) null);
            this.x = f;
            this.y = f2;
        }

        public void processText(String str) {
            offsetChildToAnchor.debug("TextSequence render", new Object[0]);
            if (offsetChildToAnchor.this.visible()) {
                if (offsetChildToAnchor.this.state.hasFill) {
                    offsetChildToAnchor.this.canvas.drawText(str, this.x, this.y, offsetChildToAnchor.this.state.fillPaint);
                }
                if (offsetChildToAnchor.this.state.hasStroke) {
                    offsetChildToAnchor.this.canvas.drawText(str, this.x, this.y, offsetChildToAnchor.this.state.strokePaint);
                }
            }
            this.x += offsetChildToAnchor.this.state.fillPaint.measureText(str);
        }
    }

    abstract class toIntRange {
        public boolean doTextContainer(SVG.validateRelationship validaterelationship) {
            return true;
        }

        public abstract void processText(String str);

        private toIntRange() {
        }

        /* synthetic */ toIntRange(offsetChildToAnchor offsetchildtoanchor, toIntRange tointrange) {
            this();
        }
    }

    private void enumerateTextSpans(SVG.validateRelationship validaterelationship, toIntRange tointrange) {
        if (display()) {
            Iterator it = validaterelationship.children.iterator();
            boolean z = true;
            while (it.hasNext()) {
                SVG.ICustomTabsCallback.Stub.Proxy proxy = (SVG.ICustomTabsCallback.Stub.Proxy) it.next();
                if (proxy instanceof SVG.IPostMessageService) {
                    tointrange.processText(textXMLSpaceTransform(((SVG.IPostMessageService) proxy).text, z, !it.hasNext()));
                } else {
                    processTextChild(proxy, tointrange);
                }
                z = false;
            }
        }
    }

    private void processTextChild(SVG.ICustomTabsCallback.Stub.Proxy proxy, toIntRange tointrange) {
        float f;
        float f2;
        float f3;
        if (tointrange.doTextContainer((SVG.validateRelationship) proxy)) {
            if (proxy instanceof SVG.updateVisuals) {
                statePush();
                renderTextPath((SVG.updateVisuals) proxy);
            } else if (proxy instanceof SVG.newSession) {
                debug("TSpan render", new Object[0]);
                statePush();
                SVG.newSession newsession = (SVG.newSession) proxy;
                updateStyleForElement(this.state, newsession);
                if (display()) {
                    boolean z = tointrange instanceof setMax;
                    float f4 = 0.0f;
                    if (z) {
                        float floatValueX = (newsession.x == null || newsession.x.size() == 0) ? ((setMax) tointrange).x : ((SVG.values) newsession.x.get(0)).floatValueX(this);
                        f2 = (newsession.y == null || newsession.y.size() == 0) ? ((setMax) tointrange).y : ((SVG.values) newsession.y.get(0)).floatValueY(this);
                        f = (newsession.dx == null || newsession.dx.size() == 0) ? 0.0f : ((SVG.values) newsession.dx.get(0)).floatValueX(this);
                        if (!(newsession.dy == null || newsession.dy.size() == 0)) {
                            f4 = ((SVG.values) newsession.dy.get(0)).floatValueY(this);
                        }
                        f3 = f4;
                        f4 = floatValueX;
                    } else {
                        f3 = 0.0f;
                        f2 = 0.0f;
                        f = 0.0f;
                    }
                    checkForGradiantsAndPatterns((SVG.ICustomTabsCallback.Default) newsession.getTextRoot());
                    if (z) {
                        setMax setmax = (setMax) tointrange;
                        setmax.x = f4 + f;
                        setmax.y = f2 + f3;
                    }
                    boolean pushLayer = pushLayer();
                    enumerateTextSpans(newsession, tointrange);
                    if (pushLayer) {
                        popLayer(newsession);
                    }
                }
                statePop();
                return;
            } else if (proxy instanceof SVG.extraCommand) {
                statePush();
                SVG.extraCommand extracommand = (SVG.extraCommand) proxy;
                updateStyleForElement(this.state, extracommand);
                if (display()) {
                    checkForGradiantsAndPatterns((SVG.ICustomTabsCallback.Default) extracommand.getTextRoot());
                    SVG.ICustomTabsCallback.Stub.Proxy resolveIRI = proxy.document.resolveIRI(extracommand.href);
                    if (resolveIRI == null || !(resolveIRI instanceof SVG.validateRelationship)) {
                        error("Tref reference '%s' not found", extracommand.href);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        extractRawText((SVG.validateRelationship) resolveIRI, sb);
                        if (sb.length() > 0) {
                            tointrange.processText(sb.toString());
                        }
                    }
                }
            } else {
                return;
            }
            statePop();
        }
    }

    private void renderTextPath(SVG.updateVisuals updatevisuals) {
        debug("TextPath render", new Object[0]);
        updateStyleForElement(this.state, updatevisuals);
        if (display() && visible()) {
            SVG.ICustomTabsCallback.Stub.Proxy resolveIRI = updatevisuals.document.resolveIRI(updatevisuals.href);
            if (resolveIRI == null) {
                error("TextPath reference '%s' not found", updatevisuals.href);
                return;
            }
            SVG.invokeSuspend invokesuspend = (SVG.invokeSuspend) resolveIRI;
            Path path = new getMin(invokesuspend.d).getPath();
            if (invokesuspend.transform != null) {
                path.transform(invokesuspend.transform);
            }
            float floatValue = updatevisuals.startOffset != null ? updatevisuals.startOffset.floatValue(this, new PathMeasure(path, false).getLength()) : 0.0f;
            SVG.Style.TextAnchor anchorPosition = getAnchorPosition();
            if (anchorPosition != SVG.Style.TextAnchor.Start) {
                float calculateTextWidth = calculateTextWidth(updatevisuals);
                if (anchorPosition == SVG.Style.TextAnchor.Middle) {
                    calculateTextWidth /= 2.0f;
                }
                floatValue -= calculateTextWidth;
            }
            checkForGradiantsAndPatterns((SVG.ICustomTabsCallback.Default) updatevisuals.getTextRoot());
            boolean pushLayer = pushLayer();
            enumerateTextSpans(updatevisuals, new setMin(path, floatValue, 0.0f));
            if (pushLayer) {
                popLayer(updatevisuals);
            }
        }
    }

    class setMin extends setMax {
        private Path path;

        public setMin(Path path2, float f, float f2) {
            super(f, f2);
            this.path = path2;
        }

        public final void processText(String str) {
            if (offsetChildToAnchor.this.visible()) {
                if (offsetChildToAnchor.this.state.hasFill) {
                    offsetChildToAnchor.this.canvas.drawTextOnPath(str, this.path, this.x, this.y, offsetChildToAnchor.this.state.fillPaint);
                }
                if (offsetChildToAnchor.this.state.hasStroke) {
                    offsetChildToAnchor.this.canvas.drawTextOnPath(str, this.path, this.x, this.y, offsetChildToAnchor.this.state.strokePaint);
                }
            }
            this.x += offsetChildToAnchor.this.state.fillPaint.measureText(str);
        }
    }

    private float calculateTextWidth(SVG.validateRelationship validaterelationship) {
        equals equals2 = new equals(this, (equals) null);
        enumerateTextSpans(validaterelationship, equals2);
        return equals2.x;
    }

    class equals extends toIntRange {
        public float x;

        private equals() {
            super(offsetChildToAnchor.this, (toIntRange) null);
            this.x = 0.0f;
        }

        /* synthetic */ equals(offsetChildToAnchor offsetchildtoanchor, equals equals) {
            this();
        }

        public void processText(String str) {
            this.x += offsetChildToAnchor.this.state.fillPaint.measureText(str);
        }
    }

    class isInside extends toIntRange {
        RectF bbox = new RectF();
        float x;
        float y;

        public isInside(float f, float f2) {
            super(offsetChildToAnchor.this, (toIntRange) null);
            this.x = f;
            this.y = f2;
        }

        public final boolean doTextContainer(SVG.validateRelationship validaterelationship) {
            if (!(validaterelationship instanceof SVG.updateVisuals)) {
                return true;
            }
            SVG.updateVisuals updatevisuals = (SVG.updateVisuals) validaterelationship;
            SVG.ICustomTabsCallback.Stub.Proxy resolveIRI = validaterelationship.document.resolveIRI(updatevisuals.href);
            if (resolveIRI == null) {
                offsetChildToAnchor.error("TextPath path reference '%s' not found", updatevisuals.href);
                return false;
            }
            SVG.invokeSuspend invokesuspend = (SVG.invokeSuspend) resolveIRI;
            Path path = new getMin(invokesuspend.d).getPath();
            if (invokesuspend.transform != null) {
                path.transform(invokesuspend.transform);
            }
            RectF rectF = new RectF();
            path.computeBounds(rectF, true);
            this.bbox.union(rectF);
            return false;
        }

        public final void processText(String str) {
            if (offsetChildToAnchor.this.visible()) {
                Rect rect = new Rect();
                offsetChildToAnchor.this.state.fillPaint.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.x, this.y);
                this.bbox.union(rectF);
            }
            this.x += offsetChildToAnchor.this.state.fillPaint.measureText(str);
        }
    }

    private void extractRawText(SVG.validateRelationship validaterelationship, StringBuilder sb) {
        Iterator it = validaterelationship.children.iterator();
        boolean z = true;
        while (it.hasNext()) {
            SVG.ICustomTabsCallback.Stub.Proxy proxy = (SVG.ICustomTabsCallback.Stub.Proxy) it.next();
            if (proxy instanceof SVG.validateRelationship) {
                extractRawText((SVG.validateRelationship) proxy, sb);
            } else if (proxy instanceof SVG.IPostMessageService) {
                sb.append(textXMLSpaceTransform(((SVG.IPostMessageService) proxy).text, z, !it.hasNext()));
            }
            z = false;
        }
    }

    private String textXMLSpaceTransform(String str, boolean z, boolean z2) {
        if (this.state.spacePreserve) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    private void render(SVG.newSessionWithExtras newsessionwithextras, SVG.values values, SVG.values values2) {
        debug("Symbol render", new Object[0]);
        if (values != null && values.isZero()) {
            return;
        }
        if (values2 == null || !values2.isZero()) {
            PreserveAspectRatio preserveAspectRatio = newsessionwithextras.preserveAspectRatio != null ? newsessionwithextras.preserveAspectRatio : PreserveAspectRatio.LETTERBOX;
            updateStyleForElement(this.state, newsessionwithextras);
            this.state.viewPort = new SVG.length(0.0f, 0.0f, values != null ? values.floatValueX(this) : this.state.viewPort.width, values2 != null ? values2.floatValueX(this) : this.state.viewPort.height);
            if (!this.state.style.overflow.booleanValue()) {
                setClipRect(this.state.viewPort.minX, this.state.viewPort.minY, this.state.viewPort.width, this.state.viewPort.height);
            }
            if (newsessionwithextras.viewBox != null) {
                this.canvas.concat(calculateViewBoxTransform(this.state.viewPort, newsessionwithextras.viewBox, preserveAspectRatio));
                this.state.viewBox = newsessionwithextras.viewBox;
            }
            boolean pushLayer = pushLayer();
            renderChildren(newsessionwithextras, true);
            if (pushLayer) {
                popLayer(newsessionwithextras);
            }
            updateParentBoundingBox(newsessionwithextras);
        }
    }

    private void render(SVG.toString tostring) {
        debug("Image render", new Object[0]);
        if (tostring.width != null && !tostring.width.isZero() && tostring.height != null && !tostring.height.isZero() && tostring.href != null) {
            PreserveAspectRatio preserveAspectRatio = tostring.preserveAspectRatio != null ? tostring.preserveAspectRatio : PreserveAspectRatio.LETTERBOX;
            Bitmap checkForImageDataURL = checkForImageDataURL(tostring.href);
            if (checkForImageDataURL == null) {
                hasDependencies fileResolver = this.document.getFileResolver();
                if (fileResolver != null) {
                    checkForImageDataURL = fileResolver.resolveImage(tostring.href);
                } else {
                    return;
                }
            }
            if (checkForImageDataURL == null) {
                error("Could not locate image '%s'", tostring.href);
                return;
            }
            updateStyleForElement(this.state, tostring);
            if (display() && visible()) {
                if (tostring.transform != null) {
                    this.canvas.concat(tostring.transform);
                }
                this.state.viewPort = new SVG.length(tostring.x != null ? tostring.x.floatValueX(this) : 0.0f, tostring.y != null ? tostring.y.floatValueY(this) : 0.0f, tostring.width.floatValueX(this), tostring.height.floatValueX(this));
                if (!this.state.style.overflow.booleanValue()) {
                    setClipRect(this.state.viewPort.minX, this.state.viewPort.minY, this.state.viewPort.width, this.state.viewPort.height);
                }
                tostring.boundingBox = new SVG.length(0.0f, 0.0f, (float) checkForImageDataURL.getWidth(), (float) checkForImageDataURL.getHeight());
                this.canvas.concat(calculateViewBoxTransform(this.state.viewPort, tostring.boundingBox, preserveAspectRatio));
                updateParentBoundingBox(tostring);
                checkForClipPath(tostring);
                boolean pushLayer = pushLayer();
                viewportFill();
                this.canvas.drawBitmap(checkForImageDataURL, 0.0f, 0.0f, this.state.fillPaint);
                if (pushLayer) {
                    popLayer(tostring);
                }
            }
        }
    }

    private Bitmap checkForImageDataURL(String str) {
        int indexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (indexOf = str.indexOf(44)) == -1 || indexOf < 12 || !";base64".equals(str.substring(indexOf - 7, indexOf))) {
            return null;
        }
        byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    private boolean display() {
        if (this.state.style.display != null) {
            return this.state.style.display.booleanValue();
        }
        return true;
    }

    /* access modifiers changed from: private */
    public boolean visible() {
        if (this.state.style.visibility != null) {
            return this.state.style.visibility.booleanValue();
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        if (r6 != 10) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0094, code lost:
        r4 = r4 - r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0095 A[PHI: r4 
      PHI: (r4v2 float) = (r4v1 float), (r4v3 float) binds: [B:28:0x0088, B:31:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Matrix calculateViewBoxTransform(com.caverock.androidsvg.SVG.length r10, com.caverock.androidsvg.SVG.length r11, com.caverock.androidsvg.PreserveAspectRatio r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L_0x00a2
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = r12.getAlignment()
            if (r1 != 0) goto L_0x000f
            goto L_0x00a2
        L_0x000f:
            float r1 = r10.width
            float r2 = r11.width
            float r1 = r1 / r2
            float r2 = r10.height
            float r3 = r11.height
            float r2 = r2 / r3
            float r3 = r11.minX
            float r3 = -r3
            float r4 = r11.minY
            float r4 = -r4
            com.caverock.androidsvg.PreserveAspectRatio r5 = com.caverock.androidsvg.PreserveAspectRatio.STRETCH
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L_0x0035
            float r11 = r10.minX
            float r10 = r10.minY
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L_0x0035:
            com.caverock.androidsvg.PreserveAspectRatio$Scale r5 = r12.getScale()
            com.caverock.androidsvg.PreserveAspectRatio$Scale r6 = com.caverock.androidsvg.PreserveAspectRatio.Scale.Slice
            if (r5 != r6) goto L_0x0042
            float r1 = java.lang.Math.max(r1, r2)
            goto L_0x0046
        L_0x0042:
            float r1 = java.lang.Math.min(r1, r2)
        L_0x0046:
            float r2 = r10.width
            float r2 = r2 / r1
            float r5 = r10.height
            float r5 = r5 / r1
            int[] r6 = $SWITCH_TABLE$com$caverock$androidsvg$PreserveAspectRatio$Alignment()
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r7 = r12.getAlignment()
            int r7 = r7.ordinal()
            r6 = r6[r7]
            r7 = 3
            r8 = 1073741824(0x40000000, float:2.0)
            if (r6 == r7) goto L_0x0075
            r7 = 4
            if (r6 == r7) goto L_0x0071
            r7 = 6
            if (r6 == r7) goto L_0x0075
            r7 = 7
            if (r6 == r7) goto L_0x0071
            r7 = 9
            if (r6 == r7) goto L_0x0075
            r7 = 10
            if (r6 == r7) goto L_0x0071
            goto L_0x007a
        L_0x0071:
            float r6 = r11.width
            float r6 = r6 - r2
            goto L_0x0079
        L_0x0075:
            float r6 = r11.width
            float r6 = r6 - r2
            float r6 = r6 / r8
        L_0x0079:
            float r3 = r3 - r6
        L_0x007a:
            int[] r2 = $SWITCH_TABLE$com$caverock$androidsvg$PreserveAspectRatio$Alignment()
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r12 = r12.getAlignment()
            int r12 = r12.ordinal()
            r12 = r2[r12]
            switch(r12) {
                case 5: goto L_0x0090;
                case 6: goto L_0x0090;
                case 7: goto L_0x0090;
                case 8: goto L_0x008c;
                case 9: goto L_0x008c;
                case 10: goto L_0x008c;
                default: goto L_0x008b;
            }
        L_0x008b:
            goto L_0x0095
        L_0x008c:
            float r11 = r11.height
            float r11 = r11 - r5
            goto L_0x0094
        L_0x0090:
            float r11 = r11.height
            float r11 = r11 - r5
            float r11 = r11 / r8
        L_0x0094:
            float r4 = r4 - r11
        L_0x0095:
            float r11 = r10.minX
            float r10 = r10.minY
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L_0x00a2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.offsetChildToAnchor.calculateViewBoxTransform(com.caverock.androidsvg.SVG$length, com.caverock.androidsvg.SVG$length, com.caverock.androidsvg.PreserveAspectRatio):android.graphics.Matrix");
    }

    private boolean isSpecified(SVG.Style style, long j) {
        return (j & style.specifiedFlags) != 0;
    }

    private void updateStyle(IsOverlapping isOverlapping, SVG.Style style) {
        SVG svg;
        if (isSpecified(style, 4096)) {
            isOverlapping.style.color = style.color;
        }
        if (isSpecified(style, 2048)) {
            isOverlapping.style.opacity = style.opacity;
        }
        boolean z = false;
        if (isSpecified(style, 1)) {
            isOverlapping.style.fill = style.fill;
            isOverlapping.hasFill = style.fill != null;
        }
        if (isSpecified(style, 4)) {
            isOverlapping.style.fillOpacity = style.fillOpacity;
        }
        if (isSpecified(style, 6149)) {
            setPaintColour(isOverlapping, true, isOverlapping.style.fill);
        }
        if (isSpecified(style, 2)) {
            isOverlapping.style.fillRule = style.fillRule;
        }
        if (isSpecified(style, 8)) {
            isOverlapping.style.stroke = style.stroke;
            isOverlapping.hasStroke = style.stroke != null;
        }
        if (isSpecified(style, 16)) {
            isOverlapping.style.strokeOpacity = style.strokeOpacity;
        }
        if (isSpecified(style, 6168)) {
            setPaintColour(isOverlapping, false, isOverlapping.style.stroke);
        }
        if (isSpecified(style, 34359738368L)) {
            isOverlapping.style.vectorEffect = style.vectorEffect;
        }
        if (isSpecified(style, 32)) {
            isOverlapping.style.strokeWidth = style.strokeWidth;
            isOverlapping.strokePaint.setStrokeWidth(isOverlapping.style.strokeWidth.floatValue(this));
        }
        if (isSpecified(style, 64)) {
            isOverlapping.style.strokeLineCap = style.strokeLineCap;
            int i = $SWITCH_TABLE$com$caverock$androidsvg$SVG$Style$LineCaps()[style.strokeLineCap.ordinal()];
            if (i == 1) {
                isOverlapping.strokePaint.setStrokeCap(Paint.Cap.BUTT);
            } else if (i == 2) {
                isOverlapping.strokePaint.setStrokeCap(Paint.Cap.ROUND);
            } else if (i == 3) {
                isOverlapping.strokePaint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (isSpecified(style, 128)) {
            isOverlapping.style.strokeLineJoin = style.strokeLineJoin;
            int i2 = $SWITCH_TABLE$com$caverock$androidsvg$SVG$Style$LineJoin()[style.strokeLineJoin.ordinal()];
            if (i2 == 1) {
                isOverlapping.strokePaint.setStrokeJoin(Paint.Join.MITER);
            } else if (i2 == 2) {
                isOverlapping.strokePaint.setStrokeJoin(Paint.Join.ROUND);
            } else if (i2 == 3) {
                isOverlapping.strokePaint.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (isSpecified(style, 256)) {
            isOverlapping.style.strokeMiterLimit = style.strokeMiterLimit;
            isOverlapping.strokePaint.setStrokeMiter(style.strokeMiterLimit.floatValue());
        }
        if (isSpecified(style, 512)) {
            isOverlapping.style.strokeDashArray = style.strokeDashArray;
        }
        if (isSpecified(style, ConvertUtils.KB)) {
            isOverlapping.style.strokeDashOffset = style.strokeDashOffset;
        }
        Typeface typeface = null;
        if (isSpecified(style, 1536)) {
            if (isOverlapping.style.strokeDashArray == null) {
                isOverlapping.strokePaint.setPathEffect((PathEffect) null);
            } else {
                int length2 = isOverlapping.style.strokeDashArray.length;
                int i3 = length2 % 2 == 0 ? length2 : length2 * 2;
                float[] fArr = new float[i3];
                float f = 0.0f;
                for (int i4 = 0; i4 < i3; i4++) {
                    fArr[i4] = isOverlapping.style.strokeDashArray[i4 % length2].floatValue(this);
                    f += fArr[i4];
                }
                if (f == 0.0f) {
                    isOverlapping.strokePaint.setPathEffect((PathEffect) null);
                } else {
                    float floatValue = isOverlapping.style.strokeDashOffset.floatValue(this);
                    if (floatValue < 0.0f) {
                        floatValue = (floatValue % f) + f;
                    }
                    isOverlapping.strokePaint.setPathEffect(new DashPathEffect(fArr, floatValue));
                }
            }
        }
        if (isSpecified(style, 16384)) {
            float currentFontSize = getCurrentFontSize();
            isOverlapping.style.fontSize = style.fontSize;
            isOverlapping.fillPaint.setTextSize(style.fontSize.floatValue(this, currentFontSize));
            isOverlapping.strokePaint.setTextSize(style.fontSize.floatValue(this, currentFontSize));
        }
        if (isSpecified(style, 8192)) {
            isOverlapping.style.fontFamily = style.fontFamily;
        }
        if (isSpecified(style, 32768)) {
            if (style.fontWeight.intValue() == -1 && isOverlapping.style.fontWeight.intValue() > 100) {
                SVG.Style style2 = isOverlapping.style;
                style2.fontWeight = Integer.valueOf(style2.fontWeight.intValue() - 100);
            } else if (style.fontWeight.intValue() != 1 || isOverlapping.style.fontWeight.intValue() >= 900) {
                isOverlapping.style.fontWeight = style.fontWeight;
            } else {
                SVG.Style style3 = isOverlapping.style;
                style3.fontWeight = Integer.valueOf(style3.fontWeight.intValue() + 100);
            }
        }
        if (isSpecified(style, 65536)) {
            isOverlapping.style.fontStyle = style.fontStyle;
        }
        if (isSpecified(style, 106496)) {
            if (isOverlapping.style.fontFamily != null && (svg = this.document) != null) {
                hasDependencies fileResolver = svg.getFileResolver();
                for (String next : isOverlapping.style.fontFamily) {
                    Typeface checkGenericFont = checkGenericFont(next, isOverlapping.style.fontWeight, isOverlapping.style.fontStyle);
                    if (checkGenericFont != null || fileResolver == null) {
                        typeface = checkGenericFont;
                        continue;
                    } else {
                        typeface = fileResolver.resolveFont(next, isOverlapping.style.fontWeight.intValue(), String.valueOf(isOverlapping.style.fontStyle));
                        continue;
                    }
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                typeface = checkGenericFont("sans-serif", isOverlapping.style.fontWeight, isOverlapping.style.fontStyle);
            }
            isOverlapping.fillPaint.setTypeface(typeface);
            isOverlapping.strokePaint.setTypeface(typeface);
        }
        if (isSpecified(style, 131072)) {
            isOverlapping.style.textDecoration = style.textDecoration;
            isOverlapping.fillPaint.setStrikeThruText(style.textDecoration == SVG.Style.TextDecoration.LineThrough);
            isOverlapping.fillPaint.setUnderlineText(style.textDecoration == SVG.Style.TextDecoration.Underline);
            if (Build.VERSION.SDK_INT >= 17) {
                isOverlapping.strokePaint.setStrikeThruText(style.textDecoration == SVG.Style.TextDecoration.LineThrough);
                Paint paint = isOverlapping.strokePaint;
                if (style.textDecoration == SVG.Style.TextDecoration.Underline) {
                    z = true;
                }
                paint.setUnderlineText(z);
            }
        }
        if (isSpecified(style, 68719476736L)) {
            isOverlapping.style.direction = style.direction;
        }
        if (isSpecified(style, 262144)) {
            isOverlapping.style.textAnchor = style.textAnchor;
        }
        if (isSpecified(style, 524288)) {
            isOverlapping.style.overflow = style.overflow;
        }
        if (isSpecified(style, 2097152)) {
            isOverlapping.style.markerStart = style.markerStart;
        }
        if (isSpecified(style, 4194304)) {
            isOverlapping.style.markerMid = style.markerMid;
        }
        if (isSpecified(style, 8388608)) {
            isOverlapping.style.markerEnd = style.markerEnd;
        }
        if (isSpecified(style, 16777216)) {
            isOverlapping.style.display = style.display;
        }
        if (isSpecified(style, 33554432)) {
            isOverlapping.style.visibility = style.visibility;
        }
        if (isSpecified(style, ConvertUtils.MB)) {
            isOverlapping.style.clip = style.clip;
        }
        if (isSpecified(style, 268435456)) {
            isOverlapping.style.clipPath = style.clipPath;
        }
        if (isSpecified(style, 536870912)) {
            isOverlapping.style.clipRule = style.clipRule;
        }
        if (isSpecified(style, ConvertUtils.GB)) {
            isOverlapping.style.mask = style.mask;
        }
        if (isSpecified(style, 67108864)) {
            isOverlapping.style.stopColor = style.stopColor;
        }
        if (isSpecified(style, 134217728)) {
            isOverlapping.style.stopOpacity = style.stopOpacity;
        }
        if (isSpecified(style, 8589934592L)) {
            isOverlapping.style.viewportFill = style.viewportFill;
        }
        if (isSpecified(style, 17179869184L)) {
            isOverlapping.style.viewportFillOpacity = style.viewportFillOpacity;
        }
    }

    private void setPaintColour(IsOverlapping isOverlapping, boolean z, SVG.getDefaultImpl getdefaultimpl) {
        int i;
        SVG.Style style = isOverlapping.style;
        float floatValue = (z ? style.fillOpacity : style.strokeOpacity).floatValue();
        if (getdefaultimpl instanceof SVG.getMin) {
            i = ((SVG.getMin) getdefaultimpl).colour;
        } else if (getdefaultimpl instanceof SVG.toFloatRange) {
            i = isOverlapping.style.color.colour;
        } else {
            return;
        }
        int clamp255 = i | (clamp255(floatValue) << 24);
        if (z) {
            isOverlapping.fillPaint.setColor(clamp255);
        } else {
            isOverlapping.strokePaint.setColor(clamp255);
        }
    }

    private Typeface checkGenericFont(String str, Integer num, SVG.Style.FontStyle fontStyle) {
        int i = 1;
        boolean z = fontStyle == SVG.Style.FontStyle.Italic;
        if (num.intValue() <= 500) {
            i = z ? 2 : 0;
        } else if (z) {
            i = 3;
        }
        if (str.equals(C.SERIF_NAME)) {
            return Typeface.create(Typeface.SERIF, i);
        }
        if (str.equals("sans-serif")) {
            return Typeface.create(Typeface.SANS_SERIF, i);
        }
        if (str.equals("monospace")) {
            return Typeface.create(Typeface.MONOSPACE, i);
        }
        if (str.equals("cursive")) {
            return Typeface.create(Typeface.SANS_SERIF, i);
        }
        if (str.equals("fantasy")) {
            return Typeface.create(Typeface.SANS_SERIF, i);
        }
        return null;
    }

    private Path.FillType getFillTypeFromState() {
        if (this.state.style.fillRule == null) {
            return Path.FillType.WINDING;
        }
        if ($SWITCH_TABLE$com$caverock$androidsvg$SVG$Style$FillRule()[this.state.style.fillRule.ordinal()] != 2) {
            return Path.FillType.WINDING;
        }
        return Path.FillType.EVEN_ODD;
    }

    private void setClipRect(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        if (this.state.style.clip != null) {
            f += this.state.style.clip.left.floatValueX(this);
            f2 += this.state.style.clip.top.floatValueY(this);
            f5 -= this.state.style.clip.right.floatValueX(this);
            f6 -= this.state.style.clip.bottom.floatValueY(this);
        }
        this.canvas.clipRect(f, f2, f5, f6);
    }

    private void viewportFill() {
        int i;
        if (this.state.style.viewportFill instanceof SVG.getMin) {
            i = ((SVG.getMin) this.state.style.viewportFill).colour;
        } else if (this.state.style.viewportFill instanceof SVG.toFloatRange) {
            i = this.state.style.color.colour;
        } else {
            return;
        }
        if (this.state.style.viewportFillOpacity != null) {
            i |= clamp255(this.state.style.viewportFillOpacity.floatValue()) << 24;
        }
        this.canvas.drawColor(i);
    }

    class getMin implements SVG.create {
        float lastX;
        float lastY;
        Path path = new Path();

        public getMin(SVG.getCause getcause) {
            getcause.enumeratePath(this);
        }

        public final Path getPath() {
            return this.path;
        }

        public final void moveTo(float f, float f2) {
            this.path.moveTo(f, f2);
            this.lastX = f;
            this.lastY = f2;
        }

        public final void lineTo(float f, float f2) {
            this.path.lineTo(f, f2);
            this.lastX = f;
            this.lastY = f2;
        }

        public final void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            this.path.cubicTo(f, f2, f3, f4, f5, f6);
            this.lastX = f5;
            this.lastY = f6;
        }

        public final void quadTo(float f, float f2, float f3, float f4) {
            this.path.quadTo(f, f2, f3, f4);
            this.lastX = f3;
            this.lastY = f4;
        }

        public final void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            offsetChildToAnchor.arcTo(this.lastX, this.lastY, f, f2, f3, z, z2, f4, f5, this);
            this.lastX = f4;
            this.lastY = f5;
        }

        public final void close() {
            this.path.close();
        }
    }

    /* access modifiers changed from: private */
    public static void arcTo(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, SVG.create create) {
        double d;
        float f8 = f5;
        boolean z3 = z2;
        float f9 = f6;
        float f10 = f7;
        if (f != f9 || f2 != f10) {
            if (f3 == 0.0f || f4 == 0.0f) {
                create.lineTo(f9, f10);
                return;
            }
            float abs = Math.abs(f3);
            float abs2 = Math.abs(f4);
            double d2 = (double) f8;
            Double.isNaN(d2);
            double radians = (double) ((float) Math.toRadians(d2 % 360.0d));
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d3 = (double) (f - f9);
            Double.isNaN(d3);
            double d4 = d3 / 2.0d;
            double d5 = (double) (f2 - f10);
            Double.isNaN(d5);
            double d6 = d5 / 2.0d;
            double d7 = (cos * d4) + (sin * d6);
            double d8 = ((-sin) * d4) + (d6 * cos);
            double d9 = (double) (abs * abs);
            double d10 = (double) (abs2 * abs2);
            double d11 = d7 * d7;
            double d12 = d8 * d8;
            Double.isNaN(d9);
            Double.isNaN(d10);
            double d13 = (d11 / d9) + (d12 / d10);
            double d14 = 1.0d;
            if (d13 > 1.0d) {
                abs *= (float) Math.sqrt(d13);
                abs2 *= (float) Math.sqrt(d13);
                d9 = (double) (abs * abs);
                d10 = (double) (abs2 * abs2);
            }
            double d15 = (double) (z == z3 ? -1 : 1);
            double d16 = d9 * d10;
            double d17 = d9 * d12;
            double d18 = d10 * d11;
            double d19 = ((d16 - d17) - d18) / (d17 + d18);
            if (d19 < 0.0d) {
                d19 = 0.0d;
            }
            double sqrt = Math.sqrt(d19);
            Double.isNaN(d15);
            double d20 = d15 * sqrt;
            double d21 = (double) abs;
            Double.isNaN(d21);
            double d22 = (double) abs2;
            Double.isNaN(d22);
            double d23 = ((d21 * d8) / d22) * d20;
            Double.isNaN(d22);
            Double.isNaN(d21);
            float f11 = abs;
            float f12 = abs2;
            double d24 = d20 * (-((d22 * d7) / d21));
            double d25 = (double) (f + f6);
            Double.isNaN(d25);
            double d26 = d22;
            double d27 = (double) (f2 + f7);
            Double.isNaN(d27);
            double d28 = (d25 / 2.0d) + ((cos * d23) - (sin * d24));
            double d29 = (d27 / 2.0d) + (sin * d23) + (cos * d24);
            Double.isNaN(d21);
            double d30 = (d7 - d23) / d21;
            Double.isNaN(d26);
            double d31 = (d8 - d24) / d26;
            Double.isNaN(d21);
            double d32 = ((-d7) - d23) / d21;
            Double.isNaN(d26);
            double d33 = ((-d8) - d24) / d26;
            double d34 = (d30 * d30) + (d31 * d31);
            double degrees = Math.toDegrees((d31 < 0.0d ? -1.0d : 1.0d) * Math.acos(d30 / Math.sqrt(d34)));
            double sqrt2 = Math.sqrt(d34 * ((d32 * d32) + (d33 * d33)));
            double d35 = (d30 * d32) + (d31 * d33);
            if ((d30 * d33) - (d31 * d32) < 0.0d) {
                d14 = -1.0d;
            }
            double degrees2 = Math.toDegrees(d14 * Math.acos(d35 / sqrt2));
            if (z2 || degrees2 <= 0.0d) {
                d = 360.0d;
                if (z2 && degrees2 < 0.0d) {
                    degrees2 += 360.0d;
                }
            } else {
                d = 360.0d;
                degrees2 -= 360.0d;
            }
            float[] arcToBeziers = arcToBeziers(degrees % d, degrees2 % d);
            Matrix matrix = new Matrix();
            matrix.postScale(f11, f12);
            matrix.postRotate(f5);
            matrix.postTranslate((float) d28, (float) d29);
            matrix.mapPoints(arcToBeziers);
            arcToBeziers[arcToBeziers.length - 2] = f6;
            arcToBeziers[arcToBeziers.length - 1] = f7;
            for (int i = 0; i < arcToBeziers.length; i += 6) {
                create.cubicTo(arcToBeziers[i], arcToBeziers[i + 1], arcToBeziers[i + 2], arcToBeziers[i + 3], arcToBeziers[i + 4], arcToBeziers[i + 5]);
            }
        }
    }

    private static float[] arcToBeziers(double d, double d2) {
        int ceil = (int) Math.ceil(Math.abs(d2) / 90.0d);
        double radians = Math.toRadians(d);
        double radians2 = Math.toRadians(d2);
        double d3 = (double) ceil;
        Double.isNaN(d3);
        float f = (float) (radians2 / d3);
        double d4 = (double) f;
        Double.isNaN(d4);
        double d5 = d4 / 2.0d;
        double sin = (Math.sin(d5) * 1.3333333333333333d) / (Math.cos(d5) + 1.0d);
        float[] fArr = new float[(ceil * 6)];
        int i = 0;
        int i2 = 0;
        while (i < ceil) {
            double d6 = (double) (((float) i) * f);
            Double.isNaN(d6);
            double d7 = d6 + radians;
            double cos = Math.cos(d7);
            double sin2 = Math.sin(d7);
            int i3 = i2 + 1;
            int i4 = ceil;
            double d8 = radians;
            fArr[i2] = (float) (cos - (sin * sin2));
            int i5 = i3 + 1;
            fArr[i3] = (float) (sin2 + (cos * sin));
            Double.isNaN(d4);
            double d9 = d7 + d4;
            double cos2 = Math.cos(d9);
            double sin3 = Math.sin(d9);
            int i6 = i5 + 1;
            fArr[i5] = (float) ((sin * sin3) + cos2);
            int i7 = i6 + 1;
            fArr[i6] = (float) (sin3 - (sin * cos2));
            int i8 = i7 + 1;
            fArr[i7] = (float) cos2;
            fArr[i8] = (float) sin3;
            i++;
            radians = d8;
            i2 = i8 + 1;
            ceil = i4;
        }
        return fArr;
    }

    class getMax {
        public float dx = 0.0f;
        public float dy = 0.0f;
        public float x;
        public float y;

        public getMax(float f, float f2, float f3, float f4) {
            this.x = f;
            this.y = f2;
            double sqrt = Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
            if (sqrt != 0.0d) {
                double d = (double) f3;
                Double.isNaN(d);
                this.dx = (float) (d / sqrt);
                double d2 = (double) f4;
                Double.isNaN(d2);
                this.dy = (float) (d2 / sqrt);
            }
        }

        public void add(float f, float f2) {
            float f3 = f - this.x;
            float f4 = f2 - this.y;
            double sqrt = Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
            if (sqrt != 0.0d) {
                float f5 = this.dx;
                double d = (double) f3;
                Double.isNaN(d);
                this.dx = f5 + ((float) (d / sqrt));
                float f6 = this.dy;
                double d2 = (double) f4;
                Double.isNaN(d2);
                this.dy = f6 + ((float) (d2 / sqrt));
            }
        }

        public void add(getMax getmax) {
            this.dx += getmax.dx;
            this.dy += getmax.dy;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(this.x);
            sb.append(",");
            sb.append(this.y);
            sb.append(" ");
            sb.append(this.dx);
            sb.append(",");
            sb.append(this.dy);
            sb.append(")");
            return sb.toString();
        }
    }

    class length implements SVG.create {
        private boolean closepathReAdjustPending;
        private getMax lastPos = null;
        private List<getMax> markers = new ArrayList();
        private boolean normalCubic = true;
        private boolean startArc = false;
        private float startX;
        private float startY;
        private int subpathStartIndex = -1;

        public length(SVG.getCause getcause) {
            getcause.enumeratePath(this);
            if (this.closepathReAdjustPending) {
                this.lastPos.add(this.markers.get(this.subpathStartIndex));
                this.markers.set(this.subpathStartIndex, this.lastPos);
                this.closepathReAdjustPending = false;
            }
            getMax getmax = this.lastPos;
            if (getmax != null) {
                this.markers.add(getmax);
            }
        }

        public final List<getMax> getMarkers() {
            return this.markers;
        }

        public final void moveTo(float f, float f2) {
            if (this.closepathReAdjustPending) {
                this.lastPos.add(this.markers.get(this.subpathStartIndex));
                this.markers.set(this.subpathStartIndex, this.lastPos);
                this.closepathReAdjustPending = false;
            }
            getMax getmax = this.lastPos;
            if (getmax != null) {
                this.markers.add(getmax);
            }
            this.startX = f;
            this.startY = f2;
            this.lastPos = new getMax(f, f2, 0.0f, 0.0f);
            this.subpathStartIndex = this.markers.size();
        }

        public final void lineTo(float f, float f2) {
            this.lastPos.add(f, f2);
            this.markers.add(this.lastPos);
            this.lastPos = new getMax(f, f2, f - this.lastPos.x, f2 - this.lastPos.y);
            this.closepathReAdjustPending = false;
        }

        public final void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            if (this.normalCubic || this.startArc) {
                this.lastPos.add(f, f2);
                this.markers.add(this.lastPos);
                this.startArc = false;
            }
            this.lastPos = new getMax(f5, f6, f5 - f3, f6 - f4);
            this.closepathReAdjustPending = false;
        }

        public final void quadTo(float f, float f2, float f3, float f4) {
            this.lastPos.add(f, f2);
            this.markers.add(this.lastPos);
            this.lastPos = new getMax(f3, f4, f3 - f, f4 - f2);
            this.closepathReAdjustPending = false;
        }

        public final void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            this.startArc = true;
            this.normalCubic = false;
            offsetChildToAnchor.arcTo(this.lastPos.x, this.lastPos.y, f, f2, f3, z, z2, f4, f5, this);
            this.normalCubic = true;
            this.closepathReAdjustPending = false;
        }

        public final void close() {
            this.markers.add(this.lastPos);
            lineTo(this.startX, this.startY);
            this.closepathReAdjustPending = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void renderMarkers(com.caverock.androidsvg.SVG.toIntRange r11) {
        /*
            r10 = this;
            o.offsetChildToAnchor$IsOverlapping r0 = r10.state
            com.caverock.androidsvg.SVG$Style r0 = r0.style
            java.lang.String r0 = r0.markerStart
            if (r0 != 0) goto L_0x0019
            o.offsetChildToAnchor$IsOverlapping r0 = r10.state
            com.caverock.androidsvg.SVG$Style r0 = r0.style
            java.lang.String r0 = r0.markerMid
            if (r0 != 0) goto L_0x0019
            o.offsetChildToAnchor$IsOverlapping r0 = r10.state
            com.caverock.androidsvg.SVG$Style r0 = r0.style
            java.lang.String r0 = r0.markerEnd
            if (r0 != 0) goto L_0x0019
            return
        L_0x0019:
            o.offsetChildToAnchor$IsOverlapping r0 = r10.state
            com.caverock.androidsvg.SVG$Style r0 = r0.style
            java.lang.String r0 = r0.markerStart
            java.lang.String r1 = "Marker reference '%s' not found"
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0044
            com.caverock.androidsvg.SVG r0 = r11.document
            o.offsetChildToAnchor$IsOverlapping r5 = r10.state
            com.caverock.androidsvg.SVG$Style r5 = r5.style
            java.lang.String r5 = r5.markerStart
            com.caverock.androidsvg.SVG$ICustomTabsCallback$Stub$Proxy r0 = r0.resolveIRI(r5)
            if (r0 == 0) goto L_0x0037
            com.caverock.androidsvg.SVG$valueOf r0 = (com.caverock.androidsvg.SVG.valueOf) r0
            goto L_0x0045
        L_0x0037:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            o.offsetChildToAnchor$IsOverlapping r5 = r10.state
            com.caverock.androidsvg.SVG$Style r5 = r5.style
            java.lang.String r5 = r5.markerStart
            r0[r2] = r5
            error(r1, r0)
        L_0x0044:
            r0 = r3
        L_0x0045:
            o.offsetChildToAnchor$IsOverlapping r5 = r10.state
            com.caverock.androidsvg.SVG$Style r5 = r5.style
            java.lang.String r5 = r5.markerMid
            if (r5 == 0) goto L_0x006b
            com.caverock.androidsvg.SVG r5 = r11.document
            o.offsetChildToAnchor$IsOverlapping r6 = r10.state
            com.caverock.androidsvg.SVG$Style r6 = r6.style
            java.lang.String r6 = r6.markerMid
            com.caverock.androidsvg.SVG$ICustomTabsCallback$Stub$Proxy r5 = r5.resolveIRI(r6)
            if (r5 == 0) goto L_0x005e
            com.caverock.androidsvg.SVG$valueOf r5 = (com.caverock.androidsvg.SVG.valueOf) r5
            goto L_0x006c
        L_0x005e:
            java.lang.Object[] r5 = new java.lang.Object[r4]
            o.offsetChildToAnchor$IsOverlapping r6 = r10.state
            com.caverock.androidsvg.SVG$Style r6 = r6.style
            java.lang.String r6 = r6.markerMid
            r5[r2] = r6
            error(r1, r5)
        L_0x006b:
            r5 = r3
        L_0x006c:
            o.offsetChildToAnchor$IsOverlapping r6 = r10.state
            com.caverock.androidsvg.SVG$Style r6 = r6.style
            java.lang.String r6 = r6.markerEnd
            if (r6 == 0) goto L_0x0092
            com.caverock.androidsvg.SVG r6 = r11.document
            o.offsetChildToAnchor$IsOverlapping r7 = r10.state
            com.caverock.androidsvg.SVG$Style r7 = r7.style
            java.lang.String r7 = r7.markerEnd
            com.caverock.androidsvg.SVG$ICustomTabsCallback$Stub$Proxy r6 = r6.resolveIRI(r7)
            if (r6 == 0) goto L_0x0085
            com.caverock.androidsvg.SVG$valueOf r6 = (com.caverock.androidsvg.SVG.valueOf) r6
            goto L_0x0093
        L_0x0085:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            o.offsetChildToAnchor$IsOverlapping r7 = r10.state
            com.caverock.androidsvg.SVG$Style r7 = r7.style
            java.lang.String r7 = r7.markerEnd
            r6[r2] = r7
            error(r1, r6)
        L_0x0092:
            r6 = r3
        L_0x0093:
            boolean r1 = r11 instanceof com.caverock.androidsvg.SVG.invokeSuspend
            if (r1 == 0) goto L_0x00a5
            o.offsetChildToAnchor$length r1 = new o.offsetChildToAnchor$length
            com.caverock.androidsvg.SVG$invokeSuspend r11 = (com.caverock.androidsvg.SVG.invokeSuspend) r11
            com.caverock.androidsvg.SVG$getCause r11 = r11.d
            r1.<init>(r11)
            java.util.List r11 = r1.getMarkers()
            goto L_0x00b6
        L_0x00a5:
            boolean r1 = r11 instanceof com.caverock.androidsvg.SVG$FastBitmap$CoordinateSystem
            if (r1 == 0) goto L_0x00b0
            com.caverock.androidsvg.SVG$FastBitmap$CoordinateSystem r11 = (com.caverock.androidsvg.SVG$FastBitmap$CoordinateSystem) r11
            java.util.List r11 = r10.calculateMarkerPositions((com.caverock.androidsvg.SVG$FastBitmap$CoordinateSystem) r11)
            goto L_0x00b6
        L_0x00b0:
            com.caverock.androidsvg.SVG$onNavigationEvent r11 = (com.caverock.androidsvg.SVG.onNavigationEvent) r11
            java.util.List r11 = r10.calculateMarkerPositions((com.caverock.androidsvg.SVG.onNavigationEvent) r11)
        L_0x00b6:
            if (r11 != 0) goto L_0x00b9
            return
        L_0x00b9:
            int r1 = r11.size()
            if (r1 != 0) goto L_0x00c0
            return
        L_0x00c0:
            o.offsetChildToAnchor$IsOverlapping r7 = r10.state
            com.caverock.androidsvg.SVG$Style r7 = r7.style
            o.offsetChildToAnchor$IsOverlapping r8 = r10.state
            com.caverock.androidsvg.SVG$Style r8 = r8.style
            o.offsetChildToAnchor$IsOverlapping r9 = r10.state
            com.caverock.androidsvg.SVG$Style r9 = r9.style
            r9.markerEnd = r3
            r8.markerMid = r3
            r7.markerStart = r3
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r2 = r11.get(r2)
            o.offsetChildToAnchor$getMax r2 = (o.offsetChildToAnchor.getMax) r2
            r10.renderMarker(r0, r2)
        L_0x00dd:
            if (r5 == 0) goto L_0x00f1
            r0 = 1
        L_0x00e0:
            int r2 = r1 + -1
            if (r0 < r2) goto L_0x00e5
            goto L_0x00f1
        L_0x00e5:
            java.lang.Object r2 = r11.get(r0)
            o.offsetChildToAnchor$getMax r2 = (o.offsetChildToAnchor.getMax) r2
            r10.renderMarker(r5, r2)
            int r0 = r0 + 1
            goto L_0x00e0
        L_0x00f1:
            if (r6 == 0) goto L_0x00fd
            int r1 = r1 - r4
            java.lang.Object r11 = r11.get(r1)
            o.offsetChildToAnchor$getMax r11 = (o.offsetChildToAnchor.getMax) r11
            r10.renderMarker(r6, r11)
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.offsetChildToAnchor.renderMarkers(com.caverock.androidsvg.SVG$toIntRange):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0127, code lost:
        r1 = 0.0f - r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0128 A[PHI: r1 
      PHI: (r1v1 float) = (r1v0 float), (r1v2 float) binds: [B:60:0x011d, B:63:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void renderMarker(com.caverock.androidsvg.SVG.valueOf r12, o.offsetChildToAnchor.getMax r13) {
        /*
            r11 = this;
            r11.statePush()
            java.lang.Float r0 = r12.orient
            r1 = 0
            if (r0 == 0) goto L_0x0037
            java.lang.Float r0 = r12.orient
            float r0 = r0.floatValue()
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x0030
            float r0 = r13.dx
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0020
            float r0 = r13.dy
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0037
        L_0x0020:
            float r0 = r13.dy
            double r2 = (double) r0
            float r0 = r13.dx
            double r4 = (double) r0
            double r2 = java.lang.Math.atan2(r2, r4)
            double r2 = java.lang.Math.toDegrees(r2)
            float r0 = (float) r2
            goto L_0x0038
        L_0x0030:
            java.lang.Float r0 = r12.orient
            float r0 = r0.floatValue()
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            boolean r2 = r12.markerUnitsAreUser
            if (r2 == 0) goto L_0x003f
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x004b
        L_0x003f:
            o.offsetChildToAnchor$IsOverlapping r2 = r11.state
            com.caverock.androidsvg.SVG$Style r2 = r2.style
            com.caverock.androidsvg.SVG$values r2 = r2.strokeWidth
            float r3 = r11.dpi
            float r2 = r2.floatValue((float) r3)
        L_0x004b:
            o.offsetChildToAnchor$IsOverlapping r3 = r11.findInheritFromAncestorState(r12)
            r11.state = r3
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            float r4 = r13.x
            float r13 = r13.y
            r3.preTranslate(r4, r13)
            r3.preRotate(r0)
            r3.preScale(r2, r2)
            com.caverock.androidsvg.SVG$values r13 = r12.refX
            if (r13 == 0) goto L_0x006e
            com.caverock.androidsvg.SVG$values r13 = r12.refX
            float r13 = r13.floatValueX(r11)
            goto L_0x006f
        L_0x006e:
            r13 = 0
        L_0x006f:
            com.caverock.androidsvg.SVG$values r0 = r12.refY
            if (r0 == 0) goto L_0x007a
            com.caverock.androidsvg.SVG$values r0 = r12.refY
            float r0 = r0.floatValueY(r11)
            goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            com.caverock.androidsvg.SVG$values r2 = r12.markerWidth
            r4 = 1077936128(0x40400000, float:3.0)
            if (r2 == 0) goto L_0x0088
            com.caverock.androidsvg.SVG$values r2 = r12.markerWidth
            float r2 = r2.floatValueX(r11)
            goto L_0x008a
        L_0x0088:
            r2 = 1077936128(0x40400000, float:3.0)
        L_0x008a:
            com.caverock.androidsvg.SVG$values r5 = r12.markerHeight
            if (r5 == 0) goto L_0x0094
            com.caverock.androidsvg.SVG$values r4 = r12.markerHeight
            float r4 = r4.floatValueY(r11)
        L_0x0094:
            com.caverock.androidsvg.SVG$length r5 = r12.viewBox
            if (r5 == 0) goto L_0x0143
            com.caverock.androidsvg.SVG$length r5 = r12.viewBox
            float r5 = r5.width
            float r5 = r2 / r5
            com.caverock.androidsvg.SVG$length r6 = r12.viewBox
            float r6 = r6.height
            float r6 = r4 / r6
            com.caverock.androidsvg.PreserveAspectRatio r7 = r12.preserveAspectRatio
            if (r7 == 0) goto L_0x00ab
            com.caverock.androidsvg.PreserveAspectRatio r7 = r12.preserveAspectRatio
            goto L_0x00ad
        L_0x00ab:
            com.caverock.androidsvg.PreserveAspectRatio r7 = com.caverock.androidsvg.PreserveAspectRatio.LETTERBOX
        L_0x00ad:
            com.caverock.androidsvg.PreserveAspectRatio r8 = com.caverock.androidsvg.PreserveAspectRatio.STRETCH
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x00c7
            com.caverock.androidsvg.PreserveAspectRatio$Scale r8 = r7.getScale()
            com.caverock.androidsvg.PreserveAspectRatio$Scale r9 = com.caverock.androidsvg.PreserveAspectRatio.Scale.Slice
            if (r8 != r9) goto L_0x00c2
            float r5 = java.lang.Math.max(r5, r6)
            goto L_0x00c6
        L_0x00c2:
            float r5 = java.lang.Math.min(r5, r6)
        L_0x00c6:
            r6 = r5
        L_0x00c7:
            float r13 = -r13
            float r13 = r13 * r5
            float r0 = -r0
            float r0 = r0 * r6
            r3.preTranslate(r13, r0)
            android.graphics.Canvas r13 = r11.canvas
            r13.concat(r3)
            com.caverock.androidsvg.SVG$length r13 = r12.viewBox
            float r13 = r13.width
            float r13 = r13 * r5
            com.caverock.androidsvg.SVG$length r0 = r12.viewBox
            float r0 = r0.height
            float r0 = r0 * r6
            int[] r8 = $SWITCH_TABLE$com$caverock$androidsvg$PreserveAspectRatio$Alignment()
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r9 = r7.getAlignment()
            int r9 = r9.ordinal()
            r8 = r8[r9]
            r9 = 3
            r10 = 1073741824(0x40000000, float:2.0)
            if (r8 == r9) goto L_0x010a
            r9 = 4
            if (r8 == r9) goto L_0x0107
            r9 = 6
            if (r8 == r9) goto L_0x010a
            r9 = 7
            if (r8 == r9) goto L_0x0107
            r9 = 9
            if (r8 == r9) goto L_0x010a
            r9 = 10
            if (r8 == r9) goto L_0x0107
            r13 = 0
            goto L_0x010f
        L_0x0107:
            float r13 = r2 - r13
            goto L_0x010d
        L_0x010a:
            float r13 = r2 - r13
            float r13 = r13 / r10
        L_0x010d:
            float r13 = r1 - r13
        L_0x010f:
            int[] r8 = $SWITCH_TABLE$com$caverock$androidsvg$PreserveAspectRatio$Alignment()
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r7 = r7.getAlignment()
            int r7 = r7.ordinal()
            r7 = r8[r7]
            switch(r7) {
                case 5: goto L_0x0124;
                case 6: goto L_0x0124;
                case 7: goto L_0x0124;
                case 8: goto L_0x0121;
                case 9: goto L_0x0121;
                case 10: goto L_0x0121;
                default: goto L_0x0120;
            }
        L_0x0120:
            goto L_0x0128
        L_0x0121:
            float r0 = r4 - r0
            goto L_0x0127
        L_0x0124:
            float r0 = r4 - r0
            float r0 = r0 / r10
        L_0x0127:
            float r1 = r1 - r0
        L_0x0128:
            o.offsetChildToAnchor$IsOverlapping r0 = r11.state
            com.caverock.androidsvg.SVG$Style r0 = r0.style
            java.lang.Boolean r0 = r0.overflow
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0137
            r11.setClipRect(r13, r1, r2, r4)
        L_0x0137:
            r3.reset()
            r3.preScale(r5, r6)
            android.graphics.Canvas r13 = r11.canvas
            r13.concat(r3)
            goto L_0x015c
        L_0x0143:
            float r13 = -r13
            float r0 = -r0
            r3.preTranslate(r13, r0)
            android.graphics.Canvas r13 = r11.canvas
            r13.concat(r3)
            o.offsetChildToAnchor$IsOverlapping r13 = r11.state
            com.caverock.androidsvg.SVG$Style r13 = r13.style
            java.lang.Boolean r13 = r13.overflow
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x015c
            r11.setClipRect(r1, r1, r2, r4)
        L_0x015c:
            boolean r13 = r11.pushLayer()
            r0 = 0
            r11.renderChildren(r12, r0)
            if (r13 == 0) goto L_0x0169
            r11.popLayer(r12)
        L_0x0169:
            r11.statePop()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.offsetChildToAnchor.renderMarker(com.caverock.androidsvg.SVG$valueOf, o.offsetChildToAnchor$getMax):void");
    }

    private IsOverlapping findInheritFromAncestorState(SVG.ICustomTabsCallback.Stub.Proxy proxy) {
        IsOverlapping isOverlapping = new IsOverlapping();
        updateStyle(isOverlapping, SVG.Style.getDefaultStyle());
        return findInheritFromAncestorState(proxy, isOverlapping);
    }

    private IsOverlapping findInheritFromAncestorState(SVG.ICustomTabsCallback.Stub.Proxy proxy, IsOverlapping isOverlapping) {
        ArrayList<SVG.ICustomTabsCallback.Stub> arrayList = new ArrayList<>();
        while (true) {
            if (proxy instanceof SVG.ICustomTabsCallback.Stub) {
                arrayList.add(0, (SVG.ICustomTabsCallback.Stub) proxy);
            }
            if (proxy.parent == null) {
                break;
            }
            proxy = (SVG.ICustomTabsCallback.Stub.Proxy) proxy.parent;
        }
        for (SVG.ICustomTabsCallback.Stub updateStyleForElement : arrayList) {
            updateStyleForElement(isOverlapping, updateStyleForElement);
        }
        isOverlapping.viewBox = this.document.getRootElement().viewBox;
        if (isOverlapping.viewBox == null) {
            isOverlapping.viewBox = this.canvasViewPort;
        }
        isOverlapping.viewPort = this.canvasViewPort;
        isOverlapping.directRendering = this.state.directRendering;
        return isOverlapping;
    }

    private void checkForGradiantsAndPatterns(SVG.ICustomTabsCallback.Default defaultR) {
        if (this.state.style.fill instanceof SVG.invoke) {
            decodePaintReference(true, defaultR.boundingBox, (SVG.invoke) this.state.style.fill);
        }
        if (this.state.style.stroke instanceof SVG.invoke) {
            decodePaintReference(false, defaultR.boundingBox, (SVG.invoke) this.state.style.stroke);
        }
    }

    private void decodePaintReference(boolean z, SVG.length length2, SVG.invoke invoke) {
        SVG.ICustomTabsCallback.Stub.Proxy resolveIRI = this.document.resolveIRI(invoke.href);
        if (resolveIRI == null) {
            Object[] objArr = new Object[2];
            objArr[0] = z ? "Fill" : "Stroke";
            objArr[1] = invoke.href;
            error("%s reference '%s' not found", objArr);
            if (invoke.fallback != null) {
                setPaintColour(this.state, z, invoke.fallback);
            } else if (z) {
                this.state.hasFill = false;
            } else {
                this.state.hasStroke = false;
            }
        } else {
            if (resolveIRI instanceof SVG.ICustomTabsService) {
                makeLinearGradiant(z, length2, (SVG.ICustomTabsService) resolveIRI);
            }
            if (resolveIRI instanceof SVG.getInterfaceDescriptor) {
                makeRadialGradiant(z, length2, (SVG.getInterfaceDescriptor) resolveIRI);
            }
            if (resolveIRI instanceof SVG.onRelationshipValidationResult) {
                setSolidColor(z, (SVG.onRelationshipValidationResult) resolveIRI);
            }
        }
    }

    private void makeLinearGradiant(boolean z, SVG.length length2, SVG.ICustomTabsService iCustomTabsService) {
        float f;
        float f2;
        float f3;
        float f4;
        SVG.length length3 = length2;
        SVG.ICustomTabsService iCustomTabsService2 = iCustomTabsService;
        if (iCustomTabsService2.href != null) {
            fillInChainedGradientFields((SVG.isInside) iCustomTabsService2, iCustomTabsService2.href);
        }
        int i = 0;
        boolean z2 = iCustomTabsService2.gradientUnitsAreUser != null && iCustomTabsService2.gradientUnitsAreUser.booleanValue();
        IsOverlapping isOverlapping = this.state;
        Paint paint = z ? isOverlapping.fillPaint : isOverlapping.strokePaint;
        float f5 = 0.0f;
        if (z2) {
            SVG.length currentViewPortInUserUnits = getCurrentViewPortInUserUnits();
            float floatValueX = iCustomTabsService2.x1 != null ? iCustomTabsService2.x1.floatValueX(this) : 0.0f;
            float floatValueY = iCustomTabsService2.y1 != null ? iCustomTabsService2.y1.floatValueY(this) : 0.0f;
            float floatValueX2 = iCustomTabsService2.x2 != null ? iCustomTabsService2.x2.floatValueX(this) : currentViewPortInUserUnits.width;
            if (iCustomTabsService2.y2 != null) {
                f5 = iCustomTabsService2.y2.floatValueY(this);
            }
            f = f5;
            f2 = floatValueX2;
            f4 = floatValueX;
            f3 = floatValueY;
        } else {
            float floatValue = iCustomTabsService2.x1 != null ? iCustomTabsService2.x1.floatValue(this, 1.0f) : 0.0f;
            float floatValue2 = iCustomTabsService2.y1 != null ? iCustomTabsService2.y1.floatValue(this, 1.0f) : 0.0f;
            float floatValue3 = iCustomTabsService2.x2 != null ? iCustomTabsService2.x2.floatValue(this, 1.0f) : 1.0f;
            if (iCustomTabsService2.y2 != null) {
                f5 = iCustomTabsService2.y2.floatValue(this, 1.0f);
            }
            f = f5;
            f4 = floatValue;
            f3 = floatValue2;
            f2 = floatValue3;
        }
        statePush();
        this.state = findInheritFromAncestorState(iCustomTabsService2);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(length3.minX, length3.minY);
            matrix.preScale(length3.width, length3.height);
        }
        if (iCustomTabsService2.gradientTransform != null) {
            matrix.preConcat(iCustomTabsService2.gradientTransform);
        }
        int size = iCustomTabsService2.children.size();
        if (size == 0) {
            statePop();
            if (z) {
                this.state.hasFill = false;
            } else {
                this.state.hasStroke = false;
            }
        } else {
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            float f6 = -1.0f;
            for (SVG.ICustomTabsCallback.Stub.Proxy proxy : iCustomTabsService2.children) {
                SVG.onMessageChannelReady onmessagechannelready = (SVG.onMessageChannelReady) proxy;
                if (i == 0 || onmessagechannelready.offset.floatValue() >= f6) {
                    fArr[i] = onmessagechannelready.offset.floatValue();
                    f6 = onmessagechannelready.offset.floatValue();
                } else {
                    fArr[i] = f6;
                }
                statePush();
                updateStyleForElement(this.state, onmessagechannelready);
                SVG.getMin getmin = (SVG.getMin) this.state.style.stopColor;
                if (getmin == null) {
                    getmin = SVG.getMin.BLACK;
                }
                iArr[i] = getmin.colour | (clamp255(this.state.style.stopOpacity.floatValue()) << 24);
                i++;
                statePop();
            }
            if ((f4 == f2 && f3 == f) || size == 1) {
                statePop();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            if (iCustomTabsService2.spreadMethod != null) {
                if (iCustomTabsService2.spreadMethod == SVG.GradientSpread.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (iCustomTabsService2.spreadMethod == SVG.GradientSpread.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            statePop();
            LinearGradient linearGradient = new LinearGradient(f4, f3, f2, f, iArr, fArr, tileMode);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
        }
    }

    private void makeRadialGradiant(boolean z, SVG.length length2, SVG.getInterfaceDescriptor getinterfacedescriptor) {
        float f;
        float f2;
        float f3;
        SVG.length length3 = length2;
        SVG.getInterfaceDescriptor getinterfacedescriptor2 = getinterfacedescriptor;
        if (getinterfacedescriptor2.href != null) {
            fillInChainedGradientFields((SVG.isInside) getinterfacedescriptor2, getinterfacedescriptor2.href);
        }
        int i = 0;
        boolean z2 = getinterfacedescriptor2.gradientUnitsAreUser != null && getinterfacedescriptor2.gradientUnitsAreUser.booleanValue();
        IsOverlapping isOverlapping = this.state;
        Paint paint = z ? isOverlapping.fillPaint : isOverlapping.strokePaint;
        if (z2) {
            SVG.values values = new SVG.values(50.0f, SVG.Unit.percent);
            float floatValueX = getinterfacedescriptor2.cx != null ? getinterfacedescriptor2.cx.floatValueX(this) : values.floatValueX(this);
            float floatValueY = getinterfacedescriptor2.cy != null ? getinterfacedescriptor2.cy.floatValueY(this) : values.floatValueY(this);
            if (getinterfacedescriptor2.r != null) {
                values = getinterfacedescriptor2.r;
            }
            f = values.floatValue(this);
            f3 = floatValueX;
            f2 = floatValueY;
        } else {
            float floatValue = getinterfacedescriptor2.cx != null ? getinterfacedescriptor2.cx.floatValue(this, 1.0f) : 0.5f;
            float floatValue2 = getinterfacedescriptor2.cy != null ? getinterfacedescriptor2.cy.floatValue(this, 1.0f) : 0.5f;
            f3 = floatValue;
            f = getinterfacedescriptor2.r != null ? getinterfacedescriptor2.r.floatValue(this, 1.0f) : 0.5f;
            f2 = floatValue2;
        }
        statePush();
        this.state = findInheritFromAncestorState(getinterfacedescriptor2);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(length3.minX, length3.minY);
            matrix.preScale(length3.width, length3.height);
        }
        if (getinterfacedescriptor2.gradientTransform != null) {
            matrix.preConcat(getinterfacedescriptor2.gradientTransform);
        }
        int size = getinterfacedescriptor2.children.size();
        if (size == 0) {
            statePop();
            if (z) {
                this.state.hasFill = false;
            } else {
                this.state.hasStroke = false;
            }
        } else {
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            float f4 = -1.0f;
            for (SVG.ICustomTabsCallback.Stub.Proxy proxy : getinterfacedescriptor2.children) {
                SVG.onMessageChannelReady onmessagechannelready = (SVG.onMessageChannelReady) proxy;
                if (i == 0 || onmessagechannelready.offset.floatValue() >= f4) {
                    fArr[i] = onmessagechannelready.offset.floatValue();
                    f4 = onmessagechannelready.offset.floatValue();
                } else {
                    fArr[i] = f4;
                }
                statePush();
                updateStyleForElement(this.state, onmessagechannelready);
                SVG.getMin getmin = (SVG.getMin) this.state.style.stopColor;
                if (getmin == null) {
                    getmin = SVG.getMin.BLACK;
                }
                iArr[i] = getmin.colour | (clamp255(this.state.style.stopOpacity.floatValue()) << 24);
                i++;
                statePop();
            }
            if (f == 0.0f || size == 1) {
                statePop();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            if (getinterfacedescriptor2.spreadMethod != null) {
                if (getinterfacedescriptor2.spreadMethod == SVG.GradientSpread.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (getinterfacedescriptor2.spreadMethod == SVG.GradientSpread.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            statePop();
            RadialGradient radialGradient = new RadialGradient(f3, f2, f, iArr, fArr, tileMode);
            radialGradient.setLocalMatrix(matrix);
            paint.setShader(radialGradient);
        }
    }

    private void fillInChainedGradientFields(SVG.isInside isinside, String str) {
        while (true) {
            SVG.ICustomTabsCallback.Stub.Proxy resolveIRI = isinside.document.resolveIRI(str);
            if (resolveIRI == null) {
                warn("Gradient reference '%s' not found", str);
                return;
            } else if (!(resolveIRI instanceof SVG.isInside)) {
                error("Gradient href attributes must point to other gradient elements", new Object[0]);
                return;
            } else if (resolveIRI == isinside) {
                error("Circular reference in gradient href attribute '%s'", str);
                return;
            } else {
                SVG.isInside isinside2 = (SVG.isInside) resolveIRI;
                if (isinside.gradientUnitsAreUser == null) {
                    isinside.gradientUnitsAreUser = isinside2.gradientUnitsAreUser;
                }
                if (isinside.gradientTransform == null) {
                    isinside.gradientTransform = isinside2.gradientTransform;
                }
                if (isinside.spreadMethod == null) {
                    isinside.spreadMethod = isinside2.spreadMethod;
                }
                if (isinside.children.isEmpty()) {
                    isinside.children = isinside2.children;
                }
                try {
                    if (isinside instanceof SVG.ICustomTabsService) {
                        fillInChainedGradientFields((SVG.ICustomTabsService) isinside, (SVG.ICustomTabsService) resolveIRI);
                    } else {
                        fillInChainedGradientFields((SVG.getInterfaceDescriptor) isinside, (SVG.getInterfaceDescriptor) resolveIRI);
                    }
                } catch (ClassCastException unused) {
                }
                if (isinside2.href != null) {
                    str = isinside2.href;
                } else {
                    return;
                }
            }
        }
    }

    private void fillInChainedGradientFields(SVG.ICustomTabsService iCustomTabsService, SVG.ICustomTabsService iCustomTabsService2) {
        if (iCustomTabsService.x1 == null) {
            iCustomTabsService.x1 = iCustomTabsService2.x1;
        }
        if (iCustomTabsService.y1 == null) {
            iCustomTabsService.y1 = iCustomTabsService2.y1;
        }
        if (iCustomTabsService.x2 == null) {
            iCustomTabsService.x2 = iCustomTabsService2.x2;
        }
        if (iCustomTabsService.y2 == null) {
            iCustomTabsService.y2 = iCustomTabsService2.y2;
        }
    }

    private void fillInChainedGradientFields(SVG.getInterfaceDescriptor getinterfacedescriptor, SVG.getInterfaceDescriptor getinterfacedescriptor2) {
        if (getinterfacedescriptor.cx == null) {
            getinterfacedescriptor.cx = getinterfacedescriptor2.cx;
        }
        if (getinterfacedescriptor.cy == null) {
            getinterfacedescriptor.cy = getinterfacedescriptor2.cy;
        }
        if (getinterfacedescriptor.r == null) {
            getinterfacedescriptor.r = getinterfacedescriptor2.r;
        }
        if (getinterfacedescriptor.fx == null) {
            getinterfacedescriptor.fx = getinterfacedescriptor2.fx;
        }
        if (getinterfacedescriptor.fy == null) {
            getinterfacedescriptor.fy = getinterfacedescriptor2.fy;
        }
    }

    private void setSolidColor(boolean z, SVG.onRelationshipValidationResult onrelationshipvalidationresult) {
        boolean z2 = true;
        if (z) {
            if (isSpecified(onrelationshipvalidationresult.baseStyle, 2147483648L)) {
                this.state.style.fill = onrelationshipvalidationresult.baseStyle.solidColor;
                IsOverlapping isOverlapping = this.state;
                if (onrelationshipvalidationresult.baseStyle.solidColor == null) {
                    z2 = false;
                }
                isOverlapping.hasFill = z2;
            }
            if (isSpecified(onrelationshipvalidationresult.baseStyle, 4294967296L)) {
                this.state.style.fillOpacity = onrelationshipvalidationresult.baseStyle.solidOpacity;
            }
            if (isSpecified(onrelationshipvalidationresult.baseStyle, 6442450944L)) {
                IsOverlapping isOverlapping2 = this.state;
                setPaintColour(isOverlapping2, z, isOverlapping2.style.fill);
                return;
            }
            return;
        }
        if (isSpecified(onrelationshipvalidationresult.baseStyle, 2147483648L)) {
            this.state.style.stroke = onrelationshipvalidationresult.baseStyle.solidColor;
            IsOverlapping isOverlapping3 = this.state;
            if (onrelationshipvalidationresult.baseStyle.solidColor == null) {
                z2 = false;
            }
            isOverlapping3.hasStroke = z2;
        }
        if (isSpecified(onrelationshipvalidationresult.baseStyle, 4294967296L)) {
            this.state.style.strokeOpacity = onrelationshipvalidationresult.baseStyle.solidOpacity;
        }
        if (isSpecified(onrelationshipvalidationresult.baseStyle, 6442450944L)) {
            IsOverlapping isOverlapping4 = this.state;
            setPaintColour(isOverlapping4, z, isOverlapping4.style.stroke);
        }
    }

    private void checkForClipPath(SVG.ICustomTabsCallback.Default defaultR) {
        checkForClipPath(defaultR, defaultR.boundingBox);
    }

    private void checkForClipPath(SVG.ICustomTabsCallback.Default defaultR, SVG.length length2) {
        if (this.state.style.clipPath != null) {
            SVG.ICustomTabsCallback.Stub.Proxy resolveIRI = defaultR.document.resolveIRI(this.state.style.clipPath);
            if (resolveIRI == null) {
                error("ClipPath reference '%s' not found", this.state.style.clipPath);
                return;
            }
            SVG.setMin setmin = (SVG.setMin) resolveIRI;
            if (setmin.children.isEmpty()) {
                this.canvas.clipRect(0, 0, 0, 0);
                return;
            }
            boolean z = setmin.clipPathUnitsAreUser == null || setmin.clipPathUnitsAreUser.booleanValue();
            if (!(defaultR instanceof SVG.toDoubleRange) || z) {
                clipStatePush();
                if (!z) {
                    Matrix matrix = new Matrix();
                    matrix.preTranslate(length2.minX, length2.minY);
                    matrix.preScale(length2.width, length2.height);
                    this.canvas.concat(matrix);
                }
                if (setmin.transform != null) {
                    this.canvas.concat(setmin.transform);
                }
                this.state = findInheritFromAncestorState(setmin);
                checkForClipPath(setmin);
                Path path = new Path();
                for (SVG.ICustomTabsCallback.Stub.Proxy addObjectToClip : setmin.children) {
                    addObjectToClip(addObjectToClip, true, path, new Matrix());
                }
                this.canvas.clipPath(path);
                clipStatePop();
                return;
            }
            warn("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", defaultR.getClass().getSimpleName());
        }
    }

    private void addObjectToClip(SVG.ICustomTabsCallback.Stub.Proxy proxy, boolean z, Path path, Matrix matrix) {
        if (display()) {
            clipStatePush();
            if (proxy instanceof SVG$ICustomTabsService$Stub$Proxy) {
                if (z) {
                    addObjectToClip((SVG$ICustomTabsService$Stub$Proxy) proxy, path, matrix);
                } else {
                    error("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
            } else if (proxy instanceof SVG.invokeSuspend) {
                addObjectToClip((SVG.invokeSuspend) proxy, path, matrix);
            } else if (proxy instanceof SVG.postMessage) {
                addObjectToClip((SVG.postMessage) proxy, path, matrix);
            } else if (proxy instanceof SVG.toIntRange) {
                addObjectToClip((SVG.toIntRange) proxy, path, matrix);
            } else {
                error("Invalid %s element found in clipPath definition", proxy.getClass().getSimpleName());
            }
            clipStatePop();
        }
    }

    private void clipStatePush() {
        this.canvas.save(1);
        this.stateStack.push(this.state);
        this.state = (IsOverlapping) this.state.clone();
    }

    private void clipStatePop() {
        this.canvas.restore();
        this.state = this.stateStack.pop();
    }

    private Path.FillType getClipRuleFromState() {
        if (this.state.style.clipRule == null) {
            return Path.FillType.WINDING;
        }
        if ($SWITCH_TABLE$com$caverock$androidsvg$SVG$Style$FillRule()[this.state.style.clipRule.ordinal()] != 2) {
            return Path.FillType.WINDING;
        }
        return Path.FillType.EVEN_ODD;
    }

    private void addObjectToClip(SVG.invokeSuspend invokesuspend, Path path, Matrix matrix) {
        updateStyleForElement(this.state, invokesuspend);
        if (display() && visible()) {
            if (invokesuspend.transform != null) {
                matrix.preConcat(invokesuspend.transform);
            }
            Path path2 = new getMin(invokesuspend.d).getPath();
            if (invokesuspend.boundingBox == null) {
                invokesuspend.boundingBox = calculatePathBounds(path2);
            }
            checkForClipPath(invokesuspend);
            path.setFillType(getClipRuleFromState());
            path.addPath(path2, matrix);
        }
    }

    private void addObjectToClip(SVG.toIntRange tointrange, Path path, Matrix matrix) {
        Path path2;
        updateStyleForElement(this.state, tointrange);
        if (display() && visible()) {
            if (tointrange.transform != null) {
                matrix.preConcat(tointrange.transform);
            }
            if (tointrange instanceof SVG.extraCallbackWithResult) {
                path2 = makePathAndBoundingBox((SVG.extraCallbackWithResult) tointrange);
            } else if (tointrange instanceof SVG.getMax) {
                path2 = makePathAndBoundingBox((SVG.getMax) tointrange);
            } else if (tointrange instanceof SVG.equals) {
                path2 = makePathAndBoundingBox((SVG.equals) tointrange);
            } else if (tointrange instanceof SVG.onNavigationEvent) {
                path2 = makePathAndBoundingBox((SVG.onNavigationEvent) tointrange);
            } else {
                return;
            }
            checkForClipPath(tointrange);
            path.setFillType(path2.getFillType());
            path.addPath(path2, matrix);
        }
    }

    private void addObjectToClip(SVG$ICustomTabsService$Stub$Proxy sVG$ICustomTabsService$Stub$Proxy, Path path, Matrix matrix) {
        updateStyleForElement(this.state, sVG$ICustomTabsService$Stub$Proxy);
        if (display() && visible()) {
            if (sVG$ICustomTabsService$Stub$Proxy.transform != null) {
                matrix.preConcat(sVG$ICustomTabsService$Stub$Proxy.transform);
            }
            SVG.ICustomTabsCallback.Stub.Proxy resolveIRI = sVG$ICustomTabsService$Stub$Proxy.document.resolveIRI(sVG$ICustomTabsService$Stub$Proxy.href);
            if (resolveIRI == null) {
                error("Use reference '%s' not found", sVG$ICustomTabsService$Stub$Proxy.href);
                return;
            }
            checkForClipPath(sVG$ICustomTabsService$Stub$Proxy);
            addObjectToClip(resolveIRI, false, path, matrix);
        }
    }

    private void addObjectToClip(SVG.postMessage postmessage, Path path, Matrix matrix) {
        updateStyleForElement(this.state, postmessage);
        if (display()) {
            if (postmessage.transform != null) {
                matrix.preConcat(postmessage.transform);
            }
            float f = 0.0f;
            float floatValueX = (postmessage.x == null || postmessage.x.size() == 0) ? 0.0f : ((SVG.values) postmessage.x.get(0)).floatValueX(this);
            float floatValueY = (postmessage.y == null || postmessage.y.size() == 0) ? 0.0f : ((SVG.values) postmessage.y.get(0)).floatValueY(this);
            float floatValueX2 = (postmessage.dx == null || postmessage.dx.size() == 0) ? 0.0f : ((SVG.values) postmessage.dx.get(0)).floatValueX(this);
            if (!(postmessage.dy == null || postmessage.dy.size() == 0)) {
                f = ((SVG.values) postmessage.dy.get(0)).floatValueY(this);
            }
            if (this.state.style.textAnchor != SVG.Style.TextAnchor.Start) {
                float calculateTextWidth = calculateTextWidth(postmessage);
                if (this.state.style.textAnchor == SVG.Style.TextAnchor.Middle) {
                    calculateTextWidth /= 2.0f;
                }
                floatValueX -= calculateTextWidth;
            }
            if (postmessage.boundingBox == null) {
                isInside isinside = new isInside(floatValueX, floatValueY);
                enumerateTextSpans(postmessage, isinside);
                postmessage.boundingBox = new SVG.length(isinside.bbox.left, isinside.bbox.top, isinside.bbox.width(), isinside.bbox.height());
            }
            checkForClipPath(postmessage);
            Path path2 = new Path();
            enumerateTextSpans(postmessage, new toFloatRange(floatValueX + floatValueX2, floatValueY + f, path2));
            path.setFillType(getClipRuleFromState());
            path.addPath(path2, matrix);
        }
    }

    class toFloatRange extends toIntRange {
        public Path textAsPath;
        public float x;
        public float y;

        public toFloatRange(float f, float f2, Path path) {
            super(offsetChildToAnchor.this, (toIntRange) null);
            this.x = f;
            this.y = f2;
            this.textAsPath = path;
        }

        public final boolean doTextContainer(SVG.validateRelationship validaterelationship) {
            if (!(validaterelationship instanceof SVG.updateVisuals)) {
                return true;
            }
            offsetChildToAnchor.warn("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        public final void processText(String str) {
            if (offsetChildToAnchor.this.visible()) {
                Path path = new Path();
                offsetChildToAnchor.this.state.fillPaint.getTextPath(str, 0, str.length(), this.x, this.y, path);
                this.textAsPath.addPath(path);
            }
            this.x += offsetChildToAnchor.this.state.fillPaint.measureText(str);
        }
    }

    private Path makePathAndBoundingBox(SVG$FastBitmap$CoordinateSystem sVG$FastBitmap$CoordinateSystem) {
        float f = 0.0f;
        float floatValueX = sVG$FastBitmap$CoordinateSystem.x1 == null ? 0.0f : sVG$FastBitmap$CoordinateSystem.x1.floatValueX(this);
        float floatValueY = sVG$FastBitmap$CoordinateSystem.y1 == null ? 0.0f : sVG$FastBitmap$CoordinateSystem.y1.floatValueY(this);
        float floatValueX2 = sVG$FastBitmap$CoordinateSystem.x2 == null ? 0.0f : sVG$FastBitmap$CoordinateSystem.x2.floatValueX(this);
        if (sVG$FastBitmap$CoordinateSystem.y2 != null) {
            f = sVG$FastBitmap$CoordinateSystem.y2.floatValueY(this);
        }
        if (sVG$FastBitmap$CoordinateSystem.boundingBox == null) {
            sVG$FastBitmap$CoordinateSystem.boundingBox = new SVG.length(Math.min(floatValueX, floatValueY), Math.min(floatValueY, f), Math.abs(floatValueX2 - floatValueX), Math.abs(f - floatValueY));
        }
        Path path = new Path();
        path.moveTo(floatValueX, floatValueY);
        path.lineTo(floatValueX2, f);
        return path;
    }

    private Path makePathAndBoundingBox(SVG.extraCallbackWithResult extracallbackwithresult) {
        float f;
        float f2;
        Path path;
        SVG.extraCallbackWithResult extracallbackwithresult2 = extracallbackwithresult;
        if (extracallbackwithresult2.rx == null && extracallbackwithresult2.ry == null) {
            f2 = 0.0f;
            f = 0.0f;
        } else {
            if (extracallbackwithresult2.rx == null) {
                f2 = extracallbackwithresult2.ry.floatValueY(this);
            } else if (extracallbackwithresult2.ry == null) {
                f2 = extracallbackwithresult2.rx.floatValueX(this);
            } else {
                f2 = extracallbackwithresult2.rx.floatValueX(this);
                f = extracallbackwithresult2.ry.floatValueY(this);
            }
            f = f2;
        }
        float min = Math.min(f2, extracallbackwithresult2.width.floatValueX(this) / 2.0f);
        float min2 = Math.min(f, extracallbackwithresult2.height.floatValueY(this) / 2.0f);
        float floatValueX = extracallbackwithresult2.x != null ? extracallbackwithresult2.x.floatValueX(this) : 0.0f;
        float floatValueY = extracallbackwithresult2.y != null ? extracallbackwithresult2.y.floatValueY(this) : 0.0f;
        float floatValueX2 = extracallbackwithresult2.width.floatValueX(this);
        float floatValueY2 = extracallbackwithresult2.height.floatValueY(this);
        if (extracallbackwithresult2.boundingBox == null) {
            extracallbackwithresult2.boundingBox = new SVG.length(floatValueX, floatValueY, floatValueX2, floatValueY2);
        }
        float f3 = floatValueX + floatValueX2;
        float f4 = floatValueY + floatValueY2;
        Path path2 = new Path();
        if (min == 0.0f || min2 == 0.0f) {
            path = path2;
            path.moveTo(floatValueX, floatValueY);
            path.lineTo(f3, floatValueY);
            path.lineTo(f3, f4);
            path.lineTo(floatValueX, f4);
            path.lineTo(floatValueX, floatValueY);
        } else {
            float f5 = min * BEZIER_ARC_FACTOR;
            float f6 = BEZIER_ARC_FACTOR * min2;
            float f7 = floatValueY + min2;
            path2.moveTo(floatValueX, f7);
            float f8 = f7 - f6;
            float f9 = floatValueX + min;
            float f10 = f9 - f5;
            path2.cubicTo(floatValueX, f8, f10, floatValueY, f9, floatValueY);
            float f11 = f3 - min;
            path2.lineTo(f11, floatValueY);
            float f12 = f11 + f5;
            float f13 = f7;
            path2.cubicTo(f12, floatValueY, f3, f8, f3, f13);
            float f14 = f4 - min2;
            path2.lineTo(f3, f14);
            float f15 = f14 + f6;
            path = path2;
            path2.cubicTo(f3, f15, f12, f4, f11, f4);
            path.lineTo(f9, f4);
            path.cubicTo(f10, f4, floatValueX, f15, floatValueX, f14);
            path.lineTo(floatValueX, f13);
        }
        path.close();
        return path;
    }

    private Path makePathAndBoundingBox(SVG.getMax getmax) {
        SVG.getMax getmax2 = getmax;
        float f = 0.0f;
        float floatValueX = getmax2.cx != null ? getmax2.cx.floatValueX(this) : 0.0f;
        if (getmax2.cy != null) {
            f = getmax2.cy.floatValueY(this);
        }
        float floatValue = getmax2.r.floatValue(this);
        float f2 = floatValueX - floatValue;
        float f3 = f - floatValue;
        float f4 = floatValueX + floatValue;
        float f5 = f + floatValue;
        if (getmax2.boundingBox == null) {
            float f6 = 2.0f * floatValue;
            getmax2.boundingBox = new SVG.length(f2, f3, f6, f6);
        }
        float f7 = BEZIER_ARC_FACTOR * floatValue;
        Path path = new Path();
        path.moveTo(floatValueX, f3);
        float f8 = floatValueX + f7;
        float f9 = f - f7;
        Path path2 = path;
        path2.cubicTo(f8, f3, f4, f9, f4, f);
        float f10 = f + f7;
        path2.cubicTo(f4, f10, f8, f5, floatValueX, f5);
        float f11 = floatValueX - f7;
        path2.cubicTo(f11, f5, f2, f10, f2, f);
        path2.cubicTo(f2, f9, f11, f3, floatValueX, f3);
        path.close();
        return path;
    }

    private Path makePathAndBoundingBox(SVG.equals equals2) {
        SVG.equals equals3 = equals2;
        float f = 0.0f;
        float floatValueX = equals3.cx != null ? equals3.cx.floatValueX(this) : 0.0f;
        if (equals3.cy != null) {
            f = equals3.cy.floatValueY(this);
        }
        float floatValueX2 = equals3.rx.floatValueX(this);
        float floatValueY = equals3.ry.floatValueY(this);
        float f2 = floatValueX - floatValueX2;
        float f3 = f - floatValueY;
        float f4 = floatValueX + floatValueX2;
        float f5 = f + floatValueY;
        if (equals3.boundingBox == null) {
            equals3.boundingBox = new SVG.length(f2, f3, floatValueX2 * 2.0f, 2.0f * floatValueY);
        }
        float f6 = floatValueX2 * BEZIER_ARC_FACTOR;
        float f7 = BEZIER_ARC_FACTOR * floatValueY;
        Path path = new Path();
        path.moveTo(floatValueX, f3);
        float f8 = floatValueX + f6;
        float f9 = f - f7;
        Path path2 = path;
        path.cubicTo(f8, f3, f4, f9, f4, f);
        float f10 = f7 + f;
        Path path3 = path2;
        path3.cubicTo(f4, f10, f8, f5, floatValueX, f5);
        float f11 = floatValueX - f6;
        path3.cubicTo(f11, f5, f2, f10, f2, f);
        path3.cubicTo(f2, f9, f11, f3, floatValueX, f3);
        path2.close();
        return path2;
    }

    private Path makePathAndBoundingBox(SVG.onNavigationEvent onnavigationevent) {
        Path path = new Path();
        path.moveTo(onnavigationevent.points[0], onnavigationevent.points[1]);
        for (int i = 2; i < onnavigationevent.points.length; i += 2) {
            path.lineTo(onnavigationevent.points[i], onnavigationevent.points[i + 1]);
        }
        if (onnavigationevent instanceof SVG.b) {
            path.close();
        }
        if (onnavigationevent.boundingBox == null) {
            onnavigationevent.boundingBox = calculatePathBounds(path);
        }
        path.setFillType(getClipRuleFromState());
        return path;
    }

    private void fillWithPattern(SVG.ICustomTabsCallback.Default defaultR, Path path, SVG.ICustomTabsCallback iCustomTabsCallback) {
        float f;
        float f2;
        float f3;
        float f4;
        SVG.ICustomTabsCallback.Default defaultR2 = defaultR;
        SVG.ICustomTabsCallback iCustomTabsCallback2 = iCustomTabsCallback;
        boolean z = iCustomTabsCallback2.patternUnitsAreUser != null && iCustomTabsCallback2.patternUnitsAreUser.booleanValue();
        if (iCustomTabsCallback2.href != null) {
            fillInChainedPatternFields(iCustomTabsCallback2, iCustomTabsCallback2.href);
        }
        if (z) {
            f4 = iCustomTabsCallback2.x != null ? iCustomTabsCallback2.x.floatValueX(this) : 0.0f;
            f3 = iCustomTabsCallback2.y != null ? iCustomTabsCallback2.y.floatValueY(this) : 0.0f;
            f2 = iCustomTabsCallback2.width != null ? iCustomTabsCallback2.width.floatValueX(this) : 0.0f;
            f = iCustomTabsCallback2.height != null ? iCustomTabsCallback2.height.floatValueY(this) : 0.0f;
        } else {
            float floatValue = iCustomTabsCallback2.x != null ? iCustomTabsCallback2.x.floatValue(this, 1.0f) : 0.0f;
            float floatValue2 = iCustomTabsCallback2.y != null ? iCustomTabsCallback2.y.floatValue(this, 1.0f) : 0.0f;
            float floatValue3 = iCustomTabsCallback2.width != null ? iCustomTabsCallback2.width.floatValue(this, 1.0f) : 0.0f;
            float floatValue4 = iCustomTabsCallback2.height != null ? iCustomTabsCallback2.height.floatValue(this, 1.0f) : 0.0f;
            f4 = (floatValue * defaultR2.boundingBox.width) + defaultR2.boundingBox.minX;
            float f5 = (floatValue2 * defaultR2.boundingBox.height) + defaultR2.boundingBox.minY;
            float f6 = floatValue3 * defaultR2.boundingBox.width;
            f = floatValue4 * defaultR2.boundingBox.height;
            f3 = f5;
            f2 = f6;
        }
        if (f2 != 0.0f && f != 0.0f) {
            PreserveAspectRatio preserveAspectRatio = iCustomTabsCallback2.preserveAspectRatio != null ? iCustomTabsCallback2.preserveAspectRatio : PreserveAspectRatio.LETTERBOX;
            statePush();
            this.canvas.clipPath(path);
            IsOverlapping isOverlapping = new IsOverlapping();
            updateStyle(isOverlapping, SVG.Style.getDefaultStyle());
            isOverlapping.style.overflow = Boolean.FALSE;
            this.state = findInheritFromAncestorState(iCustomTabsCallback2, isOverlapping);
            SVG.length length2 = defaultR2.boundingBox;
            if (iCustomTabsCallback2.patternTransform != null) {
                this.canvas.concat(iCustomTabsCallback2.patternTransform);
                Matrix matrix = new Matrix();
                if (iCustomTabsCallback2.patternTransform.invert(matrix)) {
                    float[] fArr = {defaultR2.boundingBox.minX, defaultR2.boundingBox.minY, defaultR2.boundingBox.maxX(), defaultR2.boundingBox.minY, defaultR2.boundingBox.maxX(), defaultR2.boundingBox.maxY(), defaultR2.boundingBox.minX, defaultR2.boundingBox.maxY()};
                    matrix.mapPoints(fArr);
                    RectF rectF = new RectF(fArr[0], fArr[1], fArr[0], fArr[1]);
                    for (int i = 2; i <= 6; i += 2) {
                        if (fArr[i] < rectF.left) {
                            rectF.left = fArr[i];
                        }
                        if (fArr[i] > rectF.right) {
                            rectF.right = fArr[i];
                        }
                        int i2 = i + 1;
                        if (fArr[i2] < rectF.top) {
                            rectF.top = fArr[i2];
                        }
                        if (fArr[i2] > rectF.bottom) {
                            rectF.bottom = fArr[i2];
                        }
                    }
                    length2 = new SVG.length(rectF.left, rectF.top, rectF.right - rectF.left, rectF.bottom - rectF.top);
                }
            }
            float floor = f4 + (((float) Math.floor((double) ((length2.minX - f4) / f2))) * f2);
            float maxX = length2.maxX();
            float maxY = length2.maxY();
            SVG.length length3 = new SVG.length(0.0f, 0.0f, f2, f);
            for (float floor2 = f3 + (((float) Math.floor((double) ((length2.minY - f3) / f))) * f); floor2 < maxY; floor2 += f) {
                for (float f7 = floor; f7 < maxX; f7 += f2) {
                    length3.minX = f7;
                    length3.minY = floor2;
                    statePush();
                    if (!this.state.style.overflow.booleanValue()) {
                        setClipRect(length3.minX, length3.minY, length3.width, length3.height);
                    }
                    if (iCustomTabsCallback2.viewBox != null) {
                        this.canvas.concat(calculateViewBoxTransform(length3, iCustomTabsCallback2.viewBox, preserveAspectRatio));
                    } else {
                        boolean z2 = iCustomTabsCallback2.patternContentUnitsAreUser == null || iCustomTabsCallback2.patternContentUnitsAreUser.booleanValue();
                        this.canvas.translate(f7, floor2);
                        if (!z2) {
                            this.canvas.scale(defaultR2.boundingBox.width, defaultR2.boundingBox.height);
                        }
                    }
                    boolean pushLayer = pushLayer();
                    for (SVG.ICustomTabsCallback.Stub.Proxy render : iCustomTabsCallback2.children) {
                        render(render);
                    }
                    if (pushLayer) {
                        popLayer(iCustomTabsCallback2);
                    }
                    statePop();
                }
            }
            statePop();
        }
    }

    private void fillInChainedPatternFields(SVG.ICustomTabsCallback iCustomTabsCallback, String str) {
        while (true) {
            SVG.ICustomTabsCallback.Stub.Proxy resolveIRI = iCustomTabsCallback.document.resolveIRI(str);
            if (resolveIRI == null) {
                warn("Pattern reference '%s' not found", str);
                return;
            } else if (!(resolveIRI instanceof SVG.ICustomTabsCallback)) {
                error("Pattern href attributes must point to other pattern elements", new Object[0]);
                return;
            } else if (resolveIRI == iCustomTabsCallback) {
                error("Circular reference in pattern href attribute '%s'", str);
                return;
            } else {
                SVG.ICustomTabsCallback iCustomTabsCallback2 = (SVG.ICustomTabsCallback) resolveIRI;
                if (iCustomTabsCallback.patternUnitsAreUser == null) {
                    iCustomTabsCallback.patternUnitsAreUser = iCustomTabsCallback2.patternUnitsAreUser;
                }
                if (iCustomTabsCallback.patternContentUnitsAreUser == null) {
                    iCustomTabsCallback.patternContentUnitsAreUser = iCustomTabsCallback2.patternContentUnitsAreUser;
                }
                if (iCustomTabsCallback.patternTransform == null) {
                    iCustomTabsCallback.patternTransform = iCustomTabsCallback2.patternTransform;
                }
                if (iCustomTabsCallback.x == null) {
                    iCustomTabsCallback.x = iCustomTabsCallback2.x;
                }
                if (iCustomTabsCallback.y == null) {
                    iCustomTabsCallback.y = iCustomTabsCallback2.y;
                }
                if (iCustomTabsCallback.width == null) {
                    iCustomTabsCallback.width = iCustomTabsCallback2.width;
                }
                if (iCustomTabsCallback.height == null) {
                    iCustomTabsCallback.height = iCustomTabsCallback2.height;
                }
                if (iCustomTabsCallback.children.isEmpty()) {
                    iCustomTabsCallback.children = iCustomTabsCallback2.children;
                }
                if (iCustomTabsCallback.viewBox == null) {
                    iCustomTabsCallback.viewBox = iCustomTabsCallback2.viewBox;
                }
                if (iCustomTabsCallback.preserveAspectRatio == null) {
                    iCustomTabsCallback.preserveAspectRatio = iCustomTabsCallback2.preserveAspectRatio;
                }
                if (iCustomTabsCallback2.href != null) {
                    str = iCustomTabsCallback2.href;
                } else {
                    return;
                }
            }
        }
    }

    private void renderMask(SVG$Grayscale$Algorithm sVG$Grayscale$Algorithm, SVG.ICustomTabsCallback.Default defaultR) {
        float f;
        float f2;
        debug("Mask render", new Object[0]);
        boolean z = true;
        if (sVG$Grayscale$Algorithm.maskUnitsAreUser != null && sVG$Grayscale$Algorithm.maskUnitsAreUser.booleanValue()) {
            f2 = sVG$Grayscale$Algorithm.width != null ? sVG$Grayscale$Algorithm.width.floatValueX(this) : defaultR.boundingBox.width;
            f = sVG$Grayscale$Algorithm.height != null ? sVG$Grayscale$Algorithm.height.floatValueY(this) : defaultR.boundingBox.height;
            if (sVG$Grayscale$Algorithm.x != null) {
                sVG$Grayscale$Algorithm.x.floatValueX(this);
            }
            if (sVG$Grayscale$Algorithm.y != null) {
                sVG$Grayscale$Algorithm.y.floatValueY(this);
            }
        } else {
            if (sVG$Grayscale$Algorithm.x != null) {
                sVG$Grayscale$Algorithm.x.floatValue(this, 1.0f);
            }
            if (sVG$Grayscale$Algorithm.y != null) {
                sVG$Grayscale$Algorithm.y.floatValue(this, 1.0f);
            }
            float f3 = 1.2f;
            float floatValue = sVG$Grayscale$Algorithm.width != null ? sVG$Grayscale$Algorithm.width.floatValue(this, 1.0f) : 1.2f;
            if (sVG$Grayscale$Algorithm.height != null) {
                f3 = sVG$Grayscale$Algorithm.height.floatValue(this, 1.0f);
            }
            f2 = floatValue * defaultR.boundingBox.width;
            f = f3 * defaultR.boundingBox.height;
        }
        if (f2 != 0.0f && f != 0.0f) {
            statePush();
            IsOverlapping findInheritFromAncestorState = findInheritFromAncestorState(sVG$Grayscale$Algorithm);
            this.state = findInheritFromAncestorState;
            findInheritFromAncestorState.style.opacity = Float.valueOf(1.0f);
            if (sVG$Grayscale$Algorithm.maskContentUnitsAreUser != null && !sVG$Grayscale$Algorithm.maskContentUnitsAreUser.booleanValue()) {
                z = false;
            }
            if (!z) {
                this.canvas.translate(defaultR.boundingBox.minX, defaultR.boundingBox.minY);
                this.canvas.scale(defaultR.boundingBox.width, defaultR.boundingBox.height);
            }
            renderChildren(sVG$Grayscale$Algorithm, false);
            statePop();
        }
    }
}
