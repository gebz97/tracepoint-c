package eg.tracepoint.tpc.hosts;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Host {
    @Id
    private Long id;
    private String host;
    private String ipv4Address;
    private String osFamily;
}
