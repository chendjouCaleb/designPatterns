package org.centaurus.pattern.service;

import org.centaurus.pattern.model.form.GalaxyFormModel;

import java.util.Map;

public interface GalaxyFormModelBuilder {
    GalaxyFormModel buildGalaxieFormModel(Map<String, Object> params);
}
