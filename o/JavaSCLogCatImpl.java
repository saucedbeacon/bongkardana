package o;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class JavaSCLogCatImpl extends onUserConfirm {
    /* access modifiers changed from: private */
    public static final Pattern getMax = Pattern.compile("^`{3,}(?!.*`)|^~{3,}(?!.*~)");
    private static final Pattern setMin = Pattern.compile("^(?:`{3,}|~{3,})(?= *$)");
    private final decodeToObject getMin = new decodeToObject();
    private String length;
    private StringBuilder setMax = new StringBuilder();

    public JavaSCLogCatImpl(char c, int i, int i2) {
        this.getMin.setMin = c;
        this.getMin.setMax = i;
        this.getMin.length = i2;
    }

    public final SCNetworkAsyncTaskExecutorFactory getMax() {
        return this.getMin;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.setRsaPublicKey setMax(o.setEncryptRandomStringAndType r7) {
        /*
            r6 = this;
            int r0 = r7.setMax()
            int r1 = r7.setMin()
            java.lang.CharSequence r2 = r7.getMax()
            int r7 = r7.toFloatRange()
            r3 = 1
            r4 = 0
            r5 = 3
            if (r7 > r5) goto L_0x003d
            int r7 = r2.length()
            if (r0 >= r7) goto L_0x003d
            char r7 = r2.charAt(r0)
            o.decodeToObject r5 = r6.getMin
            char r5 = r5.getMax()
            if (r7 != r5) goto L_0x003d
            java.util.regex.Pattern r7 = setMin
            int r5 = r2.length()
            java.lang.CharSequence r0 = r2.subSequence(r0, r5)
            java.util.regex.Matcher r7 = r7.matcher(r0)
            boolean r0 = r7.find()
            if (r0 == 0) goto L_0x003e
            r0 = 1
            goto L_0x003f
        L_0x003d:
            r7 = 0
        L_0x003e:
            r0 = 0
        L_0x003f:
            r5 = -1
            if (r0 == 0) goto L_0x0056
            java.lang.String r7 = r7.group(r4)
            int r7 = r7.length()
            o.decodeToObject r0 = r6.getMin
            int r0 = r0.setMax
            if (r7 < r0) goto L_0x0056
            o.isAndroidPlatform r7 = new o.isAndroidPlatform
            r7.<init>(r5, r5, r3)
            return r7
        L_0x0056:
            o.decodeToObject r7 = r6.getMin
            int r7 = r7.length
        L_0x005a:
            if (r7 <= 0) goto L_0x006f
            int r0 = r2.length()
            if (r1 >= r0) goto L_0x006f
            char r0 = r2.charAt(r1)
            r3 = 32
            if (r0 != r3) goto L_0x006f
            int r1 = r1 + 1
            int r7 = r7 + -1
            goto L_0x005a
        L_0x006f:
            o.isAndroidPlatform r7 = new o.isAndroidPlatform
            r7.<init>(r1, r5, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.JavaSCLogCatImpl.setMax(o.setEncryptRandomStringAndType):o.setRsaPublicKey");
    }

    public final void getMax(CharSequence charSequence) {
        if (this.length == null) {
            this.length = charSequence.toString();
            return;
        }
        this.setMax.append(charSequence);
        this.setMax.append(10);
    }

    public final void I_() {
        decodeToObject decodetoobject = this.getMin;
        String max = DefaultSCNetworkAsyncTaskExecutor.getMax(this.length.trim());
        int length2 = max != null ? max.length() : 0;
        int max2 = dispatchOnCancelled.setMax(length2);
        if (length2 != max2) {
            onCanceled oncanceled = new onCanceled(length2, max2, 1);
            onCancelLoad.setMax(-1482699954, oncanceled);
            onCancelLoad.getMin(-1482699954, oncanceled);
        }
        decodetoobject.getMax = max;
        this.getMin.getMin = this.setMax.toString();
    }

    public static class length extends EncryptRandomType {
        public final setNeedConfirmButton length(setEncryptRandomStringAndType setencryptrandomstringandtype, SafeInputContext safeInputContext) {
            int max = setencryptrandomstringandtype.setMax();
            CharSequence max2 = setencryptrandomstringandtype.getMax();
            if (setencryptrandomstringandtype.toFloatRange() >= 4) {
                return null;
            }
            Matcher matcher = JavaSCLogCatImpl.getMax.matcher(max2.subSequence(max, max2.length()));
            if (!matcher.find()) {
                return null;
            }
            int length = matcher.group(0).length();
            return new createAndroidMPaaSLogImpl(new JavaSCLogCatImpl(matcher.group(0).charAt(0), length, setencryptrandomstringandtype.toFloatRange())).length(max + length);
        }
    }
}
