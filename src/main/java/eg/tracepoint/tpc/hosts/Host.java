package eg.tracepoint.tpc.hosts;

import java.util.List;
import eg.tracepoint.tpc.lifecycle.LifecycleEnvironment;
import eg.tracepoint.tpc.lifecycle.Service;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
    private String name;
    private String ipv4Address;
    private String shortname;
    private String fqdn;
    private String osFamily;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service")
    private Service service;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "environment")
    private LifecycleEnvironment lifecycleEnvironment;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "host_packages",
        joinColumns = @JoinColumn(name = "package_id"),
        inverseJoinColumns = @JoinColumn(name = "host_id")
    )
    private List<Package> packages;
}
