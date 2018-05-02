package org.centaurus.pattern.service;

import org.centaurus.pattern.ValidationException;
import org.centaurus.pattern.model.form.GalaxyFormModel;

public interface GalaxyModelValidator {
    void validate(GalaxyFormModel galaxyFormModel) throws ValidationException;
}
