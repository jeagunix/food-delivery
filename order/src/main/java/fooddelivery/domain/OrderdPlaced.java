package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderdPlaced extends AbstractEvent {

    private Long id;
    private String foodId;
    private Integer qty;
    private Long orderId;

    public OrderdPlaced(Order aggregate){
        super(aggregate);
    }
    public OrderdPlaced(){
        super();
    }
}
