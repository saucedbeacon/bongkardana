package retrofit2;

import o.ProcessInfoImpl;
import o.getAppenderManager;

public class HttpException extends RuntimeException {
    private final int code;
    private final String message;
    private final transient getAppenderManager<?> response;

    private static String getMessage(getAppenderManager<?> getappendermanager) {
        ProcessInfoImpl.getMin(getappendermanager, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        sb.append(getappendermanager.getMin.getMax);
        sb.append(" ");
        sb.append(getappendermanager.getMin.length);
        return sb.toString();
    }

    public HttpException(getAppenderManager<?> getappendermanager) {
        super(getMessage(getappendermanager));
        this.code = getappendermanager.getMin.getMax;
        this.message = getappendermanager.getMin.length;
        this.response = getappendermanager;
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public getAppenderManager<?> response() {
        return this.response;
    }
}
