package id.dana.usereducation.adapter;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class HelpListViewHolder extends RecyclerView.valueOf {
    @BindView(2131363479)
    public ImageView ivIcon;
    @BindView(2131362709)
    public TextView tvDescription;
    @BindView(2131364837)
    public TextView tvTitle;

    public HelpListViewHolder(View view) {
        super(view);
        ButterKnife.setMax((Object) this, view);
    }

    public static String getMax(String str) {
        return TextUtils.isEmpty(str) ? "" : str;
    }
}
