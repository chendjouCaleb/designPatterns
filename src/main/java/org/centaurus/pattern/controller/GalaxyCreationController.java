package org.centaurus.pattern.controller;

import org.centaurus.pattern.component.ActionResult;
import org.centaurus.pattern.component.Request;
import org.centaurus.pattern.component.View;
import org.centaurus.pattern.entity.Galaxy;
import org.centaurus.pattern.model.form.GalaxyFormModel;
import org.centaurus.pattern.repository.GalaxyRepository;
import org.centaurus.pattern.service.GalaxyBuilder;
import org.centaurus.pattern.service.GalaxyFormModelBuilder;
import org.centaurus.pattern.service.GalaxyParamsExtractor;

import java.util.Map;

public class GalaxyCreationController {
    private GalaxyFormModelBuilder formModelBuilder;
    private GalaxyParamsExtractor paramsExtractor;
    private GalaxyBuilder galaxyBuilder;
    private GalaxyRepository galaxyRepository;

    public ActionResult createGalaxy(Request request){
        Map<String, Object> galaxyFormParams = paramsExtractor.extractGalaxyFormParams(request);
        GalaxyFormModel galaxyFormModel = formModelBuilder.buildGalaxieFormModel(galaxyFormParams);
        Galaxy galaxy = galaxyBuilder.buildGalaxy(galaxyFormModel);
        galaxyRepository.save(galaxy);

        return new View("galaxy-home", galaxy);
    }
}
