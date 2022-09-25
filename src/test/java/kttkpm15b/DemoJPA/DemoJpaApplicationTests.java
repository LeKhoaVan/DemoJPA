package kttkpm15b.DemoJPA;

import kttkpm15b.DemoJPA.model.ChuyenBay;
import kttkpm15b.DemoJPA.model.MayBay;
import kttkpm15b.DemoJPA.model.NhanVien;
import kttkpm15b.DemoJPA.service.ChuyenBayService;
import kttkpm15b.DemoJPA.service.MayBayService;
import kttkpm15b.DemoJPA.service.NhanVienService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoJpaApplicationTests {

	@Autowired
	ChuyenBayService chuyenBayService;
	@Autowired
	MayBayService mayBayService;

	@Autowired
	NhanVienService nhanVienService;
	@Test
	void contextLoads() {
	}

	@Test
	void findByDD(){
		for(ChuyenBay cb : chuyenBayService.findByGa("DAD")){
			System.out.println(cb.toString());
		}
	}

	@Test
	void findByTamBay(){

		for(MayBay mb : mayBayService.findByTamBay(10000) ){
			System.out.println(mb.toString());
		}
	}

	@Test
	void findByLuongGreateThan() {
		for(NhanVien nv : nhanVienService.findByLuongGreateThan(10000) ){
			System.out.println(nv.toString());
		}
	}

	@Test
	void findByDoDaiTest(){
		for(ChuyenBay cb : chuyenBayService.findByDoDai(10000,8000) ){
			System.out.println(cb.toString());
		}
	}

	@Test
	void findByGaDiDen(){
		for(ChuyenBay cb : chuyenBayService.findByGaDenDi("SGN","BMV") ){
			System.out.println(cb.toString());
		}
	}

	@Test
	void countByGaDi(){
		System.out.format("So chuyen bay tu Sai Gon: %d",chuyenBayService.countByGaDi("SGN"));
	}

	@Test
	void findByLoai(){
		for(MayBay mb : mayBayService.findByLoai("Boeing")){
			System.out.println(mb.toString());
		}
	}

	@Test
	void countLuong(){
		System.out.format("Tong tien luong nhan vien: %f",nhanVienService.sumLuong());
	}

	@Test
	void findMVByBoe(){
		for (String maNV : nhanVienService.findNVByBoe("Boeing")){
			System.out.format("Ma NV Lay Boeing: %s \n",maNV);
		}
	}
	@Test
	void findByNVMB(){
		for(NhanVien nv : nhanVienService.findByNVMB("747") ){
			System.out.println(nv.toString());
		}
	}

	@Test
	void findMBbyTen(){
		for(String mb : mayBayService.findMBbyTen("Nguyen")){
			System.out.format("Ma may bay do Ho Nguyen lai: %s \n",mb);
		}
	}
}
