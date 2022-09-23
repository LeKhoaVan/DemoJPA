package kttkpm15b.DemoJPA.service;

import kttkpm15b.DemoJPA.model.ChuyenBay;
import kttkpm15b.DemoJPA.model.MayBay;
import kttkpm15b.DemoJPA.repository.ChuyenBayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChuyenBayService {
    private ChuyenBayRepository chuyenBayRepository;
    public ChuyenBayService(ChuyenBayRepository chuyenBayRepository){
        this.chuyenBayRepository = chuyenBayRepository;
    }

    public List<ChuyenBay> findByGa(String name){
        return chuyenBayRepository.findbyGa(name);
    }

}
