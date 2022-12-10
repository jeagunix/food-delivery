package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderRejected extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String foodId;
    private String address;

    public OrderRejected(OrderManagement aggregate){
        super(aggregate);
    }
    public OrderRejected(){
        super();
    }
}
