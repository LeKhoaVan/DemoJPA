package kttkpm15b.DemoJPA.repository;

import kttkpm15b.DemoJPA.model.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
    @Query(nativeQuery = true, value = "select * from chuyenbay where ga_den = 'DAD' ")
    public List<ChuyenBay> findbyGa();
}
