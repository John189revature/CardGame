package CardGame.Service;

import CardGame.DAO.OrderRepository;
import CardGame.DAO.ProductRepository;
import CardGame.Model.Order;
import CardGame.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderService {
    OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrder() {
        return orderRepository.findAll();
    }

    public void createOrder(Order o) {
        orderRepository.save(o);
    }

    public void update(Order orders) {
        orderRepository.save(orders);
    }
}
