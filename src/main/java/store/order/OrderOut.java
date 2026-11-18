package store.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record OrderOut(

    UUID id,
    LocalDateTime date,
    String currency,
    List<ItemOut> items,
    BigDecimal total

) {

}
