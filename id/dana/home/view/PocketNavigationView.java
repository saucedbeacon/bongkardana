package id.dana.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import id.dana.R;

public class PocketNavigationView extends NavigationTabView {
    @Nullable
    @BindView(2131364133)
    ImageView tabNotif;

    public int getLayout() {
        return R.layout.view_pocket_nav_tab;
    }

    public PocketNavigationView(@NonNull Context context, int i, String str) {
        super(context, i, str);
    }

    public PocketNavigationView(@NonNull Context context) {
        super(context);
    }

    public PocketNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PocketNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PocketNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setBadge(boolean z) {
        ImageView imageView = this.tabNotif;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }
}
