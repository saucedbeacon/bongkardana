package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.model.ThirdPartyService;
import id.dana.richview.category.model.CategoryModel;
import id.dana.richview.socialshare.SocialShareView;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.CornerMarkingDataProvider;
import o.RewriteQueriesToDropUnusedColumns;
import o.onDelete;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class OrientationDetector implements View.OnClickListener {
    public static final OrientationDetector setMax = new OrientationDetector();

    public final class MySensorEventListener implements View.OnClickListener {
        private final findBestPreviewSizeValue length;
        private final SocialShareView setMin;

        public MySensorEventListener(SocialShareView socialShareView, findBestPreviewSizeValue findbestpreviewsizevalue) {
            this.setMin = socialShareView;
            this.length = findbestpreviewsizevalue;
        }

        public final void onClick(View view) {
            this.setMin.shareToSocialApp(this.length.getMax);
        }
    }

    public interface MyTabOrientationListener {

        public interface length extends onDelete.length {
            void onSuccessGetSocialMediaCategoryShare(List<String> list);
        }

        public interface setMin extends onDelete.getMin {
            void setMin();
        }
    }

    public final void onClick(View view) {
        onOrientationChanged.setMax();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007J\b\u0010\u000b\u001a\u00020\fH\u0002J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/richview/servicescard/mapper/ServiceCategoryMapper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getChipTitle", "", "chipKey", "defaultValue", "getCleanCategory", "key", "getDefaultCategory", "Lid/dana/richview/category/model/CategoryModel;", "transform", "", "categories", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class OrientationListener {
        private final Context length;

        @Inject
        public OrientationListener(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            this.length = context;
        }

        @NotNull
        public final List<CategoryModel> getMin(@Nullable List<String> list) {
            List<CategoryModel> arrayList = new ArrayList<>();
            CategoryModel categoryModel = new CategoryModel();
            categoryModel.getMin = this.length.getString(R.string.category_all);
            categoryModel.toFloatRange = 1;
            categoryModel.getMax = true;
            arrayList.add(categoryModel);
            for (String str : list) {
                CategoryModel categoryModel2 = new CategoryModel();
                categoryModel2.setMin = str;
                categoryModel2.getMin = getMax(str);
                String replaceFirst$default = StringsKt.replaceFirst$default(str, "category", "chip", false, 4, (Object) null);
                String str2 = categoryModel2.getMin;
                CornerMarkingDataProvider.AnonymousClass3 r5 = CornerMarkingDataProvider.AnonymousClass3.setMin;
                int max = CornerMarkingDataProvider.AnonymousClass3.getMax(this.length, replaceFirst$default);
                if (max > 0) {
                    str2 = this.length.getString(max);
                }
                categoryModel2.setMax = str2;
                categoryModel2.toFloatRange = 1;
                Unit unit = Unit.INSTANCE;
                arrayList.add(categoryModel2);
            }
            return arrayList;
        }

        @NotNull
        @SuppressLint({"DefaultLocale"})
        public final String getMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "key");
            CornerMarkingDataProvider.AnonymousClass3 r0 = CornerMarkingDataProvider.AnonymousClass3.setMin;
            int max = CornerMarkingDataProvider.AnonymousClass3.getMax(this.length, str);
            if (max > 0) {
                String string = this.length.getString(max);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(stringId)");
                return string;
            }
            Regex regex = new Regex("category_");
            return StringsKt.capitalize(new Regex("_").replace((CharSequence) regex.replaceFirst(str, ""), " "));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u0016\u001a\u00020\bH\u0002J\b\u0010\u0017\u001a\u00020\bH\u0002J\u0012\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u001e"}, d2 = {"Lid/dana/richview/servicescard/adapter/viewholder/ServiceViewHolder;", "Lid/dana/richview/servicescard/adapter/viewholder/DefaultServiceViewHolder;", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "bindData", "", "data", "Lid/dana/model/ThirdPartyService;", "loadPngImageToIconImageView", "url", "", "defaultIconDrawableId", "", "loadSvgImageToIconImageView", "imageUrl", "setDefaultServiceIcon", "setFeatureServiceIcon", "setMobileRechargeAccessibility", "userAction", "setMoreServiceAccessibility", "setMoreServiceIcon", "setRibbonText", "ribbonText", "setTitle", "title", "setViewServiceAttribute", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class MyOrientationEventListener extends getDevOrientation {
        @NotNull
        public static final getMin getMin = new getMin((byte) 0);

        public final /* synthetic */ void setMax(Object obj) {
            ThirdPartyService thirdPartyService = (ThirdPartyService) obj;
            Intrinsics.checkNotNullParameter(thirdPartyService, "data");
            String min = setMin(thirdPartyService);
            if (min != null) {
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                TextView textView = (TextView) view.findViewById(resetInternal.setMax.BinderThread);
                if (textView != null) {
                    textView.setText(min);
                }
            }
            int i = thirdPartyService.values;
            if (i != 1) {
                String str = "";
                if (i != 2) {
                    String str2 = thirdPartyService.toFloatRange;
                    int max = setMax(thirdPartyService.isInside);
                    if (RewriteQueriesToDropUnusedColumns.setMax(str2)) {
                        if (str2 != null) {
                            str = str2;
                        }
                        setMin(str);
                    } else {
                        if (str2 != null) {
                            str = str2;
                        }
                        getMax(str, max);
                    }
                    getMax(thirdPartyService);
                    return;
                }
                String str3 = thirdPartyService.toFloatRange;
                int max2 = setMax(thirdPartyService.isInside);
                if (RewriteQueriesToDropUnusedColumns.setMax(str3)) {
                    if (str3 != null) {
                        str = str3;
                    }
                    setMin(str);
                } else {
                    if (str3 != null) {
                        str = str3;
                    }
                    getMax(str, max2);
                }
                getMax(thirdPartyService);
                return;
            }
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            ImageView imageView = (ImageView) view2.findViewById(resetInternal.setMax.IntentSenderRequest);
            if (imageView != null) {
                imageView.setImageResource(R.drawable.ic_more);
            }
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            ConstraintLayout constraintLayout = (ConstraintLayout) view3.findViewById(resetInternal.setMax.onHoverEvent);
            if (constraintLayout != null) {
                constraintLayout.setContentDescription(this.length.getString(R.string.btnViewAllServices));
            }
        }

        public MyOrientationEventListener(@Nullable Context context, @Nullable ViewGroup viewGroup) {
            super(context, R.layout.layout_custom_gridview, viewGroup);
        }

        private final void getMin(String str) {
            CharSequence charSequence = str;
            if (TextUtils.isEmpty(charSequence)) {
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                TextView textView = (TextView) view.findViewById(resetInternal.setMax.AnyRes);
                if (textView != null) {
                    textView.setVisibility(8);
                    return;
                }
                return;
            }
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(resetInternal.setMax.AnyRes);
            if (textView2 != null) {
                textView2.setText(charSequence);
            }
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            TextView textView3 = (TextView) view3.findViewById(resetInternal.setMax.AnyRes);
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
        }

        private final void length(String str) {
            CharSequence charSequence = str;
            if (!(charSequence == null || charSequence.length() == 0) && Intrinsics.areEqual((Object) str, (Object) "mobilerecharge")) {
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(resetInternal.setMax.onHoverEvent);
                if (constraintLayout != null) {
                    constraintLayout.setContentDescription(this.length.getString(R.string.btnMobileRecharge));
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/richview/servicescard/adapter/viewholder/ServiceViewHolder$Companion;", "", "()V", "MOBILE_RECHARGE_TYPE", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMin {
            private getMin() {
            }

            public /* synthetic */ getMin(byte b) {
                this();
            }
        }

        private final void getMax(ThirdPartyService thirdPartyService) {
            getMin(thirdPartyService.Mean$Arithmetic);
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            ImageView imageView = (ImageView) view.findViewById(resetInternal.setMax.ArrayRes);
            int i = 0;
            if (imageView != null) {
                View view2 = imageView;
                boolean min = thirdPartyService.setMin();
                Intrinsics.checkNotNullParameter(view2, "<this>");
                view2.setVisibility(min ? 0 : 8);
            }
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            AppCompatImageView appCompatImageView = (AppCompatImageView) view3.findViewById(resetInternal.setMax.setVisible);
            if (appCompatImageView != null) {
                View view4 = appCompatImageView;
                boolean z = !thirdPartyService.getMax();
                Intrinsics.checkNotNullParameter(view4, "<this>");
                if (!z) {
                    i = 8;
                }
                view4.setVisibility(i);
            }
            length(thirdPartyService.hashCode);
        }

        private final void setMin(String str) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(422616797, oncanceled);
                onCancelLoad.getMin(422616797, oncanceled);
            }
            RewriteQueriesToDropUnusedColumns.getMax getmax = new RewriteQueriesToDropUnusedColumns.getMax(this.length, (byte) 0);
            getmax.getMin = str;
            getmax.setMax = R.drawable.service_skeleton_circle;
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            getmax.setMin = (ImageView) view.findViewById(resetInternal.setMax.IntentSenderRequest);
            new RewriteQueriesToDropUnusedColumns(getmax, (byte) 0);
        }

        private final void getMax(String str, @DrawableRes int i) {
            updateMessageMenuItem<Drawable> min = ((updateCornerMarking) Glide.getMax(this.length)).setMax(str).setMax((int) R.drawable.service_skeleton_circle).setMin(i);
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            min.length((ImageView) view.findViewById(resetInternal.setMax.IntentSenderRequest));
        }
    }
}
