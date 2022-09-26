package kttkpm15b.DemoJPA.resource;

import kttkpm15b.DemoJPA.service.NhanVienService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nhanvien")
public class NhanVienController {
    private final NhanVienService nhanVienService;
    public NhanVienController(NhanVienService nhanVienService){
        this.nhanVienService = nhanVienService;
    }
    @GetMapping("/tong-luong")
    public ResponseEntity sumLuong(){
        return new ResponseEntity<>(nhanVienService.sumLuong(), HttpStatus.OK);
    }

    @GetMapping("/phicong-boeing")
    public ResponseEntity findNVByBoeing(@RequestParam("loai") String loai){
        return new ResponseEntity<>(nhanVienService.findNVByBoe(loai), HttpStatus.OK);
    }
    @GetMapping("/find-pc-bymb")
    public ResponseEntity findNVByMB(@RequestParam("ma") String ma){
        return  new ResponseEntity<>(nhanVienService.findByNVMB(ma), HttpStatus.OK);
    }

    @GetMapping("/nhanvien-not-phicong")
    public ResponseEntity findNVNotPC(){
        return new ResponseEntity<>(nhanVienService.findByNotPC(), HttpStatus.OK);
    }
}
