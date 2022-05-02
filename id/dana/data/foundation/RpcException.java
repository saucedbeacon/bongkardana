package id.dana.data.foundation;

public class RpcException extends RuntimeException {
    public final String code;
    public final String msg;

    public RpcException(String str, String str2) {
        super(format(str, str2));
        this.code = str;
        this.msg = str2 == null ? "" : str2;
    }

    public RpcException(String str, Throwable th) {
        super(th);
        this.code = str;
        this.msg = (th == null || th.getMessage() == null) ? "" : th.getMessage();
    }

    public RpcException(String str) {
        super(format(str, ""));
        this.code = str;
        this.msg = "";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RpcException(Exception exc) {
        super(exc == null ? null : exc.getMessage());
        this.code = "000";
        this.msg = (exc == null || exc.getMessage() == null) ? "" : exc.getMessage();
    }

    protected static String format(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("RPCException: ");
        if (str != null) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        }
        sb.append(" : ");
        if (str2 != null) {
            sb.append(str2);
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RpcException{code='");
        sb.append(this.code);
        sb.append('\'');
        sb.append(", msg='");
        sb.append(this.msg);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
