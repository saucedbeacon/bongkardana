package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.InitParams;
import org.yaml.snakeyaml.comments.CommentType;
import org.yaml.snakeyaml.composer.ComposerException;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.events.Event;
import org.yaml.snakeyaml.nodes.NodeId;

public final class getFeVer {
    private final setHwVer equals;
    private int getMax = 0;
    private final Set<getLanguage> getMin;
    private final getEvVer isInside;
    private final Map<String, getLanguage> length;
    private final notifyClientEvent setMax;
    protected final getLastSPMPage setMin;
    private final setHwVer toFloatRange;

    public getFeVer(getLastSPMPage getlastspmpage, notifyClientEvent notifyclientevent, getEvVer getevver) {
        this.setMin = getlastspmpage;
        this.setMax = notifyclientevent;
        this.length = new HashMap();
        this.getMin = new HashSet();
        this.isInside = getevver;
        this.toFloatRange = new setHwVer(getlastspmpage, CommentType.BLANK_LINE, CommentType.BLOCK);
        this.equals = new setHwVer(getlastspmpage, CommentType.IN_LINE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: o.getLayoutType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: o.getLayoutType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: o.getLanguage} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: o.getLayoutType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: o.getLayoutType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.getLanguage getMin() {
        /*
            r9 = this;
            o.getLastSPMPage r0 = r9.setMin
            r0.getMin()
        L_0x0005:
            o.getLastSPMPage r0 = r9.setMin
            org.yaml.snakeyaml.events.Event$ID r1 = org.yaml.snakeyaml.events.Event.ID.Comment
            boolean r0 = r0.getMin(r1)
            if (r0 == 0) goto L_0x0015
            o.getLastSPMPage r0 = r9.setMin
            r0.getMin()
            goto L_0x0005
        L_0x0015:
            o.getLastSPMPage r0 = r9.setMin
            org.yaml.snakeyaml.events.Event$ID r1 = org.yaml.snakeyaml.events.Event.ID.StreamEnd
            boolean r0 = r0.getMin(r1)
            r1 = 0
            if (r0 != 0) goto L_0x0088
            o.setHwVer r0 = r9.toFloatRange
            r0.setMax()
            o.getLastSPMPage r0 = r9.setMin
            org.yaml.snakeyaml.events.Event$ID r2 = org.yaml.snakeyaml.events.Event.ID.StreamEnd
            boolean r0 = r0.getMin(r2)
            if (r0 == 0) goto L_0x0050
            o.setHwVer r0 = r9.toFloatRange
            java.util.List r0 = r0.getMax()
            r2 = 0
            java.lang.Object r2 = r0.get(r2)
            o.setFeVer r2 = (o.setFeVer) r2
            o.InitParams$1 r7 = r2.setMax
            java.util.List r6 = java.util.Collections.emptyList()
            o.getLayoutType r2 = new o.getLayoutType
            o.getLastPage r4 = o.getLastPage.toDoubleRange
            r5 = 0
            org.yaml.snakeyaml.DumperOptions$FlowStyle r8 = org.yaml.snakeyaml.DumperOptions.FlowStyle.BLOCK
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            r2.toIntRange = r0
            goto L_0x0089
        L_0x0050:
            o.getLastSPMPage r0 = r9.setMin
            r0.getMin()
            o.setHwVer r0 = r9.toFloatRange
            o.setHwVer r0 = r0.setMax()
            java.util.List r0 = r0.getMax()
            o.getLanguage r2 = r9.getMax(r1, r0)
            o.setHwVer r0 = r9.toFloatRange
            r0.setMax()
            o.setHwVer r0 = r9.toFloatRange
            boolean r0 = r0.setMin()
            if (r0 != 0) goto L_0x0078
            o.setHwVer r0 = r9.toFloatRange
            java.util.List r0 = r0.getMax()
            r2.toDoubleRange = r0
        L_0x0078:
            o.getLastSPMPage r0 = r9.setMin
            r0.getMin()
            java.util.Map<java.lang.String, o.getLanguage> r0 = r9.length
            r0.clear()
            java.util.Set<o.getLanguage> r0 = r9.getMin
            r0.clear()
            goto L_0x0089
        L_0x0088:
            r2 = r1
        L_0x0089:
            o.getLastSPMPage r0 = r9.setMin
            org.yaml.snakeyaml.events.Event$ID r3 = org.yaml.snakeyaml.events.Event.ID.Comment
            boolean r0 = r0.getMin(r3)
            if (r0 == 0) goto L_0x0099
            o.getLastSPMPage r0 = r9.setMin
            r0.getMin()
            goto L_0x0089
        L_0x0099:
            o.getLastSPMPage r0 = r9.setMin
            org.yaml.snakeyaml.events.Event$ID r3 = org.yaml.snakeyaml.events.Event.ID.StreamEnd
            boolean r0 = r0.getMin(r3)
            if (r0 != 0) goto L_0x00b9
            o.getLastSPMPage r0 = r9.setMin
            org.yaml.snakeyaml.events.Event r0 = r0.getMin()
            if (r2 == 0) goto L_0x00ad
            o.InitParams$1 r1 = r2.length
        L_0x00ad:
            org.yaml.snakeyaml.composer.ComposerException r2 = new org.yaml.snakeyaml.composer.ComposerException
            o.InitParams$1 r0 = r0.length
            java.lang.String r3 = "expected a single document in the stream"
            java.lang.String r4 = "but found another document"
            r2.<init>(r3, r1, r4, r0)
            throw r2
        L_0x00b9:
            o.getLastSPMPage r0 = r9.setMin
            r0.getMin()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getFeVer.getMin():o.getLanguage");
    }

    private getLanguage getMax(getLanguage getlanguage, List<setFeVer> list) {
        getLanguage getlanguage2;
        if (getlanguage != null) {
            this.getMin.add(getlanguage);
        }
        if (this.setMin.getMin(Event.ID.Alias)) {
            isGreaterOrEqual isgreaterorequal = (isGreaterOrEqual) this.setMin.getMin();
            String str = isgreaterorequal.getMin;
            if (this.length.containsKey(str)) {
                getlanguage2 = this.length.get(str);
                if (!(getlanguage2 instanceof addPage)) {
                    int i = this.getMax + 1;
                    this.getMax = i;
                    if (i > this.isInside.setMin) {
                        StringBuilder sb = new StringBuilder("Number of aliases for non-scalar nodes exceeds the specified max=");
                        sb.append(this.isInside.setMin);
                        throw new YAMLException(sb.toString());
                    }
                }
                if (this.getMin.remove(getlanguage2)) {
                    getlanguage2.equals = true;
                }
                getlanguage2.toIntRange = list;
            } else {
                throw new ComposerException((String) null, (InitParams.AnonymousClass1) null, "found undefined alias ".concat(String.valueOf(str)), isgreaterorequal.length);
            }
        } else {
            String str2 = ((setConfigRequestTimeSpan) this.setMin.setMin()).getMin;
            if (this.setMin.getMin(Event.ID.Scalar)) {
                getlanguage2 = length(str2, list);
            } else if (this.setMin.getMin(Event.ID.SequenceStart)) {
                getlanguage2 = getMin(str2, list);
            } else {
                getlanguage2 = setMax(str2, list);
            }
        }
        this.getMin.remove(getlanguage);
        return getlanguage2;
    }

    private getLanguage length(String str, List<setFeVer> list) {
        boolean z;
        getLastPage getlastpage;
        appendLogEvent appendlogevent = (appendLogEvent) this.setMin.getMin();
        String str2 = appendlogevent.getMax;
        if (str2 == null || str2.equals("!")) {
            getlastpage = this.setMax.length(NodeId.scalar, appendlogevent.equals, appendlogevent.IsOverlapping.getMin());
            z = true;
        } else {
            getlastpage = new getLastPage(str2);
            z = false;
        }
        addPage addpage = new addPage(getlastpage, z, appendlogevent.equals, appendlogevent.length, appendlogevent.setMin, appendlogevent.setMax);
        if (str != null) {
            addpage.IsOverlapping = str;
            this.length.put(str, addpage);
        }
        addpage.toIntRange = list;
        addpage.isInside = this.equals.setMax().getMax();
        return addpage;
    }

    private getLanguage getMin(String str, List<setFeVer> list) {
        boolean z;
        getLastPage getlastpage;
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(120898188, oncanceled);
            onCancelLoad.getMin(120898188, oncanceled);
        }
        syncAppendLog syncappendlog = (syncAppendLog) this.setMin.getMin();
        String str2 = syncappendlog.getMax;
        if (str2 == null || str2.equals("!")) {
            getlastpage = this.setMax.length(NodeId.sequence, (String) null, syncappendlog.length());
            z = true;
        } else {
            getlastpage = new getLastPage(str2);
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        setLayoutType setlayouttype = new setLayoutType(getlastpage, z, arrayList, syncappendlog.length, syncappendlog.setMax);
        if (str != null) {
            setlayouttype.IsOverlapping = str;
            this.length.put(str, setlayouttype);
        }
        setlayouttype.toIntRange = list;
        setlayouttype.isInside = this.equals.setMax().getMax();
        while (!this.setMin.getMin(Event.ID.SequenceEnd)) {
            this.toFloatRange.setMax();
            if (this.setMin.getMin(Event.ID.SequenceEnd)) {
                break;
            }
            arrayList.add(getMax(setlayouttype, this.toFloatRange.getMax()));
        }
        setlayouttype.getMax(this.setMin.getMin().setMin);
        this.equals.setMax();
        if (!this.equals.setMin()) {
            setlayouttype.isInside = this.equals.getMax();
        }
        return setlayouttype;
    }

    private getLanguage setMax(String str, List<setFeVer> list) {
        boolean z;
        getLastPage getlastpage;
        getConfigRequestTimeSpan getconfigrequesttimespan = (getConfigRequestTimeSpan) this.setMin.getMin();
        String str2 = getconfigrequesttimespan.getMax;
        if (str2 == null || str2.equals("!")) {
            getlastpage = this.setMax.length(NodeId.mapping, (String) null, getconfigrequesttimespan.length());
            z = true;
        } else {
            getlastpage = new getLastPage(str2);
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        getLayoutType getlayouttype = new getLayoutType(getlastpage, z, arrayList, getconfigrequesttimespan.length, getconfigrequesttimespan.setMax);
        if (str != null) {
            getlayouttype.IsOverlapping = str;
            this.length.put(str, getlayouttype);
        }
        getlayouttype.toIntRange = list;
        getlayouttype.isInside = this.equals.setMax().getMax();
        while (!this.setMin.getMin(Event.ID.MappingEnd)) {
            this.toFloatRange.setMax();
            if (this.setMin.getMin(Event.ID.MappingEnd)) {
                break;
            }
            getLanguage max = getMax(getlayouttype, this.toFloatRange.getMax());
            if (max.setMax.equals(getLastPage.getMax)) {
                getlayouttype.setMin = true;
            }
            arrayList.add(new addSPMPage(max, getMax(getlayouttype, this.toFloatRange.setMax().getMax())));
        }
        getlayouttype.getMax(this.setMin.getMin().setMin);
        this.equals.setMax();
        if (!this.equals.setMin()) {
            getlayouttype.isInside = this.equals.getMax();
        }
        return getlayouttype;
    }
}
