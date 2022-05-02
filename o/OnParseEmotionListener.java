package o;

import id.dana.social.di.module.FeedCommentModule;
import o.AUHorizontalListView;
import o.b;
import o.setRightButtonStyle;

public final class OnParseEmotionListener implements getAdapterPosition<setRightButtonStyle.getMin> {
    private final FeedCommentModule getMax;
    private final b.C0007b<AUHorizontalListView.LayoutParams> getMin;

    public static setRightButtonStyle.getMin getMin(FeedCommentModule feedCommentModule, AUHorizontalListView.LayoutParams layoutParams) {
        setRightButtonStyle.getMin max = feedCommentModule.getMax(layoutParams);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        setRightButtonStyle.getMin max = this.getMax.getMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
