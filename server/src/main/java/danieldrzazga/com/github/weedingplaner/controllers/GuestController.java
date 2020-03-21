package danieldrzazga.com.github.weedingplaner.controllers;

import danieldrzazga.com.github.weedingplaner.dtos.GuestDto;
import danieldrzazga.com.github.weedingplaner.service.GuestService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by "Daniel Drzazga" on 21.03.2020
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class GuestController {

    private final GuestService guestService;

    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    @GetMapping("/guests")
    public Collection<GuestDto> getGuests(){
        return guestService.findAll();
    }
}
