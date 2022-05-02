package o;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.yaml.snakeyaml.nodes.NodeId;

public final class notifyClientEvent {
    public static final Pattern IsOverlapping = Pattern.compile("^(?:!|&|\\*)$");
    public static final Pattern equals = Pattern.compile("^(?:[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]|[0-9][0-9][0-9][0-9]-[0-9][0-9]?-[0-9][0-9]?(?:[Tt]|[ \t]+)[0-9][0-9]?:[0-9][0-9]:[0-9][0-9](?:\\.[0-9]*)?(?:[ \t]*(?:Z|[-+][0-9][0-9]?(?::[0-9][0-9])?))?)$");
    public static final Pattern getMax = Pattern.compile("^(?:[-+]?0b[0-1_]+|[-+]?0[0-7_]+|[-+]?(?:0|[1-9][0-9_]*)|[-+]?0x[0-9a-fA-F_]+|[-+]?[1-9][0-9_]*(?::[0-5]?[0-9])+)$");
    public static final Pattern getMin = Pattern.compile("^(?:~|null|Null|NULL| )$");
    public static final Pattern isInside = Pattern.compile("^(?:=)$");
    public static final Pattern length = Pattern.compile("^(?:yes|Yes|YES|no|No|NO|true|True|TRUE|false|False|FALSE|on|On|ON|off|Off|OFF)$");
    public static final Pattern setMax = Pattern.compile("^(?:<<)$");
    public static final Pattern setMin = Pattern.compile("^([-+]?(\\.[0-9]+|[0-9_]+(\\.[0-9_]*)?)([eE][-+]?[0-9]+)?|[-+]?[0-9][0-9_]*(?::[0-5]?[0-9])+\\.[0-9_]*|[-+]?\\.(?:inf|Inf|INF)|\\.(?:nan|NaN|NAN))$");
    public static final Pattern toFloatRange = Pattern.compile("^$");
    protected Map<Character, List<getLogAliveInterval>> toIntRange = new HashMap();

    private void setMax() {
        setMax(getLastPage.toFloatRange, length, "yYnNtTfFoO");
        setMax(getLastPage.toIntRange, getMax, "-+0123456789");
        setMax(getLastPage.equals, setMin, "-+0123456789.");
        setMax(getLastPage.getMax, setMax, SimpleComparison.LESS_THAN_OPERATION);
        setMax(getLastPage.hashCode, getMin, "~nN\u0000");
        setMax(getLastPage.hashCode, toFloatRange, (String) null);
        setMax(getLastPage.IsOverlapping, equals, "0123456789");
        setMax(getLastPage.setMax, IsOverlapping, "!&*");
    }

    public notifyClientEvent() {
        setMax();
    }

    private void setMax(getLastPage getlastpage, Pattern pattern, String str) {
        if (str == null) {
            List list = this.toIntRange.get((Object) null);
            if (list == null) {
                list = new ArrayList();
                this.toIntRange.put((Object) null, list);
            }
            list.add(new getLogAliveInterval(getlastpage, pattern));
            return;
        }
        for (char valueOf : str.toCharArray()) {
            Character valueOf2 = Character.valueOf(valueOf);
            if (valueOf2.charValue() == 0) {
                valueOf2 = null;
            }
            List list2 = this.toIntRange.get(valueOf2);
            if (list2 == null) {
                list2 = new ArrayList();
                this.toIntRange.put(valueOf2, list2);
            }
            list2.add(new getLogAliveInterval(getlastpage, pattern));
        }
    }

    public final getLastPage length(NodeId nodeId, String str, boolean z) {
        List<getLogAliveInterval> list;
        if (nodeId == NodeId.scalar && z) {
            if (str.length() == 0) {
                list = this.toIntRange.get(0);
            } else {
                list = this.toIntRange.get(Character.valueOf(str.charAt(0)));
            }
            if (list != null) {
                for (getLogAliveInterval getlogaliveinterval : list) {
                    getLastPage getlastpage = getlogaliveinterval.getMin;
                    if (getlogaliveinterval.length.matcher(str).matches()) {
                        return getlastpage;
                    }
                }
            }
            if (this.toIntRange.containsKey((Object) null)) {
                for (getLogAliveInterval getlogaliveinterval2 : this.toIntRange.get((Object) null)) {
                    getLastPage getlastpage2 = getlogaliveinterval2.getMin;
                    if (getlogaliveinterval2.length.matcher(str).matches()) {
                        return getlastpage2;
                    }
                }
            }
        }
        int i = AnonymousClass3.length[nodeId.ordinal()];
        if (i == 1) {
            return getLastPage.values;
        }
        if (i != 2) {
            return getLastPage.FastBitmap$CoordinateSystem;
        }
        return getLastPage.toString;
    }

    /* renamed from: o.notifyClientEvent$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] length;

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
                length = r0
                org.yaml.snakeyaml.nodes.NodeId r1 = org.yaml.snakeyaml.nodes.NodeId.scalar     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x001d }
                org.yaml.snakeyaml.nodes.NodeId r1 = org.yaml.snakeyaml.nodes.NodeId.sequence     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.notifyClientEvent.AnonymousClass3.<clinit>():void");
        }
    }
}
