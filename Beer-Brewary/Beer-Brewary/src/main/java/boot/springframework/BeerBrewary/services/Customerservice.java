package boot.springframework.BeerBrewary.services;

import boot.springframework.BeerBrewary.web.model.CustomerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;


public interface Customerservice {
       CustomerDto getCustomerById(UUID customerId);
}
