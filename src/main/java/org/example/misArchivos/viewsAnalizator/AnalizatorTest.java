package org.example.misArchivos.viewsAnalizator;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.MyVisitor;
import org.example.misArchivos.AuxiliarClass.CustomErrorListener;
import org.example.misArchivos.AuxiliarClass.DegradePane;
import org.example.misArchivos.GramaticaLexer;
import org.example.misArchivos.GramaticaParser;
import org.jetbrains.annotations.NotNull;


import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import static org.antlr.v4.runtime.CharStreams.fromString;

public class AnalizatorTest extends JFrame {
    //Attributes class view
    private JPanel plataforma;
    private JLabel head,head_Lex,head_Sin,head_Sem;
    private JScrollPane scroll_tokens;
    private JTextArea input,output_tokens, output_Sin,output_Sem;
    private JButton analizer,clean;
    private JSeparator separator_Lex, separator_Sin,separator_Sem;

    private JTable tabla;

    public AnalizatorTest(){
        setTitle("Analizador de expresiones regulares");
        setSize(600,750);
        setLocationRelativeTo(null);
        setResizable(false);
        initComponents();
        analizer.requestFocus(false);
    }//Constructor base

    private void initComponents(){
        initPane();
        initLabels();
        initAreas();
        initScrolls();
        initButtons();
        initDecorateComponents();

        input.requestFocusInWindow();
    }

    private void initPane(){
        plataforma = new DegradePane(new Color(115, 103, 224),new Color(50, 204, 188));
        plataforma.setLayout(null);
        //plataforma.setBackground(new Color(254, 236, 179));
        plataforma.setSize(600,750);
        add(plataforma);
    }

    private void initLabels(){
        head = new JLabel("T e s t i n g . . . ");
        head.setSize(plataforma.getWidth(),25);
        head.setHorizontalAlignment(SwingConstants.CENTER);
        //head.setBorder(BorderFactory.createSoftBevelBorder(1));
        head.setForeground(Color.BLACK);
        head.setFont(new Font("Arial Black",Font.BOLD,20));
        head.setLocation(0,10);

        plataforma.add(head);

        head_Lex = new JLabel("Analizador lexico");
        head_Lex.setSize(180,30);
        head_Lex.setForeground(Color.BLACK);
        head_Lex.setFont(new Font("Arial Black",Font.BOLD,16));
        head_Lex.setLocation(10,60);
        //head_Lex.setBorder(BorderFactory.createSoftBevelBorder(0));
        plataforma.add(head_Lex);

        head_Sin = new JLabel("Analizador sintactico");
        head_Sin.setSize(200,30);
        head_Sin.setForeground(Color.BLACK);
        head_Sin.setFont(new Font("Arial Black",Font.BOLD,16));
        //head_Sin.setBorder(BorderFactory.createBevelBorder(0));
        head_Sin.setLocation(10,head.getHeight() + head_Lex.getHeight() + 350);
        plataforma.add(head_Sin);

        head_Sem = new JLabel("Analizador semantico");
        head_Sem.setSize(200,30);
        head_Sem.setForeground(Color.BLACK);
        head_Sem.setFont(new Font("Arial Black",Font.BOLD,16));
        //head_Sin.setBorder(BorderFactory.createBevelBorder(0));
        head_Sem.setLocation(10,head.getHeight() + head_Lex.getHeight() + 500);
        plataforma.add(head_Sem);
    }

    private void initScrolls(){
        scroll_tokens = new JScrollPane();
        scroll_tokens.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll_tokens.setSize(250,280);
        scroll_tokens.setBackground(new Color(210, 224, 251));
        scroll_tokens.setLocation(input.getX() + 315,100);

        //scroll_tokens.setViewportView(tabla);

        plataforma.add(scroll_tokens);

    }
    private void initAreas(){

        //Lexico
        input =  new JTextArea();
        input.setSize(250,280);
        input.setBackground(new Color(210, 224, 251));
        input.setFont(new Font(Font.SANS_SERIF,input.getFont().getStyle(), 14));
        input.setLocation(10,100);
        input.setBorder(BorderFactory.createBevelBorder(0));

        output_tokens =  new JTextArea();
        output_tokens.setSize(250,280);
        output_tokens.setEditable(false);
        output_tokens.setFont(new Font(Font.SANS_SERIF,input.getFont().getStyle(), 12));
        output_tokens.setLocation(input.getX() + 315,100);
        output_tokens.setBackground(new Color(210, 224, 251));
        output_tokens.setBorder(BorderFactory.createBevelBorder(0));

        //Sintactico
        output_Sin = new JTextArea();
        output_Sin.setSize(plataforma.getWidth() -35,90);
        output_Sin.setBackground(new Color(210, 224, 251));
        output_Sin.setLocation(10, head_Sin.getY() + 40);
        output_Sin.setEditable(false);
        output_Sin.setFont(new Font(Font.SANS_SERIF,Font.BOLD, 14));
        output_Sin.setBorder(BorderFactory.createBevelBorder(0));

        //Semantico
        output_Sem = new JTextArea();
        output_Sem.setSize(plataforma.getWidth() -35,90);
        output_Sem.setBackground(new Color(210, 224, 251));
        output_Sem.setEditable(false);
        output_Sem.setFont(new Font(Font.SANS_SERIF,Font.BOLD, 14));
        output_Sem.setLocation(10, head_Sem.getY() + 40);
        output_Sem.setBorder(BorderFactory.createBevelBorder(0));

        plataforma.add(input);
        plataforma.add(output_Sin);
        plataforma.add(output_Sem);
    }

    private void initButtons(){
        analizer = new JButton("Analizar");
        analizer.setBackground(new Color(253, 250, 217));
        analizer.setFont(new Font("Arial",Font.BOLD,14));
        analizer.setForeground(Color.BLACK);
        analizer.setBounds(plataforma.getWidth() - 250,head_Lex.getY()-10,100,25);
        analizer.setBorder(BorderFactory.createSoftBevelBorder(0));

        //Add Event-Listener Button
        MouseAdapter evt_analizer = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                output_tokens.setText("");
                //Call method testInput
                testInput();
            }
        };
        analizer.addMouseListener(evt_analizer);

        plataforma.add(analizer);

        clean = new JButton("Limpiar");
        clean.setBackground(new Color(229, 217, 242));
        clean.setForeground(Color.BLACK);
        clean.setFont(new Font("Arial",Font.BOLD,14));
        clean.setBounds(plataforma.getWidth() - 130,head_Lex.getY()-10,100,25);
        clean.setBorder(BorderFactory.createSoftBevelBorder(0));

        //Add Event-Listener Button
        MouseAdapter evt_clean = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                //Call method cleanElements
                cleanElements();
            }
        };
        clean.addMouseListener(evt_clean);

        //Quitar foco
        analizer.setFocusable(false);
        clean.setFocusable(false);

        plataforma.add(clean);
    }

    private void initDecorateComponents(){
        separator_Lex = new JSeparator();
        separator_Lex.setSize(plataforma.getWidth() -35,15);
        separator_Lex.setLocation(10,85);
        separator_Lex.setBackground(Color.BLACK);

        separator_Sin = new JSeparator();
        separator_Sin.setSize(plataforma.getWidth() -35,15);
        separator_Sin.setLocation(10,head_Sin.getY() + 25);
        separator_Sin.setBackground(Color.BLACK);

        separator_Sem = new JSeparator();
        separator_Sem.setSize(plataforma.getWidth() -35,15);
        separator_Sem.setLocation(10,head_Sem.getY() + 25);
        separator_Sem.setBackground(Color.BLACK);


        plataforma.add(separator_Lex);
        plataforma.add(separator_Sin);
        plataforma.add(separator_Sem);
    }

    private void testInput(){
        //CODE...
        try{
            String entrada = input.getText();
            if(entrada.isEmpty() || entrada.isBlank()){
                JOptionPane.showMessageDialog(null,"Coloca algo en el input");
            }else{

                CharStream ch = CharStreams.fromString(entrada + "\n");
                GramaticaLexer lexer = new GramaticaLexer(ch); // Analizador léxico

                CommonTokenStream token = new CommonTokenStream(lexer); // Canal para comunicar los tokens

                GramaticaParser parser = new GramaticaParser(token); // Analizador sintáctico

                //Mostrar los tokens
                showTokensView(token);

                // Crear e integrar el CustomErrorListener
                CustomErrorListener errorListener = new CustomErrorListener();
                parser.removeErrorListeners(); // Eliminar los listeners por defecto
                parser.addErrorListener(errorListener); // Agregar el listener personalizado

                // Generar el árbol sintáctico
                ParseTree tree = parser.prule();

                // Revisar si hay errores sintácticos
                String errors = errorListener.getErrorMessages();
                if (!errors.isEmpty()) {
                    output_Sin.setForeground(Color.RED);
                    output_Sin.setText(STR."\{errors} ❌❌❌" );
                } else {
                    // Si no hay errores, procesar el árbol
                    output_Sin.setForeground(Color.BLUE);
                    output_Sin.setText("Sintaxis analizada correctamente ✅✅✅\n");

                    MyVisitor visitor = new MyVisitor(); // Clase para visitar los nodos
                    visitor.visit(tree); // Procesar el árbol

                    //Extraer el mensaje semantico de error
                    if(visitor.getSucess() != null){ //Hay una semantica correcta
                        output_Sem.setForeground(Color.BLUE);
                        output_Sem.setText(STR."\{visitor.getSucess()}\n");
                    }else if(visitor.getError() != null){ //Surgio un error
                        output_Sem.setForeground(Color.RED);
                        output_Sem.setText(STR."\{visitor.getError()}\n");
                    }
                }

            }
        }catch (Exception e){
            e.printStackTrace();

        }
    }

    private void cleanElements(){
        input.setText("");

        output_tokens.setText("");

        output_Sin.setForeground(Color.BLACK);
        output_Sin.setText("");

        output_Sem.setForeground(Color.BLACK);
        output_Sem.setText("");

        //Limpiar tabla
        tabla = new JTable();
        scroll_tokens.setViewport(null);
    }

    private void showTokensView(@NotNull CommonTokenStream token){
        //Extraccion y muestra de tokens
        //Titlos de la tabla
        String[] columnTitles = {"Token", "Lexema"};

        // Crear el modelo de la tabla con las columnas pero sin datos
        DefaultTableModel modelo = new DefaultTableModel(columnTitles, 0);

        //Renderizar tabla
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        render.setHorizontalAlignment(SwingConstants.CENTER);


        token.fill();
        for(int i =0; i<token.getTokens().size()-1;i++){
            int tipo = token.getTokens().get(i).getType();
            String tipo_name= "";

            switch (tipo){
                case 1: tipo_name= "<INTEGER>";
                    break;
                case 2: tipo_name= "<FLOAT>";
                    break;
                case 3: tipo_name= "<BOOLEAN>";
                    break;
                case 4: tipo_name= "<TIPO_DATO>";
                    break;
                case 5: tipo_name= "<IF>";
                    break;
                case 6: tipo_name= "<ELSE>";
                    break;
                case 7: tipo_name= "<BLANCO>";
                    break;
                case 8: tipo_name= "<IDENTIFICADOR>";
                    break;
                case 9: tipo_name= "<LETRA>";
                    break;
                case 10: tipo_name= "<DIGITO>";
                    break;
                case 11: case ';': tipo_name= "<PUNTO_COMA>";
                    break;
                case 12: case '=': tipo_name= "<IGUAL>";
                    break;
                case 13: case '.': tipo_name= "<PUNTO>";
                    break;
                case 14: case ',': tipo_name= "<COMA>";
                    break;
                case 15: case '(': tipo_name= "<PARENTESIS_A>";
                    break;
                case 16: case ')': tipo_name= "<PARENTESIS_C>";
                    break;
                case 17: tipo_name= "<OPERADOR>";
                    break;
                case 18: case '{': tipo_name= "<LLAVE_A>";
                    break;
                case 19: case '}':tipo_name= "<LLAVE_C>";
                    break;
                default: tipo_name= "<NO_DEFINIDO>";
                    break;


            }
            String value = token.getTokens().get(i).getText();

            /* CHANGE TO TABLE -> FORMAT INCOSISTENT */
            Vector aux = new Vector<>();
            aux.add(tipo_name);
            aux.add(value);

            //output_tokens.append(STR."\{tipo_name} \t" + STR."\{value}\n");
            modelo.addRow(aux);

        }

        //Creacion de la tabla
        tabla = new JTable(modelo);
        tabla.setBackground(new Color(210, 224, 251));
        tabla.getColumnModel().getColumn(1).setCellRenderer(render);

        //Mostrar la nueva tabla
        scroll_tokens.setViewportView(tabla);

    }

    public static void main(String[] args) {
        AnalizatorTest vista = new AnalizatorTest();
        vista.setVisible(true);

    }//Metodo main -> Init GUI
}
