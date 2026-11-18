package store.order;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record ItemIn(

    @NotNull UUID idProduct,
    @NotNull @Positive Integer quantity

) {

}
