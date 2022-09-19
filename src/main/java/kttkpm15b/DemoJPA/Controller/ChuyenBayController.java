package kttkpm15b.DemoJPA.Controller;

import kttkpm15b.DemoJPA.service.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chuyenbay")
public class ChuyenBayController {
    @Autowired
    ChuyenBayService chuyenBayService;

    @GetMapping("/ga-den")
    public ResponseEntity<?>findByGa(){
        return new ResponseEntity<>(chuyenBayService.findByGa(), HttpStatus.OK);
    }

   
}
