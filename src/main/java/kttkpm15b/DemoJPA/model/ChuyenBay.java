package kttkpm15b.DemoJPA.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Setter             //(value = AccessLevel.PACKAGE) chỉ cho phương thức set trong cùng package
@Getter
public class ChuyenBay {
    @Id
    private String maCB;
    private String gaDi;
    @Column(name = "ga_den")
    private String gaDen;
    private int doDai;
    private LocalDateTime gioDi;
    private LocalDateTime gioDen;
    private int chiPhi;

    public String getMaCB() {
        return maCB;
    }

    public String getDaDi() {
        return gaDi;
    }

    public String getGaDen() {
        return gaDen;
    }

    public int getDoDai() {
        return doDai;
    }

    public LocalDateTime getGioDi() {
        return gioDi;
    }

    public LocalDateTime getGioDen() {
        return gioDen;
    }

    public int getChiPhi() {
        return chiPhi;
    }
}
