package o;

public final class onDeactivated {
    private static onDeactivated setMax;
    public final IComponent<Boolean> getMax = IComponent.setMax();

    public static onDeactivated setMax() {
        if (setMax == null) {
            setMax = new onDeactivated();
        }
        return setMax;
    }
}
