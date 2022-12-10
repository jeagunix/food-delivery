package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class CookStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String foodId;
    private String address;

    public CookStarted(OrderManagement aggregate){
        super(aggregate);
    }
    public CookStarted(){
        super();
    }
}
