package id.dana.notificationcenter.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.utils.SimpleTimeConversion;
import java.util.Arrays;
import o.Base64$OutputStream;
import o.ContactActivityResultPoint;
import o.DiagnoseLogAppender;
import o.Ignore;
import o.IntRange;
import o.OnAppendLogListener;
import o.OnConfirmListener;
import o.RewriteQueriesToDropUnusedColumns;
import o.appendDnsTime;
import o.appendDownMsgLens;
import o.appendFlushLog;
import o.clearMessages;
import o.getLinkLiveTime;
import o.getShortName;
import o.setDpMargin;
import o.systemOut;
import o.updateCornerMarking;
import o.updatePostLayout;

public class NotificationCenterViewHolder extends Ignore<ContactActivityResultPoint> {
    @BindView(2131364166)
    TextView content;
    private final getShortName getMax;
    @BindView(2131364167)
    ImageView iconNotification;
    @BindView(2131364165)
    LinearLayout notificationBadge;
    @BindView(2131364172)
    RelativeLayout notificationWrapper;
    @BindView(2131364171)
    TextView time;

    public final /* synthetic */ void setMax(Object obj) {
        ContactActivityResultPoint contactActivityResultPoint = (ContactActivityResultPoint) obj;
        if (contactActivityResultPoint != null) {
            contactActivityResultPoint.toFloatRange = this.getMax;
            String str = contactActivityResultPoint.length;
            if (!TextUtils.isEmpty(str)) {
                appendFlushLog min = new appendFlushLog.setMin(this.length).getMin();
                OnConfirmListener onConfirmListener = new OnConfirmListener(new OnConfirmListener.length().length(Arrays.asList(new appendDownMsgLens[]{new appendDnsTime(), new getLinkLiveTime(), new clearMessages()})), (byte) 0);
                Base64$OutputStream length = onConfirmListener.length(new systemOut(onConfirmListener.getMin, onConfirmListener.setMax()).length(str));
                DiagnoseLogAppender diagnoseLogAppender = new DiagnoseLogAppender();
                length.setMax(new OnAppendLogListener(min, diagnoseLogAppender));
                this.content.setText(new SpannableStringBuilder(diagnoseLogAppender.setMax()));
            }
            String length2 = new SimpleTimeConversion(this.length, contactActivityResultPoint.getMin, "1").length();
            if (!TextUtils.isEmpty(length2)) {
                this.time.setText(length2);
            }
            getMax(contactActivityResultPoint.getMin());
            String str2 = contactActivityResultPoint.setMax;
            if (!TextUtils.isEmpty(str2)) {
                if (RewriteQueriesToDropUnusedColumns.setMax(str2)) {
                    RewriteQueriesToDropUnusedColumns.getMax getmax = new RewriteQueriesToDropUnusedColumns.getMax(this.length, (byte) 0);
                    getmax.getMin = str2;
                    getmax.setMax = R.drawable.ic_dana_logo_white;
                    getmax.isInside = new setDpMargin();
                    getmax.setMin = this.iconNotification;
                    new RewriteQueriesToDropUnusedColumns(getmax, (byte) 0);
                } else {
                    ((updateCornerMarking) Glide.getMax(this.length)).setMax(str2).setMax((int) R.drawable.ic_dana_logo_white).setMin((updatePostLayout<Bitmap>) new setDpMargin()).setMin((int) R.drawable.ic_dana_logo_white).length(this.iconNotification);
                }
            }
            if (contactActivityResultPoint.getMax() != null && !contactActivityResultPoint.getMax().isEmpty()) {
                getMax(contactActivityResultPoint.getMin());
            }
        }
    }

    public NotificationCenterViewHolder(Context context, ViewGroup viewGroup, getShortName getshortname) {
        super(context, R.layout.cardview_notification_center, viewGroup);
        this.getMax = getshortname;
    }

    private void getMax(boolean z) {
        this.notificationBadge.setVisibility(z ? 8 : 0);
        this.notificationWrapper.setBackgroundColor(IntRange.setMax(this.length, z ? R.color.f24762131100430 : R.color.f23532131100277));
    }
}
