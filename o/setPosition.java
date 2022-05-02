package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.social.bottomsheet.ReportFeedCommentsBottomSheetDialog;
import o.setBtnImage;

public final class setPosition implements getBindingAdapter<ReportFeedCommentsBottomSheetDialog> {
    @InjectedFieldSignature("id.dana.social.bottomsheet.ReportFeedCommentsBottomSheetDialog.feedsCommentReportPresenter")
    public static void length(ReportFeedCommentsBottomSheetDialog reportFeedCommentsBottomSheetDialog, setBtnImage.getMin getmin) {
        reportFeedCommentsBottomSheetDialog.feedsCommentReportPresenter = getmin;
    }
}
