package parser;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TLAStateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TLAStateVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(TLAStateParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#stateElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateElement(TLAStateParser.StateElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#schemaMapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaMapping(TLAStateParser.SchemaMappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#tagState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagState(TLAStateParser.TagStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#tags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTags(TLAStateParser.TagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#resState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResState(TLAStateParser.ResStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#responseRecord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResponseRecord(TLAStateParser.ResponseRecordContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(TLAStateParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#codeID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeID(TLAStateParser.CodeIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity(TLAStateParser.EntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(TLAStateParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#mapElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapElement(TLAStateParser.MapElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#record}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord(TLAStateParser.RecordContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#recordElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordElement(TLAStateParser.RecordElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#fieldValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldValue(TLAStateParser.FieldValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(TLAStateParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#setElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetElement(TLAStateParser.SetElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#fState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFState(TLAStateParser.FStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#pcState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPcState(TLAStateParser.PcStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#reqState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReqState(TLAStateParser.ReqStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#requestRecord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequestRecord(TLAStateParser.RequestRecordContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(TLAStateParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#operationID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationID(TLAStateParser.OperationIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#verb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerb(TLAStateParser.VerbContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#verbID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerbID(TLAStateParser.VerbIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(TLAStateParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(TLAStateParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#paramRecord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamRecord(TLAStateParser.ParamRecordContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#bodyRecord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyRecord(TLAStateParser.BodyRecordContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#bodyType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyType(TLAStateParser.BodyTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#bodyInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyInt(TLAStateParser.BodyIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#bodyBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyBool(TLAStateParser.BodyBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#bodyObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyObject(TLAStateParser.BodyObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLAStateParser#objectRecord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectRecord(TLAStateParser.ObjectRecordContext ctx);
}