package org.example;

import org.example.misArchivos.AuxiliarClass.RenderToken;
import org.example.misArchivos.GramaticaBaseVisitor;
import org.example.misArchivos.GramaticaParser;


import java.util.*;

public class MyVisitor extends GramaticaBaseVisitor<Integer> {
    Map<String,Integer> memory=new HashMap<>();
    Vector<RenderToken> tokens = new Vector<>();

    private String error = null;

    private String sucess = null;
    @Override public Integer visitPrule(GramaticaParser.PruleContext ctx) { return visitChildren(ctx); }

    @Override public Integer visitDeclaraciones(GramaticaParser.DeclaracionesContext ctx) {
        //Tipo : BOOL DECIMAL INT
        //Valor: FALSE TRUE INT DECIMAL

        //Dividir en tipo BOOL / NUMERIC
        //Dividir numeric en INT / FLOAT

        //Casos de aceptacion
            /*
            * Si es Bool
                * SOLO ACEPTA TRUE/FALSE
            *
            * SI ES INT
                * SOLO ACEPTA NUMEROS ENTEROS
            *
            * SI ES FLOAT
                * SOLO ACEPTA NUMEROS CON PUNTO DECIMAL
            */

        //Casos de error
            /*
             * Si es Bool
                * NO numeros
             *
             * SI ES INT
                * NO TRUE/FALSE
                * NO NUMEROS CON PUNTO
             *
             * SI ES FLOAT
                * NO TRUE/FALSE
                * NO NUMEROS ENTEROS
             */

        //Desarrollo
        String tipo = ctx.TIPO().getText();

        GramaticaParser.SegundaContext temp = ctx.segunda(); //Variable auxiliar
        int numHijos = temp.getChildCount();

        String valor="";
        if(numHijos > 1)
            valor = temp.getChild(1).getText();

        if(tipo.equals("boolean")){
            //Verificar que se declaro o se asigno
            if(numHijos > 1){
                if(valor.compareTo("true")== 0 || valor.compareTo("false")==0){
                    sucess = "Entrada semantica correcta \t✅✅✅";
                    //System.out.println("Variable booleana asignada");
                }else{
                    error = "Error! Valor incompatible con el tipo de dato \t❌❌❌";
                    //System.out.println("Error booleano");
                }
            }else{
                sucess = "Entrada semantica correcta \t✅✅✅";
                //System.out.println("Variable booleana declarada");
            }
        }else{//Numerico
            if(tipo.equals("int")){
                if(numHijos > 1){
                    if(valor.contains(".") || valor.compareTo("true")==0 || valor.compareTo("false")==0 ){
                        error = "Error! Valor incompatible con el tipo de dato \t❌❌❌";
                        //System.out.println("Error int");
                    }else {
                        sucess = "Entrada semantica correcta \t✅✅✅";
                        //System.out.println("Variable int asignada");
                    }
                }else{
                    sucess = "Entrada semantica correcta \t✅✅✅";
                    //System.out.println("Variable int declarada");
                }
            }else{ //Decimal double / float
                if(numHijos>1){
                    if(!valor.contains(".") || valor.compareTo("true")==0 || valor.compareTo("false")==0 ){
                        error = "Error! Valor incompatible con el tipo de dato \t❌❌❌";
                        //System.out.println("Error float/double");
                    }else {
                        sucess = "Entrada semantica correcta \t✅✅✅";
                        //System.out.println("Variable float/double asignada");
                    }
                }else {
                    sucess = "Entrada semantica correcta \t✅✅✅";
                    //System.out.println("Variable float/double declarada");
                }
            }
        }

        RenderToken aux = new RenderToken(tipo,ctx.getToken(8,0).getText(),valor);

        tokens.add(aux);

        return visitChildren(ctx);

    }
    @Override public Integer visitSegunda(GramaticaParser.SegundaContext ctx) {

        //System.out.println(ctx.getText());
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitTercera(GramaticaParser.TerceraContext ctx) {

        return visitChildren(ctx);

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitValor(GramaticaParser.ValorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitCondicional(GramaticaParser.CondicionalContext ctx) {

        //Evaluar las condicones
        return visitChildren(ctx);

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitCondicion(GramaticaParser.CondicionContext ctx) {

        //Validacion de los identificadores validos
        boolean pass = false;
        RenderToken[] nums = new RenderToken[2];

        if(!tokens.isEmpty()){

            for(int j = 0; j<2; j++) {
                //System.out.println(ctx.ID(j));
                for (int i = 0; i < tokens.size(); i++) {
                    RenderToken x = (RenderToken) tokens.get(i);

                    if (x.getId().compareTo(ctx.ID(j).getText()) == 0 ) {
                        nums[j]= x;
                        //System.out.println("ID VALIDA");
                        pass= true;
                        break;
                    }else {
                        pass = false;
                    }
                }
            }
            //System.out.println(pass);
        }

        //Validar si tienen contenido para su comparacion sino no permitir ser evaluada la condicion
        //nums[0].getValor().isEmpty() || nums[1].getValor().isEmpty()
        if(nums[0] == null || nums[1] == null){
            error ="Utiliza las variables declaradas en la condicion \t❌❌❌";
            //System.out.println("Utiliza las variables declaradas en la condicion");
        }else {
            if(nums[0].getValor().isEmpty() || nums[1].getValor().isEmpty())
                error = "Asignale un valor a las variables de la condiciones \t❌❌❌";
            else {
                //Validacion de tipo de condicion para poder hacer comparaciones
                if (pass) { //Los ID de la condicion coinciden con los ID declarados
                    String possNum = "<>==!=";

                    String operador = ctx.OPERADOR().getText();
                    if (possNum.contains(operador)) {
                        //System.out.println("Esperando enteros");
                        if (nums[0].getTipo().compareTo("int") == 0 && nums[1].getTipo().compareTo("int") == 0) {
                            sucess = "Entrada semantica correcta \t✅✅✅";
                            //System.out.println("condicion numerica valida");
                        } else {
                            error = "Condicion invalida! Tipos de datos diferentes \t❌❌❌";
                            //System.out.println("Condicion invalida! Tipos de datos diferentes");
                        }
                    } else {
                        //System.out.println("Esperando bool");
                        if (nums[0].getTipo().compareTo("boolean") == 0 && nums[1].getTipo().compareTo("boolean") == 0) {
                            sucess = "Entrada semantica correcta \t✅✅✅";
                            //System.out.println("condicion booleana valida");
                        } else {
                            error = "Condicion invalida! Tipos de datos diferentes \t❌❌❌";
                            //System.out.println("Condicion invalida! Tipos de datos diferentes");
                        }
                    }

                }
            }
        }
        return visitChildren(ctx);


    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitContraria(GramaticaParser.ContrariaContext ctx) { return visitChildren(ctx); }


    //Getters Method
    public String getSucess(){
        return this.sucess;
    }

    public String getError(){
        return  this.error;
    }
}

