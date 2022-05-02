package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.TextContent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.IResultReceiver;

public final class NotificationCompat$Action$SemanticAction {
    NotificationCompat$Action$SemanticAction() {
    }

    public static <T> void length(int i, int i2, IResultReceiver.Stub<T> stub, IResultReceiver.Stub<T> stub2) {
        T t;
        if (getMin(i, stub2)) {
            t = stub2.setMin(i);
            stub2.getMax(i);
        } else {
            t = stub.setMin(i);
            stub.getMax(i);
        }
        stub.setMax(i2, t);
    }

    public static <T> boolean getMin(int i, IResultReceiver.Stub<T> stub) {
        return (stub == null || stub.setMin(i) == null) ? false : true;
    }

    public static void getMax(View view, Drawable drawable, int i, ViewCompat$ScrollIndicators viewCompat$ScrollIndicators) {
        if (((viewCompat$ScrollIndicators != null && viewCompat$ScrollIndicators.setMin()) || WindowInsetsAnimationCompat$Callback$DispatchMode.setMax(i)) && drawable.isStateful()) {
            drawable.setState(view.getDrawableState());
        }
    }

    public static List<?> getMin(IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub) {
        int min = stub.getMin();
        if (min == 1) {
            return Collections.singletonList(stub.IsOverlapping(0).setMax);
        }
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(stub.IsOverlapping(i).setMax);
        }
        return arrayList;
    }

    public static TextContent setMin(List<?> list) {
        int size = list.size();
        if (size == 1) {
            Object obj = list.get(0);
            return obj instanceof TextContent ? (TextContent) obj : TextContent.setMax;
        }
        final ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            if (obj2 instanceof TextContent) {
                arrayList.addAll(((TextContent) obj2).getTextItems());
            }
        }
        return new TextContent() {
            public final List<CharSequence> getTextItems() {
                return arrayList;
            }
        };
    }
}
