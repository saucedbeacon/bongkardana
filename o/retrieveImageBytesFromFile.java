package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.R;
import id.dana.promoquest.model.MissionModel;
import id.dana.promoquest.views.MissionCardView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0015\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0015"}, d2 = {"Lid/dana/promoquest/adapter/MissionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lid/dana/promoquest/adapter/MissionsAdapter$ViewHolder;", "missions", "", "Lid/dana/promoquest/model/MissionModel;", "(Ljava/util/List;)V", "getMissions", "()Ljava/util/List;", "setMissions", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class retrieveImageBytesFromFile extends RecyclerView.Adapter<getMin> {
    @NotNull
    public List<MissionModel> setMax;

    public retrieveImageBytesFromFile() {
        this((byte) 0);
    }

    public /* synthetic */ retrieveImageBytesFromFile(byte b) {
        this((List<MissionModel>) CollectionsKt.emptyList());
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i) {
        getMin getmin = (getMin) valueof;
        Intrinsics.checkNotNullParameter(getmin, "holder");
        View view = getmin.itemView;
        if (view != null) {
            MissionCardView missionCardView = (MissionCardView) view;
            missionCardView.setMission(this.setMax.get(i));
            if (i == 0) {
                getBluetoothAdapterState.getMax((View) missionCardView, (Float) null, Float.valueOf(16.0f), (Float) null, 13);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.promoquest.views.MissionCardView");
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_item_mission_card, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…sion_card, parent, false)");
        return new getMin(inflate);
    }

    private retrieveImageBytesFromFile(@NotNull List<MissionModel> list) {
        Intrinsics.checkNotNullParameter(list, "missions");
        this.setMax = list;
    }

    public final int getItemCount() {
        return this.setMax.size();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lid/dana/promoquest/adapter/MissionsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends RecyclerView.valueOf {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMin(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            View view2 = this.itemView;
            if (view2 != null) {
                MissionCardView missionCardView = (MissionCardView) view2;
                missionCardView.setQuestsVisible(true);
                missionCardView.setSize(1);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type id.dana.promoquest.views.MissionCardView");
        }
    }
}
