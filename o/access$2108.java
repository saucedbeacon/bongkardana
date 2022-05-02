package o;

import id.dana.sendmoney.model.RecipientModel;
import java.util.ArrayList;
import java.util.List;

public final class access$2108 extends setSpeed<List<getMonitorToken>, List<RecipientModel>> {
    public final /* synthetic */ Object apply(Object obj) {
        return getMin((List) obj, 2);
    }

    public final /* synthetic */ Object map(Object obj) {
        return getMin((List) obj, 2);
    }

    public static List<RecipientModel> getMin(List<getMonitorToken> list, int i) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (getMonitorToken next : list) {
                RecipientModel recipientModel = null;
                if (next != null) {
                    RecipientModel.length length = new RecipientModel.length(i != 2 ? "contact" : "recentContacts");
                    length.toFloatRange = next.getNumber();
                    length.isInside = next.getName();
                    length.getMin = next.getAlias();
                    length.IsOverlapping = next.getImageUrl();
                    length.equals = next.getInstLocalName();
                    length.toIntRange = next.getNumber();
                    length.Mean$Arithmetic = next.getSenderName();
                    length.FastBitmap$CoordinateSystem = "phonenumber";
                    length.Grayscale$Algorithm = next.getId();
                    length.values = next.getPayMethod();
                    length.toDoubleRange = next.getPayOption();
                    length.invoke = next.getCardIndexNo();
                    length.getCause = next.getPrefix();
                    length.invokeSuspend = true;
                    recipientModel = length.length();
                }
                arrayList.add(recipientModel);
            }
        }
        return arrayList;
    }
}
