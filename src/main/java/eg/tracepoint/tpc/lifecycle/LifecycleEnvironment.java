package eg.tracepoint.tpc.lifecycle;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LifecycleEnvironment {
    @Id
    private String name;
}
