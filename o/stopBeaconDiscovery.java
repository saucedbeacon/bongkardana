package o;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import id.dana.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a,\u0010\b\u001a\u00020\u0001*\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\u0002\u001a&\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0014\b\u0004\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0012H\bø\u0001\u0000\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\n\u001a\u0012\u0010\u0015\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0016\u001a\u00020\n\u001a\n\u0010\u0017\u001a\u00020\u0007*\u00020\u0007\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0018"}, d2 = {"addEmojiFilter", "", "Landroid/widget/EditText;", "clearText", "Landroid/widget/TextView;", "containsEmoji", "", "", "createColoredSpan", "color", "", "spanText", "", "onClick", "Lkotlin/Function0;", "focus", "onTextAfterChanged", "action", "Lkotlin/Function1;", "setBackgroundTint", "resId", "setMaxLength", "maxLength", "toCleanUrl", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class stopBeaconDiscovery {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0007\u001a\n \u0002*\u0004\u0018\u00010\b0\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "source", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "<anonymous parameter 3>", "Landroid/text/Spanned;", "<anonymous parameter 4>", "<anonymous parameter 5>", "filter"}, k = 3, mv = {1, 4, 2})
    public static final class setMax implements InputFilter {
        public static final setMax getMin = new setMax();

        setMax() {
        }

        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            Intrinsics.checkNotNullExpressionValue(charSequence, "source");
            return stopBeaconDiscovery.setMin(charSequence) ? "" : null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/extension/view/InputExtKt$createColoredSpan$2", "Landroid/text/style/ClickableSpan;", "onClick", "", "view", "Landroid/view/View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends ClickableSpan {
        final /* synthetic */ Function0 length;

        getMin(Function0 function0) {
            this.length = function0;
        }

        public final void onClick(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.length.invoke();
        }
    }

    public static final void setMax(@NotNull TextView textView, @NotNull String str, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(textView, "$this$createColoredSpan");
        Intrinsics.checkNotNullParameter(str, "spanText");
        Intrinsics.checkNotNullParameter(function0, "onClick");
        ClickableSpan getmin = new getMin(function0);
        int max = IntRange.setMax(textView.getContext(), R.color.f18632131099744);
        CharSequence text = textView.getText();
        String obj = text != null ? text.toString() : null;
        if (obj == null) {
            obj = "";
        }
        setH5MenuList.getMin(textView, getmin, max, obj, str);
    }

    @NotNull
    public static final CharSequence setMax(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "$this$toCleanUrl");
        String str = null;
        boolean z = false;
        if (StringsKt.contains$default(charSequence, (CharSequence) "http", false, 2, (Object) null) || StringsKt.contains$default(charSequence, (CharSequence) "https", false, 2, (Object) null)) {
            z = true;
        }
        if (!z) {
            str = "https://m.dana.id";
        }
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(charSequence);
            String obj = sb.toString();
            if (obj != null) {
                return obj;
            }
        }
        return charSequence;
    }

    public static final boolean setMin(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "$this$containsEmoji");
        int length = charSequence.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            byte type = (byte) Character.getType(charSequence.charAt(i));
            if (type == 19 || type == 28) {
                break;
            }
            i++;
        }
        return i != -1;
    }
}
