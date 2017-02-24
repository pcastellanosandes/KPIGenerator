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
					put(grammarAccess.getTaskAccess().getDescriptionAlternatives_12_0(), "rule__Task__DescriptionAlternatives_12_0");
					put(grammarAccess.getTaskAccess().getPriorityAlternatives_18_0(), "rule__Task__PriorityAlternatives_18_0");
					put(grammarAccess.getTaskAccess().getCompletedDateAlternatives_30_0(), "rule__Task__CompletedDateAlternatives_30_0");
					put(grammarAccess.getTaskAccess().getTagsAlternatives_40_0(), "rule__Task__TagsAlternatives_40_0");
					put(grammarAccess.getRootAccess().getGroup(), "rule__Root__Group__0");
					put(grammarAccess.getProjectAccess().getGroup(), "rule__Project__Group__0");
					put(grammarAccess.getPhaseAccess().getGroup(), "rule__Phase__Group__0");
					put(grammarAccess.getTaskAccess().getGroup(), "rule__Task__Group__0");
					put(grammarAccess.getStatusAccess().getGroup(), "rule__Status__Group__0");
					put(grammarAccess.getRootAccess().getProjectsAssignment_1(), "rule__Root__ProjectsAssignment_1");
					put(grammarAccess.getProjectAccess().getProjectNameAssignment_2(), "rule__Project__ProjectNameAssignment_2");
					put(grammarAccess.getProjectAccess().getPhasesAssignment_4(), "rule__Project__PhasesAssignment_4");
					put(grammarAccess.getPhaseAccess().getPhaseNameAssignment_2(), "rule__Phase__PhaseNameAssignment_2");
					put(grammarAccess.getPhaseAccess().getTasksAssignment_4(), "rule__Phase__TasksAssignment_4");
					put(grammarAccess.getTaskAccess().getTaskIdAssignment_2(), "rule__Task__TaskIdAssignment_2");
					put(grammarAccess.getTaskAccess().getTaskNameAssignment_4(), "rule__Task__TaskNameAssignment_4");
					put(grammarAccess.getTaskAccess().getUseCaseAssignment_6(), "rule__Task__UseCaseAssignment_6");
					put(grammarAccess.getTaskAccess().getSequenceNumberAssignment_8(), "rule__Task__SequenceNumberAssignment_8");
					put(grammarAccess.getTaskAccess().getDescriptionAssignment_12(), "rule__Task__DescriptionAssignment_12");
					put(grammarAccess.getTaskAccess().getStartDateAssignment_14(), "rule__Task__StartDateAssignment_14");
					put(grammarAccess.getTaskAccess().getDueDateAssignment_16(), "rule__Task__DueDateAssignment_16");
					put(grammarAccess.getTaskAccess().getPriorityAssignment_18(), "rule__Task__PriorityAssignment_18");
					put(grammarAccess.getTaskAccess().getIsPrivateAssignment_20(), "rule__Task__IsPrivateAssignment_20");
					put(grammarAccess.getTaskAccess().getProgressAssignment_22(), "rule__Task__ProgressAssignment_22");
					put(grammarAccess.getTaskAccess().getStatusAssignment_24(), "rule__Task__StatusAssignment_24");
					put(grammarAccess.getTaskAccess().getAssignedToAssignment_26(), "rule__Task__AssignedToAssignment_26");
					put(grammarAccess.getTaskAccess().getCreatedDateAssignment_28(), "rule__Task__CreatedDateAssignment_28");
					put(grammarAccess.getTaskAccess().getCompletedDateAssignment_30(), "rule__Task__CompletedDateAssignment_30");
					put(grammarAccess.getTaskAccess().getTimeLoggedMinAssignment_32(), "rule__Task__TimeLoggedMinAssignment_32");
					put(grammarAccess.getTaskAccess().getBillableTimeAssignment_34(), "rule__Task__BillableTimeAssignment_34");
					put(grammarAccess.getTaskAccess().getCompletedOnTimeAssignment_36(), "rule__Task__CompletedOnTimeAssignment_36");
					put(grammarAccess.getTaskAccess().getTimeEstimatedAssignment_38(), "rule__Task__TimeEstimatedAssignment_38");
					put(grammarAccess.getTaskAccess().getTagsAssignment_40(), "rule__Task__TagsAssignment_40");
					put(grammarAccess.getStatusAccess().getStatusNameAssignment_2(), "rule__Status__StatusNameAssignment_2");
					put(grammarAccess.getStatusAccess().getTextAssignment_4(), "rule__Status__TextAssignment_4");
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
