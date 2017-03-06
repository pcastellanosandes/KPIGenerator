/*
 * generated by Xtext 2.10.0
 */
package co.edu.uniandes.ide.contentassist.antlr;

import co.edu.uniandes.ide.contentassist.antlr.internal.InternalKPIGeneratorParser;
import co.edu.uniandes.services.KPIGeneratorGrammarAccess;
import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class KPIGeneratorParser extends AbstractContentAssistParser {

	@Inject
	private KPIGeneratorGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalKPIGeneratorParser createParser() {
		InternalKPIGeneratorParser result = new InternalKPIGeneratorParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTaskAccess().getStartDateAlternatives_10_0(), "rule__Task__StartDateAlternatives_10_0");
					put(grammarAccess.getTaskAccess().getDueDateAlternatives_12_0(), "rule__Task__DueDateAlternatives_12_0");
					put(grammarAccess.getTaskAccess().getCompletedDateAlternatives_26_0(), "rule__Task__CompletedDateAlternatives_26_0");
					put(grammarAccess.getRootAccess().getGroup(), "rule__Root__Group__0");
					put(grammarAccess.getRootAccess().getGroup_2(), "rule__Root__Group_2__0");
					put(grammarAccess.getProjectAccess().getGroup(), "rule__Project__Group__0");
					put(grammarAccess.getProjectAccess().getGroup_5(), "rule__Project__Group_5__0");
					put(grammarAccess.getPhaseAccess().getGroup(), "rule__Phase__Group__0");
					put(grammarAccess.getPhaseAccess().getGroup_6(), "rule__Phase__Group_6__0");
					put(grammarAccess.getTaskAccess().getGroup(), "rule__Task__Group__0");
					put(grammarAccess.getRootAccess().getProjectsAssignment_1(), "rule__Root__ProjectsAssignment_1");
					put(grammarAccess.getRootAccess().getProjectsAssignment_2_1(), "rule__Root__ProjectsAssignment_2_1");
					put(grammarAccess.getProjectAccess().getProjectNameAssignment_2(), "rule__Project__ProjectNameAssignment_2");
					put(grammarAccess.getProjectAccess().getPhasesAssignment_4(), "rule__Project__PhasesAssignment_4");
					put(grammarAccess.getProjectAccess().getPhasesAssignment_5_1(), "rule__Project__PhasesAssignment_5_1");
					put(grammarAccess.getPhaseAccess().getPhaseNameAssignment_3(), "rule__Phase__PhaseNameAssignment_3");
					put(grammarAccess.getPhaseAccess().getTasksAssignment_5(), "rule__Phase__TasksAssignment_5");
					put(grammarAccess.getPhaseAccess().getTasksAssignment_6_1(), "rule__Phase__TasksAssignment_6_1");
					put(grammarAccess.getTaskAccess().getTaskIdAssignment_2(), "rule__Task__TaskIdAssignment_2");
					put(grammarAccess.getTaskAccess().getTaskNameAssignment_4(), "rule__Task__TaskNameAssignment_4");
					put(grammarAccess.getTaskAccess().getUseCaseAssignment_6(), "rule__Task__UseCaseAssignment_6");
					put(grammarAccess.getTaskAccess().getSequenceNumberAssignment_8(), "rule__Task__SequenceNumberAssignment_8");
					put(grammarAccess.getTaskAccess().getStartDateAssignment_10(), "rule__Task__StartDateAssignment_10");
					put(grammarAccess.getTaskAccess().getDueDateAssignment_12(), "rule__Task__DueDateAssignment_12");
					put(grammarAccess.getTaskAccess().getIsPrivateAssignment_14(), "rule__Task__IsPrivateAssignment_14");
					put(grammarAccess.getTaskAccess().getProgressAssignment_16(), "rule__Task__ProgressAssignment_16");
					put(grammarAccess.getTaskAccess().getStatusNameAssignment_18(), "rule__Task__StatusNameAssignment_18");
					put(grammarAccess.getTaskAccess().getStatusTextAssignment_20(), "rule__Task__StatusTextAssignment_20");
					put(grammarAccess.getTaskAccess().getAssignedToAssignment_22(), "rule__Task__AssignedToAssignment_22");
					put(grammarAccess.getTaskAccess().getCreatedDateAssignment_24(), "rule__Task__CreatedDateAssignment_24");
					put(grammarAccess.getTaskAccess().getCompletedDateAssignment_26(), "rule__Task__CompletedDateAssignment_26");
					put(grammarAccess.getTaskAccess().getTimeLoggedMinAssignment_28(), "rule__Task__TimeLoggedMinAssignment_28");
					put(grammarAccess.getTaskAccess().getBillableTimeAssignment_30(), "rule__Task__BillableTimeAssignment_30");
					put(grammarAccess.getTaskAccess().getCompletedOnTimeAssignment_32(), "rule__Task__CompletedOnTimeAssignment_32");
					put(grammarAccess.getTaskAccess().getTimeEstimatedAssignment_34(), "rule__Task__TimeEstimatedAssignment_34");
					put(grammarAccess.getTaskAccess().getIsReprocessedTaskAssignment_36(), "rule__Task__IsReprocessedTaskAssignment_36");
					put(grammarAccess.getTaskAccess().getIdParentTaskAssignment_38(), "rule__Task__IdParentTaskAssignment_38");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalKPIGeneratorParser typedParser = (InternalKPIGeneratorParser) parser;
			typedParser.entryRuleRoot();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public KPIGeneratorGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(KPIGeneratorGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
