package com.br.cidacastello.java.paciente.domain.model;

/**
 *
 * @author Cida
 */
public enum SexoVO {

    FEMININO(1, "Feminino"),
    MASCULINO(2, "Masculino");
    //atributos
    private Integer id;
    private String descricao;

    private SexoVO(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public static SexoVO valueof(Integer id) {
        for (SexoVO vo : values()) {
            if (vo.getId().equals(id)) {
                return vo;
            }
        }
        return null;
    }
    
   public String toString(){
       return this.descricao;
   }
}
