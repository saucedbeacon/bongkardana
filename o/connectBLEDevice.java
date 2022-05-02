package o;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.feeds.views.FeedsFooterViewHolderFeeds;
import id.dana.feeds.views.NewsFullViewHolder;
import id.dana.feeds.views.NewsViewHolderNews;
import java.util.List;
import o.BLEBridgeExtension;
import o.IMultiInstanceInvalidationCallback;

public final class connectBLEDevice extends IMultiInstanceInvalidationCallback.Stub<BLEBridgeExtension.AnonymousClass12, onProcess> {
    public getMin getMin;
    private NewsViewHolderNews length;
    public boolean setMin;

    public interface getMin {
        void getMin(onProcess onprocess);

        void setMin();
    }

    public connectBLEDevice(List<onProcess> list) {
        getMin(list);
    }

    public final int getItemViewType(int i) {
        String str;
        if (!setMin()) {
            onProcess onprocess = (onProcess) setMin(i);
            if (onprocess != null) {
                str = onprocess.toIntRange;
            } else {
                str = "NORMAL";
            }
            if ("FULL".equalsIgnoreCase(str)) {
                return 3;
            }
            if (!this.setMin || i != getItemCount() - 1) {
                return 1;
            }
            return 2;
        } else if (this.setMin) {
            return 2;
        } else {
            return 0;
        }
    }

    private boolean setMin() {
        return getMax().size() == 0;
    }

    public final int getItemCount() {
        if (getMax().size() == 0) {
            return this.setMin ? 1 : 0;
        }
        return super.getItemCount() + (this.setMin ? 1 : 0);
    }

    @NonNull
    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new BLEBridgeExtension.AnonymousClass12(viewGroup.getContext(), viewGroup) {
            };
        }
        if (i == 1) {
            NewsViewHolderNews newsViewHolderNews = new NewsViewHolderNews(viewGroup.getContext(), viewGroup);
            this.length = newsViewHolderNews;
            newsViewHolderNews.getMin = new disconnectBLEDevice(this);
            return this.length;
        } else if (i == 3) {
            return new NewsFullViewHolder(viewGroup.getContext(), viewGroup);
        } else {
            FeedsFooterViewHolderFeeds feedsFooterViewHolderFeeds = new FeedsFooterViewHolderFeeds(viewGroup.getContext(), viewGroup);
            feedsFooterViewHolderFeeds.setMax = new getBLEDeviceCharacteristics(this);
            return feedsFooterViewHolderFeeds;
        }
    }

    static /* synthetic */ void getMin(connectBLEDevice connectbledevice, onProcess onprocess) {
        getMin getmin = connectbledevice.getMin;
        if (getmin != null) {
            getmin.getMin(onprocess);
        }
    }
}
