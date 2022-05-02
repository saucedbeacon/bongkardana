package o;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.InitParams;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.events.Event;
import org.yaml.snakeyaml.parser.ParserException;
import org.yaml.snakeyaml.tokens.Token;

public final class getAutoLogActivities implements getLastSPMPage {
    /* access modifiers changed from: private */
    public static final Map<String, String> setMax;
    /* access modifiers changed from: private */
    public setFilter equals;
    protected final takeDownCrashReport getMax;
    private Event getMin;
    /* access modifiers changed from: private */
    public getUploader isInside;
    /* access modifiers changed from: private */
    public final AbtestInfoGetter<InitParams.AnonymousClass1> length;
    /* access modifiers changed from: private */
    public final AbtestInfoGetter<getUploader> setMin;

    static {
        HashMap hashMap = new HashMap();
        setMax = hashMap;
        hashMap.put("!", "!");
        setMax.put("!!", "tag:yaml.org,2002:");
    }

    public getAutoLogActivities(addAutoLogActivity addautologactivity) {
        this((takeDownCrashReport) new diagnoseLog(addautologactivity));
    }

    private getAutoLogActivities(takeDownCrashReport takedowncrashreport) {
        this.getMax = takedowncrashreport;
        this.getMin = null;
        this.equals = new setFilter((DumperOptions.Version) null, new HashMap(setMax));
        this.setMin = new AbtestInfoGetter<>(100);
        this.length = new AbtestInfoGetter<>(10);
        this.isInside = new b(this, (byte) 0);
    }

    public final Event setMin() {
        getUploader getuploader;
        if (this.getMin == null && (getuploader = this.isInside) != null) {
            this.getMin = getuploader.setMax();
        }
        return this.getMin;
    }

    class b implements getUploader {
        private b() {
        }

        /* synthetic */ b(getAutoLogActivities getautologactivities, byte b) {
            this();
        }

        public final Event setMax() {
            getProcessTag getprocesstag = (getProcessTag) getAutoLogActivities.this.getMax.getMin();
            getSessionID getsessionid = new getSessionID(getprocesstag.getMin, getprocesstag.toFloatRange);
            getAutoLogActivities getautologactivities = getAutoLogActivities.this;
            getUploader unused = getautologactivities.isInside = new create(getautologactivities, (byte) 0);
            return getsessionid;
        }
    }

    class create implements getUploader {
        private create() {
        }

        /* synthetic */ create(getAutoLogActivities getautologactivities, byte b) {
            this();
        }

        public final Event setMax() {
            if (getAutoLogActivities.this.getMax.getMax(Token.ID.Comment)) {
                return getAutoLogActivities.getMin((apm) getAutoLogActivities.this.getMax.getMin());
            }
            if (getAutoLogActivities.this.getMax.getMax(Token.ID.Directive, Token.ID.DocumentStart, Token.ID.StreamEnd)) {
                return new IsOverlapping(getAutoLogActivities.this, (byte) 0).setMax();
            }
            setFilter unused = getAutoLogActivities.this.equals = new setFilter((DumperOptions.Version) null, getAutoLogActivities.setMax);
            InitParams.AnonymousClass1 r7 = getAutoLogActivities.this.getMax.length().getMin;
            uploadAll uploadall = new uploadAll(r7, r7, false, (DumperOptions.Version) null, (Map<String, String>) null);
            AbtestInfoGetter length2 = getAutoLogActivities.this.setMin;
            length2.setMax.add(new equals(getAutoLogActivities.this, (byte) 0));
            getAutoLogActivities getautologactivities = getAutoLogActivities.this;
            getUploader unused2 = getautologactivities.isInside = new setMin(getautologactivities, (byte) 0);
            return uploadall;
        }
    }

    class IsOverlapping implements getUploader {
        private IsOverlapping() {
        }

        /* synthetic */ IsOverlapping(getAutoLogActivities getautologactivities, byte b) {
            this();
        }

        public final Event setMax() {
            if (getAutoLogActivities.this.getMax.getMax(Token.ID.Comment)) {
                return getAutoLogActivities.getMin((apm) getAutoLogActivities.this.getMax.getMin());
            }
            while (true) {
                if (!getAutoLogActivities.this.getMax.getMax(Token.ID.DocumentEnd)) {
                    break;
                }
                getAutoLogActivities.this.getMax.getMin();
            }
            if (getAutoLogActivities.this.getMax.getMax(Token.ID.Comment)) {
                return getAutoLogActivities.getMin((apm) getAutoLogActivities.this.getMax.getMin());
            }
            if (!getAutoLogActivities.this.getMax.getMax(Token.ID.StreamEnd)) {
                InitParams.AnonymousClass1 r6 = getAutoLogActivities.this.getMax.length().getMin;
                setFilter min = getAutoLogActivities.getMin(getAutoLogActivities.this);
                while (true) {
                    if (!getAutoLogActivities.this.getMax.getMax(Token.ID.Comment)) {
                        break;
                    }
                    getAutoLogActivities.this.getMax.getMin();
                }
                if (!getAutoLogActivities.this.getMax.getMax(Token.ID.StreamEnd)) {
                    if (getAutoLogActivities.this.getMax.getMax(Token.ID.DocumentStart)) {
                        uploadAll uploadall = new uploadAll(r6, getAutoLogActivities.this.getMax.getMin().toFloatRange, true, min.setMax, min.getMax);
                        AbtestInfoGetter length2 = getAutoLogActivities.this.setMin;
                        length2.setMax.add(new equals(getAutoLogActivities.this, (byte) 0));
                        getAutoLogActivities getautologactivities = getAutoLogActivities.this;
                        getUploader unused = getautologactivities.isInside = new toIntRange(getautologactivities, (byte) 0);
                        return uploadall;
                    }
                    StringBuilder sb = new StringBuilder("expected '<document start>', but found '");
                    sb.append(getAutoLogActivities.this.getMax.length().getMin());
                    sb.append("'");
                    throw new ParserException((String) null, (InitParams.AnonymousClass1) null, sb.toString(), getAutoLogActivities.this.getMax.length().getMin);
                }
            }
            getMainProcessName getmainprocessname = (getMainProcessName) getAutoLogActivities.this.getMax.getMin();
            appendLog appendlog = new appendLog(getmainprocessname.getMin, getmainprocessname.toFloatRange);
            if (!getAutoLogActivities.this.setMin.length()) {
                StringBuilder sb2 = new StringBuilder("Unexpected end of stream. States left: ");
                sb2.append(getAutoLogActivities.this.setMin);
                throw new YAMLException(sb2.toString());
            } else if (getAutoLogActivities.this.length.length()) {
                getUploader unused2 = getAutoLogActivities.this.isInside = null;
                return appendlog;
            } else {
                StringBuilder sb3 = new StringBuilder("Unexpected end of stream. Marks left: ");
                sb3.append(getAutoLogActivities.this.length);
                throw new YAMLException(sb3.toString());
            }
        }
    }

    class equals implements getUploader {
        private equals() {
        }

        /* synthetic */ equals(getAutoLogActivities getautologactivities, byte b) {
            this();
        }

        public final Event setMax() {
            InitParams.AnonymousClass1 r1;
            InitParams.AnonymousClass1 r0 = getAutoLogActivities.this.getMax.length().getMin;
            boolean z = true;
            if (getAutoLogActivities.this.getMax.getMax(Token.ID.DocumentEnd)) {
                r1 = getAutoLogActivities.this.getMax.getMin().toFloatRange;
            } else {
                r1 = r0;
                z = false;
            }
            getLogCustomizeControl getlogcustomizecontrol = new getLogCustomizeControl(r0, r1, z);
            getAutoLogActivities getautologactivities = getAutoLogActivities.this;
            getUploader unused = getautologactivities.isInside = new IsOverlapping(getautologactivities, (byte) 0);
            return getlogcustomizecontrol;
        }
    }

    class toIntRange implements getUploader {
        private toIntRange() {
        }

        /* synthetic */ toIntRange(getAutoLogActivities getautologactivities, byte b) {
            this();
        }

        public final Event setMax() {
            if (getAutoLogActivities.this.getMax.getMax(Token.ID.Comment)) {
                return getAutoLogActivities.getMin((apm) getAutoLogActivities.this.getMax.getMin());
            }
            if (!getAutoLogActivities.this.getMax.getMax(Token.ID.Directive, Token.ID.DocumentStart, Token.ID.DocumentEnd, Token.ID.StreamEnd)) {
                return new setMin(getAutoLogActivities.this, (byte) 0).setMax();
            }
            Event min = getAutoLogActivities.setMin(getAutoLogActivities.this.getMax.length().getMin);
            getAutoLogActivities getautologactivities = getAutoLogActivities.this;
            AbtestInfoGetter length2 = getautologactivities.setMin;
            getUploader unused = getautologactivities.isInside = (getUploader) length2.setMax.remove(length2.setMax.size() - 1);
            return min;
        }
    }

    class setMin implements getUploader {
        private setMin() {
        }

        /* synthetic */ setMin(getAutoLogActivities getautologactivities, byte b) {
            this();
        }

        public final Event setMax() {
            return getAutoLogActivities.this.getMax(true, false);
        }
    }

    /* access modifiers changed from: private */
    public Event getMax(boolean z, boolean z2) {
        String str;
        InitParams.AnonymousClass1 r8;
        InitParams.AnonymousClass1 r7;
        getExtInfoForSpmID getextinfoforspmid;
        InitParams.AnonymousClass1 r4;
        InitParams.AnonymousClass1 r15;
        InitParams.AnonymousClass1 r14;
        LogContext logContext;
        if (this.getMax.getMax(Token.ID.Alias)) {
            LogEventType logEventType = (LogEventType) this.getMax.getMin();
            isGreaterOrEqual isgreaterorequal = new isGreaterOrEqual(logEventType.length, logEventType.getMin, logEventType.toFloatRange);
            AbtestInfoGetter<getUploader> abtestInfoGetter = this.setMin;
            this.isInside = (getUploader) abtestInfoGetter.setMax.remove(abtestInfoGetter.setMax.size() - 1);
            return isgreaterorequal;
        }
        String str2 = null;
        if (this.getMax.getMax(Token.ID.Anchor)) {
            isZipAndSevenZip iszipandsevenzip = (isZipAndSevenZip) this.getMax.getMin();
            r4 = iszipandsevenzip.getMin;
            InitParams.AnonymousClass1 r6 = iszipandsevenzip.toFloatRange;
            String str3 = iszipandsevenzip.length;
            if (this.getMax.getMax(Token.ID.Tag)) {
                getLogForSpmID getlogforspmid = (getLogForSpmID) this.getMax.getMin();
                r7 = getlogforspmid.getMin;
                r8 = getlogforspmid.toFloatRange;
                getextinfoforspmid = getlogforspmid.length;
            } else {
                r7 = null;
                r8 = r6;
                getextinfoforspmid = null;
            }
            str = str3;
        } else {
            if (this.getMax.getMax(Token.ID.Tag)) {
                getLogForSpmID getlogforspmid2 = (getLogForSpmID) this.getMax.getMin();
                r4 = getlogforspmid2.getMin;
                InitParams.AnonymousClass1 r82 = getlogforspmid2.toFloatRange;
                getextinfoforspmid = getlogforspmid2.length;
                if (this.getMax.getMax(Token.ID.Anchor)) {
                    isZipAndSevenZip iszipandsevenzip2 = (isZipAndSevenZip) this.getMax.getMin();
                    r82 = iszipandsevenzip2.toFloatRange;
                    str = iszipandsevenzip2.length;
                } else {
                    str = null;
                }
                r7 = r4;
            } else {
                r4 = null;
                getextinfoforspmid = null;
                r7 = null;
                r8 = null;
                str = null;
            }
        }
        if (getextinfoforspmid != null) {
            String str4 = getextinfoforspmid.setMax;
            str2 = getextinfoforspmid.getMax;
            if (str4 != null) {
                if (this.equals.getMax.containsKey(str4)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.equals.getMax.get(str4));
                    sb.append(str2);
                    str2 = sb.toString();
                } else {
                    throw new ParserException("while parsing a node", r4, "found undefined tag handle ".concat(String.valueOf(str4)), r7);
                }
            }
        }
        String str5 = str2;
        if (r4 == null) {
            r14 = this.getMax.length().getMin;
            r15 = r14;
        } else {
            r14 = r4;
            r15 = r8;
        }
        boolean z3 = str5 == null || str5.equals("!");
        if (z2) {
            if (this.getMax.getMax(Token.ID.BlockEntry)) {
                syncAppendLog syncappendlog = new syncAppendLog(str, str5, z3, r14, this.getMax.length().toFloatRange, DumperOptions.FlowStyle.BLOCK);
                this.isInside = new ICustomTabsCallback(this, (byte) 0);
                return syncappendlog;
            }
        }
        if (this.getMax.getMax(Token.ID.Scalar)) {
            getProcessAlias getprocessalias = (getProcessAlias) this.getMax.getMin();
            InitParams.AnonymousClass1 r152 = getprocessalias.toFloatRange;
            if ((getprocessalias.length() && str5 == null) || "!".equals(str5)) {
                logContext = new LogContext(true, false);
            } else if (str5 == null) {
                logContext = new LogContext(false, true);
            } else {
                logContext = new LogContext(false, false);
            }
            appendLogEvent appendlogevent = new appendLogEvent(str, str5, logContext, getprocessalias.getMax, r14, r152, getprocessalias.setMax);
            AbtestInfoGetter<getUploader> abtestInfoGetter2 = this.setMin;
            this.isInside = (getUploader) abtestInfoGetter2.setMax.remove(abtestInfoGetter2.setMax.size() - 1);
            return appendlogevent;
        }
        if (this.getMax.getMax(Token.ID.Comment)) {
            apm apm = (apm) this.getMax.getMin();
            return new setLogCustomizeControl(apm.setMax, apm.getMax, apm.getMin, apm.toFloatRange);
        }
        if (this.getMax.getMax(Token.ID.FlowSequenceStart)) {
            syncAppendLog syncappendlog2 = new syncAppendLog(str, str5, z3, r14, this.getMax.length().toFloatRange, DumperOptions.FlowStyle.FLOW);
            this.isInside = new valueOf(this, (byte) 0);
            return syncappendlog2;
        }
        if (this.getMax.getMax(Token.ID.FlowMappingStart)) {
            getConfigRequestTimeSpan getconfigrequesttimespan = new getConfigRequestTimeSpan(str, str5, z3, r14, this.getMax.length().toFloatRange, DumperOptions.FlowStyle.FLOW);
            this.isInside = new getAutoLogActivities$FastBitmap$CoordinateSystem(this, (byte) 0);
            return getconfigrequesttimespan;
        }
        if (z) {
            if (this.getMax.getMax(Token.ID.BlockSequenceStart)) {
                syncAppendLog syncappendlog3 = new syncAppendLog(str, str5, z3, r14, this.getMax.length().getMin, DumperOptions.FlowStyle.BLOCK);
                this.isInside = new isInside(this, (byte) 0);
                return syncappendlog3;
            }
        }
        if (z) {
            if (this.getMax.getMax(Token.ID.BlockMappingStart)) {
                getConfigRequestTimeSpan getconfigrequesttimespan2 = new getConfigRequestTimeSpan(str, str5, z3, r14, this.getMax.length().getMin, DumperOptions.FlowStyle.BLOCK);
                this.isInside = new length(this, (byte) 0);
                return getconfigrequesttimespan2;
            }
        }
        if (str == null && str5 == null) {
            String str6 = z ? "block" : "flow";
            Token length2 = this.getMax.length();
            StringBuilder sb2 = new StringBuilder("while parsing a ");
            sb2.append(str6);
            sb2.append(" node");
            String obj = sb2.toString();
            StringBuilder sb3 = new StringBuilder("expected the node content, but found '");
            sb3.append(length2.getMin());
            sb3.append("'");
            throw new ParserException(obj, r14, sb3.toString(), length2.getMin);
        }
        appendLogEvent appendlogevent2 = new appendLogEvent(str, str5, new LogContext(z3, false), "", r14, r15, DumperOptions.ScalarStyle.PLAIN);
        AbtestInfoGetter<getUploader> abtestInfoGetter3 = this.setMin;
        this.isInside = (getUploader) abtestInfoGetter3.setMax.remove(abtestInfoGetter3.setMax.size() - 1);
        return appendlogevent2;
    }

    class isInside implements getUploader {
        private isInside() {
        }

        /* synthetic */ isInside(getAutoLogActivities getautologactivities, byte b) {
            this();
        }

        public final Event setMax() {
            Token min = getAutoLogActivities.this.getMax.getMin();
            AbtestInfoGetter min2 = getAutoLogActivities.this.length;
            min2.setMax.add(min.getMin);
            return new toFloatRange(getAutoLogActivities.this, (byte) 0).setMax();
        }
    }

    class toFloatRange implements getUploader {
        private toFloatRange() {
        }

        /* synthetic */ toFloatRange(getAutoLogActivities getautologactivities, byte b) {
            this();
        }

        public final Event setMax() {
            if (getAutoLogActivities.this.getMax.getMax(Token.ID.Comment)) {
                return getAutoLogActivities.getMin((apm) getAutoLogActivities.this.getMax.getMin());
            }
            if (getAutoLogActivities.this.getMax.getMax(Token.ID.BlockEntry)) {
                LogEncryptClient logEncryptClient = (LogEncryptClient) getAutoLogActivities.this.getMax.getMin();
                if (!getAutoLogActivities.this.getMax.getMax(Token.ID.BlockEntry, Token.ID.BlockEnd)) {
                    AbtestInfoGetter length = getAutoLogActivities.this.setMin;
                    length.setMax.add(new toFloatRange());
                    return new setMin(getAutoLogActivities.this, (byte) 0).setMax();
                }
                getAutoLogActivities getautologactivities = getAutoLogActivities.this;
                getUploader unused = getautologactivities.isInside = new toFloatRange();
                return getAutoLogActivities.setMin(logEncryptClient.toFloatRange);
            }
            if (getAutoLogActivities.this.getMax.getMax(Token.ID.BlockEnd)) {
                Token min = getAutoLogActivities.this.getMax.getMin();
                setProductID setproductid = new setProductID(min.getMin, min.toFloatRange);
                getAutoLogActivities getautologactivities2 = getAutoLogActivities.this;
                AbtestInfoGetter length2 = getautologactivities2.setMin;
                getUploader unused2 = getautologactivities2.isInside = (getUploader) length2.setMax.remove(length2.setMax.size() - 1);
                AbtestInfoGetter min2 = getAutoLogActivities.this.length;
                min2.setMax.remove(min2.setMax.size() - 1);
                return setproductid;
            }
            Token length3 = getAutoLogActivities.this.getMax.length();
            AbtestInfoGetter min3 = getAutoLogActivities.this.length;
            StringBuilder sb = new StringBuilder("expected <block end>, but found '");
            sb.append(length3.getMin());
            sb.append("'");
            throw new ParserException("while parsing a block collection", (InitParams.AnonymousClass1) min3.setMax.remove(min3.setMax.size() - 1), sb.toString(), length3.getMin);
        }
    }

    class ICustomTabsCallback implements getUploader {
        private ICustomTabsCallback() {
        }

        /* synthetic */ ICustomTabsCallback(getAutoLogActivities getautologactivities, byte b) {
            this();
        }

        public final Event setMax() {
            if (getAutoLogActivities.this.getMax.getMax(Token.ID.Comment)) {
                return getAutoLogActivities.getMin((apm) getAutoLogActivities.this.getMax.getMin());
            }
            if (getAutoLogActivities.this.getMax.getMax(Token.ID.BlockEntry)) {
                Token min = getAutoLogActivities.this.getMax.getMin();
                if (!getAutoLogActivities.this.getMax.getMax(Token.ID.BlockEntry, Token.ID.Key, Token.ID.Value, Token.ID.BlockEnd)) {
                    AbtestInfoGetter length = getAutoLogActivities.this.setMin;
                    length.setMax.add(new ICustomTabsCallback());
                    return new setMin(getAutoLogActivities.this, (byte) 0).setMax();
                }
                getAutoLogActivities getautologactivities = getAutoLogActivities.this;
                getUploader unused = getautologactivities.isInside = new ICustomTabsCallback();
                return getAutoLogActivities.setMin(min.toFloatRange);
            }
            Token length2 = getAutoLogActivities.this.getMax.length();
            setProductID setproductid = new setProductID(length2.getMin, length2.toFloatRange);
            getAutoLogActivities getautologactivities2 = getAutoLogActivities.this;
            AbtestInfoGetter length3 = getautologactivities2.setMin;
            getUploader unused2 = getautologactivities2.isInside = (getUploader) length3.setMax.remove(length3.setMax.size() - 1);
            return setproductid;
        }
    }

    class length implements getUploader {
        private length() {
        }

        /* synthetic */ length(getAutoLogActivities getautologactivities, byte b) {
            this();
        }

        public final Event setMax() {
            Token min = getAutoLogActivities.this.getMax.getMin();
            AbtestInfoGetter min2 = getAutoLogActivities.this.length;
            min2.setMax.add(min.getMin);
            return new getMin(getAutoLogActivities.this, (byte) 0).setMax();
        }
    }

    class getMin implements getUploader {
        private getMin() {
        }

        /* synthetic */ getMin(getAutoLogActivities getautologactivities, byte b) {
            this();
        }

        public final Event setMax() {
            if (getAutoLogActivities.this.getMax.getMax(Token.ID.Comment)) {
                return getAutoLogActivities.getMin((apm) getAutoLogActivities.this.getMax.getMin());
            }
            if (getAutoLogActivities.this.getMax.getMax(Token.ID.Key)) {
                Token min = getAutoLogActivities.this.getMax.getMin();
                if (!getAutoLogActivities.this.getMax.getMax(Token.ID.Key, Token.ID.Value, Token.ID.BlockEnd)) {
                    AbtestInfoGetter length = getAutoLogActivities.this.setMin;
                    length.setMax.add(new setMax(getAutoLogActivities.this, (byte) 0));
                    return getAutoLogActivities.this.getMax(true, true);
                }
                getAutoLogActivities getautologactivities = getAutoLogActivities.this;
                getUploader unused = getautologactivities.isInside = new setMax(getautologactivities, (byte) 0);
                return getAutoLogActivities.setMin(min.toFloatRange);
            }
            if (getAutoLogActivities.this.getMax.getMax(Token.ID.BlockEnd)) {
                Token min2 = getAutoLogActivities.this.getMax.getMin();
                setMaxLogSize setmaxlogsize = new setMaxLogSize(min2.getMin, min2.toFloatRange);
                getAutoLogActivities getautologactivities2 = getAutoLogActivities.this;
                AbtestInfoGetter length2 = getautologactivities2.setMin;
                getUploader unused2 = getautologactivities2.isInside = (getUploader) length2.setMax.remove(length2.setMax.size() - 1);
                AbtestInfoGetter min3 = getAutoLogActivities.this.length;
                min3.setMax.remove(min3.setMax.size() - 1);
                return setmaxlogsize;
            }
            Token length3 = getAutoLogActivities.this.getMax.length();
            AbtestInfoGetter min4 = getAutoLogActivities.this.length;
            StringBuilder sb = new StringBuilder("expected <block end>, but found '");
            sb.append(length3.getMin());
            sb.append("'");
            throw new ParserException("while parsing a block mapping", (InitParams.AnonymousClass1) min4.setMax.remove(min4.setMax.size() - 1), sb.toString(), length3.getMin);
        }
    }

    class setMax implements getUploader {
        private setMax() {
        }

        /* synthetic */ setMax(getAutoLogActivities getautologactivities, byte b) {
            this();
        }

        public final Event setMax() {
            if (getAutoLogActivities.this.getMax.getMax(Token.ID.Value)) {
                Token min = getAutoLogActivities.this.getMax.getMin();
                if (getAutoLogActivities.this.getMax.getMax(Token.ID.Comment)) {
                    getAutoLogActivities getautologactivities = getAutoLogActivities.this;
                    getUploader unused = getautologactivities.isInside = new getMax(getautologactivities, (byte) 0);
                    return getAutoLogActivities.this.isInside.setMax();
                }
                if (!getAutoLogActivities.this.getMax.getMax(Token.ID.Key, Token.ID.Value, Token.ID.BlockEnd)) {
                    AbtestInfoGetter length = getAutoLogActivities.this.setMin;
                    length.setMax.add(new getMin(getAutoLogActivities.this, (byte) 0));
                    return getAutoLogActivities.this.getMax(true, true);
                }
                getAutoLogActivities getautologactivities2 = getAutoLogActivities.this;
                getUploader unused2 = getautologactivities2.isInside = new getMin(getautologactivities2, (byte) 0);
                return getAutoLogActivities.setMin(min.toFloatRange);
            }
            if (getAutoLogActivities.this.getMax.getMax(Token.ID.Scalar)) {
                AbtestInfoGetter length2 = getAutoLogActivities.this.setMin;
                length2.setMax.add(new getMin(getAutoLogActivities.this, (byte) 0));
                return getAutoLogActivities.this.getMax(true, true);
            }
            getAutoLogActivities getautologactivities3 = getAutoLogActivities.this;
            getUploader unused3 = getautologactivities3.isInside = new getMin(getautologactivities3, (byte) 0);
            return getAutoLogActivities.setMin(getAutoLogActivities.this.getMax.length().getMin);
        }
    }

    class getMax implements getUploader {
        private getMax() {
        }

        /* synthetic */ getMax(getAutoLogActivities getautologactivities, byte b) {
            this();
        }

        public final Event setMax() {
            if (getAutoLogActivities.this.getMax.getMax(Token.ID.Comment)) {
                return getAutoLogActivities.this.getMax(true, true);
            }
            if (!getAutoLogActivities.this.getMax.getMax(Token.ID.Key, Token.ID.Value, Token.ID.BlockEnd)) {
                AbtestInfoGetter length = getAutoLogActivities.this.setMin;
                length.setMax.add(new getMin(getAutoLogActivities.this, (byte) 0));
                return getAutoLogActivities.this.getMax(true, true);
            }
            getAutoLogActivities getautologactivities = getAutoLogActivities.this;
            getUploader unused = getautologactivities.isInside = new getMin(getautologactivities, (byte) 0);
            return getAutoLogActivities.setMin(getAutoLogActivities.this.getMax.getMin().toFloatRange);
        }
    }

    class valueOf implements getUploader {
        private valueOf() {
        }

        /* synthetic */ valueOf(getAutoLogActivities getautologactivities, byte b) {
            this();
        }

        public final Event setMax() {
            Token min = getAutoLogActivities.this.getMax.getMin();
            AbtestInfoGetter min2 = getAutoLogActivities.this.length;
            min2.setMax.add(min.getMin);
            return new invoke(true).setMax();
        }
    }

    class invoke implements getUploader {
        private boolean length = false;

        public invoke(boolean z) {
            this.length = z;
        }

        public final Event setMax() {
            if (!getAutoLogActivities.this.getMax.getMax(Token.ID.FlowSequenceEnd)) {
                if (!this.length) {
                    if (getAutoLogActivities.this.getMax.getMax(Token.ID.FlowEntry)) {
                        getAutoLogActivities.this.getMax.getMin();
                    } else {
                        Token length2 = getAutoLogActivities.this.getMax.length();
                        AbtestInfoGetter min = getAutoLogActivities.this.length;
                        StringBuilder sb = new StringBuilder("expected ',' or ']', but got ");
                        sb.append(length2.getMin());
                        throw new ParserException("while parsing a flow sequence", (InitParams.AnonymousClass1) min.setMax.remove(min.setMax.size() - 1), sb.toString(), length2.getMin);
                    }
                }
                if (getAutoLogActivities.this.getMax.getMax(Token.ID.Key)) {
                    Token length3 = getAutoLogActivities.this.getMax.length();
                    getConfigRequestTimeSpan getconfigrequesttimespan = new getConfigRequestTimeSpan((String) null, (String) null, true, length3.getMin, length3.toFloatRange, DumperOptions.FlowStyle.FLOW);
                    getAutoLogActivities getautologactivities = getAutoLogActivities.this;
                    getUploader unused = getautologactivities.isInside = new getAutoLogActivities$Mean$Arithmetic(getautologactivities, (byte) 0);
                    return getconfigrequesttimespan;
                }
                if (!getAutoLogActivities.this.getMax.getMax(Token.ID.FlowSequenceEnd)) {
                    AbtestInfoGetter length4 = getAutoLogActivities.this.setMin;
                    length4.setMax.add(new invoke(false));
                    return getAutoLogActivities.this.getMax(false, false);
                }
            }
            Token min2 = getAutoLogActivities.this.getMax.getMin();
            setProductID setproductid = new setProductID(min2.getMin, min2.toFloatRange);
            AbtestInfoGetter min3 = getAutoLogActivities.this.length;
            min3.setMax.remove(min3.setMax.size() - 1);
            if (!getAutoLogActivities.this.getMax.getMax(Token.ID.Comment)) {
                getAutoLogActivities getautologactivities2 = getAutoLogActivities.this;
                AbtestInfoGetter length5 = getautologactivities2.setMin;
                getUploader unused2 = getautologactivities2.isInside = (getUploader) length5.setMax.remove(length5.setMax.size() - 1);
            } else {
                getAutoLogActivities getautologactivities3 = getAutoLogActivities.this;
                getUploader unused3 = getautologactivities3.isInside = new values(getautologactivities3, (byte) 0);
            }
            return setproductid;
        }
    }

    class values implements getUploader {
        private values() {
        }

        /* synthetic */ values(getAutoLogActivities getautologactivities, byte b) {
            this();
        }

        public final Event setMax() {
            setLogCustomizeControl min = getAutoLogActivities.getMin((apm) getAutoLogActivities.this.getMax.getMin());
            if (!getAutoLogActivities.this.getMax.getMax(Token.ID.Comment)) {
                getAutoLogActivities getautologactivities = getAutoLogActivities.this;
                AbtestInfoGetter length = getautologactivities.setMin;
                getUploader unused = getautologactivities.isInside = (getUploader) length.setMax.remove(length.setMax.size() - 1);
            }
            return min;
        }
    }

    class invokeSuspend implements getUploader {
        private invokeSuspend() {
        }

        /* synthetic */ invokeSuspend(getAutoLogActivities getautologactivities, byte b) {
            this();
        }

        public final Event setMax() {
            getAutoLogActivities getautologactivities = getAutoLogActivities.this;
            getUploader unused = getautologactivities.isInside = new invoke(false);
            Token length = getAutoLogActivities.this.getMax.length();
            return new setMaxLogSize(length.getMin, length.toFloatRange);
        }
    }

    class hashCode implements getUploader {
        private boolean setMin = false;

        public hashCode(boolean z) {
            this.setMin = z;
        }

        public final Event setMax() {
            if (!getAutoLogActivities.this.getMax.getMax(Token.ID.FlowMappingEnd)) {
                if (!this.setMin) {
                    if (getAutoLogActivities.this.getMax.getMax(Token.ID.FlowEntry)) {
                        getAutoLogActivities.this.getMax.getMin();
                    } else {
                        Token length = getAutoLogActivities.this.getMax.length();
                        AbtestInfoGetter min = getAutoLogActivities.this.length;
                        StringBuilder sb = new StringBuilder("expected ',' or '}', but got ");
                        sb.append(length.getMin());
                        throw new ParserException("while parsing a flow mapping", (InitParams.AnonymousClass1) min.setMax.remove(min.setMax.size() - 1), sb.toString(), length.getMin);
                    }
                }
                if (getAutoLogActivities.this.getMax.getMax(Token.ID.Key)) {
                    Token min2 = getAutoLogActivities.this.getMax.getMin();
                    if (!getAutoLogActivities.this.getMax.getMax(Token.ID.Value, Token.ID.FlowEntry, Token.ID.FlowMappingEnd)) {
                        AbtestInfoGetter length2 = getAutoLogActivities.this.setMin;
                        length2.setMax.add(new toString(getAutoLogActivities.this, (byte) 0));
                        return getAutoLogActivities.this.getMax(false, false);
                    }
                    getAutoLogActivities getautologactivities = getAutoLogActivities.this;
                    getUploader unused = getautologactivities.isInside = new toString(getautologactivities, (byte) 0);
                    return getAutoLogActivities.setMin(min2.toFloatRange);
                }
                if (!getAutoLogActivities.this.getMax.getMax(Token.ID.FlowMappingEnd)) {
                    AbtestInfoGetter length3 = getAutoLogActivities.this.setMin;
                    length3.setMax.add(new toDoubleRange(getAutoLogActivities.this, (byte) 0));
                    return getAutoLogActivities.this.getMax(false, false);
                }
            }
            Token min3 = getAutoLogActivities.this.getMax.getMin();
            setMaxLogSize setmaxlogsize = new setMaxLogSize(min3.getMin, min3.toFloatRange);
            AbtestInfoGetter min4 = getAutoLogActivities.this.length;
            min4.setMax.remove(min4.setMax.size() - 1);
            if (!getAutoLogActivities.this.getMax.getMax(Token.ID.Comment)) {
                getAutoLogActivities getautologactivities2 = getAutoLogActivities.this;
                AbtestInfoGetter length4 = getautologactivities2.setMin;
                getUploader unused2 = getautologactivities2.isInside = (getUploader) length4.setMax.remove(length4.setMax.size() - 1);
            } else {
                getAutoLogActivities getautologactivities3 = getAutoLogActivities.this;
                getUploader unused3 = getautologactivities3.isInside = new values(getautologactivities3, (byte) 0);
            }
            return setmaxlogsize;
        }
    }

    class toString implements getUploader {
        private toString() {
        }

        /* synthetic */ toString(getAutoLogActivities getautologactivities, byte b) {
            this();
        }

        public final Event setMax() {
            if (getAutoLogActivities.this.getMax.getMax(Token.ID.Value)) {
                Token min = getAutoLogActivities.this.getMax.getMin();
                if (!getAutoLogActivities.this.getMax.getMax(Token.ID.FlowEntry, Token.ID.FlowMappingEnd)) {
                    AbtestInfoGetter length = getAutoLogActivities.this.setMin;
                    length.setMax.add(new hashCode(false));
                    return getAutoLogActivities.this.getMax(false, false);
                }
                getAutoLogActivities getautologactivities = getAutoLogActivities.this;
                getUploader unused = getautologactivities.isInside = new hashCode(false);
                return getAutoLogActivities.setMin(min.toFloatRange);
            }
            getAutoLogActivities getautologactivities2 = getAutoLogActivities.this;
            getUploader unused2 = getautologactivities2.isInside = new hashCode(false);
            return getAutoLogActivities.setMin(getAutoLogActivities.this.getMax.length().getMin);
        }
    }

    class toDoubleRange implements getUploader {
        private toDoubleRange() {
        }

        /* synthetic */ toDoubleRange(getAutoLogActivities getautologactivities, byte b) {
            this();
        }

        public final Event setMax() {
            getAutoLogActivities getautologactivities = getAutoLogActivities.this;
            getUploader unused = getautologactivities.isInside = new hashCode(false);
            return getAutoLogActivities.setMin(getAutoLogActivities.this.getMax.length().getMin);
        }
    }

    public final boolean getMin(Event.ID id2) {
        getUploader getuploader;
        if (this.getMin == null && (getuploader = this.isInside) != null) {
            this.getMin = getuploader.setMax();
        }
        Event event = this.getMin;
        return event != null && event.length(id2);
    }

    public final Event getMin() {
        getUploader getuploader;
        if (this.getMin == null && (getuploader = this.isInside) != null) {
            this.getMin = getuploader.setMax();
        }
        Event event = this.getMin;
        this.getMin = null;
        return event;
    }

    static /* synthetic */ setLogCustomizeControl getMin(apm apm) {
        InitParams.AnonymousClass1 r0 = apm.getMin;
        InitParams.AnonymousClass1 r1 = apm.toFloatRange;
        return new setLogCustomizeControl(apm.setMax, apm.getMax, r0, r1);
    }

    static /* synthetic */ setFilter getMin(getAutoLogActivities getautologactivities) {
        HashMap hashMap = new HashMap();
        DumperOptions.Version version = null;
        while (true) {
            if (getautologactivities.getMax.getMax(Token.ID.Directive)) {
                LogLevel logLevel = (LogLevel) getautologactivities.getMax.getMin();
                if (logLevel.getMax.equals("YAML")) {
                    if (version == null) {
                        List<T> list = logLevel.setMin;
                        if (((Integer) list.get(0)).intValue() != 1) {
                            throw new ParserException((String) null, (InitParams.AnonymousClass1) null, "found incompatible YAML document (version 1.* is required)", logLevel.getMin);
                        } else if (((Integer) list.get(1)).intValue() != 0) {
                            version = DumperOptions.Version.V1_1;
                        } else {
                            version = DumperOptions.Version.V1_0;
                        }
                    } else {
                        throw new ParserException((String) null, (InitParams.AnonymousClass1) null, "found duplicate YAML directive", logLevel.getMin);
                    }
                } else if (logLevel.getMax.equals("TAG")) {
                    List<T> list2 = logLevel.setMin;
                    String str = (String) list2.get(0);
                    String str2 = (String) list2.get(1);
                    if (!hashMap.containsKey(str)) {
                        hashMap.put(str, str2);
                    } else {
                        throw new ParserException((String) null, (InitParams.AnonymousClass1) null, "duplicate tag handle ".concat(String.valueOf(str)), logLevel.getMin);
                    }
                } else {
                    continue;
                }
            } else {
                if (version != null || !hashMap.isEmpty()) {
                    for (String next : setMax.keySet()) {
                        if (!hashMap.containsKey(next)) {
                            hashMap.put(next, setMax.get(next));
                        }
                    }
                    getautologactivities.equals = new setFilter(version, hashMap);
                }
                return getautologactivities.equals;
            }
        }
    }

    static /* synthetic */ Event setMin(InitParams.AnonymousClass1 r9) {
        return new appendLogEvent((String) null, (String) null, new LogContext(true, false), "", r9, r9, DumperOptions.ScalarStyle.PLAIN);
    }
}
