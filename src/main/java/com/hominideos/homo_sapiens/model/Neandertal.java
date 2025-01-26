// Pacote da classe
package com.hominideos.homo_sapiens.model;

// Importação de anotações JPA
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

// Importação de anotações do Lombok para geração de métodos automaticamente
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// A anotação @Entity indica que esta classe é uma entidade JPA, ou seja, 
// será mapeada para uma tabela em um banco de dados relacional.
@Entity

// A anotação @DiscriminatorValue("neandertal") é usada para indicar o valor do discriminador
// para a subclasse "Neandertal" na hierarquia de classes JPA. Isso ajuda a identificar
// corretamente as instâncias dessa subclasse na tabela de herança.
@DiscriminatorValue("neandertal")

// A anotação @ToString(callSuper = true) sobrescreve o método toString da classe. 
// O parâmetro callSuper = true faz com que o método toString da classe pai (Homo) também 
// seja chamado, incluindo seus atributos na string gerada.
@ToString(callSuper = true)

// As anotações @Getter e @Setter são do Lombok e geram automaticamente os métodos getters
// e setters para os atributos da classe. 
@Getter
@Setter

// Definição da classe Neandertal que estende a classe Homo.
public class Neandertal extends Homo {

    // Atributo específico da classe Neandertal que indica o tamanho da tribo.
    // Este atributo será mapeado para uma coluna correspondente na tabela do banco de dados.
    private Integer tamanhoTribo;
}

