package appointmentsService.controller;

import appointmentsService.model.Location;
import appointmentsService.repository.LocationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class LocationController {
    private LocationRepository locationRepository;

    public LocationController(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @GetMapping("")
    public List<Location> locationIndex () {
        return locationRepository.findAll();
    }

}
