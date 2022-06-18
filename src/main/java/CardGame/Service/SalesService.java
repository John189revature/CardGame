package CardGame.Service;

import CardGame.DAO.SalesRepository;
import CardGame.Model.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalesService {
    SalesRepository salesRepository;

    @Autowired
    public SalesService(SalesRepository salesRepository) {
        this.salesRepository = salesRepository;
    }
    public List<Sales> getAllSales(){
        return salesRepository.findAll();
    }
}