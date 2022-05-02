package id.dana.tracker.mixpanel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public @interface RegistrationEvent {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ProfilePhotoSource {
        public static final String CAMERA = "Camera";
        public static final String GALLERY = "Gallery";
        public static final String NO_ANSWER = "N/A";
    }

    public @interface Property {
        public static final String NICKNAME = "Nickname";
        public static final String PROFILE_PHOTO_SOURCE = "Profile Photo Source";
    }
}
