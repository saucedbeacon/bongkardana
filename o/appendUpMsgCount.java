package o;

import java.util.List;
import java.util.ListIterator;
import org.apache.commons.cli.MissingArgumentException;
import org.apache.commons.cli.ParseException;

public abstract class appendUpMsgCount implements MonitorItemConstants {
    private appendUpMsgLens getMax;
    private List setMax;
    protected recordTcpTime setMin;

    /* access modifiers changed from: protected */
    public abstract String[] setMin(appendUpMsgLens appendupmsglens, String[] strArr);

    private void getMin(appendCode appendcode, ListIterator listIterator) throws ParseException {
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            String str = (String) listIterator.next();
            if (this.getMax.hasOption(str) && str.startsWith("-")) {
                listIterator.previous();
                break;
            }
            try {
                if (str.startsWith("\"")) {
                    str = str.substring(1, str.length());
                }
                if (str.endsWith("\"")) {
                    str = str.substring(0, str.length() - 1);
                }
                appendcode.addValueForProcessing(str);
            } catch (RuntimeException unused) {
                listIterator.previous();
            }
        }
        if (appendcode.getValues() == null && !appendcode.hasOptionalArg()) {
            throw new MissingArgumentException(appendcode);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00db A[LOOP:2: B:39:0x00db->B:56:0x00db, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x003f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.recordTcpTime length(o.appendUpMsgLens r6, java.lang.String[] r7) throws org.apache.commons.cli.ParseException {
        /*
            r5 = this;
            java.util.List r0 = r6.helpOptions()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0018
            java.lang.Object r1 = r0.next()
            o.appendCode r1 = (o.appendCode) r1
            r1.clearValues()
            goto L_0x0008
        L_0x0018:
            r5.getMax = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r6 = r6.getRequiredOptions()
            r0.<init>(r6)
            r5.setMax = r0
            o.recordTcpTime r6 = new o.recordTcpTime
            r6.<init>()
            r5.setMin = r6
            r6 = 0
            if (r7 != 0) goto L_0x0031
            java.lang.String[] r7 = new java.lang.String[r6]
        L_0x0031:
            o.appendUpMsgLens r0 = r5.getMax
            java.lang.String[] r7 = r5.setMin(r0, r7)
            java.util.List r7 = java.util.Arrays.asList(r7)
            java.util.ListIterator r7 = r7.listIterator()
        L_0x003f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "--"
            boolean r2 = r1.equals(r0)
            r3 = 1
            if (r2 == 0) goto L_0x0057
        L_0x0054:
            r6 = 1
            goto L_0x00d9
        L_0x0057:
            java.lang.String r2 = "-"
            boolean r4 = r2.equals(r0)
            if (r4 == 0) goto L_0x0060
            goto L_0x0054
        L_0x0060:
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x00d2
            o.appendUpMsgLens r2 = r5.getMax
            boolean r2 = r2.hasOption(r0)
            if (r2 != 0) goto L_0x0074
            o.recordTcpTime r6 = r5.setMin
            r6.addArg(r0)
            goto L_0x0054
        L_0x0074:
            o.appendUpMsgLens r2 = r5.getMax
            boolean r2 = r2.hasOption(r0)
            if (r2 == 0) goto L_0x00c2
            o.appendUpMsgLens r2 = r5.getMax
            o.appendCode r0 = r2.getOption(r0)
            java.lang.Object r0 = r0.clone()
            o.appendCode r0 = (o.appendCode) r0
            boolean r2 = r0.isRequired()
            if (r2 == 0) goto L_0x0097
            java.util.List r2 = r5.setMax
            java.lang.String r3 = r0.getKey()
            r2.remove(r3)
        L_0x0097:
            o.appendUpMsgLens r2 = r5.getMax
            o.appendUrl r2 = r2.getOptionGroup(r0)
            if (r2 == 0) goto L_0x00b3
            o.appendUpMsgLens r2 = r5.getMax
            o.appendUrl r2 = r2.getOptionGroup(r0)
            boolean r3 = r2.isRequired()
            if (r3 == 0) goto L_0x00b0
            java.util.List r3 = r5.setMax
            r3.remove(r2)
        L_0x00b0:
            r2.setSelected(r0)
        L_0x00b3:
            boolean r2 = r0.hasArg()
            if (r2 == 0) goto L_0x00bc
            r5.getMin(r0, r7)
        L_0x00bc:
            o.recordTcpTime r2 = r5.setMin
            r2.addOption(r0)
            goto L_0x00d9
        L_0x00c2:
            org.apache.commons.cli.UnrecognizedOptionException r6 = new org.apache.commons.cli.UnrecognizedOptionException
            java.lang.String r7 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unrecognized option: "
            java.lang.String r7 = r1.concat(r7)
            r6.<init>(r7, r0)
            throw r6
        L_0x00d2:
            o.recordTcpTime r6 = r5.setMin
            r6.addArg(r0)
            goto L_0x0054
        L_0x00d9:
            if (r6 == 0) goto L_0x003f
        L_0x00db:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = r1.equals(r0)
            if (r2 != 0) goto L_0x00db
            o.recordTcpTime r2 = r5.setMin
            r2.addArg(r0)
            goto L_0x00db
        L_0x00f3:
            java.util.List r6 = r5.setMax
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x00fe
            o.recordTcpTime r6 = r5.setMin
            return r6
        L_0x00fe:
            org.apache.commons.cli.MissingOptionException r6 = new org.apache.commons.cli.MissingOptionException
            java.util.List r7 = r5.setMax
            r6.<init>((java.util.List) r7)
            goto L_0x0107
        L_0x0106:
            throw r6
        L_0x0107:
            goto L_0x0106
        */
        throw new UnsupportedOperationException("Method not decompiled: o.appendUpMsgCount.length(o.appendUpMsgLens, java.lang.String[]):o.recordTcpTime");
    }
}
