package o;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import id.dana.R;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.domain.statement.StatementType;
import id.dana.statement.StatementActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u0010"}, d2 = {"Lid/dana/myprofile/viewholder/ProfileMenuSettingStatementViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/domain/profilemenu/model/SettingModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "openStatementActivity", "menuSelected", "Lid/dana/domain/statement/StatementType;", "setOnItemClickListener", "onItemClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setIconUrl extends Ignore<SettingModel> {
    @NotNull
    public static final getMin setMax = new getMin((byte) 0);

    public final /* synthetic */ void setMax(Object obj) {
        SettingModel settingModel = (SettingModel) obj;
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        view.setVisibility(0);
        if (settingModel != null) {
            View view2 = this.itemView;
            view2.setVisibility(0);
            String income = settingModel.getIncome();
            String expense = settingModel.getExpense();
            String currency = settingModel.getCurrency();
            if (!TextUtils.isEmpty(income)) {
                TextView textView = (TextView) view2.findViewById(resetInternal.setMax.getLogo);
                Intrinsics.checkNotNullExpressionValue(textView, "tv_income_amount");
                StringBuilder sb = new StringBuilder();
                sb.append(currency);
                sb.append(income);
                textView.setText(sb.toString());
            }
            if (!TextUtils.isEmpty(expense)) {
                TextView textView2 = (TextView) view2.findViewById(resetInternal.setMax.cancelSuperTouch);
                Intrinsics.checkNotNullExpressionValue(textView2, "tv_expense_amount");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(currency);
                sb2.append(expense);
                textView2.setText(sb2.toString());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setIconUrl(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.view_profile_setting_statement, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/myprofile/viewholder/ProfileMenuSettingStatementViewHolder$Companion;", "", "()V", "SOURCE_PROFILE_ME", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ setIconUrl getMin;

        setMin(setIconUrl seticonurl) {
            this.getMin = seticonurl;
        }

        public final void onClick(View view) {
            setIconUrl.setMax(this.getMin, StatementType.INCOME);
        }
    }

    public final void setMin(@NotNull Ignore.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "onItemClickListener");
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        ((ConstraintLayout) view.findViewById(resetInternal.setMax.setShuffleMode)).setOnClickListener(new setMin(this));
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        ((ConstraintLayout) view2.findViewById(resetInternal.setMax.rewind)).setOnClickListener(new setMax(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ setIconUrl getMin;

        setMax(setIconUrl seticonurl) {
            this.getMin = seticonurl;
        }

        public final void onClick(View view) {
            setIconUrl.setMax(this.getMin, StatementType.EXPENSE);
        }
    }

    public static final /* synthetic */ void setMax(setIconUrl seticonurl, StatementType statementType) {
        Intent intent = new Intent(seticonurl.length, StatementActivity.class);
        intent.putExtra("EXTRA_SOURCE", "Profile - Me");
        intent.putExtra(StatementActivity.TAB_MENU_SELECTED, statementType.name());
        seticonurl.length.startActivity(intent);
    }
}
