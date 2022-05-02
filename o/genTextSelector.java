package o;

import java.util.ArrayList;
import java.util.List;

public final class genTextSelector {
    public static void setMax(convertSpToPx... convertsptopxArr) {
        for (convertSpToPx length : convertsptopxArr) {
            length.length();
        }
    }

    public static void getMax(convertDipToPx convertdiptopx) {
        if (convertdiptopx != null) {
            List length = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
            setMax((convertSpToPx[]) length.toArray(new convertSpToPx[length.size()]));
        }
    }
}
