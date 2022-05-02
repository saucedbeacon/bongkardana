package o;

import android.content.Context;
import id.dana.sendmoney.RecipientActivity;
import id.dana.splitbill.model.SplitBillModel;
import id.dana.splitbill.view.SplitBillDetailsActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lid/dana/scanner/handler/nativepages/ScannerH5GnMerchantHandler;", "Lid/dana/scanner/handler/nativepages/BaseScannerNativePageHandler;", "context", "Landroid/content/Context;", "scanModel", "Lid/dana/model/ScanModel;", "viewType", "", "(Landroid/content/Context;Lid/dana/model/ScanModel;Ljava/lang/String;)V", "startAction", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class APEncodeResult extends APEncodeOptions {
    public final void setMin() {
    }

    public final class CODE extends APEncodeOptions {
        public CODE(Context context, fillPageCommonInfo fillpagecommoninfo, String str) {
            super(context, fillpagecommoninfo, str);
        }

        public final void setMin() {
            setMax().startActivity(SplitBillDetailsActivity.createIntent(setMax(), (SplitBillModel) new setSingleItemHeight().apply(length())));
        }
    }

    public APEncodeResult(@Nullable Context context, @Nullable fillPageCommonInfo fillpagecommoninfo, @Nullable String str) {
        super(context, fillpagecommoninfo, str);
    }

    public final class EXTRA implements RedDotManager {
        private final RecipientActivity.AnonymousClass1 getMax;
        private final PhotoSelectListener getMin;

        public EXTRA(RecipientActivity.AnonymousClass1 r1, PhotoSelectListener photoSelectListener) {
            this.getMax = r1;
            this.getMin = photoSelectListener;
        }

        public final void accept(Object obj) {
            this.getMax.setMax(this.getMin);
        }
    }
}
