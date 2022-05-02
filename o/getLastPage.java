package o;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class getLastPage {
    public static final getLastPage FastBitmap$CoordinateSystem = new getLastPage("tag:yaml.org,2002:map");
    public static final getLastPage IsOverlapping = new getLastPage("tag:yaml.org,2002:timestamp");
    public static final getLastPage equals = new getLastPage("tag:yaml.org,2002:float");
    public static final getLastPage getMax = new getLastPage("tag:yaml.org,2002:merge");
    public static final getLastPage getMin = new getLastPage("tag:yaml.org,2002:set");
    public static final getLastPage hashCode = new getLastPage("tag:yaml.org,2002:null");
    protected static final Map<getLastPage, Set<Class<?>>> invoke = new HashMap();
    public static final getLastPage isInside = new getLastPage("tag:yaml.org,2002:binary");
    public static final getLastPage length = new getLastPage("tag:yaml.org,2002:omap");
    public static final getLastPage setMax = new getLastPage("tag:yaml.org,2002:yaml");
    public static final getLastPage setMin = new getLastPage("tag:yaml.org,2002:pairs");
    public static final getLastPage toDoubleRange = new getLastPage("tag:yaml.org,2002:comment");
    public static final getLastPage toFloatRange = new getLastPage("tag:yaml.org,2002:bool");
    public static final getLastPage toIntRange = new getLastPage("tag:yaml.org,2002:int");
    public static final getLastPage toString = new getLastPage("tag:yaml.org,2002:seq");
    public static final getLastPage values = new getLastPage("tag:yaml.org,2002:str");
    public final String Mean$Arithmetic;
    private boolean valueOf = false;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(Double.class);
        hashSet.add(Float.class);
        hashSet.add(BigDecimal.class);
        invoke.put(equals, hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(Integer.class);
        hashSet2.add(Long.class);
        hashSet2.add(BigInteger.class);
        invoke.put(toIntRange, hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(Date.class);
        try {
            hashSet3.add(Class.forName("java.sql.Date"));
            hashSet3.add(Class.forName("java.sql.Timestamp"));
        } catch (ClassNotFoundException unused) {
        }
        invoke.put(IsOverlapping, hashSet3);
    }

    public getLastPage(String str) {
        if (str == null) {
            throw new NullPointerException("Tag must be provided.");
        } else if (str.length() == 0) {
            throw new IllegalArgumentException("Tag must not be empty.");
        } else if (str.trim().length() == str.length()) {
            this.Mean$Arithmetic = shouldLogCrash.setMin(str);
            this.valueOf = !str.startsWith("tag:yaml.org,2002:");
        } else {
            throw new IllegalArgumentException("Tag must not contain leading or trailing spaces.");
        }
    }

    public getLastPage(Class<? extends Object> cls) {
        if (cls != null) {
            StringBuilder sb = new StringBuilder("tag:yaml.org,2002:");
            sb.append(shouldLogCrash.setMin(cls.getName()));
            this.Mean$Arithmetic = sb.toString();
            return;
        }
        throw new NullPointerException("Class for tag must be provided.");
    }

    public final boolean setMax() {
        return this.valueOf;
    }

    public final boolean getMin(String str) {
        return this.Mean$Arithmetic.startsWith(str);
    }

    public final String toString() {
        return this.Mean$Arithmetic;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof getLastPage) {
            return this.Mean$Arithmetic.equals(((getLastPage) obj).Mean$Arithmetic);
        }
        return false;
    }

    public final int hashCode() {
        return this.Mean$Arithmetic.hashCode();
    }

    public final boolean setMin(Class<?> cls) {
        Set set = invoke.get(this);
        if (set != null) {
            return set.contains(cls);
        }
        return false;
    }
}
