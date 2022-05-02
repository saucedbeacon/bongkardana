package id.dana.tracker.rds;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface RDSConstant {
    public static final String INPUT_PHONE_NUMBER = "InputPhoneNumber";
    public static final String INPUT_PIN = "InputPIN";
    public static final String INPUT_PIN_GET_FOCUS = "InputPINGetFocus";
    public static final String INPUT_PIN_LOST_FOCUS = "InputPINLostFocus";
    public static final String PAGE_ONBOARDING = "Onboarding";
    public static final String PHONE_NUMBER_CONTINUE_BUTTON = "PhoneNumberContinueButton";
    public static final String PHONE_NUMBER_GET_FOCUS = "PhoneNumberGetFocus";
    public static final String PHONE_NUMBER_LOST_FOCUS = "PhoneNumberLostFocus";
    public static final String PHONE_NUMBER_TOUCH = "PhoneNumberTouch";
}
