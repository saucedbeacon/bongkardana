package o;

import android.content.ContentResolver;
import id.dana.sendmoney.contact.provider.ContactProvider;
import id.dana.sendmoney.model.RecentBankModel;
import id.dana.sendmoney.model.RecipientViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.OverScrollerCopyed;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0016J$\u0010\u001e\u001a\u001e\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001c0\u001c\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001d0\u001d0\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0$H\u0016J\b\u0010%\u001a\u00020&H\u0002J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0$H\u0002J\u0010\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020*H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015¨\u0006+"}, d2 = {"Lid/dana/sendmoney_v2/recipient/datasource/SearchDataSourceFactory;", "Lid/dana/sendmoney_v2/recipient/datasource/RecipientDataSourceFactory;", "contentResolver", "Landroid/content/ContentResolver;", "(Landroid/content/ContentResolver;)V", "getContentResolver", "()Landroid/content/ContentResolver;", "hasPermission", "", "getHasPermission", "()Z", "setHasPermission", "(Z)V", "isContactEmpty", "setContactEmpty", "recentBankModels", "", "Lid/dana/sendmoney/model/RecentBankModel;", "getRecentBankModels", "()Ljava/util/List;", "setRecentBankModels", "(Ljava/util/List;)V", "recentRecipientModels", "Lid/dana/sendmoney/model/RecentRecipientModel;", "getRecentRecipientModels", "setRecentRecipientModels", "create", "Landroidx/paging/DataSource;", "", "Lid/dana/sendmoney/model/RecipientViewModel;", "getContactDataSource", "kotlin.jvm.PlatformType", "Lid/dana/sendmoney/contact/provider/ContactDataSource;", "contactProvider", "Lid/dana/sendmoney/contact/provider/ContactProvider;", "getItemsToBeDisplayed", "", "getNoContactFoundDataSource", "Lid/dana/sendmoney/contact/provider/NoContactDataSource;", "getRecipient", "getSendWithPhoneNumberDataSource", "filter", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class updateScroll extends OverScrollerCopyed.SplineOverScroller {
    @NotNull
    public List<RecentBankModel> getMax = CollectionsKt.emptyList();
    @NotNull
    public List<? extends increaseCount> getMin = CollectionsKt.emptyList();
    @NotNull
    private final ContentResolver isInside;
    private boolean length;
    public boolean setMin;

    public updateScroll(@NotNull ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.isInside = contentResolver;
    }

    @NotNull
    public final removeItemAtInt<Integer, RecipientViewModel> setMin() {
        if (isOriginHasAppInfo.isValidShowPhoneNumber(getMin())) {
            String min = getMin();
            this.length = false;
            List<RecipientViewModel> length2 = length();
            length2.add(new RecipientViewModel(21, min));
            length2.add(new RecipientViewModel(8, min));
            return new acquirePermissions(length2);
        } else if (!this.setMin) {
            return new acquirePermissions(length());
        } else {
            if (!(getMin().length() > 0)) {
                return setMax();
            }
            ContactProvider contactProvider = new ContactProvider(this.isInside, getMin());
            if (contactProvider.setMax()) {
                return setMax();
            }
            this.length = false;
            List<RecipientViewModel> length3 = length();
            length3.add(new RecipientViewModel(21, getMin()));
            return new requireVideoPermission(contactProvider, length3, (List<String>) null, 0);
        }
    }

    @NotNull
    private List<RecipientViewModel> length() {
        return new viscousFluid(new PhotoBrowseView(new continueWhenFinished(new getMediaSubType(), false), this.getMin, getMin(), this.length), this.getMax, getMin()).getMin();
    }

    private final acquirePermissions setMax() {
        this.length = true;
        List<RecipientViewModel> length2 = length();
        length2.add(new RecipientViewModel(22));
        Unit unit = Unit.INSTANCE;
        return new acquirePermissions(length2);
    }
}
