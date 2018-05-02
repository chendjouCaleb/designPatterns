package org.centaurus.pattern.service;

import org.centaurus.pattern.component.Request;

import java.util.Map;

public interface GalaxyParamsExtractor {
    Map<String, Object> extractGalaxyFormParams(Request request);
}
