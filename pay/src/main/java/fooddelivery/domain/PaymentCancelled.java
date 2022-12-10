package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class PaymentCancelled extends AbstractEvent {

    private Long id;
    private String orderId;

    public PaymentCancelled(결제이력 aggregate){
        super(aggregate);
    }
    public PaymentCancelled(){
        super();
    }
}
