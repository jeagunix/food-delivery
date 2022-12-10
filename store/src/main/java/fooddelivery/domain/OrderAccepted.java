package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderAccepted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String foodId;
    private String address;

    public OrderAccepted(OrderManagement aggregate){
        super(aggregate);
    }
    public OrderAccepted(){
        super();
    }
}
