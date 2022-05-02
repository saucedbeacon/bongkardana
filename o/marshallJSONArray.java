package o;

final class marshallJSONArray implements RedDotDrawable {
    private final RVScheduleType setMin;

    public marshallJSONArray(RVScheduleType rVScheduleType) {
        this.setMin = rVScheduleType;
    }

    public final Object apply(Object obj) {
        return this.setMin.apply(obj);
    }
}
