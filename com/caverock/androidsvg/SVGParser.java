package com.caverock.androidsvg;

import android.graphics.Matrix;
import com.alibaba.griver.device.proxy.RVCommonAbilityProxy;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.ConvertUtils;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import com.iap.ac.android.gradient.a.a;
import com.zoloz.rpc.encryption.EncryptionProxyInvocationHandler;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import o.AppNode;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;

public final class SVGParser extends DefaultHandler2 {
    private static /* synthetic */ int[] $SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr = null;
    private static final String CURRENTCOLOR = "currentColor";
    private static final String FEATURE_STRING_PREFIX = "http://www.w3.org/TR/SVG11/feature#";
    private static final String NONE = "none";
    private static final String SVG_NAMESPACE = "http://www.w3.org/2000/svg";
    private static final String TAG = "SVGParser";
    private static final String TAG_A = "a";
    private static final String TAG_CIRCLE = "circle";
    private static final String TAG_CLIPPATH = "clipPath";
    private static final String TAG_DEFS = "defs";
    private static final String TAG_DESC = "desc";
    private static final String TAG_ELLIPSE = "ellipse";
    private static final String TAG_G = "g";
    private static final String TAG_IMAGE = "image";
    private static final String TAG_LINE = "line";
    private static final String TAG_LINEARGRADIENT = "linearGradient";
    private static final String TAG_MARKER = "marker";
    private static final String TAG_MASK = "mask";
    private static final String TAG_PATH = "path";
    private static final String TAG_PATTERN = "pattern";
    private static final String TAG_POLYGON = "polygon";
    private static final String TAG_POLYLINE = "polyline";
    private static final String TAG_RADIALGRADIENT = "radialGradient";
    private static final String TAG_RECT = "rect";
    private static final String TAG_SOLIDCOLOR = "solidColor";
    private static final String TAG_STOP = "stop";
    private static final String TAG_STYLE = "style";
    private static final String TAG_SVG = "svg";
    private static final String TAG_SWITCH = "switch";
    private static final String TAG_SYMBOL = "symbol";
    private static final String TAG_TEXT = "text";
    private static final String TAG_TEXTPATH = "textPath";
    private static final String TAG_TITLE = "title";
    private static final String TAG_TREF = "tref";
    private static final String TAG_TSPAN = "tspan";
    private static final String TAG_USE = "use";
    private static final String TAG_VIEW = "view";
    private static final String VALID_DISPLAY_VALUES = "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|";
    private static final String VALID_VISIBILITY_VALUES = "|visible|hidden|collapse|";
    private static final String XLINK_NAMESPACE = "http://www.w3.org/1999/xlink";
    private static HashMap<String, PreserveAspectRatio.Alignment> aspectRatioKeywords = new HashMap<>();
    private static HashMap<String, Integer> colourKeywords = new HashMap<>();
    private static HashMap<String, SVG.values> fontSizeKeywords = new HashMap<>(9);
    private static HashMap<String, SVG.Style.FontStyle> fontStyleKeywords = new HashMap<>(3);
    private static HashMap<String, Integer> fontWeightKeywords = new HashMap<>(13);
    public static HashSet<String> supportedFeatures = new HashSet<>();
    private SVG.onTransact currentElement = null;
    private int ignoreDepth;
    private boolean ignoring = false;
    private boolean inMetadataElement = false;
    private boolean inStyleElement = false;
    private StringBuilder metadataElementContents = null;
    private String metadataTag = null;
    private StringBuilder styleElementContents = null;
    private HashSet<String> supportedFormats = null;
    private SVG svgDocument = null;

    private void debug(String str, Object... objArr) {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(186:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|(2:186|187)|188|190) */
    /* JADX WARNING: Can't wrap try/catch for region: R(187:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|187|188|190) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:100:0x01e5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:102:0x01ef */
    /* JADX WARNING: Missing exception handler attribute for start block: B:104:0x01f9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:106:0x0203 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:108:0x020d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0028 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:110:0x0217 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:112:0x0221 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:114:0x022b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:116:0x0235 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:118:0x023f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:120:0x0249 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:122:0x0253 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:124:0x025d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:126:0x0267 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:128:0x0271 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0031 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:130:0x027b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:132:0x0285 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:134:0x028f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:136:0x0299 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:138:0x02a3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:140:0x02ad */
    /* JADX WARNING: Missing exception handler attribute for start block: B:142:0x02b7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:144:0x02c1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:146:0x02cb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:148:0x02d5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:150:0x02df */
    /* JADX WARNING: Missing exception handler attribute for start block: B:152:0x02e9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:154:0x02f3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:156:0x02fd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:158:0x0307 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:160:0x0311 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:162:0x031b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:164:0x0325 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:166:0x032f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:168:0x0339 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0043 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:170:0x0343 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:172:0x034d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:174:0x0357 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:176:0x0361 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:178:0x036b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:180:0x0375 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:182:0x037f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:184:0x0389 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:186:0x0393 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x004c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0055 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x005f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0069 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0073 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x007d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0087 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0091 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x009b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00a5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00af */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00b9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00c3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00cd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00d7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00e1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00eb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00f5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00ff */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0109 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x0113 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x011d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x0127 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0131 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x013b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x0145 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0015 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x014f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x0159 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x0163 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x016d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x0177 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x0181 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:82:0x018b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x0195 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x019f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x01a9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x01b3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x01bd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:94:0x01c7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x01d1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:98:0x01db */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ int[] $SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr() {
        /*
            int[] r0 = $SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            com.caverock.androidsvg.SVGParser$SVGAttr[] r0 = com.caverock.androidsvg.SVGParser.SVGAttr.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.CLASS     // Catch:{ NoSuchFieldError -> 0x0015 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0015 }
            r2 = 1
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0015 }
        L_0x0015:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.UNSUPPORTED     // Catch:{ NoSuchFieldError -> 0x001f }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 92
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.clip     // Catch:{ NoSuchFieldError -> 0x0028 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
            r2 = 2
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
        L_0x0028:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.clipPathUnits     // Catch:{ NoSuchFieldError -> 0x0031 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0031 }
            r2 = 4
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0031 }
        L_0x0031:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.clip_path     // Catch:{ NoSuchFieldError -> 0x003a }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003a }
            r2 = 3
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003a }
        L_0x003a:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.clip_rule     // Catch:{ NoSuchFieldError -> 0x0043 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
            r2 = 5
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
        L_0x0043:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.color     // Catch:{ NoSuchFieldError -> 0x004c }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
            r2 = 6
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004c }
        L_0x004c:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.cx     // Catch:{ NoSuchFieldError -> 0x0055 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0055 }
            r2 = 7
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0055 }
        L_0x0055:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.cy     // Catch:{ NoSuchFieldError -> 0x005f }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
            r2 = 8
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005f }
        L_0x005f:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.d     // Catch:{ NoSuchFieldError -> 0x0069 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
            r2 = 14
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0069 }
        L_0x0069:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.direction     // Catch:{ NoSuchFieldError -> 0x0073 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
            r2 = 9
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0073 }
        L_0x0073:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.display     // Catch:{ NoSuchFieldError -> 0x007d }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
            r2 = 15
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
        L_0x007d:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.dx     // Catch:{ NoSuchFieldError -> 0x0087 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
            r2 = 10
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0087 }
        L_0x0087:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.dy     // Catch:{ NoSuchFieldError -> 0x0091 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
            r2 = 11
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0091 }
        L_0x0091:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.fill     // Catch:{ NoSuchFieldError -> 0x009b }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
            r2 = 16
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009b }
        L_0x009b:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.fill_opacity     // Catch:{ NoSuchFieldError -> 0x00a5 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a5 }
            r2 = 18
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a5 }
        L_0x00a5:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.fill_rule     // Catch:{ NoSuchFieldError -> 0x00af }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00af }
            r2 = 17
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00af }
        L_0x00af:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.font     // Catch:{ NoSuchFieldError -> 0x00b9 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b9 }
            r2 = 19
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b9 }
        L_0x00b9:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.font_family     // Catch:{ NoSuchFieldError -> 0x00c3 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c3 }
            r2 = 20
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c3 }
        L_0x00c3:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.font_size     // Catch:{ NoSuchFieldError -> 0x00cd }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cd }
            r2 = 21
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cd }
        L_0x00cd:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.font_style     // Catch:{ NoSuchFieldError -> 0x00d7 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d7 }
            r2 = 23
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d7 }
        L_0x00d7:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.font_weight     // Catch:{ NoSuchFieldError -> 0x00e1 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e1 }
            r2 = 22
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e1 }
        L_0x00e1:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.fx     // Catch:{ NoSuchFieldError -> 0x00eb }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00eb }
            r2 = 12
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00eb }
        L_0x00eb:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.fy     // Catch:{ NoSuchFieldError -> 0x00f5 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f5 }
            r2 = 13
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f5 }
        L_0x00f5:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.gradientTransform     // Catch:{ NoSuchFieldError -> 0x00ff }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ff }
            r2 = 24
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ff }
        L_0x00ff:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.gradientUnits     // Catch:{ NoSuchFieldError -> 0x0109 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0109 }
            r2 = 25
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0109 }
        L_0x0109:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.height     // Catch:{ NoSuchFieldError -> 0x0113 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0113 }
            r2 = 26
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0113 }
        L_0x0113:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.href     // Catch:{ NoSuchFieldError -> 0x011d }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011d }
            r2 = 27
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x011d }
        L_0x011d:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.id     // Catch:{ NoSuchFieldError -> 0x0127 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0127 }
            r2 = 28
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0127 }
        L_0x0127:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.marker     // Catch:{ NoSuchFieldError -> 0x0131 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0131 }
            r2 = 29
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0131 }
        L_0x0131:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.markerHeight     // Catch:{ NoSuchFieldError -> 0x013b }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x013b }
            r2 = 33
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x013b }
        L_0x013b:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.markerUnits     // Catch:{ NoSuchFieldError -> 0x0145 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0145 }
            r2 = 34
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0145 }
        L_0x0145:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.markerWidth     // Catch:{ NoSuchFieldError -> 0x014f }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x014f }
            r2 = 35
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x014f }
        L_0x014f:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.marker_end     // Catch:{ NoSuchFieldError -> 0x0159 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0159 }
            r2 = 32
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0159 }
        L_0x0159:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.marker_mid     // Catch:{ NoSuchFieldError -> 0x0163 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0163 }
            r2 = 31
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0163 }
        L_0x0163:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.marker_start     // Catch:{ NoSuchFieldError -> 0x016d }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x016d }
            r2 = 30
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x016d }
        L_0x016d:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.mask     // Catch:{ NoSuchFieldError -> 0x0177 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0177 }
            r2 = 36
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0177 }
        L_0x0177:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.maskContentUnits     // Catch:{ NoSuchFieldError -> 0x0181 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0181 }
            r2 = 37
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0181 }
        L_0x0181:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.maskUnits     // Catch:{ NoSuchFieldError -> 0x018b }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x018b }
            r2 = 38
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x018b }
        L_0x018b:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.media     // Catch:{ NoSuchFieldError -> 0x0195 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0195 }
            r2 = 39
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0195 }
        L_0x0195:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.offset     // Catch:{ NoSuchFieldError -> 0x019f }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x019f }
            r2 = 40
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x019f }
        L_0x019f:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.opacity     // Catch:{ NoSuchFieldError -> 0x01a9 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a9 }
            r2 = 41
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01a9 }
        L_0x01a9:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.orient     // Catch:{ NoSuchFieldError -> 0x01b3 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b3 }
            r2 = 42
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01b3 }
        L_0x01b3:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.overflow     // Catch:{ NoSuchFieldError -> 0x01bd }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01bd }
            r2 = 43
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01bd }
        L_0x01bd:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.pathLength     // Catch:{ NoSuchFieldError -> 0x01c7 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c7 }
            r2 = 44
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01c7 }
        L_0x01c7:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.patternContentUnits     // Catch:{ NoSuchFieldError -> 0x01d1 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d1 }
            r2 = 45
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01d1 }
        L_0x01d1:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.patternTransform     // Catch:{ NoSuchFieldError -> 0x01db }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01db }
            r2 = 46
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01db }
        L_0x01db:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.patternUnits     // Catch:{ NoSuchFieldError -> 0x01e5 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e5 }
            r2 = 47
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01e5 }
        L_0x01e5:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.points     // Catch:{ NoSuchFieldError -> 0x01ef }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ef }
            r2 = 48
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01ef }
        L_0x01ef:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.preserveAspectRatio     // Catch:{ NoSuchFieldError -> 0x01f9 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01f9 }
            r2 = 49
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01f9 }
        L_0x01f9:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.r     // Catch:{ NoSuchFieldError -> 0x0203 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0203 }
            r2 = 50
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0203 }
        L_0x0203:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.refX     // Catch:{ NoSuchFieldError -> 0x020d }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x020d }
            r2 = 51
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x020d }
        L_0x020d:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.refY     // Catch:{ NoSuchFieldError -> 0x0217 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0217 }
            r2 = 52
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0217 }
        L_0x0217:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.requiredExtensions     // Catch:{ NoSuchFieldError -> 0x0221 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0221 }
            r2 = 54
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0221 }
        L_0x0221:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.requiredFeatures     // Catch:{ NoSuchFieldError -> 0x022b }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x022b }
            r2 = 53
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x022b }
        L_0x022b:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.requiredFonts     // Catch:{ NoSuchFieldError -> 0x0235 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0235 }
            r2 = 56
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0235 }
        L_0x0235:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.requiredFormats     // Catch:{ NoSuchFieldError -> 0x023f }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x023f }
            r2 = 55
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x023f }
        L_0x023f:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.rx     // Catch:{ NoSuchFieldError -> 0x0249 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0249 }
            r2 = 57
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0249 }
        L_0x0249:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.ry     // Catch:{ NoSuchFieldError -> 0x0253 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0253 }
            r2 = 58
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0253 }
        L_0x0253:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.solid_color     // Catch:{ NoSuchFieldError -> 0x025d }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x025d }
            r2 = 59
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x025d }
        L_0x025d:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.solid_opacity     // Catch:{ NoSuchFieldError -> 0x0267 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0267 }
            r2 = 60
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0267 }
        L_0x0267:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.spreadMethod     // Catch:{ NoSuchFieldError -> 0x0271 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0271 }
            r2 = 61
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0271 }
        L_0x0271:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.startOffset     // Catch:{ NoSuchFieldError -> 0x027b }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x027b }
            r2 = 62
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x027b }
        L_0x027b:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.stop_color     // Catch:{ NoSuchFieldError -> 0x0285 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0285 }
            r2 = 63
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0285 }
        L_0x0285:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.stop_opacity     // Catch:{ NoSuchFieldError -> 0x028f }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x028f }
            r2 = 64
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x028f }
        L_0x028f:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.stroke     // Catch:{ NoSuchFieldError -> 0x0299 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0299 }
            r2 = 65
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0299 }
        L_0x0299:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.stroke_dasharray     // Catch:{ NoSuchFieldError -> 0x02a3 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02a3 }
            r2 = 66
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02a3 }
        L_0x02a3:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.stroke_dashoffset     // Catch:{ NoSuchFieldError -> 0x02ad }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02ad }
            r2 = 67
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02ad }
        L_0x02ad:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.stroke_linecap     // Catch:{ NoSuchFieldError -> 0x02b7 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02b7 }
            r2 = 68
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02b7 }
        L_0x02b7:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.stroke_linejoin     // Catch:{ NoSuchFieldError -> 0x02c1 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02c1 }
            r2 = 69
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02c1 }
        L_0x02c1:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.stroke_miterlimit     // Catch:{ NoSuchFieldError -> 0x02cb }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02cb }
            r2 = 70
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02cb }
        L_0x02cb:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.stroke_opacity     // Catch:{ NoSuchFieldError -> 0x02d5 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02d5 }
            r2 = 71
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02d5 }
        L_0x02d5:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.stroke_width     // Catch:{ NoSuchFieldError -> 0x02df }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02df }
            r2 = 72
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02df }
        L_0x02df:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.style     // Catch:{ NoSuchFieldError -> 0x02e9 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02e9 }
            r2 = 73
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02e9 }
        L_0x02e9:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.systemLanguage     // Catch:{ NoSuchFieldError -> 0x02f3 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02f3 }
            r2 = 74
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02f3 }
        L_0x02f3:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.text_anchor     // Catch:{ NoSuchFieldError -> 0x02fd }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02fd }
            r2 = 75
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02fd }
        L_0x02fd:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.text_decoration     // Catch:{ NoSuchFieldError -> 0x0307 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0307 }
            r2 = 76
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0307 }
        L_0x0307:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.transform     // Catch:{ NoSuchFieldError -> 0x0311 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0311 }
            r2 = 77
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0311 }
        L_0x0311:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.type     // Catch:{ NoSuchFieldError -> 0x031b }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x031b }
            r2 = 78
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x031b }
        L_0x031b:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.vector_effect     // Catch:{ NoSuchFieldError -> 0x0325 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0325 }
            r2 = 79
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0325 }
        L_0x0325:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.version     // Catch:{ NoSuchFieldError -> 0x032f }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x032f }
            r2 = 80
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x032f }
        L_0x032f:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.viewBox     // Catch:{ NoSuchFieldError -> 0x0339 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0339 }
            r2 = 81
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0339 }
        L_0x0339:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.viewport_fill     // Catch:{ NoSuchFieldError -> 0x0343 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0343 }
            r2 = 89
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0343 }
        L_0x0343:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.viewport_fill_opacity     // Catch:{ NoSuchFieldError -> 0x034d }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x034d }
            r2 = 90
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x034d }
        L_0x034d:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.visibility     // Catch:{ NoSuchFieldError -> 0x0357 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0357 }
            r2 = 91
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0357 }
        L_0x0357:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.width     // Catch:{ NoSuchFieldError -> 0x0361 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0361 }
            r2 = 82
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0361 }
        L_0x0361:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.x     // Catch:{ NoSuchFieldError -> 0x036b }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x036b }
            r2 = 83
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x036b }
        L_0x036b:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.x1     // Catch:{ NoSuchFieldError -> 0x0375 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0375 }
            r2 = 85
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0375 }
        L_0x0375:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.x2     // Catch:{ NoSuchFieldError -> 0x037f }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x037f }
            r2 = 87
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x037f }
        L_0x037f:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.y     // Catch:{ NoSuchFieldError -> 0x0389 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0389 }
            r2 = 84
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0389 }
        L_0x0389:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.y1     // Catch:{ NoSuchFieldError -> 0x0393 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0393 }
            r2 = 86
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0393 }
        L_0x0393:
            com.caverock.androidsvg.SVGParser$SVGAttr r1 = com.caverock.androidsvg.SVGParser.SVGAttr.y2     // Catch:{ NoSuchFieldError -> 0x039d }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x039d }
            r2 = 88
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x039d }
        L_0x039d:
            $SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.$SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr():int[]");
    }

    enum SVGAttr {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        id,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;

        public static SVGAttr fromString(String str) {
            if (str.equals("class")) {
                return CLASS;
            }
            if (str.indexOf(95) != -1) {
                return UNSUPPORTED;
            }
            try {
                return valueOf(str.replace('-', '_'));
            } catch (IllegalArgumentException unused) {
                return UNSUPPORTED;
            }
        }
    }

    static {
        colourKeywords.put("aliceblue", 15792383);
        colourKeywords.put("antiquewhite", 16444375);
        colourKeywords.put("aqua", 65535);
        colourKeywords.put("aquamarine", 8388564);
        colourKeywords.put("azure", 15794175);
        colourKeywords.put("beige", 16119260);
        colourKeywords.put("bisque", 16770244);
        colourKeywords.put("black", 0);
        colourKeywords.put("blanchedalmond", 16772045);
        colourKeywords.put("blue", 255);
        colourKeywords.put("blueviolet", 9055202);
        colourKeywords.put("brown", 10824234);
        colourKeywords.put("burlywood", 14596231);
        colourKeywords.put("cadetblue", 6266528);
        colourKeywords.put("chartreuse", 8388352);
        colourKeywords.put("chocolate", 13789470);
        colourKeywords.put("coral", 16744272);
        colourKeywords.put("cornflowerblue", 6591981);
        colourKeywords.put("cornsilk", 16775388);
        colourKeywords.put("crimson", 14423100);
        colourKeywords.put("cyan", 65535);
        colourKeywords.put("darkblue", 139);
        colourKeywords.put("darkcyan", 35723);
        colourKeywords.put("darkgoldenrod", 12092939);
        colourKeywords.put("darkgray", 11119017);
        colourKeywords.put("darkgreen", 25600);
        colourKeywords.put("darkgrey", 11119017);
        colourKeywords.put("darkkhaki", 12433259);
        colourKeywords.put("darkmagenta", 9109643);
        colourKeywords.put("darkolivegreen", 5597999);
        colourKeywords.put("darkorange", 16747520);
        colourKeywords.put("darkorchid", 10040012);
        colourKeywords.put("darkred", 9109504);
        colourKeywords.put("darksalmon", 15308410);
        colourKeywords.put("darkseagreen", 9419919);
        colourKeywords.put("darkslateblue", 4734347);
        colourKeywords.put("darkslategray", 3100495);
        colourKeywords.put("darkslategrey", 3100495);
        colourKeywords.put("darkturquoise", 52945);
        colourKeywords.put("darkviolet", 9699539);
        colourKeywords.put("deeppink", 16716947);
        colourKeywords.put("deepskyblue", 49151);
        colourKeywords.put("dimgray", 6908265);
        colourKeywords.put("dimgrey", 6908265);
        colourKeywords.put("dodgerblue", 2003199);
        colourKeywords.put("firebrick", 11674146);
        colourKeywords.put("floralwhite", 16775920);
        colourKeywords.put("forestgreen", 2263842);
        colourKeywords.put("fuchsia", 16711935);
        colourKeywords.put("gainsboro", 14474460);
        colourKeywords.put("ghostwhite", 16316671);
        colourKeywords.put("gold", 16766720);
        colourKeywords.put("goldenrod", 14329120);
        colourKeywords.put("gray", 8421504);
        colourKeywords.put("green", 32768);
        colourKeywords.put("greenyellow", 11403055);
        colourKeywords.put("grey", 8421504);
        colourKeywords.put("honeydew", 15794160);
        colourKeywords.put("hotpink", 16738740);
        colourKeywords.put("indianred", 13458524);
        colourKeywords.put("indigo", 4915330);
        colourKeywords.put("ivory", 16777200);
        colourKeywords.put("khaki", 15787660);
        colourKeywords.put("lavender", 15132410);
        colourKeywords.put("lavenderblush", 16773365);
        colourKeywords.put("lawngreen", 8190976);
        colourKeywords.put("lemonchiffon", 16775885);
        colourKeywords.put("lightblue", 11393254);
        colourKeywords.put("lightcoral", 15761536);
        colourKeywords.put("lightcyan", 14745599);
        colourKeywords.put("lightgoldenrodyellow", 16448210);
        colourKeywords.put("lightgray", 13882323);
        colourKeywords.put("lightgreen", 9498256);
        colourKeywords.put("lightgrey", 13882323);
        colourKeywords.put("lightpink", 16758465);
        colourKeywords.put("lightsalmon", 16752762);
        colourKeywords.put("lightseagreen", 2142890);
        colourKeywords.put("lightskyblue", 8900346);
        colourKeywords.put("lightslategray", 7833753);
        colourKeywords.put("lightslategrey", 7833753);
        colourKeywords.put("lightsteelblue", 11584734);
        colourKeywords.put("lightyellow", 16777184);
        colourKeywords.put("lime", 65280);
        colourKeywords.put("limegreen", 3329330);
        colourKeywords.put("linen", 16445670);
        colourKeywords.put("magenta", 16711935);
        colourKeywords.put("maroon", 8388608);
        colourKeywords.put("mediumaquamarine", 6737322);
        colourKeywords.put("mediumblue", 205);
        colourKeywords.put("mediumorchid", 12211667);
        colourKeywords.put("mediumpurple", 9662683);
        colourKeywords.put("mediumseagreen", 3978097);
        colourKeywords.put("mediumslateblue", 8087790);
        colourKeywords.put("mediumspringgreen", 64154);
        colourKeywords.put("mediumturquoise", 4772300);
        colourKeywords.put("mediumvioletred", 13047173);
        colourKeywords.put("midnightblue", 1644912);
        colourKeywords.put("mintcream", 16121850);
        colourKeywords.put("mistyrose", 16770273);
        colourKeywords.put("moccasin", 16770229);
        colourKeywords.put("navajowhite", 16768685);
        colourKeywords.put("navy", 128);
        colourKeywords.put("oldlace", 16643558);
        colourKeywords.put("olive", 8421376);
        colourKeywords.put("olivedrab", 7048739);
        colourKeywords.put("orange", 16753920);
        colourKeywords.put("orangered", 16729344);
        colourKeywords.put("orchid", 14315734);
        colourKeywords.put("palegoldenrod", 15657130);
        colourKeywords.put("palegreen", 10025880);
        colourKeywords.put("paleturquoise", 11529966);
        colourKeywords.put("palevioletred", 14381203);
        colourKeywords.put("papayawhip", 16773077);
        colourKeywords.put("peachpuff", 16767673);
        colourKeywords.put("peru", 13468991);
        colourKeywords.put("pink", 16761035);
        colourKeywords.put("plum", 14524637);
        colourKeywords.put("powderblue", 11591910);
        colourKeywords.put("purple", 8388736);
        colourKeywords.put("red", 16711680);
        colourKeywords.put("rosybrown", 12357519);
        colourKeywords.put("royalblue", 4286945);
        colourKeywords.put("saddlebrown", 9127187);
        colourKeywords.put("salmon", 16416882);
        colourKeywords.put("sandybrown", 16032864);
        colourKeywords.put("seagreen", 3050327);
        colourKeywords.put("seashell", 16774638);
        colourKeywords.put("sienna", 10506797);
        colourKeywords.put("silver", 12632256);
        colourKeywords.put("skyblue", 8900331);
        colourKeywords.put("slateblue", 6970061);
        colourKeywords.put("slategray", 7372944);
        colourKeywords.put("slategrey", 7372944);
        colourKeywords.put("snow", 16775930);
        colourKeywords.put("springgreen", 65407);
        colourKeywords.put("steelblue", 4620980);
        colourKeywords.put("tan", 13808780);
        colourKeywords.put("teal", 32896);
        colourKeywords.put("thistle", 14204888);
        colourKeywords.put("tomato", 16737095);
        colourKeywords.put("turquoise", 4251856);
        colourKeywords.put("violet", 15631086);
        colourKeywords.put("wheat", 16113331);
        colourKeywords.put("white", Integer.valueOf(FlexItem.MAX_SIZE));
        colourKeywords.put("whitesmoke", 16119285);
        colourKeywords.put("yellow", 16776960);
        colourKeywords.put("yellowgreen", 10145074);
        fontSizeKeywords.put("xx-small", new SVG.values(0.694f, SVG.Unit.pt));
        fontSizeKeywords.put("x-small", new SVG.values(0.833f, SVG.Unit.pt));
        fontSizeKeywords.put("small", new SVG.values(10.0f, SVG.Unit.pt));
        fontSizeKeywords.put("medium", new SVG.values(12.0f, SVG.Unit.pt));
        fontSizeKeywords.put("large", new SVG.values(14.4f, SVG.Unit.pt));
        fontSizeKeywords.put("x-large", new SVG.values(17.3f, SVG.Unit.pt));
        fontSizeKeywords.put("xx-large", new SVG.values(20.7f, SVG.Unit.pt));
        fontSizeKeywords.put("smaller", new SVG.values(83.33f, SVG.Unit.percent));
        fontSizeKeywords.put("larger", new SVG.values(120.0f, SVG.Unit.percent));
        fontWeightKeywords.put("normal", 400);
        fontWeightKeywords.put(TtmlNode.BOLD, 700);
        fontWeightKeywords.put("bolder", 1);
        fontWeightKeywords.put("lighter", -1);
        fontWeightKeywords.put(EncryptionProxyInvocationHandler.SUCCESS_RET_CODE, 100);
        fontWeightKeywords.put("200", 200);
        fontWeightKeywords.put("300", 300);
        fontWeightKeywords.put("400", 400);
        fontWeightKeywords.put("500", 500);
        fontWeightKeywords.put("600", 600);
        fontWeightKeywords.put("700", 700);
        fontWeightKeywords.put("800", 800);
        fontWeightKeywords.put("900", Integer.valueOf(SecExceptionCode.SEC_ERROR_UMID_VALID));
        fontStyleKeywords.put("normal", SVG.Style.FontStyle.Normal);
        fontStyleKeywords.put(TtmlNode.ITALIC, SVG.Style.FontStyle.Italic);
        fontStyleKeywords.put("oblique", SVG.Style.FontStyle.Oblique);
        aspectRatioKeywords.put("none", PreserveAspectRatio.Alignment.None);
        aspectRatioKeywords.put("xMinYMin", PreserveAspectRatio.Alignment.XMinYMin);
        aspectRatioKeywords.put("xMidYMin", PreserveAspectRatio.Alignment.XMidYMin);
        aspectRatioKeywords.put("xMaxYMin", PreserveAspectRatio.Alignment.XMaxYMin);
        aspectRatioKeywords.put("xMinYMid", PreserveAspectRatio.Alignment.XMinYMid);
        aspectRatioKeywords.put("xMidYMid", PreserveAspectRatio.Alignment.XMidYMid);
        aspectRatioKeywords.put("xMaxYMid", PreserveAspectRatio.Alignment.XMaxYMid);
        aspectRatioKeywords.put("xMinYMax", PreserveAspectRatio.Alignment.XMinYMax);
        aspectRatioKeywords.put("xMidYMax", PreserveAspectRatio.Alignment.XMidYMax);
        aspectRatioKeywords.put("xMaxYMax", PreserveAspectRatio.Alignment.XMaxYMax);
        supportedFeatures.add("Structure");
        supportedFeatures.add("BasicStructure");
        supportedFeatures.add("ConditionalProcessing");
        supportedFeatures.add("Image");
        supportedFeatures.add("Style");
        supportedFeatures.add("ViewportAttribute");
        supportedFeatures.add("Shape");
        supportedFeatures.add("BasicText");
        supportedFeatures.add("PaintAttribute");
        supportedFeatures.add("BasicPaintAttribute");
        supportedFeatures.add("OpacityAttribute");
        supportedFeatures.add("BasicGraphicsAttribute");
        supportedFeatures.add("Marker");
        supportedFeatures.add(a.TAG);
        supportedFeatures.add("Pattern");
        supportedFeatures.add("Clip");
        supportedFeatures.add("BasicClip");
        supportedFeatures.add("Mask");
        supportedFeatures.add("View");
    }

    /* access modifiers changed from: protected */
    public final void setSupportedFormats(String[] strArr) {
        HashSet<String> hashSet = new HashSet<>(strArr.length);
        this.supportedFormats = hashSet;
        Collections.addAll(hashSet, strArr);
    }

    /* access modifiers changed from: protected */
    public final SVG parse(GZIPInputStream gZIPInputStream) throws SVGParseException {
        if (!gZIPInputStream.markSupported()) {
            gZIPInputStream = new BufferedInputStream(gZIPInputStream);
        }
        try {
            gZIPInputStream.mark(3);
            int read = gZIPInputStream.read() + (gZIPInputStream.read() << 8);
            gZIPInputStream.reset();
            if (read == 35615) {
                gZIPInputStream = new GZIPInputStream(gZIPInputStream);
            }
        } catch (IOException unused) {
        }
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            xMLReader.setContentHandler(this);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", this);
            xMLReader.parse(new InputSource(gZIPInputStream));
            try {
                gZIPInputStream.close();
            } catch (IOException unused2) {
            }
            return this.svgDocument;
        } catch (IOException e) {
            throw new SVGParseException("File error", e);
        } catch (ParserConfigurationException e2) {
            throw new SVGParseException("XML Parser problem", e2);
        } catch (SAXException e3) {
            StringBuilder sb = new StringBuilder("SVG parse error: ");
            sb.append(e3.getMessage());
            throw new SVGParseException(sb.toString(), e3);
        } catch (Throwable th) {
            try {
                gZIPInputStream.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }

    public final void startDocument() throws SAXException {
        super.startDocument();
        this.svgDocument = new SVG();
    }

    public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        super.startElement(str, str2, str3, attributes);
        if (this.ignoring) {
            this.ignoreDepth++;
        } else if (!SVG_NAMESPACE.equals(str) && !"".equals(str)) {
        } else {
            if (str2.equals(TAG_SVG)) {
                svg(attributes);
            } else if (str2.equals(TAG_G)) {
                g(attributes);
            } else if (str2.equals(TAG_DEFS)) {
                defs(attributes);
            } else if (str2.equals(TAG_USE)) {
                use(attributes);
            } else if (str2.equals("path")) {
                path(attributes);
            } else if (str2.equals(TAG_RECT)) {
                rect(attributes);
            } else if (str2.equals(TAG_CIRCLE)) {
                circle(attributes);
            } else if (str2.equals(TAG_ELLIPSE)) {
                ellipse(attributes);
            } else if (str2.equals("line")) {
                line(attributes);
            } else if (str2.equals(TAG_POLYLINE)) {
                polyline(attributes);
            } else if (str2.equals(TAG_POLYGON)) {
                polygon(attributes);
            } else if (str2.equals("text")) {
                text(attributes);
            } else if (str2.equals(TAG_TSPAN)) {
                tspan(attributes);
            } else if (str2.equals(TAG_TREF)) {
                tref(attributes);
            } else if (str2.equals(TAG_SWITCH)) {
                zwitch(attributes);
            } else if (str2.equals("symbol")) {
                symbol(attributes);
            } else if (str2.equals(TAG_MARKER)) {
                marker(attributes);
            } else if (str2.equals(TAG_LINEARGRADIENT)) {
                linearGradient(attributes);
            } else if (str2.equals(TAG_RADIALGRADIENT)) {
                radialGradient(attributes);
            } else if (str2.equals(TAG_STOP)) {
                stop(attributes);
            } else if (str2.equals(TAG_A)) {
                g(attributes);
            } else if (str2.equals("title") || str2.equals("desc")) {
                this.inMetadataElement = true;
                this.metadataTag = str2;
            } else if (str2.equals(TAG_CLIPPATH)) {
                clipPath(attributes);
            } else if (str2.equals(TAG_TEXTPATH)) {
                textPath(attributes);
            } else if (str2.equals(TAG_PATTERN)) {
                pattern(attributes);
            } else if (str2.equals("image")) {
                image(attributes);
            } else if (str2.equals(TAG_VIEW)) {
                view(attributes);
            } else if (str2.equals(TAG_MASK)) {
                mask(attributes);
            } else if (str2.equals("style")) {
                style(attributes);
            } else if (str2.equals(TAG_SOLIDCOLOR)) {
                solidColor(attributes);
            } else {
                this.ignoring = true;
                this.ignoreDepth = 1;
            }
        }
    }

    public final void characters(char[] cArr, int i, int i2) throws SAXException {
        SVG.ICustomTabsCallback.Stub.Proxy proxy;
        if (!this.ignoring) {
            if (this.inMetadataElement) {
                if (this.metadataElementContents == null) {
                    this.metadataElementContents = new StringBuilder(i2);
                }
                this.metadataElementContents.append(cArr, i, i2);
            } else if (this.inStyleElement) {
                if (this.styleElementContents == null) {
                    this.styleElementContents = new StringBuilder(i2);
                }
                this.styleElementContents.append(cArr, i, i2);
            } else {
                SVG.onTransact ontransact = this.currentElement;
                if (ontransact instanceof SVG.validateRelationship) {
                    SVG.asBinder asbinder = (SVG.asBinder) ontransact;
                    int size = asbinder.children.size();
                    if (size == 0) {
                        proxy = null;
                    } else {
                        proxy = asbinder.children.get(size - 1);
                    }
                    if (proxy instanceof SVG.IPostMessageService) {
                        SVG.IPostMessageService iPostMessageService = (SVG.IPostMessageService) proxy;
                        StringBuilder sb = new StringBuilder(String.valueOf(iPostMessageService.text));
                        sb.append(new String(cArr, i, i2));
                        iPostMessageService.text = sb.toString();
                        return;
                    }
                    ((SVG.asBinder) this.currentElement).addChild(new SVG.IPostMessageService(new String(cArr, i, i2)));
                }
            }
        }
    }

    public final void comment(char[] cArr, int i, int i2) throws SAXException {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(877457251, oncanceled);
            onCancelLoad.getMin(877457251, oncanceled);
        }
        if (!this.ignoring && this.inStyleElement) {
            if (this.styleElementContents == null) {
                this.styleElementContents = new StringBuilder(i2);
            }
            this.styleElementContents.append(cArr, i, i2);
        }
    }

    public final void endElement(String str, String str2, String str3) throws SAXException {
        StringBuilder sb;
        super.endElement(str, str2, str3);
        if (this.ignoring) {
            int i = this.ignoreDepth - 1;
            this.ignoreDepth = i;
            if (i == 0) {
                this.ignoring = false;
                return;
            }
        }
        if (!SVG_NAMESPACE.equals(str) && !"".equals(str)) {
            return;
        }
        if (str2.equals("title") || str2.equals("desc")) {
            this.inMetadataElement = false;
            if (this.metadataTag.equals("title")) {
                this.svgDocument.setTitle(this.metadataElementContents.toString());
            } else if (this.metadataTag.equals("desc")) {
                this.svgDocument.setDesc(this.metadataElementContents.toString());
            }
            this.metadataElementContents.setLength(0);
        } else if (str2.equals("style") && (sb = this.styleElementContents) != null) {
            this.inStyleElement = false;
            parseCSSStyleSheet(sb.toString());
            this.styleElementContents.setLength(0);
        } else if (str2.equals(TAG_SVG) || str2.equals(TAG_DEFS) || str2.equals(TAG_G) || str2.equals(TAG_USE) || str2.equals("image") || str2.equals("text") || str2.equals(TAG_TSPAN) || str2.equals(TAG_SWITCH) || str2.equals("symbol") || str2.equals(TAG_MARKER) || str2.equals(TAG_LINEARGRADIENT) || str2.equals(TAG_RADIALGRADIENT) || str2.equals(TAG_STOP) || str2.equals(TAG_CLIPPATH) || str2.equals(TAG_TEXTPATH) || str2.equals(TAG_PATTERN) || str2.equals(TAG_VIEW) || str2.equals(TAG_MASK) || str2.equals(TAG_SOLIDCOLOR)) {
            this.currentElement = ((SVG.ICustomTabsCallback.Stub.Proxy) this.currentElement).parent;
        }
    }

    public final void endDocument() throws SAXException {
        super.endDocument();
    }

    private void dumpNode(SVG.ICustomTabsCallback.Stub.Proxy proxy, String str) {
        if (proxy instanceof SVG.asBinder) {
            StringBuilder sb = new StringBuilder(String.valueOf(str));
            sb.append("  ");
            String obj = sb.toString();
            for (SVG.ICustomTabsCallback.Stub.Proxy dumpNode : ((SVG.asBinder) proxy).children) {
                dumpNode(dumpNode, obj);
            }
        }
    }

    private void svg(Attributes attributes) throws SAXException {
        debug("<svg>", new Object[0]);
        SVG.extraCallback extracallback = new SVG.extraCallback();
        extracallback.document = this.svgDocument;
        extracallback.parent = this.currentElement;
        parseAttributesCore(extracallback, attributes);
        parseAttributesStyle(extracallback, attributes);
        parseAttributesConditional(extracallback, attributes);
        parseAttributesViewBox(extracallback, attributes);
        parseAttributesSVG(extracallback, attributes);
        SVG.onTransact ontransact = this.currentElement;
        if (ontransact == null) {
            this.svgDocument.setRootElement(extracallback);
        } else {
            ontransact.addChild(extracallback);
        }
        this.currentElement = extracallback;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseAttributesSVG(com.caverock.androidsvg.SVG.extraCallback r5, org.xml.sax.Attributes r6) throws org.xml.sax.SAXException {
        /*
            r4 = this;
            r0 = 0
        L_0x0001:
            int r1 = r6.getLength()
            if (r0 < r1) goto L_0x0008
            return
        L_0x0008:
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = $SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr()
            java.lang.String r3 = r6.getLocalName(r0)
            com.caverock.androidsvg.SVGParser$SVGAttr r3 = com.caverock.androidsvg.SVGParser.SVGAttr.fromString(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 26
            if (r2 == r3) goto L_0x0056
            r3 = 80
            if (r2 == r3) goto L_0x0053
            switch(r2) {
                case 82: goto L_0x003c;
                case 83: goto L_0x0035;
                case 84: goto L_0x002e;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0064
        L_0x002e:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r5.y = r1
            goto L_0x0064
        L_0x0035:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r5.x = r1
            goto L_0x0064
        L_0x003c:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r5.width = r1
            com.caverock.androidsvg.SVG$values r1 = r5.width
            boolean r1 = r1.isNegative()
            if (r1 != 0) goto L_0x004b
            goto L_0x0064
        L_0x004b:
            org.xml.sax.SAXException r5 = new org.xml.sax.SAXException
            java.lang.String r6 = "Invalid <svg> element. width cannot be negative"
            r5.<init>(r6)
            throw r5
        L_0x0053:
            r5.version = r1
            goto L_0x0064
        L_0x0056:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r5.height = r1
            com.caverock.androidsvg.SVG$values r1 = r5.height
            boolean r1 = r1.isNegative()
            if (r1 != 0) goto L_0x0067
        L_0x0064:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0067:
            org.xml.sax.SAXException r5 = new org.xml.sax.SAXException
            java.lang.String r6 = "Invalid <svg> element. height cannot be negative"
            r5.<init>(r6)
            goto L_0x0070
        L_0x006f:
            throw r5
        L_0x0070:
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseAttributesSVG(com.caverock.androidsvg.SVG$extraCallback, org.xml.sax.Attributes):void");
    }

    private void g(Attributes attributes) throws SAXException {
        debug("<g>", new Object[0]);
        if (this.currentElement != null) {
            SVG.toDoubleRange todoublerange = new SVG.toDoubleRange();
            todoublerange.document = this.svgDocument;
            todoublerange.parent = this.currentElement;
            parseAttributesCore(todoublerange, attributes);
            parseAttributesStyle(todoublerange, attributes);
            parseAttributesTransform(todoublerange, attributes);
            parseAttributesConditional(todoublerange, attributes);
            this.currentElement.addChild(todoublerange);
            this.currentElement = todoublerange;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    private void defs(Attributes attributes) throws SAXException {
        debug("<defs>", new Object[0]);
        if (this.currentElement != null) {
            SVG.IsOverlapping isOverlapping = new SVG.IsOverlapping();
            isOverlapping.document = this.svgDocument;
            isOverlapping.parent = this.currentElement;
            parseAttributesCore(isOverlapping, attributes);
            parseAttributesStyle(isOverlapping, attributes);
            parseAttributesTransform(isOverlapping, attributes);
            this.currentElement.addChild(isOverlapping);
            this.currentElement = isOverlapping;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    private void use(Attributes attributes) throws SAXException {
        debug("<use>", new Object[0]);
        if (this.currentElement != null) {
            SVG$ICustomTabsService$Stub$Proxy sVG$ICustomTabsService$Stub$Proxy = new SVG$ICustomTabsService$Stub$Proxy();
            sVG$ICustomTabsService$Stub$Proxy.document = this.svgDocument;
            sVG$ICustomTabsService$Stub$Proxy.parent = this.currentElement;
            parseAttributesCore(sVG$ICustomTabsService$Stub$Proxy, attributes);
            parseAttributesStyle(sVG$ICustomTabsService$Stub$Proxy, attributes);
            parseAttributesTransform(sVG$ICustomTabsService$Stub$Proxy, attributes);
            parseAttributesConditional(sVG$ICustomTabsService$Stub$Proxy, attributes);
            parseAttributesUse(sVG$ICustomTabsService$Stub$Proxy, attributes);
            this.currentElement.addChild(sVG$ICustomTabsService$Stub$Proxy);
            this.currentElement = sVG$ICustomTabsService$Stub$Proxy;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseAttributesUse(com.caverock.androidsvg.SVG$ICustomTabsService$Stub$Proxy r5, org.xml.sax.Attributes r6) throws org.xml.sax.SAXException {
        /*
            r4 = this;
            r0 = 0
        L_0x0001:
            int r1 = r6.getLength()
            if (r0 < r1) goto L_0x0008
            return
        L_0x0008:
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = $SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr()
            java.lang.String r3 = r6.getLocalName(r0)
            com.caverock.androidsvg.SVGParser$SVGAttr r3 = com.caverock.androidsvg.SVGParser.SVGAttr.fromString(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 26
            if (r2 == r3) goto L_0x0062
            r3 = 27
            if (r2 == r3) goto L_0x0053
            switch(r2) {
                case 82: goto L_0x003c;
                case 83: goto L_0x0035;
                case 84: goto L_0x002e;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0070
        L_0x002e:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r5.y = r1
            goto L_0x0070
        L_0x0035:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r5.x = r1
            goto L_0x0070
        L_0x003c:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r5.width = r1
            com.caverock.androidsvg.SVG$values r1 = r5.width
            boolean r1 = r1.isNegative()
            if (r1 != 0) goto L_0x004b
            goto L_0x0070
        L_0x004b:
            org.xml.sax.SAXException r5 = new org.xml.sax.SAXException
            java.lang.String r6 = "Invalid <use> element. width cannot be negative"
            r5.<init>(r6)
            throw r5
        L_0x0053:
            java.lang.String r2 = r6.getURI(r0)
            java.lang.String r3 = "http://www.w3.org/1999/xlink"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0070
            r5.href = r1
            goto L_0x0070
        L_0x0062:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r5.height = r1
            com.caverock.androidsvg.SVG$values r1 = r5.height
            boolean r1 = r1.isNegative()
            if (r1 != 0) goto L_0x0073
        L_0x0070:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0073:
            org.xml.sax.SAXException r5 = new org.xml.sax.SAXException
            java.lang.String r6 = "Invalid <use> element. height cannot be negative"
            r5.<init>(r6)
            goto L_0x007c
        L_0x007b:
            throw r5
        L_0x007c:
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseAttributesUse(com.caverock.androidsvg.SVG$ICustomTabsService$Stub$Proxy, org.xml.sax.Attributes):void");
    }

    private void image(Attributes attributes) throws SAXException {
        debug("<image>", new Object[0]);
        if (this.currentElement != null) {
            SVG.toString tostring = new SVG.toString();
            tostring.document = this.svgDocument;
            tostring.parent = this.currentElement;
            parseAttributesCore(tostring, attributes);
            parseAttributesStyle(tostring, attributes);
            parseAttributesTransform(tostring, attributes);
            parseAttributesConditional(tostring, attributes);
            parseAttributesImage(tostring, attributes);
            this.currentElement.addChild(tostring);
            this.currentElement = tostring;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0078, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseAttributesImage(com.caverock.androidsvg.SVG.toString r5, org.xml.sax.Attributes r6) throws org.xml.sax.SAXException {
        /*
            r4 = this;
            r0 = 0
        L_0x0001:
            int r1 = r6.getLength()
            if (r0 < r1) goto L_0x0008
            return
        L_0x0008:
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = $SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr()
            java.lang.String r3 = r6.getLocalName(r0)
            com.caverock.androidsvg.SVGParser$SVGAttr r3 = com.caverock.androidsvg.SVGParser.SVGAttr.fromString(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 26
            if (r2 == r3) goto L_0x006a
            r3 = 27
            if (r2 == r3) goto L_0x005b
            r3 = 49
            if (r2 == r3) goto L_0x0057
            switch(r2) {
                case 82: goto L_0x0040;
                case 83: goto L_0x0039;
                case 84: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0078
        L_0x0032:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r5.y = r1
            goto L_0x0078
        L_0x0039:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r5.x = r1
            goto L_0x0078
        L_0x0040:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r5.width = r1
            com.caverock.androidsvg.SVG$values r1 = r5.width
            boolean r1 = r1.isNegative()
            if (r1 != 0) goto L_0x004f
            goto L_0x0078
        L_0x004f:
            org.xml.sax.SAXException r5 = new org.xml.sax.SAXException
            java.lang.String r6 = "Invalid <use> element. width cannot be negative"
            r5.<init>(r6)
            throw r5
        L_0x0057:
            parsePreserveAspectRatio(r5, r1)
            goto L_0x0078
        L_0x005b:
            java.lang.String r2 = r6.getURI(r0)
            java.lang.String r3 = "http://www.w3.org/1999/xlink"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0078
            r5.href = r1
            goto L_0x0078
        L_0x006a:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r5.height = r1
            com.caverock.androidsvg.SVG$values r1 = r5.height
            boolean r1 = r1.isNegative()
            if (r1 != 0) goto L_0x007b
        L_0x0078:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x007b:
            org.xml.sax.SAXException r5 = new org.xml.sax.SAXException
            java.lang.String r6 = "Invalid <use> element. height cannot be negative"
            r5.<init>(r6)
            goto L_0x0084
        L_0x0083:
            throw r5
        L_0x0084:
            goto L_0x0083
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseAttributesImage(com.caverock.androidsvg.SVG$toString, org.xml.sax.Attributes):void");
    }

    private void path(Attributes attributes) throws SAXException {
        debug("<path>", new Object[0]);
        if (this.currentElement != null) {
            SVG.invokeSuspend invokesuspend = new SVG.invokeSuspend();
            invokesuspend.document = this.svgDocument;
            invokesuspend.parent = this.currentElement;
            parseAttributesCore(invokesuspend, attributes);
            parseAttributesStyle(invokesuspend, attributes);
            parseAttributesTransform(invokesuspend, attributes);
            parseAttributesConditional(invokesuspend, attributes);
            parseAttributesPath(invokesuspend, attributes);
            this.currentElement.addChild(invokesuspend);
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    private void parseAttributesPath(SVG.invokeSuspend invokesuspend, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = $SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr()[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 14) {
                invokesuspend.d = parsePath(trim);
            } else if (i2 != 44) {
                continue;
            } else {
                invokesuspend.pathLength = Float.valueOf(parseFloat(trim));
                if (invokesuspend.pathLength.floatValue() < 0.0f) {
                    throw new SAXException("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    private void rect(Attributes attributes) throws SAXException {
        debug("<rect>", new Object[0]);
        if (this.currentElement != null) {
            SVG.extraCallbackWithResult extracallbackwithresult = new SVG.extraCallbackWithResult();
            extracallbackwithresult.document = this.svgDocument;
            extracallbackwithresult.parent = this.currentElement;
            parseAttributesCore(extracallbackwithresult, attributes);
            parseAttributesStyle(extracallbackwithresult, attributes);
            parseAttributesTransform(extracallbackwithresult, attributes);
            parseAttributesConditional(extracallbackwithresult, attributes);
            parseAttributesRect(extracallbackwithresult, attributes);
            this.currentElement.addChild(extracallbackwithresult);
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0093, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseAttributesRect(com.caverock.androidsvg.SVG.extraCallbackWithResult r5, org.xml.sax.Attributes r6) throws org.xml.sax.SAXException {
        /*
            r4 = this;
            r0 = 0
        L_0x0001:
            int r1 = r6.getLength()
            if (r0 < r1) goto L_0x0008
            return
        L_0x0008:
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = $SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr()
            java.lang.String r3 = r6.getLocalName(r0)
            com.caverock.androidsvg.SVGParser$SVGAttr r3 = com.caverock.androidsvg.SVGParser.SVGAttr.fromString(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 26
            if (r2 == r3) goto L_0x0085
            r3 = 57
            if (r2 == r3) goto L_0x006e
            r3 = 58
            if (r2 == r3) goto L_0x0057
            switch(r2) {
                case 82: goto L_0x0040;
                case 83: goto L_0x0039;
                case 84: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0093
        L_0x0032:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r5.y = r1
            goto L_0x0093
        L_0x0039:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r5.x = r1
            goto L_0x0093
        L_0x0040:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r5.width = r1
            com.caverock.androidsvg.SVG$values r1 = r5.width
            boolean r1 = r1.isNegative()
            if (r1 != 0) goto L_0x004f
            goto L_0x0093
        L_0x004f:
            org.xml.sax.SAXException r5 = new org.xml.sax.SAXException
            java.lang.String r6 = "Invalid <rect> element. width cannot be negative"
            r5.<init>(r6)
            throw r5
        L_0x0057:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r5.ry = r1
            com.caverock.androidsvg.SVG$values r1 = r5.ry
            boolean r1 = r1.isNegative()
            if (r1 != 0) goto L_0x0066
            goto L_0x0093
        L_0x0066:
            org.xml.sax.SAXException r5 = new org.xml.sax.SAXException
            java.lang.String r6 = "Invalid <rect> element. ry cannot be negative"
            r5.<init>(r6)
            throw r5
        L_0x006e:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r5.rx = r1
            com.caverock.androidsvg.SVG$values r1 = r5.rx
            boolean r1 = r1.isNegative()
            if (r1 != 0) goto L_0x007d
            goto L_0x0093
        L_0x007d:
            org.xml.sax.SAXException r5 = new org.xml.sax.SAXException
            java.lang.String r6 = "Invalid <rect> element. rx cannot be negative"
            r5.<init>(r6)
            throw r5
        L_0x0085:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r5.height = r1
            com.caverock.androidsvg.SVG$values r1 = r5.height
            boolean r1 = r1.isNegative()
            if (r1 != 0) goto L_0x0097
        L_0x0093:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0097:
            org.xml.sax.SAXException r5 = new org.xml.sax.SAXException
            java.lang.String r6 = "Invalid <rect> element. height cannot be negative"
            r5.<init>(r6)
            goto L_0x00a0
        L_0x009f:
            throw r5
        L_0x00a0:
            goto L_0x009f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseAttributesRect(com.caverock.androidsvg.SVG$extraCallbackWithResult, org.xml.sax.Attributes):void");
    }

    private void circle(Attributes attributes) throws SAXException {
        debug("<circle>", new Object[0]);
        if (this.currentElement != null) {
            SVG.getMax getmax = new SVG.getMax();
            getmax.document = this.svgDocument;
            getmax.parent = this.currentElement;
            parseAttributesCore(getmax, attributes);
            parseAttributesStyle(getmax, attributes);
            parseAttributesTransform(getmax, attributes);
            parseAttributesConditional(getmax, attributes);
            parseAttributesCircle(getmax, attributes);
            this.currentElement.addChild(getmax);
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    private void parseAttributesCircle(SVG.getMax getmax, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = $SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr()[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 7) {
                getmax.cx = parseLength(trim);
            } else if (i2 == 8) {
                getmax.cy = parseLength(trim);
            } else if (i2 != 50) {
                continue;
            } else {
                getmax.r = parseLength(trim);
                if (getmax.r.isNegative()) {
                    throw new SAXException("Invalid <circle> element. r cannot be negative");
                }
            }
        }
    }

    private void ellipse(Attributes attributes) throws SAXException {
        debug("<ellipse>", new Object[0]);
        if (this.currentElement != null) {
            SVG.equals equals = new SVG.equals();
            equals.document = this.svgDocument;
            equals.parent = this.currentElement;
            parseAttributesCore(equals, attributes);
            parseAttributesStyle(equals, attributes);
            parseAttributesTransform(equals, attributes);
            parseAttributesConditional(equals, attributes);
            parseAttributesEllipse(equals, attributes);
            this.currentElement.addChild(equals);
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    private void parseAttributesEllipse(SVG.equals equals, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = $SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr()[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 7) {
                equals.cx = parseLength(trim);
            } else if (i2 == 8) {
                equals.cy = parseLength(trim);
            } else if (i2 == 57) {
                equals.rx = parseLength(trim);
                if (equals.rx.isNegative()) {
                    throw new SAXException("Invalid <ellipse> element. rx cannot be negative");
                }
            } else if (i2 != 58) {
                continue;
            } else {
                equals.ry = parseLength(trim);
                if (equals.ry.isNegative()) {
                    throw new SAXException("Invalid <ellipse> element. ry cannot be negative");
                }
            }
        }
    }

    private void line(Attributes attributes) throws SAXException {
        debug("<line>", new Object[0]);
        if (this.currentElement != null) {
            SVG$FastBitmap$CoordinateSystem sVG$FastBitmap$CoordinateSystem = new SVG$FastBitmap$CoordinateSystem();
            sVG$FastBitmap$CoordinateSystem.document = this.svgDocument;
            sVG$FastBitmap$CoordinateSystem.parent = this.currentElement;
            parseAttributesCore(sVG$FastBitmap$CoordinateSystem, attributes);
            parseAttributesStyle(sVG$FastBitmap$CoordinateSystem, attributes);
            parseAttributesTransform(sVG$FastBitmap$CoordinateSystem, attributes);
            parseAttributesConditional(sVG$FastBitmap$CoordinateSystem, attributes);
            parseAttributesLine(sVG$FastBitmap$CoordinateSystem, attributes);
            this.currentElement.addChild(sVG$FastBitmap$CoordinateSystem);
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    private void parseAttributesLine(SVG$FastBitmap$CoordinateSystem sVG$FastBitmap$CoordinateSystem, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch ($SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr()[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 85:
                    sVG$FastBitmap$CoordinateSystem.x1 = parseLength(trim);
                    break;
                case 86:
                    sVG$FastBitmap$CoordinateSystem.y1 = parseLength(trim);
                    break;
                case 87:
                    sVG$FastBitmap$CoordinateSystem.x2 = parseLength(trim);
                    break;
                case 88:
                    sVG$FastBitmap$CoordinateSystem.y2 = parseLength(trim);
                    break;
            }
        }
    }

    private void polyline(Attributes attributes) throws SAXException {
        debug("<polyline>", new Object[0]);
        if (this.currentElement != null) {
            SVG.onNavigationEvent onnavigationevent = new SVG.onNavigationEvent();
            onnavigationevent.document = this.svgDocument;
            onnavigationevent.parent = this.currentElement;
            parseAttributesCore(onnavigationevent, attributes);
            parseAttributesStyle(onnavigationevent, attributes);
            parseAttributesTransform(onnavigationevent, attributes);
            parseAttributesConditional(onnavigationevent, attributes);
            parseAttributesPolyLine(onnavigationevent, attributes, TAG_POLYLINE);
            this.currentElement.addChild(onnavigationevent);
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    private void parseAttributesPolyLine(SVG.onNavigationEvent onnavigationevent, Attributes attributes, String str) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.points) {
                setMax setmax = new setMax(attributes.getValue(i));
                ArrayList<Float> arrayList = new ArrayList<>();
                setmax.skipWhitespace();
                while (!setmax.empty()) {
                    Float nextFloat = setmax.nextFloat();
                    if (nextFloat != null) {
                        setmax.skipCommaWhitespace();
                        Float nextFloat2 = setmax.nextFloat();
                        if (nextFloat2 != null) {
                            setmax.skipCommaWhitespace();
                            arrayList.add(nextFloat);
                            arrayList.add(nextFloat2);
                        } else {
                            StringBuilder sb = new StringBuilder("Invalid <");
                            sb.append(str);
                            sb.append("> points attribute. There should be an even number of coordinates.");
                            throw new SAXException(sb.toString());
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder("Invalid <");
                        sb2.append(str);
                        sb2.append("> points attribute. Non-coordinate content found in list.");
                        throw new SAXException(sb2.toString());
                    }
                }
                onnavigationevent.points = new float[arrayList.size()];
                int i2 = 0;
                for (Float floatValue : arrayList) {
                    onnavigationevent.points[i2] = floatValue.floatValue();
                    i2++;
                }
            }
        }
    }

    private void polygon(Attributes attributes) throws SAXException {
        debug("<polygon>", new Object[0]);
        if (this.currentElement != null) {
            SVG.b bVar = new SVG.b();
            bVar.document = this.svgDocument;
            bVar.parent = this.currentElement;
            parseAttributesCore(bVar, attributes);
            parseAttributesStyle(bVar, attributes);
            parseAttributesTransform(bVar, attributes);
            parseAttributesConditional(bVar, attributes);
            parseAttributesPolyLine(bVar, attributes, TAG_POLYGON);
            this.currentElement.addChild(bVar);
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    private void text(Attributes attributes) throws SAXException {
        debug("<text>", new Object[0]);
        if (this.currentElement != null) {
            SVG.postMessage postmessage = new SVG.postMessage();
            postmessage.document = this.svgDocument;
            postmessage.parent = this.currentElement;
            parseAttributesCore(postmessage, attributes);
            parseAttributesStyle(postmessage, attributes);
            parseAttributesTransform(postmessage, attributes);
            parseAttributesConditional(postmessage, attributes);
            parseAttributesTextPosition(postmessage, attributes);
            this.currentElement.addChild(postmessage);
            this.currentElement = postmessage;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    private void parseAttributesTextPosition(SVG.requestPostMessageChannel requestpostmessagechannel, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = $SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr()[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 10) {
                requestpostmessagechannel.dx = parseLengthList(trim);
            } else if (i2 == 11) {
                requestpostmessagechannel.dy = parseLengthList(trim);
            } else if (i2 == 83) {
                requestpostmessagechannel.x = parseLengthList(trim);
            } else if (i2 == 84) {
                requestpostmessagechannel.y = parseLengthList(trim);
            }
        }
    }

    private void tspan(Attributes attributes) throws SAXException {
        debug("<tspan>", new Object[0]);
        SVG.onTransact ontransact = this.currentElement;
        if (ontransact == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        } else if (ontransact instanceof SVG.validateRelationship) {
            SVG.newSession newsession = new SVG.newSession();
            newsession.document = this.svgDocument;
            newsession.parent = this.currentElement;
            parseAttributesCore(newsession, attributes);
            parseAttributesStyle(newsession, attributes);
            parseAttributesConditional(newsession, attributes);
            parseAttributesTextPosition(newsession, attributes);
            this.currentElement.addChild(newsession);
            this.currentElement = newsession;
            if (newsession.parent instanceof SVG.receiveFile) {
                newsession.setTextRoot((SVG.receiveFile) newsession.parent);
            } else {
                newsession.setTextRoot(((SVG.requestPostMessageChannelWithExtras) newsession.parent).getTextRoot());
            }
        } else {
            throw new SAXException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
    }

    private void tref(Attributes attributes) throws SAXException {
        debug("<tref>", new Object[0]);
        SVG.onTransact ontransact = this.currentElement;
        if (ontransact == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        } else if (ontransact instanceof SVG.validateRelationship) {
            SVG.extraCommand extracommand = new SVG.extraCommand();
            extracommand.document = this.svgDocument;
            extracommand.parent = this.currentElement;
            parseAttributesCore(extracommand, attributes);
            parseAttributesStyle(extracommand, attributes);
            parseAttributesConditional(extracommand, attributes);
            parseAttributesTRef(extracommand, attributes);
            this.currentElement.addChild(extracommand);
            if (extracommand.parent instanceof SVG.receiveFile) {
                extracommand.setTextRoot((SVG.receiveFile) extracommand.parent);
            } else {
                extracommand.setTextRoot(((SVG.requestPostMessageChannelWithExtras) extracommand.parent).getTextRoot());
            }
        } else {
            throw new SAXException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
    }

    private void parseAttributesTRef(SVG.extraCommand extracommand, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if ($SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr()[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()] == 27 && XLINK_NAMESPACE.equals(attributes.getURI(i))) {
                extracommand.href = trim;
            }
        }
    }

    private void zwitch(Attributes attributes) throws SAXException {
        debug("<switch>", new Object[0]);
        if (this.currentElement != null) {
            SVG.warmup warmup = new SVG.warmup();
            warmup.document = this.svgDocument;
            warmup.parent = this.currentElement;
            parseAttributesCore(warmup, attributes);
            parseAttributesStyle(warmup, attributes);
            parseAttributesTransform(warmup, attributes);
            parseAttributesConditional(warmup, attributes);
            this.currentElement.addChild(warmup);
            this.currentElement = warmup;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    private void parseAttributesConditional(SVG.onPostMessage onpostmessage, Attributes attributes) throws SAXException {
        HashSet hashSet;
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = $SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr()[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 != 74) {
                switch (i2) {
                    case 53:
                        onpostmessage.setRequiredFeatures(parseRequiredFeatures(trim));
                        break;
                    case 54:
                        onpostmessage.setRequiredExtensions(trim);
                        break;
                    case 55:
                        onpostmessage.setRequiredFormats(parseRequiredFormats(trim));
                        break;
                    case 56:
                        List<String> parseFontFamily = parseFontFamily(trim);
                        if (parseFontFamily == null) {
                            hashSet = new HashSet(0);
                        }
                        onpostmessage.setRequiredFonts(hashSet);
                        break;
                }
            } else {
                onpostmessage.setSystemLanguage(parseSystemLanguage(trim));
            }
        }
    }

    private void symbol(Attributes attributes) throws SAXException {
        debug("<symbol>", new Object[0]);
        if (this.currentElement != null) {
            SVG.newSessionWithExtras newsessionwithextras = new SVG.newSessionWithExtras();
            newsessionwithextras.document = this.svgDocument;
            newsessionwithextras.parent = this.currentElement;
            parseAttributesCore(newsessionwithextras, attributes);
            parseAttributesStyle(newsessionwithextras, attributes);
            parseAttributesConditional(newsessionwithextras, attributes);
            parseAttributesViewBox(newsessionwithextras, attributes);
            this.currentElement.addChild(newsessionwithextras);
            this.currentElement = newsessionwithextras;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    private void marker(Attributes attributes) throws SAXException {
        debug("<marker>", new Object[0]);
        if (this.currentElement != null) {
            SVG.valueOf valueof = new SVG.valueOf();
            valueof.document = this.svgDocument;
            valueof.parent = this.currentElement;
            parseAttributesCore(valueof, attributes);
            parseAttributesStyle(valueof, attributes);
            parseAttributesConditional(valueof, attributes);
            parseAttributesViewBox(valueof, attributes);
            parseAttributesMarker(valueof, attributes);
            this.currentElement.addChild(valueof);
            this.currentElement = valueof;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ac, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseAttributesMarker(com.caverock.androidsvg.SVG.valueOf r6, org.xml.sax.Attributes r7) throws org.xml.sax.SAXException {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            int r2 = r7.getLength()
            if (r1 < r2) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r2 = r7.getValue(r1)
            java.lang.String r2 = r2.trim()
            int[] r3 = $SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr()
            java.lang.String r4 = r7.getLocalName(r1)
            com.caverock.androidsvg.SVGParser$SVGAttr r4 = com.caverock.androidsvg.SVGParser.SVGAttr.fromString(r4)
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 42
            if (r3 == r4) goto L_0x0091
            r4 = 51
            if (r3 == r4) goto L_0x008a
            r4 = 52
            if (r3 == r4) goto L_0x0083
            switch(r3) {
                case 33: goto L_0x006c;
                case 34: goto L_0x004b;
                case 35: goto L_0x0034;
                default: goto L_0x0032;
            }
        L_0x0032:
            goto L_0x00ac
        L_0x0034:
            com.caverock.androidsvg.SVG$values r2 = parseLength(r2)
            r6.markerWidth = r2
            com.caverock.androidsvg.SVG$values r2 = r6.markerWidth
            boolean r2 = r2.isNegative()
            if (r2 != 0) goto L_0x0043
            goto L_0x00ac
        L_0x0043:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r7 = "Invalid <marker> element. markerWidth cannot be negative"
            r6.<init>(r7)
            throw r6
        L_0x004b:
            java.lang.String r3 = "strokeWidth"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x0057
            r6.markerUnitsAreUser = r0
            goto L_0x00ac
        L_0x0057:
            java.lang.String r3 = "userSpaceOnUse"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0064
            r2 = 1
            r6.markerUnitsAreUser = r2
            goto L_0x00ac
        L_0x0064:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r7 = "Invalid value for attribute markerUnits"
            r6.<init>(r7)
            throw r6
        L_0x006c:
            com.caverock.androidsvg.SVG$values r2 = parseLength(r2)
            r6.markerHeight = r2
            com.caverock.androidsvg.SVG$values r2 = r6.markerHeight
            boolean r2 = r2.isNegative()
            if (r2 != 0) goto L_0x007b
            goto L_0x00ac
        L_0x007b:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r7 = "Invalid <marker> element. markerHeight cannot be negative"
            r6.<init>(r7)
            throw r6
        L_0x0083:
            com.caverock.androidsvg.SVG$values r2 = parseLength(r2)
            r6.refY = r2
            goto L_0x00ac
        L_0x008a:
            com.caverock.androidsvg.SVG$values r2 = parseLength(r2)
            r6.refX = r2
            goto L_0x00ac
        L_0x0091:
            java.lang.String r3 = "auto"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x00a2
            r2 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r6.orient = r2
            goto L_0x00ac
        L_0x00a2:
            float r2 = parseFloat(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r6.orient = r2
        L_0x00ac:
            int r1 = r1 + 1
            goto L_0x0002
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseAttributesMarker(com.caverock.androidsvg.SVG$valueOf, org.xml.sax.Attributes):void");
    }

    private void linearGradient(Attributes attributes) throws SAXException {
        debug("<linearGradiant>", new Object[0]);
        if (this.currentElement != null) {
            SVG.ICustomTabsService iCustomTabsService = new SVG.ICustomTabsService();
            iCustomTabsService.document = this.svgDocument;
            iCustomTabsService.parent = this.currentElement;
            parseAttributesCore(iCustomTabsService, attributes);
            parseAttributesStyle(iCustomTabsService, attributes);
            parseAttributesGradient(iCustomTabsService, attributes);
            parseAttributesLinearGradient(iCustomTabsService, attributes);
            this.currentElement.addChild(iCustomTabsService);
            this.currentElement = iCustomTabsService;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    private void parseAttributesGradient(SVG.isInside isinside, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = $SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr()[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 24) {
                isinside.gradientTransform = parseTransformList(trim);
            } else if (i2 != 25) {
                if (i2 != 27) {
                    if (i2 == 61) {
                        try {
                            isinside.spreadMethod = SVG.GradientSpread.valueOf(trim);
                        } catch (IllegalArgumentException unused) {
                            StringBuilder sb = new StringBuilder("Invalid spreadMethod attribute. \"");
                            sb.append(trim);
                            sb.append("\" is not a valid value.");
                            throw new SAXException(sb.toString());
                        }
                    }
                } else if (XLINK_NAMESPACE.equals(attributes.getURI(i))) {
                    isinside.href = trim;
                }
            } else if ("objectBoundingBox".equals(trim)) {
                isinside.gradientUnitsAreUser = Boolean.FALSE;
            } else if ("userSpaceOnUse".equals(trim)) {
                isinside.gradientUnitsAreUser = Boolean.TRUE;
            } else {
                throw new SAXException("Invalid value for attribute gradientUnits");
            }
        }
    }

    private void parseAttributesLinearGradient(SVG.ICustomTabsService iCustomTabsService, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch ($SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr()[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 85:
                    iCustomTabsService.x1 = parseLength(trim);
                    break;
                case 86:
                    iCustomTabsService.y1 = parseLength(trim);
                    break;
                case 87:
                    iCustomTabsService.x2 = parseLength(trim);
                    break;
                case 88:
                    iCustomTabsService.y2 = parseLength(trim);
                    break;
            }
        }
    }

    private void radialGradient(Attributes attributes) throws SAXException {
        debug("<radialGradient>", new Object[0]);
        if (this.currentElement != null) {
            SVG.getInterfaceDescriptor getinterfacedescriptor = new SVG.getInterfaceDescriptor();
            getinterfacedescriptor.document = this.svgDocument;
            getinterfacedescriptor.parent = this.currentElement;
            parseAttributesCore(getinterfacedescriptor, attributes);
            parseAttributesStyle(getinterfacedescriptor, attributes);
            parseAttributesGradient(getinterfacedescriptor, attributes);
            parseAttributesRadialGradient(getinterfacedescriptor, attributes);
            this.currentElement.addChild(getinterfacedescriptor);
            this.currentElement = getinterfacedescriptor;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    private void parseAttributesRadialGradient(SVG.getInterfaceDescriptor getinterfacedescriptor, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = $SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr()[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 7) {
                getinterfacedescriptor.cx = parseLength(trim);
            } else if (i2 == 8) {
                getinterfacedescriptor.cy = parseLength(trim);
            } else if (i2 == 12) {
                getinterfacedescriptor.fx = parseLength(trim);
            } else if (i2 == 13) {
                getinterfacedescriptor.fy = parseLength(trim);
            } else if (i2 != 50) {
                continue;
            } else {
                getinterfacedescriptor.r = parseLength(trim);
                if (getinterfacedescriptor.r.isNegative()) {
                    throw new SAXException("Invalid <radialGradient> element. r cannot be negative");
                }
            }
        }
    }

    private void stop(Attributes attributes) throws SAXException {
        debug("<stop>", new Object[0]);
        SVG.onTransact ontransact = this.currentElement;
        if (ontransact == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        } else if (ontransact instanceof SVG.isInside) {
            SVG.onMessageChannelReady onmessagechannelready = new SVG.onMessageChannelReady();
            onmessagechannelready.document = this.svgDocument;
            onmessagechannelready.parent = this.currentElement;
            parseAttributesCore(onmessagechannelready, attributes);
            parseAttributesStyle(onmessagechannelready, attributes);
            parseAttributesStop(onmessagechannelready, attributes);
            this.currentElement.addChild(onmessagechannelready);
            this.currentElement = onmessagechannelready;
        } else {
            throw new SAXException("Invalid document. <stop> elements are only valid inside <linearGradiant> or <radialGradient> elements.");
        }
    }

    private void parseAttributesStop(SVG.onMessageChannelReady onmessagechannelready, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if ($SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr()[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()] == 40) {
                onmessagechannelready.offset = parseGradiantOffset(trim);
            }
        }
    }

    private Float parseGradiantOffset(String str) throws SAXException {
        if (str.length() != 0) {
            int length = str.length();
            boolean z = true;
            if (str.charAt(str.length() - 1) == '%') {
                length--;
            } else {
                z = false;
            }
            try {
                float parseFloat = Float.parseFloat(str.substring(0, length));
                float f = 100.0f;
                if (z) {
                    parseFloat /= 100.0f;
                }
                if (parseFloat < 0.0f) {
                    f = 0.0f;
                } else if (parseFloat <= 100.0f) {
                    f = parseFloat;
                }
                return Float.valueOf(f);
            } catch (NumberFormatException e) {
                throw new SAXException("Invalid offset value in <stop>: ".concat(String.valueOf(str)), e);
            }
        } else {
            throw new SAXException("Invalid offset value in <stop> (empty string)");
        }
    }

    private void solidColor(Attributes attributes) throws SAXException {
        debug("<solidColor>", new Object[0]);
        if (this.currentElement != null) {
            SVG.onRelationshipValidationResult onrelationshipvalidationresult = new SVG.onRelationshipValidationResult();
            onrelationshipvalidationresult.document = this.svgDocument;
            onrelationshipvalidationresult.parent = this.currentElement;
            parseAttributesCore(onrelationshipvalidationresult, attributes);
            parseAttributesStyle(onrelationshipvalidationresult, attributes);
            this.currentElement.addChild(onrelationshipvalidationresult);
            this.currentElement = onrelationshipvalidationresult;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    private void clipPath(Attributes attributes) throws SAXException {
        debug("<clipPath>", new Object[0]);
        if (this.currentElement != null) {
            SVG.setMin setmin = new SVG.setMin();
            setmin.document = this.svgDocument;
            setmin.parent = this.currentElement;
            parseAttributesCore(setmin, attributes);
            parseAttributesStyle(setmin, attributes);
            parseAttributesTransform(setmin, attributes);
            parseAttributesConditional(setmin, attributes);
            parseAttributesClipPath(setmin, attributes);
            this.currentElement.addChild(setmin);
            this.currentElement = setmin;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    private void parseAttributesClipPath(SVG.setMin setmin, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if ($SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr()[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()] == 4) {
                if ("objectBoundingBox".equals(trim)) {
                    setmin.clipPathUnitsAreUser = Boolean.FALSE;
                } else if ("userSpaceOnUse".equals(trim)) {
                    setmin.clipPathUnitsAreUser = Boolean.TRUE;
                } else {
                    throw new SAXException("Invalid value for attribute clipPathUnits");
                }
            }
        }
    }

    private void textPath(Attributes attributes) throws SAXException {
        debug("<textPath>", new Object[0]);
        if (this.currentElement != null) {
            SVG.updateVisuals updatevisuals = new SVG.updateVisuals();
            updatevisuals.document = this.svgDocument;
            updatevisuals.parent = this.currentElement;
            parseAttributesCore(updatevisuals, attributes);
            parseAttributesStyle(updatevisuals, attributes);
            parseAttributesConditional(updatevisuals, attributes);
            parseAttributesTextPath(updatevisuals, attributes);
            this.currentElement.addChild(updatevisuals);
            this.currentElement = updatevisuals;
            if (updatevisuals.parent instanceof SVG.receiveFile) {
                updatevisuals.setTextRoot((SVG.receiveFile) updatevisuals.parent);
            } else {
                updatevisuals.setTextRoot(((SVG.requestPostMessageChannelWithExtras) updatevisuals.parent).getTextRoot());
            }
        } else {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
    }

    private void parseAttributesTextPath(SVG.updateVisuals updatevisuals, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = $SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr()[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 != 27) {
                if (i2 == 62) {
                    updatevisuals.startOffset = parseLength(trim);
                }
            } else if (XLINK_NAMESPACE.equals(attributes.getURI(i))) {
                updatevisuals.href = trim;
            }
        }
    }

    private void pattern(Attributes attributes) throws SAXException {
        debug("<pattern>", new Object[0]);
        if (this.currentElement != null) {
            SVG.ICustomTabsCallback iCustomTabsCallback = new SVG.ICustomTabsCallback();
            iCustomTabsCallback.document = this.svgDocument;
            iCustomTabsCallback.parent = this.currentElement;
            parseAttributesCore(iCustomTabsCallback, attributes);
            parseAttributesStyle(iCustomTabsCallback, attributes);
            parseAttributesConditional(iCustomTabsCallback, attributes);
            parseAttributesViewBox(iCustomTabsCallback, attributes);
            parseAttributesPattern(iCustomTabsCallback, attributes);
            this.currentElement.addChild(iCustomTabsCallback);
            this.currentElement = iCustomTabsCallback;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00be, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseAttributesPattern(com.caverock.androidsvg.SVG.ICustomTabsCallback r6, org.xml.sax.Attributes r7) throws org.xml.sax.SAXException {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            int r1 = r7.getLength()
            if (r0 < r1) goto L_0x0008
            return
        L_0x0008:
            java.lang.String r1 = r7.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = $SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr()
            java.lang.String r3 = r7.getLocalName(r0)
            com.caverock.androidsvg.SVGParser$SVGAttr r3 = com.caverock.androidsvg.SVGParser.SVGAttr.fromString(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 26
            if (r2 == r3) goto L_0x00b0
            r3 = 27
            if (r2 == r3) goto L_0x00a1
            java.lang.String r3 = "userSpaceOnUse"
            java.lang.String r4 = "objectBoundingBox"
            switch(r2) {
                case 45: goto L_0x0083;
                case 46: goto L_0x007c;
                case 47: goto L_0x005e;
                default: goto L_0x0032;
            }
        L_0x0032:
            switch(r2) {
                case 82: goto L_0x0047;
                case 83: goto L_0x003f;
                case 84: goto L_0x0037;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x00be
        L_0x0037:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r6.y = r1
            goto L_0x00be
        L_0x003f:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r6.x = r1
            goto L_0x00be
        L_0x0047:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r6.width = r1
            com.caverock.androidsvg.SVG$values r1 = r6.width
            boolean r1 = r1.isNegative()
            if (r1 != 0) goto L_0x0056
            goto L_0x00be
        L_0x0056:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r7 = "Invalid <pattern> element. width cannot be negative"
            r6.<init>(r7)
            throw r6
        L_0x005e:
            boolean r2 = r4.equals(r1)
            if (r2 == 0) goto L_0x0069
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r6.patternUnitsAreUser = r1
            goto L_0x00be
        L_0x0069:
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0074
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.patternUnitsAreUser = r1
            goto L_0x00be
        L_0x0074:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r7 = "Invalid value for attribute patternUnits"
            r6.<init>(r7)
            throw r6
        L_0x007c:
            android.graphics.Matrix r1 = r5.parseTransformList(r1)
            r6.patternTransform = r1
            goto L_0x00be
        L_0x0083:
            boolean r2 = r4.equals(r1)
            if (r2 == 0) goto L_0x008e
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r6.patternContentUnitsAreUser = r1
            goto L_0x00be
        L_0x008e:
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0099
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.patternContentUnitsAreUser = r1
            goto L_0x00be
        L_0x0099:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r7 = "Invalid value for attribute patternContentUnits"
            r6.<init>(r7)
            throw r6
        L_0x00a1:
            java.lang.String r2 = r7.getURI(r0)
            java.lang.String r3 = "http://www.w3.org/1999/xlink"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00be
            r6.href = r1
            goto L_0x00be
        L_0x00b0:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r6.height = r1
            com.caverock.androidsvg.SVG$values r1 = r6.height
            boolean r1 = r1.isNegative()
            if (r1 != 0) goto L_0x00c2
        L_0x00be:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x00c2:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r7 = "Invalid <pattern> element. height cannot be negative"
            r6.<init>(r7)
            goto L_0x00cb
        L_0x00ca:
            throw r6
        L_0x00cb:
            goto L_0x00ca
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseAttributesPattern(com.caverock.androidsvg.SVG$ICustomTabsCallback, org.xml.sax.Attributes):void");
    }

    private void view(Attributes attributes) throws SAXException {
        debug("<view>", new Object[0]);
        if (this.currentElement != null) {
            SVG.ICustomTabsService.Default defaultR = new SVG.ICustomTabsService.Default();
            defaultR.document = this.svgDocument;
            defaultR.parent = this.currentElement;
            parseAttributesCore(defaultR, attributes);
            parseAttributesConditional(defaultR, attributes);
            parseAttributesViewBox(defaultR, attributes);
            this.currentElement.addChild(defaultR);
            this.currentElement = defaultR;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    private void mask(Attributes attributes) throws SAXException {
        debug("<mask>", new Object[0]);
        if (this.currentElement != null) {
            SVG$Grayscale$Algorithm sVG$Grayscale$Algorithm = new SVG$Grayscale$Algorithm();
            sVG$Grayscale$Algorithm.document = this.svgDocument;
            sVG$Grayscale$Algorithm.parent = this.currentElement;
            parseAttributesCore(sVG$Grayscale$Algorithm, attributes);
            parseAttributesStyle(sVG$Grayscale$Algorithm, attributes);
            parseAttributesConditional(sVG$Grayscale$Algorithm, attributes);
            parseAttributesMask(sVG$Grayscale$Algorithm, attributes);
            this.currentElement.addChild(sVG$Grayscale$Algorithm);
            this.currentElement = sVG$Grayscale$Algorithm;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a7, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseAttributesMask(com.caverock.androidsvg.SVG$Grayscale$Algorithm r7, org.xml.sax.Attributes r8) throws org.xml.sax.SAXException {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            int r1 = r8.getLength()
            if (r0 < r1) goto L_0x0008
            return
        L_0x0008:
            java.lang.String r1 = r8.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = $SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr()
            java.lang.String r3 = r8.getLocalName(r0)
            com.caverock.androidsvg.SVGParser$SVGAttr r3 = com.caverock.androidsvg.SVGParser.SVGAttr.fromString(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 26
            if (r2 == r3) goto L_0x0099
            r3 = 37
            java.lang.String r4 = "userSpaceOnUse"
            java.lang.String r5 = "objectBoundingBox"
            if (r2 == r3) goto L_0x007b
            r3 = 38
            if (r2 == r3) goto L_0x005d
            switch(r2) {
                case 82: goto L_0x0046;
                case 83: goto L_0x003f;
                case 84: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x00a7
        L_0x0038:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r7.y = r1
            goto L_0x00a7
        L_0x003f:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r7.x = r1
            goto L_0x00a7
        L_0x0046:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r7.width = r1
            com.caverock.androidsvg.SVG$values r1 = r7.width
            boolean r1 = r1.isNegative()
            if (r1 != 0) goto L_0x0055
            goto L_0x00a7
        L_0x0055:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r8 = "Invalid <mask> element. width cannot be negative"
            r7.<init>(r8)
            throw r7
        L_0x005d:
            boolean r2 = r5.equals(r1)
            if (r2 == 0) goto L_0x0068
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.maskUnitsAreUser = r1
            goto L_0x00a7
        L_0x0068:
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0073
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.maskUnitsAreUser = r1
            goto L_0x00a7
        L_0x0073:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r8 = "Invalid value for attribute maskUnits"
            r7.<init>(r8)
            throw r7
        L_0x007b:
            boolean r2 = r5.equals(r1)
            if (r2 == 0) goto L_0x0086
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.maskContentUnitsAreUser = r1
            goto L_0x00a7
        L_0x0086:
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0091
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.maskContentUnitsAreUser = r1
            goto L_0x00a7
        L_0x0091:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r8 = "Invalid value for attribute maskContentUnits"
            r7.<init>(r8)
            throw r7
        L_0x0099:
            com.caverock.androidsvg.SVG$values r1 = parseLength(r1)
            r7.height = r1
            com.caverock.androidsvg.SVG$values r1 = r7.height
            boolean r1 = r1.isNegative()
            if (r1 != 0) goto L_0x00ab
        L_0x00a7:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x00ab:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r8 = "Invalid <mask> element. height cannot be negative"
            r7.<init>(r8)
            goto L_0x00b4
        L_0x00b3:
            throw r7
        L_0x00b4:
            goto L_0x00b3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseAttributesMask(com.caverock.androidsvg.SVG$Grayscale$Algorithm, org.xml.sax.Attributes):void");
    }

    protected static class setMax {
        protected String input;
        protected int position = 0;

        /* access modifiers changed from: protected */
        public boolean isEOL(int i) {
            return i == 10 || i == 13;
        }

        /* access modifiers changed from: protected */
        public boolean isWhitespace(int i) {
            return i == 32 || i == 10 || i == 13 || i == 9;
        }

        public setMax(String str) {
            this.input = str.trim();
        }

        public boolean empty() {
            return this.position == this.input.length();
        }

        public void skipWhitespace() {
            while (this.position < this.input.length() && isWhitespace(this.input.charAt(this.position))) {
                this.position++;
            }
        }

        public boolean skipCommaWhitespace() {
            skipWhitespace();
            if (this.position == this.input.length() || this.input.charAt(this.position) != ',') {
                return false;
            }
            this.position++;
            skipWhitespace();
            return true;
        }

        public Float nextFloat() {
            int scanForFloat = scanForFloat();
            int i = this.position;
            if (scanForFloat == i) {
                return null;
            }
            Float valueOf = Float.valueOf(Float.parseFloat(this.input.substring(i, scanForFloat)));
            this.position = scanForFloat;
            return valueOf;
        }

        public Float possibleNextFloat() {
            int i = this.position;
            skipCommaWhitespace();
            Float nextFloat = nextFloat();
            if (nextFloat != null) {
                return nextFloat;
            }
            this.position = i;
            return null;
        }

        public Float checkedNextFloat(Object obj) {
            if (obj == null) {
                return null;
            }
            skipCommaWhitespace();
            return nextFloat();
        }

        public Integer nextInteger() {
            int scanForInteger = scanForInteger();
            int i = this.position;
            if (scanForInteger == i) {
                return null;
            }
            Integer valueOf = Integer.valueOf(Integer.parseInt(this.input.substring(i, scanForInteger)));
            this.position = scanForInteger;
            return valueOf;
        }

        public Integer nextChar() {
            if (this.position == this.input.length()) {
                return null;
            }
            String str = this.input;
            int i = this.position;
            this.position = i + 1;
            return Integer.valueOf(str.charAt(i));
        }

        public SVG.values nextLength() {
            Float nextFloat = nextFloat();
            if (nextFloat == null) {
                return null;
            }
            SVG.Unit nextUnit = nextUnit();
            if (nextUnit == null) {
                return new SVG.values(nextFloat.floatValue(), SVG.Unit.px);
            }
            return new SVG.values(nextFloat.floatValue(), nextUnit);
        }

        public Boolean nextFlag() {
            if (this.position == this.input.length()) {
                return null;
            }
            char charAt = this.input.charAt(this.position);
            if (charAt != '0' && charAt != '1') {
                return null;
            }
            boolean z = true;
            this.position++;
            if (charAt != '1') {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        public Boolean checkedNextFlag(Object obj) {
            if (obj == null) {
                return null;
            }
            skipCommaWhitespace();
            return nextFlag();
        }

        public boolean consume(char c) {
            boolean z = this.position < this.input.length() && this.input.charAt(this.position) == c;
            if (z) {
                this.position++;
            }
            return z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean consume(java.lang.String r5) {
            /*
                r4 = this;
                int r0 = r5.length()
                int r1 = r4.position
                java.lang.String r2 = r4.input
                int r2 = r2.length()
                int r2 = r2 - r0
                if (r1 > r2) goto L_0x0021
                java.lang.String r1 = r4.input
                int r2 = r4.position
                int r3 = r2 + r0
                java.lang.String r1 = r1.substring(r2, r3)
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L_0x0021
                r5 = 1
                goto L_0x0022
            L_0x0021:
                r5 = 0
            L_0x0022:
                if (r5 == 0) goto L_0x0029
                int r1 = r4.position
                int r1 = r1 + r0
                r4.position = r1
            L_0x0029:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.setMax.consume(java.lang.String):boolean");
        }

        /* access modifiers changed from: protected */
        public int advanceChar() {
            if (this.position == this.input.length()) {
                return -1;
            }
            int i = this.position + 1;
            this.position = i;
            if (i < this.input.length()) {
                return this.input.charAt(this.position);
            }
            return -1;
        }

        public String nextToken() {
            return nextToken(' ');
        }

        public String nextToken(char c) {
            int advanceChar;
            if (empty()) {
                return null;
            }
            char charAt = this.input.charAt(this.position);
            if (isWhitespace(charAt) || charAt == c) {
                return null;
            }
            int i = this.position;
            do {
                advanceChar = advanceChar();
                if (advanceChar == -1 || advanceChar == c || isWhitespace(advanceChar)) {
                }
                advanceChar = advanceChar();
                break;
            } while (isWhitespace(advanceChar));
            return this.input.substring(i, this.position);
        }

        public String nextFunction() {
            if (empty()) {
                return null;
            }
            int i = this.position;
            int charAt = this.input.charAt(i);
            while (true) {
                if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                    int i2 = this.position;
                } else {
                    charAt = advanceChar();
                }
            }
            int i22 = this.position;
            while (isWhitespace(charAt)) {
                charAt = advanceChar();
            }
            if (charAt == 40) {
                this.position++;
                return this.input.substring(i, i22);
            }
            this.position = i;
            return null;
        }

        private int scanForFloat() {
            int i;
            int i2;
            int advanceChar;
            if (empty()) {
                return this.position;
            }
            int i3 = this.position;
            int charAt = this.input.charAt(i3);
            if (charAt == 45 || charAt == 43) {
                charAt = advanceChar();
            }
            if (Character.isDigit(charAt)) {
                do {
                    i2 = this.position + 1;
                    advanceChar = advanceChar();
                } while (Character.isDigit(advanceChar));
                int i4 = advanceChar;
                i = i2;
                charAt = i4;
            } else {
                i = i3;
            }
            if (charAt == 46) {
                do {
                    i = this.position + 1;
                    charAt = advanceChar();
                } while (Character.isDigit(charAt));
            }
            if (charAt == 101 || charAt == 69) {
                int advanceChar2 = advanceChar();
                if (advanceChar2 == 45 || advanceChar2 == 43) {
                    advanceChar2 = advanceChar();
                }
                if (Character.isDigit(advanceChar2)) {
                    do {
                        i = this.position + 1;
                    } while (Character.isDigit(advanceChar()));
                }
            }
            this.position = i3;
            return i;
        }

        private int scanForInteger() {
            int i;
            if (empty()) {
                return this.position;
            }
            int i2 = this.position;
            int charAt = this.input.charAt(i2);
            if (charAt == 45 || charAt == 43) {
                charAt = advanceChar();
            }
            if (Character.isDigit(charAt)) {
                do {
                    i = this.position + 1;
                } while (Character.isDigit(advanceChar()));
            } else {
                i = i2;
            }
            this.position = i2;
            return i;
        }

        public String ahead() {
            int i = this.position;
            while (!empty() && !isWhitespace(this.input.charAt(this.position))) {
                this.position++;
            }
            String substring = this.input.substring(i, this.position);
            this.position = i;
            return substring;
        }

        public SVG.Unit nextUnit() {
            if (empty()) {
                return null;
            }
            if (this.input.charAt(this.position) == '%') {
                this.position++;
                return SVG.Unit.percent;
            } else if (this.position > this.input.length() - 2) {
                return null;
            } else {
                try {
                    SVG.Unit valueOf = SVG.Unit.valueOf(this.input.substring(this.position, this.position + 2).toLowerCase(Locale.US));
                    this.position += 2;
                    return valueOf;
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            }
        }

        public boolean hasLetter() {
            if (this.position == this.input.length()) {
                return false;
            }
            char charAt = this.input.charAt(this.position);
            if (charAt >= 'a' && charAt <= 'z') {
                return true;
            }
            if (charAt < 'A' || charAt > 'Z') {
                return false;
            }
            return true;
        }

        public String nextQuotedString() {
            if (empty()) {
                return null;
            }
            int i = this.position;
            char charAt = this.input.charAt(i);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            int advanceChar = advanceChar();
            while (advanceChar != -1 && advanceChar != charAt) {
                advanceChar = advanceChar();
            }
            if (advanceChar == -1) {
                this.position = i;
                return null;
            }
            int i2 = this.position + 1;
            this.position = i2;
            return this.input.substring(i + 1, i2 - 1);
        }

        public String restOfText() {
            if (empty()) {
                return null;
            }
            int i = this.position;
            this.position = this.input.length();
            return this.input.substring(i);
        }
    }

    private void parseAttributesCore(SVG.ICustomTabsCallback.Stub stub, Attributes attributes) throws SAXException {
        int i = 0;
        while (i < attributes.getLength()) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                stub.f9526id = attributes.getValue(i).trim();
                return;
            } else if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if ("default".equals(trim)) {
                    stub.spacePreserve = Boolean.FALSE;
                    return;
                } else if ("preserve".equals(trim)) {
                    stub.spacePreserve = Boolean.TRUE;
                    return;
                } else {
                    throw new SAXException("Invalid value for \"xml:space\" attribute: ".concat(String.valueOf(trim)));
                }
            } else {
                i++;
            }
        }
    }

    private void parseAttributesStyle(SVG.ICustomTabsCallback.Stub stub, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                int i2 = $SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr()[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
                if (i2 == 1) {
                    stub.classNames = CSSParser.parseClassAttribute(trim);
                } else if (i2 != 73) {
                    if (stub.baseStyle == null) {
                        stub.baseStyle = new SVG.Style();
                    }
                    processStyleProperty(stub.baseStyle, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    parseStyle(stub, trim);
                }
            }
        }
    }

    private static void parseStyle(SVG.ICustomTabsCallback.Stub stub, String str) throws SAXException {
        setMax setmax = new setMax(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String nextToken = setmax.nextToken(':');
            setmax.skipWhitespace();
            if (setmax.consume(':')) {
                setmax.skipWhitespace();
                String nextToken2 = setmax.nextToken(';');
                if (nextToken2 != null) {
                    setmax.skipWhitespace();
                    if (setmax.empty() || setmax.consume(';')) {
                        if (stub.style == null) {
                            stub.style = new SVG.Style();
                        }
                        processStyleProperty(stub.style, nextToken, nextToken2);
                        setmax.skipWhitespace();
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    protected static void processStyleProperty(SVG.Style style, String str, String str2) throws SAXException {
        if (str2.length() != 0 && !str2.equals("inherit")) {
            int i = $SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr()[SVGAttr.fromString(str).ordinal()];
            if (i == 2) {
                style.clip = parseClip(str2);
                style.specifiedFlags |= ConvertUtils.MB;
            } else if (i == 3) {
                style.clipPath = parseFunctionalIRI(str2, str);
                style.specifiedFlags |= 268435456;
            } else if (i == 5) {
                style.clipRule = parseFillRule(str2);
                style.specifiedFlags |= 536870912;
            } else if (i == 6) {
                style.color = parseColour(str2);
                style.specifiedFlags |= 4096;
            } else if (i == 9) {
                style.direction = parseTextDirection(str2);
                style.specifiedFlags |= 68719476736L;
            } else if (i == 36) {
                style.mask = parseFunctionalIRI(str2, str);
                style.specifiedFlags |= ConvertUtils.GB;
            } else if (i == 41) {
                style.opacity = Float.valueOf(parseOpacity(str2));
                style.specifiedFlags |= 2048;
            } else if (i == 43) {
                style.overflow = parseOverflow(str2);
                style.specifiedFlags |= 524288;
            } else if (i == 79) {
                style.vectorEffect = parseVectorEffect(str2);
                style.specifiedFlags |= 34359738368L;
            } else if (i == 59) {
                if (str2.equals(CURRENTCOLOR)) {
                    style.solidColor = SVG.toFloatRange.getInstance();
                } else {
                    style.solidColor = parseColour(str2);
                }
                style.specifiedFlags |= 2147483648L;
            } else if (i == 60) {
                style.solidOpacity = Float.valueOf(parseOpacity(str2));
                style.specifiedFlags |= 4294967296L;
            } else if (i == 75) {
                style.textAnchor = parseTextAnchor(str2);
                style.specifiedFlags |= 262144;
            } else if (i != 76) {
                switch (i) {
                    case 15:
                        if (str2.indexOf(124) < 0) {
                            StringBuilder sb = new StringBuilder("|");
                            sb.append(str2);
                            sb.append('|');
                            if (VALID_DISPLAY_VALUES.indexOf(sb.toString()) != -1) {
                                style.display = Boolean.valueOf(!str2.equals("none"));
                                style.specifiedFlags |= 16777216;
                                return;
                            }
                        }
                        throw new SAXException("Invalid value for \"display\" attribute: ".concat(String.valueOf(str2)));
                    case 16:
                        style.fill = parsePaintSpecifier(str2, "fill");
                        style.specifiedFlags |= 1;
                        return;
                    case 17:
                        style.fillRule = parseFillRule(str2);
                        style.specifiedFlags |= 2;
                        return;
                    case 18:
                        style.fillOpacity = Float.valueOf(parseOpacity(str2));
                        style.specifiedFlags |= 4;
                        return;
                    case 19:
                        parseFont(style, str2);
                        return;
                    case 20:
                        style.fontFamily = parseFontFamily(str2);
                        style.specifiedFlags |= 8192;
                        return;
                    case 21:
                        style.fontSize = parseFontSize(str2);
                        style.specifiedFlags |= 16384;
                        return;
                    case 22:
                        style.fontWeight = parseFontWeight(str2);
                        style.specifiedFlags |= 32768;
                        return;
                    case 23:
                        style.fontStyle = parseFontStyle(str2);
                        style.specifiedFlags |= 65536;
                        return;
                    default:
                        switch (i) {
                            case 29:
                                style.markerStart = parseFunctionalIRI(str2, str);
                                style.markerMid = style.markerStart;
                                style.markerEnd = style.markerStart;
                                style.specifiedFlags |= 14680064;
                                return;
                            case 30:
                                style.markerStart = parseFunctionalIRI(str2, str);
                                style.specifiedFlags |= 2097152;
                                return;
                            case 31:
                                style.markerMid = parseFunctionalIRI(str2, str);
                                style.specifiedFlags |= 4194304;
                                return;
                            case 32:
                                style.markerEnd = parseFunctionalIRI(str2, str);
                                style.specifiedFlags |= 8388608;
                                return;
                            default:
                                switch (i) {
                                    case 63:
                                        if (str2.equals(CURRENTCOLOR)) {
                                            style.stopColor = SVG.toFloatRange.getInstance();
                                        } else {
                                            style.stopColor = parseColour(str2);
                                        }
                                        style.specifiedFlags |= 67108864;
                                        return;
                                    case 64:
                                        style.stopOpacity = Float.valueOf(parseOpacity(str2));
                                        style.specifiedFlags |= 134217728;
                                        return;
                                    case 65:
                                        style.stroke = parsePaintSpecifier(str2, "stroke");
                                        style.specifiedFlags |= 8;
                                        return;
                                    case 66:
                                        if ("none".equals(str2)) {
                                            style.strokeDashArray = null;
                                        } else {
                                            style.strokeDashArray = parseStrokeDashArray(str2);
                                        }
                                        style.specifiedFlags |= 512;
                                        return;
                                    case 67:
                                        style.strokeDashOffset = parseLength(str2);
                                        style.specifiedFlags |= ConvertUtils.KB;
                                        return;
                                    case 68:
                                        style.strokeLineCap = parseStrokeLineCap(str2);
                                        style.specifiedFlags |= 64;
                                        return;
                                    case 69:
                                        style.strokeLineJoin = parseStrokeLineJoin(str2);
                                        style.specifiedFlags |= 128;
                                        return;
                                    case 70:
                                        style.strokeMiterLimit = Float.valueOf(parseFloat(str2));
                                        style.specifiedFlags |= 256;
                                        return;
                                    case 71:
                                        style.strokeOpacity = Float.valueOf(parseOpacity(str2));
                                        style.specifiedFlags |= 16;
                                        return;
                                    case 72:
                                        style.strokeWidth = parseLength(str2);
                                        style.specifiedFlags |= 32;
                                        return;
                                    default:
                                        switch (i) {
                                            case 89:
                                                if (str2.equals(CURRENTCOLOR)) {
                                                    style.viewportFill = SVG.toFloatRange.getInstance();
                                                } else {
                                                    style.viewportFill = parseColour(str2);
                                                }
                                                style.specifiedFlags |= 8589934592L;
                                                return;
                                            case 90:
                                                style.viewportFillOpacity = Float.valueOf(parseOpacity(str2));
                                                style.specifiedFlags |= 17179869184L;
                                                return;
                                            case 91:
                                                if (str2.indexOf(124) < 0) {
                                                    StringBuilder sb2 = new StringBuilder("|");
                                                    sb2.append(str2);
                                                    sb2.append('|');
                                                    if (VALID_VISIBILITY_VALUES.indexOf(sb2.toString()) != -1) {
                                                        style.visibility = Boolean.valueOf(str2.equals(AppNode.AnonymousClass2.KEY_VISIBLE));
                                                        style.specifiedFlags |= 33554432;
                                                        return;
                                                    }
                                                }
                                                throw new SAXException("Invalid value for \"visibility\" attribute: ".concat(String.valueOf(str2)));
                                            default:
                                                return;
                                        }
                                }
                        }
                }
            } else {
                style.textDecoration = parseTextDecoration(str2);
                style.specifiedFlags |= 131072;
            }
        }
    }

    private void parseAttributesViewBox(SVG.mayLaunchUrl maylaunchurl, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = $SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr()[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 49) {
                parsePreserveAspectRatio(maylaunchurl, trim);
            } else if (i2 == 81) {
                maylaunchurl.viewBox = parseViewBox(trim);
            }
        }
    }

    private void parseAttributesTransform(SVG.hashCode hashcode, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.transform) {
                hashcode.setTransform(parseTransformList(attributes.getValue(i)));
            }
        }
    }

    private Matrix parseTransformList(String str) throws SAXException {
        Matrix matrix = new Matrix();
        setMax setmax = new setMax(str);
        setmax.skipWhitespace();
        while (!setmax.empty()) {
            String nextFunction = setmax.nextFunction();
            if (nextFunction != null) {
                if (nextFunction.equals("matrix")) {
                    setmax.skipWhitespace();
                    Float nextFloat = setmax.nextFloat();
                    setmax.skipCommaWhitespace();
                    Float nextFloat2 = setmax.nextFloat();
                    setmax.skipCommaWhitespace();
                    Float nextFloat3 = setmax.nextFloat();
                    setmax.skipCommaWhitespace();
                    Float nextFloat4 = setmax.nextFloat();
                    setmax.skipCommaWhitespace();
                    Float nextFloat5 = setmax.nextFloat();
                    setmax.skipCommaWhitespace();
                    Float nextFloat6 = setmax.nextFloat();
                    setmax.skipWhitespace();
                    if (nextFloat6 == null || !setmax.consume(')')) {
                        throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{nextFloat.floatValue(), nextFloat3.floatValue(), nextFloat5.floatValue(), nextFloat2.floatValue(), nextFloat4.floatValue(), nextFloat6.floatValue(), 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                } else if (nextFunction.equals("translate")) {
                    setmax.skipWhitespace();
                    Float nextFloat7 = setmax.nextFloat();
                    Float possibleNextFloat = setmax.possibleNextFloat();
                    setmax.skipWhitespace();
                    if (nextFloat7 == null || !setmax.consume(')')) {
                        throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                    } else if (possibleNextFloat == null) {
                        matrix.preTranslate(nextFloat7.floatValue(), 0.0f);
                    } else {
                        matrix.preTranslate(nextFloat7.floatValue(), possibleNextFloat.floatValue());
                    }
                } else if (nextFunction.equals("scale")) {
                    setmax.skipWhitespace();
                    Float nextFloat8 = setmax.nextFloat();
                    Float possibleNextFloat2 = setmax.possibleNextFloat();
                    setmax.skipWhitespace();
                    if (nextFloat8 == null || !setmax.consume(')')) {
                        throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                    } else if (possibleNextFloat2 == null) {
                        matrix.preScale(nextFloat8.floatValue(), nextFloat8.floatValue());
                    } else {
                        matrix.preScale(nextFloat8.floatValue(), possibleNextFloat2.floatValue());
                    }
                } else if (nextFunction.equals("rotate")) {
                    setmax.skipWhitespace();
                    Float nextFloat9 = setmax.nextFloat();
                    Float possibleNextFloat3 = setmax.possibleNextFloat();
                    Float possibleNextFloat4 = setmax.possibleNextFloat();
                    setmax.skipWhitespace();
                    if (nextFloat9 == null || !setmax.consume(')')) {
                        throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                    } else if (possibleNextFloat3 == null) {
                        matrix.preRotate(nextFloat9.floatValue());
                    } else if (possibleNextFloat4 != null) {
                        matrix.preRotate(nextFloat9.floatValue(), possibleNextFloat3.floatValue(), possibleNextFloat4.floatValue());
                    } else {
                        throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                    }
                } else if (nextFunction.equals("skewX")) {
                    setmax.skipWhitespace();
                    Float nextFloat10 = setmax.nextFloat();
                    setmax.skipWhitespace();
                    if (nextFloat10 == null || !setmax.consume(')')) {
                        throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians((double) nextFloat10.floatValue())), 0.0f);
                } else if (nextFunction.equals("skewY")) {
                    setmax.skipWhitespace();
                    Float nextFloat11 = setmax.nextFloat();
                    setmax.skipWhitespace();
                    if (nextFloat11 == null || !setmax.consume(')')) {
                        throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians((double) nextFloat11.floatValue())));
                } else if (nextFunction != null) {
                    StringBuilder sb = new StringBuilder("Invalid transform list fn: ");
                    sb.append(nextFunction);
                    sb.append(")");
                    throw new SAXException(sb.toString());
                }
                if (setmax.empty()) {
                    break;
                }
                setmax.skipCommaWhitespace();
            } else {
                throw new SAXException("Bad transform function encountered in transform list: ".concat(String.valueOf(str)));
            }
        }
        return matrix;
    }

    protected static SVG.values parseLength(String str) throws SAXException {
        if (str.length() != 0) {
            int length = str.length();
            SVG.Unit unit = SVG.Unit.px;
            char charAt = str.charAt(length - 1);
            if (charAt == '%') {
                length--;
                unit = SVG.Unit.percent;
            } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
                length -= 2;
                try {
                    unit = SVG.Unit.valueOf(str.substring(length).toLowerCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                    throw new SAXException("Invalid length unit specifier: ".concat(String.valueOf(str)));
                }
            }
            try {
                return new SVG.values(Float.parseFloat(str.substring(0, length)), unit);
            } catch (NumberFormatException e) {
                throw new SAXException("Invalid length value: ".concat(String.valueOf(str)), e);
            }
        } else {
            throw new SAXException("Invalid length value (empty string)");
        }
    }

    private static List<SVG.values> parseLengthList(String str) throws SAXException {
        if (str.length() != 0) {
            ArrayList arrayList = new ArrayList(1);
            setMax setmax = new setMax(str);
            setmax.skipWhitespace();
            while (!setmax.empty()) {
                Float nextFloat = setmax.nextFloat();
                if (nextFloat != null) {
                    SVG.Unit nextUnit = setmax.nextUnit();
                    if (nextUnit == null) {
                        nextUnit = SVG.Unit.px;
                    }
                    arrayList.add(new SVG.values(nextFloat.floatValue(), nextUnit));
                    setmax.skipCommaWhitespace();
                } else {
                    StringBuilder sb = new StringBuilder("Invalid length list value: ");
                    sb.append(setmax.ahead());
                    throw new SAXException(sb.toString());
                }
            }
            return arrayList;
        }
        throw new SAXException("Invalid length list (empty string)");
    }

    private static float parseFloat(String str) throws SAXException {
        if (str.length() != 0) {
            try {
                return Float.parseFloat(str);
            } catch (NumberFormatException e) {
                throw new SAXException("Invalid float value: ".concat(String.valueOf(str)), e);
            }
        } else {
            throw new SAXException("Invalid float value (empty string)");
        }
    }

    private static float parseOpacity(String str) throws SAXException {
        float parseFloat = parseFloat(str);
        if (parseFloat < 0.0f) {
            return 0.0f;
        }
        if (parseFloat > 1.0f) {
            return 1.0f;
        }
        return parseFloat;
    }

    private static SVG.length parseViewBox(String str) throws SAXException {
        setMax setmax = new setMax(str);
        setmax.skipWhitespace();
        Float nextFloat = setmax.nextFloat();
        setmax.skipCommaWhitespace();
        Float nextFloat2 = setmax.nextFloat();
        setmax.skipCommaWhitespace();
        Float nextFloat3 = setmax.nextFloat();
        setmax.skipCommaWhitespace();
        Float nextFloat4 = setmax.nextFloat();
        if (nextFloat == null || nextFloat2 == null || nextFloat3 == null || nextFloat4 == null) {
            throw new SAXException("Invalid viewBox definition - should have four numbers");
        } else if (nextFloat3.floatValue() < 0.0f) {
            throw new SAXException("Invalid viewBox. width cannot be negative");
        } else if (nextFloat4.floatValue() >= 0.0f) {
            return new SVG.length(nextFloat.floatValue(), nextFloat2.floatValue(), nextFloat3.floatValue(), nextFloat4.floatValue());
        } else {
            throw new SAXException("Invalid viewBox. height cannot be negative");
        }
    }

    private static void parsePreserveAspectRatio(SVG.setDefaultImpl setdefaultimpl, String str) throws SAXException {
        PreserveAspectRatio.Scale scale;
        setMax setmax = new setMax(str);
        setmax.skipWhitespace();
        String nextToken = setmax.nextToken();
        if ("defer".equals(nextToken)) {
            setmax.skipWhitespace();
            nextToken = setmax.nextToken();
        }
        PreserveAspectRatio.Alignment alignment = aspectRatioKeywords.get(nextToken);
        setmax.skipWhitespace();
        if (!setmax.empty()) {
            String nextToken2 = setmax.nextToken();
            if (nextToken2.equals("meet")) {
                scale = PreserveAspectRatio.Scale.Meet;
            } else if (nextToken2.equals("slice")) {
                scale = PreserveAspectRatio.Scale.Slice;
            } else {
                throw new SAXException("Invalid preserveAspectRatio definition: ".concat(String.valueOf(str)));
            }
        } else {
            scale = null;
        }
        setdefaultimpl.preserveAspectRatio = new PreserveAspectRatio(alignment, scale);
    }

    private static SVG.getDefaultImpl parsePaintSpecifier(String str, String str2) throws SAXException {
        if (!str.startsWith("url(")) {
            return parseColourSpecifer(str);
        }
        int indexOf = str.indexOf(")");
        if (indexOf != -1) {
            String trim = str.substring(4, indexOf).trim();
            SVG.getDefaultImpl getdefaultimpl = null;
            String trim2 = str.substring(indexOf + 1).trim();
            if (trim2.length() > 0) {
                getdefaultimpl = parseColourSpecifer(trim2);
            }
            return new SVG.invoke(trim, getdefaultimpl);
        }
        StringBuilder sb = new StringBuilder("Bad ");
        sb.append(str2);
        sb.append(" attribute. Unterminated url() reference");
        throw new SAXException(sb.toString());
    }

    private static SVG.getDefaultImpl parseColourSpecifer(String str) throws SAXException {
        if (str.equals("none")) {
            return null;
        }
        if (str.equals(CURRENTCOLOR)) {
            return SVG.toFloatRange.getInstance();
        }
        return parseColour(str);
    }

    private static SVG.getMin parseColour(String str) throws SAXException {
        if (str.charAt(0) == '#') {
            try {
                if (str.length() == 7) {
                    return new SVG.getMin(Integer.parseInt(str.substring(1), 16));
                }
                if (str.length() == 4) {
                    int parseInt = Integer.parseInt(str.substring(1), 16);
                    int i = parseInt & 3840;
                    int i2 = parseInt & 240;
                    int i3 = parseInt & 15;
                    return new SVG.getMin(i3 | (i << 12) | (i << 16) | (i2 << 8) | (i2 << 4) | (i3 << 4));
                }
                throw new SAXException("Bad hex colour value: ".concat(String.valueOf(str)));
            } catch (NumberFormatException unused) {
                throw new SAXException("Bad colour value: ".concat(String.valueOf(str)));
            }
        } else if (!str.toLowerCase(Locale.US).startsWith("rgb(")) {
            return parseColourKeyword(str);
        } else {
            setMax setmax = new setMax(str.substring(4));
            setmax.skipWhitespace();
            int parseColourComponent = parseColourComponent(setmax);
            setmax.skipCommaWhitespace();
            int parseColourComponent2 = parseColourComponent(setmax);
            setmax.skipCommaWhitespace();
            int parseColourComponent3 = parseColourComponent(setmax);
            setmax.skipWhitespace();
            if (setmax.consume(')')) {
                return new SVG.getMin((parseColourComponent << 16) | (parseColourComponent2 << 8) | parseColourComponent3);
            }
            throw new SAXException("Bad rgb() colour value: ".concat(String.valueOf(str)));
        }
    }

    private static int parseColourComponent(setMax setmax) throws SAXException {
        float floatValue = setmax.nextFloat().floatValue();
        if (setmax.consume('%')) {
            floatValue = (floatValue * 256.0f) / 100.0f;
        }
        if (floatValue < 0.0f) {
            return 0;
        }
        if (floatValue > 255.0f) {
            return 255;
        }
        return (int) floatValue;
    }

    private static SVG.getMin parseColourKeyword(String str) throws SAXException {
        Integer num = colourKeywords.get(str.toLowerCase(Locale.US));
        if (num != null) {
            return new SVG.getMin(num.intValue());
        }
        throw new SAXException("Invalid colour keyword: ".concat(String.valueOf(str)));
    }

    private static void parseFont(SVG.Style style, String str) throws SAXException {
        String nextToken;
        int i;
        StringBuilder sb = new StringBuilder("|");
        sb.append(str);
        sb.append('|');
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".indexOf(sb.toString()) == -1) {
            setMax setmax = new setMax(str);
            Integer num = null;
            SVG.Style.FontStyle fontStyle = null;
            String str2 = null;
            while (true) {
                nextToken = setmax.nextToken('/');
                setmax.skipWhitespace();
                if (nextToken != null) {
                    if (num == null || fontStyle == null) {
                        if (!nextToken.equals("normal") && ((num != null || (num = fontWeightKeywords.get(nextToken)) == null) && (fontStyle != null || (fontStyle = fontStyleKeywords.get(nextToken)) == null))) {
                            if (str2 != null || !nextToken.equals("small-caps")) {
                                break;
                            }
                            str2 = nextToken;
                        }
                    } else {
                        break;
                    }
                } else {
                    throw new SAXException("Invalid font style attribute: missing font size and family");
                }
            }
            SVG.values parseFontSize = parseFontSize(nextToken);
            if (setmax.consume('/')) {
                setmax.skipWhitespace();
                String nextToken2 = setmax.nextToken();
                if (nextToken2 != null) {
                    parseLength(nextToken2);
                    setmax.skipWhitespace();
                } else {
                    throw new SAXException("Invalid font style attribute: missing line-height");
                }
            }
            style.fontFamily = parseFontFamily(setmax.restOfText());
            style.fontSize = parseFontSize;
            if (num == null) {
                i = 400;
            } else {
                i = num.intValue();
            }
            style.fontWeight = Integer.valueOf(i);
            if (fontStyle == null) {
                fontStyle = SVG.Style.FontStyle.Normal;
            }
            style.fontStyle = fontStyle;
            style.specifiedFlags |= 122880;
        }
    }

    private static List<String> parseFontFamily(String str) throws SAXException {
        setMax setmax = new setMax(str);
        ArrayList arrayList = null;
        do {
            String nextQuotedString = setmax.nextQuotedString();
            if (nextQuotedString == null) {
                nextQuotedString = setmax.nextToken(',');
            }
            if (nextQuotedString == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(nextQuotedString);
            setmax.skipCommaWhitespace();
        } while (!setmax.empty());
        return arrayList;
    }

    private static SVG.values parseFontSize(String str) throws SAXException {
        SVG.values values = fontSizeKeywords.get(str);
        return values == null ? parseLength(str) : values;
    }

    private static Integer parseFontWeight(String str) throws SAXException {
        Integer num = fontWeightKeywords.get(str);
        if (num != null) {
            return num;
        }
        throw new SAXException("Invalid font-weight property: ".concat(String.valueOf(str)));
    }

    private static SVG.Style.FontStyle parseFontStyle(String str) throws SAXException {
        SVG.Style.FontStyle fontStyle = fontStyleKeywords.get(str);
        if (fontStyle != null) {
            return fontStyle;
        }
        throw new SAXException("Invalid font-style property: ".concat(String.valueOf(str)));
    }

    private static SVG.Style.TextDecoration parseTextDecoration(String str) throws SAXException {
        if ("none".equals(str)) {
            return SVG.Style.TextDecoration.None;
        }
        if (TtmlNode.UNDERLINE.equals(str)) {
            return SVG.Style.TextDecoration.Underline;
        }
        if ("overline".equals(str)) {
            return SVG.Style.TextDecoration.Overline;
        }
        if ("line-through".equals(str)) {
            return SVG.Style.TextDecoration.LineThrough;
        }
        if ("blink".equals(str)) {
            return SVG.Style.TextDecoration.Blink;
        }
        throw new SAXException("Invalid text-decoration property: ".concat(String.valueOf(str)));
    }

    private static SVG.Style.TextDirection parseTextDirection(String str) throws SAXException {
        if ("ltr".equals(str)) {
            return SVG.Style.TextDirection.LTR;
        }
        if ("rtl".equals(str)) {
            return SVG.Style.TextDirection.RTL;
        }
        throw new SAXException("Invalid direction property: ".concat(String.valueOf(str)));
    }

    private static SVG.Style.FillRule parseFillRule(String str) throws SAXException {
        if ("nonzero".equals(str)) {
            return SVG.Style.FillRule.NonZero;
        }
        if ("evenodd".equals(str)) {
            return SVG.Style.FillRule.EvenOdd;
        }
        throw new SAXException("Invalid fill-rule property: ".concat(String.valueOf(str)));
    }

    private static SVG.Style.LineCaps parseStrokeLineCap(String str) throws SAXException {
        if ("butt".equals(str)) {
            return SVG.Style.LineCaps.Butt;
        }
        if ("round".equals(str)) {
            return SVG.Style.LineCaps.Round;
        }
        if ("square".equals(str)) {
            return SVG.Style.LineCaps.Square;
        }
        throw new SAXException("Invalid stroke-linecap property: ".concat(String.valueOf(str)));
    }

    private static SVG.Style.LineJoin parseStrokeLineJoin(String str) throws SAXException {
        if ("miter".equals(str)) {
            return SVG.Style.LineJoin.Miter;
        }
        if ("round".equals(str)) {
            return SVG.Style.LineJoin.Round;
        }
        if ("bevel".equals(str)) {
            return SVG.Style.LineJoin.Bevel;
        }
        throw new SAXException("Invalid stroke-linejoin property: ".concat(String.valueOf(str)));
    }

    private static SVG.values[] parseStrokeDashArray(String str) throws SAXException {
        SVG.values nextLength;
        setMax setmax = new setMax(str);
        setmax.skipWhitespace();
        if (setmax.empty() || (nextLength = setmax.nextLength()) == null) {
            return null;
        }
        if (!nextLength.isNegative()) {
            float floatValue = nextLength.floatValue();
            ArrayList arrayList = new ArrayList();
            arrayList.add(nextLength);
            while (!setmax.empty()) {
                setmax.skipCommaWhitespace();
                SVG.values nextLength2 = setmax.nextLength();
                if (nextLength2 == null) {
                    throw new SAXException("Invalid stroke-dasharray. Non-Length content found: ".concat(String.valueOf(str)));
                } else if (!nextLength2.isNegative()) {
                    arrayList.add(nextLength2);
                    floatValue += nextLength2.floatValue();
                } else {
                    throw new SAXException("Invalid stroke-dasharray. Dash segemnts cannot be negative: ".concat(String.valueOf(str)));
                }
            }
            if (floatValue == 0.0f) {
                return null;
            }
            return (SVG.values[]) arrayList.toArray(new SVG.values[arrayList.size()]);
        }
        throw new SAXException("Invalid stroke-dasharray. Dash segemnts cannot be negative: ".concat(String.valueOf(str)));
    }

    private static SVG.Style.TextAnchor parseTextAnchor(String str) throws SAXException {
        if ("start".equals(str)) {
            return SVG.Style.TextAnchor.Start;
        }
        if (RVCommonAbilityProxy.MIDDLE.equals(str)) {
            return SVG.Style.TextAnchor.Middle;
        }
        if (TtmlNode.END.equals(str)) {
            return SVG.Style.TextAnchor.End;
        }
        throw new SAXException("Invalid text-anchor property: ".concat(String.valueOf(str)));
    }

    private static Boolean parseOverflow(String str) throws SAXException {
        if (AppNode.AnonymousClass2.KEY_VISIBLE.equals(str) || "auto".equals(str)) {
            return Boolean.TRUE;
        }
        if ("hidden".equals(str) || "scroll".equals(str)) {
            return Boolean.FALSE;
        }
        throw new SAXException("Invalid toverflow property: ".concat(String.valueOf(str)));
    }

    private static SVG.setMax parseClip(String str) throws SAXException {
        if ("auto".equals(str)) {
            return null;
        }
        if (str.toLowerCase(Locale.US).startsWith("rect(")) {
            setMax setmax = new setMax(str.substring(5));
            setmax.skipWhitespace();
            SVG.values parseLengthOrAuto = parseLengthOrAuto(setmax);
            setmax.skipCommaWhitespace();
            SVG.values parseLengthOrAuto2 = parseLengthOrAuto(setmax);
            setmax.skipCommaWhitespace();
            SVG.values parseLengthOrAuto3 = parseLengthOrAuto(setmax);
            setmax.skipCommaWhitespace();
            SVG.values parseLengthOrAuto4 = parseLengthOrAuto(setmax);
            setmax.skipWhitespace();
            if (setmax.consume(')')) {
                return new SVG.setMax(parseLengthOrAuto, parseLengthOrAuto2, parseLengthOrAuto3, parseLengthOrAuto4);
            }
            throw new SAXException("Bad rect() clip definition: ".concat(String.valueOf(str)));
        }
        throw new SAXException("Invalid clip attribute shape. Only rect() is supported.");
    }

    private static SVG.values parseLengthOrAuto(setMax setmax) {
        if (setmax.consume("auto")) {
            return new SVG.values(0.0f);
        }
        return setmax.nextLength();
    }

    private static SVG.Style.VectorEffect parseVectorEffect(String str) throws SAXException {
        if ("none".equals(str)) {
            return SVG.Style.VectorEffect.None;
        }
        if ("non-scaling-stroke".equals(str)) {
            return SVG.Style.VectorEffect.NonScalingStroke;
        }
        throw new SAXException("Invalid vector-effect property: ".concat(String.valueOf(str)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0207, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0324, code lost:
        r0.skipCommaWhitespace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x032b, code lost:
        if (r0.empty() != false) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0331, code lost:
        if (r0.hasLetter() == false) goto L_0x033b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0333, code lost:
        r12 = r0.nextChar().intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.caverock.androidsvg.SVG.getCause parsePath(java.lang.String r18) throws org.xml.sax.SAXException {
        /*
            com.caverock.androidsvg.SVGParser$setMax r0 = new com.caverock.androidsvg.SVGParser$setMax
            r1 = r18
            r0.<init>(r1)
            com.caverock.androidsvg.SVG$getCause r9 = new com.caverock.androidsvg.SVG$getCause
            r9.<init>()
            boolean r1 = r0.empty()
            if (r1 == 0) goto L_0x0013
            return r9
        L_0x0013:
            java.lang.Integer r1 = r0.nextChar()
            int r1 = r1.intValue()
            r2 = 77
            r10 = 109(0x6d, float:1.53E-43)
            if (r1 == r2) goto L_0x0024
            if (r1 == r10) goto L_0x0024
            return r9
        L_0x0024:
            r11 = 0
            r12 = r1
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r13 = 0
            r14 = 0
        L_0x002c:
            r0.skipWhitespace()
            r5 = 108(0x6c, float:1.51E-43)
            r6 = 1073741824(0x40000000, float:2.0)
            switch(r12) {
                case 65: goto L_0x02b4;
                case 67: goto L_0x022c;
                case 72: goto L_0x020a;
                case 76: goto L_0x01d5;
                case 77: goto L_0x0191;
                case 81: goto L_0x0131;
                case 83: goto L_0x00b4;
                case 84: goto L_0x0060;
                case 86: goto L_0x0040;
                case 90: goto L_0x0037;
                case 97: goto L_0x02b4;
                case 99: goto L_0x022c;
                case 104: goto L_0x020a;
                case 108: goto L_0x01d5;
                case 109: goto L_0x0191;
                case 113: goto L_0x0131;
                case 115: goto L_0x00b4;
                case 116: goto L_0x0060;
                case 118: goto L_0x0040;
                case 122: goto L_0x0037;
                default: goto L_0x0036;
            }
        L_0x0036:
            return r9
        L_0x0037:
            r9.close()
            r1 = r13
            r2 = r1
            r3 = r14
        L_0x003d:
            r4 = r3
            goto L_0x0324
        L_0x0040:
            java.lang.Float r4 = r0.nextFloat()
            if (r4 != 0) goto L_0x0047
            return r9
        L_0x0047:
            r5 = 118(0x76, float:1.65E-43)
            if (r12 != r5) goto L_0x0054
            float r4 = r4.floatValue()
            float r4 = r4 + r3
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
        L_0x0054:
            float r3 = r4.floatValue()
            r9.lineTo(r1, r3)
            float r3 = r4.floatValue()
            goto L_0x003d
        L_0x0060:
            float r5 = r1 * r6
            float r5 = r5 - r2
            java.lang.Float r2 = java.lang.Float.valueOf(r5)
            float r6 = r6 * r3
            float r6 = r6 - r4
            java.lang.Float r4 = java.lang.Float.valueOf(r6)
            java.lang.Float r5 = r0.nextFloat()
            java.lang.Float r6 = r0.checkedNextFloat(r5)
            if (r6 != 0) goto L_0x0079
            return r9
        L_0x0079:
            r7 = 116(0x74, float:1.63E-43)
            if (r12 != r7) goto L_0x008f
            float r5 = r5.floatValue()
            float r5 = r5 + r1
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            float r1 = r6.floatValue()
            float r1 = r1 + r3
            java.lang.Float r6 = java.lang.Float.valueOf(r1)
        L_0x008f:
            float r1 = r2.floatValue()
            float r3 = r4.floatValue()
            float r7 = r5.floatValue()
            float r8 = r6.floatValue()
            r9.quadTo(r1, r3, r7, r8)
            float r2 = r2.floatValue()
            float r4 = r4.floatValue()
            float r1 = r5.floatValue()
            float r3 = r6.floatValue()
            goto L_0x0324
        L_0x00b4:
            float r5 = r1 * r6
            float r5 = r5 - r2
            java.lang.Float r2 = java.lang.Float.valueOf(r5)
            float r6 = r6 * r3
            float r6 = r6 - r4
            java.lang.Float r4 = java.lang.Float.valueOf(r6)
            java.lang.Float r5 = r0.nextFloat()
            java.lang.Float r6 = r0.checkedNextFloat(r5)
            java.lang.Float r7 = r0.checkedNextFloat(r6)
            java.lang.Float r8 = r0.checkedNextFloat(r7)
            if (r8 != 0) goto L_0x00d5
            return r9
        L_0x00d5:
            r15 = 115(0x73, float:1.61E-43)
            if (r12 != r15) goto L_0x00fd
            float r7 = r7.floatValue()
            float r7 = r7 + r1
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            float r8 = r8.floatValue()
            float r8 = r8 + r3
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            float r5 = r5.floatValue()
            float r5 = r5 + r1
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            float r1 = r6.floatValue()
            float r1 = r1 + r3
            java.lang.Float r6 = java.lang.Float.valueOf(r1)
        L_0x00fd:
            r15 = r6
            r16 = r7
            r17 = r8
            r8 = r5
            float r2 = r2.floatValue()
            float r3 = r4.floatValue()
            float r4 = r8.floatValue()
            float r5 = r15.floatValue()
            float r6 = r16.floatValue()
            float r7 = r17.floatValue()
            r1 = r9
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            float r2 = r8.floatValue()
            float r4 = r15.floatValue()
            float r1 = r16.floatValue()
            float r3 = r17.floatValue()
            goto L_0x0324
        L_0x0131:
            java.lang.Float r2 = r0.nextFloat()
            java.lang.Float r4 = r0.checkedNextFloat(r2)
            java.lang.Float r5 = r0.checkedNextFloat(r4)
            java.lang.Float r6 = r0.checkedNextFloat(r5)
            if (r6 != 0) goto L_0x0144
            return r9
        L_0x0144:
            r7 = 113(0x71, float:1.58E-43)
            if (r12 != r7) goto L_0x016c
            float r5 = r5.floatValue()
            float r5 = r5 + r1
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            float r6 = r6.floatValue()
            float r6 = r6 + r3
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            float r2 = r2.floatValue()
            float r2 = r2 + r1
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r1 = r4.floatValue()
            float r1 = r1 + r3
            java.lang.Float r4 = java.lang.Float.valueOf(r1)
        L_0x016c:
            float r1 = r2.floatValue()
            float r3 = r4.floatValue()
            float r7 = r5.floatValue()
            float r8 = r6.floatValue()
            r9.quadTo(r1, r3, r7, r8)
            float r2 = r2.floatValue()
            float r4 = r4.floatValue()
            float r1 = r5.floatValue()
            float r3 = r6.floatValue()
            goto L_0x0324
        L_0x0191:
            java.lang.Float r2 = r0.nextFloat()
            java.lang.Float r4 = r0.checkedNextFloat(r2)
            if (r4 != 0) goto L_0x019c
            return r9
        L_0x019c:
            if (r12 != r10) goto L_0x01b6
            boolean r6 = r9.isEmpty()
            if (r6 != 0) goto L_0x01b6
            float r2 = r2.floatValue()
            float r2 = r2 + r1
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r1 = r4.floatValue()
            float r1 = r1 + r3
            java.lang.Float r4 = java.lang.Float.valueOf(r1)
        L_0x01b6:
            float r1 = r2.floatValue()
            float r3 = r4.floatValue()
            r9.moveTo(r1, r3)
            float r1 = r2.floatValue()
            float r3 = r4.floatValue()
            if (r12 != r10) goto L_0x01cc
            goto L_0x01ce
        L_0x01cc:
            r5 = 76
        L_0x01ce:
            r2 = r1
            r13 = r2
            r4 = r3
            r14 = r4
            r12 = r5
            goto L_0x0324
        L_0x01d5:
            java.lang.Float r2 = r0.nextFloat()
            java.lang.Float r4 = r0.checkedNextFloat(r2)
            if (r4 != 0) goto L_0x01e0
            return r9
        L_0x01e0:
            if (r12 != r5) goto L_0x01f4
            float r2 = r2.floatValue()
            float r2 = r2 + r1
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r1 = r4.floatValue()
            float r1 = r1 + r3
            java.lang.Float r4 = java.lang.Float.valueOf(r1)
        L_0x01f4:
            float r1 = r2.floatValue()
            float r3 = r4.floatValue()
            r9.lineTo(r1, r3)
            float r1 = r2.floatValue()
            float r3 = r4.floatValue()
        L_0x0207:
            r2 = r1
            goto L_0x003d
        L_0x020a:
            java.lang.Float r2 = r0.nextFloat()
            if (r2 != 0) goto L_0x0211
            return r9
        L_0x0211:
            r5 = 104(0x68, float:1.46E-43)
            if (r12 != r5) goto L_0x021e
            float r2 = r2.floatValue()
            float r2 = r2 + r1
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L_0x021e:
            float r1 = r2.floatValue()
            r9.lineTo(r1, r3)
            float r1 = r2.floatValue()
            r2 = r1
            goto L_0x0324
        L_0x022c:
            java.lang.Float r2 = r0.nextFloat()
            java.lang.Float r4 = r0.checkedNextFloat(r2)
            java.lang.Float r5 = r0.checkedNextFloat(r4)
            java.lang.Float r6 = r0.checkedNextFloat(r5)
            java.lang.Float r7 = r0.checkedNextFloat(r6)
            java.lang.Float r8 = r0.checkedNextFloat(r7)
            if (r8 != 0) goto L_0x0247
            return r9
        L_0x0247:
            r15 = 99
            if (r12 != r15) goto L_0x0281
            float r7 = r7.floatValue()
            float r7 = r7 + r1
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            float r8 = r8.floatValue()
            float r8 = r8 + r3
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            float r2 = r2.floatValue()
            float r2 = r2 + r1
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r4 = r4.floatValue()
            float r4 = r4 + r3
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            float r5 = r5.floatValue()
            float r5 = r5 + r1
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            float r1 = r6.floatValue()
            float r1 = r1 + r3
            java.lang.Float r6 = java.lang.Float.valueOf(r1)
        L_0x0281:
            r15 = r6
            r16 = r7
            r17 = r8
            r8 = r5
            float r2 = r2.floatValue()
            float r3 = r4.floatValue()
            float r4 = r8.floatValue()
            float r5 = r15.floatValue()
            float r6 = r16.floatValue()
            float r7 = r17.floatValue()
            r1 = r9
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            float r2 = r8.floatValue()
            float r4 = r15.floatValue()
            float r1 = r16.floatValue()
            float r3 = r17.floatValue()
            goto L_0x0324
        L_0x02b4:
            java.lang.Float r2 = r0.nextFloat()
            java.lang.Float r4 = r0.checkedNextFloat(r2)
            java.lang.Float r5 = r0.checkedNextFloat(r4)
            java.lang.Boolean r6 = r0.checkedNextFlag(r5)
            java.lang.Boolean r7 = r0.checkedNextFlag(r6)
            java.lang.Float r8 = r0.checkedNextFloat(r7)
            java.lang.Float r15 = r0.checkedNextFloat(r8)
            if (r15 == 0) goto L_0x033f
            float r16 = r2.floatValue()
            int r16 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r16 < 0) goto L_0x033f
            float r16 = r4.floatValue()
            int r16 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r16 >= 0) goto L_0x02e3
            goto L_0x033f
        L_0x02e3:
            r10 = 97
            if (r12 != r10) goto L_0x02f9
            float r8 = r8.floatValue()
            float r8 = r8 + r1
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            float r1 = r15.floatValue()
            float r1 = r1 + r3
            java.lang.Float r15 = java.lang.Float.valueOf(r1)
        L_0x02f9:
            r10 = r8
            float r2 = r2.floatValue()
            float r3 = r4.floatValue()
            float r4 = r5.floatValue()
            boolean r5 = r6.booleanValue()
            boolean r6 = r7.booleanValue()
            float r7 = r10.floatValue()
            float r8 = r15.floatValue()
            r1 = r9
            r1.arcTo(r2, r3, r4, r5, r6, r7, r8)
            float r1 = r10.floatValue()
            float r3 = r15.floatValue()
            goto L_0x0207
        L_0x0324:
            r0.skipCommaWhitespace()
            boolean r5 = r0.empty()
            if (r5 != 0) goto L_0x033f
            boolean r5 = r0.hasLetter()
            if (r5 == 0) goto L_0x033b
            java.lang.Integer r5 = r0.nextChar()
            int r12 = r5.intValue()
        L_0x033b:
            r10 = 109(0x6d, float:1.53E-43)
            goto L_0x002c
        L_0x033f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parsePath(java.lang.String):com.caverock.androidsvg.SVG$getCause");
    }

    private static Set<String> parseRequiredFeatures(String str) throws SAXException {
        setMax setmax = new setMax(str);
        HashSet hashSet = new HashSet();
        while (!setmax.empty()) {
            String nextToken = setmax.nextToken();
            if (nextToken.startsWith(FEATURE_STRING_PREFIX)) {
                hashSet.add(nextToken.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            setmax.skipWhitespace();
        }
        return hashSet;
    }

    private static Set<String> parseSystemLanguage(String str) throws SAXException {
        setMax setmax = new setMax(str);
        HashSet hashSet = new HashSet();
        while (!setmax.empty()) {
            String nextToken = setmax.nextToken();
            int indexOf = nextToken.indexOf(45);
            if (indexOf != -1) {
                nextToken = nextToken.substring(0, indexOf);
            }
            hashSet.add(new Locale(nextToken, "", "").getLanguage());
            setmax.skipWhitespace();
        }
        return hashSet;
    }

    private static Set<String> parseRequiredFormats(String str) throws SAXException {
        setMax setmax = new setMax(str);
        HashSet hashSet = new HashSet();
        while (!setmax.empty()) {
            hashSet.add(setmax.nextToken());
            setmax.skipWhitespace();
        }
        return hashSet;
    }

    private static String parseFunctionalIRI(String str, String str2) throws SAXException {
        if (str.equals("none")) {
            return null;
        }
        if (str.startsWith("url(") && str.endsWith(")")) {
            return str.substring(4, str.length() - 1).trim();
        }
        StringBuilder sb = new StringBuilder("Bad ");
        sb.append(str2);
        sb.append(" attribute. Expected \"none\" or \"url()\" format");
        throw new SAXException(sb.toString());
    }

    private void style(Attributes attributes) throws SAXException {
        debug("<style>", new Object[0]);
        if (this.currentElement != null) {
            String str = "all";
            boolean z = true;
            for (int i = 0; i < attributes.getLength(); i++) {
                String trim = attributes.getValue(i).trim();
                int i2 = $SWITCH_TABLE$com$caverock$androidsvg$SVGParser$SVGAttr()[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
                if (i2 == 39) {
                    str = trim;
                } else if (i2 == 78) {
                    z = trim.equals("text/css");
                }
            }
            if (!z || !CSSParser.mediaMatches(str, CSSParser.MediaType.screen)) {
                this.ignoring = true;
                this.ignoreDepth = 1;
                return;
            }
            this.inStyleElement = true;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    private void parseCSSStyleSheet(String str) throws SAXException {
        this.svgDocument.addCSSRules(new CSSParser(CSSParser.MediaType.screen).parse(str));
    }
}
