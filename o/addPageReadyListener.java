package o;

import org.json.JSONArray;

final class addPageReadyListener implements RedDotDrawable {
    public static final addPageReadyListener setMin = new addPageReadyListener();

    public final Object apply(Object obj) {
        return handleMessage.lambda$getSocialMediaCategoryShare$25((JSONArray) obj);
    }
}
