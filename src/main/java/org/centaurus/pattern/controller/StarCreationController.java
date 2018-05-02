package org.centaurus.pattern.controller;

import org.centaurus.pattern.ValidationException;
import org.centaurus.pattern.component.ActionResult;
import org.centaurus.pattern.component.Request;
import org.centaurus.pattern.component.View;
import org.centaurus.pattern.entity.Galaxy;
import org.centaurus.pattern.entity.Star;
import org.centaurus.pattern.model.form.GalaxyFormModel;
import org.centaurus.pattern.model.form.StarFormModel;
import org.centaurus.pattern.repository.GalaxyRepository;
import org.centaurus.pattern.repository.StarRepository;
import org.centaurus.pattern.service.*;

import java.util.Map;

public class StarCreationController {
    private StarFormModelBuilder formModelBuilder;
    private StarParamsExtractor paramsExtractor;
    private StarBuilder starBuilder;
    private StarRepository starRepository;
    private StarModelValidator starModelValidator;

    public ActionResult createStar(Request request){
        try {
            Map<String, Object> starFormParams = paramsExtractor.extractStarFormParams(request);
            StarFormModel starFormModel = formModelBuilder.buildStarFormModel(starFormParams);
            starModelValidator.validate(starFormModel);

            Star star = starBuilder.buildStar(starFormModel);
            starRepository.save(star);

            return new View("star-home", star);

        } catch (ValidationException e) {
            return new View("star-create-form", e.getErrors());
        }

    }
}
