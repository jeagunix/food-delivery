package fooddelivery.domain;

import fooddelivery.CustomerApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="NotificationRecord_table")
@Data

public class NotificationRecord  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String message;


    public static NotificationRecordRepository repository(){
        NotificationRecordRepository notificationRecordRepository = CustomerApplication.applicationContext.getBean(NotificationRecordRepository.class);
        return notificationRecordRepository;
    }




    public static void kakaoNotifiction(OrderCanceled orderCanceled){

        /** Example 1:  new item 
        NotificationRecord notificationRecord = new NotificationRecord();
        repository().save(notificationRecord);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(notificationRecord->{
            
            notificationRecord // do something
            repository().save(notificationRecord);


         });
        */

        
    }
    public static void kakaoNotifiction(OrderdPlaced orderdPlaced){

        /** Example 1:  new item 
        NotificationRecord notificationRecord = new NotificationRecord();
        repository().save(notificationRecord);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderdPlaced.get???()).ifPresent(notificationRecord->{
            
            notificationRecord // do something
            repository().save(notificationRecord);


         });
        */

        
    }
    public static void kakaoNotifiction(CookFinished cookFinished){

        /** Example 1:  new item 
        NotificationRecord notificationRecord = new NotificationRecord();
        repository().save(notificationRecord);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookFinished.get???()).ifPresent(notificationRecord->{
            
            notificationRecord // do something
            repository().save(notificationRecord);


         });
        */

        
    }
    public static void kakaoNotifiction(CookStarted cookStarted){

        /** Example 1:  new item 
        NotificationRecord notificationRecord = new NotificationRecord();
        repository().save(notificationRecord);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookStarted.get???()).ifPresent(notificationRecord->{
            
            notificationRecord // do something
            repository().save(notificationRecord);


         });
        */

        
    }
    public static void kakaoNotifiction(OrderRejected orderRejected){

        /** Example 1:  new item 
        NotificationRecord notificationRecord = new NotificationRecord();
        repository().save(notificationRecord);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderRejected.get???()).ifPresent(notificationRecord->{
            
            notificationRecord // do something
            repository().save(notificationRecord);


         });
        */

        
    }
    public static void kakaoNotifiction(OrderAccepted orderAccepted){

        /** Example 1:  new item 
        NotificationRecord notificationRecord = new NotificationRecord();
        repository().save(notificationRecord);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderAccepted.get???()).ifPresent(notificationRecord->{
            
            notificationRecord // do something
            repository().save(notificationRecord);


         });
        */

        
    }
    public static void kakaoNotifiction(Picked picked){

        /** Example 1:  new item 
        NotificationRecord notificationRecord = new NotificationRecord();
        repository().save(notificationRecord);

        */

        /** Example 2:  finding and process
        
        repository().findById(picked.get???()).ifPresent(notificationRecord->{
            
            notificationRecord // do something
            repository().save(notificationRecord);


         });
        */

        
    }
    public static void kakaoNotifiction(Delivered delivered){

        /** Example 1:  new item 
        NotificationRecord notificationRecord = new NotificationRecord();
        repository().save(notificationRecord);

        */

        /** Example 2:  finding and process
        
        repository().findById(delivered.get???()).ifPresent(notificationRecord->{
            
            notificationRecord // do something
            repository().save(notificationRecord);


         });
        */

        
    }
    public static void appNotification(Picked picked){

        /** Example 1:  new item 
        NotificationRecord notificationRecord = new NotificationRecord();
        repository().save(notificationRecord);

        */

        /** Example 2:  finding and process
        
        repository().findById(picked.get???()).ifPresent(notificationRecord->{
            
            notificationRecord // do something
            repository().save(notificationRecord);


         });
        */

        
    }


}
