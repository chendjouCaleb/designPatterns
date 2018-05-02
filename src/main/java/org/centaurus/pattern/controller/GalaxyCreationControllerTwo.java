package org.centaurus.pattern.controller;

import org.centaurus.pattern.ValidationException;
import org.centaurus.pattern.component.ActionResult;
import org.centaurus.pattern.component.Request;
import org.centaurus.pattern.component.View;
import org.centaurus.pattern.entity.Galaxy;
import org.centaurus.pattern.model.form.GalaxyFormModel;
import org.centaurus.pattern.repository.GalaxyRepository;
import org.centaurus.pattern.service.GalaxyBuilder;
import org.centaurus.pattern.service.GalaxyFormModelBuilder;
import org.centaurus.pattern.service.GalaxyModelValidator;
import org.centaurus.pattern.service.GalaxyParamsExtractor;

import java.util.Map;

public class GalaxyCreationControllerTwo {
    private GalaxyFormModelBuilder formModelBuilder;
    private GalaxyParamsExtractor paramsExtractor;
    private GalaxyBuilder galaxyBuilder;
    private GalaxyRepository galaxyRepository;
    private GalaxyModelValidator galaxyModelValidator;

    public ActionResult createGalaxy(Request request){
        try {
            Map<String, Object> galaxyFormParams = paramsExtractor.extractGalaxyFormParams(request);
            GalaxyFormModel galaxyFormModel = formModelBuilder.buildGalaxieFormModel(galaxyFormParams);
            galaxyModelValidator.validate(galaxyFormModel);

            Galaxy galaxy = galaxyBuilder.buildGalaxy(galaxyFormModel);
            galaxyRepository.save(galaxy);

            return new View("galaxy-home", galaxy);

        } catch (ValidationException e) {
            return new View("galaxy-create-form", e.getErrors());
        }

    }
}
