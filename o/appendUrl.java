package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.cli.AlreadySelectedException;

public class appendUrl implements Serializable {
    private static final long serialVersionUID = 1;
    private Map optionMap = new HashMap();
    private boolean required;
    private String selected;

    public appendUrl addOption(appendCode appendcode) {
        this.optionMap.put(appendcode.getKey(), appendcode);
        return this;
    }

    public Collection getNames() {
        return this.optionMap.keySet();
    }

    public Collection getOptions() {
        return this.optionMap.values();
    }

    public void setSelected(appendCode appendcode) throws AlreadySelectedException {
        String str = this.selected;
        if (str == null || str.equals(appendcode.getOpt())) {
            this.selected = appendcode.getOpt();
            return;
        }
        throw new AlreadySelectedException(this, appendcode);
    }

    public String getSelected() {
        return this.selected;
    }

    public void setRequired(boolean z) {
        this.required = z;
    }

    public boolean isRequired() {
        return this.required;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = getOptions().iterator();
        stringBuffer.append("[");
        while (it.hasNext()) {
            appendCode appendcode = (appendCode) it.next();
            if (appendcode.getOpt() != null) {
                stringBuffer.append("-");
                stringBuffer.append(appendcode.getOpt());
            } else {
                stringBuffer.append("--");
                stringBuffer.append(appendcode.getLongOpt());
            }
            stringBuffer.append(" ");
            stringBuffer.append(appendcode.getDescription());
            if (it.hasNext()) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
