package parser;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TLAStateParser}.
 */
public interface TLAStateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(TLAStateParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(TLAStateParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#stateElement}.
	 * @param ctx the parse tree
	 */
	void enterStateElement(TLAStateParser.StateElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#stateElement}.
	 * @param ctx the parse tree
	 */
	void exitStateElement(TLAStateParser.StateElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#schemaMapping}.
	 * @param ctx the parse tree
	 */
	void enterSchemaMapping(TLAStateParser.SchemaMappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#schemaMapping}.
	 * @param ctx the parse tree
	 */
	void exitSchemaMapping(TLAStateParser.SchemaMappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#tagState}.
	 * @param ctx the parse tree
	 */
	void enterTagState(TLAStateParser.TagStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#tagState}.
	 * @param ctx the parse tree
	 */
	void exitTagState(TLAStateParser.TagStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#tags}.
	 * @param ctx the parse tree
	 */
	void enterTags(TLAStateParser.TagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#tags}.
	 * @param ctx the parse tree
	 */
	void exitTags(TLAStateParser.TagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#resState}.
	 * @param ctx the parse tree
	 */
	void enterResState(TLAStateParser.ResStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#resState}.
	 * @param ctx the parse tree
	 */
	void exitResState(TLAStateParser.ResStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#responseRecord}.
	 * @param ctx the parse tree
	 */
	void enterResponseRecord(TLAStateParser.ResponseRecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#responseRecord}.
	 * @param ctx the parse tree
	 */
	void exitResponseRecord(TLAStateParser.ResponseRecordContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(TLAStateParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(TLAStateParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#codeID}.
	 * @param ctx the parse tree
	 */
	void enterCodeID(TLAStateParser.CodeIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#codeID}.
	 * @param ctx the parse tree
	 */
	void exitCodeID(TLAStateParser.CodeIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(TLAStateParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(TLAStateParser.EntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(TLAStateParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(TLAStateParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#mapElement}.
	 * @param ctx the parse tree
	 */
	void enterMapElement(TLAStateParser.MapElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#mapElement}.
	 * @param ctx the parse tree
	 */
	void exitMapElement(TLAStateParser.MapElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#record}.
	 * @param ctx the parse tree
	 */
	void enterRecord(TLAStateParser.RecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#record}.
	 * @param ctx the parse tree
	 */
	void exitRecord(TLAStateParser.RecordContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#recordElement}.
	 * @param ctx the parse tree
	 */
	void enterRecordElement(TLAStateParser.RecordElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#recordElement}.
	 * @param ctx the parse tree
	 */
	void exitRecordElement(TLAStateParser.RecordElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#fieldValue}.
	 * @param ctx the parse tree
	 */
	void enterFieldValue(TLAStateParser.FieldValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#fieldValue}.
	 * @param ctx the parse tree
	 */
	void exitFieldValue(TLAStateParser.FieldValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(TLAStateParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(TLAStateParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#setElement}.
	 * @param ctx the parse tree
	 */
	void enterSetElement(TLAStateParser.SetElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#setElement}.
	 * @param ctx the parse tree
	 */
	void exitSetElement(TLAStateParser.SetElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#fState}.
	 * @param ctx the parse tree
	 */
	void enterFState(TLAStateParser.FStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#fState}.
	 * @param ctx the parse tree
	 */
	void exitFState(TLAStateParser.FStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#pcState}.
	 * @param ctx the parse tree
	 */
	void enterPcState(TLAStateParser.PcStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#pcState}.
	 * @param ctx the parse tree
	 */
	void exitPcState(TLAStateParser.PcStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#reqState}.
	 * @param ctx the parse tree
	 */
	void enterReqState(TLAStateParser.ReqStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#reqState}.
	 * @param ctx the parse tree
	 */
	void exitReqState(TLAStateParser.ReqStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#requestRecord}.
	 * @param ctx the parse tree
	 */
	void enterRequestRecord(TLAStateParser.RequestRecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#requestRecord}.
	 * @param ctx the parse tree
	 */
	void exitRequestRecord(TLAStateParser.RequestRecordContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(TLAStateParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(TLAStateParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#operationID}.
	 * @param ctx the parse tree
	 */
	void enterOperationID(TLAStateParser.OperationIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#operationID}.
	 * @param ctx the parse tree
	 */
	void exitOperationID(TLAStateParser.OperationIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(TLAStateParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(TLAStateParser.VerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#verbID}.
	 * @param ctx the parse tree
	 */
	void enterVerbID(TLAStateParser.VerbIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#verbID}.
	 * @param ctx the parse tree
	 */
	void exitVerbID(TLAStateParser.VerbIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(TLAStateParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(TLAStateParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(TLAStateParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(TLAStateParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#paramRecord}.
	 * @param ctx the parse tree
	 */
	void enterParamRecord(TLAStateParser.ParamRecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#paramRecord}.
	 * @param ctx the parse tree
	 */
	void exitParamRecord(TLAStateParser.ParamRecordContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#bodyRecord}.
	 * @param ctx the parse tree
	 */
	void enterBodyRecord(TLAStateParser.BodyRecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#bodyRecord}.
	 * @param ctx the parse tree
	 */
	void exitBodyRecord(TLAStateParser.BodyRecordContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#bodyType}.
	 * @param ctx the parse tree
	 */
	void enterBodyType(TLAStateParser.BodyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#bodyType}.
	 * @param ctx the parse tree
	 */
	void exitBodyType(TLAStateParser.BodyTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#typeID}.
	 * @param ctx the parse tree
	 */
	void enterTypeID(TLAStateParser.TypeIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#typeID}.
	 * @param ctx the parse tree
	 */
	void exitTypeID(TLAStateParser.TypeIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#bodyInt}.
	 * @param ctx the parse tree
	 */
	void enterBodyInt(TLAStateParser.BodyIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#bodyInt}.
	 * @param ctx the parse tree
	 */
	void exitBodyInt(TLAStateParser.BodyIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#bodyBool}.
	 * @param ctx the parse tree
	 */
	void enterBodyBool(TLAStateParser.BodyBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#bodyBool}.
	 * @param ctx the parse tree
	 */
	void exitBodyBool(TLAStateParser.BodyBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#bodyObject}.
	 * @param ctx the parse tree
	 */
	void enterBodyObject(TLAStateParser.BodyObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#bodyObject}.
	 * @param ctx the parse tree
	 */
	void exitBodyObject(TLAStateParser.BodyObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLAStateParser#objectRecord}.
	 * @param ctx the parse tree
	 */
	void enterObjectRecord(TLAStateParser.ObjectRecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLAStateParser#objectRecord}.
	 * @param ctx the parse tree
	 */
	void exitObjectRecord(TLAStateParser.ObjectRecordContext ctx);
}