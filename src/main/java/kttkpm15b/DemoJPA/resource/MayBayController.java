package kttkpm15b.DemoJPA.resource;

import kttkpm15b.DemoJPA.service.MayBayService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/maybay")
public class MayBayController {
    private final MayBayService mayBayService;
    public MayBayController(MayBayService mayBayService){
        this.mayBayService = mayBayService;
    }
    @GetMapping("/tam-bay")
    public ResponseEntity findTamBay(@RequestParam("mim") int min){
        return new ResponseEntity<>(mayBayService.findByTamBay(min), HttpStatus.OK);
    }

    @GetMapping("/loai")
    public ResponseEntity findByLoai (@RequestParam("loai") String loai){
        return new ResponseEntity(mayBayService.findByLoai(loai), HttpStatus.OK);
    }
}
