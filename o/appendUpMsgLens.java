package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class appendUpMsgLens implements Serializable {
    private static final long serialVersionUID = 1;
    private Map longOpts = new HashMap();
    private Map optionGroups = new HashMap();
    private List requiredOpts = new ArrayList();
    private Map shortOpts = new HashMap();

    public appendUpMsgLens addOptionGroup(appendUrl appendurl) {
        if (appendurl.isRequired()) {
            this.requiredOpts.add(appendurl);
        }
        for (appendCode appendcode : appendurl.getOptions()) {
            appendcode.setRequired(false);
            addOption(appendcode);
            this.optionGroups.put(appendcode.getKey(), appendurl);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public Collection getOptionGroups() {
        return new HashSet(this.optionGroups.values());
    }

    public appendUpMsgLens addOption(String str, boolean z, String str2) {
        addOption(str, (String) null, z, str2);
        return this;
    }

    public appendUpMsgLens addOption(String str, String str2, boolean z, String str3) {
        addOption(new appendCode(str, str2, z, str3));
        return this;
    }

    public appendUpMsgLens addOption(appendCode appendcode) {
        String key = appendcode.getKey();
        if (appendcode.hasLongOpt()) {
            this.longOpts.put(appendcode.getLongOpt(), appendcode);
        }
        if (appendcode.isRequired()) {
            if (this.requiredOpts.contains(key)) {
                List list = this.requiredOpts;
                list.remove(list.indexOf(key));
            }
            this.requiredOpts.add(key);
        }
        this.shortOpts.put(key, appendcode);
        return this;
    }

    public Collection getOptions() {
        return Collections.unmodifiableCollection(helpOptions());
    }

    /* access modifiers changed from: package-private */
    public List helpOptions() {
        return new ArrayList(this.shortOpts.values());
    }

    public List getRequiredOptions() {
        return this.requiredOpts;
    }

    public appendCode getOption(String str) {
        String length = appendErrMsg.length(str);
        if (this.shortOpts.containsKey(length)) {
            return (appendCode) this.shortOpts.get(length);
        }
        return (appendCode) this.longOpts.get(length);
    }

    public boolean hasOption(String str) {
        String length = appendErrMsg.length(str);
        return this.shortOpts.containsKey(length) || this.longOpts.containsKey(length);
    }

    public appendUrl getOptionGroup(appendCode appendcode) {
        return (appendUrl) this.optionGroups.get(appendcode.getKey());
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[ Options: [ short ");
        stringBuffer.append(this.shortOpts.toString());
        stringBuffer.append(" ] [ long ");
        stringBuffer.append(this.longOpts);
        stringBuffer.append(" ]");
        return stringBuffer.toString();
    }
}
