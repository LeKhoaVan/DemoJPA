package kttkpm15b.DemoJPA;

import kttkpm15b.DemoJPA.model.ChuyenBay;
import kttkpm15b.DemoJPA.model.MayBay;
import kttkpm15b.DemoJPA.service.ChuyenBayService;
import kttkpm15b.DemoJPA.service.MayBayService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoJpaApplicationTests {

	@Autowired
	ChuyenBayService chuyenBayService;
	@Autowired
	MayBayService mayBayService;
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

}
