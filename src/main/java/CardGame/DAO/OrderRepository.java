package CardGame.DAO;

import CardGame.Model.Order;
import CardGame.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderRepository extends JpaRepository<Order, Integer> {


    @Query("from Order where orderId = :orderId")
    Product findOrderById(@Param("orderId") String id);

    @Query("from Order")
    public List<Order> findAll();
}