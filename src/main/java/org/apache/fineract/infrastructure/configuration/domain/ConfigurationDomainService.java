package org.apache.fineract.infrastructure.configuration.domain;

import java.time.LocalDate;
import org.apache.fineract.infrastructure.cache.domain.CacheType;

public interface ConfigurationDomainService {
    
    boolean isSavingsInterestPostingAtCurrentPeriodEnd();

}
