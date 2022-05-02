package id.dana.contract.exploredana;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface PlayerType {
    public static final String EXOPLAYER = "destination_exoplayer";
    public static final String H5CONTAINER = "destination_h5";
    public static final String YOUTUBE = "destination_youtube";
}
