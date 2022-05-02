package o;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class setMessagesBytes extends onUserConfirm {
    /* access modifiers changed from: private */
    public static final Pattern length = Pattern.compile("\\s*-\\s+\\[(x|X|\\s)\\]\\s+(.*)");
    private final List<length> getMax;
    private final clearAppVersion getMin = new clearAppVersion();
    private int setMax;

    setMessagesBytes(@NonNull String str, int i) {
        ArrayList arrayList = new ArrayList(3);
        this.getMax = arrayList;
        this.setMax = 0;
        arrayList.add(new length(str, i));
        this.setMax = i;
    }

    public final SCNetworkAsyncTaskExecutorFactory getMax() {
        return this.getMin;
    }

    public final void getMax(asciiBytes asciibytes) {
        for (length next : this.getMax) {
            Matcher matcher = length.matcher(next.setMax);
            if (matcher.matches()) {
                ConfigChangeBroadCastReceiver configChangeBroadCastReceiver = new ConfigChangeBroadCastReceiver();
                configChangeBroadCastReceiver.getMin = getMax(matcher.group(1));
                configChangeBroadCastReceiver.getMax = next.getMin / 2;
                asciibytes.getMax(matcher.group(2), configChangeBroadCastReceiver);
                this.getMin.getMax(configChangeBroadCastReceiver);
            }
        }
    }

    static class setMax extends EncryptRandomType {
        setMax() {
        }

        public final setNeedConfirmButton length(setEncryptRandomStringAndType setencryptrandomstringandtype, SafeInputContext safeInputContext) {
            String min = setMessagesBytes.getMin(setencryptrandomstringandtype);
            if (min == null || min.length() <= 0 || !setMessagesBytes.length.matcher(min).matches()) {
                return null;
            }
            int length = min.length();
            int min2 = setencryptrandomstringandtype.setMin();
            if (min2 != 0) {
                length = (length - min2) + min2;
            }
            return new createAndroidMPaaSLogImpl(new setMessagesBytes(min, setencryptrandomstringandtype.toFloatRange())).length(length);
        }
    }

    private static boolean getMax(@NonNull String str) {
        return "X".equals(str) || "x".equals(str);
    }

    static class length {
        final int getMin;
        final String setMax;

        length(@NonNull String str, int i) {
            this.setMax = str;
            this.getMin = i;
        }
    }

    public final setRsaPublicKey setMax(setEncryptRandomStringAndType setencryptrandomstringandtype) {
        String str;
        CharSequence max = setencryptrandomstringandtype.getMax();
        if (max != null) {
            str = max.toString();
        } else {
            str = null;
        }
        int floatRange = setencryptrandomstringandtype.toFloatRange();
        int i = this.setMax;
        if (floatRange > i) {
            this.setMax = i + 2;
        } else if (floatRange < i && i > 1) {
            this.setMax = i - 2;
        }
        if (str == null || str.length() <= 0 || !length.matcher(str).matches()) {
            return null;
        }
        return new isAndroidPlatform(setencryptrandomstringandtype.setMin(), -1, false);
    }

    public final void getMax(CharSequence charSequence) {
        int i;
        if (charSequence != null) {
            i = charSequence.length();
        } else {
            i = 0;
        }
        if (i > 0) {
            this.getMax.add(new length(charSequence.toString(), this.setMax));
        }
    }

    static /* synthetic */ String getMin(setEncryptRandomStringAndType setencryptrandomstringandtype) {
        CharSequence max = setencryptrandomstringandtype.getMax();
        if (max != null) {
            return max.toString();
        }
        return null;
    }
}
