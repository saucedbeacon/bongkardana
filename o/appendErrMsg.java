package o;

final class appendErrMsg {
    appendErrMsg() {
    }

    static String length(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("--")) {
            return str.substring(2, str.length());
        }
        return str.startsWith("-") ? str.substring(1, str.length()) : str;
    }
}
