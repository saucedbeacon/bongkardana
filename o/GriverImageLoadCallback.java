package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.richview.CircleImageSelectionView;
import id.dana.savings.model.SavingCategoryModel;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CornerMarkingDataProvider;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\f\u0010\u0012\u001a\u00020\u000e*\u00020\u0002H\u0002J\u001e\u0010\u0013\u001a\u00020\u000b*\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002¨\u0006\u0018"}, d2 = {"Lid/dana/savings/viewholder/CategoryViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/savings/model/SavingCategoryModel;", "context", "Landroid/content/Context;", "resource", "", "parent", "Landroid/view/ViewGroup;", "(Landroid/content/Context;ILandroid/view/ViewGroup;)V", "bindData", "", "category", "getCategoryConfigId", "", "categoryCode", "getCategoryTitle", "name", "getSelectedUrl", "setImage", "Lid/dana/richview/CircleImageSelectionView;", "url", "isSelected", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverImageLoadCallback extends Ignore<SavingCategoryModel> {
    public final /* synthetic */ void setMax(Object obj) {
        String str;
        SavingCategoryModel savingCategoryModel = (SavingCategoryModel) obj;
        if (savingCategoryModel != null) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(resetInternal.setMax.getLogoDescription);
            if (textView != null) {
                String str2 = savingCategoryModel.getMin;
                Context context = this.length;
                Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
                String min = CornerMarkingDataProvider.AnonymousClass3.setMin(context, str2, str2);
                if (Intrinsics.areEqual((Object) min, (Object) str2)) {
                    if (str2 != null) {
                        String lowerCase = str2.toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                        min = StringsKt.capitalize(lowerCase);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                textView.setText(min);
            }
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            CircleImageSelectionView circleImageSelectionView = (CircleImageSelectionView) view2.findViewById(resetInternal.setMax.setDither);
            if (circleImageSelectionView != null) {
                if (savingCategoryModel.getMin()) {
                    str = savingCategoryModel.setMax;
                } else {
                    str = savingCategoryModel.length;
                }
                boolean min2 = savingCategoryModel.getMin();
                if (circleImageSelectionView != null) {
                    if (min2) {
                        circleImageSelectionView.setCheckTopVisibleState();
                    } else {
                        circleImageSelectionView.setCheckTopInvisibleState();
                    }
                    Context context2 = circleImageSelectionView.getContext();
                    View view3 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                    CircleImageSelectionView circleImageSelectionView2 = (CircleImageSelectionView) view3.findViewById(resetInternal.setMax.setDither);
                    Intrinsics.checkNotNullExpressionValue(circleImageSelectionView2, "itemView.iv_icon");
                    circleImageSelectionView.loadImage(Popup.getMin(context2, str, circleImageSelectionView2.getWidth()), R.drawable.dana_logo_blue);
                }
            }
            View view4 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view4, "itemView");
            LinearLayout linearLayout = (LinearLayout) view4.findViewById(resetInternal.setMax.dispatchMenuItemSelected);
            if (linearLayout != null) {
                String string = this.length.getString(R.string.btnCategory);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.btnCategory)");
                Object[] objArr = new Object[1];
                String str3 = savingCategoryModel.setMin;
                String concat = "saving_".concat(String.valueOf(str3));
                Context context3 = this.length;
                Intrinsics.checkNotNullExpressionValue(context3, HummerConstants.CONTEXT);
                String min3 = CornerMarkingDataProvider.AnonymousClass3.setMin(context3, concat, str3);
                if (Intrinsics.areEqual((Object) min3, (Object) str3)) {
                    if (str3 != null) {
                        String lowerCase2 = str3.toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
                        min3 = StringsKt.capitalize(lowerCase2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                objArr[0] = min3;
                String format = String.format(string, Arrays.copyOf(objArr, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
                linearLayout.setContentDescription(format);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GriverImageLoadCallback(@NotNull Context context, @NotNull ViewGroup viewGroup) {
        super(context, R.layout.item_category, viewGroup);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }
}
