package o;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class printLog extends onUserConfirm {
    /* access modifiers changed from: private */
    public static Pattern length = Pattern.compile("(^| ) *#+ *$");
    /* access modifiers changed from: private */
    public static Pattern setMax = Pattern.compile("^#{1,6}(?:[ \t]+|$)");
    /* access modifiers changed from: private */
    public static Pattern setMin = Pattern.compile("^(?:=+|-+) *$");
    private final encodeToFile getMax;
    private final String getMin;

    public final setRsaPublicKey setMax(setEncryptRandomStringAndType setencryptrandomstringandtype) {
        return null;
    }

    public printLog(int i, String str) {
        encodeToFile encodetofile = new encodeToFile();
        this.getMax = encodetofile;
        encodetofile.setMin = i;
        this.getMin = str;
    }

    public final SCNetworkAsyncTaskExecutorFactory getMax() {
        return this.getMax;
    }

    public final void getMax(asciiBytes asciibytes) {
        asciibytes.getMax(this.getMin, this.getMax);
    }

    public static class getMin extends EncryptRandomType {
        public final setNeedConfirmButton length(setEncryptRandomStringAndType setencryptrandomstringandtype, SafeInputContext safeInputContext) {
            if (setencryptrandomstringandtype.toFloatRange() >= 4) {
                return null;
            }
            CharSequence max = setencryptrandomstringandtype.getMax();
            int max2 = setencryptrandomstringandtype.setMax();
            CharSequence min = safeInputContext.getMin();
            Matcher matcher = printLog.setMax.matcher(max.subSequence(max2, max.length()));
            if (matcher.find()) {
                return new createAndroidMPaaSLogImpl(new printLog(matcher.group(0).trim().length(), printLog.length.matcher(max.subSequence(max2 + matcher.group(0).length(), max.length())).replaceAll(""))).length(max.length());
            }
            if (min != null) {
                Matcher matcher2 = printLog.setMin.matcher(max.subSequence(max2, max.length()));
                if (matcher2.find()) {
                    return new createAndroidMPaaSLogImpl(new printLog(matcher2.group(0).charAt(0) == '=' ? 1 : 2, min.toString())).length(max.length()).length();
                }
            }
            return null;
        }
    }
}
