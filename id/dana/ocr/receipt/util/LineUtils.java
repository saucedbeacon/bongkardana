package id.dana.ocr.receipt.util;

import android.annotation.SuppressLint;
import android.graphics.Point;
import com.google.firebase.ml.vision.text.FirebaseVisionText;
import id.dana.data.socialshare.ShareAppKey;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¨\u0006\u0005"}, d2 = {"findOverlap", "Lcom/google/firebase/ml/vision/text/FirebaseVisionText$Line;", "source", "", "Lcom/google/firebase/ml/vision/text/FirebaseVisionText$TextBlock;", "library_release"}, k = 2, mv = {1, 1, 16})
@JvmName(name = "LineUtils")
public final class LineUtils {
    @Nullable
    @SuppressLint({"DefaultLocale"})
    public static final FirebaseVisionText.Line setMax(@NotNull FirebaseVisionText.Line line, @NotNull List<? extends FirebaseVisionText.TextBlock> list) {
        FirebaseVisionText.Line line2;
        Intrinsics.checkParameterIsNotNull(line, "$this$findOverlap");
        Intrinsics.checkParameterIsNotNull(list, "source");
        loop0:
        for (FirebaseVisionText.TextBlock lines : list) {
            List<FirebaseVisionText.Line> lines2 = lines.getLines();
            Intrinsics.checkExpressionValueIsNotNull(lines2, "block.lines");
            Iterator it = lines2.iterator();
            while (true) {
                if (it.hasNext()) {
                    line2 = (FirebaseVisionText.Line) it.next();
                    String text = line.getText();
                    Intrinsics.checkExpressionValueIsNotNull(text, "this.text");
                    if (text != null) {
                        String lowerCase = text.toLowerCase();
                        Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                        Intrinsics.checkExpressionValueIsNotNull(line2, ShareAppKey.LINE);
                        String text2 = line2.getText();
                        Intrinsics.checkExpressionValueIsNotNull(text2, "line.text");
                        if (text2 != null) {
                            String lowerCase2 = text2.toLowerCase();
                            Intrinsics.checkExpressionValueIsNotNull(lowerCase2, "(this as java.lang.String).toLowerCase()");
                            if (!Intrinsics.areEqual((Object) lowerCase, (Object) lowerCase2)) {
                                Point[] cornerPoints = line2.getCornerPoints();
                                Point[] cornerPoints2 = line.getCornerPoints();
                                if (!(cornerPoints == null || cornerPoints2 == null)) {
                                    Point point = cornerPoints[1];
                                    Point point2 = cornerPoints[2];
                                    Point point3 = cornerPoints2[1];
                                    Point point4 = cornerPoints2[2];
                                    if ((point3.y <= point.y && point4.y <= point2.y && point.y < point4.y) || ((point3.y <= point.y && point4.y >= point2.y) || ((point3.y >= point.y && point4.y >= point2.y && point3.y < point2.y) || (point3.y >= point.y && point4.y <= point2.y)))) {
                                        return line2;
                                    }
                                }
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
            return line2;
        }
        return null;
    }
}
