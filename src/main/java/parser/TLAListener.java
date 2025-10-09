package parser;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TLAParser}.
 */
public interface TLAListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TLAParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(TLAParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(TLAParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAParser#stateElement}.
	 * @param ctx the parse tree
	 */
	void enterStateElement(TLAParser.StateElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAParser#stateElement}.
	 * @param ctx the parse tree
	 */
	void exitStateElement(TLAParser.StateElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAParser#fState}.
	 * @param ctx the parse tree
	 */
	void enterFState(TLAParser.FStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAParser#fState}.
	 * @param ctx the parse tree
	 */
	void exitFState(TLAParser.FStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(TLAParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(TLAParser.EntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(TLAParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(TLAParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAParser#mapElement}.
	 * @param ctx the parse tree
	 */
	void enterMapElement(TLAParser.MapElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAParser#mapElement}.
	 * @param ctx the parse tree
	 */
	void exitMapElement(TLAParser.MapElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAParser#record}.
	 * @param ctx the parse tree
	 */
	void enterRecord(TLAParser.RecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAParser#record}.
	 * @param ctx the parse tree
	 */
	void exitRecord(TLAParser.RecordContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAParser#recordElement}.
	 * @param ctx the parse tree
	 */
	void enterRecordElement(TLAParser.RecordElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAParser#recordElement}.
	 * @param ctx the parse tree
	 */
	void exitRecordElement(TLAParser.RecordElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAParser#fieldValue}.
	 * @param ctx the parse tree
	 */
	void enterFieldValue(TLAParser.FieldValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAParser#fieldValue}.
	 * @param ctx the parse tree
	 */
	void exitFieldValue(TLAParser.FieldValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(TLAParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(TLAParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAParser#setElement}.
	 * @param ctx the parse tree
	 */
	void enterSetElement(TLAParser.SetElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAParser#setElement}.
	 * @param ctx the parse tree
	 */
	void exitSetElement(TLAParser.SetElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAParser#objectRecord}.
	 * @param ctx the parse tree
	 */
	void enterObjectRecord(TLAParser.ObjectRecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAParser#objectRecord}.
	 * @param ctx the parse tree
	 */
	void exitObjectRecord(TLAParser.ObjectRecordContext ctx);
}