package o;

import android.content.DialogInterface;
import com.google.android.exoplayer2.ui.TrackSelectionView;

public final class performDestroyView implements DialogInterface.OnClickListener {
    private final TrackSelectionView setMax;

    public performDestroyView(TrackSelectionView trackSelectionView) {
        this.setMax = trackSelectionView;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.setMax.applySelection();
    }
}
