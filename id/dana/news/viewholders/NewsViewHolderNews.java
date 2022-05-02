package id.dana.news.viewholders;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.bumptech.glide.Glide;
import id.dana.R;
import o.BLEBridgeExtension;
import o.Ignore;
import o.NFCUtils;
import o.RewriteQueriesToDropUnusedColumns;
import o.onProcess;
import o.setDpMargin;
import o.updateCornerMarking;
import o.updatePostLayout;

public class NewsViewHolderNews extends BLEBridgeExtension.AnonymousClass12 {
    @BindView(2131364150)
    TextView content;
    @BindView(2131364154)
    RelativeLayout feedWrapper;
    private Context getMax;
    @BindView(2131364151)
    ImageView iconFeeds;
    public setMin setMax;
    @BindView(2131364153)
    TextView title;

    public interface setMin {
        void getMin(onProcess onprocess);
    }

    public final /* synthetic */ void setMax(Object obj) {
        setMax((onProcess) obj);
    }

    public NewsViewHolderNews(Context context, ViewGroup viewGroup) {
        new Ignore<onProcess>(context, R.layout.cardview_news, viewGroup) {
            /* renamed from: getMin */
            public void setMax(onProcess onprocess) {
            }
        };
        this.getMax = context;
    }

    public final void getMin(onProcess onprocess) {
        if (onprocess != null) {
            String str = onprocess.getMin;
            if (str != null) {
                this.title.setText(str);
            }
            String str2 = onprocess.getMax;
            if (str2 != null) {
                this.content.setText(str2);
            }
            String str3 = onprocess.isInside;
            if (!TextUtils.isEmpty(str3)) {
                if (RewriteQueriesToDropUnusedColumns.setMax(str3)) {
                    RewriteQueriesToDropUnusedColumns.getMax getmax = new RewriteQueriesToDropUnusedColumns.getMax(this.length, (byte) 0);
                    getmax.getMin = str3;
                    getmax.setMax = R.drawable.ic_dana_logo_white;
                    getmax.isInside = new setDpMargin();
                    getmax.setMin = this.iconFeeds;
                    new RewriteQueriesToDropUnusedColumns(getmax, (byte) 0);
                } else {
                    ((updateCornerMarking) Glide.getMax(this.length)).setMax(str3).setMax((int) R.drawable.ic_dana_logo_white).setMin((updatePostLayout<Bitmap>) new setDpMargin()).setMin((int) R.drawable.ic_dana_logo_white).length(this.iconFeeds);
                }
            }
            this.feedWrapper.setOnClickListener(new NFCUtils(this, onprocess));
        }
    }

    public static /* synthetic */ void setMin(NewsViewHolderNews newsViewHolderNews, onProcess onprocess) {
        if (onprocess.getMax()) {
            newsViewHolderNews.setMax.getMin(onprocess);
        }
    }
}
