package id.dana.ocr.receipt.parser;

import com.google.firebase.ml.vision.text.FirebaseVisionText;
import id.dana.data.socialshare.ShareAppKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/ocr/receipt/parser/BillNumberCandidateParser;", "Lid/dana/ocr/receipt/parser/Parser;", "Lcom/google/firebase/ml/vision/text/FirebaseVisionText$Line;", "", "()V", "PATTERN_BILL_FORBID_CHAR", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PATTERN_BILL_SHOULD_HAVE_NUMBER", "parse", "line", "library_release"}, k = 1, mv = {1, 1, 16})
public final class BillNumberCandidateParser implements Parser<FirebaseVisionText.Line, String> {
    public static final BillNumberCandidateParser getMax = new BillNumberCandidateParser();
    private static final Pattern setMax = Pattern.compile("([\\d]+)");
    private static final Pattern setMin = Pattern.compile("[\\s,.:-]");

    private BillNumberCandidateParser() {
    }

    @Nullable
    public static String setMax(@NotNull FirebaseVisionText.Line line) {
        List list;
        Object obj;
        int i;
        int i2;
        Intrinsics.checkParameterIsNotNull(line, ShareAppKey.LINE);
        List<FirebaseVisionText.Element> elements = line.getElements();
        Intrinsics.checkExpressionValueIsNotNull(elements, "line.elements");
        if (!(!elements.isEmpty()) || line.getElements().size() <= 1) {
            String text = line.getText();
            Intrinsics.checkExpressionValueIsNotNull(text, "line.text");
            if (text != null) {
                list = CollectionsKt.listOf(StringsKt.trim((CharSequence) text).toString());
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        } else {
            List<FirebaseVisionText.Element> elements2 = line.getElements();
            Intrinsics.checkExpressionValueIsNotNull(elements2, "line.elements");
            Iterable<FirebaseVisionText.Element> iterable = elements2;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (FirebaseVisionText.Element element : iterable) {
                Intrinsics.checkExpressionValueIsNotNull(element, "it");
                arrayList.add(element.getText());
            }
            list = (List) arrayList;
        }
        Iterable iterable2 = list;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            CharSequence charSequence = (String) it.next();
            Matcher matcher = setMax.matcher(charSequence);
            if (matcher.find() && !setMin.matcher(charSequence).find()) {
                obj = matcher.group();
            }
            arrayList2.add(obj);
        }
        Iterator it2 = ((List) arrayList2).iterator();
        if (it2.hasNext()) {
            obj = it2.next();
            if (it2.hasNext()) {
                String str = obj;
                if (str != null) {
                    i = str.length();
                } else {
                    i = 0;
                }
                do {
                    Object next = it2.next();
                    String str2 = (String) next;
                    if (str2 != null) {
                        i2 = str2.length();
                    } else {
                        i2 = 0;
                    }
                    if (i < i2) {
                        obj = next;
                        i = i2;
                    }
                } while (it2.hasNext());
            }
        }
        return (String) obj;
    }
}
