package danieldrzazga.com.github.weedingplaner.service.impl;

import danieldrzazga.com.github.weedingplaner.dtos.GuestDto;
import danieldrzazga.com.github.weedingplaner.exceptions.GuestNotFoundException;
import danieldrzazga.com.github.weedingplaner.model.Guest;
import danieldrzazga.com.github.weedingplaner.repositories.GuestRepository;
import danieldrzazga.com.github.weedingplaner.service.GuestService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by "Daniel Drzazga" on 21.03.2020
 */
@Service
public class GuestServiceImpl implements GuestService {

    private final GuestRepository guestRepository;
    private final MapperFacade mapperFacade;

    public GuestServiceImpl(GuestRepository guestRepository, MapperFacade mapperFacade) {
        this.guestRepository = guestRepository;
        this.mapperFacade = mapperFacade;
    }

    @Override
    public Collection<GuestDto> findAll() {
        List<Guest> guests = guestRepository.findAll();

        return guests
                .stream()
                .map(guest -> mapperFacade.map(guest, GuestDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public GuestDto findById(long id) {
        return mapperFacade.map(guestRepository.findById(id).orElseThrow( () -> new GuestNotFoundException(id))
                , GuestDto.class);
    }

    @Override
    public void deleteById(long id) {
        guestRepository.delete(guestRepository.findById(id).get());
    }

    @Override
    public void saveAndUpdate(GuestDto guestDto) {
        guestRepository.save(mapperFacade.map(guestDto, Guest.class));
    }

}
