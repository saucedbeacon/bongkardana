package id.dana.splitbill.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.Unbinder;
import com.bumptech.glide.Glide;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import id.dana.richview.CurrencyTextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.IntRange;
import o.WheelView;
import o.drawDividersHorizontal;
import o.evaluate;
import o.setLastScanStartTimeMillis;
import o.updateCornerMarking;

public class SplitBillHistoryAdapter extends IMultiInstanceInvalidationCallback.Stub<Ignore<setLastScanStartTimeMillis>, setLastScanStartTimeMillis> {

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder length;

        @UiThread
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.length = viewHolder;
            viewHolder.civFirstPayer = (CircleImageView) drawDividersHorizontal.setMin(view, R.id.f38202131362298, "field 'civFirstPayer'", CircleImageView.class);
            viewHolder.civSecondPayer = (CircleImageView) drawDividersHorizontal.setMin(view, R.id.f38262131362304, "field 'civSecondPayer'", CircleImageView.class);
            viewHolder.civThirdPayer = (CircleImageView) drawDividersHorizontal.setMin(view, R.id.f38322131362310, "field 'civThirdPayer'", CircleImageView.class);
            viewHolder.flSumPayer = (FrameLayout) drawDividersHorizontal.setMin(view, R.id.f44422131362967, "field 'flSumPayer'", FrameLayout.class);
            viewHolder.tvSumPayer = (TextView) drawDividersHorizontal.setMin(view, R.id.f69582131365585, "field 'tvSumPayer'", TextView.class);
            viewHolder.tvDescriptionSplitBillHistory = (TextView) drawDividersHorizontal.setMin(view, R.id.f65682131365193, "field 'tvDescriptionSplitBillHistory'", TextView.class);
            viewHolder.tvDateSplitBillHistory = (TextView) drawDividersHorizontal.setMin(view, R.id.f65622131365187, "field 'tvDateSplitBillHistory'", TextView.class);
            viewHolder.ctvAmount = (CurrencyTextView) drawDividersHorizontal.setMin(view, R.id.f41262131362612, "field 'ctvAmount'", CurrencyTextView.class);
            viewHolder.ivStatus = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50912131363646, "field 'ivStatus'", ImageView.class);
        }

        @CallSuper
        public final void setMax() {
            ViewHolder viewHolder = this.length;
            if (viewHolder != null) {
                this.length = null;
                viewHolder.civFirstPayer = null;
                viewHolder.civSecondPayer = null;
                viewHolder.civThirdPayer = null;
                viewHolder.flSumPayer = null;
                viewHolder.tvSumPayer = null;
                viewHolder.tvDescriptionSplitBillHistory = null;
                viewHolder.tvDateSplitBillHistory = null;
                viewHolder.ctvAmount = null;
                viewHolder.ivStatus = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class ViewHolder extends Ignore<setLastScanStartTimeMillis> {
        @BindView(2131362298)
        CircleImageView civFirstPayer;
        @BindView(2131362304)
        CircleImageView civSecondPayer;
        @BindView(2131362310)
        CircleImageView civThirdPayer;
        @BindView(2131362612)
        CurrencyTextView ctvAmount;
        @BindView(2131362967)
        FrameLayout flSumPayer;
        @BindView(2131363646)
        ImageView ivStatus;
        @BindView(2131365187)
        TextView tvDateSplitBillHistory;
        @BindView(2131365193)
        TextView tvDescriptionSplitBillHistory;
        @BindView(2131365585)
        TextView tvSumPayer;

        public final /* synthetic */ void setMax(Object obj) {
            setLastScanStartTimeMillis setlastscanstarttimemillis = (setLastScanStartTimeMillis) obj;
            List<String> avatars = setlastscanstarttimemillis.getAvatars();
            if (avatars == null || avatars.isEmpty()) {
                this.civFirstPayer.setVisibility(4);
                this.civSecondPayer.setVisibility(4);
                this.civThirdPayer.setVisibility(4);
                this.flSumPayer.setVisibility(8);
            } else if (avatars.size() == 1) {
                this.civFirstPayer.setVisibility(4);
                this.civSecondPayer.setVisibility(4);
                getMin(avatars.get(0), this.civThirdPayer);
                this.flSumPayer.setVisibility(8);
            } else if (avatars.size() == 2) {
                this.civFirstPayer.setVisibility(4);
                getMin(avatars.get(0), this.civSecondPayer);
                getMin(avatars.get(1), this.civThirdPayer);
                this.flSumPayer.setVisibility(8);
            } else if (avatars.size() == 3) {
                getMin(avatars.get(0), this.civFirstPayer);
                getMin(avatars.get(1), this.civSecondPayer);
                getMin(avatars.get(2), this.civThirdPayer);
                this.flSumPayer.setVisibility(8);
            } else if (avatars.size() > 3) {
                getMin(avatars.get(0), this.civFirstPayer);
                getMin(avatars.get(1), this.civSecondPayer);
                this.civThirdPayer.setVisibility(4);
                StringBuilder sb = new StringBuilder("+");
                sb.append(avatars.size() - 2);
                this.tvSumPayer.setText(sb.toString());
                this.flSumPayer.setVisibility(0);
            }
            this.tvDescriptionSplitBillHistory.setText(TextUtils.isEmpty(setlastscanstarttimemillis.getComment()) ? "-" : setlastscanstarttimemillis.getComment());
            TextView textView = this.tvDateSplitBillHistory;
            String string = this.itemView.getContext().getString(R.string.split_bill_history_date_format);
            if (WheelView.OnWheelViewListener.getMax == null) {
                WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
            }
            textView.setText(new SimpleDateFormat(string, WheelView.OnWheelViewListener.getMax).format(new Date(setlastscanstarttimemillis.getCreatedDate())));
            this.ctvAmount.setText(setlastscanstarttimemillis.getTotalAmount().getAmount());
            String status = setlastscanstarttimemillis.getStatus();
            if (!TextUtils.isEmpty(status)) {
                char c = 65535;
                int hashCode = status.hashCode();
                if (hashCode != -1149187101) {
                    if (hashCode != -604548089) {
                        if (hashCode == -591252731 && status.equals("EXPIRED")) {
                            c = 2;
                        }
                    } else if (status.equals("IN_PROGRESS")) {
                        c = 1;
                    }
                } else if (status.equals("SUCCESS")) {
                    c = 0;
                }
                if (c == 0) {
                    this.ivStatus.setImageDrawable(IntRange.length(this.length, (int) R.drawable.success));
                    this.ivStatus.setVisibility(0);
                    return;
                } else if (c == 1) {
                    this.ivStatus.setImageDrawable(IntRange.length(this.length, (int) R.drawable.pending));
                    this.ivStatus.setVisibility(0);
                    return;
                } else if (c == 2) {
                    this.ivStatus.setImageDrawable(IntRange.length(this.length, (int) R.drawable.failed));
                    this.ivStatus.setVisibility(0);
                    return;
                }
            }
            this.ivStatus.setVisibility(4);
        }

        public ViewHolder(Context context, ViewGroup viewGroup) {
            super(context, R.layout.view_item_split_bill_history, viewGroup);
        }

        private void getMin(String str, CircleImageView circleImageView) {
            ((updateCornerMarking) Glide.getMax(this.length)).setMax(str).setMax(evaluate.setMin).setMax((int) R.drawable.ic_avatar_grey_default).setMin((int) R.drawable.ic_avatar_grey_default).length((ImageView) circleImageView);
        }
    }

    @NonNull
    public /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(viewGroup.getContext(), viewGroup);
    }
}
