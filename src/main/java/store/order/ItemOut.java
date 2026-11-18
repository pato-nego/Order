package store.order;

import java.math.BigDecimal;
import java.util.UUID;

public record ItemOut(

    UUID id,
    Product product,
    Integer quantity,
    BigDecimal total

) {

    public record Product(UUID id) {

    }

}
