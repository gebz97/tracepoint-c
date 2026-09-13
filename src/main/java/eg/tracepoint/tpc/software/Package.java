package eg.tracepoint.tpc.software;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "packages")
public class Package {
    @Id
    private String qualifier;
    private String name;
    private String version;
    private String release;
    private String arch;
    private String license;
}
