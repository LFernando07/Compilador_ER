// Generated from C:/Users/luisf/IdeaProjects/ConditionalGrammar/src/main/java/org/example/Gramatica.g4 by ANTLR 4.13.1
package org.example.misArchivos;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#prule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrule(GramaticaParser.PruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(GramaticaParser.DeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#segunda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegunda(GramaticaParser.SegundaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#tercera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTercera(GramaticaParser.TerceraContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(GramaticaParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(GramaticaParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(GramaticaParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#contraria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContraria(GramaticaParser.ContrariaContext ctx);
}