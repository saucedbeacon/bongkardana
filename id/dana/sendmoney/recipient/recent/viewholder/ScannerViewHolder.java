package id.dana.sendmoney.recipient.recent.viewholder;

import android.app.Activity;
import android.content.Intent;
import android.view.ViewGroup;
import butterknife.BindView;
import id.dana.R;
import id.dana.scanner.ScannerActivity;
import id.dana.sendmoney.RecentDetailView;
import o.DecodeWrapper;
import o.Ignore;
import o.increaseCount;
import o.setPhotoPath;

public class ScannerViewHolder extends Ignore<increaseCount> {
    @BindView(2131365936)
    RecentDetailView recentDetailView;

    public final /* synthetic */ void setMax(Object obj) {
        if (((increaseCount) obj) != null) {
            this.recentDetailView.setView(this.length.getString(R.string.scan_qr_send_money_title), this.length.getString(R.string.scan_code), (String) null, "scanner");
        }
    }

    public ScannerViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_recent_detail, viewGroup);
    }

    public final void setMin(Ignore.setMin setmin) {
        this.recentDetailView.setOnClickListener(new setPhotoPath(this, setmin));
    }

    public static /* synthetic */ void getMax(ScannerViewHolder scannerViewHolder, Ignore.setMin setmin) {
        Activity activity = (Activity) scannerViewHolder.length;
        Intent intent = new Intent(activity, ScannerActivity.class);
        intent.putExtra("source", "Send Money");
        activity.startActivityForResult(intent, DecodeWrapper.AnonymousClass2.length);
        DecodeWrapper.getMin("Send Money");
        setmin.length(scannerViewHolder.getAdapterPosition());
    }
}
