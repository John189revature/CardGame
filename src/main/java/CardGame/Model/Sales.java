package CardGame.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Sales {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int salesId;
    @Column
    private String salesDescription;
    @Column
    private Double salesAmount;
    @Column
    private paymentStatus salesType;

    public enum paymentStatus{
        PENDING,
        APPROVED,
        DENIED
    }
}