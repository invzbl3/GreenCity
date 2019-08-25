package greencity.service;

import greencity.entity.Location;
import java.util.List;

public interface LocationService {
    List<Location> findAll();

    Location findById(Long id);

    Location save(Location location);

    Location update(Long id, Location location);

    void deleteById(Long id);
}