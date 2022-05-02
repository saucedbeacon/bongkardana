package o;

import id.dana.challenge.ChallengeScenario;
import id.dana.domain.otp.model.OtpChannel;
import id.dana.tracker.mixpanel.ChallengeEvent;

public final class TinyAppActionStateListener {
    public static String getMin(String str) {
        if (str == null) {
            return "";
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 708704563) {
            if (hashCode == 1854112322 && str.equals(OtpChannel.WHATSAPP)) {
                c = 1;
            }
        } else if (str.equals(OtpChannel.SMS)) {
            c = 0;
        }
        if (c != 0) {
            return c != 1 ? "" : ChallengeEvent.Channel.WHATSAPP;
        }
        return ChallengeEvent.Channel.SMS;
    }

    public static String setMax(String str) {
        if (str == null) {
            return "";
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1999183539:
                if (str.equals(ChallengeScenario.REGISTRATION)) {
                    c = 1;
                    break;
                }
                break;
            case -497502143:
                if (str.equals("payment_auth")) {
                    c = 5;
                    break;
                }
                break;
            case -489325167:
                if (str.equals("unbind_merchant")) {
                    c = 6;
                    break;
                }
                break;
            case 103149417:
                if (str.equals("login")) {
                    c = 0;
                    break;
                }
                break;
            case 1090898198:
                if (str.equals(ChallengeScenario.RELOGIN)) {
                    c = 2;
                    break;
                }
                break;
            case 1573803584:
                if (str.equals(ChallengeScenario.TRUST_RISK_LOGIN)) {
                    c = 3;
                    break;
                }
                break;
            case 1656771640:
                if (str.equals("face_activation")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "Login";
            case 1:
                return "Registration";
            case 2:
                return ChallengeEvent.Source.RELOGIN;
            case 3:
                return ChallengeEvent.Source.TRUST_RISK_LOGIN;
            case 4:
                return ChallengeEvent.Source.FACE_ACTIVATION;
            case 5:
                return ChallengeEvent.Source.PAYMENT_AUTH;
            case 6:
                return ChallengeEvent.Source.UNBIND_MERCHANT;
            default:
                return "";
        }
    }
}
