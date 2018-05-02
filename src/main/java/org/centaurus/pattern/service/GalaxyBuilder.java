package org.centaurus.pattern.service;

import org.centaurus.pattern.entity.Galaxy;
import org.centaurus.pattern.model.form.GalaxyFormModel;

import java.util.Map;

public interface GalaxyBuilder {
    Galaxy buildGalaxy(GalaxyFormModel galaxyFormModel);
}
