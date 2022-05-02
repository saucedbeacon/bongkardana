package o;

public final class asyncUploadCoreByCategoryDirectly {
    private Boolean length = null;

    public final boolean getMin() {
        if (this.length == null) {
            String property = System.getProperty("java.runtime.name");
            this.length = Boolean.valueOf(property != null && property.startsWith("Android Runtime"));
        }
        return this.length.booleanValue();
    }
}
