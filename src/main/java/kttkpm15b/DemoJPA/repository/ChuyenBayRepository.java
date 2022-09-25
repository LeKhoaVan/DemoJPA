package kttkpm15b.DemoJPA.repository;

import kttkpm15b.DemoJPA.model.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
    @Query(nativeQuery = true, value = "select * from chuyenbay where ga_den = :name ")
    public List<ChuyenBay> findbyGa(@Param("name") String name);

    @Query(nativeQuery = true, value = "select * from chuyenbay where do_dai < :max and do_dai > :min")
    public List<ChuyenBay> findByDoDai(@Param("max") int max,
                                       @Param("min") int min);


}
