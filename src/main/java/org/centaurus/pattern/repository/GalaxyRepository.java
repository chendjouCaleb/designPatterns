package org.centaurus.pattern.repository;

import org.centaurus.pattern.entity.Galaxy;

import java.util.List;

public interface GalaxyRepository {
    Galaxy findById(Integer id);
    Galaxy save(Galaxy galaxy);
    void update(Galaxy galaxy);
    void delete(Galaxy galaxy);
    List<Galaxy> listAll();
}
