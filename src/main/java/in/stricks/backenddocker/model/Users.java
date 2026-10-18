package in.stricks.backenddocker.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name="users")
@Data
public class Users {
    @Id
    private UUID id;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false,name="created_at")
    private String createdAt;
}
