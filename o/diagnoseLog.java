package o;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.text.Typography;
import o.InitParams;
import o.LogLevel;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.comments.CommentType;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.scanner.ScannerException;
import org.yaml.snakeyaml.tokens.Token;

public final class diagnoseLog implements takeDownCrashReport {
    private static final Pattern getMin = Pattern.compile("[^0-9A-Fa-f]");
    public static final Map<Character, Integer> length = new HashMap();
    public static final Map<Character, String> setMin = new HashMap();
    private Map<Integer, getSpmMonitor> FastBitmap$CoordinateSystem;
    private List<Token> IsOverlapping;
    private int equals = 0;
    private final addAutoLogActivity getMax;
    private int isInside = -1;
    private boolean setMax = false;
    private boolean toDoubleRange = true;
    private AbtestInfoGetter<Integer> toFloatRange;
    private int toIntRange = 0;
    private boolean toString = false;

    static {
        setMin.put('0', "\u0000");
        setMin.put('a', "\u0007");
        setMin.put('b', "\b");
        setMin.put('t', "\t");
        setMin.put('n', "\n");
        setMin.put('v', "\u000b");
        setMin.put('f', "\f");
        setMin.put('r', "\r");
        setMin.put('e', "\u001b");
        setMin.put(' ', " ");
        setMin.put(Character.valueOf(Typography.quote), "\"");
        setMin.put('\\', "\\");
        setMin.put('N', "");
        setMin.put('_', " ");
        setMin.put('L', " ");
        setMin.put('P', " ");
        length.put('x', 2);
        length.put('u', 4);
        length.put('U', 8);
    }

    public diagnoseLog(addAutoLogActivity addautologactivity) {
        this.getMax = addautologactivity;
        this.IsOverlapping = new ArrayList(100);
        this.toFloatRange = new AbtestInfoGetter<>(10);
        this.FastBitmap$CoordinateSystem = new LinkedHashMap();
        addAutoLogActivity addautologactivity2 = this.getMax;
        InitParams.AnonymousClass1 r0 = new InitParams.AnonymousClass1(addautologactivity2.getMin, addautologactivity2.setMax, addautologactivity2.setMin, addautologactivity2.toIntRange, addautologactivity2.getMax, addautologactivity2.length);
        this.IsOverlapping.add(new getProcessTag(r0, r0));
    }

    public final boolean getMax(Token.ID... idArr) {
        while (setMax()) {
            getMax();
        }
        if (!this.IsOverlapping.isEmpty()) {
            if (idArr.length == 0) {
                return true;
            }
            Token.ID min = this.IsOverlapping.get(0).getMin();
            for (Token.ID id2 : idArr) {
                if (min == id2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Token length() {
        while (setMax()) {
            getMax();
        }
        return this.IsOverlapping.get(0);
    }

    public final Token getMin() {
        this.equals++;
        return this.IsOverlapping.remove(0);
    }

    private boolean setMax() {
        int i;
        if (this.setMax) {
            return false;
        }
        if (this.IsOverlapping.isEmpty()) {
            return true;
        }
        setMin();
        if (!this.FastBitmap$CoordinateSystem.isEmpty()) {
            i = this.FastBitmap$CoordinateSystem.values().iterator().next().setMin;
        } else {
            i = -1;
        }
        if (i == this.equals) {
            return true;
        }
        return false;
    }

    private void getMax() {
        create();
        setMin();
        getMax(this.getMax.toIntRange);
        addAutoLogActivity addautologactivity = this.getMax;
        int i = addautologactivity.setMin() ? addautologactivity.getMax[addautologactivity.length] : 0;
        if (i == 0) {
            IsOverlapping();
        } else if (i != 42) {
            if (i != 58) {
                if (i == 91) {
                    getMax(false);
                    return;
                } else if (i == 93) {
                    getMin(false);
                    return;
                } else if (i == 33) {
                    equals();
                    this.toDoubleRange = false;
                    this.IsOverlapping.add(ICustomTabsCallback());
                    return;
                } else if (i == 34) {
                    equals();
                    this.toDoubleRange = false;
                    this.IsOverlapping.add(getMin((char) Typography.quote));
                    return;
                } else if (i != 62) {
                    if (i != 63) {
                        switch (i) {
                            case 37:
                                if (toDoubleRange()) {
                                    getMax(-1);
                                    toFloatRange();
                                    this.toDoubleRange = false;
                                    this.IsOverlapping.addAll(b());
                                    return;
                                }
                                break;
                            case 38:
                                equals();
                                this.toDoubleRange = false;
                                this.IsOverlapping.add(length(true));
                                return;
                            case 39:
                                equals();
                                this.toDoubleRange = false;
                                this.IsOverlapping.add(getMin('\''));
                                return;
                            default:
                                switch (i) {
                                    case 44:
                                        isInside();
                                        return;
                                    case 45:
                                        if (invoke()) {
                                            setMin(true);
                                            return;
                                        } else if (Mean$Arithmetic()) {
                                            toIntRange();
                                            return;
                                        }
                                        break;
                                    case 46:
                                        if (invokeSuspend()) {
                                            setMin(false);
                                            return;
                                        }
                                        break;
                                    default:
                                        switch (i) {
                                            case 123:
                                                getMax(true);
                                                return;
                                            case 124:
                                                if (this.toIntRange == 0) {
                                                    this.toDoubleRange = true;
                                                    toFloatRange();
                                                    this.IsOverlapping.addAll(setMin('|'));
                                                    return;
                                                }
                                                break;
                                            case 125:
                                                getMin(true);
                                                return;
                                        }
                                }
                        }
                    } else if (valueOf()) {
                        FastBitmap$CoordinateSystem();
                        return;
                    }
                } else if (this.toIntRange == 0) {
                    this.toDoubleRange = true;
                    toFloatRange();
                    this.IsOverlapping.addAll(setMin((char) Typography.greater));
                    return;
                }
            } else if (Grayscale$Algorithm()) {
                values();
                return;
            }
            if (onNavigationEvent()) {
                equals();
                this.toDoubleRange = false;
                this.IsOverlapping.add(onPostMessage());
                return;
            }
            String valueOf = String.valueOf(Character.toChars(i));
            Iterator<Character> it = setMin.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Character next = it.next();
                    if (setMin.get(next).equals(valueOf)) {
                        valueOf = "\\".concat(String.valueOf(next));
                    }
                }
            }
            if (i == 9) {
                StringBuilder sb = new StringBuilder();
                sb.append(valueOf);
                sb.append("(TAB)");
                valueOf = sb.toString();
            }
            String format = String.format("found character '%s' that cannot start any token. (Do not use %s for indentation)", new Object[]{valueOf, valueOf});
            addAutoLogActivity addautologactivity2 = this.getMax;
            throw new ScannerException("while scanning for the next token", (InitParams.AnonymousClass1) null, format, new InitParams.AnonymousClass1(addautologactivity2.getMin, addautologactivity2.setMax, addautologactivity2.setMin, addautologactivity2.toIntRange, addautologactivity2.getMax, addautologactivity2.length));
        } else {
            equals();
            this.toDoubleRange = false;
            this.IsOverlapping.add(length(false));
        }
    }

    private void setMin() {
        if (!this.FastBitmap$CoordinateSystem.isEmpty()) {
            Iterator<getSpmMonitor> it = this.FastBitmap$CoordinateSystem.values().iterator();
            while (it.hasNext()) {
                getSpmMonitor next = it.next();
                if (next.setMax != this.getMax.setMin || this.getMax.setMax - next.getMin > 1024) {
                    if (!next.setMin()) {
                        it.remove();
                    } else {
                        InitParams.AnonymousClass1 r1 = next.length;
                        addAutoLogActivity addautologactivity = this.getMax;
                        throw new ScannerException("while scanning a simple key", r1, "could not find expected ':'", new InitParams.AnonymousClass1(addautologactivity.getMin, addautologactivity.setMax, addautologactivity.setMin, addautologactivity.toIntRange, addautologactivity.getMax, addautologactivity.length));
                    }
                }
            }
        }
    }

    private void equals() {
        boolean z = this.toIntRange == 0 && this.isInside == this.getMax.toIntRange;
        if (!this.toDoubleRange && z) {
            throw new YAMLException("A simple key is required only if it is the first token in the current line");
        } else if (this.toDoubleRange) {
            toFloatRange();
            int size = this.equals + this.IsOverlapping.size();
            int i = this.getMax.setMax;
            int i2 = this.getMax.setMin;
            int i3 = this.getMax.toIntRange;
            addAutoLogActivity addautologactivity = this.getMax;
            this.FastBitmap$CoordinateSystem.put(Integer.valueOf(this.toIntRange), new getSpmMonitor(size, z, i, i2, i3, new InitParams.AnonymousClass1(addautologactivity.getMin, addautologactivity.setMax, addautologactivity.setMin, addautologactivity.toIntRange, addautologactivity.getMax, addautologactivity.length)));
        }
    }

    private void toFloatRange() {
        getSpmMonitor remove = this.FastBitmap$CoordinateSystem.remove(Integer.valueOf(this.toIntRange));
        if (remove != null && remove.setMin()) {
            InitParams.AnonymousClass1 r0 = remove.length;
            addAutoLogActivity addautologactivity = this.getMax;
            throw new ScannerException("while scanning a simple key", r0, "could not find expected ':'", new InitParams.AnonymousClass1(addautologactivity.getMin, addautologactivity.setMax, addautologactivity.setMin, addautologactivity.toIntRange, addautologactivity.getMax, addautologactivity.length));
        }
    }

    private void getMax(int i) {
        if (this.toIntRange == 0) {
            while (this.isInside > i) {
                addAutoLogActivity addautologactivity = this.getMax;
                InitParams.AnonymousClass1 r1 = new InitParams.AnonymousClass1(addautologactivity.getMin, addautologactivity.setMax, addautologactivity.setMin, addautologactivity.toIntRange, addautologactivity.getMax, addautologactivity.length);
                AbtestInfoGetter<Integer> abtestInfoGetter = this.toFloatRange;
                this.isInside = ((Integer) abtestInfoGetter.setMax.remove(abtestInfoGetter.setMax.size() - 1)).intValue();
                this.IsOverlapping.add(new setAbtestInfoGetter(r1, r1));
            }
        }
    }

    private boolean length(int i) {
        int i2 = this.isInside;
        if (i2 >= i) {
            return false;
        }
        AbtestInfoGetter<Integer> abtestInfoGetter = this.toFloatRange;
        abtestInfoGetter.setMax.add(Integer.valueOf(i2));
        this.isInside = i;
        return true;
    }

    private void IsOverlapping() {
        getMax(-1);
        toFloatRange();
        this.toDoubleRange = false;
        this.FastBitmap$CoordinateSystem.clear();
        addAutoLogActivity addautologactivity = this.getMax;
        InitParams.AnonymousClass1 r1 = new InitParams.AnonymousClass1(addautologactivity.getMin, addautologactivity.setMax, addautologactivity.setMin, addautologactivity.toIntRange, addautologactivity.getMax, addautologactivity.length);
        this.IsOverlapping.add(new getMainProcessName(r1, r1));
        this.setMax = true;
    }

    private void setMin(boolean z) {
        Object obj;
        getMax(-1);
        toFloatRange();
        this.toDoubleRange = false;
        addAutoLogActivity addautologactivity = this.getMax;
        InitParams.AnonymousClass1 r1 = new InitParams.AnonymousClass1(addautologactivity.getMin, addautologactivity.setMax, addautologactivity.setMin, addautologactivity.toIntRange, addautologactivity.getMax, addautologactivity.length);
        this.getMax.setMin(3);
        addAutoLogActivity addautologactivity2 = this.getMax;
        InitParams.AnonymousClass1 r12 = new InitParams.AnonymousClass1(addautologactivity2.getMin, addautologactivity2.setMax, addautologactivity2.setMin, addautologactivity2.toIntRange, addautologactivity2.getMax, addautologactivity2.length);
        if (z) {
            obj = new isToolsProcess(r1, r12);
        } else {
            obj = new Alive(r1, r12);
        }
        this.IsOverlapping.add(obj);
    }

    private void getMax(boolean z) {
        Object obj;
        equals();
        this.toIntRange++;
        this.toDoubleRange = true;
        addAutoLogActivity addautologactivity = this.getMax;
        InitParams.AnonymousClass1 r2 = new InitParams.AnonymousClass1(addautologactivity.getMin, addautologactivity.setMax, addautologactivity.setMin, addautologactivity.toIntRange, addautologactivity.getMax, addautologactivity.length);
        this.getMax.setMin(1);
        addAutoLogActivity addautologactivity2 = this.getMax;
        InitParams.AnonymousClass1 r1 = new InitParams.AnonymousClass1(addautologactivity2.getMin, addautologactivity2.setMax, addautologactivity2.setMin, addautologactivity2.toIntRange, addautologactivity2.getMax, addautologactivity2.length);
        if (z) {
            obj = new ProcessInfo(r2, r1);
        } else {
            obj = new getToolsProcessName(r2, r1);
        }
        this.IsOverlapping.add(obj);
    }

    private void getMin(boolean z) {
        Object obj;
        toFloatRange();
        this.toIntRange--;
        this.toDoubleRange = false;
        addAutoLogActivity addautologactivity = this.getMax;
        InitParams.AnonymousClass1 r2 = new InitParams.AnonymousClass1(addautologactivity.getMin, addautologactivity.setMax, addautologactivity.setMin, addautologactivity.toIntRange, addautologactivity.getMax, addautologactivity.length);
        this.getMax.setMin(1);
        addAutoLogActivity addautologactivity2 = this.getMax;
        InitParams.AnonymousClass1 r1 = new InitParams.AnonymousClass1(addautologactivity2.getMin, addautologactivity2.setMax, addautologactivity2.setMin, addautologactivity2.toIntRange, addautologactivity2.getMax, addautologactivity2.length);
        if (z) {
            obj = new LogLevel.Level(r2, r1);
        } else {
            obj = new getProcessNameByID(r2, r1);
        }
        this.IsOverlapping.add(obj);
    }

    private void isInside() {
        this.toDoubleRange = true;
        toFloatRange();
        addAutoLogActivity addautologactivity = this.getMax;
        InitParams.AnonymousClass1 r2 = new InitParams.AnonymousClass1(addautologactivity.getMin, addautologactivity.setMax, addautologactivity.setMin, addautologactivity.toIntRange, addautologactivity.getMax, addautologactivity.length);
        this.getMax.setMin(1);
        addAutoLogActivity addautologactivity2 = this.getMax;
        this.IsOverlapping.add(new LogSeedID(r2, new InitParams.AnonymousClass1(addautologactivity2.getMin, addautologactivity2.setMax, addautologactivity2.setMin, addautologactivity2.toIntRange, addautologactivity2.getMax, addautologactivity2.length)));
    }

    private void toIntRange() {
        if (this.toIntRange == 0) {
            if (!this.toDoubleRange) {
                addAutoLogActivity addautologactivity = this.getMax;
                throw new ScannerException((String) null, (InitParams.AnonymousClass1) null, "sequence entries are not allowed here", new InitParams.AnonymousClass1(addautologactivity.getMin, addautologactivity.setMax, addautologactivity.setMin, addautologactivity.toIntRange, addautologactivity.getMax, addautologactivity.length));
            } else if (length(this.getMax.toIntRange)) {
                addAutoLogActivity addautologactivity2 = this.getMax;
                InitParams.AnonymousClass1 r1 = new InitParams.AnonymousClass1(addautologactivity2.getMin, addautologactivity2.setMax, addautologactivity2.setMin, addautologactivity2.toIntRange, addautologactivity2.getMax, addautologactivity2.length);
                this.IsOverlapping.add(new Behaviour(r1, r1));
            }
        }
        this.toDoubleRange = true;
        toFloatRange();
        addAutoLogActivity addautologactivity3 = this.getMax;
        InitParams.AnonymousClass1 r2 = new InitParams.AnonymousClass1(addautologactivity3.getMin, addautologactivity3.setMax, addautologactivity3.setMin, addautologactivity3.toIntRange, addautologactivity3.getMax, addautologactivity3.length);
        this.getMax.setMin(1);
        addAutoLogActivity addautologactivity4 = this.getMax;
        this.IsOverlapping.add(new LogEncryptClient(r2, new InitParams.AnonymousClass1(addautologactivity4.getMin, addautologactivity4.setMax, addautologactivity4.setMin, addautologactivity4.toIntRange, addautologactivity4.getMax, addautologactivity4.length)));
    }

    private void FastBitmap$CoordinateSystem() {
        if (this.toIntRange == 0) {
            if (!this.toDoubleRange) {
                addAutoLogActivity addautologactivity = this.getMax;
                throw new ScannerException((String) null, (InitParams.AnonymousClass1) null, "mapping keys are not allowed here", new InitParams.AnonymousClass1(addautologactivity.getMin, addautologactivity.setMax, addautologactivity.setMin, addautologactivity.toIntRange, addautologactivity.getMax, addautologactivity.length));
            } else if (length(this.getMax.toIntRange)) {
                addAutoLogActivity addautologactivity2 = this.getMax;
                InitParams.AnonymousClass1 r1 = new InitParams.AnonymousClass1(addautologactivity2.getMin, addautologactivity2.setMax, addautologactivity2.setMin, addautologactivity2.toIntRange, addautologactivity2.getMax, addautologactivity2.length);
                this.IsOverlapping.add(new LogHelper(r1, r1));
            }
        }
        this.toDoubleRange = this.toIntRange == 0;
        toFloatRange();
        addAutoLogActivity addautologactivity3 = this.getMax;
        InitParams.AnonymousClass1 r2 = new InitParams.AnonymousClass1(addautologactivity3.getMin, addautologactivity3.setMax, addautologactivity3.setMin, addautologactivity3.toIntRange, addautologactivity3.getMax, addautologactivity3.length);
        this.getMax.setMin(1);
        addAutoLogActivity addautologactivity4 = this.getMax;
        this.IsOverlapping.add(new getProcessID(r2, new InitParams.AnonymousClass1(addautologactivity4.getMin, addautologactivity4.setMax, addautologactivity4.setMin, addautologactivity4.toIntRange, addautologactivity4.getMax, addautologactivity4.length)));
    }

    private void values() {
        getSpmMonitor remove = this.FastBitmap$CoordinateSystem.remove(Integer.valueOf(this.toIntRange));
        boolean z = false;
        if (remove != null) {
            this.IsOverlapping.add(remove.setMin - this.equals, new getProcessID(remove.length, remove.length));
            if (this.toIntRange == 0 && length(remove.getMax)) {
                this.IsOverlapping.add(remove.setMin - this.equals, new LogHelper(remove.length, remove.length));
            }
            this.toDoubleRange = false;
        } else if (this.toIntRange != 0 || this.toDoubleRange) {
            if (this.toIntRange == 0 && length(this.getMax.toIntRange)) {
                addAutoLogActivity addautologactivity = this.getMax;
                InitParams.AnonymousClass1 r3 = new InitParams.AnonymousClass1(addautologactivity.getMin, addautologactivity.setMax, addautologactivity.setMin, addautologactivity.toIntRange, addautologactivity.getMax, addautologactivity.length);
                this.IsOverlapping.add(new LogHelper(r3, r3));
            }
            if (this.toIntRange == 0) {
                z = true;
            }
            this.toDoubleRange = z;
            toFloatRange();
        } else {
            addAutoLogActivity addautologactivity2 = this.getMax;
            throw new ScannerException((String) null, (InitParams.AnonymousClass1) null, "mapping values are not allowed here", new InitParams.AnonymousClass1(addautologactivity2.getMin, addautologactivity2.setMax, addautologactivity2.setMin, addautologactivity2.toIntRange, addautologactivity2.getMax, addautologactivity2.length));
        }
        addAutoLogActivity addautologactivity3 = this.getMax;
        InitParams.AnonymousClass1 r2 = new InitParams.AnonymousClass1(addautologactivity3.getMin, addautologactivity3.setMax, addautologactivity3.setMin, addautologactivity3.toIntRange, addautologactivity3.getMax, addautologactivity3.length);
        this.getMax.setMin(1);
        addAutoLogActivity addautologactivity4 = this.getMax;
        this.IsOverlapping.add(new Uploader(r2, new InitParams.AnonymousClass1(addautologactivity4.getMin, addautologactivity4.setMax, addautologactivity4.setMin, addautologactivity4.toIntRange, addautologactivity4.getMax, addautologactivity4.length)));
    }

    private boolean toDoubleRange() {
        return this.getMax.toIntRange == 0;
    }

    private boolean invoke() {
        if (this.getMax.toIntRange == 0 && "---".equals(this.getMax.getMin(3))) {
            setSpmMonitor setspmmonitor = setSpmMonitor.getMin;
            addAutoLogActivity addautologactivity = this.getMax;
            if (setspmmonitor.length(addautologactivity.getMax(3) ? addautologactivity.getMax[addautologactivity.length + 3] : 0)) {
                return true;
            }
        }
        return false;
    }

    private boolean invokeSuspend() {
        if (this.getMax.toIntRange == 0 && "...".equals(this.getMax.getMin(3))) {
            setSpmMonitor setspmmonitor = setSpmMonitor.getMin;
            addAutoLogActivity addautologactivity = this.getMax;
            if (setspmmonitor.length(addautologactivity.getMax(3) ? addautologactivity.getMax[addautologactivity.length + 3] : 0)) {
                return true;
            }
        }
        return false;
    }

    private boolean Mean$Arithmetic() {
        setSpmMonitor setspmmonitor = setSpmMonitor.getMin;
        addAutoLogActivity addautologactivity = this.getMax;
        return setspmmonitor.length(addautologactivity.getMax(1) ? addautologactivity.getMax[addautologactivity.length + 1] : 0);
    }

    private boolean valueOf() {
        if (this.toIntRange != 0) {
            return true;
        }
        setSpmMonitor setspmmonitor = setSpmMonitor.getMin;
        addAutoLogActivity addautologactivity = this.getMax;
        return setspmmonitor.length(addautologactivity.getMax(1) ? addautologactivity.getMax[addautologactivity.length + 1] : 0);
    }

    private boolean Grayscale$Algorithm() {
        if (this.toIntRange != 0) {
            return true;
        }
        setSpmMonitor setspmmonitor = setSpmMonitor.getMin;
        addAutoLogActivity addautologactivity = this.getMax;
        return setspmmonitor.length(addautologactivity.getMax(1) ? addautologactivity.getMax[addautologactivity.length + 1] : 0);
    }

    private boolean onNavigationEvent() {
        addAutoLogActivity addautologactivity = this.getMax;
        int i = addautologactivity.setMin() ? addautologactivity.getMax[addautologactivity.length] : 0;
        if (!setSpmMonitor.getMin.getMax(i, "-?:,[]{}#&*!|>'\"%@`")) {
            setSpmMonitor setspmmonitor = setSpmMonitor.getMin;
            addAutoLogActivity addautologactivity2 = this.getMax;
            if (!setspmmonitor.getMin(addautologactivity2.getMax(1) ? addautologactivity2.getMax[addautologactivity2.length + 1] : 0) || (i != 45 && (this.toIntRange != 0 || "?:".indexOf(i) == -1))) {
                return false;
            }
        }
        return true;
    }

    private void create() {
        boolean z;
        int i;
        CommentType commentType;
        if (this.getMax.setMax == 0) {
            addAutoLogActivity addautologactivity = this.getMax;
            if ((addautologactivity.setMin() ? addautologactivity.getMax[addautologactivity.length] : 0) == 65279) {
                this.getMax.setMin(1);
            }
        }
        boolean z2 = false;
        int i2 = -1;
        while (!z2) {
            addAutoLogActivity addautologactivity2 = this.getMax;
            InitParams.AnonymousClass1 r7 = new InitParams.AnonymousClass1(addautologactivity2.getMin, addautologactivity2.setMax, addautologactivity2.setMin, addautologactivity2.toIntRange, addautologactivity2.getMax, addautologactivity2.length);
            int i3 = 0;
            while (true) {
                addAutoLogActivity addautologactivity3 = this.getMax;
                if ((addautologactivity3.getMax(i3) ? addautologactivity3.getMax[addautologactivity3.length + i3] : 0) != 32) {
                    break;
                }
                i3++;
            }
            if (i3 > 0) {
                this.getMax.setMin(i3);
            }
            addAutoLogActivity addautologactivity4 = this.getMax;
            if ((addautologactivity4.setMin() ? addautologactivity4.getMax[addautologactivity4.length] : 0) == 35) {
                if (r7.getColumn() != 0) {
                    commentType = CommentType.IN_LINE;
                    i = this.getMax.toIntRange;
                } else if (i2 == this.getMax.toIntRange) {
                    i = i2;
                    commentType = CommentType.IN_LINE;
                } else {
                    commentType = CommentType.BLOCK;
                    i = -1;
                }
                apm max = getMax(commentType);
                if (this.toString) {
                    this.IsOverlapping.add(max);
                }
                i2 = i;
                z = true;
            } else {
                z = false;
            }
            String onMessageChannelReady = onMessageChannelReady();
            if (onMessageChannelReady.length() != 0) {
                if (this.toString && !z && r7.getColumn() == 0) {
                    addAutoLogActivity addautologactivity5 = this.getMax;
                    this.IsOverlapping.add(new apm(CommentType.BLANK_LINE, onMessageChannelReady, r7, new InitParams.AnonymousClass1(addautologactivity5.getMin, addautologactivity5.setMax, addautologactivity5.setMin, addautologactivity5.toIntRange, addautologactivity5.getMax, addautologactivity5.length)));
                }
                if (this.toIntRange == 0) {
                    this.toDoubleRange = true;
                }
            } else {
                z2 = true;
            }
        }
    }

    private apm getMax(CommentType commentType) {
        addAutoLogActivity addautologactivity = this.getMax;
        InitParams.AnonymousClass1 r2 = new InitParams.AnonymousClass1(addautologactivity.getMin, addautologactivity.setMax, addautologactivity.setMin, addautologactivity.toIntRange, addautologactivity.getMax, addautologactivity.length);
        this.getMax.setMin(1);
        int i = 0;
        while (true) {
            setSpmMonitor setspmmonitor = setSpmMonitor.getMax;
            addAutoLogActivity addautologactivity2 = this.getMax;
            if (setspmmonitor.getMin(addautologactivity2.getMax(i) ? addautologactivity2.getMax[addautologactivity2.length + i] : 0)) {
                i++;
            } else {
                String max = this.getMax.setMax(i);
                addAutoLogActivity addautologactivity3 = this.getMax;
                return new apm(commentType, max, r2, new InitParams.AnonymousClass1(addautologactivity3.getMin, addautologactivity3.setMax, addautologactivity3.setMin, addautologactivity3.toIntRange, addautologactivity3.getMax, addautologactivity3.length));
            }
        }
    }

    private List<Token> b() {
        InitParams.AnonymousClass1 r6;
        List list;
        addAutoLogActivity addautologactivity = this.getMax;
        InitParams.AnonymousClass1 r2 = new InitParams.AnonymousClass1(addautologactivity.getMin, addautologactivity.setMax, addautologactivity.setMin, addautologactivity.toIntRange, addautologactivity.getMax, addautologactivity.length);
        this.getMax.setMin(1);
        String max = getMax(r2);
        if ("YAML".equals(max)) {
            list = length(r2);
            addAutoLogActivity addautologactivity2 = this.getMax;
            r6 = new InitParams.AnonymousClass1(addautologactivity2.getMin, addautologactivity2.setMax, addautologactivity2.setMin, addautologactivity2.toIntRange, addautologactivity2.getMax, addautologactivity2.length);
        } else if ("TAG".equals(max)) {
            list = setMax(r2);
            addAutoLogActivity addautologactivity3 = this.getMax;
            r6 = new InitParams.AnonymousClass1(addautologactivity3.getMin, addautologactivity3.setMax, addautologactivity3.setMin, addautologactivity3.toIntRange, addautologactivity3.getMax, addautologactivity3.length);
        } else {
            addAutoLogActivity addautologactivity4 = this.getMax;
            r6 = new InitParams.AnonymousClass1(addautologactivity4.getMin, addautologactivity4.setMax, addautologactivity4.setMin, addautologactivity4.toIntRange, addautologactivity4.getMax, addautologactivity4.length);
            int i = 0;
            while (true) {
                setSpmMonitor setspmmonitor = setSpmMonitor.getMax;
                addAutoLogActivity addautologactivity5 = this.getMax;
                if (!setspmmonitor.getMin(addautologactivity5.getMax(i) ? addautologactivity5.getMax[addautologactivity5.length + i] : 0)) {
                    break;
                }
                i++;
            }
            if (i > 0) {
                this.getMax.setMin(i);
            }
            list = null;
        }
        return length(new LogLevel(max, list, r2, r6), toIntRange(r2));
    }

    private String getMax(InitParams.AnonymousClass1 r15) {
        addAutoLogActivity addautologactivity = this.getMax;
        int i = 0;
        int i2 = addautologactivity.getMax(0) ? addautologactivity.getMax[addautologactivity.length + 0] : 0;
        int i3 = 0;
        while (setSpmMonitor.equals.length(i2)) {
            i3++;
            addAutoLogActivity addautologactivity2 = this.getMax;
            i2 = addautologactivity2.getMax(i3) ? addautologactivity2.getMax[addautologactivity2.length + i3] : 0;
        }
        if (i3 != 0) {
            String max = this.getMax.setMax(i3);
            addAutoLogActivity addautologactivity3 = this.getMax;
            if (addautologactivity3.setMin()) {
                i = addautologactivity3.getMax[addautologactivity3.length];
            }
            if (!setSpmMonitor.setMax.getMin(i)) {
                return max;
            }
            String valueOf = String.valueOf(Character.toChars(i));
            StringBuilder sb = new StringBuilder("expected alphabetic or numeric character, but found ");
            sb.append(valueOf);
            sb.append("(");
            sb.append(i);
            sb.append(")");
            String obj = sb.toString();
            addAutoLogActivity addautologactivity4 = this.getMax;
            throw new ScannerException("while scanning a directive", r15, obj, new InitParams.AnonymousClass1(addautologactivity4.getMin, addautologactivity4.setMax, addautologactivity4.setMin, addautologactivity4.toIntRange, addautologactivity4.getMax, addautologactivity4.length));
        }
        String valueOf2 = String.valueOf(Character.toChars(i2));
        StringBuilder sb2 = new StringBuilder("expected alphabetic or numeric character, but found ");
        sb2.append(valueOf2);
        sb2.append("(");
        sb2.append(i2);
        sb2.append(")");
        String obj2 = sb2.toString();
        addAutoLogActivity addautologactivity5 = this.getMax;
        throw new ScannerException("while scanning a directive", r15, obj2, new InitParams.AnonymousClass1(addautologactivity5.getMin, addautologactivity5.setMax, addautologactivity5.setMin, addautologactivity5.toIntRange, addautologactivity5.getMax, addautologactivity5.length));
    }

    private List<Integer> length(InitParams.AnonymousClass1 r15) {
        int i;
        while (true) {
            addAutoLogActivity addautologactivity = this.getMax;
            i = 0;
            if ((addautologactivity.setMin() ? addautologactivity.getMax[addautologactivity.length] : 0) != 32) {
                break;
            }
            this.getMax.setMin(1);
        }
        Integer min = setMin(r15);
        addAutoLogActivity addautologactivity2 = this.getMax;
        int i2 = addautologactivity2.setMin() ? addautologactivity2.getMax[addautologactivity2.length] : 0;
        if (i2 == 46) {
            this.getMax.getMax();
            Integer min2 = setMin(r15);
            addAutoLogActivity addautologactivity3 = this.getMax;
            if (addautologactivity3.setMin()) {
                i = addautologactivity3.getMax[addautologactivity3.length];
            }
            if (!setSpmMonitor.setMax.getMin(i)) {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(min);
                arrayList.add(min2);
                return arrayList;
            }
            String valueOf = String.valueOf(Character.toChars(i));
            StringBuilder sb = new StringBuilder("expected a digit or ' ', but found ");
            sb.append(valueOf);
            sb.append("(");
            sb.append(i);
            sb.append(")");
            String obj = sb.toString();
            addAutoLogActivity addautologactivity4 = this.getMax;
            throw new ScannerException("while scanning a directive", r15, obj, new InitParams.AnonymousClass1(addautologactivity4.getMin, addautologactivity4.setMax, addautologactivity4.setMin, addautologactivity4.toIntRange, addautologactivity4.getMax, addautologactivity4.length));
        }
        String valueOf2 = String.valueOf(Character.toChars(i2));
        StringBuilder sb2 = new StringBuilder("expected a digit or '.', but found ");
        sb2.append(valueOf2);
        sb2.append("(");
        sb2.append(i2);
        sb2.append(")");
        String obj2 = sb2.toString();
        addAutoLogActivity addautologactivity5 = this.getMax;
        throw new ScannerException("while scanning a directive", r15, obj2, new InitParams.AnonymousClass1(addautologactivity5.getMin, addautologactivity5.setMax, addautologactivity5.setMin, addautologactivity5.toIntRange, addautologactivity5.getMax, addautologactivity5.length));
    }

    private Integer setMin(InitParams.AnonymousClass1 r12) {
        addAutoLogActivity addautologactivity = this.getMax;
        int i = addautologactivity.setMin() ? addautologactivity.getMax[addautologactivity.length] : 0;
        if (Character.isDigit(i)) {
            int i2 = 0;
            while (true) {
                addAutoLogActivity addautologactivity2 = this.getMax;
                if (!Character.isDigit(addautologactivity2.getMax(i2) ? addautologactivity2.getMax[addautologactivity2.length + i2] : 0)) {
                    return Integer.valueOf(Integer.parseInt(this.getMax.setMax(i2)));
                }
                i2++;
            }
        } else {
            String valueOf = String.valueOf(Character.toChars(i));
            StringBuilder sb = new StringBuilder("expected a digit, but found ");
            sb.append(valueOf);
            sb.append("(");
            sb.append(i);
            sb.append(")");
            String obj = sb.toString();
            addAutoLogActivity addautologactivity3 = this.getMax;
            throw new ScannerException("while scanning a directive", r12, obj, new InitParams.AnonymousClass1(addautologactivity3.getMin, addautologactivity3.setMax, addautologactivity3.setMin, addautologactivity3.toIntRange, addautologactivity3.getMax, addautologactivity3.length));
        }
    }

    private List<String> setMax(InitParams.AnonymousClass1 r7) {
        while (true) {
            addAutoLogActivity addautologactivity = this.getMax;
            if ((addautologactivity.setMin() ? addautologactivity.getMax[addautologactivity.length] : 0) != 32) {
                break;
            }
            this.getMax.setMin(1);
        }
        String min = getMin(r7);
        while (true) {
            addAutoLogActivity addautologactivity2 = this.getMax;
            if ((addautologactivity2.setMin() ? addautologactivity2.getMax[addautologactivity2.length] : 0) == 32) {
                this.getMax.setMin(1);
            } else {
                String floatRange = toFloatRange(r7);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(min);
                arrayList.add(floatRange);
                return arrayList;
            }
        }
    }

    private String getMin(InitParams.AnonymousClass1 r12) {
        String length2 = length("directive", r12);
        addAutoLogActivity addautologactivity = this.getMax;
        int i = addautologactivity.setMin() ? addautologactivity.getMax[addautologactivity.length] : 0;
        if (i == 32) {
            return length2;
        }
        String valueOf = String.valueOf(Character.toChars(i));
        StringBuilder sb = new StringBuilder("expected ' ', but found ");
        sb.append(valueOf);
        sb.append("(");
        sb.append(i);
        sb.append(")");
        String obj = sb.toString();
        addAutoLogActivity addautologactivity2 = this.getMax;
        throw new ScannerException("while scanning a directive", r12, obj, new InitParams.AnonymousClass1(addautologactivity2.getMin, addautologactivity2.setMax, addautologactivity2.setMin, addautologactivity2.toIntRange, addautologactivity2.getMax, addautologactivity2.length));
    }

    private String toFloatRange(InitParams.AnonymousClass1 r12) {
        String max = getMax("directive", r12);
        addAutoLogActivity addautologactivity = this.getMax;
        int i = addautologactivity.setMin() ? addautologactivity.getMax[addautologactivity.length] : 0;
        if (!setSpmMonitor.setMax.getMin(i)) {
            return max;
        }
        String valueOf = String.valueOf(Character.toChars(i));
        StringBuilder sb = new StringBuilder("expected ' ', but found ");
        sb.append(valueOf);
        sb.append("(");
        sb.append(i);
        sb.append(")");
        String obj = sb.toString();
        addAutoLogActivity addautologactivity2 = this.getMax;
        throw new ScannerException("while scanning a directive", r12, obj, new InitParams.AnonymousClass1(addautologactivity2.getMin, addautologactivity2.setMax, addautologactivity2.setMin, addautologactivity2.toIntRange, addautologactivity2.getMax, addautologactivity2.length));
    }

    private apm toIntRange(InitParams.AnonymousClass1 r13) {
        int i;
        while (true) {
            addAutoLogActivity addautologactivity = this.getMax;
            i = 0;
            if ((addautologactivity.setMin() ? addautologactivity.getMax[addautologactivity.length] : 0) != 32) {
                break;
            }
            this.getMax.setMin(1);
        }
        apm apm = null;
        addAutoLogActivity addautologactivity2 = this.getMax;
        if ((addautologactivity2.setMin() ? addautologactivity2.getMax[addautologactivity2.length] : 0) == 35) {
            addAutoLogActivity addautologactivity3 = this.getMax;
            InitParams.AnonymousClass1 r3 = new InitParams.AnonymousClass1(addautologactivity3.getMin, addautologactivity3.setMax, addautologactivity3.setMin, addautologactivity3.toIntRange, addautologactivity3.getMax, addautologactivity3.length);
            int i2 = 0;
            while (true) {
                setSpmMonitor setspmmonitor = setSpmMonitor.getMax;
                addAutoLogActivity addautologactivity4 = this.getMax;
                if (!setspmmonitor.getMin(addautologactivity4.getMax(i2) ? addautologactivity4.getMax[addautologactivity4.length + i2] : 0)) {
                    break;
                }
                i2++;
            }
            String max = this.getMax.setMax(i2);
            if (this.toString) {
                addAutoLogActivity addautologactivity5 = this.getMax;
                apm = new apm(CommentType.IN_LINE, max, r3, new InitParams.AnonymousClass1(addautologactivity5.getMin, addautologactivity5.setMax, addautologactivity5.setMin, addautologactivity5.toIntRange, addautologactivity5.getMax, addautologactivity5.length));
            }
        }
        addAutoLogActivity addautologactivity6 = this.getMax;
        if (addautologactivity6.setMin()) {
            i = addautologactivity6.getMax[addautologactivity6.length];
        }
        if (onMessageChannelReady().length() != 0 || i == 0) {
            return apm;
        }
        String valueOf = String.valueOf(Character.toChars(i));
        StringBuilder sb = new StringBuilder("expected a comment or a line break, but found ");
        sb.append(valueOf);
        sb.append("(");
        sb.append(i);
        sb.append(")");
        String obj = sb.toString();
        addAutoLogActivity addautologactivity7 = this.getMax;
        throw new ScannerException("while scanning a directive", r13, obj, new InitParams.AnonymousClass1(addautologactivity7.getMin, addautologactivity7.setMax, addautologactivity7.setMin, addautologactivity7.toIntRange, addautologactivity7.getMax, addautologactivity7.length));
    }

    private Token length(boolean z) {
        addAutoLogActivity addautologactivity = this.getMax;
        InitParams.AnonymousClass1 r2 = new InitParams.AnonymousClass1(addautologactivity.getMin, addautologactivity.setMax, addautologactivity.setMin, addautologactivity.toIntRange, addautologactivity.getMax, addautologactivity.length);
        addAutoLogActivity addautologactivity2 = this.getMax;
        int i = 0;
        String str = (addautologactivity2.setMin() ? addautologactivity2.getMax[addautologactivity2.length] : 0) == 42 ? "alias" : "anchor";
        this.getMax.setMin(1);
        addAutoLogActivity addautologactivity3 = this.getMax;
        int i2 = addautologactivity3.getMax(0) ? addautologactivity3.getMax[addautologactivity3.length + 0] : 0;
        int i3 = 0;
        while (setSpmMonitor.getMin.getMax(i2, ":,[]{}/.*&")) {
            i3++;
            addAutoLogActivity addautologactivity4 = this.getMax;
            i2 = addautologactivity4.getMax(i3) ? addautologactivity4.getMax[addautologactivity4.length + i3] : 0;
        }
        if (i3 != 0) {
            String max = this.getMax.setMax(i3);
            addAutoLogActivity addautologactivity5 = this.getMax;
            if (addautologactivity5.setMin()) {
                i = addautologactivity5.getMax[addautologactivity5.length];
            }
            if (!setSpmMonitor.getMin.getMax(i, "?:,]}%@`")) {
                addAutoLogActivity addautologactivity6 = this.getMax;
                InitParams.AnonymousClass1 r10 = new InitParams.AnonymousClass1(addautologactivity6.getMin, addautologactivity6.setMax, addautologactivity6.setMin, addautologactivity6.toIntRange, addautologactivity6.getMax, addautologactivity6.length);
                if (z) {
                    return new isZipAndSevenZip(max, r2, r10);
                }
                return new LogEventType(max, r2, r10);
            }
            String valueOf = String.valueOf(Character.toChars(i));
            String concat = "while scanning an ".concat(str);
            StringBuilder sb = new StringBuilder("unexpected character found ");
            sb.append(valueOf);
            sb.append("(");
            sb.append(i);
            sb.append(")");
            String obj = sb.toString();
            addAutoLogActivity addautologactivity7 = this.getMax;
            throw new ScannerException(concat, r2, obj, new InitParams.AnonymousClass1(addautologactivity7.getMin, addautologactivity7.setMax, addautologactivity7.setMin, addautologactivity7.toIntRange, addautologactivity7.getMax, addautologactivity7.length));
        }
        String valueOf2 = String.valueOf(Character.toChars(i2));
        String concat2 = "while scanning an ".concat(str);
        StringBuilder sb2 = new StringBuilder("unexpected character found ");
        sb2.append(valueOf2);
        sb2.append("(");
        sb2.append(i2);
        sb2.append(")");
        String obj2 = sb2.toString();
        addAutoLogActivity addautologactivity8 = this.getMax;
        throw new ScannerException(concat2, r2, obj2, new InitParams.AnonymousClass1(addautologactivity8.getMin, addautologactivity8.setMax, addautologactivity8.setMin, addautologactivity8.toIntRange, addautologactivity8.getMax, addautologactivity8.length));
    }

    private Token ICustomTabsCallback() {
        addAutoLogActivity addautologactivity = this.getMax;
        InitParams.AnonymousClass1 r2 = new InitParams.AnonymousClass1(addautologactivity.getMin, addautologactivity.setMax, addautologactivity.setMin, addautologactivity.toIntRange, addautologactivity.getMax, addautologactivity.length);
        addAutoLogActivity addautologactivity2 = this.getMax;
        boolean z = true;
        int i = 0;
        int i2 = addautologactivity2.getMax(1) ? addautologactivity2.getMax[addautologactivity2.length + 1] : 0;
        String str = null;
        String str2 = "!";
        if (i2 == 60) {
            this.getMax.setMin(2);
            str2 = getMax("tag", r2);
            addAutoLogActivity addautologactivity3 = this.getMax;
            int i3 = addautologactivity3.setMin() ? addautologactivity3.getMax[addautologactivity3.length] : 0;
            if (i3 == 62) {
                this.getMax.getMax();
            } else {
                String valueOf = String.valueOf(Character.toChars(i3));
                StringBuilder sb = new StringBuilder("expected '>', but found '");
                sb.append(valueOf);
                sb.append("' (");
                sb.append(i3);
                sb.append(")");
                String obj = sb.toString();
                addAutoLogActivity addautologactivity4 = this.getMax;
                throw new ScannerException("while scanning a tag", r2, obj, new InitParams.AnonymousClass1(addautologactivity4.getMin, addautologactivity4.setMax, addautologactivity4.setMin, addautologactivity4.toIntRange, addautologactivity4.getMax, addautologactivity4.length));
            }
        } else if (setSpmMonitor.getMin.length(i2)) {
            this.getMax.getMax();
        } else {
            int i4 = 1;
            while (true) {
                if (!setSpmMonitor.setMax.getMin(i2)) {
                    z = false;
                    break;
                } else if (i2 == 33) {
                    break;
                } else {
                    i4++;
                    addAutoLogActivity addautologactivity5 = this.getMax;
                    i2 = addautologactivity5.getMax(i4) ? addautologactivity5.getMax[addautologactivity5.length + i4] : 0;
                }
            }
            if (z) {
                str = length("tag", r2);
            } else {
                this.getMax.getMax();
                str = str2;
            }
            str2 = getMax("tag", r2);
        }
        addAutoLogActivity addautologactivity6 = this.getMax;
        if (addautologactivity6.setMin()) {
            i = addautologactivity6.getMax[addautologactivity6.length];
        }
        if (!setSpmMonitor.setMax.getMin(i)) {
            getExtInfoForSpmID getextinfoforspmid = new getExtInfoForSpmID(str, str2);
            addAutoLogActivity addautologactivity7 = this.getMax;
            return new getLogForSpmID(getextinfoforspmid, r2, new InitParams.AnonymousClass1(addautologactivity7.getMin, addautologactivity7.setMax, addautologactivity7.setMin, addautologactivity7.toIntRange, addautologactivity7.getMax, addautologactivity7.length));
        }
        String valueOf2 = String.valueOf(Character.toChars(i));
        StringBuilder sb2 = new StringBuilder("expected ' ', but found '");
        sb2.append(valueOf2);
        sb2.append("' (");
        sb2.append(i);
        sb2.append(")");
        String obj2 = sb2.toString();
        addAutoLogActivity addautologactivity8 = this.getMax;
        throw new ScannerException("while scanning a tag", r2, obj2, new InitParams.AnonymousClass1(addautologactivity8.getMin, addautologactivity8.setMax, addautologactivity8.setMin, addautologactivity8.toIntRange, addautologactivity8.getMax, addautologactivity8.length));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0127, code lost:
        r1 = r9;
        r10 = r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<org.yaml.snakeyaml.tokens.Token> setMin(char r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = 1
            r2 = 0
            r3 = 62
            r4 = r20
            if (r4 != r3) goto L_0x000c
            r3 = 1
            goto L_0x000d
        L_0x000c:
            r3 = 0
        L_0x000d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            o.addAutoLogActivity r6 = r0.getMax
            o.InitParams$1 r14 = new o.InitParams$1
            java.lang.String r8 = r6.getMin
            int r9 = r6.setMax
            int r10 = r6.setMin
            int r11 = r6.toIntRange
            int[] r12 = r6.getMax
            int r13 = r6.length
            r7 = r14
            r7.<init>((java.lang.String) r8, (int) r9, (int) r10, (int) r11, (int[]) r12, (int) r13)
            o.addAutoLogActivity r6 = r0.getMax
            r6.getMax()
            o.diagnoseLog$length r6 = r0.IsOverlapping(r14)
            int r7 = r6.length
            o.apm r13 = r0.equals(r14)
            int r8 = r0.isInside
            int r8 = r8 + r1
            if (r8 > 0) goto L_0x003b
            r8 = 1
        L_0x003b:
            r15 = 2
            r9 = -1
            if (r7 != r9) goto L_0x0058
            java.lang.Object[] r7 = r19.getCause()
            r10 = r7[r2]
            java.lang.String r10 = (java.lang.String) r10
            r11 = r7[r1]
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r7 = r7[r15]
            o.InitParams$1 r7 = (o.InitParams.AnonymousClass1) r7
            int r8 = java.lang.Math.max(r8, r11)
            goto L_0x0066
        L_0x0058:
            int r8 = r8 + r7
            int r8 = r8 - r1
            java.lang.Object[] r7 = r0.setMin((int) r8)
            r10 = r7[r2]
            java.lang.String r10 = (java.lang.String) r10
            r7 = r7[r1]
            o.InitParams$1 r7 = (o.InitParams.AnonymousClass1) r7
        L_0x0066:
            java.lang.String r11 = ""
        L_0x0068:
            o.addAutoLogActivity r12 = r0.getMax
            int r12 = r12.toIntRange
            if (r12 != r8) goto L_0x012a
            o.addAutoLogActivity r12 = r0.getMax
            boolean r16 = r12.setMin()
            if (r16 == 0) goto L_0x007d
            int[] r15 = r12.getMax
            int r12 = r12.length
            r12 = r15[r12]
            goto L_0x007e
        L_0x007d:
            r12 = 0
        L_0x007e:
            if (r12 == 0) goto L_0x012a
            r5.append(r10)
            o.addAutoLogActivity r7 = r0.getMax
            boolean r10 = r7.setMin()
            if (r10 == 0) goto L_0x0092
            int[] r10 = r7.getMax
            int r7 = r7.length
            r7 = r10[r7]
            goto L_0x0093
        L_0x0092:
            r7 = 0
        L_0x0093:
            java.lang.String r10 = " \t"
            int r7 = r10.indexOf(r7)
            if (r7 != r9) goto L_0x009d
            r7 = 1
            goto L_0x009e
        L_0x009d:
            r7 = 0
        L_0x009e:
            r11 = 0
        L_0x009f:
            o.setSpmMonitor r12 = o.setSpmMonitor.getMax
            o.addAutoLogActivity r15 = r0.getMax
            boolean r17 = r15.getMax(r11)
            if (r17 == 0) goto L_0x00b1
            int[] r9 = r15.getMax
            int r15 = r15.length
            int r15 = r15 + r11
            r9 = r9[r15]
            goto L_0x00b2
        L_0x00b1:
            r9 = 0
        L_0x00b2:
            boolean r9 = r12.getMin(r9)
            if (r9 == 0) goto L_0x00bc
            int r11 = r11 + 1
            r9 = -1
            goto L_0x009f
        L_0x00bc:
            o.addAutoLogActivity r9 = r0.getMax
            java.lang.String r9 = r9.setMax(r11)
            r5.append(r9)
            java.lang.String r11 = r19.onMessageChannelReady()
            java.lang.Object[] r9 = r0.setMin((int) r8)
            r12 = r9[r2]
            java.lang.String r12 = (java.lang.String) r12
            r9 = r9[r1]
            o.InitParams$1 r9 = (o.InitParams.AnonymousClass1) r9
            o.addAutoLogActivity r15 = r0.getMax
            int r15 = r15.toIntRange
            if (r15 != r8) goto L_0x0127
            o.addAutoLogActivity r15 = r0.getMax
            boolean r18 = r15.setMin()
            if (r18 == 0) goto L_0x00ea
            int[] r1 = r15.getMax
            int r15 = r15.length
            r1 = r1[r15]
            goto L_0x00eb
        L_0x00ea:
            r1 = 0
        L_0x00eb:
            if (r1 == 0) goto L_0x0127
            if (r3 == 0) goto L_0x011c
            java.lang.String r1 = "\n"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x011c
            if (r7 == 0) goto L_0x011c
            o.addAutoLogActivity r1 = r0.getMax
            boolean r7 = r1.setMin()
            if (r7 == 0) goto L_0x0108
            int[] r7 = r1.getMax
            int r1 = r1.length
            r1 = r7[r1]
            goto L_0x0109
        L_0x0108:
            r1 = 0
        L_0x0109:
            int r1 = r10.indexOf(r1)
            r7 = -1
            if (r1 != r7) goto L_0x011d
            int r1 = r12.length()
            if (r1 != 0) goto L_0x0120
            java.lang.String r1 = " "
            r5.append(r1)
            goto L_0x0120
        L_0x011c:
            r7 = -1
        L_0x011d:
            r5.append(r11)
        L_0x0120:
            r7 = r9
            r10 = r12
            r1 = 1
            r9 = -1
            r15 = 2
            goto L_0x0068
        L_0x0127:
            r1 = r9
            r10 = r12
            goto L_0x012b
        L_0x012a:
            r1 = r7
        L_0x012b:
            boolean r3 = r6.setMin()
            if (r3 == 0) goto L_0x0134
            r5.append(r11)
        L_0x0134:
            r3 = 0
            boolean r6 = r6.getMax()
            if (r6 == 0) goto L_0x0149
            boolean r6 = r0.toString
            if (r6 == 0) goto L_0x0146
            o.apm r3 = new o.apm
            org.yaml.snakeyaml.comments.CommentType r6 = org.yaml.snakeyaml.comments.CommentType.BLANK_LINE
            r3.<init>(r6, r10, r14, r1)
        L_0x0146:
            r5.append(r10)
        L_0x0149:
            o.getProcessAlias r6 = new o.getProcessAlias
            java.lang.String r8 = r5.toString()
            r9 = 0
            java.lang.Character r4 = java.lang.Character.valueOf(r20)
            org.yaml.snakeyaml.DumperOptions$ScalarStyle r12 = org.yaml.snakeyaml.DumperOptions.ScalarStyle.createStyle(r4)
            r7 = r6
            r10 = r14
            r11 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            r1 = 3
            org.yaml.snakeyaml.tokens.Token[] r1 = new org.yaml.snakeyaml.tokens.Token[r1]
            r1[r2] = r13
            r2 = 1
            r1[r2] = r6
            r2 = 2
            r1[r2] = r3
            java.util.List r1 = r0.length((org.yaml.snakeyaml.tokens.Token[]) r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.diagnoseLog.setMin(char):java.util.List");
    }

    private length IsOverlapping(InitParams.AnonymousClass1 r13) {
        Boolean bool;
        Boolean bool2;
        addAutoLogActivity addautologactivity = this.getMax;
        int i = 0;
        int i2 = addautologactivity.setMin() ? addautologactivity.getMax[addautologactivity.length] : 0;
        Boolean bool3 = null;
        int i3 = -1;
        if (i2 == 45 || i2 == 43) {
            if (i2 == 43) {
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            bool3 = bool;
            this.getMax.setMin(1);
            addAutoLogActivity addautologactivity2 = this.getMax;
            int i4 = addautologactivity2.setMin() ? addautologactivity2.getMax[addautologactivity2.length] : 0;
            if (Character.isDigit(i4)) {
                i3 = Integer.parseInt(String.valueOf(Character.toChars(i4)));
                if (i3 != 0) {
                    this.getMax.setMin(1);
                } else {
                    addAutoLogActivity addautologactivity3 = this.getMax;
                    throw new ScannerException("while scanning a block scalar", r13, "expected indentation indicator in the range 1-9, but found 0", new InitParams.AnonymousClass1(addautologactivity3.getMin, addautologactivity3.setMax, addautologactivity3.setMin, addautologactivity3.toIntRange, addautologactivity3.getMax, addautologactivity3.length));
                }
            }
        } else if (Character.isDigit(i2)) {
            i3 = Integer.parseInt(String.valueOf(Character.toChars(i2)));
            if (i3 != 0) {
                this.getMax.setMin(1);
                addAutoLogActivity addautologactivity4 = this.getMax;
                int i5 = addautologactivity4.setMin() ? addautologactivity4.getMax[addautologactivity4.length] : 0;
                if (i5 == 45 || i5 == 43) {
                    if (i5 == 43) {
                        bool2 = Boolean.TRUE;
                    } else {
                        bool2 = Boolean.FALSE;
                    }
                    bool3 = bool2;
                    this.getMax.setMin(1);
                }
            } else {
                addAutoLogActivity addautologactivity5 = this.getMax;
                throw new ScannerException("while scanning a block scalar", r13, "expected indentation indicator in the range 1-9, but found 0", new InitParams.AnonymousClass1(addautologactivity5.getMin, addautologactivity5.setMax, addautologactivity5.setMin, addautologactivity5.toIntRange, addautologactivity5.getMax, addautologactivity5.length));
            }
        }
        addAutoLogActivity addautologactivity6 = this.getMax;
        if (addautologactivity6.setMin()) {
            i = addautologactivity6.getMax[addautologactivity6.length];
        }
        if (!setSpmMonitor.setMax.getMin(i)) {
            return new length(bool3, i3);
        }
        String valueOf = String.valueOf(Character.toChars(i));
        StringBuilder sb = new StringBuilder("expected chomping or indentation indicators, but found ");
        sb.append(valueOf);
        sb.append("(");
        sb.append(i);
        sb.append(")");
        String obj = sb.toString();
        addAutoLogActivity addautologactivity7 = this.getMax;
        throw new ScannerException("while scanning a block scalar", r13, obj, new InitParams.AnonymousClass1(addautologactivity7.getMin, addautologactivity7.setMax, addautologactivity7.setMin, addautologactivity7.toIntRange, addautologactivity7.getMax, addautologactivity7.length));
    }

    private apm equals(InitParams.AnonymousClass1 r12) {
        int i;
        while (true) {
            addAutoLogActivity addautologactivity = this.getMax;
            i = 0;
            if ((addautologactivity.setMin() ? addautologactivity.getMax[addautologactivity.length] : 0) != 32) {
                break;
            }
            this.getMax.setMin(1);
        }
        apm apm = null;
        addAutoLogActivity addautologactivity2 = this.getMax;
        if ((addautologactivity2.setMin() ? addautologactivity2.getMax[addautologactivity2.length] : 0) == 35) {
            apm = getMax(CommentType.IN_LINE);
        }
        addAutoLogActivity addautologactivity3 = this.getMax;
        if (addautologactivity3.setMin()) {
            i = addautologactivity3.getMax[addautologactivity3.length];
        }
        if (onMessageChannelReady().length() != 0 || i == 0) {
            return apm;
        }
        String valueOf = String.valueOf(Character.toChars(i));
        StringBuilder sb = new StringBuilder("expected a comment or a line break, but found ");
        sb.append(valueOf);
        sb.append("(");
        sb.append(i);
        sb.append(")");
        String obj = sb.toString();
        addAutoLogActivity addautologactivity4 = this.getMax;
        throw new ScannerException("while scanning a block scalar", r12, obj, new InitParams.AnonymousClass1(addautologactivity4.getMin, addautologactivity4.setMax, addautologactivity4.setMin, addautologactivity4.toIntRange, addautologactivity4.getMax, addautologactivity4.length));
    }

    private Object[] getCause() {
        StringBuilder sb = new StringBuilder();
        addAutoLogActivity addautologactivity = this.getMax;
        InitParams.AnonymousClass1 r2 = new InitParams.AnonymousClass1(addautologactivity.getMin, addautologactivity.setMax, addautologactivity.setMin, addautologactivity.toIntRange, addautologactivity.getMax, addautologactivity.length);
        int i = 0;
        while (true) {
            setSpmMonitor setspmmonitor = setSpmMonitor.length;
            addAutoLogActivity addautologactivity2 = this.getMax;
            if (setspmmonitor.getMin(addautologactivity2.setMin() ? addautologactivity2.getMax[addautologactivity2.length] : 0, " \r")) {
                addAutoLogActivity addautologactivity3 = this.getMax;
                if ((addautologactivity3.setMin() ? addautologactivity3.getMax[addautologactivity3.length] : 0) != 32) {
                    sb.append(onMessageChannelReady());
                    addAutoLogActivity addautologactivity4 = this.getMax;
                    r2 = new InitParams.AnonymousClass1(addautologactivity4.getMin, addautologactivity4.setMax, addautologactivity4.setMin, addautologactivity4.toIntRange, addautologactivity4.getMax, addautologactivity4.length);
                } else {
                    this.getMax.getMax();
                    if (this.getMax.toIntRange > i) {
                        i = this.getMax.toIntRange;
                    }
                }
            } else {
                return new Object[]{sb.toString(), Integer.valueOf(i), r2};
            }
        }
    }

    private Object[] setMin(int i) {
        StringBuilder sb = new StringBuilder();
        addAutoLogActivity addautologactivity = this.getMax;
        InitParams.AnonymousClass1 r2 = new InitParams.AnonymousClass1(addautologactivity.getMin, addautologactivity.setMax, addautologactivity.setMin, addautologactivity.toIntRange, addautologactivity.getMax, addautologactivity.length);
        for (int i2 = this.getMax.toIntRange; i2 < i; i2++) {
            addAutoLogActivity addautologactivity2 = this.getMax;
            if ((addautologactivity2.setMin() ? addautologactivity2.getMax[addautologactivity2.length] : 0) != 32) {
                break;
            }
            this.getMax.getMax();
        }
        while (true) {
            String onMessageChannelReady = onMessageChannelReady();
            if (onMessageChannelReady.length() != 0) {
                sb.append(onMessageChannelReady);
                addAutoLogActivity addautologactivity3 = this.getMax;
                InitParams.AnonymousClass1 r4 = new InitParams.AnonymousClass1(addautologactivity3.getMin, addautologactivity3.setMax, addautologactivity3.setMin, addautologactivity3.toIntRange, addautologactivity3.getMax, addautologactivity3.length);
                for (int i3 = this.getMax.toIntRange; i3 < i; i3++) {
                    addAutoLogActivity addautologactivity4 = this.getMax;
                    if ((addautologactivity4.setMin() ? addautologactivity4.getMax[addautologactivity4.length] : 0) != 32) {
                        break;
                    }
                    this.getMax.getMax();
                }
                r2 = r4;
            } else {
                return new Object[]{sb.toString(), r2};
            }
        }
    }

    private Token getMin(char c) {
        boolean z = c == '\"';
        StringBuilder sb = new StringBuilder();
        addAutoLogActivity addautologactivity = this.getMax;
        InitParams.AnonymousClass1 r4 = new InitParams.AnonymousClass1(addautologactivity.getMin, addautologactivity.setMax, addautologactivity.setMin, addautologactivity.toIntRange, addautologactivity.getMax, addautologactivity.length);
        addAutoLogActivity addautologactivity2 = this.getMax;
        int i = addautologactivity2.setMin() ? addautologactivity2.getMax[addautologactivity2.length] : 0;
        this.getMax.getMax();
        sb.append(setMax(z, r4));
        while (true) {
            addAutoLogActivity addautologactivity3 = this.getMax;
            if ((addautologactivity3.setMin() ? addautologactivity3.getMax[addautologactivity3.length] : 0) != i) {
                sb.append(isInside(r4));
                sb.append(setMax(z, r4));
            } else {
                this.getMax.getMax();
                addAutoLogActivity addautologactivity4 = this.getMax;
                return new getProcessAlias(sb.toString(), false, r4, new InitParams.AnonymousClass1(addautologactivity4.getMin, addautologactivity4.setMax, addautologactivity4.setMin, addautologactivity4.toIntRange, addautologactivity4.getMax, addautologactivity4.length), DumperOptions.ScalarStyle.createStyle(Character.valueOf(c)));
            }
        }
    }

    private String setMax(boolean z, InitParams.AnonymousClass1 r13) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = 0;
            int i2 = 0;
            while (true) {
                setSpmMonitor setspmmonitor = setSpmMonitor.getMin;
                addAutoLogActivity addautologactivity = this.getMax;
                if (!setspmmonitor.getMax(addautologactivity.getMax(i2) ? addautologactivity.getMax[addautologactivity.length + i2] : 0, "'\"\\")) {
                    break;
                }
                i2++;
            }
            if (i2 != 0) {
                sb.append(this.getMax.setMax(i2));
            }
            addAutoLogActivity addautologactivity2 = this.getMax;
            int i3 = addautologactivity2.setMin() ? addautologactivity2.getMax[addautologactivity2.length] : 0;
            if (!z && i3 == 39) {
                addAutoLogActivity addautologactivity3 = this.getMax;
                if ((addautologactivity3.getMax(1) ? addautologactivity3.getMax[addautologactivity3.length + 1] : 0) == 39) {
                    sb.append("'");
                    this.getMax.setMin(2);
                }
            }
            if ((z && i3 == 39) || (!z && "\"\\".indexOf(i3) != -1)) {
                sb.appendCodePoint(i3);
                this.getMax.getMax();
            } else if (z && i3 == 92) {
                this.getMax.getMax();
                addAutoLogActivity addautologactivity4 = this.getMax;
                if (addautologactivity4.setMin()) {
                    i = addautologactivity4.getMax[addautologactivity4.length];
                }
                if (!Character.isSupplementaryCodePoint(i)) {
                    char c = (char) i;
                    if (setMin.containsKey(Character.valueOf(c))) {
                        sb.append(setMin.get(Character.valueOf(c)));
                        this.getMax.getMax();
                    }
                }
                if (!Character.isSupplementaryCodePoint(i)) {
                    char c2 = (char) i;
                    if (length.containsKey(Character.valueOf(c2))) {
                        int intValue = length.get(Character.valueOf(c2)).intValue();
                        this.getMax.getMax();
                        String min = this.getMax.getMin(intValue);
                        if (!getMin.matcher(min).find()) {
                            sb.append(new String(Character.toChars(Integer.parseInt(min, 16))));
                            this.getMax.setMin(intValue);
                        } else {
                            StringBuilder sb2 = new StringBuilder("expected escape sequence of ");
                            sb2.append(intValue);
                            sb2.append(" hexadecimal numbers, but found: ");
                            sb2.append(min);
                            String obj = sb2.toString();
                            addAutoLogActivity addautologactivity5 = this.getMax;
                            throw new ScannerException("while scanning a double-quoted scalar", r13, obj, new InitParams.AnonymousClass1(addautologactivity5.getMin, addautologactivity5.setMax, addautologactivity5.setMin, addautologactivity5.toIntRange, addautologactivity5.getMax, addautologactivity5.length));
                        }
                    }
                }
                if (onMessageChannelReady().length() != 0) {
                    sb.append(hashCode(r13));
                } else {
                    String valueOf = String.valueOf(Character.toChars(i));
                    StringBuilder sb3 = new StringBuilder("found unknown escape character ");
                    sb3.append(valueOf);
                    sb3.append("(");
                    sb3.append(i);
                    sb3.append(")");
                    String obj2 = sb3.toString();
                    addAutoLogActivity addautologactivity6 = this.getMax;
                    throw new ScannerException("while scanning a double-quoted scalar", r13, obj2, new InitParams.AnonymousClass1(addautologactivity6.getMin, addautologactivity6.setMax, addautologactivity6.setMin, addautologactivity6.toIntRange, addautologactivity6.getMax, addautologactivity6.length));
                }
            }
        }
        return sb.toString();
    }

    private String isInside(InitParams.AnonymousClass1 r11) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (true) {
            addAutoLogActivity addautologactivity = this.getMax;
            if (" \t".indexOf(addautologactivity.getMax(i2) ? addautologactivity.getMax[addautologactivity.length + i2] : 0) == -1) {
                break;
            }
            i2++;
        }
        String max = this.getMax.setMax(i2);
        addAutoLogActivity addautologactivity2 = this.getMax;
        if (addautologactivity2.setMin()) {
            i = addautologactivity2.getMax[addautologactivity2.length];
        }
        if (i != 0) {
            String onMessageChannelReady = onMessageChannelReady();
            if (onMessageChannelReady.length() != 0) {
                String hashCode = hashCode(r11);
                if (!"\n".equals(onMessageChannelReady)) {
                    sb.append(onMessageChannelReady);
                } else if (hashCode.length() == 0) {
                    sb.append(" ");
                }
                sb.append(hashCode);
            } else {
                sb.append(max);
            }
            return sb.toString();
        }
        addAutoLogActivity addautologactivity3 = this.getMax;
        throw new ScannerException("while scanning a quoted scalar", r11, "found unexpected end of stream", new InitParams.AnonymousClass1(addautologactivity3.getMin, addautologactivity3.setMax, addautologactivity3.setMin, addautologactivity3.toIntRange, addautologactivity3.getMax, addautologactivity3.length));
    }

    private String hashCode(InitParams.AnonymousClass1 r11) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String min = this.getMax.getMin(3);
            if ("---".equals(min) || "...".equals(min)) {
                setSpmMonitor setspmmonitor = setSpmMonitor.getMin;
                addAutoLogActivity addautologactivity = this.getMax;
                if (setspmmonitor.length(addautologactivity.getMax(3) ? addautologactivity.getMax[addautologactivity.length + 3] : 0)) {
                    addAutoLogActivity addautologactivity2 = this.getMax;
                    throw new ScannerException("while scanning a quoted scalar", r11, "found unexpected document separator", new InitParams.AnonymousClass1(addautologactivity2.getMin, addautologactivity2.setMax, addautologactivity2.setMin, addautologactivity2.toIntRange, addautologactivity2.getMax, addautologactivity2.length));
                }
            }
            while (true) {
                addAutoLogActivity addautologactivity3 = this.getMax;
                if (" \t".indexOf(addautologactivity3.setMin() ? addautologactivity3.getMax[addautologactivity3.length] : 0) == -1) {
                    break;
                }
                this.getMax.getMax();
            }
            String onMessageChannelReady = onMessageChannelReady();
            if (onMessageChannelReady.length() == 0) {
                return sb.toString();
            }
            sb.append(onMessageChannelReady);
        }
    }

    private Token onPostMessage() {
        String str;
        StringBuilder sb = new StringBuilder();
        addAutoLogActivity addautologactivity = this.getMax;
        InitParams.AnonymousClass1 r3 = new InitParams.AnonymousClass1(addautologactivity.getMin, addautologactivity.setMax, addautologactivity.setMin, addautologactivity.toIntRange, addautologactivity.getMax, addautologactivity.length);
        int i = this.isInside + 1;
        String str2 = "";
        InitParams.AnonymousClass1 r5 = r3;
        while (true) {
            addAutoLogActivity addautologactivity2 = this.getMax;
            int i2 = 0;
            if ((addautologactivity2.setMin() ? addautologactivity2.getMax[addautologactivity2.length] : 0) == 35) {
                break;
            }
            int i3 = 0;
            while (true) {
                addAutoLogActivity addautologactivity3 = this.getMax;
                int i4 = addautologactivity3.getMax(i3) ? addautologactivity3.getMax[addautologactivity3.length + i3] : 0;
                if (!setSpmMonitor.getMin.length(i4)) {
                    if (i4 == 58) {
                        setSpmMonitor setspmmonitor = setSpmMonitor.getMin;
                        addAutoLogActivity addautologactivity4 = this.getMax;
                        int i5 = i3 + 1;
                        int i6 = addautologactivity4.getMax(i5) ? addautologactivity4.getMax[addautologactivity4.length + i5] : 0;
                        if (this.toIntRange != 0) {
                            str = ",[]{}";
                        } else {
                            str = "";
                        }
                        if (setspmmonitor.getMin(i6, str)) {
                            break;
                        }
                    }
                    if (this.toIntRange != 0 && ",?[]{}".indexOf(i4) != -1) {
                        break;
                    }
                    i3++;
                } else {
                    break;
                }
            }
            if (i3 == 0) {
                break;
            }
            this.toDoubleRange = false;
            sb.append(str2);
            sb.append(this.getMax.setMax(i3));
            addAutoLogActivity addautologactivity5 = this.getMax;
            r5 = new InitParams.AnonymousClass1(addautologactivity5.getMin, addautologactivity5.setMax, addautologactivity5.setMin, addautologactivity5.toIntRange, addautologactivity5.getMax, addautologactivity5.length);
            str2 = onRelationshipValidationResult();
            if (str2.length() == 0) {
                break;
            }
            addAutoLogActivity addautologactivity6 = this.getMax;
            if (addautologactivity6.setMin()) {
                i2 = addautologactivity6.getMax[addautologactivity6.length];
            }
            if (i2 == 35 || (this.toIntRange == 0 && this.getMax.toIntRange < i)) {
                break;
            }
        }
        return new getProcessAlias(sb.toString(), r3, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        if (r1.length(r8.getMax(3) ? r8.getMax[r8.length + 3] : 0) != false) goto L_0x00f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String onRelationshipValidationResult() {
        /*
            r11 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            o.addAutoLogActivity r2 = r11.getMax
            boolean r3 = r2.getMax(r1)
            if (r3 == 0) goto L_0x0012
            int[] r3 = r2.getMax
            int r2 = r2.length
            int r2 = r2 + r1
            r2 = r3[r2]
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r3 = 32
            if (r2 == r3) goto L_0x00f3
            o.addAutoLogActivity r2 = r11.getMax
            boolean r4 = r2.getMax(r1)
            if (r4 == 0) goto L_0x0027
            int[] r4 = r2.getMax
            int r2 = r2.length
            int r2 = r2 + r1
            r2 = r4[r2]
            goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            r4 = 9
            if (r2 != r4) goto L_0x002e
            goto L_0x00f3
        L_0x002e:
            o.addAutoLogActivity r2 = r11.getMax
            java.lang.String r1 = r2.setMax(r1)
            java.lang.String r2 = r11.onMessageChannelReady()
            int r4 = r2.length()
            if (r4 == 0) goto L_0x00f2
            r1 = 1
            r11.toDoubleRange = r1
            o.addAutoLogActivity r1 = r11.getMax
            r4 = 3
            java.lang.String r1 = r1.getMin(r4)
            java.lang.String r5 = "---"
            boolean r6 = r5.equals(r1)
            java.lang.String r7 = ""
            if (r6 != 0) goto L_0x00f1
            java.lang.String r6 = "..."
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0075
            o.setSpmMonitor r1 = o.setSpmMonitor.getMin
            o.addAutoLogActivity r8 = r11.getMax
            boolean r9 = r8.getMax(r4)
            if (r9 == 0) goto L_0x006c
            int[] r9 = r8.getMax
            int r8 = r8.length
            int r8 = r8 + r4
            r8 = r9[r8]
            goto L_0x006d
        L_0x006c:
            r8 = 0
        L_0x006d:
            boolean r1 = r1.length(r8)
            if (r1 == 0) goto L_0x0075
            goto L_0x00f1
        L_0x0075:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x007a:
            o.addAutoLogActivity r8 = r11.getMax
            boolean r9 = r8.setMin()
            if (r9 == 0) goto L_0x0089
            int[] r9 = r8.getMax
            int r8 = r8.length
            r8 = r9[r8]
            goto L_0x008a
        L_0x0089:
            r8 = 0
        L_0x008a:
            if (r8 != r3) goto L_0x0092
            o.addAutoLogActivity r8 = r11.getMax
            r8.getMax()
            goto L_0x007a
        L_0x0092:
            java.lang.String r8 = r11.onMessageChannelReady()
            int r9 = r8.length()
            if (r9 == 0) goto L_0x00cb
            r1.append(r8)
            o.addAutoLogActivity r8 = r11.getMax
            java.lang.String r8 = r8.getMin(r4)
            boolean r9 = r5.equals(r8)
            if (r9 != 0) goto L_0x00ca
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x007a
            o.setSpmMonitor r8 = o.setSpmMonitor.getMin
            o.addAutoLogActivity r9 = r11.getMax
            boolean r10 = r9.getMax(r4)
            if (r10 == 0) goto L_0x00c3
            int[] r10 = r9.getMax
            int r9 = r9.length
            int r9 = r9 + r4
            r9 = r10[r9]
            goto L_0x00c4
        L_0x00c3:
            r9 = 0
        L_0x00c4:
            boolean r8 = r8.length(r9)
            if (r8 == 0) goto L_0x007a
        L_0x00ca:
            return r7
        L_0x00cb:
            java.lang.String r0 = "\n"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00e3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x00e3:
            int r0 = r1.length()
            if (r0 != 0) goto L_0x00ec
            java.lang.String r0 = " "
            return r0
        L_0x00ec:
            java.lang.String r0 = r1.toString()
            return r0
        L_0x00f1:
            return r7
        L_0x00f2:
            return r1
        L_0x00f3:
            int r1 = r1 + 1
            goto L_0x0002
        */
        throw new UnsupportedOperationException("Method not decompiled: o.diagnoseLog.onRelationshipValidationResult():java.lang.String");
    }

    private String length(String str, InitParams.AnonymousClass1 r18) {
        InitParams.AnonymousClass1 r1 = r18;
        addAutoLogActivity addautologactivity = this.getMax;
        int i = addautologactivity.setMin() ? addautologactivity.getMax[addautologactivity.length] : 0;
        if (i == 33) {
            addAutoLogActivity addautologactivity2 = this.getMax;
            int i2 = 1;
            int i3 = addautologactivity2.getMax(1) ? addautologactivity2.getMax[addautologactivity2.length + 1] : 0;
            if (i3 != 32) {
                int i4 = 1;
                while (setSpmMonitor.equals.length(i3)) {
                    i4++;
                    addAutoLogActivity addautologactivity3 = this.getMax;
                    i3 = addautologactivity3.getMax(i4) ? addautologactivity3.getMax[addautologactivity3.length + i4] : 0;
                }
                if (i3 == 33) {
                    i2 = 1 + i4;
                } else {
                    this.getMax.setMin(i4);
                    String valueOf = String.valueOf(Character.toChars(i3));
                    String concat = "while scanning a ".concat(String.valueOf(str));
                    StringBuilder sb = new StringBuilder("expected '!', but found ");
                    sb.append(valueOf);
                    sb.append("(");
                    sb.append(i3);
                    sb.append(")");
                    String obj = sb.toString();
                    addAutoLogActivity addautologactivity4 = this.getMax;
                    throw new ScannerException(concat, r1, obj, new InitParams.AnonymousClass1(addautologactivity4.getMin, addautologactivity4.setMax, addautologactivity4.setMin, addautologactivity4.toIntRange, addautologactivity4.getMax, addautologactivity4.length));
                }
            }
            return this.getMax.setMax(i2);
        }
        String valueOf2 = String.valueOf(Character.toChars(i));
        String concat2 = "while scanning a ".concat(String.valueOf(str));
        StringBuilder sb2 = new StringBuilder("expected '!', but found ");
        sb2.append(valueOf2);
        sb2.append("(");
        sb2.append(i);
        sb2.append(")");
        String obj2 = sb2.toString();
        addAutoLogActivity addautologactivity5 = this.getMax;
        throw new ScannerException(concat2, r1, obj2, new InitParams.AnonymousClass1(addautologactivity5.getMin, addautologactivity5.setMax, addautologactivity5.setMin, addautologactivity5.toIntRange, addautologactivity5.getMax, addautologactivity5.length));
    }

    private String getMax(String str, InitParams.AnonymousClass1 r13) {
        StringBuilder sb = new StringBuilder();
        addAutoLogActivity addautologactivity = this.getMax;
        int i = addautologactivity.getMax(0) ? addautologactivity.getMax[addautologactivity.length + 0] : 0;
        int i2 = 0;
        while (setSpmMonitor.toIntRange.length(i)) {
            if (i == 37) {
                sb.append(this.getMax.setMax(i2));
                sb.append(setMax(str, r13));
                i2 = 0;
            } else {
                i2++;
            }
            addAutoLogActivity addautologactivity2 = this.getMax;
            i = addautologactivity2.getMax(i2) ? addautologactivity2.getMax[addautologactivity2.length + i2] : 0;
        }
        if (i2 != 0) {
            sb.append(this.getMax.setMax(i2));
        }
        if (sb.length() != 0) {
            return sb.toString();
        }
        String valueOf = String.valueOf(Character.toChars(i));
        String concat = "while scanning a ".concat(String.valueOf(str));
        StringBuilder sb2 = new StringBuilder("expected URI, but found ");
        sb2.append(valueOf);
        sb2.append("(");
        sb2.append(i);
        sb2.append(")");
        String obj = sb2.toString();
        addAutoLogActivity addautologactivity3 = this.getMax;
        throw new ScannerException(concat, r13, obj, new InitParams.AnonymousClass1(addautologactivity3.getMin, addautologactivity3.setMax, addautologactivity3.setMin, addautologactivity3.toIntRange, addautologactivity3.getMax, addautologactivity3.length));
    }

    private String setMax(String str, InitParams.AnonymousClass1 r15) {
        int i;
        int i2 = 1;
        while (true) {
            addAutoLogActivity addautologactivity = this.getMax;
            int i3 = i2 * 3;
            i = 0;
            if ((addautologactivity.getMax(i3) ? addautologactivity.getMax[addautologactivity.length + i3] : 0) != 37) {
                break;
            }
            i2++;
        }
        addAutoLogActivity addautologactivity2 = this.getMax;
        InitParams.AnonymousClass1 r6 = new InitParams.AnonymousClass1(addautologactivity2.getMin, addautologactivity2.setMax, addautologactivity2.setMin, addautologactivity2.toIntRange, addautologactivity2.getMax, addautologactivity2.length);
        ByteBuffer allocate = ByteBuffer.allocate(i2);
        while (true) {
            addAutoLogActivity addautologactivity3 = this.getMax;
            if ((addautologactivity3.setMin() ? addautologactivity3.getMax[addautologactivity3.length] : 0) == 37) {
                this.getMax.setMin(1);
                try {
                    allocate.put((byte) Integer.parseInt(this.getMax.getMin(2), 16));
                    this.getMax.setMin(2);
                } catch (NumberFormatException unused) {
                    addAutoLogActivity addautologactivity4 = this.getMax;
                    int i4 = addautologactivity4.setMin() ? addautologactivity4.getMax[addautologactivity4.length] : 0;
                    String valueOf = String.valueOf(Character.toChars(i4));
                    addAutoLogActivity addautologactivity5 = this.getMax;
                    if (addautologactivity5.getMax(1)) {
                        i = addautologactivity5.getMax[addautologactivity5.length + 1];
                    }
                    String valueOf2 = String.valueOf(Character.toChars(i));
                    String concat = "while scanning a ".concat(String.valueOf(str));
                    StringBuilder sb = new StringBuilder("expected URI escape sequence of 2 hexadecimal numbers, but found ");
                    sb.append(valueOf);
                    sb.append("(");
                    sb.append(i4);
                    sb.append(") and ");
                    sb.append(valueOf2);
                    sb.append("(");
                    sb.append(i);
                    sb.append(")");
                    String obj = sb.toString();
                    addAutoLogActivity addautologactivity6 = this.getMax;
                    throw new ScannerException(concat, r15, obj, new InitParams.AnonymousClass1(addautologactivity6.getMin, addautologactivity6.setMax, addautologactivity6.setMin, addautologactivity6.toIntRange, addautologactivity6.getMax, addautologactivity6.length));
                }
            } else {
                allocate.flip();
                try {
                    return shouldLogCrash.getMax(allocate);
                } catch (CharacterCodingException e) {
                    String concat2 = "while scanning a ".concat(String.valueOf(str));
                    StringBuilder sb2 = new StringBuilder("expected URI in UTF-8: ");
                    sb2.append(e.getMessage());
                    throw new ScannerException(concat2, r15, sb2.toString(), r6);
                }
            }
        }
    }

    private String onMessageChannelReady() {
        addAutoLogActivity addautologactivity = this.getMax;
        int i = 0;
        int i2 = addautologactivity.setMin() ? addautologactivity.getMax[addautologactivity.length] : 0;
        if (i2 == 13 || i2 == 10 || i2 == 133) {
            if (i2 == 13) {
                addAutoLogActivity addautologactivity2 = this.getMax;
                if (addautologactivity2.getMax(1)) {
                    i = addautologactivity2.getMax[addautologactivity2.length + 1];
                }
                if (10 == i) {
                    this.getMax.setMin(2);
                    return "\n";
                }
            }
            this.getMax.setMin(1);
            return "\n";
        } else if (i2 != 8232 && i2 != 8233) {
            return "";
        } else {
            this.getMax.setMin(1);
            return String.valueOf(Character.toChars(i2));
        }
    }

    private List<Token> length(Token... tokenArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < tokenArr.length; i++) {
            if (tokenArr[i] != null && (this.toString || !(tokenArr[i] instanceof apm))) {
                arrayList.add(tokenArr[i]);
            }
        }
        return arrayList;
    }

    static class length {
        private final Boolean getMax;
        final int length;

        public length(Boolean bool, int i) {
            this.getMax = bool;
            this.length = i;
        }

        public final boolean setMin() {
            Boolean bool = this.getMax;
            return bool == null || bool.booleanValue();
        }

        public final boolean getMax() {
            Boolean bool = this.getMax;
            return bool != null && bool.booleanValue();
        }
    }
}
