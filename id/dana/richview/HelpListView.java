package id.dana.richview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.google.android.flexbox.FlexboxLayoutManager;
import id.dana.R;
import id.dana.base.BaseRichView;
import o.setRightSelected;

public class HelpListView extends BaseRichView {
    @BindView(2131364514)
    RecyclerView rvHelpList;

    public int getLayout() {
        return R.layout.view_help_list;
    }

    public HelpListView(@NonNull Context context) {
        super(context);
    }

    public HelpListView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HelpListView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public HelpListView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setup() {
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext());
        flexboxLayoutManager.setFlexDirection(0);
        flexboxLayoutManager.setJustifyContent(2);
        this.rvHelpList.setLayoutManager(flexboxLayoutManager);
    }

    public void setAdapter(setRightSelected setrightselected) {
        this.rvHelpList.setAdapter(setrightselected);
    }
}
