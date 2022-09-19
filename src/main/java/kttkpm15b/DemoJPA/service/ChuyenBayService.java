package kttkpm15b.DemoJPA.service;

import kttkpm15b.DemoJPA.model.ChuyenBay;
import kttkpm15b.DemoJPA.repository.ChuyenBayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChuyenBayService {
    @Autowired
    ChuyenBayRepository chuyenBayRepository;

    public List<ChuyenBay> findByGa(){
       return chuyenBayRepository.findbyGa();
    }
}
