package id.dana.onboarding.createprofile;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class CreateProfileFragment_ViewBinding implements Unbinder {
    private CreateProfileFragment length;
    private View setMin;

    @UiThread
    public CreateProfileFragment_ViewBinding(final CreateProfileFragment createProfileFragment, View view) {
        this.length = createProfileFragment;
        View max = drawDividersHorizontal.getMax(view, R.id.f56982131364275, "field 'profileAvatar' and method 'onClickProfile'");
        createProfileFragment.profileAvatar = (ImageView) drawDividersHorizontal.getMin(max, R.id.f56982131364275, "field 'profileAvatar'", ImageView.class);
        this.setMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                createProfileFragment.onClickProfile();
            }
        });
        createProfileFragment.profileName = (EditText) drawDividersHorizontal.setMin(view, R.id.f57002131364277, "field 'profileName'", EditText.class);
    }

    @CallSuper
    public final void setMax() {
        CreateProfileFragment createProfileFragment = this.length;
        if (createProfileFragment != null) {
            this.length = null;
            createProfileFragment.profileAvatar = null;
            createProfileFragment.profileName = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
