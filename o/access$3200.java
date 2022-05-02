package o;

import id.dana.sendmoney.model.RecipientModel;

public final class access$3200 extends setSpeed<fillPageCommonInfo, RecipientModel> {
    public final /* synthetic */ Object apply(Object obj) {
        return setMin((fillPageCommonInfo) obj, "contact");
    }

    public final /* synthetic */ Object map(Object obj) {
        return setMin((fillPageCommonInfo) obj, "contact");
    }

    public static RecipientModel setMin(fillPageCommonInfo fillpagecommoninfo, String str) {
        if (fillpagecommoninfo == null) {
            return null;
        }
        RecipientModel.length length = new RecipientModel.length(str);
        length.toFloatRange = fillpagecommoninfo.getMobileNumber();
        length.isInside = fillpagecommoninfo.getNickname();
        length.getMin = fillpagecommoninfo.getAvatarUrl();
        length.IsOverlapping = fillpagecommoninfo.getAvatarUrl();
        length.equals = fillpagecommoninfo.getNickname();
        length.toIntRange = fillpagecommoninfo.getMobileNumber();
        length.FastBitmap$CoordinateSystem = "phonenumber";
        length.Grayscale$Algorithm = fillpagecommoninfo.getReceiverId();
        length.invokeSuspend = true;
        return length.length();
    }
}
