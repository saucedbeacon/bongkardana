package id.dana.sendmoney.contact.recent;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.sendmoney.RecentDetailType;
import id.dana.sendmoney.RecentDetailView;
import id.dana.sendmoney.model.RecentContactModel;
import java.util.ArrayList;
import java.util.List;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.drawDividersHorizontal;
import o.isLineVisible;

public class RecentContactAdapter extends IMultiInstanceInvalidationCallback.Stub<Ignore<RecentContactModel>, RecentContactModel> {

    public class ViewHolderEmpty_ViewBinding implements Unbinder {
        private ViewHolderEmpty setMin;

        @UiThread
        public ViewHolderEmpty_ViewBinding(ViewHolderEmpty viewHolderEmpty, View view) {
            this.setMin = viewHolderEmpty;
            viewHolderEmpty.constraintLayout = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f40222131362502, "field 'constraintLayout'", ConstraintLayout.class);
        }

        @CallSuper
        public final void setMax() {
            ViewHolderEmpty viewHolderEmpty = this.setMin;
            if (viewHolderEmpty != null) {
                this.setMin = null;
                viewHolderEmpty.constraintLayout = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class ViewHolderLink_ViewBinding implements Unbinder {
        private ViewHolderLink setMin;

        @UiThread
        public ViewHolderLink_ViewBinding(ViewHolderLink viewHolderLink, View view) {
            this.setMin = viewHolderLink;
            viewHolderLink.viewRecentDetail = (RecentDetailView) drawDividersHorizontal.setMin(view, R.id.f73012131365936, "field 'viewRecentDetail'", RecentDetailView.class);
        }

        @CallSuper
        public final void setMax() {
            ViewHolderLink viewHolderLink = this.setMin;
            if (viewHolderLink != null) {
                this.setMin = null;
                viewHolderLink.viewRecentDetail = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class ViewHolderScanner_ViewBinding implements Unbinder {
        private ViewHolderScanner setMin;

        @UiThread
        public ViewHolderScanner_ViewBinding(ViewHolderScanner viewHolderScanner, View view) {
            this.setMin = viewHolderScanner;
            viewHolderScanner.viewRecentDetail = (RecentDetailView) drawDividersHorizontal.setMin(view, R.id.f73012131365936, "field 'viewRecentDetail'", RecentDetailView.class);
        }

        @CallSuper
        public final void setMax() {
            ViewHolderScanner viewHolderScanner = this.setMin;
            if (viewHolderScanner != null) {
                this.setMin = null;
                viewHolderScanner.viewRecentDetail = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder length;

        @UiThread
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.length = viewHolder;
            viewHolder.viewRecentDetail = (RecentDetailView) drawDividersHorizontal.setMin(view, R.id.f73012131365936, "field 'viewRecentDetail'", RecentDetailView.class);
        }

        @CallSuper
        public final void setMax() {
            ViewHolder viewHolder = this.length;
            if (viewHolder != null) {
                this.length = null;
                viewHolder.viewRecentDetail = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public int getItemViewType(int i) {
        return ((RecentContactModel) setMin(i)).toIntRange;
    }

    public class ViewHolder extends Ignore<RecentContactModel> {
        @BindView(2131365936)
        RecentDetailView viewRecentDetail;

        public final /* synthetic */ void setMax(Object obj) {
            RecentContactModel recentContactModel = (RecentContactModel) obj;
            if (recentContactModel != null) {
                this.viewRecentDetail.setView(recentContactModel.length, recentContactModel.toFloatRange, recentContactModel.setMax, RecentDetailType.CONTACTS);
            }
        }

        ViewHolder(Context context, ViewGroup viewGroup) {
            super(context, R.layout.item_recent_detail, viewGroup);
        }
    }

    public class ViewHolderScanner extends Ignore<RecentContactModel> {
        @BindView(2131365936)
        RecentDetailView viewRecentDetail;

        public final /* synthetic */ void setMax(Object obj) {
            if (((RecentContactModel) obj) != null) {
                this.viewRecentDetail.setView(this.length.getString(R.string.scan_qr_send_money_title), this.length.getString(R.string.scan_code), (String) null, "scanner");
            }
        }

        ViewHolderScanner(Context context, ViewGroup viewGroup) {
            super(context, R.layout.item_recent_detail, viewGroup);
        }
    }

    public class ViewHolderLink extends Ignore<RecentContactModel> {
        @BindView(2131365936)
        RecentDetailView viewRecentDetail;

        public final /* synthetic */ void setMax(Object obj) {
            if (((RecentContactModel) obj) != null) {
                this.viewRecentDetail.setView(this.length.getString(R.string.send_money_to), this.length.getString(R.string.chat), (String) null, "link");
            }
        }

        ViewHolderLink(Context context, ViewGroup viewGroup) {
            super(context, R.layout.item_recent_detail, viewGroup);
        }
    }

    public class ViewHolderEmpty extends Ignore<RecentContactModel> {
        @BindView(2131362502)
        ConstraintLayout constraintLayout;
        /* access modifiers changed from: private */
        public boolean getMax = false;
        /* access modifiers changed from: private */
        public Context getMin;

        ViewHolderEmpty(Context context, ViewGroup viewGroup) {
            super(context, R.layout.item_recent_bank_empty, viewGroup);
            this.getMin = context;
        }

        public final /* synthetic */ void setMax(Object obj) {
            if (!this.getMax) {
                this.constraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    public final void onGlobalLayout() {
                        ViewHolderEmpty.this.constraintLayout.setMaxWidth(ViewHolderEmpty.this.constraintLayout.getWidth() - isLineVisible.length((Activity) ViewHolderEmpty.this.getMin, 80.0f));
                        ViewHolderEmpty.this.constraintLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        boolean unused = ViewHolderEmpty.this.getMax = true;
                    }
                });
            }
        }
    }

    public final void getMin(List<RecentContactModel> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        RecentContactModel recentContactModel = new RecentContactModel();
        recentContactModel.length(0);
        RecentContactModel recentContactModel2 = new RecentContactModel();
        recentContactModel2.length(3);
        list.add(0, recentContactModel);
        list.add(1, recentContactModel2);
        if (list.size() == 2) {
            RecentContactModel recentContactModel3 = new RecentContactModel();
            recentContactModel3.length(1);
            list.add(2, recentContactModel3);
        }
        super.getMin(list);
    }

    @NonNull
    public /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new ViewHolderScanner(viewGroup.getContext(), viewGroup);
        }
        if (i != 1) {
            return i != 3 ? new ViewHolder(viewGroup.getContext(), viewGroup) : new ViewHolderLink(viewGroup.getContext(), viewGroup);
        }
        return new ViewHolderEmpty(viewGroup.getContext(), viewGroup);
    }
}
