package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import com.caverock.androidsvg.CSSParser;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.text.Typography;
import o.hasDependencies;
import o.offsetChildToAnchor;
import o.upFrom;
import org.xml.sax.SAXException;

public class SVG {
    private static final int DEFAULT_PICTURE_HEIGHT = 512;
    private static final int DEFAULT_PICTURE_WIDTH = 512;
    /* access modifiers changed from: private */
    public static final List<ICustomTabsCallback.Stub.Proxy> EMPTY_CHILD_LIST = new ArrayList(0);
    protected static final long SPECIFIED_ALL = -1;
    protected static final long SPECIFIED_CLIP = 1048576;
    protected static final long SPECIFIED_CLIP_PATH = 268435456;
    protected static final long SPECIFIED_CLIP_RULE = 536870912;
    protected static final long SPECIFIED_COLOR = 4096;
    protected static final long SPECIFIED_DIRECTION = 68719476736L;
    protected static final long SPECIFIED_DISPLAY = 16777216;
    protected static final long SPECIFIED_FILL = 1;
    protected static final long SPECIFIED_FILL_OPACITY = 4;
    protected static final long SPECIFIED_FILL_RULE = 2;
    protected static final long SPECIFIED_FONT_FAMILY = 8192;
    protected static final long SPECIFIED_FONT_SIZE = 16384;
    protected static final long SPECIFIED_FONT_STYLE = 65536;
    protected static final long SPECIFIED_FONT_WEIGHT = 32768;
    protected static final long SPECIFIED_MARKER_END = 8388608;
    protected static final long SPECIFIED_MARKER_MID = 4194304;
    protected static final long SPECIFIED_MARKER_START = 2097152;
    protected static final long SPECIFIED_MASK = 1073741824;
    protected static final long SPECIFIED_NON_INHERITING = 68133849088L;
    protected static final long SPECIFIED_OPACITY = 2048;
    protected static final long SPECIFIED_OVERFLOW = 524288;
    protected static final long SPECIFIED_SOLID_COLOR = 2147483648L;
    protected static final long SPECIFIED_SOLID_OPACITY = 4294967296L;
    protected static final long SPECIFIED_STOP_COLOR = 67108864;
    protected static final long SPECIFIED_STOP_OPACITY = 134217728;
    protected static final long SPECIFIED_STROKE = 8;
    protected static final long SPECIFIED_STROKE_DASHARRAY = 512;
    protected static final long SPECIFIED_STROKE_DASHOFFSET = 1024;
    protected static final long SPECIFIED_STROKE_LINECAP = 64;
    protected static final long SPECIFIED_STROKE_LINEJOIN = 128;
    protected static final long SPECIFIED_STROKE_MITERLIMIT = 256;
    protected static final long SPECIFIED_STROKE_OPACITY = 16;
    protected static final long SPECIFIED_STROKE_WIDTH = 32;
    protected static final long SPECIFIED_TEXT_ANCHOR = 262144;
    protected static final long SPECIFIED_TEXT_DECORATION = 131072;
    protected static final long SPECIFIED_VECTOR_EFFECT = 34359738368L;
    protected static final long SPECIFIED_VIEWPORT_FILL = 8589934592L;
    protected static final long SPECIFIED_VIEWPORT_FILL_OPACITY = 17179869184L;
    protected static final long SPECIFIED_VISIBILITY = 33554432;
    private static final double SQRT2 = 1.414213562373095d;
    protected static final String SUPPORTED_SVG_VERSION = "1.2";
    private static final String TAG = "AndroidSVG";
    private static final String VERSION = "1.2.1";
    private static int getMax = 1;
    private static int setMax;
    private CSSParser.setMin cssRules = new CSSParser.setMin();
    private String desc = "";
    private hasDependencies fileResolver = null;
    private float renderDPI = 96.0f;
    private extraCallback rootElement = null;
    private String title = "";

    public enum GradientSpread {
        pad,
        reflect,
        repeat
    }

    public enum Unit {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    public interface create {
        void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);

        void close();

        void cubicTo(float f, float f2, float f3, float f4, float f5, float f6);

        void lineTo(float f, float f2);

        void moveTo(float f, float f2);

        void quadTo(float f, float f2, float f3, float f4);
    }

    protected interface hashCode {
        void setTransform(Matrix matrix);
    }

    public interface onPostMessage {
        String getRequiredExtensions();

        Set<String> getRequiredFeatures();

        Set<String> getRequiredFonts();

        Set<String> getRequiredFormats();

        Set<String> getSystemLanguage();

        void setRequiredExtensions(String str);

        void setRequiredFeatures(Set<String> set);

        void setRequiredFonts(Set<String> set);

        void setRequiredFormats(Set<String> set);

        void setSystemLanguage(Set<String> set);
    }

    public interface onTransact {
        void addChild(ICustomTabsCallback.Stub.Proxy proxy) throws SAXException;

        List<ICustomTabsCallback.Stub.Proxy> getChildren();
    }

    public interface receiveFile {
    }

    protected interface requestPostMessageChannelWithExtras {
        receiveFile getTextRoot();

        void setTextRoot(receiveFile receivefile);
    }

    public static String getVersion() {
        return VERSION;
    }

    protected SVG() {
    }

    public static SVG getFromInputStream(InputStream inputStream) throws SVGParseException {
        return new SVGParser().parse(inputStream);
    }

    public static SVG getFromString(String str) throws SVGParseException {
        return new SVGParser().parse(new ByteArrayInputStream(str.getBytes()));
    }

    public static SVG getFromResource(Context context, int i) throws SVGParseException {
        return getFromResource(context.getResources(), i);
    }

    public static SVG getFromResource(Resources resources, int i) throws SVGParseException {
        return new SVGParser().parse(resources.openRawResource(i));
    }

    public static SVG getFromAsset(AssetManager assetManager, String str) throws SVGParseException, IOException {
        SVGParser sVGParser = new SVGParser();
        try {
            Object[] objArr = new Object[2];
            objArr[1] = str;
            objArr[0] = assetManager;
            Object[] objArr2 = null;
            InputStream inputStream = (InputStream) ((Class) upFrom.setMax(18 - MotionEvent.axisFromString(""), -1 - TextUtils.lastIndexOf("", '0', 0), (char) (56348 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))))).getMethod("getMin", new Class[]{AssetManager.class, String.class}).invoke(objArr2, objArr);
            SVG parse = sVGParser.parse(inputStream);
            inputStream.close();
            int i = setMax + 41;
            getMax = i % 128;
            if ((i % 2 == 0 ? 25 : Typography.amp) == '&') {
                return parse;
            }
            int length2 = objArr2.length;
            return parse;
        } catch (Exception e) {
            throw e;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public void registerExternalFileResolver(hasDependencies hasdependencies) {
        this.fileResolver = hasdependencies;
    }

    public void setRenderDPI(float f) {
        this.renderDPI = f;
    }

    public float getRenderDPI() {
        return this.renderDPI;
    }

    public Picture renderToPicture() {
        float f;
        values values2 = this.rootElement.width;
        if (values2 == null) {
            return renderToPicture(512, 512);
        }
        float floatValue = values2.floatValue(this.renderDPI);
        length length2 = this.rootElement.viewBox;
        if (length2 != null) {
            f = (length2.height * floatValue) / length2.width;
        } else {
            values values3 = this.rootElement.height;
            f = values3 != null ? values3.floatValue(this.renderDPI) : floatValue;
        }
        return renderToPicture((int) Math.ceil((double) floatValue), (int) Math.ceil((double) f));
    }

    public Picture renderToPicture(int i, int i2) {
        Picture picture = new Picture();
        new offsetChildToAnchor(picture.beginRecording(i, i2), new length(0.0f, 0.0f, (float) i, (float) i2), this.renderDPI).renderDocument(this, (length) null, (PreserveAspectRatio) null, false);
        picture.endRecording();
        return picture;
    }

    public Picture renderViewToPicture(String str, int i, int i2) {
        ICustomTabsCallback.Stub.Proxy elementById = getElementById(str);
        if (elementById == null || !(elementById instanceof ICustomTabsService.Default)) {
            return null;
        }
        ICustomTabsService.Default defaultR = (ICustomTabsService.Default) elementById;
        if (defaultR.viewBox == null) {
            return null;
        }
        Picture picture = new Picture();
        new offsetChildToAnchor(picture.beginRecording(i, i2), new length(0.0f, 0.0f, (float) i, (float) i2), this.renderDPI).renderDocument(this, defaultR.viewBox, defaultR.preserveAspectRatio, false);
        picture.endRecording();
        return picture;
    }

    public void renderToCanvas(Canvas canvas) {
        renderToCanvas(canvas, (RectF) null);
    }

    public void renderToCanvas(Canvas canvas, RectF rectF) {
        length length2;
        if (rectF != null) {
            length2 = length.fromLimits(rectF.left, rectF.top, rectF.right, rectF.bottom);
        } else {
            length2 = new length(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
        }
        new offsetChildToAnchor(canvas, length2, this.renderDPI).renderDocument(this, (length) null, (PreserveAspectRatio) null, true);
    }

    public void renderViewToCanvas(String str, Canvas canvas) {
        renderViewToCanvas(str, canvas, (RectF) null);
    }

    public void renderViewToCanvas(String str, Canvas canvas, RectF rectF) {
        length length2;
        ICustomTabsCallback.Stub.Proxy elementById = getElementById(str);
        if (elementById != null && (elementById instanceof ICustomTabsService.Default)) {
            ICustomTabsService.Default defaultR = (ICustomTabsService.Default) elementById;
            if (defaultR.viewBox != null) {
                if (rectF != null) {
                    length2 = length.fromLimits(rectF.left, rectF.top, rectF.right, rectF.bottom);
                } else {
                    length2 = new length(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
                }
                new offsetChildToAnchor(canvas, length2, this.renderDPI).renderDocument(this, defaultR.viewBox, defaultR.preserveAspectRatio, true);
            }
        }
    }

    public String getDocumentTitle() {
        if (this.rootElement != null) {
            return this.title;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public String getDocumentDescription() {
        if (this.rootElement != null) {
            return this.desc;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public String getDocumentSVGVersion() {
        extraCallback extracallback = this.rootElement;
        if (extracallback != null) {
            return extracallback.version;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public Set<String> getViewList() {
        if (this.rootElement != null) {
            List<ICustomTabsCallback.Stub.Proxy> elementsByTagName = getElementsByTagName(ICustomTabsService.Default.class);
            HashSet hashSet = new HashSet(elementsByTagName.size());
            Iterator<ICustomTabsCallback.Stub.Proxy> it = elementsByTagName.iterator();
            while (it.hasNext()) {
                ICustomTabsService.Default defaultR = (ICustomTabsService.Default) it.next();
                if (defaultR.f9526id != null) {
                    hashSet.add(defaultR.f9526id);
                }
            }
            return hashSet;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public float getDocumentWidth() {
        if (this.rootElement != null) {
            return getDocumentDimensions(this.renderDPI).width;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public void setDocumentWidth(float f) {
        extraCallback extracallback = this.rootElement;
        if (extracallback != null) {
            extracallback.width = new values(f);
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public void setDocumentWidth(String str) throws SVGParseException {
        extraCallback extracallback = this.rootElement;
        if (extracallback != null) {
            try {
                extracallback.width = SVGParser.parseLength(str);
            } catch (SAXException e) {
                throw new SVGParseException(e.getMessage());
            }
        } else {
            throw new IllegalArgumentException("SVG document is empty");
        }
    }

    public float getDocumentHeight() {
        if (this.rootElement != null) {
            return getDocumentDimensions(this.renderDPI).height;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public void setDocumentHeight(float f) {
        extraCallback extracallback = this.rootElement;
        if (extracallback != null) {
            extracallback.height = new values(f);
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public void setDocumentHeight(String str) throws SVGParseException {
        extraCallback extracallback = this.rootElement;
        if (extracallback != null) {
            try {
                extracallback.height = SVGParser.parseLength(str);
            } catch (SAXException e) {
                throw new SVGParseException(e.getMessage());
            }
        } else {
            throw new IllegalArgumentException("SVG document is empty");
        }
    }

    public void setDocumentViewBox(float f, float f2, float f3, float f4) {
        extraCallback extracallback = this.rootElement;
        if (extracallback != null) {
            extracallback.viewBox = new length(f, f2, f3, f4);
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public RectF getDocumentViewBox() {
        extraCallback extracallback = this.rootElement;
        if (extracallback == null) {
            throw new IllegalArgumentException("SVG document is empty");
        } else if (extracallback.viewBox == null) {
            return null;
        } else {
            return this.rootElement.viewBox.toRectF();
        }
    }

    public void setDocumentPreserveAspectRatio(PreserveAspectRatio preserveAspectRatio) {
        extraCallback extracallback = this.rootElement;
        if (extracallback != null) {
            extracallback.preserveAspectRatio = preserveAspectRatio;
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public PreserveAspectRatio getDocumentPreserveAspectRatio() {
        extraCallback extracallback = this.rootElement;
        if (extracallback == null) {
            throw new IllegalArgumentException("SVG document is empty");
        } else if (extracallback.preserveAspectRatio == null) {
            return null;
        } else {
            return this.rootElement.preserveAspectRatio;
        }
    }

    public float getDocumentAspectRatio() {
        float f;
        float f2;
        extraCallback extracallback = this.rootElement;
        if (extracallback != null) {
            values values2 = extracallback.width;
            values values3 = this.rootElement.height;
            if (values2 == null || values3 == null || values2.unit == Unit.percent || values3.unit == Unit.percent) {
                if (this.rootElement.viewBox == null || this.rootElement.viewBox.width == 0.0f || this.rootElement.viewBox.height == 0.0f) {
                    return -1.0f;
                }
                f = this.rootElement.viewBox.width;
                f2 = this.rootElement.viewBox.height;
            } else if (values2.isZero() || values3.isZero()) {
                return -1.0f;
            } else {
                f = values2.floatValue(this.renderDPI);
                f2 = values3.floatValue(this.renderDPI);
            }
            return f / f2;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public extraCallback getRootElement() {
        return this.rootElement;
    }

    /* access modifiers changed from: protected */
    public void setRootElement(extraCallback extracallback) {
        this.rootElement = extracallback;
    }

    public ICustomTabsCallback.Stub.Proxy resolveIRI(String str) {
        if (str != null && str.length() > 1 && str.startsWith("#")) {
            return getElementById(str.substring(1));
        }
        return null;
    }

    private length getDocumentDimensions(float f) {
        float f2;
        values values2 = this.rootElement.width;
        values values3 = this.rootElement.height;
        if (values2 == null || values2.isZero() || values2.unit == Unit.percent || values2.unit == Unit.em || values2.unit == Unit.ex) {
            return new length(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float floatValue = values2.floatValue(f);
        if (values3 == null) {
            f2 = this.rootElement.viewBox != null ? (this.rootElement.viewBox.height * floatValue) / this.rootElement.viewBox.width : floatValue;
        } else if (values3.isZero() || values3.unit == Unit.percent || values3.unit == Unit.em || values3.unit == Unit.ex) {
            return new length(-1.0f, -1.0f, -1.0f, -1.0f);
        } else {
            f2 = values3.floatValue(f);
        }
        return new length(0.0f, 0.0f, floatValue, f2);
    }

    /* access modifiers changed from: protected */
    public void addCSSRules(CSSParser.setMin setmin) {
        this.cssRules.addAll(setmin);
    }

    public List<CSSParser.getMax> getCSSRules() {
        return this.cssRules.getRules();
    }

    public boolean hasCSSRules() {
        return !this.cssRules.isEmpty();
    }

    public static class length implements Cloneable {
        public float height;
        public float minX;
        public float minY;
        public float width;

        public length(float f, float f2, float f3, float f4) {
            this.minX = f;
            this.minY = f2;
            this.width = f3;
            this.height = f4;
        }

        public static length fromLimits(float f, float f2, float f3, float f4) {
            return new length(f, f2, f3 - f, f4 - f2);
        }

        public RectF toRectF() {
            return new RectF(this.minX, this.minY, maxX(), maxY());
        }

        public float maxX() {
            return this.minX + this.width;
        }

        public float maxY() {
            return this.minY + this.height;
        }

        public void union(length length) {
            float f = length.minX;
            if (f < this.minX) {
                this.minX = f;
            }
            float f2 = length.minY;
            if (f2 < this.minY) {
                this.minY = f2;
            }
            if (length.maxX() > maxX()) {
                this.width = length.maxX() - this.minX;
            }
            if (length.maxY() > maxY()) {
                this.height = length.maxY() - this.minY;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.minX);
            sb.append(" ");
            sb.append(this.minY);
            sb.append(" ");
            sb.append(this.width);
            sb.append(" ");
            sb.append(this.height);
            sb.append("]");
            return sb.toString();
        }
    }

    public static class Style implements Cloneable {
        public static final int FONT_WEIGHT_BOLD = 700;
        public static final int FONT_WEIGHT_BOLDER = 1;
        public static final int FONT_WEIGHT_LIGHTER = -1;
        public static final int FONT_WEIGHT_NORMAL = 400;
        public setMax clip;
        public String clipPath;
        public FillRule clipRule;
        public getMin color;
        public TextDirection direction;
        public Boolean display;
        public getDefaultImpl fill;
        public Float fillOpacity;
        public FillRule fillRule;
        public List<String> fontFamily;
        public values fontSize;
        public FontStyle fontStyle;
        public Integer fontWeight;
        public String markerEnd;
        public String markerMid;
        public String markerStart;
        public String mask;
        public Float opacity;
        public Boolean overflow;
        public getDefaultImpl solidColor;
        public Float solidOpacity;
        public long specifiedFlags = 0;
        public getDefaultImpl stopColor;
        public Float stopOpacity;
        public getDefaultImpl stroke;
        public values[] strokeDashArray;
        public values strokeDashOffset;
        public LineCaps strokeLineCap;
        public LineJoin strokeLineJoin;
        public Float strokeMiterLimit;
        public Float strokeOpacity;
        public values strokeWidth;
        public TextAnchor textAnchor;
        public TextDecoration textDecoration;
        public VectorEffect vectorEffect;
        public getDefaultImpl viewportFill;
        public Float viewportFillOpacity;
        public Boolean visibility;

        public enum FillRule {
            NonZero,
            EvenOdd
        }

        public enum FontStyle {
            Normal,
            Italic,
            Oblique
        }

        public enum LineCaps {
            Butt,
            Round,
            Square
        }

        public enum LineJoin {
            Miter,
            Round,
            Bevel
        }

        public enum TextAnchor {
            Start,
            Middle,
            End
        }

        public enum TextDecoration {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        public enum TextDirection {
            LTR,
            RTL
        }

        public enum VectorEffect {
            None,
            NonScalingStroke
        }

        protected Style() {
        }

        public static Style getDefaultStyle() {
            Style style = new Style();
            style.specifiedFlags = -1;
            style.fill = getMin.BLACK;
            style.fillRule = FillRule.NonZero;
            Float valueOf = Float.valueOf(1.0f);
            style.fillOpacity = valueOf;
            style.stroke = null;
            style.strokeOpacity = valueOf;
            style.strokeWidth = new values(1.0f);
            style.strokeLineCap = LineCaps.Butt;
            style.strokeLineJoin = LineJoin.Miter;
            style.strokeMiterLimit = Float.valueOf(4.0f);
            style.strokeDashArray = null;
            style.strokeDashOffset = new values(0.0f);
            style.opacity = valueOf;
            style.color = getMin.BLACK;
            style.fontFamily = null;
            style.fontSize = new values(12.0f, Unit.pt);
            style.fontWeight = 400;
            style.fontStyle = FontStyle.Normal;
            style.textDecoration = TextDecoration.None;
            style.direction = TextDirection.LTR;
            style.textAnchor = TextAnchor.Start;
            style.overflow = Boolean.TRUE;
            style.clip = null;
            style.markerStart = null;
            style.markerMid = null;
            style.markerEnd = null;
            style.display = Boolean.TRUE;
            style.visibility = Boolean.TRUE;
            style.stopColor = getMin.BLACK;
            style.stopOpacity = valueOf;
            style.clipPath = null;
            style.clipRule = FillRule.NonZero;
            style.mask = null;
            style.solidColor = null;
            style.solidOpacity = valueOf;
            style.viewportFill = null;
            style.viewportFillOpacity = valueOf;
            style.vectorEffect = VectorEffect.None;
            return style;
        }

        public void resetNonInheritingProperties() {
            resetNonInheritingProperties(false);
        }

        public void resetNonInheritingProperties(boolean z) {
            this.display = Boolean.TRUE;
            this.overflow = z ? Boolean.TRUE : Boolean.FALSE;
            this.clip = null;
            this.clipPath = null;
            this.opacity = Float.valueOf(1.0f);
            this.stopColor = getMin.BLACK;
            this.stopOpacity = Float.valueOf(1.0f);
            this.mask = null;
            this.solidColor = null;
            this.solidOpacity = Float.valueOf(1.0f);
            this.viewportFill = null;
            this.viewportFillOpacity = Float.valueOf(1.0f);
            this.vectorEffect = VectorEffect.None;
        }

        public Object clone() {
            try {
                Style style = (Style) super.clone();
                if (this.strokeDashArray != null) {
                    style.strokeDashArray = (values[]) this.strokeDashArray.clone();
                }
                return style;
            } catch (CloneNotSupportedException e) {
                throw new InternalError(e.toString());
            }
        }
    }

    public static abstract class getDefaultImpl implements Cloneable {
        protected getDefaultImpl() {
        }
    }

    public static class getMin extends getDefaultImpl {
        public static final getMin BLACK = new getMin(0);
        public int colour;

        public getMin(int i) {
            this.colour = i;
        }

        public String toString() {
            return String.format("#%06x", new Object[]{Integer.valueOf(this.colour)});
        }
    }

    public static class toFloatRange extends getDefaultImpl {
        private static toFloatRange instance = new toFloatRange();

        private toFloatRange() {
        }

        public static toFloatRange getInstance() {
            return instance;
        }
    }

    public static class invoke extends getDefaultImpl {
        public getDefaultImpl fallback;
        public String href;

        public invoke(String str, getDefaultImpl getdefaultimpl) {
            this.href = str;
            this.fallback = getdefaultimpl;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(String.valueOf(this.href));
            sb.append(" ");
            sb.append(this.fallback);
            return sb.toString();
        }
    }

    public static class values implements Cloneable {
        private static /* synthetic */ int[] $SWITCH_TABLE$com$caverock$androidsvg$SVG$Unit;
        Unit unit = Unit.px;
        float value = 0.0f;

        /* JADX WARNING: Can't wrap try/catch for region: R(21:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0027 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0030 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0015 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static /* synthetic */ int[] $SWITCH_TABLE$com$caverock$androidsvg$SVG$Unit() {
            /*
                int[] r0 = $SWITCH_TABLE$com$caverock$androidsvg$SVG$Unit
                if (r0 == 0) goto L_0x0005
                return r0
            L_0x0005:
                com.caverock.androidsvg.SVG$Unit[] r0 = com.caverock.androidsvg.SVG.Unit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.cm     // Catch:{ NoSuchFieldError -> 0x0015 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0015 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.em     // Catch:{ NoSuchFieldError -> 0x001e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001e }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001e }
            L_0x001e:
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.ex     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0027 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.in     // Catch:{ NoSuchFieldError -> 0x0030 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0030 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0030 }
            L_0x0030:
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.mm     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.pc     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.percent     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.pt     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.px     // Catch:{ NoSuchFieldError -> 0x005f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                $SWITCH_TABLE$com$caverock$androidsvg$SVG$Unit = r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVG.values.$SWITCH_TABLE$com$caverock$androidsvg$SVG$Unit():int[]");
        }

        public values(float f, Unit unit2) {
            this.value = f;
            this.unit = unit2;
        }

        public values(float f) {
            this.value = f;
            this.unit = Unit.px;
        }

        public float floatValue() {
            return this.value;
        }

        public float floatValueX(offsetChildToAnchor offsetchildtoanchor) {
            switch ($SWITCH_TABLE$com$caverock$androidsvg$SVG$Unit()[this.unit.ordinal()]) {
                case 1:
                    return this.value;
                case 2:
                    return this.value * offsetchildtoanchor.getCurrentFontSize();
                case 3:
                    return this.value * offsetchildtoanchor.getCurrentFontXHeight();
                case 4:
                    return this.value * offsetchildtoanchor.getDPI();
                case 5:
                    return (this.value * offsetchildtoanchor.getDPI()) / 2.54f;
                case 6:
                    return (this.value * offsetchildtoanchor.getDPI()) / 25.4f;
                case 7:
                    return (this.value * offsetchildtoanchor.getDPI()) / 72.0f;
                case 8:
                    return (this.value * offsetchildtoanchor.getDPI()) / 6.0f;
                case 9:
                    length currentViewPortInUserUnits = offsetchildtoanchor.getCurrentViewPortInUserUnits();
                    if (currentViewPortInUserUnits == null) {
                        return this.value;
                    }
                    return (this.value * currentViewPortInUserUnits.width) / 100.0f;
                default:
                    return this.value;
            }
        }

        public float floatValueY(offsetChildToAnchor offsetchildtoanchor) {
            if (this.unit != Unit.percent) {
                return floatValueX(offsetchildtoanchor);
            }
            length currentViewPortInUserUnits = offsetchildtoanchor.getCurrentViewPortInUserUnits();
            if (currentViewPortInUserUnits == null) {
                return this.value;
            }
            return (this.value * currentViewPortInUserUnits.height) / 100.0f;
        }

        public float floatValue(offsetChildToAnchor offsetchildtoanchor) {
            if (this.unit != Unit.percent) {
                return floatValueX(offsetchildtoanchor);
            }
            length currentViewPortInUserUnits = offsetchildtoanchor.getCurrentViewPortInUserUnits();
            if (currentViewPortInUserUnits == null) {
                return this.value;
            }
            float f = currentViewPortInUserUnits.width;
            float f2 = currentViewPortInUserUnits.height;
            if (f == f2) {
                return (this.value * f) / 100.0f;
            }
            return (this.value * ((float) (Math.sqrt((double) ((f * f) + (f2 * f2))) / SVG.SQRT2))) / 100.0f;
        }

        public float floatValue(offsetChildToAnchor offsetchildtoanchor, float f) {
            if (this.unit == Unit.percent) {
                return (this.value * f) / 100.0f;
            }
            return floatValueX(offsetchildtoanchor);
        }

        public float floatValue(float f) {
            int i = $SWITCH_TABLE$com$caverock$androidsvg$SVG$Unit()[this.unit.ordinal()];
            if (i == 1) {
                return this.value;
            }
            switch (i) {
                case 4:
                    return this.value * f;
                case 5:
                    return (this.value * f) / 2.54f;
                case 6:
                    return (this.value * f) / 25.4f;
                case 7:
                    return (this.value * f) / 72.0f;
                case 8:
                    return (this.value * f) / 6.0f;
                default:
                    return this.value;
            }
        }

        public boolean isZero() {
            return this.value == 0.0f;
        }

        public boolean isNegative() {
            return this.value < 0.0f;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(String.valueOf(String.valueOf(this.value)));
            sb.append(this.unit);
            return sb.toString();
        }
    }

    public static class setMax {
        public values bottom;
        public values left;
        public values right;
        public values top;

        public setMax(values values, values values2, values values3, values values4) {
            this.top = values;
            this.right = values2;
            this.bottom = values3;
            this.left = values4;
        }
    }

    public static class ICustomTabsCallback extends mayLaunchUrl implements SVG$Mean$Arithmetic {
        public values height;
        public String href;
        public Boolean patternContentUnitsAreUser;
        public Matrix patternTransform;
        public Boolean patternUnitsAreUser;
        public values width;
        public values x;
        public values y;

        public static class Stub extends Proxy {
            public Style baseStyle = null;
            public List<String> classNames = null;

            /* renamed from: id  reason: collision with root package name */
            public String f9526id = null;
            public Boolean spacePreserve = null;
            public Style style = null;

            public static class Proxy {
                public SVG document;
                public onTransact parent;

                protected Proxy() {
                }

                public String toString() {
                    return getClass().getSimpleName();
                }
            }

            protected Stub() {
            }
        }

        public static class Default extends Stub {
            public length boundingBox = null;

            protected Default() {
            }
        }

        protected ICustomTabsCallback() {
        }
    }

    protected static class asInterface extends ICustomTabsCallback.Default implements onPostMessage {
        public String requiredExtensions = null;
        public Set<String> requiredFeatures = null;
        public Set<String> requiredFonts = null;
        public Set<String> requiredFormats = null;
        public Set<String> systemLanguage = null;

        protected asInterface() {
        }

        public void setRequiredFeatures(Set<String> set) {
            this.requiredFeatures = set;
        }

        public Set<String> getRequiredFeatures() {
            return this.requiredFeatures;
        }

        public void setRequiredExtensions(String str) {
            this.requiredExtensions = str;
        }

        public String getRequiredExtensions() {
            return this.requiredExtensions;
        }

        public void setSystemLanguage(Set<String> set) {
            this.systemLanguage = set;
        }

        public Set<String> getSystemLanguage() {
            return this.systemLanguage;
        }

        public void setRequiredFormats(Set<String> set) {
            this.requiredFormats = set;
        }

        public Set<String> getRequiredFormats() {
            return this.requiredFormats;
        }

        public void setRequiredFonts(Set<String> set) {
            this.requiredFonts = set;
        }

        public Set<String> getRequiredFonts() {
            return this.requiredFonts;
        }
    }

    public static class asBinder extends ICustomTabsCallback.Default implements onTransact, onPostMessage {
        public List<ICustomTabsCallback.Stub.Proxy> children = new ArrayList();
        public String requiredExtensions = null;
        public Set<String> requiredFeatures = null;
        public Set<String> requiredFonts = null;
        public Set<String> requiredFormats = null;
        public Set<String> systemLanguage = null;

        public Set<String> getSystemLanguage() {
            return null;
        }

        protected asBinder() {
        }

        public List<ICustomTabsCallback.Stub.Proxy> getChildren() {
            return this.children;
        }

        public void addChild(ICustomTabsCallback.Stub.Proxy proxy) throws SAXException {
            this.children.add(proxy);
        }

        public void setRequiredFeatures(Set<String> set) {
            this.requiredFeatures = set;
        }

        public Set<String> getRequiredFeatures() {
            return this.requiredFeatures;
        }

        public void setRequiredExtensions(String str) {
            this.requiredExtensions = str;
        }

        public String getRequiredExtensions() {
            return this.requiredExtensions;
        }

        public void setSystemLanguage(Set<String> set) {
            this.systemLanguage = set;
        }

        public void setRequiredFormats(Set<String> set) {
            this.requiredFormats = set;
        }

        public Set<String> getRequiredFormats() {
            return this.requiredFormats;
        }

        public void setRequiredFonts(Set<String> set) {
            this.requiredFonts = set;
        }

        public Set<String> getRequiredFonts() {
            return this.requiredFonts;
        }
    }

    public static class setDefaultImpl extends asBinder {
        public PreserveAspectRatio preserveAspectRatio = null;

        protected setDefaultImpl() {
        }
    }

    public static class mayLaunchUrl extends setDefaultImpl {
        public length viewBox;

        protected mayLaunchUrl() {
        }
    }

    public static class extraCallback extends mayLaunchUrl {
        public values height;
        public String version;
        public values width;
        public values x;
        public values y;

        protected extraCallback() {
        }
    }

    public static class toDoubleRange extends asBinder implements hashCode {
        public Matrix transform;

        protected toDoubleRange() {
        }

        public void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    protected static class IsOverlapping extends toDoubleRange implements SVG$Mean$Arithmetic {
        protected IsOverlapping() {
        }
    }

    public static abstract class toIntRange extends asInterface implements hashCode {
        public Matrix transform;

        protected toIntRange() {
        }

        public void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    public static class invokeSuspend extends toIntRange {
        public getCause d;
        public Float pathLength;

        protected invokeSuspend() {
        }
    }

    public static class extraCallbackWithResult extends toIntRange {
        public values height;
        public values rx;
        public values ry;
        public values width;
        public values x;
        public values y;

        protected extraCallbackWithResult() {
        }
    }

    public static class getMax extends toIntRange {
        public values cx;
        public values cy;
        public values r;

        protected getMax() {
        }
    }

    public static class equals extends toIntRange {
        public values cx;
        public values cy;
        public values rx;
        public values ry;

        protected equals() {
        }
    }

    public static class onNavigationEvent extends toIntRange {
        public float[] points;

        protected onNavigationEvent() {
        }
    }

    public static class b extends onNavigationEvent {
        protected b() {
        }
    }

    public static class validateRelationship extends asBinder {
        protected validateRelationship() {
        }

        public void addChild(ICustomTabsCallback.Stub.Proxy proxy) throws SAXException {
            if (proxy instanceof requestPostMessageChannelWithExtras) {
                this.children.add(proxy);
                return;
            }
            StringBuilder sb = new StringBuilder("Text content elements cannot contain ");
            sb.append(proxy);
            sb.append(" elements.");
            throw new SAXException(sb.toString());
        }
    }

    public static class requestPostMessageChannel extends validateRelationship {
        public List<values> dx;
        public List<values> dy;
        public List<values> x;
        public List<values> y;

        protected requestPostMessageChannel() {
        }
    }

    public static class postMessage extends requestPostMessageChannel implements receiveFile, hashCode {
        public Matrix transform;

        protected postMessage() {
        }

        public void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    public static class newSession extends requestPostMessageChannel implements requestPostMessageChannelWithExtras {
        private receiveFile textRoot;

        protected newSession() {
        }

        public final void setTextRoot(receiveFile receivefile) {
            this.textRoot = receivefile;
        }

        public final receiveFile getTextRoot() {
            return this.textRoot;
        }
    }

    public static class IPostMessageService extends ICustomTabsCallback.Stub.Proxy implements requestPostMessageChannelWithExtras {
        public String text;
        private receiveFile textRoot;

        public IPostMessageService(String str) {
            this.text = str;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(String.valueOf(getClass().getSimpleName()));
            sb.append(" '");
            sb.append(this.text);
            sb.append("'");
            return sb.toString();
        }

        public final void setTextRoot(receiveFile receivefile) {
            this.textRoot = receivefile;
        }

        public final receiveFile getTextRoot() {
            return this.textRoot;
        }
    }

    public static class extraCommand extends validateRelationship implements requestPostMessageChannelWithExtras {
        public String href;
        private receiveFile textRoot;

        protected extraCommand() {
        }

        public void setTextRoot(receiveFile receivefile) {
            this.textRoot = receivefile;
        }

        public receiveFile getTextRoot() {
            return this.textRoot;
        }
    }

    public static class updateVisuals extends validateRelationship implements requestPostMessageChannelWithExtras {
        public String href;
        public values startOffset;
        private receiveFile textRoot;

        protected updateVisuals() {
        }

        public void setTextRoot(receiveFile receivefile) {
            this.textRoot = receivefile;
        }

        public receiveFile getTextRoot() {
            return this.textRoot;
        }
    }

    public static class warmup extends toDoubleRange {
        protected warmup() {
        }
    }

    public static class newSessionWithExtras extends mayLaunchUrl implements SVG$Mean$Arithmetic {
        protected newSessionWithExtras() {
        }
    }

    public static class valueOf extends mayLaunchUrl implements SVG$Mean$Arithmetic {
        public values markerHeight;
        public boolean markerUnitsAreUser;
        public values markerWidth;
        public Float orient;
        public values refX;
        public values refY;

        protected valueOf() {
        }
    }

    public static class isInside extends ICustomTabsCallback.Stub implements onTransact {
        public List<ICustomTabsCallback.Stub.Proxy> children = new ArrayList();
        public Matrix gradientTransform;
        public Boolean gradientUnitsAreUser;
        public String href;
        public GradientSpread spreadMethod;

        protected isInside() {
        }

        public List<ICustomTabsCallback.Stub.Proxy> getChildren() {
            return this.children;
        }

        public void addChild(ICustomTabsCallback.Stub.Proxy proxy) throws SAXException {
            if (proxy instanceof onMessageChannelReady) {
                this.children.add(proxy);
                return;
            }
            StringBuilder sb = new StringBuilder("Gradient elements cannot contain ");
            sb.append(proxy);
            sb.append(" elements.");
            throw new SAXException(sb.toString());
        }
    }

    public static class onMessageChannelReady extends ICustomTabsCallback.Stub implements onTransact {
        public Float offset;

        public void addChild(ICustomTabsCallback.Stub.Proxy proxy) throws SAXException {
        }

        protected onMessageChannelReady() {
        }

        public List<ICustomTabsCallback.Stub.Proxy> getChildren() {
            return SVG.EMPTY_CHILD_LIST;
        }
    }

    public static class ICustomTabsService extends isInside {
        public values x1;
        public values x2;
        public values y1;
        public values y2;

        protected ICustomTabsService() {
        }

        protected static class Default extends mayLaunchUrl implements SVG$Mean$Arithmetic {
            protected Default() {
            }
        }
    }

    public static class getInterfaceDescriptor extends isInside {
        public values cx;
        public values cy;
        public values fx;
        public values fy;
        public values r;

        protected getInterfaceDescriptor() {
        }
    }

    public static class setMin extends toDoubleRange implements SVG$Mean$Arithmetic {
        public Boolean clipPathUnitsAreUser;

        protected setMin() {
        }
    }

    public static class toString extends setDefaultImpl implements hashCode {
        public values height;
        public String href;
        public Matrix transform;
        public values width;
        public values x;
        public values y;

        protected toString() {
        }

        public void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    public static class onRelationshipValidationResult extends ICustomTabsCallback.Stub implements onTransact {
        public values solidColor;
        public values solidOpacity;

        public void addChild(ICustomTabsCallback.Stub.Proxy proxy) throws SAXException {
        }

        protected onRelationshipValidationResult() {
        }

        public List<ICustomTabsCallback.Stub.Proxy> getChildren() {
            return SVG.EMPTY_CHILD_LIST;
        }
    }

    /* access modifiers changed from: protected */
    public void setTitle(String str) {
        this.title = str;
    }

    /* access modifiers changed from: protected */
    public void setDesc(String str) {
        this.desc = str;
    }

    public hasDependencies getFileResolver() {
        return this.fileResolver;
    }

    public static class getCause implements create {
        private static final byte ARCTO = 4;
        private static final byte CLOSE = 8;
        private static final byte CUBICTO = 2;
        private static final byte LINETO = 1;
        private static final byte MOVETO = 0;
        private static final byte QUADTO = 3;
        private List<Byte> commands;
        private List<Float> coords;

        public getCause() {
            this.commands = null;
            this.coords = null;
            this.commands = new ArrayList();
            this.coords = new ArrayList();
        }

        public boolean isEmpty() {
            return this.commands.isEmpty();
        }

        public void moveTo(float f, float f2) {
            this.commands.add((byte) 0);
            this.coords.add(Float.valueOf(f));
            this.coords.add(Float.valueOf(f2));
        }

        public void lineTo(float f, float f2) {
            this.commands.add((byte) 1);
            this.coords.add(Float.valueOf(f));
            this.coords.add(Float.valueOf(f2));
        }

        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            this.commands.add((byte) 2);
            this.coords.add(Float.valueOf(f));
            this.coords.add(Float.valueOf(f2));
            this.coords.add(Float.valueOf(f3));
            this.coords.add(Float.valueOf(f4));
            this.coords.add(Float.valueOf(f5));
            this.coords.add(Float.valueOf(f6));
        }

        public void quadTo(float f, float f2, float f3, float f4) {
            this.commands.add((byte) 3);
            this.coords.add(Float.valueOf(f));
            this.coords.add(Float.valueOf(f2));
            this.coords.add(Float.valueOf(f3));
            this.coords.add(Float.valueOf(f4));
        }

        public void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            this.commands.add(Byte.valueOf(((z ? (char) 2 : 0) | true) | z2 ? (byte) 1 : 0));
            this.coords.add(Float.valueOf(f));
            this.coords.add(Float.valueOf(f2));
            this.coords.add(Float.valueOf(f3));
            this.coords.add(Float.valueOf(f4));
            this.coords.add(Float.valueOf(f5));
        }

        public void close() {
            this.commands.add((byte) 8);
        }

        public void enumeratePath(create create) {
            Iterator<Float> it = this.coords.iterator();
            for (Byte byteValue : this.commands) {
                byte byteValue2 = byteValue.byteValue();
                if (byteValue2 == 0) {
                    create.moveTo(it.next().floatValue(), it.next().floatValue());
                } else if (byteValue2 == 1) {
                    create.lineTo(it.next().floatValue(), it.next().floatValue());
                } else if (byteValue2 == 2) {
                    create.cubicTo(it.next().floatValue(), it.next().floatValue(), it.next().floatValue(), it.next().floatValue(), it.next().floatValue(), it.next().floatValue());
                } else if (byteValue2 == 3) {
                    create.quadTo(it.next().floatValue(), it.next().floatValue(), it.next().floatValue(), it.next().floatValue());
                } else if (byteValue2 != 8) {
                    create.arcTo(it.next().floatValue(), it.next().floatValue(), it.next().floatValue(), (byteValue2 & 2) != 0, (byteValue2 & 1) != 0, it.next().floatValue(), it.next().floatValue());
                } else {
                    create.close();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public ICustomTabsCallback.Stub.Proxy getElementById(String str) {
        if (str.equals(this.rootElement.f9526id)) {
            return this.rootElement;
        }
        return getElementById(this.rootElement, str);
    }

    private ICustomTabsCallback.Stub getElementById(onTransact ontransact, String str) {
        ICustomTabsCallback.Stub elementById;
        ICustomTabsCallback.Stub stub = (ICustomTabsCallback.Stub) ontransact;
        if (str.equals(stub.f9526id)) {
            return stub;
        }
        for (ICustomTabsCallback.Stub.Proxy next : ontransact.getChildren()) {
            if (next instanceof ICustomTabsCallback.Stub) {
                ICustomTabsCallback.Stub stub2 = (ICustomTabsCallback.Stub) next;
                if (str.equals(stub2.f9526id)) {
                    return stub2;
                }
                if ((next instanceof onTransact) && (elementById = getElementById((onTransact) next, str)) != null) {
                    return elementById;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public List<ICustomTabsCallback.Stub.Proxy> getElementsByTagName(Class cls) {
        return getElementsByTagName(this.rootElement, cls);
    }

    private List<ICustomTabsCallback.Stub.Proxy> getElementsByTagName(onTransact ontransact, Class cls) {
        ArrayList arrayList = new ArrayList();
        if (ontransact.getClass() == cls) {
            arrayList.add((ICustomTabsCallback.Stub.Proxy) ontransact);
        }
        for (ICustomTabsCallback.Stub.Proxy next : ontransact.getChildren()) {
            if (next.getClass() == cls) {
                arrayList.add(next);
            }
            if (next instanceof onTransact) {
                getElementsByTagName((onTransact) next, cls);
            }
        }
        return arrayList;
    }
}
