package org.apache.fineract.commands.service;

    import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
    import org.apache.fineract.commands.domain.CommandWrapper;
    import org.apache.fineract.infrastructure.accountnumberformat.service.AccountNumberFormatConstants;
    import org.apache.fineract.portfolio.client.api.ClientApiConstants;
    import org.apache.fineract.portfolio.paymenttype.api.PaymentTypeApiResourceConstants;
    import org.apache.fineract.portfolio.savings.DepositsApiConstants;
    import org.apache.fineract.portfolio.self.pockets.api.PocketApiConstants;
    import org.apache.fineract.useradministration.api.PasswordPreferencesApiConstants;

public class CommandWrapperBuilder {
    private Long officeId;
    private Long groupId;
    private Long clientId;
    private Long loanId;
    private Long savingsId;
    private String actionName;
    private String entityName;
    private Long entityId;
    private Long subentityId;
    private String href;
    private String json = "{}";
    private String transactionId;
    private Long productId;
    private Long templateId;
    private Long creditBureauId;
    private Long organisationCreditBureauId;
    private String jobName;
    private String idempotencyKey;

    @SuppressFBWarnings(value = "UWF_UNWRITTEN_FIELD", justification = "TODO: fix this!")
    public CommandWrapper build() {
        return new CommandWrapper(this.officeId, this.groupId, this.clientId, this.loanId, this.savingsId, this.actionName, this.entityName,
                this.entityId, this.subentityId, this.href, this.json, this.transactionId, this.productId, this.templateId,
                this.creditBureauId, this.organisationCreditBureauId, this.jobName, this.idempotencyKey);
    }

    public CommandWrapper build(String idempotencyKey) {
        return new CommandWrapper(this.officeId, this.groupId, this.clientId, this.loanId, this.savingsId, this.actionName, this.entityName,
                this.entityId, this.subentityId, this.href, this.json, this.transactionId, this.productId, this.templateId,
                this.creditBureauId, this.organisationCreditBureauId, this.jobName, idempotencyKey);
    }
}
