package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.sendmoney_v2.x2l.model.SocialLinkModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.PhotoBrowseView;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001a\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¨\u0006\u0011"}, d2 = {"Lid/dana/sendmoney_v2/x2l/SocialLinkViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/sendmoney_v2/x2l/model/SocialLinkModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "loadImage", "url", "", "placeholder", "", "setSubtitle", "text", "setTitle", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class toggleFinish extends Ignore<SocialLinkModel> {
    public final /* synthetic */ void setMax(Object obj) {
        int i;
        SocialLinkModel socialLinkModel = (SocialLinkModel) obj;
        Intrinsics.checkNotNullParameter(socialLinkModel, "data");
        Context context = this.length;
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        String max = SocialLinkModel.setMax(context, socialLinkModel.length);
        String str = "";
        if (max == null) {
            max = str;
        }
        int i2 = 0;
        if (max != null) {
            i = max.length();
        } else {
            i = 0;
        }
        int max2 = dispatchOnCancelled.setMax(i);
        if (i != max2) {
            onCanceled oncanceled = new onCanceled(i, max2, 1);
            onCancelLoad.setMax(-921660234, oncanceled);
            onCancelLoad.getMin(-921660234, oncanceled);
        }
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(resetInternal.setMax.launchQuerySearch);
        if (appCompatTextView != null) {
            CharSequence charSequence = max;
            appCompatTextView.setVisibility(StringsKt.isBlank(charSequence) ^ true ? 0 : 8);
            appCompatTextView.setText(charSequence);
        }
        Context context2 = this.length;
        Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        String max3 = SocialLinkModel.setMax(context2, socialLinkModel.getMin);
        if (max3 != null) {
            str = max3;
        }
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) view2.findViewById(resetInternal.setMax.onActionViewCollapsed);
        if (appCompatTextView2 != null) {
            View view3 = appCompatTextView2;
            CharSequence charSequence2 = str;
            if (!(!StringsKt.isBlank(charSequence2))) {
                i2 = 8;
            }
            view3.setVisibility(i2);
            appCompatTextView2.setText(charSequence2);
        }
        String str2 = socialLinkModel.setMin;
        PhotoBrowseView.AnonymousClass1 r1 = PhotoBrowseView.AnonymousClass1.setMax;
        int max4 = PhotoBrowseView.AnonymousClass1.setMax(socialLinkModel.setMax);
        View view4 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view4, "itemView");
        AppCompatImageView appCompatImageView = (AppCompatImageView) view4.findViewById(resetInternal.setMax.setSupportProgressBarVisibility);
        if (appCompatImageView != null) {
            ((updateCornerMarking) Glide.getMax(appCompatImageView.getContext())).setMax(str2).setMax(evaluate.setMin).setMax((getTopSortedChildren<?>) isLineVisible.getMax()).setMax(max4).setMin(max4).length((ImageView) appCompatImageView);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public toggleFinish(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_social_link, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }
}
