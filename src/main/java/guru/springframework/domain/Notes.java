package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;

/**
 * @author XIAO JIN
 * @date 2021/04/09/ 11:19
 */
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
