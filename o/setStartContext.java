package o;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.net.URLDecoder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toScopes", "", "", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class setStartContext {
    private static int getMax = 1;
    private static int getMin = 0;
    private static long length = 0;
    private static int setMax = 0;
    private static char setMin = '?';

    @NotNull
    public static final List<String> toScopes(@NotNull String str) {
        String str2 = str;
        int i = getMax + 57;
        getMin = i % 128;
        int i2 = i % 2;
        Intrinsics.checkNotNullParameter(str2, "$this$toScopes");
        String decode = URLDecoder.decode(str2, setMin(new char[]{13472, 26697, 2189, 4320}, TextUtils.lastIndexOf("", '0', 0, 0) - 1922545355, new char[]{63419, 33550, 40898, 42029, 38547}, new char[]{0, 0, 0, 0}, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) + 57351)).intern());
        Intrinsics.checkNotNullExpressionValue(decode, "URLDecoder.decode(this, \"UTF-8\")");
        List<String> split$default = StringsKt.split$default((CharSequence) StringsKt.replace$default(decode, "[\\[\\]\"]", "", false, 4, (Object) null), new String[]{","}, false, 0, 6, (Object) null);
        int i3 = getMax + 39;
        getMin = i3 % 128;
        int i4 = i3 % 2;
        return split$default;
    }

    private static String setMin(char[] cArr, int i, char[] cArr2, char[] cArr3, char c) {
        int i2 = getMax + 33;
        getMin = i2 % 128;
        int i3 = i2 % 2;
        try {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr3.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length2 = cArr2.length;
            char[] cArr6 = new char[length2];
            int i4 = getMin + 13;
            getMax = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            while (true) {
                if (i6 >= length2) {
                    return new String(cArr6);
                }
                int i7 = getMin + 99;
                getMax = i7 % 128;
                int i8 = i7 % 2;
                OnLifecycleEvent.length(cArr4, cArr5, i6);
                cArr6[i6] = (char) ((int) (((((long) (cArr2[i6] ^ cArr4[(i6 + 3) % 4])) ^ length) ^ ((long) setMax)) ^ ((long) setMin)));
                i6++;
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
