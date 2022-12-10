package fooddelivery.infra;
import fooddelivery.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class NotificationRecordHateoasProcessor implements RepresentationModelProcessor<EntityModel<NotificationRecord>>  {

    @Override
    public EntityModel<NotificationRecord> process(EntityModel<NotificationRecord> model) {

        
        return model;
    }
    
}
