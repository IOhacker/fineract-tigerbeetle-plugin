package org.apache.fineract.infrastructure.core.data;

import java.util.Map;
import org.apache.fineract.infrastructure.core.domain.ExternalId;

/**
 * Represents the successful result of an REST API call that results in processing a command.
 */
public class CommandProcessingResultBuilder {

    private Long commandId;
    private Long officeId;
    private Long groupId;
    private Long clientId;
    private Long loanId;
    private Long savingsId;
    private String resourceIdentifier;
    private Long entityId;
    private Long subEntityId;
    private Long gsimId;
    private Long glimId;
    private String transactionId;
    private Map<String, Object> changes;
    private Map<String, Object> creditBureauReportData;
    private Long productId;
    private boolean rollbackTransaction = false;
    private ExternalId entityExternalId = ExternalId.empty();

    private ExternalId subEntityExternalId = ExternalId.empty();

    public CommandProcessingResult build() {
        return CommandProcessingResult.fromDetails(this.commandId, this.officeId, this.groupId, this.clientId, this.loanId, this.savingsId,
                this.resourceIdentifier, this.entityId, this.gsimId, this.glimId, this.creditBureauReportData, this.transactionId,
                this.changes, this.productId, this.rollbackTransaction, this.subEntityId, this.entityExternalId, this.subEntityExternalId);
    }

    public CommandProcessingResultBuilder withSavingsId(final Long withSavingsId) {
        this.savingsId = withSavingsId;
        return this;
    }
   
}