package id.dana.feeds.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.feeds.views.NewsViewHolderNews;
import o.BLEBridgeExtension;
import o.Ignore;
import o.Popup;
import o.RewriteQueriesToDropUnusedColumns;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.onProcess;
import o.setDpMargin;

public class NewsViewHolderNews extends BLEBridgeExtension.AnonymousClass12 {
    @BindView(2131364150)
    TextView content;
    @BindView(2131364154)
    RelativeLayout feedWrapper;
    private int getMax = 8;
    public length getMin;
    @BindView(2131364151)
    ImageView iconFeeds;
    private Context setMax;
    @BindView(2131364153)
    TextView title;

    public interface length {
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
        this.setMax = context;
    }

    public final void getMin(onProcess onprocess) {
        Context context;
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
                int i = 0;
                if (RewriteQueriesToDropUnusedColumns.setMax(str3)) {
                    RewriteQueriesToDropUnusedColumns.getMax getmax = new RewriteQueriesToDropUnusedColumns.getMax(this.length, (byte) 0);
                    getmax.getMin = str3;
                    getmax.setMax = R.drawable.ic_dana_logo_white;
                    getmax.isInside = new setDpMargin();
                    getmax.setMin = this.iconFeeds;
                    new RewriteQueriesToDropUnusedColumns(getmax, (byte) 0);
                } else {
                    Context context2 = this.length;
                    if (context2 != null) {
                        context = context2.getApplicationContext();
                    } else {
                        context = null;
                    }
                    if (context != null) {
                        if (str3 != null) {
                            i = str3.length();
                        }
                        int min = dispatchOnCancelled.setMin(context, i);
                        if (i != min) {
                            onCanceled oncanceled = new onCanceled(i, min, 8);
                            onCancelLoad.setMax(-1324394203, oncanceled);
                            onCancelLoad.getMin(-1324394203, oncanceled);
                        }
                    }
                    Popup.setMin(str3, this.iconFeeds, new Popup.getMax(context2) {
                        private final Context getMax;

                        {
                            this.getMax = r1;
                        }

                        public final void setMin(String str, ImageView imageView) {
                            ((updateCornerMarking) Glide.getMax(this.getMax)).setMax(str).setMax((int) R.drawable.ic_dana_logo_white).setMin((updatePostLayout<Bitmap>) new setDpMargin()).setMin((int) R.drawable.ic_dana_logo_white).length(imageView);
                        }
                    });
                }
            }
            this.feedWrapper.setOnClickListener(new View.OnClickListener(this, onprocess) {
                private final onProcess setMax;
                private final NewsViewHolderNews setMin;

                {
                    this.setMin = r1;
                    this.setMax = r2;
                }

                public final void onClick(View view) {
                    NewsViewHolderNews.length(this.setMin, this.setMax);
                }
            });
        }
    }

    public static /* synthetic */ void length(NewsViewHolderNews newsViewHolderNews, onProcess onprocess) {
        if (onprocess.getMax()) {
            newsViewHolderNews.getMin.getMin(onprocess);
        }
    }
}
