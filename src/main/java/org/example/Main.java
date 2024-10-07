package org.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.src.AuxiliarClass.CustomErrorListener;
import org.example.misArchivos.GramaticaLexer;
import org.example.misArchivos.GramaticaParser;

import java.util.Scanner;

import static org.antlr.v4.runtime.CharStreams.fromString;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        try{
            String input;
            Scanner scanner = new Scanner(System.in);
            do {

                System.out.print("ingrese una expresion >");
                input = scanner.nextLine();

                if (input.equals("exit")) {
                    continue;
                }
                ;

                CharStream ch = CharStreams.fromString(input + "\n");
                GramaticaLexer lexer = new GramaticaLexer(ch); // Analizador léxico

                CommonTokenStream token = new CommonTokenStream(lexer); // Canal para comunicar los tokens

                GramaticaParser parser = new GramaticaParser(token); // Analizador sintáctico

                // Crear e integrar el CustomErrorListener
                CustomErrorListener errorListener = new CustomErrorListener();
                parser.removeErrorListeners(); // Eliminar los listeners por defecto
                parser.addErrorListener(errorListener); // Agregar el listener personalizado

                // Generar el árbol sintáctico
                ParseTree tree = parser.prule();

                // Revisar si hay errores sintácticos
                String errors = errorListener.getErrorMessages();
                if (!errors.isEmpty()) {
                    System.out.println("Errores de sintaxis capturados:\n" + errors);
                } else {
                    // Si no hay errores, procesar el árbol
                    System.out.println(tree.toStringTree(parser));

                    MyVisitor visitor = new MyVisitor(); // Clase para visitar los nodos
                    visitor.visit(tree); // Procesar el árbol
                }

            } while (!input.equals("exit"));
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}