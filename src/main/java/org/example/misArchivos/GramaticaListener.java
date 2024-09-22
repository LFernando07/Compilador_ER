// Generated from C:/Users/luisf/IdeaProjects/ConditionalGrammar/src/main/java/org/example/Gramatica.g4 by ANTLR 4.13.1
package org.example.misArchivos;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#prule}.
	 * @param ctx the parse tree
	 */
	void enterPrule(GramaticaParser.PruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#prule}.
	 * @param ctx the parse tree
	 */
	void exitPrule(GramaticaParser.PruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones(GramaticaParser.DeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones(GramaticaParser.DeclaracionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#segunda}.
	 * @param ctx the parse tree
	 */
	void enterSegunda(GramaticaParser.SegundaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#segunda}.
	 * @param ctx the parse tree
	 */
	void exitSegunda(GramaticaParser.SegundaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tercera}.
	 * @param ctx the parse tree
	 */
	void enterTercera(GramaticaParser.TerceraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tercera}.
	 * @param ctx the parse tree
	 */
	void exitTercera(GramaticaParser.TerceraContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(GramaticaParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(GramaticaParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(GramaticaParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(GramaticaParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(GramaticaParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(GramaticaParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#contraria}.
	 * @param ctx the parse tree
	 */
	void enterContraria(GramaticaParser.ContrariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#contraria}.
	 * @param ctx the parse tree
	 */
	void exitContraria(GramaticaParser.ContrariaContext ctx);
}