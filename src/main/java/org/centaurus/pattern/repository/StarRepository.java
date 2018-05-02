package org.centaurus.pattern.repository;

import org.centaurus.pattern.entity.Star;

import java.util.List;

public interface StarRepository {
    Star findById(Integer id);
    Star save(Star star);
    void update(Star star);
    void delete(Star star);
    List<Star> listAll();
}
