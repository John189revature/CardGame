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
public class Tries {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tryId;
    @Column
    private int userId;
    @Column
    private int numberOfTries;

    public enum tries{
        ONE,
        THREE,
        FIVE
    }
}
