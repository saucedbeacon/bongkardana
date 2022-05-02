package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney.remarks.NoteBottomSheetDialogFragment;
import o.setPhotoSize;

public final class setModifiedTime implements getBindingAdapter<NoteBottomSheetDialogFragment> {
    @InjectedFieldSignature("id.dana.sendmoney.remarks.NoteBottomSheetDialogFragment.presenter")
    public static void length(NoteBottomSheetDialogFragment noteBottomSheetDialogFragment, setPhotoSize.setMin setmin) {
        noteBottomSheetDialogFragment.presenter = setmin;
    }
}
