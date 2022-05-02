package o;

import android.view.View;

final class isShowingThumbnail implements View.OnClickListener {
    private final getValidShowingPhoto length;

    public isShowingThumbnail(getValidShowingPhoto getvalidshowingphoto) {
        this.length = getvalidshowingphoto;
    }

    public final void onClick(View view) {
        this.length.setMax();
    }
}
