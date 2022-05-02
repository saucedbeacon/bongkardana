package o;

import id.dana.sendmoney.model.RecipientViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lid/dana/sendmoney_v2/recipient/decorator/SearchDecorator;", "Lid/dana/sendmoney/recipient/decorator/recipient/RecipientDecorator;", "recipient", "Lid/dana/sendmoney/recipient/decorator/recipient/Recipient;", "isSearching", "", "(Lid/dana/sendmoney/recipient/decorator/recipient/Recipient;Z)V", "getRecipient", "()Lid/dana/sendmoney/recipient/decorator/recipient/Recipient;", "getRecipientViewModels", "", "Lid/dana/sendmoney/model/RecipientViewModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class continueWhenFinished extends getPhotoGroupIndex {
    @NotNull
    private final getMediaSubType length;

    public continueWhenFinished(@NotNull getMediaSubType getmediasubtype, boolean z) {
        Intrinsics.checkNotNullParameter(getmediasubtype, "recipient");
        this.length = getmediasubtype;
        if (z) {
            length(new RecipientViewModel(7));
        }
    }

    @NotNull
    public final List<RecipientViewModel> getMin() {
        List<RecipientViewModel> min = this.length.getMin();
        List list = this.getMax;
        Intrinsics.checkNotNullExpressionValue(list, "recipientViewModels");
        if (!list.isEmpty()) {
            List list2 = this.getMax;
            Intrinsics.checkNotNullExpressionValue(list2, "recipientViewModels");
            min.addAll(list2);
        }
        Intrinsics.checkNotNullExpressionValue(min, "recipient.recipientViewM…ientViewModels)\n        }");
        return min;
    }
}
