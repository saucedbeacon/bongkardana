package o;

public class initExtParam<T> {
    public String getMin;
    public T length;

    public String toString() {
        StringBuilder sb = new StringBuilder("IAPReachMsgModel{rawString='");
        sb.append(this.getMin);
        sb.append('\'');
        sb.append(", model=");
        sb.append(this.length);
        sb.append('}');
        return sb.toString();
    }
}
