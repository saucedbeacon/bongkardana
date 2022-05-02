package o;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.RecipientSource;
import id.dana.sendmoney.model.RecipientViewModel;
import id.dana.sendmoney.recipient.RecipientIdType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0011H\u0002J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0011H\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0011H\u0002J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u0011H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lid/dana/sendmoney_v2/recipient/bank/viewholder/BankViewHolderV2;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/sendmoney/model/RecipientViewModel;", "parent", "Landroid/view/ViewGroup;", "recipientSelectedListener", "Lid/dana/sendmoney/view/RecipientSelectedListener;", "recipientMoreActionListener", "Lid/dana/sendmoney_v2/recipient/view/RecipientMoreActionListener;", "(Landroid/view/ViewGroup;Lid/dana/sendmoney/view/RecipientSelectedListener;Lid/dana/sendmoney_v2/recipient/view/RecipientMoreActionListener;)V", "data", "bindData", "", "onItemClicked", "onItemMoreActionClicked", "setImageLogo", "url", "", "setOnItemClickListener", "onItemClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "setTextViewDescription", "textDescription", "setTextViewPrefix", "textPrefix", "setTextViewTitle", "textTitle", "toRecipientModel", "Lid/dana/sendmoney/model/RecipientModel;", "recipientSource", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setFinalY extends Ignore<RecipientViewModel> {
    /* access modifiers changed from: private */
    public final setOriginText getMax;
    /* access modifiers changed from: private */
    public RecipientViewModel getMin;
    private final PhotoItem setMin;

    public final /* synthetic */ void setMax(Object obj) {
        RecipientViewModel recipientViewModel = (RecipientViewModel) obj;
        if (recipientViewModel != null) {
            this.getMin = recipientViewModel;
            CharSequence charSequence = recipientViewModel.setMin;
            boolean z = false;
            String obj2 = (charSequence == null || charSequence.length() == 0 ? recipientViewModel.setMax() : recipientViewModel.setMin).toString();
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(resetInternal.setMax.launchQuerySearch);
            if (textView != null) {
                textView.setText(obj2.replace("*", "•"));
            }
            String str = recipientViewModel.isInside;
            String str2 = "";
            if (!TextUtils.isEmpty(str)) {
                str = str.replace(" ", str2);
            }
            Object[] objArr = new Object[1];
            if (str.length() >= 4) {
                str = str.substring(str.length() - 4);
            }
            objArr[0] = str;
            String format = String.format("•••• %s", objArr);
            Intrinsics.checkNotNullExpressionValue(format, "TextUtil.addMaskDot(Text….clearSpace(data.number))");
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(resetInternal.setMax.forceUniformHeight);
            if (textView2 != null) {
                textView2.setText(format);
            }
            String max = recipientViewModel.getMax();
            if (max != null) {
                str2 = max;
            }
            updateMessageMenuItem<Drawable> min = ((updateCornerMarking) Glide.getMax(this.length)).setMax(str2).setMax(evaluate.setMin).setMax((getTopSortedChildren<?>) isLineVisible.getMax()).setMax((int) R.drawable.ic_bank_placeholder).setMin((int) R.drawable.ic_bank_placeholder);
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            min.length((ImageView) (AppCompatImageView) view3.findViewById(resetInternal.setMax.onWindowStartingSupportActionMode));
            CharSequence charSequence2 = recipientViewModel.length;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z = true;
            }
            String string = z ? this.length.getString(R.string.debit) : recipientViewModel.length.toString();
            Intrinsics.checkNotNullExpressionValue(string, "if (data.instLocalName.i….instLocalName.toString()");
            View view4 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view4, "itemView");
            TextView textView3 = (TextView) view4.findViewById(resetInternal.setMax.setOnSuggestionListener);
            if (textView3 != null) {
                textView3.setText(string);
            }
            View view5 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view5, "itemView");
            AppCompatImageView appCompatImageView = (AppCompatImageView) view5.findViewById(resetInternal.setMax.onCreateDialog);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new setMin(this));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setFinalY(@NotNull ViewGroup viewGroup, @Nullable PhotoItem photoItem, @Nullable setOriginText setorigintext) {
        super(viewGroup.getContext(), R.layout.item_saved_bank_cards_v2, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        this.setMin = photoItem;
        this.getMax = setorigintext;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ setFinalY getMin;

        getMax(setFinalY setfinaly) {
            this.getMin = setfinaly;
        }

        public final void onClick(@Nullable View view) {
            setFinalY.length(this.getMin);
        }
    }

    public final void setMin(@NotNull Ignore.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "onItemClickListener");
        this.itemView.setOnClickListener(new getMax(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ setFinalY length;

        setMin(setFinalY setfinaly) {
            this.length = setfinaly;
        }

        public final void onClick(View view) {
            RecipientModel min = this.length.getMax(RecipientSource.RECENT);
            if (min != null) {
                RecipientViewModel max = this.length.getMin;
                if (max != null) {
                    min.setMax = max.setMax;
                }
                setOriginText min2 = this.length.getMax;
                if (min2 != null) {
                    min2.setMax(min);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final RecipientModel getMax(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        RecipientModel.length length = new RecipientModel.length("bank");
        RecipientViewModel recipientViewModel = this.getMin;
        String str8 = null;
        length.toFloatRange = recipientViewModel != null ? recipientViewModel.getMin() : null;
        length.FastBitmap$CoordinateSystem = RecipientIdType.INSTITUTION;
        RecipientViewModel recipientViewModel2 = this.getMin;
        length.isInside = recipientViewModel2 != null ? recipientViewModel2.setMax() : null;
        RecipientViewModel recipientViewModel3 = this.getMin;
        if (recipientViewModel3 != null) {
            str2 = recipientViewModel3.equals;
        } else {
            str2 = null;
        }
        length.Mean$Arithmetic = str2;
        RecipientViewModel recipientViewModel4 = this.getMin;
        if (recipientViewModel4 != null) {
            str3 = recipientViewModel4.isInside;
        } else {
            str3 = null;
        }
        length.toIntRange = str3;
        RecipientViewModel recipientViewModel5 = this.getMin;
        length.IsOverlapping = recipientViewModel5 != null ? recipientViewModel5.getMax() : null;
        RecipientViewModel recipientViewModel6 = this.getMin;
        if (recipientViewModel6 != null) {
            str4 = recipientViewModel6.length;
        } else {
            str4 = null;
        }
        length.equals = str4;
        RecipientViewModel recipientViewModel7 = this.getMin;
        if (recipientViewModel7 != null) {
            str5 = recipientViewModel7.toIntRange;
        } else {
            str5 = null;
        }
        length.values = str5;
        RecipientViewModel recipientViewModel8 = this.getMin;
        if (recipientViewModel8 != null) {
            str6 = recipientViewModel8.toFloatRange;
        } else {
            str6 = null;
        }
        length.toDoubleRange = str6;
        RecipientViewModel recipientViewModel9 = this.getMin;
        if (recipientViewModel9 != null) {
            str7 = recipientViewModel9.setMin;
        } else {
            str7 = null;
        }
        length.getMin = str7;
        length.setMax = str;
        RecipientViewModel recipientViewModel10 = this.getMin;
        length.invoke = recipientViewModel10 != null ? recipientViewModel10.setMin() : null;
        RecipientViewModel recipientViewModel11 = this.getMin;
        if (recipientViewModel11 != null) {
            str8 = recipientViewModel11.toIntRange();
        }
        length.getCause = str8;
        RecipientViewModel recipientViewModel12 = this.getMin;
        if (recipientViewModel12 != null) {
            i = recipientViewModel12.FastBitmap$CoordinateSystem;
        } else {
            i = 0;
        }
        length.b = i;
        RecipientViewModel recipientViewModel13 = this.getMin;
        length.onNavigationEvent = recipientViewModel13 != null ? recipientViewModel13.toFloatRange() : true;
        return length.length();
    }

    public static final /* synthetic */ void length(setFinalY setfinaly) {
        RecipientModel max = setfinaly.getMax(RecipientSource.ALL_CONTACTS);
        PhotoItem photoItem = setfinaly.setMin;
        if (photoItem != null) {
            photoItem.onRecipientSelected(max);
        }
    }
}
