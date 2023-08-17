package boot.springframework.BeerBrewary.services;

import boot.springframework.BeerBrewary.web.model.CustomerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerserviceImpl implements Customerservice {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Shailesh")
                .build();
    }
}
