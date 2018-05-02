package org.centaurus.pattern.service;

import org.centaurus.pattern.component.Request;

import java.util.Map;

public interface StarParamsExtractor {
    Map<String, Object> extractStarFormParams(Request request);
}
