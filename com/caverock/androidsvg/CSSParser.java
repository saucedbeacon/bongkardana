package com.caverock.androidsvg;

import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParser;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.SAXException;

public final class CSSParser {
    private static final String CLASS = "class";
    private static final String ID = "id";
    private static final String TAG = "AndroidSVG CSSParser";
    private boolean inMediaRule = false;
    private MediaType rendererMediaType = null;

    enum AttribOp {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    enum Combinator {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    public enum MediaType {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        tty,
        tv
    }

    private static void warn(String str, Object... objArr) {
    }

    public static class setMax {
        public String name = null;
        public AttribOp operation;
        public String value = null;

        public setMax(String str, AttribOp attribOp, String str2) {
            this.name = str;
            this.operation = attribOp;
            this.value = str2;
        }
    }

    static class isInside {
        private static /* synthetic */ int[] $SWITCH_TABLE$com$caverock$androidsvg$CSSParser$AttribOp;
        public List<setMax> attribs = null;
        public Combinator combinator = null;
        public List<String> pseudos = null;
        public String tag = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0027 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0015 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static /* synthetic */ int[] $SWITCH_TABLE$com$caverock$androidsvg$CSSParser$AttribOp() {
            /*
                int[] r0 = $SWITCH_TABLE$com$caverock$androidsvg$CSSParser$AttribOp
                if (r0 == 0) goto L_0x0005
                return r0
            L_0x0005:
                com.caverock.androidsvg.CSSParser$AttribOp[] r0 = com.caverock.androidsvg.CSSParser.AttribOp.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.caverock.androidsvg.CSSParser$AttribOp r1 = com.caverock.androidsvg.CSSParser.AttribOp.DASHMATCH     // Catch:{ NoSuchFieldError -> 0x0015 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0015 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                com.caverock.androidsvg.CSSParser$AttribOp r1 = com.caverock.androidsvg.CSSParser.AttribOp.EQUALS     // Catch:{ NoSuchFieldError -> 0x001e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001e }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001e }
            L_0x001e:
                com.caverock.androidsvg.CSSParser$AttribOp r1 = com.caverock.androidsvg.CSSParser.AttribOp.EXISTS     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0027 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                com.caverock.androidsvg.CSSParser$AttribOp r1 = com.caverock.androidsvg.CSSParser.AttribOp.INCLUDES     // Catch:{ NoSuchFieldError -> 0x0030 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0030 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0030 }
            L_0x0030:
                $SWITCH_TABLE$com$caverock$androidsvg$CSSParser$AttribOp = r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.CSSParser.isInside.$SWITCH_TABLE$com$caverock$androidsvg$CSSParser$AttribOp():int[]");
        }

        public isInside(Combinator combinator2, String str) {
            this.combinator = combinator2 == null ? Combinator.DESCENDANT : combinator2;
            this.tag = str;
        }

        public void addAttrib(String str, AttribOp attribOp, String str2) {
            if (this.attribs == null) {
                this.attribs = new ArrayList();
            }
            this.attribs.add(new setMax(str, attribOp, str2));
        }

        public void addPseudo(String str) {
            if (this.pseudos == null) {
                this.pseudos = new ArrayList();
            }
            this.pseudos.add(str);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.combinator == Combinator.CHILD) {
                sb.append("> ");
            } else if (this.combinator == Combinator.FOLLOWS) {
                sb.append("+ ");
            }
            String str = this.tag;
            if (str == null) {
                str = "*";
            }
            sb.append(str);
            List<setMax> list = this.attribs;
            if (list != null) {
                for (setMax next : list) {
                    sb.append('[');
                    sb.append(next.name);
                    int i = $SWITCH_TABLE$com$caverock$androidsvg$CSSParser$AttribOp()[next.operation.ordinal()];
                    if (i == 2) {
                        sb.append('=');
                        sb.append(next.value);
                    } else if (i == 3) {
                        sb.append("~=");
                        sb.append(next.value);
                    } else if (i == 4) {
                        sb.append("|=");
                        sb.append(next.value);
                    }
                    sb.append(']');
                }
            }
            List<String> list2 = this.pseudos;
            if (list2 != null) {
                for (String append : list2) {
                    sb.append(':');
                    sb.append(append);
                }
            }
            return sb.toString();
        }
    }

    public static class setMin {
        private List<getMax> rules = null;

        public void add(getMax getmax) {
            if (this.rules == null) {
                this.rules = new ArrayList();
            }
            for (int i = 0; i < this.rules.size(); i++) {
                if (this.rules.get(i).selector.specificity > getmax.selector.specificity) {
                    this.rules.add(i, getmax);
                    return;
                }
            }
            this.rules.add(getmax);
        }

        public void addAll(setMin setmin) {
            if (setmin.rules != null) {
                if (this.rules == null) {
                    this.rules = new ArrayList(setmin.rules.size());
                }
                for (getMax add : setmin.rules) {
                    this.rules.add(add);
                }
            }
        }

        public List<getMax> getRules() {
            return this.rules;
        }

        public boolean isEmpty() {
            List<getMax> list = this.rules;
            return list == null || list.isEmpty();
        }

        public String toString() {
            if (this.rules == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (getMax obj : this.rules) {
                sb.append(obj.toString());
                sb.append(10);
            }
            return sb.toString();
        }
    }

    public static class getMax {
        public length selector = null;
        public SVG.Style style = null;

        public getMax(length length, SVG.Style style2) {
            this.selector = length;
            this.style = style2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.selector);
            sb.append(" {}");
            return sb.toString();
        }
    }

    public static class length {
        public List<isInside> selector = null;
        public int specificity = 0;

        public void add(isInside isinside) {
            if (this.selector == null) {
                this.selector = new ArrayList();
            }
            this.selector.add(isinside);
        }

        public int size() {
            List<isInside> list = this.selector;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public isInside get(int i) {
            return this.selector.get(i);
        }

        public boolean isEmpty() {
            List<isInside> list = this.selector;
            if (list == null) {
                return true;
            }
            return list.isEmpty();
        }

        public void addedIdAttribute() {
            this.specificity += 10000;
        }

        public void addedAttributeOrPseudo() {
            this.specificity += 100;
        }

        public void addedElement() {
            this.specificity++;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (isInside append : this.selector) {
                sb.append(append);
                sb.append(' ');
            }
            sb.append('(');
            sb.append(this.specificity);
            sb.append(')');
            return sb.toString();
        }
    }

    public CSSParser(MediaType mediaType) {
        this.rendererMediaType = mediaType;
    }

    public final setMin parse(String str) throws SAXException {
        getMin getmin = new getMin(str);
        getmin.skipWhitespace();
        return parseRuleset(getmin);
    }

    public static boolean mediaMatches(String str, MediaType mediaType) throws SAXException {
        getMin getmin = new getMin(str);
        getmin.skipWhitespace();
        List<MediaType> parseMediaList = parseMediaList(getmin);
        if (getmin.empty()) {
            return mediaMatches(parseMediaList, mediaType);
        }
        throw new SAXException("Invalid @media type list");
    }

    static class getMin extends SVGParser.setMax {
        public getMin(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        public String nextIdentifier() {
            int scanForIdentifier = scanForIdentifier();
            if (scanForIdentifier == this.position) {
                return null;
            }
            String substring = this.input.substring(this.position, scanForIdentifier);
            this.position = scanForIdentifier;
            return substring;
        }

        private int scanForIdentifier() {
            if (empty()) {
                return this.position;
            }
            int i = this.position;
            int i2 = this.position;
            int charAt = this.input.charAt(this.position);
            if (charAt == 45) {
                charAt = advanceChar();
            }
            if ((charAt >= 65 && charAt <= 90) || ((charAt >= 97 && charAt <= 122) || charAt == 95)) {
                int advanceChar = advanceChar();
                while (true) {
                    if ((advanceChar < 65 || advanceChar > 90) && ((advanceChar < 97 || advanceChar > 122) && !((advanceChar >= 48 && advanceChar <= 57) || advanceChar == 45 || advanceChar == 95))) {
                        break;
                    }
                    advanceChar = advanceChar();
                }
                i2 = this.position;
            }
            this.position = i;
            return i2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0158  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x015c  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0156 A[EDGE_INSN: B:89:0x0156->B:82:0x0156 ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean nextSimpleSelector(com.caverock.androidsvg.CSSParser.length r11) throws org.xml.sax.SAXException {
            /*
                r10 = this;
                boolean r0 = r10.empty()
                r1 = 0
                if (r0 == 0) goto L_0x0008
                return r1
            L_0x0008:
                int r0 = r10.position
                boolean r2 = r11.isEmpty()
                r3 = 0
                if (r2 != 0) goto L_0x002d
                r2 = 62
                boolean r2 = r10.consume((char) r2)
                if (r2 == 0) goto L_0x001f
                com.caverock.androidsvg.CSSParser$Combinator r2 = com.caverock.androidsvg.CSSParser.Combinator.CHILD
                r10.skipWhitespace()
                goto L_0x002e
            L_0x001f:
                r2 = 43
                boolean r2 = r10.consume((char) r2)
                if (r2 == 0) goto L_0x002d
                com.caverock.androidsvg.CSSParser$Combinator r2 = com.caverock.androidsvg.CSSParser.Combinator.FOLLOWS
                r10.skipWhitespace()
                goto L_0x002e
            L_0x002d:
                r2 = r3
            L_0x002e:
                r4 = 42
                boolean r4 = r10.consume((char) r4)
                if (r4 == 0) goto L_0x003c
                com.caverock.androidsvg.CSSParser$isInside r4 = new com.caverock.androidsvg.CSSParser$isInside
                r4.<init>(r2, r3)
                goto L_0x004d
            L_0x003c:
                java.lang.String r4 = r10.nextIdentifier()
                if (r4 == 0) goto L_0x004c
                com.caverock.androidsvg.CSSParser$isInside r5 = new com.caverock.androidsvg.CSSParser$isInside
                r5.<init>(r2, r4)
                r11.addedElement()
                r4 = r5
                goto L_0x004d
            L_0x004c:
                r4 = r3
            L_0x004d:
                boolean r5 = r10.empty()
                r6 = 1
                if (r5 == 0) goto L_0x0056
                goto L_0x0156
            L_0x0056:
                r5 = 46
                boolean r5 = r10.consume((char) r5)
                if (r5 == 0) goto L_0x007e
                if (r4 != 0) goto L_0x0065
                com.caverock.androidsvg.CSSParser$isInside r4 = new com.caverock.androidsvg.CSSParser$isInside
                r4.<init>(r2, r3)
            L_0x0065:
                java.lang.String r5 = r10.nextIdentifier()
                if (r5 == 0) goto L_0x0076
                com.caverock.androidsvg.CSSParser$AttribOp r6 = com.caverock.androidsvg.CSSParser.AttribOp.EQUALS
                java.lang.String r7 = "class"
                r4.addAttrib(r7, r6, r5)
                r11.addedAttributeOrPseudo()
                goto L_0x004d
            L_0x0076:
                org.xml.sax.SAXException r11 = new org.xml.sax.SAXException
                java.lang.String r0 = "Invalid \".class\" selector in <style> element"
                r11.<init>(r0)
                throw r11
            L_0x007e:
                r5 = 35
                boolean r5 = r10.consume((char) r5)
                if (r5 == 0) goto L_0x00a6
                if (r4 != 0) goto L_0x008d
                com.caverock.androidsvg.CSSParser$isInside r4 = new com.caverock.androidsvg.CSSParser$isInside
                r4.<init>(r2, r3)
            L_0x008d:
                java.lang.String r5 = r10.nextIdentifier()
                if (r5 == 0) goto L_0x009e
                com.caverock.androidsvg.CSSParser$AttribOp r7 = com.caverock.androidsvg.CSSParser.AttribOp.EQUALS
                java.lang.String r8 = "id"
                r4.addAttrib(r8, r7, r5)
                r11.addedIdAttribute()
                goto L_0x00a6
            L_0x009e:
                org.xml.sax.SAXException r11 = new org.xml.sax.SAXException
                java.lang.String r0 = "Invalid \"#id\" selector in <style> element"
                r11.<init>(r0)
                throw r11
            L_0x00a6:
                if (r4 == 0) goto L_0x0156
                r5 = 91
                boolean r5 = r10.consume((char) r5)
                if (r5 == 0) goto L_0x0118
                r10.skipWhitespace()
                java.lang.String r5 = r10.nextIdentifier()
                java.lang.String r6 = "Invalid attribute selector in <style> element"
                if (r5 == 0) goto L_0x0112
                r10.skipWhitespace()
                r7 = 61
                boolean r7 = r10.consume((char) r7)
                if (r7 == 0) goto L_0x00c9
                com.caverock.androidsvg.CSSParser$AttribOp r7 = com.caverock.androidsvg.CSSParser.AttribOp.EQUALS
                goto L_0x00e2
            L_0x00c9:
                java.lang.String r7 = "~="
                boolean r7 = r10.consume((java.lang.String) r7)
                if (r7 == 0) goto L_0x00d5
                com.caverock.androidsvg.CSSParser$AttribOp r7 = com.caverock.androidsvg.CSSParser.AttribOp.INCLUDES
                goto L_0x00e2
            L_0x00d5:
                java.lang.String r7 = "|="
                boolean r7 = r10.consume((java.lang.String) r7)
                if (r7 == 0) goto L_0x00e1
                com.caverock.androidsvg.CSSParser$AttribOp r7 = com.caverock.androidsvg.CSSParser.AttribOp.DASHMATCH
                goto L_0x00e2
            L_0x00e1:
                r7 = r3
            L_0x00e2:
                if (r7 == 0) goto L_0x00f7
                r10.skipWhitespace()
                java.lang.String r8 = r10.nextAttribValue()
                if (r8 == 0) goto L_0x00f1
                r10.skipWhitespace()
                goto L_0x00f8
            L_0x00f1:
                org.xml.sax.SAXException r11 = new org.xml.sax.SAXException
                r11.<init>(r6)
                throw r11
            L_0x00f7:
                r8 = r3
            L_0x00f8:
                r9 = 93
                boolean r9 = r10.consume((char) r9)
                if (r9 == 0) goto L_0x010c
                if (r7 != 0) goto L_0x0104
                com.caverock.androidsvg.CSSParser$AttribOp r7 = com.caverock.androidsvg.CSSParser.AttribOp.EXISTS
            L_0x0104:
                r4.addAttrib(r5, r7, r8)
                r11.addedAttributeOrPseudo()
                goto L_0x004d
            L_0x010c:
                org.xml.sax.SAXException r11 = new org.xml.sax.SAXException
                r11.<init>(r6)
                throw r11
            L_0x0112:
                org.xml.sax.SAXException r11 = new org.xml.sax.SAXException
                r11.<init>(r6)
                throw r11
            L_0x0118:
                r2 = 58
                boolean r2 = r10.consume((char) r2)
                if (r2 == 0) goto L_0x0156
                int r2 = r10.position
                java.lang.String r3 = r10.nextIdentifier()
                if (r3 == 0) goto L_0x0156
                r3 = 40
                boolean r3 = r10.consume((char) r3)
                if (r3 == 0) goto L_0x0148
                r10.skipWhitespace()
                java.lang.String r3 = r10.nextIdentifier()
                if (r3 == 0) goto L_0x0148
                r10.skipWhitespace()
                r3 = 41
                boolean r3 = r10.consume((char) r3)
                if (r3 != 0) goto L_0x0148
                int r2 = r2 - r6
                r10.position = r2
                goto L_0x0156
            L_0x0148:
                java.lang.String r3 = r10.input
                int r5 = r10.position
                java.lang.String r2 = r3.substring(r2, r5)
                r4.addPseudo(r2)
                r11.addedAttributeOrPseudo()
            L_0x0156:
                if (r4 == 0) goto L_0x015c
                r11.add(r4)
                return r6
            L_0x015c:
                r10.position = r0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.CSSParser.getMin.nextSimpleSelector(com.caverock.androidsvg.CSSParser$length):boolean");
        }

        private String nextAttribValue() {
            if (empty()) {
                return null;
            }
            String nextQuotedString = nextQuotedString();
            if (nextQuotedString != null) {
                return nextQuotedString;
            }
            return nextIdentifier();
        }

        public String nextPropertyValue() {
            if (empty()) {
                return null;
            }
            int i = this.position;
            int i2 = this.position;
            int charAt = this.input.charAt(this.position);
            while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33 && !isEOL(charAt)) {
                if (!isWhitespace(charAt)) {
                    i2 = this.position + 1;
                }
                charAt = advanceChar();
            }
            if (this.position > i) {
                return this.input.substring(i, i2);
            }
            this.position = i;
            return null;
        }
    }

    private static boolean mediaMatches(List<MediaType> list, MediaType mediaType) {
        for (MediaType next : list) {
            if (next == MediaType.all) {
                return true;
            }
            if (next == mediaType) {
                return true;
            }
        }
        return false;
    }

    private static List<MediaType> parseMediaList(getMin getmin) throws SAXException {
        ArrayList arrayList = new ArrayList();
        while (!getmin.empty()) {
            try {
                arrayList.add(MediaType.valueOf(getmin.nextToken(',')));
                if (!getmin.skipCommaWhitespace()) {
                    break;
                }
            } catch (IllegalArgumentException unused) {
                throw new SAXException("Invalid @media type list");
            }
        }
        return arrayList;
    }

    private void parseAtRule(setMin setmin, getMin getmin) throws SAXException {
        String nextIdentifier = getmin.nextIdentifier();
        getmin.skipWhitespace();
        if (nextIdentifier != null) {
            if (this.inMediaRule || !nextIdentifier.equals("media")) {
                warn("Ignoring @%s rule", nextIdentifier);
                skipAtRule(getmin);
            } else {
                List<MediaType> parseMediaList = parseMediaList(getmin);
                if (getmin.consume('{')) {
                    getmin.skipWhitespace();
                    if (mediaMatches(parseMediaList, this.rendererMediaType)) {
                        this.inMediaRule = true;
                        setmin.addAll(parseRuleset(getmin));
                        this.inMediaRule = false;
                    } else {
                        parseRuleset(getmin);
                    }
                    if (!getmin.consume('}')) {
                        throw new SAXException("Invalid @media rule: expected '}' at end of rule set");
                    }
                } else {
                    throw new SAXException("Invalid @media rule: missing rule set");
                }
            }
            getmin.skipWhitespace();
            return;
        }
        throw new SAXException("Invalid '@' rule in <style> element");
    }

    private void skipAtRule(getMin getmin) {
        int i = 0;
        while (!getmin.empty()) {
            int intValue = getmin.nextChar().intValue();
            if (intValue != 59 || i != 0) {
                if (intValue == 123) {
                    i++;
                } else if (intValue == 125 && i > 0 && i - 1 == 0) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private setMin parseRuleset(getMin getmin) throws SAXException {
        setMin setmin = new setMin();
        while (!getmin.empty()) {
            if (!getmin.consume("<!--") && !getmin.consume("-->")) {
                if (!getmin.consume('@')) {
                    if (!parseRule(setmin, getmin)) {
                        break;
                    }
                } else {
                    parseAtRule(setmin, getmin);
                }
            }
        }
        return setmin;
    }

    private boolean parseRule(setMin setmin, getMin getmin) throws SAXException {
        List<length> parseSelectorGroup = parseSelectorGroup(getmin);
        if (parseSelectorGroup == null || parseSelectorGroup.isEmpty()) {
            return false;
        }
        if (getmin.consume('{')) {
            getmin.skipWhitespace();
            SVG.Style parseDeclarations = parseDeclarations(getmin);
            getmin.skipWhitespace();
            for (length getmax : parseSelectorGroup) {
                setmin.add(new getMax(getmax, parseDeclarations));
            }
            return true;
        }
        throw new SAXException("Malformed rule block in <style> element: missing '{'");
    }

    private List<length> parseSelectorGroup(getMin getmin) throws SAXException {
        if (getmin.empty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        length length2 = new length();
        while (!getmin.empty() && getmin.nextSimpleSelector(length2)) {
            if (getmin.skipCommaWhitespace()) {
                arrayList.add(length2);
                length2 = new length();
            }
        }
        if (!length2.isEmpty()) {
            arrayList.add(length2);
        }
        return arrayList;
    }

    private SVG.Style parseDeclarations(getMin getmin) throws SAXException {
        SVG.Style style = new SVG.Style();
        do {
            String nextIdentifier = getmin.nextIdentifier();
            getmin.skipWhitespace();
            if (!getmin.consume(':')) {
                break;
            }
            getmin.skipWhitespace();
            String nextPropertyValue = getmin.nextPropertyValue();
            if (nextPropertyValue == null) {
                break;
            }
            getmin.skipWhitespace();
            if (getmin.consume('!')) {
                getmin.skipWhitespace();
                if (getmin.consume("important")) {
                    getmin.skipWhitespace();
                } else {
                    throw new SAXException("Malformed rule set in <style> element: found unexpected '!'");
                }
            }
            getmin.consume(';');
            SVGParser.processStyleProperty(style, nextIdentifier, nextPropertyValue);
            getmin.skipWhitespace();
            if (getmin.consume('}')) {
                return style;
            }
        } while (!getmin.empty());
        throw new SAXException("Malformed rule set in <style> element");
    }

    protected static List<String> parseClassAttribute(String str) throws SAXException {
        getMin getmin = new getMin(str);
        ArrayList arrayList = null;
        while (!getmin.empty()) {
            String nextIdentifier = getmin.nextIdentifier();
            if (nextIdentifier != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(nextIdentifier);
                getmin.skipWhitespace();
            } else {
                throw new SAXException("Invalid value for \"class\" attribute: ".concat(String.valueOf(str)));
            }
        }
        return arrayList;
    }

    public static boolean ruleMatch(length length2, SVG.ICustomTabsCallback.Stub stub) {
        ArrayList arrayList = new ArrayList();
        for (SVG.onTransact ontransact = stub.parent; ontransact != null; ontransact = ((SVG.ICustomTabsCallback.Stub.Proxy) ontransact).parent) {
            arrayList.add(0, ontransact);
        }
        int size = arrayList.size() - 1;
        if (length2.size() == 1) {
            return selectorMatch(length2.get(0), arrayList, size, stub);
        }
        return ruleMatch(length2, length2.size() - 1, arrayList, size, stub);
    }

    private static boolean ruleMatch(length length2, int i, List<SVG.onTransact> list, int i2, SVG.ICustomTabsCallback.Stub stub) {
        while (true) {
            isInside isinside = length2.get(i);
            if (!selectorMatch(isinside, list, i2, stub)) {
                return false;
            }
            if (isinside.combinator == Combinator.DESCENDANT) {
                if (i == 0) {
                    return true;
                }
                while (i2 >= 0) {
                    if (ruleMatchOnAncestors(length2, i - 1, list, i2)) {
                        return true;
                    }
                    i2--;
                }
                return false;
            } else if (isinside.combinator == Combinator.CHILD) {
                return ruleMatchOnAncestors(length2, i - 1, list, i2);
            } else {
                int childPosition = getChildPosition(list, i2, stub);
                if (childPosition <= 0) {
                    return false;
                }
                stub = (SVG.ICustomTabsCallback.Stub) stub.parent.getChildren().get(childPosition - 1);
                i--;
            }
        }
    }

    private static boolean ruleMatchOnAncestors(length length2, int i, List<SVG.onTransact> list, int i2) {
        while (true) {
            isInside isinside = length2.get(i);
            SVG.ICustomTabsCallback.Stub stub = (SVG.ICustomTabsCallback.Stub) list.get(i2);
            if (!selectorMatch(isinside, list, i2, stub)) {
                return false;
            }
            if (isinside.combinator == Combinator.DESCENDANT) {
                if (i == 0) {
                    return true;
                }
                while (i2 > 0) {
                    i2--;
                    if (ruleMatchOnAncestors(length2, i - 1, list, i2)) {
                        return true;
                    }
                }
                return false;
            } else if (isinside.combinator == Combinator.CHILD) {
                i--;
                i2--;
            } else {
                int childPosition = getChildPosition(list, i2, stub);
                if (childPosition <= 0) {
                    return false;
                }
                return ruleMatch(length2, i - 1, list, i2, (SVG.ICustomTabsCallback.Stub) stub.parent.getChildren().get(childPosition - 1));
            }
        }
    }

    private static int getChildPosition(List<SVG.onTransact> list, int i, SVG.ICustomTabsCallback.Stub stub) {
        if (i < 0 || list.get(i) != stub.parent) {
            return -1;
        }
        int i2 = 0;
        for (SVG.ICustomTabsCallback.Stub.Proxy proxy : stub.parent.getChildren()) {
            if (proxy == stub) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean selectorMatch(com.caverock.androidsvg.CSSParser.isInside r5, java.util.List<com.caverock.androidsvg.SVG.onTransact> r6, int r7, com.caverock.androidsvg.SVG.ICustomTabsCallback.Stub r8) {
        /*
            java.lang.String r0 = r5.tag
            r1 = 0
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = r5.tag
            java.lang.String r2 = "G"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0014
            boolean r0 = r8 instanceof com.caverock.androidsvg.SVG.toDoubleRange
            if (r0 != 0) goto L_0x002b
            return r1
        L_0x0014:
            java.lang.String r0 = r5.tag
            java.lang.Class r2 = r8.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r3)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x002b
            return r1
        L_0x002b:
            java.util.List<com.caverock.androidsvg.CSSParser$setMax> r0 = r5.attribs
            if (r0 == 0) goto L_0x0069
            java.util.List<com.caverock.androidsvg.CSSParser$setMax> r0 = r5.attribs
            java.util.Iterator r0 = r0.iterator()
        L_0x0035:
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L_0x003c
            goto L_0x0069
        L_0x003c:
            java.lang.Object r2 = r0.next()
            com.caverock.androidsvg.CSSParser$setMax r2 = (com.caverock.androidsvg.CSSParser.setMax) r2
            java.lang.String r3 = r2.name
            java.lang.String r4 = "id"
            if (r3 != r4) goto L_0x0053
            java.lang.String r2 = r2.value
            java.lang.String r3 = r8.f9526id
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0035
            return r1
        L_0x0053:
            java.lang.String r3 = r2.name
            java.lang.String r4 = "class"
            if (r3 != r4) goto L_0x0068
            java.util.List<java.lang.String> r3 = r8.classNames
            if (r3 != 0) goto L_0x005e
            return r1
        L_0x005e:
            java.util.List<java.lang.String> r3 = r8.classNames
            java.lang.String r2 = r2.value
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L_0x0035
        L_0x0068:
            return r1
        L_0x0069:
            java.util.List<java.lang.String> r0 = r5.pseudos
            if (r0 == 0) goto L_0x008f
            java.util.List<java.lang.String> r5 = r5.pseudos
            java.util.Iterator r5 = r5.iterator()
        L_0x0073:
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L_0x007a
            goto L_0x008f
        L_0x007a:
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "first-child"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x008e
            int r0 = getChildPosition(r6, r7, r8)
            if (r0 == 0) goto L_0x0073
        L_0x008e:
            return r1
        L_0x008f:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.CSSParser.selectorMatch(com.caverock.androidsvg.CSSParser$isInside, java.util.List, int, com.caverock.androidsvg.SVG$ICustomTabsCallback$Stub):boolean");
    }
}
