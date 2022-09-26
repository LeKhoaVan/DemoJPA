package kttkpm15b.DemoJPA.resource;

import kttkpm15b.DemoJPA.service.ChuyenBayService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chuyenbay")
public class ChuyenBayController {
    private final ChuyenBayService chuyenBayService;
    public ChuyenBayController(ChuyenBayService chuyenBayService){
        this.chuyenBayService = chuyenBayService;
    }
    @GetMapping("/by-ga")
    public ResponseEntity findCBByGa(@RequestParam("ga") String ga){
        return new ResponseEntity<>(chuyenBayService.findByGa(ga), HttpStatus.OK);
    }

    @GetMapping("/do-dai")
    public ResponseEntity findByDoDai(@RequestParam("max") int max,
                                      @RequestParam("min") int min)
    {
        return new ResponseEntity<>(chuyenBayService.findByDoDai(max,min), HttpStatus.OK);
    }
    @GetMapping("/ga-den-ga-di")
    public ResponseEntity findByGaDenGaDi(@RequestParam("ga-di") String gaDi,
                                          @RequestParam("ga-den") String gaDen){
        return new ResponseEntity<>(chuyenBayService.findByGaDenDi(gaDi,gaDen), HttpStatus.OK);
    }

    @GetMapping("/tong-chuyen-tu-ga")
    public ResponseEntity countSumByGa(@RequestParam("gaDi") String gaDi){
        return new ResponseEntity<>(chuyenBayService.countByGaDi(gaDi), HttpStatus.OK);
    }


}
