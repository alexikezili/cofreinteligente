package br.com.bra.cofreinteligente.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Movimentacoes {
    @Id
    private Long id;
    private long numero_Cofre;
    private LocalDateTime data;
    private BigDecimal valor_Recolhido;
}
