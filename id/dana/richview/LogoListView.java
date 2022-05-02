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
import id.dana.sendmoney.LogoListAdapter;
import java.util.List;
import o.getDefaultProxy;

public class LogoListView extends BaseRichView {
    LogoListAdapter logoListAdapter;
    @BindView(2131364522)
    RecyclerView rvLogo;

    public int getLayout() {
        return R.layout.view_logo_list;
    }

    public LogoListView(@NonNull Context context) {
        super(context);
    }

    public LogoListView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LogoListView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public LogoListView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setup() {
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext());
        flexboxLayoutManager.setFlexDirection(0);
        flexboxLayoutManager.setJustifyContent(2);
        this.logoListAdapter = new LogoListAdapter();
        this.rvLogo.setLayoutManager(flexboxLayoutManager);
        this.rvLogo.setAdapter(this.logoListAdapter);
    }

    public void setLogo(List<getDefaultProxy> list) {
        this.logoListAdapter.getMin(list);
    }
}
