package CardGame.Controller;

import CardGame.Model.Tries;
import CardGame.Service.TriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tries")
public class TriesController {
    TriesService triesService;

    @Autowired
    public TriesController(TriesService triesService) {
        this.triesService = triesService;
    }

    @GetMapping
    public List<Tries> getAllTries() {
        return triesService.getAllTries();
    }
}