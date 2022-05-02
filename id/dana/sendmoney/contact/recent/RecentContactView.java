package id.dana.sendmoney.contact.recent;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.di.modules.RecentContactModule;
import id.dana.scanner.ScannerActivity;
import id.dana.sendmoney.contact.recent.RecentContactView;
import id.dana.sendmoney.model.RecentContactModel;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.tracker.TrackerKey;
import javax.inject.Inject;
import o.DecodeWrapper;
import o.IComponent;
import o.Ignore;
import o.PluginResourcePackage;
import o.PrepareException;
import o.XPermissionHelper;
import o.onLoadFailed;
import o.stopIgnoring;

public class RecentContactView extends BaseRichView {
    private IComponent<RecipientModel> length = IComponent.setMax();
    @Inject
    public onLoadFailed.setMax presenter;
    @Inject
    public RecentContactAdapter recentContactAdapter;
    @BindView(2131364554)
    RecyclerView rvRecentContact;

    public int getLayout() {
        return R.layout.view_recent_contact;
    }

    public RecentContactView(@NonNull Context context) {
        super(context);
    }

    public RecentContactView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RecentContactView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RecentContactView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        super.injectComponent(r4);
        PluginResourcePackage.length length2 = new PluginResourcePackage.length((byte) 0);
        if (r4 != null) {
            length2.getMax = r4;
            length2.setMin = new RecentContactModule(new XPermissionHelper(this));
            stopIgnoring.setMin(length2.setMin, RecentContactModule.class);
            stopIgnoring.setMin(length2.getMax, PrepareException.AnonymousClass1.class);
            new PluginResourcePackage(length2.setMin, length2.getMax, (byte) 0).getMin(this);
            registerPresenter(this.presenter);
            return;
        }
        throw null;
    }

    public void setup() {
        this.rvRecentContact.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.recentContactAdapter.getMax((Ignore.setMin) new Ignore.setMin(this) {
            private final RecentContactView getMin;

            {
                this.getMin = r1;
            }

            public final void length(int i) {
                RecentContactView.getMax(this.getMin, i);
            }
        });
        this.rvRecentContact.setAdapter(this.recentContactAdapter);
        this.rvRecentContact.setNestedScrollingEnabled(false);
        this.presenter.getMax();
    }

    public IComponent<RecipientModel> getRecentContactModelPublishSubject() {
        return this.length;
    }

    public static /* synthetic */ void getMax(RecentContactView recentContactView, int i) {
        String str;
        if (2 == recentContactView.recentContactAdapter.getItemViewType(i)) {
            RecentContactModel recentContactModel = (RecentContactModel) recentContactView.recentContactAdapter.setMin(i);
            RecipientModel.length length2 = new RecipientModel.length("contact");
            if (recentContactModel.getMax == 0) {
                str = recentContactModel.getMin;
            } else {
                str = String.valueOf(recentContactModel.getMax);
            }
            length2.toFloatRange = str;
            length2.isInside = recentContactModel.length;
            length2.toIntRange = recentContactModel.toFloatRange;
            length2.IsOverlapping = recentContactModel.setMax;
            recentContactView.length.onNext(length2.length());
        }
        if (3 == recentContactView.recentContactAdapter.getItemViewType(i)) {
            RecipientModel.length length3 = new RecipientModel.length("link");
            length3.isInside = recentContactView.getContext().getString(R.string.send_as_link);
            length3.toIntRange = recentContactView.getContext().getString(R.string.share_send_money_link);
            length3.IsOverlapping = ((RecentContactModel) recentContactView.recentContactAdapter.setMin(i)).setMax;
            recentContactView.length.onNext(length3.length());
        }
        if (recentContactView.recentContactAdapter.getItemViewType(i) == 0) {
            DecodeWrapper.getMin(TrackerKey.OpenScanAction.RECENT_RECIPIENT);
            Activity activity = (Activity) recentContactView.getContext();
            Intent intent = new Intent(activity, ScannerActivity.class);
            intent.putExtra("source", "Send Money");
            activity.startActivityForResult(intent, DecodeWrapper.AnonymousClass2.length);
        }
    }
}
