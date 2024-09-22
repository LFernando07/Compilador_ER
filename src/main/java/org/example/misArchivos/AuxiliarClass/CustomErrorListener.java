package org.example.misArchivos.AuxiliarClass;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class CustomErrorListener extends BaseErrorListener {

    // Variable para almacenar el mensaje de error
    private StringBuilder errorMessages = new StringBuilder();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        // Capturar el error en la variable errorMessages
        errorMessages.append("Error en la línea ")
                .append(line)
                .append(":")
                .append(charPositionInLine)
                .append(" - ")
                .append(msg);
    }

    // Método para obtener los errores acumulados
    public String getErrorMessages() {
        return errorMessages.toString();
    }
}
