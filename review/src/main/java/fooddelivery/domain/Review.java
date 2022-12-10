package fooddelivery.domain;

import fooddelivery.domain.WriteReview;
import fooddelivery.ReviewApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Review_table")
@Data

public class Review  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long orderId;
    
    
    
    
    
    private String review;
    
    
    
    
    
    private String poinit;
    
    
    
    
    
    private String date;

    @PostPersist
    public void onPostPersist(){


        WriteReview writeReview = new WriteReview(this);
        writeReview.publishAfterCommit();

    }

    public static ReviewRepository repository(){
        ReviewRepository reviewRepository = ReviewApplication.applicationContext.getBean(ReviewRepository.class);
        return reviewRepository;
    }




    public static void writeReview(Delivered delivered){

        /** Example 1:  new item 
        Review review = new Review();
        repository().save(review);

        */

        /** Example 2:  finding and process
        
        repository().findById(delivered.get???()).ifPresent(review->{
            
            review // do something
            repository().save(review);


         });
        */

        
    }


}
