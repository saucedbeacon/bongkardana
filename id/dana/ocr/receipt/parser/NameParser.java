package id.dana.ocr.receipt.parser;

import com.google.firebase.ml.vision.text.FirebaseVisionText;
import id.dana.data.socialshare.ShareAppKey;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00022\u0010\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u0016¨\u0006\n"}, d2 = {"Lid/dana/ocr/receipt/parser/NameParser;", "Lid/dana/ocr/receipt/parser/Parser2;", "Lcom/google/firebase/ml/vision/text/FirebaseVisionText$Line;", "", "", "Lid/dana/ocr/receipt/parser/Aliases;", "()V", "parse", "line", "alias", "library_release"}, k = 1, mv = {1, 1, 16})
public final class NameParser implements Parser2<FirebaseVisionText.Line, List<? extends String>, String> {
    public static final NameParser getMax = new NameParser();

    private NameParser() {
    }

    @Nullable
    public static String getMin(@NotNull FirebaseVisionText.Line line, @NotNull List<String> list) {
        Object obj;
        Intrinsics.checkParameterIsNotNull(line, ShareAppKey.LINE);
        Intrinsics.checkParameterIsNotNull(list, "alias");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String text = line.getText();
            Intrinsics.checkExpressionValueIsNotNull(text, "line.text");
            if (StringsKt.contains((CharSequence) text, (CharSequence) (String) obj, true)) {
                break;
            }
        }
        return (String) obj;
    }
}
