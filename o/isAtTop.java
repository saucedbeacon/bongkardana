package o;

import id.dana.data.network.ResultResponse;
import java.io.File;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;
import o.createChallenge;

@Singleton
public class isAtTop implements invalidateDividers {
    private static final String BIZ_TYPE = "avatar";
    private static final String FILE_TYPE = ".png";
    private static final translateRegularFrame MEDIA_TYPE_FORM_DATA = translateRegularFrame.length("multipart/form-data");
    private static final translateRegularFrame MEDIA_TYPE_PNG = translateRegularFrame.length("image/png");
    private static final String MULTIPART_NAME = "file";
    private final isAtBottom avatarApi;

    @Inject
    public isAtTop(isAtBottom isatbottom) {
        this.avatarApi = isatbottom;
    }

    public TitleBarRightButtonView.AnonymousClass1<getOwner> uploadAvatar(File file, String str) {
        isAtBottom isatbottom = this.avatarApi;
        getPart createData = createData("avatar");
        StringBuilder sb = new StringBuilder();
        sb.append(file.getName());
        sb.append(str);
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<ResultResponse<getOwner>> uploadAvatar = isatbottom.uploadAvatar(createData, createData(changeAvatarName(sb.toString())), createImageData(file, str));
        access$invalidateOverScroll access_invalidateoverscroll = access$invalidateOverScroll.setMax;
        setRefreshAnimation.getMax(access_invalidateoverscroll, "mapper is null");
        setMinDuration releaseviewlist = new releaseViewList(uploadAvatar, access_invalidateoverscroll);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable = SecuritySignature.toString;
        if (redDotDrawable != null) {
            releaseviewlist = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, releaseviewlist);
        }
        if (releaseviewlist instanceof getSecondFloorView) {
            return ((getSecondFloorView) releaseviewlist).setMax();
        }
        setTitleLoading settitleloading = new setTitleLoading(releaseviewlist);
        RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable2 = SecuritySignature.FastBitmap$CoordinateSystem;
        return redDotDrawable2 != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable2, settitleloading) : settitleloading;
    }

    private String changeAvatarName(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.replaceAll(".png", ""));
        sb.append(".png");
        return sb.toString();
    }

    private getPart createData(String str) {
        return getPart.length(MEDIA_TYPE_FORM_DATA, str);
    }

    private createChallenge.getMax createImageData(File file, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getName());
        sb.append(str);
        return createChallenge.getMax.setMax("file", changeAvatarName(sb.toString()), getPart.getMin(MEDIA_TYPE_PNG, file));
    }
}
