package org.example;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.example.src.AuxiliarClass.RenderToken;
import org.example.misArchivos.GramaticaBaseVisitor;
import org.example.misArchivos.GramaticaParser;
import org.jetbrains.annotations.NotNull;


import java.util.*;

public class MyVisitor extends GramaticaBaseVisitor<Integer> {
    private Vector<RenderToken> tokens = new Vector<>();
    private ArrayList<String> error = new ArrayList<>();

    private String sucess;
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
        //System.out.println(numHijos);
        String valor="";

        if(tipo.equals("boolean")){
            //Verificar que se declaro o se asigno
            if(numHijos > 1){
                if(!temp.getText().contains("=")){
                    recorrerSegundas(temp,tipo);
                    sucess ="Entrada semantica correcta \t✅✅✅";
                    System.out.println("Variables booleana declaradas");
                }else {

                    valor = temp.getChild(1).getText();

                    if (valor.compareTo("true") == 0 || valor.compareTo("false") == 0) {
                        sucess="Entrada semantica correcta \t✅✅✅";

                        System.out.println("Variable booleana asignada");
                    } else {
                        error.add("Error! Valor incompatible con el tipo de dato booleano \t❌❌❌");
                        System.out.println("Error booleano");
                    }
                }
            }else{
                sucess="Entrada semantica correcta \t✅✅✅";
                System.out.println("Variable booleana declarada");
            }
        }else{//Numerico
            if(tipo.equals("int")){
                if(numHijos > 1){
                    if(!temp.getText().contains("=")){
                        recorrerSegundas(temp,tipo);
                        sucess="Entrada semantica correcta \t✅✅✅";
                        System.out.println("Variables enteras declaradas");
                    }else {

                        valor = temp.getChild(1).getText();
                        if (valor.contains(".") || valor.compareTo("true") == 0 || valor.compareTo("false") == 0) {
                            error.add("Error! Valor incompatible con el tipo de dato entero \t❌❌❌");
                            System.out.println("Error int");
                        } else {
                            sucess="Entrada semantica correcta \t✅✅✅";

                            System.out.println("Variable int asignada");
                        }
                    }
                }else{
                    sucess="Entrada semantica correcta \t✅✅✅";

                    System.out.println("Variable int declarada");
                }
            }else{ //Decimal double / float
                if(numHijos>1){
                    if(!temp.getText().contains("=")){
                        recorrerSegundas(temp,tipo);
                        sucess="Entrada semantica correcta \t✅✅✅";
                        if(tipo.equals("float"))
                            System.out.println("Variables float declaradas");
                        else
                            System.out.println("Variables double declaradas");
                    }else {
                        valor = temp.getChild(1).getText();
                        if (!valor.contains(".") || valor.compareTo("true") == 0 || valor.compareTo("false") == 0) {
                            if(tipo.equals("float"))
                                error.add("Error! Valor incompatible con el tipo de dato float \t❌❌❌");
                            else
                                error.add("Error! Valor incompatible con el tipo de dato double \t❌❌❌");
                            System.out.println("Error float/double");
                        } else {
                            sucess="Entrada semantica correcta \t✅✅✅";
                            if(tipo.equals("float"))
                                System.out.println("Variable float asignada");
                            else
                                System.out.println("Variable double asignada");
                        }
                    }
                }else {
                    sucess="Entrada semantica correcta \t✅✅✅";
                    if(tipo.equals("float"))
                        System.out.println("Variable float declarada");
                    else
                        System.out.println("Variable double declarada");
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
        if(nums[0] == null || nums[1] == null){
            error.add("Utiliza las variables declaradas en la condicion \t❌❌❌");

            System.out.println("Utiliza las variables declaradas en la condicion");
        }else {
            if (nums[0].getValor().isEmpty() || nums[1].getValor().isEmpty()){
                error.add("Asignale un valor a las variables de la condiciones \t❌❌❌");
                System.out.println("Asigne un valor a las variables de la condiciones \t❌❌❌");
            }else {
                //Validacion de tipo de condicion para poder hacer comparaciones
                if (pass) { //Los ID de la condicion coinciden con los ID declarados
                    String possNum = "<>==!=";
                    String operador = ctx.OPERADOR().getText();
                    if (possNum.contains(operador)) {
                        //System.out.println("Esperando enteros");
                        if (nums[0].getTipo().compareTo("int") == 0 && nums[1].getTipo().compareTo("int") == 0) {
                            sucess="Entrada semantica correcta \t✅✅✅";
                            System.out.println("condicion entera valida");
                        } else if (nums[0].getTipo().compareTo("float") == 0 && nums[1].getTipo().compareTo("float") == 0) {
                            sucess="Entrada semantica correcta \t✅✅✅";
                            System.out.println("condicion float valida");
                        }else if (nums[0].getTipo().compareTo("double") == 0 && nums[1].getTipo().compareTo("double") == 0) {
                            sucess="Entrada semantica correcta \t✅✅✅";
                            System.out.println("condicion double valida");
                        } else {
                            error.add("Condicion invalida! Tipos de datos diferentes u operador no valido   ❌❌❌");
                            System.out.println("Condicion invalida! Tipos de datos diferentes");
                        }

                    } else { // Operador || &&
                        System.out.println("Esperando bool");
                        if (nums[0].getTipo().compareTo("boolean") == 0 && nums[1].getTipo().compareTo("boolean") == 0) {
                            sucess="Entrada semantica correcta \t✅✅✅";

                            System.out.println("condicion booleana valida");
                        } else {
                            error.add("Condicion invalida! Tipos de datos diferentes u operador no valido  ❌❌❌");
                            System.out.println("Condicion invalida! Tipos de datos diferentes");
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


    private void recorrerSegundas(@NotNull ParseTree nodo, String tipo){
        for (int x=0; x<nodo.getChildCount();x++) {
            if (x != nodo.getChildCount() - 1){
                TerminalNode aux = (TerminalNode) nodo.getChild(x);
                if(aux.getSymbol().getType() == 8) {
                    RenderToken r = new RenderToken(tipo, nodo.getChild(x).getText());
                    tokens.add(r);

                }
            }
            else{
                recorrerSegundas(nodo.getChild(nodo.getChildCount()-1),tipo);
            }
        }
    }

    //Getters Method
    public String getSucess(){
        return this.sucess;
    }

    public ArrayList<String> getError(){
        return  this.error;
    }

}

