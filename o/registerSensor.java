package o;

import android.content.DialogInterface;
import id.dana.onboarding.createprofile.CreateProfileFragment;

public final class registerSensor implements DialogInterface.OnClickListener {
    private final CreateProfileFragment length;

    public registerSensor(CreateProfileFragment createProfileFragment) {
        this.length = createProfileFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CreateProfileFragment.toFloatRange(this.length);
    }
}
