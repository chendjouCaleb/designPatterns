package org.centaurus.pattern.service;

import org.centaurus.pattern.model.form.StarFormModel;

import java.util.Map;

public interface StarFormModelBuilder {
    StarFormModel buildStarFormModel(Map<String, Object> params);
}
