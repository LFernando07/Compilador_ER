package org.example.misArchivos.AuxiliarClass;

public class RenderToken {

    private String tipo;
    private String id;

    private String valor;

    public RenderToken(String tipo, String id, String valor){
        this.tipo = tipo;
        this.id = id;
        this.valor = valor;
    }

    public RenderToken(String tipo, String id){
        this.tipo = tipo;
        this.id = id;
        this.valor = "";
    }

    public String getId(){
        return this.id;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String getValor(){return this.valor;}

    @Override
    public String toString(){
        return STR."Tipo: \{tipo} Id: \{id} Valor: \{valor} ";
    }
}
