package o;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.R;
import id.dana.usereducation.adapter.HelpListViewHolder;
import id.dana.usereducation.model.ContentOnBoardingModel;
import java.util.ArrayList;
import java.util.List;
import o.LandScapeTinyMenuPopupWindow;
import o.setOnMenuWindowDismissListener;

public class setRightSelected extends RecyclerView.Adapter<HelpListViewHolder> {
    private List<ContentOnBoardingModel> getMax;

    public /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i) {
        HelpListViewHolder helpListViewHolder = (HelpListViewHolder) valueof;
        ContentOnBoardingModel contentOnBoardingModel = this.getMax.get(i);
        if (contentOnBoardingModel != null) {
            helpListViewHolder.tvTitle.setText(HelpListViewHolder.getMax(contentOnBoardingModel.getMin));
            helpListViewHolder.tvDescription.setText(HelpListViewHolder.getMax(contentOnBoardingModel.setMin));
            new LandScapeTinyMenuPopupWindow.AnonymousClass1().getMax(helpListViewHolder.itemView.getContext(), helpListViewHolder.ivIcon, contentOnBoardingModel.length, contentOnBoardingModel.setMax, (setOnMenuWindowDismissListener.length) null);
        }
    }

    public setRightSelected(List<ContentOnBoardingModel> list) {
        if (this.getMax == null) {
            this.getMax = new ArrayList();
        }
        this.getMax.addAll(list);
    }

    public int getItemCount() {
        return this.getMax.size();
    }

    public /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new HelpListViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_help, viewGroup, false));
    }
}
