package eg.tracepoint.tpc.hosts;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hosts")
public class Host {
    @Id
    private Long id;
    private String host;
    private String ipv4Address;
    private String osFamily;
}
