package o;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class exception2String implements asciiBytes, MonitorPrinter {
    private static final Pattern FastBitmap$CoordinateSystem = Pattern.compile(" *$");
    private static final Pattern IsOverlapping = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    private static final Pattern equals = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    private static final Pattern getMax = Pattern.compile("^(?:\"(\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|[^\"\\x00])*\"|'(\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|[^'\\x00])*'|\\((\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|[^)\\x00])*\\))");
    private static final Pattern getMin = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    private static final Pattern hashCode = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    private static final Pattern invoke = Pattern.compile("^ *(?:\n|$)");
    private static final Pattern isInside = Pattern.compile("`+");
    private static final Pattern length = Pattern.compile("^\\[(?:[^\\\\\\[\\]]|\\\\.)*\\]");
    private static final Pattern setMax = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    private static final Pattern setMin = Pattern.compile("^(?:[<](?:[^<> \\t\\n\\\\]|\\\\.)*[>])");
    private static final Pattern toDoubleRange = Pattern.compile("^ *(?:\n *)?");
    private static final Pattern toFloatRange = Pattern.compile("^`+");
    private static final Pattern toIntRange = Pattern.compile("^&(?:#x[a-f0-9]{1,8}|#[0-9]{1,8}|[a-z][a-z0-9]{1,31});", 2);
    private static final Pattern toString = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    private static final Pattern values = Pattern.compile("\\s+");
    private final BitSet Grayscale$Algorithm;
    private Base64$OutputStream ICustomTabsCallback;
    private Map<String, decodeFileToFile> Mean$Arithmetic = new HashMap();
    private String b;
    private getCommonPrefix create;
    private int getCause;
    private final BitSet invokeSuspend;
    private createAndroidLogImpl onNavigationEvent;
    private final Map<Character, setOkButtonText> valueOf;

    public exception2String(List<setOkButtonText> list) {
        HashMap hashMap = new HashMap();
        setMin(Arrays.asList(new setOkButtonText[]{new setMonitorPrinter(), new SCNetworkAsyncTaskExecutor()}), hashMap);
        setMin(list, hashMap);
        this.valueOf = hashMap;
        BitSet max = getMax(hashMap.keySet());
        this.Grayscale$Algorithm = max;
        BitSet bitSet = new BitSet();
        bitSet.or(max);
        bitSet.set(10);
        bitSet.set(96);
        bitSet.set(91);
        bitSet.set(93);
        bitSet.set(92);
        bitSet.set(33);
        bitSet.set(60);
        bitSet.set(38);
        this.invokeSuspend = bitSet;
    }

    private static BitSet getMax(Set<Character> set) {
        BitSet bitSet = new BitSet();
        for (Character charValue : set) {
            bitSet.set(charValue.charValue());
        }
        return bitSet;
    }

    private static void setMin(Iterable<setOkButtonText> iterable, Map<Character, setOkButtonText> map) {
        DefaultMonitorPrinter defaultMonitorPrinter;
        for (setOkButtonText next : iterable) {
            char length2 = next.length();
            char max = next.getMax();
            if (length2 == max) {
                setOkButtonText setokbuttontext = map.get(Character.valueOf(length2));
                if (setokbuttontext == null || setokbuttontext.length() != setokbuttontext.getMax()) {
                    setMin(length2, next, map);
                } else {
                    if (setokbuttontext instanceof DefaultMonitorPrinter) {
                        defaultMonitorPrinter = (DefaultMonitorPrinter) setokbuttontext;
                    } else {
                        DefaultMonitorPrinter defaultMonitorPrinter2 = new DefaultMonitorPrinter(length2);
                        defaultMonitorPrinter2.length(setokbuttontext);
                        defaultMonitorPrinter = defaultMonitorPrinter2;
                    }
                    defaultMonitorPrinter.length(next);
                    map.put(Character.valueOf(length2), defaultMonitorPrinter);
                }
            } else {
                setMin(length2, next, map);
                setMin(max, next, map);
            }
        }
    }

    private static void setMin(char c, setOkButtonText setokbuttontext, Map<Character, setOkButtonText> map) {
        if (map.put(Character.valueOf(c), setokbuttontext) != null) {
            StringBuilder sb = new StringBuilder("Delimiter processor conflict with delimiter char '");
            sb.append(c);
            sb.append("'");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final void getMax(String str, Base64$OutputStream base64$OutputStream) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(1890587349, oncanceled);
            onCancelLoad.getMin(1890587349, oncanceled);
        }
        this.ICustomTabsCallback = base64$OutputStream;
        this.b = str.trim();
        this.getCause = 0;
        this.create = null;
        this.onNavigationEvent = null;
        do {
        } while (getMax());
        length((getCommonPrefix) null);
        if (base64$OutputStream.toIntRange != base64$OutputStream.toFloatRange) {
            length(base64$OutputStream.toIntRange, base64$OutputStream.toFloatRange);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0081, code lost:
        if (length(invoke) != null) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int length(java.lang.String r9) {
        /*
            r8 = this;
            r8.b = r9
            r9 = 0
            r8.getCause = r9
            java.util.regex.Pattern r0 = length
            java.lang.String r0 = r8.length((java.util.regex.Pattern) r0)
            if (r0 == 0) goto L_0x001b
            int r1 = r0.length()
            r2 = 1001(0x3e9, float:1.403E-42)
            if (r1 <= r2) goto L_0x0016
            goto L_0x001b
        L_0x0016:
            int r0 = r0.length()
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 != 0) goto L_0x001f
            return r9
        L_0x001f:
            java.lang.String r1 = r8.b
            java.lang.String r0 = r1.substring(r9, r0)
            char r1 = r8.setMax()
            r2 = 58
            if (r1 == r2) goto L_0x002e
            return r9
        L_0x002e:
            int r1 = r8.getCause
            r2 = 1
            int r1 = r1 + r2
            r8.getCause = r1
            r8.getMin()
            java.lang.String r1 = r8.toFloatRange()
            if (r1 == 0) goto L_0x00ab
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0044
            goto L_0x00ab
        L_0x0044:
            int r3 = r8.getCause
            r8.getMin()
            java.util.regex.Pattern r4 = getMax
            java.lang.String r4 = r8.length((java.util.regex.Pattern) r4)
            r5 = 0
            if (r4 == 0) goto L_0x0060
            int r6 = r4.length()
            int r6 = r6 - r2
            java.lang.String r4 = r4.substring(r2, r6)
            java.lang.String r4 = o.DefaultSCNetworkAsyncTaskExecutor.getMax(r4)
            goto L_0x0061
        L_0x0060:
            r4 = r5
        L_0x0061:
            if (r4 != 0) goto L_0x0065
            r8.getCause = r3
        L_0x0065:
            int r6 = r8.getCause
            java.lang.String r7 = r8.b
            int r7 = r7.length()
            if (r6 == r7) goto L_0x0087
            java.util.regex.Pattern r6 = invoke
            java.lang.String r6 = r8.length((java.util.regex.Pattern) r6)
            if (r6 != 0) goto L_0x0087
            if (r4 == 0) goto L_0x0084
            r8.getCause = r3
            java.util.regex.Pattern r3 = invoke
            java.lang.String r3 = r8.length((java.util.regex.Pattern) r3)
            if (r3 == 0) goto L_0x0085
            goto L_0x0086
        L_0x0084:
            r5 = r4
        L_0x0085:
            r2 = 0
        L_0x0086:
            r4 = r5
        L_0x0087:
            if (r2 != 0) goto L_0x008a
            return r9
        L_0x008a:
            java.lang.String r0 = o.DefaultSCNetworkAsyncTaskExecutor.length(r0)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0095
            return r9
        L_0x0095:
            java.util.Map<java.lang.String, o.decodeFileToFile> r2 = r8.Mean$Arithmetic
            boolean r2 = r2.containsKey(r0)
            if (r2 != 0) goto L_0x00a7
            o.decodeFileToFile r2 = new o.decodeFileToFile
            r2.<init>(r1, r4)
            java.util.Map<java.lang.String, o.decodeFileToFile> r1 = r8.Mean$Arithmetic
            r1.put(r0, r2)
        L_0x00a7:
            int r0 = r8.getCause
            int r0 = r0 - r9
            return r0
        L_0x00ab:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.exception2String.length(java.lang.String):int");
    }

    private WSContextUtil setMax(CharSequence charSequence, int i, int i2) {
        WSContextUtil wSContextUtil = new WSContextUtil(charSequence.subSequence(i, i2).toString());
        this.ICustomTabsCallback.getMax(wSContextUtil);
        return wSContextUtil;
    }

    private boolean getMax() {
        char max = setMax();
        boolean z = false;
        if (max == 0) {
            return false;
        }
        if (max == 10) {
            z = length();
        } else if (max == '!') {
            z = equals();
        } else if (max == '&') {
            z = invoke();
        } else if (max != '<') {
            if (max != '`') {
                switch (max) {
                    case '[':
                        z = IsOverlapping();
                        break;
                    case '\\':
                        z = setMin();
                        break;
                    case ']':
                        z = isInside();
                        break;
                    default:
                        if (!this.Grayscale$Algorithm.get(max)) {
                            z = Mean$Arithmetic();
                            break;
                        } else {
                            z = getMin(this.valueOf.get(Character.valueOf(max)), max);
                            break;
                        }
                }
            } else {
                z = toIntRange();
            }
        } else if (values() || FastBitmap$CoordinateSystem()) {
            z = true;
        }
        if (!z) {
            this.getCause++;
            this.ICustomTabsCallback.getMax(new WSContextUtil(String.valueOf(max).toString()));
        }
        return true;
    }

    private String length(Pattern pattern) {
        if (this.getCause >= this.b.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.b);
        matcher.region(this.getCause, this.b.length());
        if (!matcher.find()) {
            return null;
        }
        this.getCause = matcher.end();
        return matcher.group();
    }

    private char setMax() {
        if (this.getCause < this.b.length()) {
            return this.b.charAt(this.getCause);
        }
        return 0;
    }

    private boolean getMin() {
        length(toDoubleRange);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069 A[LOOP:0: B:18:0x0061->B:20:0x0069, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean length() {
        /*
            r6 = this;
            int r0 = r6.getCause
            r1 = 1
            int r0 = r0 + r1
            r6.getCause = r0
            o.Base64$OutputStream r0 = r6.ICustomTabsCallback
            o.Base64$OutputStream r0 = r0.toFloatRange
            if (r0 == 0) goto L_0x0057
            boolean r2 = r0 instanceof o.WSContextUtil
            if (r2 == 0) goto L_0x0057
            o.WSContextUtil r0 = (o.WSContextUtil) r0
            java.lang.String r2 = r0.getMin
            java.lang.String r3 = " "
            boolean r2 = r2.endsWith(r3)
            if (r2 == 0) goto L_0x0057
            java.lang.String r2 = r0.getMin
            java.util.regex.Pattern r3 = FastBitmap$CoordinateSystem
            java.util.regex.Matcher r3 = r3.matcher(r2)
            boolean r4 = r3.find()
            r5 = 0
            if (r4 == 0) goto L_0x0035
            int r4 = r3.end()
            int r3 = r3.start()
            int r4 = r4 - r3
            goto L_0x0036
        L_0x0035:
            r4 = 0
        L_0x0036:
            if (r4 <= 0) goto L_0x0043
            int r3 = r2.length()
            int r3 = r3 - r4
            java.lang.String r2 = r2.substring(r5, r3)
            r0.getMin = r2
        L_0x0043:
            r0 = 2
            if (r4 < r0) goto L_0x004c
            o.decodeToFile r0 = new o.decodeToFile
            r0.<init>()
            goto L_0x0051
        L_0x004c:
            o.resumeEncoding r0 = new o.resumeEncoding
            r0.<init>()
        L_0x0051:
            o.Base64$OutputStream r2 = r6.ICustomTabsCallback
            r2.getMax(r0)
            goto L_0x0061
        L_0x0057:
            o.resumeEncoding r0 = new o.resumeEncoding
            r0.<init>()
            o.Base64$OutputStream r2 = r6.ICustomTabsCallback
            r2.getMax(r0)
        L_0x0061:
            char r0 = r6.setMax()
            r2 = 32
            if (r0 != r2) goto L_0x006f
            int r0 = r6.getCause
            int r0 = r0 + r1
            r6.getCause = r0
            goto L_0x0061
        L_0x006f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.exception2String.length():boolean");
    }

    private boolean setMin() {
        this.getCause++;
        if (setMax() == 10) {
            this.ICustomTabsCallback.getMax(new decodeToFile());
            this.getCause++;
        } else {
            if (this.getCause < this.b.length()) {
                Pattern pattern = equals;
                String str = this.b;
                int i = this.getCause;
                if (pattern.matcher(str.substring(i, i + 1)).matches()) {
                    String str2 = this.b;
                    int i2 = this.getCause;
                    setMax(str2, i2, i2 + 1);
                    this.getCause++;
                }
            }
            this.ICustomTabsCallback.getMax(new WSContextUtil("\\".toString()));
        }
        return true;
    }

    private boolean toIntRange() {
        String length2;
        String length3 = length(toFloatRange);
        if (length3 == null) {
            return false;
        }
        int i = this.getCause;
        do {
            length2 = length(isInside);
            if (length2 == null) {
                this.getCause = i;
                this.ICustomTabsCallback.getMax(new WSContextUtil(length3.toString()));
                return true;
            }
        } while (!length2.equals(length3));
        encode3to4 encode3to4 = new encode3to4();
        encode3to4.length = values.matcher(this.b.substring(i, this.getCause - length3.length()).trim()).replaceAll(" ");
        this.ICustomTabsCallback.getMax(encode3to4);
        return true;
    }

    private boolean IsOverlapping() {
        int i = this.getCause;
        this.getCause = i + 1;
        WSContextUtil wSContextUtil = new WSContextUtil("[".toString());
        this.ICustomTabsCallback.getMax(wSContextUtil);
        createAndroidLogImpl createandroidlogimpl = new createAndroidLogImpl(wSContextUtil, i, this.onNavigationEvent, this.create, false);
        createAndroidLogImpl createandroidlogimpl2 = this.onNavigationEvent;
        if (createandroidlogimpl2 != null) {
            createandroidlogimpl2.toFloatRange = true;
        }
        this.onNavigationEvent = createandroidlogimpl;
        return true;
    }

    private boolean equals() {
        int i = this.getCause;
        this.getCause = i + 1;
        if (setMax() == '[') {
            this.getCause++;
            WSContextUtil wSContextUtil = new WSContextUtil("![".toString());
            this.ICustomTabsCallback.getMax(wSContextUtil);
            createAndroidLogImpl createandroidlogimpl = new createAndroidLogImpl(wSContextUtil, i + 1, this.onNavigationEvent, this.create, true);
            createAndroidLogImpl createandroidlogimpl2 = this.onNavigationEvent;
            if (createandroidlogimpl2 != null) {
                createandroidlogimpl2.toFloatRange = true;
            }
            this.onNavigationEvent = createandroidlogimpl;
        } else {
            this.ICustomTabsCallback.getMax(new WSContextUtil("!".toString()));
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isInside() {
        /*
            r13 = this;
            int r0 = r13.getCause
            r1 = 1
            int r0 = r0 + r1
            r13.getCause = r0
            o.createAndroidLogImpl r2 = r13.onNavigationEvent
            java.lang.String r3 = "]"
            if (r2 != 0) goto L_0x001b
            o.WSContextUtil r0 = new o.WSContextUtil
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            o.Base64$OutputStream r2 = r13.ICustomTabsCallback
            r2.getMax(r0)
            return r1
        L_0x001b:
            boolean r4 = r2.isInside
            if (r4 != 0) goto L_0x0034
            o.WSContextUtil r0 = new o.WSContextUtil
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            o.Base64$OutputStream r2 = r13.ICustomTabsCallback
            r2.getMax(r0)
            o.createAndroidLogImpl r0 = r13.onNavigationEvent
            o.createAndroidLogImpl r0 = r0.getMin
            r13.onNavigationEvent = r0
            return r1
        L_0x0034:
            char r4 = r13.setMax()
            r5 = 40
            r6 = 0
            r7 = 0
            if (r4 != r5) goto L_0x0095
            int r4 = r13.getCause
            int r4 = r4 + r1
            r13.getCause = r4
            r13.getMin()
            java.lang.String r4 = r13.toFloatRange()
            if (r4 == 0) goto L_0x0093
            r13.getMin()
            java.util.regex.Pattern r5 = values
            java.lang.String r8 = r13.b
            int r9 = r13.getCause
            int r10 = r9 + -1
            java.lang.String r8 = r8.substring(r10, r9)
            java.util.regex.Matcher r5 = r5.matcher(r8)
            boolean r5 = r5.matches()
            if (r5 == 0) goto L_0x0080
            java.util.regex.Pattern r5 = getMax
            java.lang.String r5 = r13.length((java.util.regex.Pattern) r5)
            if (r5 == 0) goto L_0x007b
            int r8 = r5.length()
            int r8 = r8 - r1
            java.lang.String r5 = r5.substring(r1, r8)
            java.lang.String r5 = o.DefaultSCNetworkAsyncTaskExecutor.getMax(r5)
            goto L_0x007c
        L_0x007b:
            r5 = r7
        L_0x007c:
            r13.getMin()
            goto L_0x0081
        L_0x0080:
            r5 = r7
        L_0x0081:
            char r8 = r13.setMax()
            r9 = 41
            if (r8 != r9) goto L_0x0090
            int r8 = r13.getCause
            int r8 = r8 + r1
            r13.getCause = r8
            r8 = 1
            goto L_0x0098
        L_0x0090:
            r13.getCause = r0
            goto L_0x0097
        L_0x0093:
            r5 = r7
            goto L_0x0097
        L_0x0095:
            r4 = r7
            r5 = r4
        L_0x0097:
            r8 = 0
        L_0x0098:
            if (r8 != 0) goto L_0x00df
            int r9 = r13.getCause
            java.util.regex.Pattern r10 = length
            java.lang.String r10 = r13.length((java.util.regex.Pattern) r10)
            if (r10 == 0) goto L_0x00b2
            int r11 = r10.length()
            r12 = 1001(0x3e9, float:1.403E-42)
            if (r11 <= r12) goto L_0x00ad
            goto L_0x00b2
        L_0x00ad:
            int r10 = r10.length()
            goto L_0x00b3
        L_0x00b2:
            r10 = 0
        L_0x00b3:
            r11 = 2
            if (r10 <= r11) goto L_0x00be
            java.lang.String r7 = r13.b
            int r10 = r10 + r9
            java.lang.String r7 = r7.substring(r9, r10)
            goto L_0x00ca
        L_0x00be:
            boolean r9 = r2.toFloatRange
            if (r9 != 0) goto L_0x00ca
            java.lang.String r7 = r13.b
            int r9 = r2.setMax
            java.lang.String r7 = r7.substring(r9, r0)
        L_0x00ca:
            if (r7 == 0) goto L_0x00df
            java.util.Map<java.lang.String, o.decodeFileToFile> r9 = r13.Mean$Arithmetic
            java.lang.String r7 = o.DefaultSCNetworkAsyncTaskExecutor.length(r7)
            java.lang.Object r7 = r9.get(r7)
            o.decodeFileToFile r7 = (o.decodeFileToFile) r7
            if (r7 == 0) goto L_0x00df
            java.lang.String r4 = r7.getMax
            java.lang.String r5 = r7.setMax
            r8 = 1
        L_0x00df:
            if (r8 == 0) goto L_0x0131
            boolean r0 = r2.length
            if (r0 == 0) goto L_0x00eb
            o.Base64$InputStream r0 = new o.Base64$InputStream
            r0.<init>(r4, r5)
            goto L_0x00f0
        L_0x00eb:
            o.decodeFileToFile r0 = new o.decodeFileToFile
            r0.<init>(r4, r5)
        L_0x00f0:
            o.WSContextUtil r3 = r2.setMin
            o.Base64$OutputStream r3 = r3.IsOverlapping
        L_0x00f4:
            if (r3 == 0) goto L_0x00fd
            o.Base64$OutputStream r4 = r3.IsOverlapping
            r0.getMax(r3)
            r3 = r4
            goto L_0x00f4
        L_0x00fd:
            o.Base64$OutputStream r3 = r13.ICustomTabsCallback
            r3.getMax(r0)
            o.getCommonPrefix r3 = r2.getMax
            r13.length((o.getCommonPrefix) r3)
            o.Base64$OutputStream r3 = r0.toIntRange
            o.Base64$OutputStream r4 = r0.toFloatRange
            if (r3 == r4) goto L_0x0114
            o.Base64$OutputStream r3 = r0.toIntRange
            o.Base64$OutputStream r0 = r0.toFloatRange
            length(r3, r0)
        L_0x0114:
            o.WSContextUtil r0 = r2.setMin
            r0.toIntRange()
            o.createAndroidLogImpl r0 = r13.onNavigationEvent
            o.createAndroidLogImpl r0 = r0.getMin
            r13.onNavigationEvent = r0
            boolean r0 = r2.length
            if (r0 != 0) goto L_0x0130
            o.createAndroidLogImpl r0 = r13.onNavigationEvent
        L_0x0125:
            if (r0 == 0) goto L_0x0130
            boolean r2 = r0.length
            if (r2 != 0) goto L_0x012d
            r0.isInside = r6
        L_0x012d:
            o.createAndroidLogImpl r0 = r0.getMin
            goto L_0x0125
        L_0x0130:
            return r1
        L_0x0131:
            o.WSContextUtil r2 = new o.WSContextUtil
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            o.Base64$OutputStream r3 = r13.ICustomTabsCallback
            r3.getMax(r2)
            o.createAndroidLogImpl r2 = r13.onNavigationEvent
            o.createAndroidLogImpl r2 = r2.getMin
            r13.onNavigationEvent = r2
            r13.getCause = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.exception2String.isInside():boolean");
    }

    private String toFloatRange() {
        String length2 = length(setMin);
        if (length2 == null) {
            int i = this.getCause;
            toDoubleRange();
            return DefaultSCNetworkAsyncTaskExecutor.getMax(this.b.substring(i, this.getCause));
        } else if (length2.length() == 2) {
            return "";
        } else {
            return DefaultSCNetworkAsyncTaskExecutor.getMax(length2.substring(1, length2.length() - 1));
        }
    }

    private void toDoubleRange() {
        int i = 0;
        while (true) {
            char max = setMax();
            if (max != 0 && max != ' ') {
                if (max == '\\') {
                    this.getCause++;
                    if (setMax() == 0) {
                        return;
                    }
                } else if (max == '(') {
                    i++;
                } else if (max != ')') {
                    if (Character.isISOControl(max)) {
                        return;
                    }
                } else if (i != 0) {
                    i--;
                } else {
                    return;
                }
                this.getCause++;
            } else {
                return;
            }
        }
    }

    private boolean values() {
        String length2 = length(IsOverlapping);
        if (length2 != null) {
            String substring = length2.substring(1, length2.length() - 1);
            decodeFileToFile decodefiletofile = new decodeFileToFile("mailto:".concat(String.valueOf(substring)), (String) null);
            decodefiletofile.getMax(new WSContextUtil(substring));
            this.ICustomTabsCallback.getMax(decodefiletofile);
            return true;
        }
        String length3 = length(toString);
        if (length3 == null) {
            return false;
        }
        String substring2 = length3.substring(1, length3.length() - 1);
        decodeFileToFile decodefiletofile2 = new decodeFileToFile(substring2, (String) null);
        decodefiletofile2.getMax(new WSContextUtil(substring2));
        this.ICustomTabsCallback.getMax(decodefiletofile2);
        return true;
    }

    private boolean FastBitmap$CoordinateSystem() {
        String length2 = length(getMin);
        if (length2 == null) {
            return false;
        }
        encodeFileToFile encodefiletofile = new encodeFileToFile();
        encodefiletofile.length = length2;
        this.ICustomTabsCallback.getMax(encodefiletofile);
        return true;
    }

    private boolean invoke() {
        String length2 = length(toIntRange);
        if (length2 == null) {
            return false;
        }
        this.ICustomTabsCallback.getMax(new WSContextUtil(SSLExtensionsFactory.getMin(length2).toString()));
        return true;
    }

    private boolean Mean$Arithmetic() {
        int i = this.getCause;
        int length2 = this.b.length();
        while (true) {
            int i2 = this.getCause;
            if (i2 == length2 || this.invokeSuspend.get(this.b.charAt(i2))) {
                int i3 = this.getCause;
            } else {
                this.getCause++;
            }
        }
        int i32 = this.getCause;
        if (i == i32) {
            return false;
        }
        setMax(this.b, i, i32);
        return true;
    }

    private void length(getCommonPrefix getcommonprefix) {
        boolean z;
        HashMap hashMap = new HashMap();
        getCommonPrefix getcommonprefix2 = this.create;
        while (getcommonprefix2 != null && getcommonprefix2.length != getcommonprefix) {
            getcommonprefix2 = getcommonprefix2.length;
        }
        while (getcommonprefix2 != null) {
            char c = getcommonprefix2.getMax;
            setOkButtonText setokbuttontext = this.valueOf.get(Character.valueOf(c));
            if (!getcommonprefix2.getMin || setokbuttontext == null) {
                getcommonprefix2 = getcommonprefix2.toIntRange;
            } else {
                char length2 = setokbuttontext.length();
                getCommonPrefix getcommonprefix3 = getcommonprefix2.length;
                int i = 0;
                boolean z2 = false;
                while (true) {
                    z = true;
                    if (getcommonprefix3 == null || getcommonprefix3 == getcommonprefix || getcommonprefix3 == hashMap.get(Character.valueOf(c))) {
                        z = false;
                    } else {
                        if (getcommonprefix3.setMin && getcommonprefix3.getMax == length2) {
                            i = setokbuttontext.getMax(getcommonprefix3, getcommonprefix2);
                            z2 = true;
                            if (i > 0) {
                                break;
                            }
                        }
                        getcommonprefix3 = getcommonprefix3.length;
                    }
                }
                z = false;
                if (!z) {
                    if (!z2) {
                        hashMap.put(Character.valueOf(c), getcommonprefix2.length);
                        if (!getcommonprefix2.setMin) {
                            setMax(getcommonprefix2);
                        }
                    }
                    getcommonprefix2 = getcommonprefix2.toIntRange;
                } else {
                    WSContextUtil wSContextUtil = getcommonprefix3.setMax;
                    WSContextUtil wSContextUtil2 = getcommonprefix2.setMax;
                    getcommonprefix3.equals -= i;
                    getcommonprefix2.equals -= i;
                    wSContextUtil.getMin = wSContextUtil.getMin.substring(0, wSContextUtil.getMin.length() - i);
                    wSContextUtil2.getMin = wSContextUtil2.getMin.substring(0, wSContextUtil2.getMin.length() - i);
                    getMax(getcommonprefix3, getcommonprefix2);
                    setMax(wSContextUtil, wSContextUtil2);
                    setokbuttontext.getMax(wSContextUtil, wSContextUtil2, i);
                    if (getcommonprefix3.equals == 0) {
                        getcommonprefix3.setMax.toIntRange();
                        setMax(getcommonprefix3);
                    }
                    if (getcommonprefix2.equals == 0) {
                        getCommonPrefix getcommonprefix4 = getcommonprefix2.toIntRange;
                        getcommonprefix2.setMax.toIntRange();
                        setMax(getcommonprefix2);
                        getcommonprefix2 = getcommonprefix4;
                    }
                }
            }
        }
        while (true) {
            getCommonPrefix getcommonprefix5 = this.create;
            if (getcommonprefix5 != null && getcommonprefix5 != getcommonprefix) {
                setMax(getcommonprefix5);
            } else {
                return;
            }
        }
    }

    private void getMax(getCommonPrefix getcommonprefix, getCommonPrefix getcommonprefix2) {
        getCommonPrefix getcommonprefix3 = getcommonprefix2.length;
        while (getcommonprefix3 != null && getcommonprefix3 != getcommonprefix) {
            getCommonPrefix getcommonprefix4 = getcommonprefix3.length;
            setMax(getcommonprefix3);
            getcommonprefix3 = getcommonprefix4;
        }
    }

    private void setMax(getCommonPrefix getcommonprefix) {
        if (getcommonprefix.length != null) {
            getcommonprefix.length.toIntRange = getcommonprefix.toIntRange;
        }
        if (getcommonprefix.toIntRange == null) {
            this.create = getcommonprefix.length;
            return;
        }
        getcommonprefix.toIntRange.length = getcommonprefix.length;
    }

    private static void length(Base64$OutputStream base64$OutputStream, Base64$OutputStream base64$OutputStream2) {
        WSContextUtil wSContextUtil = null;
        WSContextUtil wSContextUtil2 = null;
        int i = 0;
        while (base64$OutputStream != null) {
            if (base64$OutputStream instanceof WSContextUtil) {
                wSContextUtil2 = (WSContextUtil) base64$OutputStream;
                if (wSContextUtil == null) {
                    wSContextUtil = wSContextUtil2;
                }
                i += wSContextUtil2.getMin.length();
            } else {
                length(wSContextUtil, wSContextUtil2, i);
                wSContextUtil = null;
                wSContextUtil2 = null;
                i = 0;
            }
            if (base64$OutputStream == base64$OutputStream2) {
                break;
            }
            base64$OutputStream = base64$OutputStream.IsOverlapping;
        }
        length(wSContextUtil, wSContextUtil2, i);
    }

    private static void length(WSContextUtil wSContextUtil, WSContextUtil wSContextUtil2, int i) {
        if (wSContextUtil != null && wSContextUtil2 != null && wSContextUtil != wSContextUtil2) {
            StringBuilder sb = new StringBuilder(i);
            sb.append(wSContextUtil.getMin);
            Base64$OutputStream base64$OutputStream = wSContextUtil.IsOverlapping;
            Base64$OutputStream base64$OutputStream2 = wSContextUtil2.IsOverlapping;
            while (base64$OutputStream != base64$OutputStream2) {
                sb.append(((WSContextUtil) base64$OutputStream).getMin);
                Base64$OutputStream base64$OutputStream3 = base64$OutputStream.IsOverlapping;
                base64$OutputStream.toIntRange();
                base64$OutputStream = base64$OutputStream3;
            }
            wSContextUtil.getMin = sb.toString();
        }
    }

    static class setMax {
        final boolean getMin;
        final int setMax;
        final boolean setMin;

        setMax(int i, boolean z, boolean z2) {
            this.setMax = i;
            this.setMin = z;
            this.getMin = z2;
        }
    }

    private boolean getMin(setOkButtonText setokbuttontext, char c) {
        setMax setmax;
        String str;
        boolean z;
        boolean z2;
        int i = this.getCause;
        int i2 = 0;
        while (setMax() == c) {
            i2++;
            this.getCause++;
        }
        if (i2 < setokbuttontext.getMin()) {
            this.getCause = i;
            setmax = null;
        } else {
            String str2 = "\n";
            if (i == 0) {
                str = str2;
            } else {
                str = this.b.substring(i - 1, i);
            }
            char max = setMax();
            if (max != 0) {
                str2 = String.valueOf(max);
            }
            boolean matches = setMax.matcher(str).matches();
            boolean matches2 = hashCode.matcher(str).matches();
            boolean matches3 = setMax.matcher(str2).matches();
            boolean matches4 = hashCode.matcher(str2).matches();
            boolean z3 = !matches4 && (!matches3 || matches2 || matches);
            boolean z4 = !matches2 && (!matches || matches4 || matches3);
            if (c == '_') {
                z = z3 && (!z4 || matches);
                z2 = z4 && (!z3 || matches3);
            } else {
                boolean z5 = z3 && c == setokbuttontext.length();
                z2 = z4 && c == setokbuttontext.getMax();
                z = z5;
            }
            this.getCause = i;
            setmax = new setMax(i2, z, z2);
        }
        if (setmax == null) {
            return false;
        }
        int i3 = setmax.setMax;
        int i4 = this.getCause;
        int i5 = i4 + i3;
        this.getCause = i5;
        getCommonPrefix getcommonprefix = new getCommonPrefix(setMax(this.b, i4, i5), c, setmax.setMin, setmax.getMin, this.create);
        this.create = getcommonprefix;
        getcommonprefix.equals = i3;
        this.create.IsOverlapping = i3;
        if (this.create.length != null) {
            this.create.length.toIntRange = this.create;
        }
        return true;
    }

    private static void setMax(Base64$OutputStream base64$OutputStream, Base64$OutputStream base64$OutputStream2) {
        if (base64$OutputStream != base64$OutputStream2 && base64$OutputStream.IsOverlapping != base64$OutputStream2) {
            length(base64$OutputStream.IsOverlapping, base64$OutputStream2.equals);
        }
    }
}
