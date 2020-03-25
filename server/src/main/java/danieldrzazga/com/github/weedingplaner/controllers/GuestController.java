package danieldrzazga.com.github.weedingplaner.controllers;

import danieldrzazga.com.github.weedingplaner.dtos.GuestDto;
import danieldrzazga.com.github.weedingplaner.service.GuestService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/guests/{id}")
    public GuestDto getGuest(@PathVariable("id") long id){
        return guestService.findById(id);
    }

    @PostMapping("/guests")
    public void addGuest(@RequestBody GuestDto guestDto){
        guestService.saveAndUpdate(guestDto);
    }

    @DeleteMapping("/guests/{id}")
    public void removeGuest(@PathVariable("id") long id){
        guestService.deleteById(id);
    }

}
