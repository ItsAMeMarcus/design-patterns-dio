package diodesafio.designpattern.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Usuario {
    @Id
    @NonNull
    private Long id;
    @NonNull
    private String nome;
    @NonNull
    private String email;
    private List<Carro> pedidos;
}
