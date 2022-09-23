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

    @Override
    public String toString() {
        return "ChuyenBay{" +
                "maCB='" + maCB + '\'' +
                ", gaDi='" + gaDi + '\'' +
                ", gaDen='" + gaDen + '\'' +
                ", doDai=" + doDai +
                ", gioDi=" + gioDi +
                ", gioDen=" + gioDen +
                ", chiPhi=" + chiPhi +
                '}';
    }
}
