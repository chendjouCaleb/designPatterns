package org.centaurus.pattern;

import java.util.Map;

public class ValidationException extends Exception {
    private Map<String, String> errors;

    public Map<String, String> getErrors() {
        return errors;
    }
}
