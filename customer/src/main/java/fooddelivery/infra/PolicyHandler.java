package fooddelivery.infra;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import fooddelivery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import fooddelivery.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired NotificationRecordRepository notificationRecordRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCanceled'")
    public void wheneverOrderCanceled_KakaoNotifiction(@Payload OrderCanceled orderCanceled){

        OrderCanceled event = orderCanceled;
        System.out.println("\n\n##### listener KakaoNotifiction : " + orderCanceled + "\n\n");


        

        // Sample Logic //
        NotificationRecord.kakaoNotifiction(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderdPlaced'")
    public void wheneverOrderdPlaced_KakaoNotifiction(@Payload OrderdPlaced orderdPlaced){

        OrderdPlaced event = orderdPlaced;
        System.out.println("\n\n##### listener KakaoNotifiction : " + orderdPlaced + "\n\n");


        

        // Sample Logic //
        NotificationRecord.kakaoNotifiction(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookFinished'")
    public void wheneverCookFinished_KakaoNotifiction(@Payload CookFinished cookFinished){

        CookFinished event = cookFinished;
        System.out.println("\n\n##### listener KakaoNotifiction : " + cookFinished + "\n\n");


        

        // Sample Logic //
        NotificationRecord.kakaoNotifiction(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookStarted'")
    public void wheneverCookStarted_KakaoNotifiction(@Payload CookStarted cookStarted){

        CookStarted event = cookStarted;
        System.out.println("\n\n##### listener KakaoNotifiction : " + cookStarted + "\n\n");


        

        // Sample Logic //
        NotificationRecord.kakaoNotifiction(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderRejected'")
    public void wheneverOrderRejected_KakaoNotifiction(@Payload OrderRejected orderRejected){

        OrderRejected event = orderRejected;
        System.out.println("\n\n##### listener KakaoNotifiction : " + orderRejected + "\n\n");


        

        // Sample Logic //
        NotificationRecord.kakaoNotifiction(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderAccepted'")
    public void wheneverOrderAccepted_KakaoNotifiction(@Payload OrderAccepted orderAccepted){

        OrderAccepted event = orderAccepted;
        System.out.println("\n\n##### listener KakaoNotifiction : " + orderAccepted + "\n\n");


        

        // Sample Logic //
        NotificationRecord.kakaoNotifiction(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Picked'")
    public void wheneverPicked_KakaoNotifiction(@Payload Picked picked){

        Picked event = picked;
        System.out.println("\n\n##### listener KakaoNotifiction : " + picked + "\n\n");


        

        // Sample Logic //
        NotificationRecord.kakaoNotifiction(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Delivered'")
    public void wheneverDelivered_KakaoNotifiction(@Payload Delivered delivered){

        Delivered event = delivered;
        System.out.println("\n\n##### listener KakaoNotifiction : " + delivered + "\n\n");


        

        // Sample Logic //
        NotificationRecord.kakaoNotifiction(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Picked'")
    public void wheneverPicked_AppNotification(@Payload Picked picked){

        Picked event = picked;
        System.out.println("\n\n##### listener AppNotification : " + picked + "\n\n");


        

        // Sample Logic //
        NotificationRecord.appNotification(event);
        

        

    }

}


