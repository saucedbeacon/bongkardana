package org.yaml.snakeyaml.error;

public class YAMLException extends RuntimeException {
    private static final long serialVersionUID = -4738336175050337570L;

    public YAMLException(String str) {
        super(str);
    }

    public YAMLException(Throwable th) {
        super(th);
    }

    public YAMLException(String str, Throwable th) {
        super(str, th);
    }
}
