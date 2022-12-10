package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class WriteReview extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String revuew;
    private String point;

    public WriteReview(Review aggregate){
        super(aggregate);
    }
    public WriteReview(){
        super();
    }
}
