package kttkpm15b.DemoJPA.repository;

import kttkpm15b.DemoJPA.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien,String> {
    @Query(nativeQuery = true, value = "select * from nhanvien where luong > :luongcb")
    public List<NhanVien> findLuongGreateThan(@Param("luongcb") int luongcb);

    @Query(nativeQuery = true, value = "select sum(luong) from nhanvien")
    public float sumLuong();
}
