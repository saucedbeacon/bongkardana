package id.dana.nearbyme.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.nearbyme.NearbyMePromoType;
import id.dana.nearbyme.model.PromoInfoModel;
import id.dana.nearbyme.model.PromoLimitInfoModel;
import id.dana.richview.CurrencyTextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.PageHelperPoint;
import o.WheelView;
import o.drawDividersHorizontal;

public final class NearbyPromoAdapter extends IMultiInstanceInvalidationCallback.Stub<ViewHolder, PromoInfoModel> {

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder getMax;

        @UiThread
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.getMax = viewHolder;
            viewHolder.tvNearbyPromoTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f67582131365385, "field 'tvNearbyPromoTitle'", TextView.class);
            viewHolder.tvMaximumCashbackValue = (TextView) drawDividersHorizontal.setMin(view, R.id.f67142131365341, "field 'tvMaximumCashbackValue'", TextView.class);
            viewHolder.tvPurchaseMinimumValue = (TextView) drawDividersHorizontal.setMin(view, R.id.f68482131365475, "field 'tvPurchaseMinimumValue'", TextView.class);
            viewHolder.tvPromoExpandSwith = (TextView) drawDividersHorizontal.setMin(view, R.id.f67522131365379, "field 'tvPromoExpandSwith'", TextView.class);
            viewHolder.ivPromoExpandSwithArrow = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49892131363544, "field 'ivPromoExpandSwithArrow'", ImageView.class);
            viewHolder.tvPromoPeriodValue = (TextView) drawDividersHorizontal.setMin(view, R.id.f67562131365383, "field 'tvPromoPeriodValue'", TextView.class);
            viewHolder.tvUseLimitValue = (TextView) drawDividersHorizontal.setMin(view, R.id.f67602131365387, "field 'tvUseLimitValue'", TextView.class);
            viewHolder.tvPaymentMethodValue = (TextView) drawDividersHorizontal.setMin(view, R.id.f67542131365381, "field 'tvPaymentMethodValue'", TextView.class);
            viewHolder.llPromoExpandSwitch = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53382131363894, "field 'llPromoExpandSwitch'", LinearLayout.class);
            viewHolder.llPromoExpand = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53372131363893, "field 'llPromoExpand'", LinearLayout.class);
            viewHolder.tvNearbyPromoUseLimitTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f67592131365386, "field 'tvNearbyPromoUseLimitTitle'", TextView.class);
            viewHolder.tvNearbyPromoPaymentMethodTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f67532131365380, "field 'tvNearbyPromoPaymentMethodTitle'", TextView.class);
        }

        @CallSuper
        public final void setMax() {
            ViewHolder viewHolder = this.getMax;
            if (viewHolder != null) {
                this.getMax = null;
                viewHolder.tvNearbyPromoTitle = null;
                viewHolder.tvMaximumCashbackValue = null;
                viewHolder.tvPurchaseMinimumValue = null;
                viewHolder.tvPromoExpandSwith = null;
                viewHolder.ivPromoExpandSwithArrow = null;
                viewHolder.tvPromoPeriodValue = null;
                viewHolder.tvUseLimitValue = null;
                viewHolder.tvPaymentMethodValue = null;
                viewHolder.llPromoExpandSwitch = null;
                viewHolder.llPromoExpand = null;
                viewHolder.tvNearbyPromoUseLimitTitle = null;
                viewHolder.tvNearbyPromoPaymentMethodTitle = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void getMax(Ignore ignore, int i) {
        ((ViewHolder) ignore).setMax((PromoInfoModel) setMin(i));
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i) {
        ((ViewHolder) valueof).setMax((PromoInfoModel) setMin(i));
    }

    public class ViewHolder extends Ignore<PromoInfoModel> {
        @BindView(2131363544)
        ImageView ivPromoExpandSwithArrow;
        @BindView(2131363893)
        LinearLayout llPromoExpand;
        @BindView(2131363894)
        LinearLayout llPromoExpandSwitch;
        @BindView(2131365341)
        TextView tvMaximumCashbackValue;
        @BindView(2131365380)
        TextView tvNearbyPromoPaymentMethodTitle;
        @BindView(2131365385)
        TextView tvNearbyPromoTitle;
        @BindView(2131365386)
        TextView tvNearbyPromoUseLimitTitle;
        @BindView(2131365381)
        TextView tvPaymentMethodValue;
        @BindView(2131365379)
        TextView tvPromoExpandSwith;
        @BindView(2131365383)
        TextView tvPromoPeriodValue;
        @BindView(2131365475)
        TextView tvPurchaseMinimumValue;
        @BindView(2131365387)
        TextView tvUseLimitValue;

        ViewHolder(Context context, ViewGroup viewGroup) {
            super(context, R.layout.item_nearby_promo_list, viewGroup);
        }

        /* renamed from: getMax */
        public final void setMax(PromoInfoModel promoInfoModel) {
            this.tvNearbyPromoTitle.setText(TextUtils.isEmpty(promoInfoModel.getMax) ? "-" : promoInfoModel.getMax);
            String str = "";
            this.tvMaximumCashbackValue.setText((promoInfoModel.toIntRange == null || promoInfoModel.setMin()) ? str : promoInfoModel.toIntRange.setMax());
            TextView textView = this.tvPurchaseMinimumValue;
            if (promoInfoModel.isInside != null && !promoInfoModel.getMax()) {
                str = promoInfoModel.isInside.setMax();
            }
            textView.setText(str);
            TextView textView2 = this.tvPromoPeriodValue;
            long j = promoInfoModel.toFloatRange;
            long j2 = promoInfoModel.IsOverlapping;
            StringBuilder sb = new StringBuilder();
            if (WheelView.OnWheelViewListener.getMax == null) {
                WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
            }
            sb.append(new SimpleDateFormat("d MMM yyyy", WheelView.OnWheelViewListener.getMax).format(new Date(j)));
            sb.append(" - ");
            if (WheelView.OnWheelViewListener.getMax == null) {
                WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
            }
            sb.append(new SimpleDateFormat("d MMM yyyy", WheelView.OnWheelViewListener.getMax).format(new Date(j2)));
            textView2.setText(sb.toString());
            List<PromoLimitInfoModel> list = promoInfoModel.toDoubleRange;
            if (list == null || list.isEmpty()) {
                this.tvNearbyPromoUseLimitTitle.setVisibility(8);
                this.tvUseLimitValue.setVisibility(8);
            } else {
                this.tvNearbyPromoUseLimitTitle.setVisibility(0);
                this.tvUseLimitValue.setVisibility(0);
                this.tvUseLimitValue.setText(setMax(list.get(0)));
            }
            this.tvNearbyPromoPaymentMethodTitle.setVisibility(0);
            this.tvPaymentMethodValue.setVisibility(0);
            this.tvPaymentMethodValue.setText(length(promoInfoModel.equals));
            this.llPromoExpandSwitch.setOnClickListener(new PageHelperPoint(this));
        }

        private String setMax(PromoLimitInfoModel promoLimitInfoModel) {
            StringBuilder sb = new StringBuilder();
            sb.append(promoLimitInfoModel.getMax);
            sb.append(this.length.getString(R.string.promo_use_limit_x));
            sb.append(" ");
            sb.append(getMin(promoLimitInfoModel.length));
            sb.append(" ");
            sb.append(setMin(promoLimitInfoModel.setMin));
            return sb.toString();
        }

        private String length(List<String> list) {
            if (list == null || list.isEmpty()) {
                return length("");
            }
            ArrayList arrayList = new ArrayList();
            for (String length : list) {
                String length2 = length(length);
                if (!TextUtils.isEmpty(length2) && !arrayList.contains(length2)) {
                    arrayList.add(length2);
                }
            }
            if (arrayList.size() <= 1) {
                return (String) arrayList.get(0);
            }
            arrayList.remove(arrayList.size() - 1);
            StringBuilder sb = new StringBuilder();
            sb.append(TextUtils.join(", ", arrayList));
            sb.append(" & ");
            sb.append((String) arrayList.get(arrayList.size() - 1));
            return sb.toString();
        }

        private String getMin(String str) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1567752462) {
                if (hashCode != -1509871868) {
                    if (hashCode == 1268314605 && str.equals(NearbyMePromoType.LimitType.DIVISION_ID)) {
                        c = 2;
                    }
                } else if (str.equals(NearbyMePromoType.LimitType.SHOP_ID)) {
                    c = 1;
                }
            } else if (str.equals(NearbyMePromoType.LimitType.MERCHANT_ID)) {
                c = 0;
            }
            if (c == 0) {
                return this.length.getString(R.string.promo_use_limit_merchant_id);
            }
            if (c == 1) {
                return this.length.getString(R.string.promo_use_limit_shop_id);
            }
            if (c != 2) {
                return "";
            }
            return this.length.getString(R.string.promo_use_limit_division_id);
        }

        private String setMin(String str) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 2175) {
                if (hashCode != 2423) {
                    if (hashCode != 2454) {
                        if (hashCode != 2764) {
                            if (hashCode == 2826 && str.equals(NearbyMePromoType.LimitRangeType.YC)) {
                                c = 3;
                            }
                        } else if (str.equals(NearbyMePromoType.LimitRangeType.WC)) {
                            c = 1;
                        }
                    } else if (str.equals(NearbyMePromoType.LimitRangeType.MC)) {
                        c = 2;
                    }
                } else if (str.equals(NearbyMePromoType.LimitRangeType.LC)) {
                    c = 4;
                }
            } else if (str.equals(NearbyMePromoType.LimitRangeType.DC)) {
                c = 0;
            }
            if (c == 0) {
                return this.length.getString(R.string.promo_use_limit_dc);
            }
            if (c == 1) {
                return this.length.getString(R.string.promo_use_limit_wc);
            }
            if (c == 2) {
                return this.length.getString(R.string.promo_use_limit_mc);
            }
            if (c == 3) {
                return this.length.getString(R.string.promo_use_limit_yc);
            }
            if (c != 4) {
                return "";
            }
            return this.length.getString(R.string.promo_use_limit_lc);
        }

        private String length(String str) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            String replaceAll = str.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(" ", "");
            char c = 65535;
            switch (replaceAll.hashCode()) {
                case -64365875:
                    if (replaceAll.equals("DIRECT_DEBIT_CREDIT_CARD")) {
                        c = 5;
                        break;
                    }
                    break;
                case 0:
                    if (replaceAll.equals("")) {
                        c = 9;
                        break;
                    }
                    break;
                case 341392997:
                    if (replaceAll.equals(NearbyMePromoType.PaymentMethodType.ONLINE_CREDIT)) {
                        c = 6;
                        break;
                    }
                    break;
                case 378796732:
                    if (replaceAll.equals("BALANCE")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1079718284:
                    if (replaceAll.equals("DIRECT_DEBIT_DEBIT_CARD")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1280945827:
                    if (replaceAll.equals("DEBIT_CARD")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1878720662:
                    if (replaceAll.equals("CREDIT_CARD")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1883983033:
                    if (replaceAll.equals("VIRTUAL_ACCOUNT")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1993722918:
                    if (replaceAll.equals("COUPON")) {
                        c = 8;
                        break;
                    }
                    break;
                case 2134027076:
                    if (replaceAll.equals("NET_BANKING")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return this.length.getString(R.string.promo_payment_method_balance);
                case 1:
                    return this.length.getString(R.string.promo_payment_method_debit_card);
                case 2:
                    return this.length.getString(R.string.promo_payment_method_credit_card);
                case 3:
                    return this.length.getString(R.string.promo_payment_method_virtual_account);
                case 4:
                    return this.length.getString(R.string.promo_payment_method_direct_debit_debit_card);
                case 5:
                    return this.length.getString(R.string.promo_payment_method_direct_debit_credit_card);
                case 6:
                    return this.length.getString(R.string.promo_payment_method_online_credit);
                case 7:
                    return this.length.getString(R.string.promo_payment_method_net_banking);
                case 8:
                    return this.length.getString(R.string.promo_payment_method_coupon);
                case 9:
                    return this.length.getString(R.string.all_payment_method);
                default:
                    return "";
            }
        }

        public static /* synthetic */ void setMax(ViewHolder viewHolder) {
            if (viewHolder.llPromoExpand.getVisibility() != 0) {
                viewHolder.tvPromoExpandSwith.setText(R.string.close);
                viewHolder.ivPromoExpandSwithArrow.setImageResource(R.drawable.ic_arrow_blue_up);
                viewHolder.llPromoExpand.setVisibility(0);
                return;
            }
            viewHolder.tvPromoExpandSwith.setText(R.string.more_info_promo);
            viewHolder.ivPromoExpandSwithArrow.setImageResource(R.drawable.ic_arrow_blue_down);
            viewHolder.llPromoExpand.setVisibility(8);
        }
    }

    @NonNull
    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(viewGroup.getContext(), viewGroup);
    }
}
