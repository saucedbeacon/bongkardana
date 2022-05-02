package o;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.IMultiInstanceInvalidationCallback;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0002J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lid/dana/paymentsetting/adapter/PaymentSettingOnboardingAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/paymentsetting/viewholder/PaymentSettingViewHolder;", "Lid/dana/paymentsetting/model/PaymentSettingOnboardingModel;", "context", "Landroid/content/Context;", "onNextPage", "Lkotlin/Function1;", "", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "getDefaultOnboardingData", "", "nextPosition", "currentPosition", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class uploadFile extends IMultiInstanceInvalidationCallback.Stub<PdfSourceManager, getOrCreate> {
    /* access modifiers changed from: private */
    public final Function1<Integer, Unit> length;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ uploadFile this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(uploadFile uploadfile) {
            super(1);
            this.this$0 = uploadfile;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            this.this$0.length.invoke(Integer.valueOf(uploadFile.getMin(this.this$0, i)));
        }
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new PdfSourceManager(viewGroup, new getMin(this));
    }

    public uploadFile(@NotNull Context context, @NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(function1, "onNextPage");
        this.length = function1;
        String string = context.getString(R.string.payment_setting_bottomsheet_content_title_1);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…tomsheet_content_title_1)");
        String string2 = context.getString(R.string.payment_setting_bottomsheet_content_desc_1);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…ttomsheet_content_desc_1)");
        String string3 = context.getString(R.string.payment_setting_bottomsheet_content_title_2);
        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…tomsheet_content_title_2)");
        String string4 = context.getString(R.string.payment_setting_bottomsheet_content_desc_2);
        Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…ttomsheet_content_desc_2)");
        String string5 = context.getString(R.string.payment_setting_bottomsheet_content_title_3);
        Intrinsics.checkNotNullExpressionValue(string5, "context.getString(R.stri…tomsheet_content_title_3)");
        String string6 = context.getString(R.string.payment_setting_bottomsheet_content_desc_3);
        Intrinsics.checkNotNullExpressionValue(string6, "context.getString(R.stri…ttomsheet_content_desc_3)");
        getMin(CollectionsKt.listOf(new getOrCreate(R.drawable.on_boarding_dana_protection, string, string2), new getOrCreate(R.drawable.on_boarding_world_class_security, string3, string4), new getOrCreate(R.drawable.on_boarding_hashtag, string5, string6)));
    }

    public static final /* synthetic */ int getMin(uploadFile uploadfile, int i) {
        return (i + 1) % uploadfile.getMax().size();
    }
}
