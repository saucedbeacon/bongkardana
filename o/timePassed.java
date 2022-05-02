package o;

import android.content.ContentResolver;
import id.dana.R;
import id.dana.sendmoney.contact.provider.ContactProvider;
import id.dana.sendmoney.model.RecipientViewModel;
import id.dana.sendmoney_v2.recipient.model.EmptyStateViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.OverScrollerCopyed;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0016J$\u0010\u0013\u001a\u001e\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00110\u0011\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00120\u00120\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0002J,\u0010 \u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00120\u0012 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00120\u0012\u0018\u00010!0\u0019H\u0002J\b\u0010\"\u001a\u00020\u001dH\u0002J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\f¨\u0006&"}, d2 = {"Lid/dana/sendmoney_v2/recipient/datasource/ContactDataSourceFactory;", "Lid/dana/sendmoney_v2/recipient/datasource/RecipientDataSourceFactory;", "contentResolver", "Landroid/content/ContentResolver;", "(Landroid/content/ContentResolver;)V", "getContentResolver", "()Landroid/content/ContentResolver;", "hasPermission", "", "getHasPermission", "()Z", "setHasPermission", "(Z)V", "isInitialSearch", "setInitialSearch", "create", "Landroidx/paging/DataSource;", "", "Lid/dana/sendmoney/model/RecipientViewModel;", "getContactDataSource", "kotlin.jvm.PlatformType", "Lid/dana/sendmoney/contact/provider/ContactDataSource;", "contactProvider", "Lid/dana/sendmoney/contact/provider/ContactProvider;", "getItemsToBeDisplayed", "", "getNoContactAvailableDataSource", "Lid/dana/sendmoney/contact/provider/NoContactDataSource;", "getNoContactAvailableViewModel", "Lid/dana/sendmoney_v2/recipient/model/EmptyStateViewModel;", "getNoContactFoundDataSource", "getNoContactFoundModel", "getNoContactPermissionItems", "", "getNoContactPermissionModel", "getSendWithPhoneNumberDataSource", "filter", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class timePassed extends OverScrollerCopyed.SplineOverScroller {
    @NotNull
    private final ContentResolver getMax;
    public boolean getMin;
    public boolean setMin;

    public timePassed(@NotNull ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.getMax = contentResolver;
    }

    @NotNull
    public final removeItemAtInt<Integer, RecipientViewModel> setMin() {
        if (this.getMin) {
            ContactProvider contactProvider = new ContactProvider(this.getMax, getMin());
            if (getMax() && this.setMin) {
                return new acquirePermissions(CollectionsKt.emptyList());
            }
            if (!contactProvider.setMax()) {
                return new requireVideoPermission(contactProvider, length(), (List<String>) null, 0);
            }
            if (getMax() && isOriginHasAppInfo.isValidShowPhoneNumber(getMin())) {
                String min = getMin();
                List<RecipientViewModel> length = length();
                length.add(new RecipientViewModel(8, min));
                return new acquirePermissions(length);
            } else if (getMax()) {
                List<RecipientViewModel> length2 = length();
                length2.add(new EmptyStateViewModel(4, R.drawable.ic_empty_contact_permission, R.string.contact_not_found_title, R.string.contact_not_found_desc));
                Unit unit = Unit.INSTANCE;
                return new acquirePermissions(length2);
            } else {
                List<RecipientViewModel> length3 = length();
                length3.add(new EmptyStateViewModel(19, R.drawable.ic_empty_contact_permission, R.string.contact_not_available_title, R.string.contact_not_available_desc));
                Unit unit2 = Unit.INSTANCE;
                return new acquirePermissions(length3);
            }
        } else {
            List<RecipientViewModel> min2 = new getMediaSubType().getMin();
            min2.add(new EmptyStateViewModel(5, R.drawable.ic_empty_contact_permission, R.string.contact_no_permission_title, R.string.contact_no_permission_desc, R.string.contact_no_permission_action, true));
            return new acquirePermissions(min2);
        }
    }

    @NotNull
    private List<RecipientViewModel> length() {
        return new notifyEdgeReached(new continueWhenFinished(new getMediaSubType(), getMax()), 1, !getMax(), getMin()).getMin();
    }
}
