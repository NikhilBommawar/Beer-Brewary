package boot.springframework.BeerBrewary.web.model;

import lombok.*;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDto {

    private UUID id;
    private String name;

}
