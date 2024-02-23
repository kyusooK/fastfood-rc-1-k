package fastfood.store.domain;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Table(name = "stores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderId;
    private String userId;
    private Long menuId;
    private String menuName;
    private Integer qty;
    private String address;
    private String status;

    @Temporal(TemporalType.TIMESTAMP)
    private Date cookingDt;

    
}