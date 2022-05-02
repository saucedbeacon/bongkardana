package o;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.regex.Pattern;

public final class SCLogCatInterface extends onUserConfirm {
    /* access modifiers changed from: private */
    public static final Pattern[][] setMax = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(SimpleComparison.GREATER_THAN_OPERATION)}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|meta|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    private final decodeFromFile getMax;
    private boolean getMin;
    private createJavaLogImpl length;
    private final Pattern setMin;

    /* synthetic */ SCLogCatInterface(Pattern pattern, byte b) {
        this(pattern);
    }

    private SCLogCatInterface(Pattern pattern) {
        this.getMax = new decodeFromFile();
        this.getMin = false;
        this.length = new createJavaLogImpl();
        this.setMin = pattern;
    }

    public final SCNetworkAsyncTaskExecutorFactory getMax() {
        return this.getMax;
    }

    public final setRsaPublicKey setMax(setEncryptRandomStringAndType setencryptrandomstringandtype) {
        if (this.getMin) {
            return null;
        }
        if (!setencryptrandomstringandtype.toIntRange() || this.setMin != null) {
            return new isAndroidPlatform(setencryptrandomstringandtype.setMin(), -1, false);
        }
        return null;
    }

    public final void getMax(CharSequence charSequence) {
        this.length.setMin(charSequence);
        Pattern pattern = this.setMin;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.getMin = true;
        }
    }

    public final void I_() {
        int i;
        decodeFromFile decodefromfile = this.getMax;
        String obj = this.length.getMax.toString();
        if (obj != null) {
            i = obj.length();
        } else {
            i = 0;
        }
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1375290862, oncanceled);
            onCancelLoad.getMin(1375290862, oncanceled);
        }
        decodefromfile.length = obj;
        this.length = null;
    }

    public static class length extends EncryptRandomType {
        public final setNeedConfirmButton length(setEncryptRandomStringAndType setencryptrandomstringandtype, SafeInputContext safeInputContext) {
            int max = setencryptrandomstringandtype.setMax();
            CharSequence max2 = setencryptrandomstringandtype.getMax();
            if (setencryptrandomstringandtype.toFloatRange() >= 4 || max2.charAt(max) != '<') {
                return null;
            }
            for (int i = 1; i <= 7; i++) {
                if (i != 7 || !(safeInputContext.getMax().getMax() instanceof suspendEncoding)) {
                    Pattern pattern = SCLogCatInterface.setMax[i][0];
                    Pattern pattern2 = SCLogCatInterface.setMax[i][1];
                    if (pattern.matcher(max2.subSequence(max, max2.length())).find()) {
                        return new createAndroidMPaaSLogImpl(new SCLogCatInterface(pattern2, (byte) 0)).length(setencryptrandomstringandtype.setMin());
                    }
                }
            }
            return null;
        }
    }
}
