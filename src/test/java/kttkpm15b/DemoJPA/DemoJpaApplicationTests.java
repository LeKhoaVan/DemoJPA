package kttkpm15b.DemoJPA;

import kttkpm15b.DemoJPA.model.ChuyenBay;
import kttkpm15b.DemoJPA.service.ChuyenBayService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoJpaApplicationTests {

	@Autowired
	ChuyenBayService chuyenBayService;
	@Test
	void contextLoads() {
	}

	@Test
	void findByDD(){
		for(ChuyenBay cb : chuyenBayService.findByGa("DAD")){
			System.out.println(cb.toString());
		}
	}

}
