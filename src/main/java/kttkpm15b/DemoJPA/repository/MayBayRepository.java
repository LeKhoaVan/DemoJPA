package kttkpm15b.DemoJPA.repository;

import kttkpm15b.DemoJPA.model.MayBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay,Integer> {
    @Query(nativeQuery = true, value = "select * from maybay where tam_bay > :tambay ")
    public List<MayBay> findByTamBayGreaterThan(@Param("tambay") Integer tambay);

    @Query(nativeQuery = true, value = "select * from maybay where loai like :loaimb"+"%")
    public List<MayBay> findByLoai(@Param("loaimb") String loai);
}
