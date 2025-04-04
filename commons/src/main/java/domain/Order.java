package domain;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Long id;
    private Long customerId;
    private Long productId;
    private int productCount;
    private double price;
    private OrderStatus status;
    private OrderSource source;
}