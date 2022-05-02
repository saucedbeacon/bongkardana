package org.yaml.snakeyaml.error;

public class MissingEnvironmentVariableException extends YAMLException {
    public MissingEnvironmentVariableException(String str) {
        super(str);
    }
}
