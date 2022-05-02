package id.dana.nearbyme.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.Unbinder;
import com.google.android.material.chip.Chip;
import id.dana.R;
import id.dana.nearbyme.MerchantViewType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.IntRange;
import o.UrlCodecRequest;
import o.drawDividersHorizontal;
import o.g;
import o.getAppIdList;

public final class MerchantCategoryAdapter extends IMultiInstanceInvalidationCallback.Stub<MerchantCategoryViewHolder, g.AnonymousClass1> {
    public getAppIdList getMax;
    /* access modifiers changed from: private */
    public Set<g.AnonymousClass1> length = new HashSet();
    public g.AnonymousClass1 setMin;

    public class MerchantCategoryViewHolder_ViewBinding implements Unbinder {
        private MerchantCategoryViewHolder getMin;

        @UiThread
        public MerchantCategoryViewHolder_ViewBinding(MerchantCategoryViewHolder merchantCategoryViewHolder, View view) {
            this.getMin = merchantCategoryViewHolder;
            merchantCategoryViewHolder.chip = (Chip) drawDividersHorizontal.setMin(view, R.id.f38022131362280, "field 'chip'", Chip.class);
        }

        @CallSuper
        public final void setMax() {
            MerchantCategoryViewHolder merchantCategoryViewHolder = this.getMin;
            if (merchantCategoryViewHolder != null) {
                this.getMin = null;
                merchantCategoryViewHolder.chip = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public MerchantCategoryAdapter() {
        g.AnonymousClass1 r0 = new g.AnonymousClass1();
        this.setMin = r0;
        r0.getMax = MerchantViewType.MERCHANT_CAT_ALL;
        this.setMin.getMin = "All";
        this.length.add(this.setMin);
    }

    /* access modifiers changed from: private */
    /* renamed from: getMin */
    public g.AnonymousClass1 setMin(int i) {
        g.AnonymousClass1 r0 = this.setMin;
        if (r0 == null) {
            return (g.AnonymousClass1) super.setMin(i);
        }
        if (i == 0) {
            return r0;
        }
        return (g.AnonymousClass1) super.setMin(i - 1);
    }

    public final int getItemCount() {
        return super.getItemCount() + (setMax() ? 1 : 0);
    }

    public final int getItemViewType(int i) {
        return (!setMax() || setMin(i) != this.setMin) ? 1 : 0;
    }

    public final void setMin(g.AnonymousClass1 r2) {
        if (r2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(r2);
            if (!arrayList.isEmpty()) {
                this.length.clear();
                this.length.addAll(arrayList);
                notifyDataSetChanged();
                getAppIdList getappidlist = this.getMax;
                if (getappidlist != null) {
                    getappidlist.onMulitpleCategorySelected(arrayList);
                }
            }
        }
    }

    public final boolean setMax() {
        return this.setMin != null;
    }

    class setMax extends MerchantCategoryViewHolder {
        setMax(Context context, ViewGroup viewGroup) {
            super(context, viewGroup);
        }

        /* access modifiers changed from: protected */
        public final void getMax(g.AnonymousClass1 r1, boolean z) {
            if (z) {
                MerchantCategoryAdapter.this.length.clear();
                MerchantCategoryAdapter.this.length.add(r1);
            } else if (MerchantCategoryAdapter.this.length.isEmpty()) {
                MerchantCategoryAdapter.this.length.add(r1);
            }
            MerchantCategoryAdapter.this.notifyDataSetChanged();
        }
    }

    public class MerchantCategoryViewHolder extends Ignore<g.AnonymousClass1> {
        @BindView(2131362280)
        Chip chip;

        public final /* synthetic */ void setMax(Object obj) {
            int i;
            g.AnonymousClass1 r5 = (g.AnonymousClass1) obj;
            this.chip.setChecked(MerchantCategoryAdapter.this.length.contains(r5));
            this.chip.setText(r5.getMin);
            this.chip.setOnClickListener(new UrlCodecRequest(this, r5));
            if (r5.getMax.equals(MerchantViewType.MERCHANT_CAT_DANA_BISNIS)) {
                this.chip.setChipIconVisible(false);
                return;
            }
            Chip chip2 = this.chip;
            Context context = this.length;
            String str = r5.getMax;
            char c = 65535;
            int hashCode = str.hashCode();
            switch (hashCode) {
                case -1080034440:
                    if (str.equals(MerchantViewType.MERCHANT_CAT_ALL)) {
                        c = 1;
                        break;
                    }
                    break;
                case 1421842541:
                    if (str.equals(MerchantViewType.MERCHANT_CAT_ORDER_ONLINE)) {
                        c = 12;
                        break;
                    }
                    break;
                case 1470938172:
                    if (str.equals(MerchantViewType.MERCHANT_CAT_COVID_19)) {
                        c = 11;
                        break;
                    }
                    break;
                case 1483026726:
                    if (str.equals(MerchantViewType.MERCHANT_CAT_PROMO)) {
                        c = 2;
                        break;
                    }
                    break;
                default:
                    switch (hashCode) {
                        case 3345352:
                            if (str.equals(MerchantViewType.MERCHANT_CAT_FOOD_AND_BEVERAGES)) {
                                c = 6;
                                break;
                            }
                            break;
                        case 3345353:
                            if (str.equals(MerchantViewType.MERCHANT_CAT_RETAIL)) {
                                c = 3;
                                break;
                            }
                            break;
                        case 3345354:
                            if (str.equals(MerchantViewType.MERCHANT_CAT_TOP_UP_AGENT)) {
                                c = 10;
                                break;
                            }
                            break;
                        case 3345355:
                            if (str.equals(MerchantViewType.MERCHANT_CAT_PROFESSIONAL_SERVICES)) {
                                c = 5;
                                break;
                            }
                            break;
                        case 3345356:
                            if (str.equals(MerchantViewType.MERCHANT_CAT_HEALTH)) {
                                c = 4;
                                break;
                            }
                            break;
                        case 3345357:
                            if (str.equals(MerchantViewType.MERCHANT_CAT_ENTERTAINMENT)) {
                                c = 7;
                                break;
                            }
                            break;
                        case 3345358:
                            if (str.equals(MerchantViewType.MERCHANT_CAT_FINANCIAL)) {
                                c = 8;
                                break;
                            }
                            break;
                        case 3345359:
                            if (str.equals(MerchantViewType.MERCHANT_CAT_NON_PROFIT_ORGANIZATION)) {
                                c = 9;
                                break;
                            }
                            break;
                    }
            }
            switch (c) {
                case 2:
                    i = R.drawable.ic_mc_promo_state;
                    break;
                case 3:
                    i = R.drawable.ic_mc_retail_state;
                    break;
                case 4:
                    i = R.drawable.ic_mc_health_state;
                    break;
                case 5:
                    i = R.drawable.ic_mc_professional_services_state;
                    break;
                case 6:
                    i = R.drawable.ic_mc_food_and_beverages_state;
                    break;
                case 7:
                    i = R.drawable.ic_mc_entertaintment_state;
                    break;
                case 8:
                    i = R.drawable.ic_mc_financial_state;
                    break;
                case 9:
                    i = R.drawable.ic_mc_npo_state;
                    break;
                case 10:
                    i = R.drawable.ic_mc_top_up_agent_state;
                    break;
                case 11:
                    i = R.drawable.ic_mc_covid_state;
                    break;
                case 12:
                    i = R.drawable.ic_home_shopping_state;
                    break;
                default:
                    i = R.drawable.ic_mc_all_state;
                    break;
            }
            chip2.setChipIcon(IntRange.length(context, i));
        }

        MerchantCategoryViewHolder(Context context, ViewGroup viewGroup) {
            super(context, R.layout.item_merchant_category, viewGroup);
        }

        /* access modifiers changed from: protected */
        public void getMax(g.AnonymousClass1 r1, boolean z) {
            if (z) {
                MerchantCategoryAdapter.this.length.add(r1);
                if (MerchantCategoryAdapter.this.setMax()) {
                    MerchantCategoryAdapter.this.length.remove(MerchantCategoryAdapter.this.setMin);
                }
            } else {
                MerchantCategoryAdapter.this.length.remove(r1);
                if (MerchantCategoryAdapter.this.length.isEmpty()) {
                    MerchantCategoryAdapter.this.length.add(MerchantCategoryAdapter.this.setMin);
                }
            }
            MerchantCategoryAdapter.this.notifyDataSetChanged();
        }

        public static /* synthetic */ void length(MerchantCategoryViewHolder merchantCategoryViewHolder, g.AnonymousClass1 r1, View view) {
            merchantCategoryViewHolder.getMax(r1, ((Chip) view).isChecked());
            MerchantCategoryAdapter.this.getMax.onCategoryClick(r1);
            MerchantCategoryAdapter.setMin(MerchantCategoryAdapter.this, new ArrayList(MerchantCategoryAdapter.this.length));
        }
    }

    @NonNull
    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new setMax(viewGroup.getContext(), viewGroup);
        }
        return new MerchantCategoryViewHolder(viewGroup.getContext(), viewGroup);
    }

    static /* synthetic */ void setMin(MerchantCategoryAdapter merchantCategoryAdapter, List list) {
        getAppIdList getappidlist = merchantCategoryAdapter.getMax;
        if (getappidlist != null) {
            getappidlist.onMulitpleCategorySelected(list);
        }
    }
}
