package o;

import com.alibaba.griver.image.capture.meta.CameraParams;
import id.dana.data.sendmoney.model.TransferUserInfoResult;
import id.dana.sendmoney.summary.SummaryActivity;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.InitParams;
import o.R;
import org.yaml.snakeyaml.constructor.ConstructorException;
import org.yaml.snakeyaml.constructor.DuplicateKeyException;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.nodes.NodeId;

public class initVerifyTaskOuter extends R.bool {
    /* access modifiers changed from: private */
    public static final Pattern invokeSuspend = Pattern.compile("^([0-9][0-9][0-9][0-9])-([0-9][0-9]?)-([0-9][0-9]?)(?:(?:[Tt]|[ \t]+)([0-9][0-9]?):([0-9][0-9]):([0-9][0-9])(?:\\.([0-9]*))?(?:[ \t]*(?:Z|([-+][0-9][0-9]?)(?::([0-9][0-9])?)?))?)?$");
    public static final length toDoubleRange = new length();
    private static final int[][] toString = ((int[][]) Array.newInstance(int.class, new int[]{17, 2}));
    /* access modifiers changed from: private */
    public static final Pattern valueOf = Pattern.compile("^([0-9][0-9][0-9][0-9])-([0-9][0-9]?)-([0-9][0-9]?)$");
    /* access modifiers changed from: private */
    public static final Map<String, Boolean> values;

    static {
        HashMap hashMap = new HashMap();
        values = hashMap;
        hashMap.put("yes", Boolean.TRUE);
        values.put("no", Boolean.FALSE);
        values.put(SummaryActivity.CHECKED, Boolean.TRUE);
        values.put("false", Boolean.FALSE);
        values.put(CameraParams.FLASH_MODE_ON, Boolean.TRUE);
        values.put(CameraParams.FLASH_MODE_OFF, Boolean.FALSE);
        int[] iArr = {2, 8, 10, 16};
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            toString[i2] = new int[]{Integer.toString(Integer.MAX_VALUE, i2).length(), Long.toString(Long.MAX_VALUE, i2).length()};
        }
    }

    public initVerifyTaskOuter() {
        this(new getEvVer());
    }

    public initVerifyTaskOuter(getEvVer getevver) {
        super(getevver);
        this.getMax.put(getLastPage.hashCode, new isInside());
        this.getMax.put(getLastPage.toFloatRange, new setMin());
        this.getMax.put(getLastPage.toIntRange, new setMax());
        this.getMax.put(getLastPage.equals, new getMin());
        this.getMax.put(getLastPage.isInside, new getMax());
        this.getMax.put(getLastPage.IsOverlapping, new hashCode());
        this.getMax.put(getLastPage.length, new toFloatRange());
        this.getMax.put(getLastPage.setMin, new toIntRange());
        this.getMax.put(getLastPage.getMin, new initVerifyTaskOuter$FastBitmap$CoordinateSystem(this));
        this.getMax.put(getLastPage.values, new toString());
        this.getMax.put(getLastPage.toString, new equals());
        this.getMax.put(getLastPage.FastBitmap$CoordinateSystem, new IsOverlapping());
        this.getMax.put((Object) null, toDoubleRange);
        this.setMin.put(NodeId.scalar, toDoubleRange);
        this.setMin.put(NodeId.sequence, toDoubleRange);
        this.setMin.put(NodeId.mapping, toDoubleRange);
    }

    /* renamed from: o.initVerifyTaskOuter$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] setMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                org.yaml.snakeyaml.nodes.NodeId[] r0 = org.yaml.snakeyaml.nodes.NodeId.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMax = r0
                org.yaml.snakeyaml.nodes.NodeId r1 = org.yaml.snakeyaml.nodes.NodeId.mapping     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x001d }
                org.yaml.snakeyaml.nodes.NodeId r1 = org.yaml.snakeyaml.nodes.NodeId.sequence     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.initVerifyTaskOuter.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public final void setMin(getLayoutType getlayouttype, Map<Object, Object> map) {
        setMin(getlayouttype);
        super.setMin(getlayouttype, map);
    }

    /* access modifiers changed from: protected */
    public final void getMax(getLayoutType getlayouttype, Set<Object> set) {
        setMin(getlayouttype);
        super.getMax(getlayouttype, set);
    }

    public class isInside extends getHwVer {
        public final Object setMax(getLanguage getlanguage) {
            return null;
        }

        public isInside() {
        }
    }

    public class setMin extends getHwVer {
        public setMin() {
        }

        public final Object setMax(getLanguage getlanguage) {
            return initVerifyTaskOuter.values.get(((addPage) getlanguage).getMin.toLowerCase());
        }
    }

    public class setMax extends getHwVer {
        public setMax() {
        }

        public final Object setMax(getLanguage getlanguage) {
            int i;
            String str;
            String replaceAll = ((addPage) getlanguage).getMin.toString().replaceAll("_", "");
            char charAt = replaceAll.charAt(0);
            if (charAt == '-') {
                replaceAll = replaceAll.substring(1);
                i = -1;
            } else {
                if (charAt == '+') {
                    replaceAll = replaceAll.substring(1);
                }
                i = 1;
            }
            if ("0".equals(replaceAll)) {
                return 0;
            }
            int i2 = 2;
            if (replaceAll.startsWith("0b")) {
                str = replaceAll.substring(2);
            } else if (replaceAll.startsWith("0x")) {
                str = replaceAll.substring(2);
                i2 = 16;
            } else if (replaceAll.startsWith("0")) {
                str = replaceAll.substring(1);
                i2 = 8;
            } else if (replaceAll.indexOf(58) == -1) {
                return initVerifyTaskOuter.length(i, replaceAll, 10);
            } else {
                String[] split = replaceAll.split(":");
                int length = split.length;
                int i3 = 0;
                int i4 = 1;
                for (int i5 = 0; i5 < length; i5++) {
                    i3 = (int) (((long) i3) + (Long.parseLong(split[(length - i5) - 1]) * ((long) i4)));
                    i4 *= 60;
                }
                return initVerifyTaskOuter.length(i, String.valueOf(i3), 10);
            }
            return initVerifyTaskOuter.length(i, str, i2);
        }
    }

    /* access modifiers changed from: private */
    public static Number length(int i, String str, int i2) {
        boolean z = false;
        int length2 = str != null ? str.length() : 0;
        if (i < 0) {
            str = "-".concat(String.valueOf(str));
        }
        int[][] iArr = toString;
        int[] iArr2 = i2 < iArr.length ? iArr[i2] : null;
        if (iArr2 != null) {
            if (length2 > iArr2[0]) {
                z = true;
            }
            if (z) {
                if (length2 > iArr2[1]) {
                    return new BigInteger(str, i2);
                }
                return getMin(str, i2);
            }
        }
        try {
            return Integer.valueOf(str, i2);
        } catch (NumberFormatException unused) {
            return getMin(str, i2);
        }
    }

    private static Number getMin(String str, int i) {
        try {
            return Long.valueOf(str, i);
        } catch (NumberFormatException unused) {
            return new BigInteger(str, i);
        }
    }

    public class getMin extends getHwVer {
        public getMin() {
        }

        public final Object setMax(getLanguage getlanguage) {
            int i;
            String replaceAll = ((addPage) getlanguage).getMin.toString().replaceAll("_", "");
            char charAt = replaceAll.charAt(0);
            if (charAt == '-') {
                replaceAll = replaceAll.substring(1);
                i = -1;
            } else {
                if (charAt == '+') {
                    replaceAll = replaceAll.substring(1);
                }
                i = 1;
            }
            String lowerCase = replaceAll.toLowerCase();
            if (".inf".equals(lowerCase)) {
                return Double.valueOf(i == -1 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            } else if (".nan".equals(lowerCase)) {
                return Double.valueOf(Double.NaN);
            } else {
                if (replaceAll.indexOf(58) != -1) {
                    String[] split = replaceAll.split(":");
                    double d = 0.0d;
                    int length = split.length;
                    int i2 = 1;
                    for (int i3 = 0; i3 < length; i3++) {
                        double parseDouble = Double.parseDouble(split[(length - i3) - 1]);
                        double d2 = (double) i2;
                        Double.isNaN(d2);
                        d += parseDouble * d2;
                        i2 *= 60;
                    }
                    double d3 = (double) i;
                    Double.isNaN(d3);
                    return Double.valueOf(d3 * d);
                }
                double doubleValue = Double.valueOf(replaceAll).doubleValue();
                double d4 = (double) i;
                Double.isNaN(d4);
                return Double.valueOf(doubleValue * d4);
            }
        }
    }

    public class getMax extends getHwVer {
        public getMax() {
        }

        public final Object setMax(getLanguage getlanguage) {
            return setLogEncryptClient.length(((addPage) getlanguage).getMin.toString().replaceAll("\\s", "").toCharArray());
        }
    }

    public static class hashCode extends getHwVer {
        Calendar getMax;

        public final Object setMax(getLanguage getlanguage) {
            TimeZone timeZone;
            String str = ((addPage) getlanguage).getMin;
            Matcher matcher = initVerifyTaskOuter.valueOf.matcher(str);
            if (matcher.matches()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                String group3 = matcher.group(3);
                Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                this.getMax = instance;
                instance.clear();
                this.getMax.set(1, Integer.parseInt(group));
                this.getMax.set(2, Integer.parseInt(group2) - 1);
                this.getMax.set(5, Integer.parseInt(group3));
                return this.getMax.getTime();
            }
            Matcher matcher2 = initVerifyTaskOuter.invokeSuspend.matcher(str);
            if (matcher2.matches()) {
                String group4 = matcher2.group(1);
                String group5 = matcher2.group(2);
                String group6 = matcher2.group(3);
                String group7 = matcher2.group(4);
                String group8 = matcher2.group(5);
                String group9 = matcher2.group(6);
                String group10 = matcher2.group(7);
                if (group10 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(group9);
                    sb.append(".");
                    sb.append(group10);
                    group9 = sb.toString();
                }
                double parseDouble = Double.parseDouble(group9);
                int round = (int) Math.round(Math.floor(parseDouble));
                double d = (double) round;
                Double.isNaN(d);
                int round2 = (int) Math.round((parseDouble - d) * 1000.0d);
                String group11 = matcher2.group(8);
                String group12 = matcher2.group(9);
                if (group11 != null) {
                    String concat = group12 != null ? ":".concat(String.valueOf(group12)) : TransferUserInfoResult.KycLevel.KYC_0;
                    StringBuilder sb2 = new StringBuilder("GMT");
                    sb2.append(group11);
                    sb2.append(concat);
                    timeZone = TimeZone.getTimeZone(sb2.toString());
                } else {
                    timeZone = TimeZone.getTimeZone("UTC");
                }
                Calendar instance2 = Calendar.getInstance(timeZone);
                this.getMax = instance2;
                instance2.set(1, Integer.parseInt(group4));
                this.getMax.set(2, Integer.parseInt(group5) - 1);
                this.getMax.set(5, Integer.parseInt(group6));
                this.getMax.set(11, Integer.parseInt(group7));
                this.getMax.set(12, Integer.parseInt(group8));
                this.getMax.set(13, round);
                this.getMax.set(14, round2);
                return this.getMax.getTime();
            }
            throw new YAMLException("Unexpected timestamp: ".concat(String.valueOf(str)));
        }
    }

    public class toFloatRange extends getHwVer {
        public toFloatRange() {
        }

        public final Object setMax(getLanguage getlanguage) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (getlanguage instanceof setLayoutType) {
                for (getLanguage next : ((setLayoutType) getlanguage).setMin) {
                    if (next instanceof getLayoutType) {
                        getLayoutType getlayouttype = (getLayoutType) next;
                        if (getlayouttype.getMin.size() == 1) {
                            linkedHashMap.put(initVerifyTaskOuter.this.length(getlayouttype.getMin.get(0).getMax), initVerifyTaskOuter.this.length(getlayouttype.getMin.get(0).length));
                        } else {
                            InitParams.AnonymousClass1 r7 = getlanguage.length;
                            StringBuilder sb = new StringBuilder("expected a single mapping item, but found ");
                            sb.append(getlayouttype.getMin.size());
                            sb.append(" items");
                            throw new ConstructorException("while constructing an ordered map", r7, sb.toString(), getlayouttype.length);
                        }
                    } else {
                        InitParams.AnonymousClass1 r72 = getlanguage.length;
                        StringBuilder sb2 = new StringBuilder("expected a mapping of length 1, but found ");
                        sb2.append(next.length());
                        throw new ConstructorException("while constructing an ordered map", r72, sb2.toString(), next.length);
                    }
                }
                return linkedHashMap;
            }
            InitParams.AnonymousClass1 r1 = getlanguage.length;
            StringBuilder sb3 = new StringBuilder("expected a sequence, but found ");
            sb3.append(getlanguage.length());
            throw new ConstructorException("while constructing an ordered map", r1, sb3.toString(), getlanguage.length);
        }
    }

    public class toIntRange extends getHwVer {
        public toIntRange() {
        }

        public final Object setMax(getLanguage getlanguage) {
            if (getlanguage instanceof setLayoutType) {
                setLayoutType setlayouttype = (setLayoutType) getlanguage;
                ArrayList arrayList = new ArrayList(setlayouttype.setMin.size());
                for (getLanguage next : setlayouttype.setMin) {
                    if (next instanceof getLayoutType) {
                        getLayoutType getlayouttype = (getLayoutType) next;
                        if (getlayouttype.getMin.size() == 1) {
                            getLanguage getlanguage2 = getlayouttype.getMin.get(0).getMax;
                            getLanguage getlanguage3 = getlayouttype.getMin.get(0).length;
                            arrayList.add(new Object[]{initVerifyTaskOuter.this.length(getlanguage2), initVerifyTaskOuter.this.length(getlanguage3)});
                        } else {
                            InitParams.AnonymousClass1 r9 = getlanguage.length;
                            StringBuilder sb = new StringBuilder("expected a single mapping item, but found ");
                            sb.append(getlayouttype.getMin.size());
                            sb.append(" items");
                            throw new ConstructorException("while constructing pairs", r9, sb.toString(), getlayouttype.length);
                        }
                    } else {
                        InitParams.AnonymousClass1 r92 = getlanguage.length;
                        StringBuilder sb2 = new StringBuilder("expected a mapping of length 1, but found ");
                        sb2.append(next.length());
                        throw new ConstructorException("while constructingpairs", r92, sb2.toString(), next.length);
                    }
                }
                return arrayList;
            }
            InitParams.AnonymousClass1 r2 = getlanguage.length;
            StringBuilder sb3 = new StringBuilder("expected a sequence, but found ");
            sb3.append(getlanguage.length());
            throw new ConstructorException("while constructing pairs", r2, sb3.toString(), getlanguage.length);
        }
    }

    public class toString extends getHwVer {
        public toString() {
        }

        public final Object setMax(getLanguage getlanguage) {
            return ((addPage) getlanguage).getMin;
        }
    }

    public class equals implements DeviceIdProvider {
        public equals() {
        }

        public final Object setMax(getLanguage getlanguage) {
            setLayoutType setlayouttype = (setLayoutType) getlanguage;
            if (getlanguage.setMax()) {
                return initVerifyTaskOuter.this.setMax(setlayouttype);
            }
            return initVerifyTaskOuter.this.getMax(setlayouttype);
        }

        public final void setMax(getLanguage getlanguage, Object obj) {
            if (getlanguage.setMax()) {
                initVerifyTaskOuter.this.setMax((setLayoutType) getlanguage, (Collection<Object>) (List) obj);
                return;
            }
            throw new YAMLException("Unexpected recursive sequence structure. Node: ".concat(String.valueOf(getlanguage)));
        }
    }

    public class IsOverlapping implements DeviceIdProvider {
        public IsOverlapping() {
        }

        public final Object setMax(getLanguage getlanguage) {
            getLayoutType getlayouttype = (getLayoutType) getlanguage;
            return getlanguage.setMax() ? new LinkedHashMap(getlayouttype.getMin.size()) : initVerifyTaskOuter.this.getMin(getlayouttype);
        }

        public final void setMax(getLanguage getlanguage, Object obj) {
            if (getlanguage.setMax()) {
                initVerifyTaskOuter.this.setMin((getLayoutType) getlanguage, (Map) obj);
                return;
            }
            throw new YAMLException("Unexpected recursive mapping structure. Node: ".concat(String.valueOf(getlanguage)));
        }
    }

    public static final class length extends getHwVer {
        public final Object setMax(getLanguage getlanguage) {
            StringBuilder sb = new StringBuilder("could not determine a constructor for the tag ");
            sb.append(getlanguage.setMax);
            throw new ConstructorException((String) null, (InitParams.AnonymousClass1) null, sb.toString(), getlanguage.length);
        }
    }

    /* access modifiers changed from: protected */
    public final void setMin(getLayoutType getlayouttype) {
        List<addSPMPage> list = getlayouttype.getMin;
        HashMap hashMap = new HashMap(list.size());
        TreeSet treeSet = new TreeSet();
        int i = 0;
        for (addSPMPage next : list) {
            getLanguage getlanguage = next.getMax;
            if (!getlanguage.setMax.equals(getLastPage.getMax)) {
                Object length2 = length(getlanguage);
                if (length2 != null) {
                    try {
                        length2.hashCode();
                    } catch (Exception e) {
                        throw new ConstructorException("while constructing a mapping", getlayouttype.length, "found unacceptable key ".concat(String.valueOf(length2)), next.getMax.length, e);
                    }
                }
                Integer num = (Integer) hashMap.put(length2, Integer.valueOf(i));
                if (num == null) {
                    continue;
                } else if (setMax()) {
                    treeSet.add(num);
                } else {
                    throw new DuplicateKeyException(getlayouttype.length, length2, next.getMax.length);
                }
            }
            i++;
        }
        Iterator descendingIterator = treeSet.descendingIterator();
        while (descendingIterator.hasNext()) {
            list.remove(((Integer) descendingIterator.next()).intValue());
        }
        if (getlayouttype.getMax()) {
            getlayouttype.getMin = setMin(getlayouttype, true, new HashMap(), new ArrayList());
        }
    }

    private List<addSPMPage> setMin(getLayoutType getlayouttype, boolean z, Map<Object, Integer> map, List<addSPMPage> list) {
        Iterator<addSPMPage> it = getlayouttype.getMin.iterator();
        while (it.hasNext()) {
            addSPMPage next = it.next();
            getLanguage getlanguage = next.getMax;
            getLanguage getlanguage2 = next.length;
            if (getlanguage.setMax.equals(getLastPage.getMax)) {
                it.remove();
                int i = AnonymousClass1.setMax[getlanguage2.length().ordinal()];
                if (i == 1) {
                    setMin((getLayoutType) getlanguage2, false, map, list);
                } else if (i == 2) {
                    for (getLanguage next2 : ((setLayoutType) getlanguage2).setMin) {
                        if (next2 instanceof getLayoutType) {
                            setMin((getLayoutType) next2, false, map, list);
                        } else {
                            InitParams.AnonymousClass1 r7 = getlayouttype.length;
                            StringBuilder sb = new StringBuilder("expected a mapping for merging, but found ");
                            sb.append(next2.length());
                            throw new ConstructorException("while constructing a mapping", r7, sb.toString(), next2.length);
                        }
                    }
                    continue;
                } else {
                    InitParams.AnonymousClass1 r72 = getlayouttype.length;
                    StringBuilder sb2 = new StringBuilder("expected a mapping or list of mappings for merging, but found ");
                    sb2.append(getlanguage2.length());
                    throw new ConstructorException("while constructing a mapping", r72, sb2.toString(), getlanguage2.length);
                }
            } else {
                Object length2 = length(getlanguage);
                if (!map.containsKey(length2)) {
                    list.add(next);
                    map.put(length2, Integer.valueOf(list.size() - 1));
                } else if (z) {
                    list.set(map.get(length2).intValue(), next);
                }
            }
        }
        return list;
    }
}
