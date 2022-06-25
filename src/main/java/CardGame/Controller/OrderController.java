package CardGame.Controller;

import CardGame.Model.Order;
import CardGame.Model.Product;
import CardGame.Service.OrderService;
import CardGame.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("order")
public class OrderController {
    OrderService orderService;
    @Autowired
    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }
    @GetMapping
    public List<Order> getAllOrder(){
        return orderService.getAllOrder();
    }
    @PostMapping
    public void createOrder(@RequestBody Order o){
        orderService.createOrder(o);
    }

    @PostMapping("/updateOrder")
    public Order update(@RequestBody Order order){
        orderService.update(order);
        return order;
    }
}
