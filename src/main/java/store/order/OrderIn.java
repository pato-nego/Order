package store.order;

import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record OrderIn(

    @NotEmpty List<@NotNull @Valid ItemIn> items

) {

}
