package o;

import id.dana.sendmoney.summary.SummaryActivity;
import java.io.File;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import org.apache.commons.cli.ParseException;

public class recordTcpTime implements Serializable {
    private static final long serialVersionUID = 1;
    private List args = new LinkedList();
    private List options = new ArrayList();

    recordTcpTime() {
    }

    public boolean hasOption(String str) {
        return this.options.contains(resolveOption(str));
    }

    public boolean hasOption(char c) {
        return hasOption(String.valueOf(c));
    }

    public Object getOptionObject(String str) {
        try {
            return getParsedOptionValue(str);
        } catch (ParseException e) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer("Exception found converting ");
            stringBuffer.append(str);
            stringBuffer.append(" to desired type: ");
            stringBuffer.append(e.getMessage());
            printStream.println(stringBuffer.toString());
            return null;
        }
    }

    public Object getParsedOptionValue(String str) throws ParseException {
        String optionValue = getOptionValue(str);
        appendCode resolveOption = resolveOption(str);
        if (resolveOption == null) {
            return null;
        }
        Object type = resolveOption.getType();
        if (optionValue != null) {
            Class cls = (Class) type;
            if (appendLiveTime.setMax == cls) {
                return optionValue;
            }
            if (appendLiveTime.length == cls) {
                return appendDownMsgCount.setMax(optionValue);
            }
            if (appendLiveTime.setMin == cls) {
                return appendDownMsgCount.getMax(optionValue);
            }
            if (appendLiveTime.getMin == cls) {
                throw new UnsupportedOperationException("Not yet implemented");
            } else if (appendLiveTime.getMax == cls) {
                return appendDownMsgCount.setMin(optionValue);
            } else {
                if (appendLiveTime.equals == cls) {
                    return new File(optionValue);
                }
                if (appendLiveTime.toIntRange == cls) {
                    return new File(optionValue);
                }
                if (appendLiveTime.toFloatRange == cls) {
                    throw new UnsupportedOperationException("Not yet implemented");
                } else if (appendLiveTime.IsOverlapping == cls) {
                    return appendDownMsgCount.length(optionValue);
                }
            }
        }
        return null;
    }

    public Object getOptionObject(char c) {
        return getOptionObject(String.valueOf(c));
    }

    public String getOptionValue(String str) {
        String[] optionValues = getOptionValues(str);
        if (optionValues == null) {
            return null;
        }
        return optionValues[0];
    }

    public String getOptionValue(char c) {
        return getOptionValue(String.valueOf(c));
    }

    public String[] getOptionValues(String str) {
        ArrayList arrayList = new ArrayList();
        for (appendCode appendcode : this.options) {
            if (str.equals(appendcode.getOpt()) || str.equals(appendcode.getLongOpt())) {
                arrayList.addAll(appendcode.getValuesList());
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private o.appendCode resolveOption(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = o.appendErrMsg.length(r4)
            java.util.List r0 = r3.options
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x002c
            java.lang.Object r1 = r0.next()
            o.appendCode r1 = (o.appendCode) r1
            java.lang.String r2 = r1.getOpt()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0021
            return r1
        L_0x0021:
            java.lang.String r2 = r1.getLongOpt()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x000a
            return r1
        L_0x002c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.recordTcpTime.resolveOption(java.lang.String):o.appendCode");
    }

    public String[] getOptionValues(char c) {
        return getOptionValues(String.valueOf(c));
    }

    public String getOptionValue(String str, String str2) {
        String optionValue = getOptionValue(str);
        return optionValue != null ? optionValue : str2;
    }

    public String getOptionValue(char c, String str) {
        return getOptionValue(String.valueOf(c), str);
    }

    public Properties getOptionProperties(String str) {
        Properties properties = new Properties();
        for (appendCode appendcode : this.options) {
            if (str.equals(appendcode.getOpt()) || str.equals(appendcode.getLongOpt())) {
                List valuesList = appendcode.getValuesList();
                if (valuesList.size() >= 2) {
                    properties.put(valuesList.get(0), valuesList.get(1));
                } else if (valuesList.size() == 1) {
                    properties.put(valuesList.get(0), SummaryActivity.CHECKED);
                }
            }
        }
        return properties;
    }

    public String[] getArgs() {
        String[] strArr = new String[this.args.size()];
        this.args.toArray(strArr);
        return strArr;
    }

    public List getArgList() {
        return this.args;
    }

    /* access modifiers changed from: package-private */
    public void addArg(String str) {
        this.args.add(str);
    }

    /* access modifiers changed from: package-private */
    public void addOption(appendCode appendcode) {
        this.options.add(appendcode);
    }

    public Iterator iterator() {
        return this.options.iterator();
    }

    public appendCode[] getOptions() {
        List list = this.options;
        return (appendCode[]) list.toArray(new appendCode[list.size()]);
    }
}
