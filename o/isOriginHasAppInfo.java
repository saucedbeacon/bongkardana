package o;

import android.text.TextUtils;

public final class isOriginHasAppInfo {
    private static final String INDO_PHONE_NUMBER_PREFIX = "+628";
    private static final String INDO_PHONE_NUMBER_PREFIX_WITHOUT_PLUS = "628";
    private static final int MINIMUM_PHONE_NUMBER_DIGIT = 8;
    private static final String PHONE_NUMBER_PREFIX = "+62";
    private static final String PHONE_NUMBER_PREFIX_ALT = "08";
    private static final String PHONE_NUMBER_PREFIX_WITH_DASH = "62-";
    private static final String REGEX_PHONE = "^[0-9-]*";

    private isOriginHasAppInfo() {
    }

    public static String replaceIndoPhoneNumberPrefixWithZero(String str) {
        return str.replace(PHONE_NUMBER_PREFIX, "0");
    }

    public static String getCleanAll(String str) {
        return getCleanDot(getCleanComma(str));
    }

    public static String getCleanDot(String str) {
        return str.replace(".", "");
    }

    public static String getCleanComma(String str) {
        return str.replace(",", "");
    }

    public static String getCleanSpace(String str) {
        return str.replace(" ", "");
    }

    private static String getCleanDash(String str) {
        return str.replace("-", "");
    }

    public static String getCleanSpaceAndDash(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return getCleanDash(getCleanSpace(str));
    }

    public static String getClearPhoneNumber(String str) {
        return getClearPhoneNumber(str, PHONE_NUMBER_PREFIX_WITH_DASH);
    }

    public static String getIndoPhoneNumber(String str) {
        return getClearPhoneNumber(str, PHONE_NUMBER_PREFIX);
    }

    public static String getCleanPhoneNumberPrefixWithDash(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return getClearPhoneNumber(getCleanDash(str));
    }

    public static String getNormalizePrefixPhoneNumber(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.startsWith(PHONE_NUMBER_PREFIX_WITH_DASH) ? str.replace(PHONE_NUMBER_PREFIX_WITH_DASH, PHONE_NUMBER_PREFIX) : str;
    }

    private static String getClearPhoneNumber(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return getCleanSpace(getCommonFormatPhoneNumber(reformatContactValue(str), str2));
    }

    private static String getCommonFormatPhoneNumber(String str, String str2) {
        if (str.matches("^628{1,4}.*")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str.substring(2));
            return sb.toString();
        } else if (str.matches("^\\+628{1,4}.*")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str.substring(3));
            return sb2.toString();
        } else if (!str.matches("^08{1,3}.*")) {
            return str;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(str.substring(1));
            return sb3.toString();
        }
    }

    private static String reformatContactValue(String str) {
        return str.replaceAll("[^0-9\\+]", "").replaceAll("(^[1-9].+)", "$1").replaceAll("(.)(\\++)(.)", "$1$3");
    }

    public static boolean isPhoneNumberPrefix(String str) {
        if (TextUtils.isEmpty(str) || !isDigitOnly(str)) {
            return false;
        }
        return str.startsWith(PHONE_NUMBER_PREFIX) || str.startsWith(PHONE_NUMBER_PREFIX_ALT);
    }

    private static boolean isIndoPhoneNumber(String str) {
        if (TextUtils.isEmpty(str) || !isDigitOnly(str)) {
            return false;
        }
        return str.startsWith(INDO_PHONE_NUMBER_PREFIX) || str.startsWith(PHONE_NUMBER_PREFIX_ALT) || str.startsWith(INDO_PHONE_NUMBER_PREFIX_WITHOUT_PLUS);
    }

    public static boolean isValidShowPhoneNumber(String str) {
        return isPhoneNumberPrefix(str) && str.length() >= 8;
    }

    public static boolean isValidIndoPhoneNumber(String str) {
        return isIndoPhoneNumber(str) && str.length() >= 8;
    }

    public static boolean isValidIndoPhoneNumberPrefix(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith(INDO_PHONE_NUMBER_PREFIX) || str.startsWith(PHONE_NUMBER_PREFIX_ALT) || str.startsWith(INDO_PHONE_NUMBER_PREFIX_WITHOUT_PLUS);
        }
        return false;
    }

    public static boolean isShowAccountNumber(String str) {
        return !TextUtils.isEmpty(str) && isDigitOnly(str) && !str.startsWith(PHONE_NUMBER_PREFIX);
    }

    public static boolean isValidShowAccountNumber(String str) {
        return isShowAccountNumber(str) && str.length() >= 8;
    }

    private static boolean isDigitOnly(String str) {
        if (!str.startsWith("+") || str.length() <= 1) {
            return TextUtils.isDigitsOnly(str);
        }
        return TextUtils.isDigitsOnly(str.substring(1));
    }

    public static String getPhoneNumberWithoutMasking(String str, String str2) {
        return (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || str2.matches(REGEX_PHONE) || !str.matches(REGEX_PHONE)) ? str2 : str;
    }

    public static String prependZeroToPhoneNumber(String str) {
        return "0".concat(String.valueOf(str));
    }
}
