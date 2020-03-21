package danieldrzazga.com.github.weedingplaner.service;

import danieldrzazga.com.github.weedingplaner.dtos.GuestDto;

import java.util.Collection;

/**
 * Created by "Daniel Drzazga" on 21.03.2020
 */
public interface GuestService {

    Collection<GuestDto> findAll();
}
