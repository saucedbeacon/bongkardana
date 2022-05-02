package o;

import id.dana.sendmoney.model.RecipientViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/sendmoney_v2/recipient/decorator/SectionDecorator;", "Lid/dana/sendmoney/recipient/decorator/recipient/RecipientDecorator;", "recipient", "Lid/dana/sendmoney/recipient/decorator/recipient/Recipient;", "recipientSectionType", "", "needToSectionTitle", "", "filter", "", "(Lid/dana/sendmoney/recipient/decorator/recipient/Recipient;IZLjava/lang/String;)V", "getRecipientViewModels", "", "Lid/dana/sendmoney/model/RecipientViewModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class notifyEdgeReached extends getPhotoGroupIndex {
    private getMediaSubType setMin;

    public notifyEdgeReached(@NotNull getMediaSubType getmediasubtype, int i, boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(getmediasubtype, "recipient");
        Intrinsics.checkNotNullParameter(str, "filter");
        this.setMin = getmediasubtype;
        if (z) {
            length(new RecipientViewModel(i, str));
        }
    }

    @NotNull
    public final List<RecipientViewModel> getMin() {
        List<RecipientViewModel> min = this.setMin.getMin();
        List list = this.getMax;
        Intrinsics.checkNotNullExpressionValue(list, "recipientViewModels");
        if (!list.isEmpty()) {
            List list2 = this.getMax;
            Intrinsics.checkNotNullExpressionValue(list2, "recipientViewModels");
            min.addAll(list2);
        }
        Intrinsics.checkNotNullExpressionValue(min, "recipient.recipientViewM…ecipientViewModels)\n    }");
        return min;
    }
}
