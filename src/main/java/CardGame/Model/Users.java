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
public class Users {
    @Id
    @Column
    private String userId;
    @Column
    private String email;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private boolean isOnline;
}
