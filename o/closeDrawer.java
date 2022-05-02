package o;

public final class closeDrawer implements dispatchGenericMotionEvent {
    public final float getMax(setMaxEmojiCount setmaxemojicount, EmojiMetadata$HasGlyph emojiMetadata$HasGlyph) {
        float yChartMax = emojiMetadata$HasGlyph.getYChartMax();
        float yChartMin = emojiMetadata$HasGlyph.getYChartMin();
        findOpenDrawer lineData = emojiMetadata$HasGlyph.getLineData();
        if (setmaxemojicount.onPostMessage() > 0.0f && setmaxemojicount.onRelationshipValidationResult() < 0.0f) {
            return 0.0f;
        }
        if (lineData.getMin() > 0.0f) {
            yChartMax = 0.0f;
        }
        if (lineData.setMax() < 0.0f) {
            yChartMin = 0.0f;
        }
        return setmaxemojicount.onRelationshipValidationResult() >= 0.0f ? yChartMin : yChartMax;
    }
}
