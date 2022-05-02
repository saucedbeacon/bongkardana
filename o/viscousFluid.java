package o;

import id.dana.sendmoney.model.RecentBankModel;
import id.dana.sendmoney.model.RecipientViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\u0013\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/sendmoney_v2/recipient/decorator/SearchBankDecorator;", "Lid/dana/sendmoney/recipient/decorator/recipient/RecipientDecorator;", "recipient", "Lid/dana/sendmoney/recipient/decorator/recipient/Recipient;", "recentBankModels", "", "Lid/dana/sendmoney/model/RecentBankModel;", "filter", "", "(Lid/dana/sendmoney/recipient/decorator/recipient/Recipient;Ljava/util/List;Ljava/lang/String;)V", "checkSearchBankInput", "", "getBankAccounts", "", "getNoBankFoundModel", "Lid/dana/sendmoney/model/RecipientViewModel;", "getRecipientViewModels", "", "getSendNewAccountNumberSection", "setSection", "bankModels", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class viscousFluid extends getPhotoGroupIndex {
    @NotNull
    public static final setMin setMax = new setMin((byte) 0);
    private final getMediaSubType length;

    public viscousFluid(@NotNull getMediaSubType getmediasubtype, @NotNull List<RecentBankModel> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(getmediasubtype, "recipient");
        Intrinsics.checkNotNullParameter(list, "recentBankModels");
        Intrinsics.checkNotNullParameter(str, "filter");
        this.length = getmediasubtype;
        if (setMin(str)) {
            length(new RecipientViewModel(20));
            length(new RecipientViewModel(12, str));
            return;
        }
        CharSequence charSequence = str;
        if (!(charSequence.length() > 0) || !list.isEmpty()) {
            if (charSequence.length() == 0) {
                length(new RecipientViewModel(22));
                return;
            }
            saveImageToPhotosAlbum saveimagetophotosalbum = new saveImageToPhotosAlbum();
            saveimagetophotosalbum.getMax = true;
            List list2 = (List) saveimagetophotosalbum.apply(list);
            Intrinsics.checkNotNullExpressionValue(list2, "bankModels");
            if (!list2.isEmpty()) {
                list2.add(0, new RecipientViewModel(20));
            }
            setMax(list2);
            return;
        }
        length(new RecipientViewModel(22));
    }

    private static boolean setMin(String str) {
        return isOriginHasAppInfo.isShowAccountNumber(str) && str.length() >= 4;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/sendmoney_v2/recipient/decorator/SearchBankDecorator$Companion;", "", "()V", "MIN_LENGTH_INPUT_SEARCH_BANK_FILTER", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }
}
