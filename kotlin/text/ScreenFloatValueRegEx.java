package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/text/ScreenFloatValueRegEx;", "", "()V", "value", "Lkotlin/text/Regex;", "kotlin-stdlib"}, k = 1, mv = {1, 4, 1})
final class ScreenFloatValueRegEx {
    @NotNull
    public static final ScreenFloatValueRegEx INSTANCE = new ScreenFloatValueRegEx();
    @NotNull
    @JvmField
    public static final Regex value;

    static {
        String concat = "[eE][+-]?".concat("(\\p{Digit}+)");
        StringBuilder sb = new StringBuilder("(0[xX]");
        sb.append("(\\p{XDigit}+)");
        sb.append("(\\.)?)|(0[xX]");
        sb.append("(\\p{XDigit}+)");
        sb.append("?(\\.)");
        sb.append("(\\p{XDigit}+)");
        sb.append(')');
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append("(\\p{Digit}+)");
        sb2.append("(\\.)?(");
        sb2.append("(\\p{Digit}+)");
        sb2.append("?)(");
        sb2.append(concat);
        sb2.append(")?)|(\\.(");
        sb2.append("(\\p{Digit}+)");
        sb2.append(")(");
        sb2.append(concat);
        sb2.append(")?)|((");
        sb2.append(obj);
        sb2.append(")[pP][+-]?");
        sb2.append("(\\p{Digit}+)");
        sb2.append(')');
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder("[\\x00-\\x20]*[+-]?(NaN|Infinity|((");
        sb3.append(obj2);
        sb3.append(")[fFdD]?))[\\x00-\\x20]*");
        value = new Regex(sb3.toString());
    }

    private ScreenFloatValueRegEx() {
    }
}
