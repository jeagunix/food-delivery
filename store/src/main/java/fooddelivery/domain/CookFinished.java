package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class CookFinished extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String foodId;
    private String address;

    public CookFinished(OrderManagement aggregate){
        super(aggregate);
    }
    public CookFinished(){
        super();
    }
}
