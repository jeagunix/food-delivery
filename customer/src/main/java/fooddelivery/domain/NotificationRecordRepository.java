package fooddelivery.domain;

import fooddelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="notificationRecords", path="notificationRecords")
public interface NotificationRecordRepository extends PagingAndSortingRepository<NotificationRecord, Long>{

}
