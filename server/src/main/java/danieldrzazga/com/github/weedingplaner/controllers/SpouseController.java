package danieldrzazga.com.github.weedingplaner.controllers;

import danieldrzazga.com.github.weedingplaner.model.Spouse;
import danieldrzazga.com.github.weedingplaner.model.Token;
import danieldrzazga.com.github.weedingplaner.service.SpouseService;
import danieldrzazga.com.github.weedingplaner.service.TokenService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by "Daniel Drzazga" on 25.03.2020
 */
@RestController
public class SpouseController {

    private final SpouseService spouseService;
    private final TokenService tokenService;

    public SpouseController(SpouseService spouseService, TokenService tokenService) {
        this.spouseService = spouseService;
        this.tokenService = tokenService;
    }

    @PostMapping("/register")
    public void register(Spouse spouse) {
        spouseService.createSpouse(spouse);
    }

    @GetMapping("/token")
    public void singUp(@RequestParam String value) {
        Token byValue = tokenService.findByToken(value);
        Spouse spouse = byValue.getSpouse();
        spouse.setEnabled(true);
        spouseService.updateSpouse(spouse);
    }


}
