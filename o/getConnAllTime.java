package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.commonmark.ext.gfm.tables.TableCell;

public final class getConnAllTime extends onUserConfirm {
    /* access modifiers changed from: private */
    public static Pattern getMin = null;
    private static String setMax = "\\s*:?-{3,}:?\\s*";
    private String IsOverlapping;
    private boolean getMax;
    private final List<CharSequence> length;
    private final appendTcpTime setMin;

    /* synthetic */ getConnAllTime(CharSequence charSequence, byte b) {
        this(charSequence);
    }

    static {
        StringBuilder sb = new StringBuilder("\\|");
        sb.append(setMax);
        sb.append("\\|?\\s*|");
        sb.append(setMax);
        sb.append("\\|\\s*|\\|?(?:");
        sb.append(setMax);
        sb.append("\\|)+");
        sb.append(setMax);
        sb.append("\\|?\\s*");
        getMin = Pattern.compile(sb.toString());
    }

    private getConnAllTime(CharSequence charSequence) {
        this.setMin = new appendTcpTime();
        ArrayList arrayList = new ArrayList();
        this.length = arrayList;
        this.getMax = true;
        this.IsOverlapping = "";
        arrayList.add(charSequence);
    }

    public final SCNetworkAsyncTaskExecutorFactory getMax() {
        return this.setMin;
    }

    public final setRsaPublicKey setMax(setEncryptRandomStringAndType setencryptrandomstringandtype) {
        if (setencryptrandomstringandtype.getMax().toString().contains("|")) {
            return new isAndroidPlatform(setencryptrandomstringandtype.setMin(), -1, false);
        }
        return null;
    }

    public final void getMax(CharSequence charSequence) {
        if (this.getMax) {
            this.getMax = false;
            this.IsOverlapping = charSequence.toString();
            return;
        }
        this.length.add(charSequence);
    }

    public final void getMax(asciiBytes asciibytes) {
        encodeBytes simpleStatistical = new SimpleStatistical();
        this.setMin.getMax(simpleStatistical);
        List<String> min = setMin(this.IsOverlapping);
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = min.iterator();
        while (true) {
            TableCell.Alignment alignment = null;
            if (!it.hasNext()) {
                break;
            }
            String trim = it.next().trim();
            boolean startsWith = trim.startsWith(":");
            boolean endsWith = trim.endsWith(":");
            if (startsWith && endsWith) {
                alignment = TableCell.Alignment.CENTER;
            } else if (startsWith) {
                alignment = TableCell.Alignment.LEFT;
            } else if (endsWith) {
                alignment = TableCell.Alignment.RIGHT;
            }
            arrayList.add(alignment);
        }
        boolean z = true;
        int i = -1;
        for (CharSequence min2 : this.length) {
            List<String> min3 = setMin(min2);
            PlatformUtil platformUtil = new PlatformUtil();
            if (i == -1) {
                i = min3.size();
            }
            int i2 = 0;
            while (i2 < i) {
                String str = i2 < min3.size() ? min3.get(i2) : "";
                TableCell.Alignment alignment2 = i2 < arrayList.size() ? (TableCell.Alignment) arrayList.get(i2) : null;
                TableCell tableCell = new TableCell();
                tableCell.setMax = z;
                tableCell.getMin = alignment2;
                asciibytes.getMax(str.trim(), tableCell);
                platformUtil.getMax(tableCell);
                i2++;
            }
            simpleStatistical.getMax(platformUtil);
            if (z) {
                simpleStatistical = new appendTargetHost();
                this.setMin.getMax(simpleStatistical);
                z = false;
            }
        }
    }

    /* access modifiers changed from: private */
    public static List<String> setMin(CharSequence charSequence) {
        String trim = charSequence.toString().trim();
        if (trim.startsWith("|")) {
            trim = trim.substring(1);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i = 0; i < trim.length(); i++) {
            char charAt = trim.charAt(i);
            if (z) {
                sb.append(charAt);
                z = false;
            } else if (charAt == '\\') {
                sb.append(charAt);
                z = true;
            } else if (charAt != '|') {
                sb.append(charAt);
            } else {
                arrayList.add(sb.toString());
                sb.setLength(0);
            }
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    public static class getMin extends EncryptRandomType {
        public final setNeedConfirmButton length(setEncryptRandomStringAndType setencryptrandomstringandtype, SafeInputContext safeInputContext) {
            CharSequence max = setencryptrandomstringandtype.getMax();
            CharSequence min = safeInputContext.getMin();
            if (min == null || !min.toString().contains("|") || min.toString().contains("\n")) {
                return null;
            }
            CharSequence subSequence = max.subSequence(setencryptrandomstringandtype.setMin(), max.length());
            if (!getConnAllTime.getMin.matcher(subSequence).matches()) {
                return null;
            }
            if (getConnAllTime.setMin(subSequence).size() < getConnAllTime.setMin(min).size()) {
                return null;
            }
            return new createAndroidMPaaSLogImpl(new getConnAllTime(min, (byte) 0)).length(setencryptrandomstringandtype.setMin()).length();
        }
    }
}
