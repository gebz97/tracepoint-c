package eg.tracepoint.tpc.lifecycle;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "services")
@Getter
@Setter
@AllArgsConstructor
public class Service {
    @Id
    private String name;
    private String description;    
}
