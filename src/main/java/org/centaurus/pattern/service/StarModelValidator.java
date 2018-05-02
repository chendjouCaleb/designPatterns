package org.centaurus.pattern.service;

import org.centaurus.pattern.ValidationException;
import org.centaurus.pattern.model.form.StarFormModel;

public interface StarModelValidator {
    void validate(StarFormModel starFormModel) throws ValidationException;
}
