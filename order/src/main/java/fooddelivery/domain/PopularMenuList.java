package fooddelivery.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="PopularMenuList_table")
@Data
public class PopularMenuList {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}
