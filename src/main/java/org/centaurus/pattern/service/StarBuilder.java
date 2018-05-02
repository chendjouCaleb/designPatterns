package org.centaurus.pattern.service;

import org.centaurus.pattern.entity.Star;
import org.centaurus.pattern.model.form.StarFormModel;

public interface StarBuilder {
    Star buildStar(StarFormModel starFormModel);
}
