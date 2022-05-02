package o;

import android.content.ContentResolver;
import androidx.annotation.StringRes;
import id.dana.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.OverScrollerCopyed;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00152\u00020\u0001:\u0004\u0013\u0014\u0015\u0016B-\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H&R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u0001\u0003\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lid/dana/sendmoney_v2/recipient/view/RecipientSourceType;", "", "title", "", "newRecipientText", "searchHint", "scanIconVisibility", "", "(IIIZ)V", "getNewRecipientText", "()I", "getScanIconVisibility", "()Z", "getSearchHint", "getTitle", "getRecipientDataSourceFactory", "Lid/dana/sendmoney_v2/recipient/datasource/RecipientDataSourceFactory;", "contentResolver", "Landroid/content/ContentResolver;", "All", "Bank", "Companion", "Contact", "Lid/dana/sendmoney_v2/recipient/view/RecipientSourceType$Contact;", "Lid/dana/sendmoney_v2/recipient/view/RecipientSourceType$Bank;", "Lid/dana/sendmoney_v2/recipient/view/RecipientSourceType$All;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class setBundle {
    @NotNull
    public static final setMax setMax = new setMax((byte) 0);
    public final int getMax;
    private final boolean getMin;
    public final int length;
    private final int setMin;

    @NotNull
    public abstract OverScrollerCopyed.SplineOverScroller getMax(@NotNull ContentResolver contentResolver);

    private setBundle(@StringRes int i, @StringRes int i2, @StringRes int i3, boolean z) {
        this.setMin = i;
        this.getMax = i2;
        this.length = i3;
        this.getMin = z;
    }

    public /* synthetic */ setBundle(int i, int i2, int i3, boolean z, byte b) {
        this(i, i2, i3, z);
    }

    public final boolean setMax() {
        return this.getMin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lid/dana/sendmoney_v2/recipient/view/RecipientSourceType$Contact;", "Lid/dana/sendmoney_v2/recipient/view/RecipientSourceType;", "()V", "getRecipientDataSourceFactory", "Lid/dana/sendmoney_v2/recipient/datasource/ContactDataSourceFactory;", "contentResolver", "Landroid/content/ContentResolver;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends setBundle {
        @NotNull
        public static final getMax setMin = new getMax();

        private getMax() {
            super(R.string.recent_transfer, R.string.enter_new_number, R.string.search_phone_number, true, (byte) 0);
        }

        public final /* synthetic */ OverScrollerCopyed.SplineOverScroller getMax(ContentResolver contentResolver) {
            Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
            return new timePassed(contentResolver);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lid/dana/sendmoney_v2/recipient/view/RecipientSourceType$Bank;", "Lid/dana/sendmoney_v2/recipient/view/RecipientSourceType;", "()V", "getRecipientDataSourceFactory", "Lid/dana/sendmoney_v2/recipient/datasource/BankDataSourceFactory;", "contentResolver", "Landroid/content/ContentResolver;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends setBundle {
        @NotNull
        public static final getMin getMin = new getMin();

        private getMin() {
            super(R.string.recent_transaction, R.string.enter_new_bank, R.string.search_bank_account, true, (byte) 0);
        }

        public final /* synthetic */ OverScrollerCopyed.SplineOverScroller getMax(ContentResolver contentResolver) {
            Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
            return new isScrollingInDirection(contentResolver);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lid/dana/sendmoney_v2/recipient/view/RecipientSourceType$All;", "Lid/dana/sendmoney_v2/recipient/view/RecipientSourceType;", "()V", "getRecipientDataSourceFactory", "Lid/dana/sendmoney_v2/recipient/datasource/RecipientDataSourceFactory;", "contentResolver", "Landroid/content/ContentResolver;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends setBundle {
        @NotNull
        public static final setMin getMin = new setMin();

        private setMin() {
            super(R.string.searching, R.string.enter_new_number, R.string.search_name_bank_or_phone_number, false, (byte) 0);
        }

        @NotNull
        public final OverScrollerCopyed.SplineOverScroller getMax(@NotNull ContentResolver contentResolver) {
            Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
            return new updateScroll(contentResolver);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/sendmoney_v2/recipient/view/RecipientSourceType$Companion;", "", "()V", "get", "Lid/dana/sendmoney_v2/recipient/view/RecipientSourceType;", "recipientType", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }
}
