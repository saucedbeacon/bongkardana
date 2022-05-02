package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.usereducation.model.ContentOnBoardingModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003J(\u0010\u000b\u001a\u00020\f2\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/social/FeedsIntroduction;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "contentOnBoardingModels", "Ljava/util/ArrayList;", "Lid/dana/usereducation/model/ContentOnBoardingModel;", "Lkotlin/collections/ArrayList;", "openBottomSheetOnBoardingList", "", "setContentsOnBoardingPage", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setLogUploadURL {
    public final ArrayList<ContentOnBoardingModel> getMax;

    public setLogUploadURL(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        ArrayList<ContentOnBoardingModel> arrayList = new ArrayList<>();
        this.getMax = arrayList;
        setMax(arrayList, context);
    }

    private static boolean setMax(ArrayList<ContentOnBoardingModel> arrayList, Context context) {
        String string = context.getString(R.string.feed_introduction_first_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.feed_introduction_first_title)");
        String string2 = context.getString(R.string.feed_introduction_first_description);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.feed_…uction_first_description)");
        arrayList.add(new ContentOnBoardingModel((int) R.drawable.ic_friendship_proceed, string, string2));
        String string3 = context.getString(R.string.feed_introduction_second_title);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.feed_introduction_second_title)");
        String string4 = context.getString(R.string.feed_introduction_second_description);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.feed_…ction_second_description)");
        arrayList.add(new ContentOnBoardingModel((int) R.drawable.ic_friendship_people, string3, string4));
        String string5 = context.getString(R.string.feed_introduction_third_title);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.feed_introduction_third_title)");
        String string6 = context.getString(R.string.feed_introduction_third_description);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.feed_…uction_third_description)");
        return arrayList.add(new ContentOnBoardingModel((int) R.drawable.ic_friendship_ok, string5, string6));
    }
}
