package id.dana.richview.splitbill;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface SelectedPayerViewType {
    public static final int RECENT_CONTACT = 2;
    public static final int SELECTED_CONTACT = 1;
}
