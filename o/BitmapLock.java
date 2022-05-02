package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.richview.HideableBalanceView;
import id.dana.savings.model.SavingCategoryModel;
import id.dana.savings.model.SavingModel;
import id.dana.scanner.ScannerFragment;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import o.CameraView;
import o.resetInternal;
import o.setH5Page;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0002J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0015H\u0002J\u0014\u0010\r\u001a\u00020\u000b*\u00020\u00192\u0006\u0010\f\u001a\u00020\u0002H\u0002¨\u0006\u001a"}, d2 = {"Lid/dana/savings/viewholder/SavingViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/savings/model/SavingModel;", "context", "Landroid/content/Context;", "resource", "", "parent", "Landroid/view/ViewGroup;", "(Landroid/content/Context;ILandroid/view/ViewGroup;)V", "bindData", "", "data", "setIcon", "setProgressBar", "setProgressBarVisibility", "isAchieved", "", "setProgressDesc", "setSavingBalance", "amount", "", "isSavingBalanceVisible", "setTitle", "title", "Landroidx/appcompat/widget/AppCompatImageView;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BitmapLock extends Ignore<SavingModel> {

    public final class ImageHandler implements setH5Page.getMax {
        private final ScannerFragment getMax;

        public ImageHandler(ScannerFragment scannerFragment) {
            this.getMax = scannerFragment;
        }

        public final void onFinish() {
            ScannerFragment.Grayscale$Algorithm(this.getMax);
        }
    }

    public final /* synthetic */ void setMax(Object obj) {
        double d;
        SavingModel savingModel = (SavingModel) obj;
        if (savingModel != null) {
            boolean min = CameraView.WrapperListener.getMin(savingModel);
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(resetInternal.setMax.getHorizontalMargins);
            int i = 8;
            if (textView != null) {
                textView.setVisibility(min ? 8 : 0);
            }
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(resetInternal.setMax.constrain);
            if (textView2 != null) {
                if (min) {
                    i = 0;
                }
                textView2.setVisibility(i);
            }
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            ProgressBar progressBar = (ProgressBar) view3.findViewById(resetInternal.setMax.ActionBarOverlayLayout);
            long j = 0;
            String str = "0";
            if (progressBar != null) {
                Intrinsics.checkNotNullParameter(savingModel, "$this$getDisplayDetailAmountPercentage");
                String cleanAll = isOriginHasAppInfo.getCleanAll(savingModel.length.setMin);
                if (cleanAll == null) {
                    cleanAll = str;
                }
                Long longOrNull = StringsKt.toLongOrNull(cleanAll);
                if ((longOrNull != null ? longOrNull.longValue() : 0) <= 0) {
                    d = 1.0d;
                } else {
                    Intrinsics.checkNotNullParameter(savingModel, "$this$getAmountPercentage");
                    String cleanAll2 = isOriginHasAppInfo.getCleanAll(savingModel.length.setMin);
                    if (cleanAll2 == null) {
                        cleanAll2 = str;
                    }
                    Long longOrNull2 = StringsKt.toLongOrNull(cleanAll2);
                    long longValue = (longOrNull2 != null ? longOrNull2.longValue() : 0) * 100;
                    String cleanAll3 = isOriginHasAppInfo.getCleanAll(savingModel.setMax.setMin);
                    if (cleanAll3 == null) {
                        cleanAll3 = str;
                    }
                    Long longOrNull3 = StringsKt.toLongOrNull(cleanAll3);
                    d = (double) (longValue / (longOrNull3 != null ? longOrNull3.longValue() : 0));
                }
                progressBar.setProgress(MathKt.roundToInt(d));
            }
            if (!CameraView.WrapperListener.getMin(savingModel)) {
                View view4 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                TextView textView3 = (TextView) view4.findViewById(resetInternal.setMax.getHorizontalMargins);
                if (textView3 != null) {
                    String string = this.length.getString(R.string.progress1);
                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.progress1)");
                    Object[] objArr = new Object[1];
                    Intrinsics.checkNotNullParameter(savingModel, "$this$getAmountPercentage");
                    String cleanAll4 = isOriginHasAppInfo.getCleanAll(savingModel.length.setMin);
                    if (cleanAll4 == null) {
                        cleanAll4 = str;
                    }
                    Long longOrNull4 = StringsKt.toLongOrNull(cleanAll4);
                    long longValue2 = (longOrNull4 != null ? longOrNull4.longValue() : 0) * 100;
                    String cleanAll5 = isOriginHasAppInfo.getCleanAll(savingModel.setMax.setMin);
                    if (cleanAll5 == null) {
                        cleanAll5 = str;
                    }
                    Long longOrNull5 = StringsKt.toLongOrNull(cleanAll5);
                    objArr[0] = Integer.valueOf(MathKt.roundToInt((double) (longValue2 / (longOrNull5 != null ? longOrNull5.longValue() : 0))));
                    String format = String.format(string, Arrays.copyOf(objArr, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
                    textView3.setText(format);
                }
                View view5 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                HideableBalanceView hideableBalanceView = (HideableBalanceView) view5.findViewById(resetInternal.setMax.setTitleMarginEnd);
                if (hideableBalanceView != null) {
                    hideableBalanceView.setTextSize(2, 14.0f);
                    hideableBalanceView.setTextColor(IntRange.setMax(hideableBalanceView.getContext(), R.color.f23952131100331));
                    String cleanAll6 = isOriginHasAppInfo.getCleanAll(savingModel.setMax.setMin);
                    if (cleanAll6 == null) {
                        cleanAll6 = str;
                    }
                    hideableBalanceView.setAmount(cleanAll6);
                    hideableBalanceView.setTextAppearance(R.style.f78092131951863);
                    hideableBalanceView.setBalanceVisibility(savingModel.getMin());
                }
            }
            String str2 = savingModel.getMin;
            View view6 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view6, "itemView");
            TextView textView4 = (TextView) view6.findViewById(resetInternal.setMax.CustomTabsIntent$ShareState);
            if (textView4 != null) {
                textView4.setText(str2);
            }
            View view7 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view7, "itemView");
            AppCompatImageView appCompatImageView = (AppCompatImageView) view7.findViewById(resetInternal.setMax.setDither);
            if (appCompatImageView != null) {
                updateCornerMarking updatecornermarking = (updateCornerMarking) Glide.getMax(appCompatImageView.getContext());
                Intrinsics.checkNotNullParameter(savingModel, "$this$getIconBasedOnCompletion");
                String str3 = null;
                if (CameraView.WrapperListener.getMin(savingModel)) {
                    SavingCategoryModel savingCategoryModel = savingModel.toIntRange;
                    if (savingCategoryModel != null) {
                        str3 = savingCategoryModel.toFloatRange;
                    }
                } else {
                    SavingCategoryModel savingCategoryModel2 = savingModel.toIntRange;
                    if (savingCategoryModel2 != null) {
                        str3 = savingCategoryModel2.getMax(CameraView.WrapperListener.getMax(savingModel));
                    }
                }
                if (str3 == null) {
                    str3 = "";
                }
                updatecornermarking.setMax(str3).setMax((int) R.drawable.dana_logo_blue).setMin((updatePostLayout<Bitmap>) new setDpMargin()).setMin((int) R.drawable.dana_logo_blue).length((ImageView) appCompatImageView);
            }
            String cleanAll7 = isOriginHasAppInfo.getCleanAll(savingModel.length.setMin);
            if (cleanAll7 != null) {
                str = cleanAll7;
            }
            Long longOrNull6 = StringsKt.toLongOrNull(str);
            if (longOrNull6 != null) {
                j = longOrNull6.longValue();
            }
            String valueOf = String.valueOf(j);
            boolean min2 = savingModel.getMin();
            View view8 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view8, "itemView");
            HideableBalanceView hideableBalanceView2 = (HideableBalanceView) view8.findViewById(resetInternal.setMax.getTitleMarginEnd);
            if (hideableBalanceView2 != null) {
                hideableBalanceView2.setTextSize(2, 14.0f);
                hideableBalanceView2.setTextColor(IntRange.setMax(hideableBalanceView2.getContext(), 17170444));
                hideableBalanceView2.setAmount(valueOf);
                hideableBalanceView2.setBalanceVisibility(min2);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BitmapLock(@NotNull Context context, @NotNull ViewGroup viewGroup) {
        super(context, R.layout.item_saving, viewGroup);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }
}
