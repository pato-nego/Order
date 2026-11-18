package store.order;

import java.util.List;
import java.util.UUID;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;

@FeignClient(
    name="order",
    url="http://order:8080"
)
public interface OrderController {

    @PostMapping("/orders")
    public ResponseEntity<OrderOut> create(
        @RequestHeader(value = "id-account", required = false) String idAccount,
        @Valid @RequestBody OrderIn in
    );

    @GetMapping("/orders")
    public ResponseEntity<List<OrderSummaryOut>> findAll(
        @RequestHeader(value = "id-account", required = false) String idAccount
    );

    @GetMapping("/orders/{id}")
    public ResponseEntity<OrderOut> findById(
        @RequestHeader(value = "id-account", required = false) String idAccount,
        @PathVariable("id") UUID id,
        @RequestParam(value = "currency", required = false) String currency
    );

    @GetMapping("/orders/health-check")
    public ResponseEntity<Void> healthCheck();

}
