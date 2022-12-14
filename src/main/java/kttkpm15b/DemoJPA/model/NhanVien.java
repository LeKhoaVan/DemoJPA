package kttkpm15b.DemoJPA.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "nhanvien")
public class NhanVien {
    @Column(name = "ma_nv")
    @Id
    private String maNV;

    @Column(name =  "ten")
    private String ten;

    @Column(name = "luong")
    private int luong;

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNV='" + maNV + '\'' +
                ", ten='" + ten + '\'' +
                ", luong=" + luong +
                '}';
    }
}
