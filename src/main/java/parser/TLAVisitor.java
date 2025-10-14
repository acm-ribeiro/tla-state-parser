// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TLAParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TLAVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TLAParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(TLAParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAParser#stateElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateElement(TLAParser.StateElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAParser#fState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFState(TLAParser.FStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAParser#entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity(TLAParser.EntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(TLAParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAParser#mapElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapElement(TLAParser.MapElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAParser#record}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord(TLAParser.RecordContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAParser#recordElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordElement(TLAParser.RecordElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAParser#fieldValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldValue(TLAParser.FieldValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(TLAParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAParser#setElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetElement(TLAParser.SetElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAParser#objectRecord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectRecord(TLAParser.ObjectRecordContext ctx);
}