package o;

import id.dana.R;
import id.dana.sendmoney.model.RecentBankModel;
import id.dana.sendmoney.model.RecipientViewModel;
import id.dana.sendmoney_v2.recipient.model.EmptyStateViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lid/dana/sendmoney_v2/recipient/decorator/BankDecorator;", "Lid/dana/sendmoney/recipient/decorator/recipient/RecipientDecorator;", "recipient", "Lid/dana/sendmoney/recipient/decorator/recipient/Recipient;", "recentBankModels", "", "Lid/dana/sendmoney/model/RecentBankModel;", "isSearching", "", "filter", "", "(Lid/dana/sendmoney/recipient/decorator/recipient/Recipient;Ljava/util/List;ZLjava/lang/String;)V", "getNoBankFoundModel", "Lid/dana/sendmoney_v2/recipient/model/EmptyStateViewModel;", "getNoRecentBankModel", "getRecipientViewModels", "", "Lid/dana/sendmoney/model/RecipientViewModel;", "getSendNewAccountNumberSection", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setFinalPosition extends getPhotoGroupIndex {
    private final getMediaSubType length;

    public setFinalPosition(@NotNull getMediaSubType getmediasubtype, @NotNull List<RecentBankModel> list, boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(getmediasubtype, "recipient");
        Intrinsics.checkNotNullParameter(list, "recentBankModels");
        Intrinsics.checkNotNullParameter(str, "filter");
        this.length = getmediasubtype;
        if (isOriginHasAppInfo.isValidShowAccountNumber(str)) {
            length(new RecipientViewModel(12, str));
        } else if (z && list.isEmpty()) {
            length(new EmptyStateViewModel(18, R.drawable.ic_illustration_search_empty, R.string.recipient_not_found_title, R.string.recipient_not_found_desc));
        } else if (list.isEmpty()) {
            length(new EmptyStateViewModel(17, R.drawable.ic_illustration_recent_bank_empty, R.string.bank_empty_title, R.string.bank_empty_desc, R.string.bank_empty_action_text, true));
        } else {
            setMax((List) new saveImageToPhotosAlbum().apply(list));
        }
    }

    @NotNull
    public final List<RecipientViewModel> getMin() {
        List<RecipientViewModel> min = this.length.getMin();
        List list = this.getMax;
        Intrinsics.checkNotNullExpressionValue(list, "recipientViewModels");
        min.addAll(list);
        Intrinsics.checkNotNullExpressionValue(min, "recipient.recipientViewM…ientViewModels)\n        }");
        return min;
    }
}
