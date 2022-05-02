package org.junit.runner;

import java.util.ArrayList;
import java.util.List;

final class JUnitCommandLineParseResult {
    private final List<Class<?>> getMin = new ArrayList();
    private final List<String> length = new ArrayList();
    private final List<Throwable> setMax = new ArrayList();

    JUnitCommandLineParseResult() {
    }

    public static class CommandLineParserError extends Exception {
        private static final long serialVersionUID = 1;

        public CommandLineParserError(String str) {
            super(str);
        }
    }
}
