/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.accounting.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.fineract.accounting.financialactivityaccount.data.FinancialActivityData;
import org.apache.fineract.accounting.glaccount.domain.GLAccountType;

public final class AccountingConstants {

    private AccountingConstants() {

    }

    /***
     * Accounting placeholders for cash based accounting for savings products
     ***/
    public enum CashAccountsForSavings {

        SAVINGS_REFERENCE(1), //
        SAVINGS_CONTROL(2), //
        INTEREST_ON_SAVINGS(3), //
        INCOME_FROM_FEES(4), //
        INCOME_FROM_PENALTIES(5), //
        TRANSFERS_SUSPENSE(10), //
        OVERDRAFT_PORTFOLIO_CONTROL(11), //
        INCOME_FROM_INTEREST(12), //
        LOSSES_WRITTEN_OFF(13), //
        ESCHEAT_LIABILITY(14); //

        private final Integer value;

        CashAccountsForSavings(final Integer value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return name().toString().replaceAll("_", " ");
        }

        public Integer getValue() {
            return this.value;
        }

        private static final Map<Integer, CashAccountsForSavings> intToEnumMap = new HashMap<>();

        static {
            for (final CashAccountsForSavings type : CashAccountsForSavings.values()) {
                intToEnumMap.put(type.value, type);
            }
        }

        public static CashAccountsForSavings fromInt(final int i) {
            final CashAccountsForSavings type = intToEnumMap.get(Integer.valueOf(i));
            return type;
        }
    }

    /***
     * Accounting placeholders for periodic accrual based accounting for savings products
     ***/
    public enum AccrualAccountsForSavings {

        SAVINGS_REFERENCE(1), //
        SAVINGS_CONTROL(2), //
        INTEREST_ON_SAVINGS(3), //
        INCOME_FROM_FEES(4), //
        INCOME_FROM_PENALTIES(5), //
        TRANSFERS_SUSPENSE(10), //
        OVERDRAFT_PORTFOLIO_CONTROL(11), //
        INCOME_FROM_INTEREST(12), //
        LOSSES_WRITTEN_OFF(13), //
        ESCHEAT_LIABILITY(14), //
        FEES_RECEIVABLE(15), //
        PENALTIES_RECEIVABLE(16), //
        INTEREST_PAYABLE(17);

        private final Integer value;

        AccrualAccountsForSavings(final Integer value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return name().toString().replaceAll("_", " ");
        }

        public Integer getValue() {
            return this.value;
        }

        private static final Map<Integer, AccrualAccountsForSavings> intToEnumMap = new HashMap<>();

        static {
            for (final AccrualAccountsForSavings type : AccrualAccountsForSavings.values()) {
                intToEnumMap.put(type.value, type);
            }
        }

        public static AccrualAccountsForSavings fromInt(final int i) {
            final AccrualAccountsForSavings type = intToEnumMap.get(Integer.valueOf(i));
            return type;
        }
    }

    /***
     * Enum of all accounting related input parameter names used while creating/updating a savings product
     ***/
    public enum SavingProductAccountingParams {

        SAVINGS_REFERENCE("savingsReferenceAccountId"), //
        SAVINGS_CONTROL("savingsControlAccountId"), //
        INCOME_FROM_FEES("incomeFromFeeAccountId"), //
        INCOME_FROM_PENALTIES("incomeFromPenaltyAccountId"), //
        INTEREST_ON_SAVINGS("interestOnSavingsAccountId"), //
        PAYMENT_CHANNEL_FUND_SOURCE_MAPPING("paymentChannelToFundSourceMappings"), //
        PAYMENT_TYPE("paymentTypeId"), //
        FUND_SOURCE("fundSourceAccountId"), //
        TRANSFERS_SUSPENSE("transfersInSuspenseAccountId"), //
        FEE_INCOME_ACCOUNT_MAPPING("feeToIncomeAccountMappings"), //
        PENALTY_INCOME_ACCOUNT_MAPPING("penaltyToIncomeAccountMappings"), //
        CHARGE_ID("chargeId"), //
        INCOME_ACCOUNT_ID("incomeAccountId"), //
        OVERDRAFT_PORTFOLIO_CONTROL("overdraftPortfolioControlId"), //
        INCOME_FROM_INTEREST("incomeFromInterestId"), //
        LOSSES_WRITTEN_OFF("writeOffAccountId"), //
        ESCHEAT_LIABILITY("escheatLiabilityId"), //
        PENALTIES_RECEIVABLE("penaltiesReceivableAccountId"), //
        FEES_RECEIVABLE("feesReceivableAccountId"), //
        INTEREST_PAYABLE("interestPayableAccountId");

        private final String value;

        SavingProductAccountingParams(final String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return name().toString().replaceAll("_", " ");
        }

        public String getValue() {
            return this.value;
        }
    }

    public enum SavingProductAccountingDataParams {

        SAVINGS_REFERENCE("savingsReferenceAccount"), //
        SAVINGS_CONTROL("savingsControlAccount"), //
        INCOME_FROM_FEES("incomeFromFeeAccount"), //
        INCOME_FROM_PENALTIES("incomeFromPenaltyAccount"), //
        INTEREST_ON_SAVINGS("interestOnSavingsAccount"), //
        PAYMENT_TYPE("paymentType"), //
        FUND_SOURCE("fundSourceAccount"), //
        TRANSFERS_SUSPENSE("transfersInSuspenseAccount"), //
        PENALTY_INCOME_ACCOUNT_MAPPING("penaltyToIncomeAccountMappings"), //
        CHARGE_ID("charge"), //
        INCOME_ACCOUNT_ID("incomeAccount"), //
        OVERDRAFT_PORTFOLIO_CONTROL("overdraftPortfolioControl"), //
        INCOME_FROM_INTEREST("incomeFromInterest"), //
        LOSSES_WRITTEN_OFF("writeOffAccount"), //
        ESCHEAT_LIABILITY("escheatLiabilityAccount"), //
        FEES_RECEIVABLE("feeReceivableAccount"), //
        PENALTIES_RECEIVABLE("penaltyReceivableAccount"), //
        INTEREST_PAYABLE("interestPayableAccount"); //

        private final String value;

        SavingProductAccountingDataParams(final String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return name().toString().replaceAll("_", " ");
        }

        public String getValue() {
            return this.value;
        }
    }


    // Pregunta si mantienes este 
    public enum FinancialActivity {

        ASSET_TRANSFER(100, "assetTransfer", GLAccountType.ASSET), //
        LIABILITY_TRANSFER(200, "liabilityTransfer", GLAccountType.LIABILITY), //
        CASH_AT_MAINVAULT(101, "cashAtMainVault", GLAccountType.ASSET), //
        CASH_AT_TELLER(102, "cashAtTeller", GLAccountType.ASSET), //
        OPENING_BALANCES_TRANSFER_CONTRA(300, "openingBalancesTransferContra", GLAccountType.EQUITY), //
        ASSET_FUND_SOURCE(103, "fundSource", GLAccountType.ASSET), //
        PAYABLE_DIVIDENDS(201, "payableDividends", GLAccountType.LIABILITY); //

        private final Integer value;
        private final String code;
        private final GLAccountType mappedGLAccountType;

        private static List<FinancialActivityData> financialActivities;

        static {
            financialActivities = new ArrayList<>();
            for (final FinancialActivity type : FinancialActivity.values()) {
                FinancialActivityData financialActivityData = convertToFinancialActivityData(type);
                financialActivities.add(financialActivityData);
            }
        }

        FinancialActivity(final Integer value, final String code, final GLAccountType mappedGLAccountType) {
            this.value = value;
            this.code = code;
            this.mappedGLAccountType = mappedGLAccountType;
        }

        @Override
        public String toString() {
            return name().toString().replaceAll("_", " ");
        }

        public Integer getValue() {
            return this.value;
        }

        public String getCode() {
            return this.code;
        }

        public GLAccountType getMappedGLAccountType() {
            return mappedGLAccountType;
        }

        public String getValueAsString() {
            return this.value.toString();
        }

        private static final Map<Integer, FinancialActivity> intToEnumMap = new HashMap<>();

        static {
            for (final FinancialActivity type : FinancialActivity.values()) {
                intToEnumMap.put(type.value, type);
            }
        }

        public static FinancialActivity fromInt(final int financialActivityId) {
            final FinancialActivity type = intToEnumMap.get(Integer.valueOf(financialActivityId));
            return type;
        }

        public static FinancialActivityData toFinancialActivityData(final int financialActivityId) {
            final FinancialActivity type = fromInt(financialActivityId);
            return convertToFinancialActivityData(type);
        }

        public static List<FinancialActivityData> getAllFinancialActivities() {
            return financialActivities;
        }

        private static FinancialActivityData convertToFinancialActivityData(final FinancialActivity type) {
            FinancialActivityData financialActivityData = new FinancialActivityData(type.value, type.code, type.getMappedGLAccountType());
            return financialActivityData;
        }
    }

    /***
     * Enum of all accounting related input parameter names used while creating/updating a savings product
     ***/
    public enum SharesProductAccountingParams {

        SHARES_REFERENCE("shareReferenceId"), //
        SHARES_SUSPENSE("shareSuspenseId"), //
        INCOME_FROM_FEES("incomeFromFeeAccountId"), //
        SHARES_EQUITY("shareEquityId"); //

        private final String value;

        SharesProductAccountingParams(final String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return name().toString().replaceAll("_", " ");
        }

        public String getValue() {
            return this.value;
        }
    }

    public static final String ASSESTS_TAG_OPTION_CODE_NAME = "AssetAccountTags";
    public static final String LIABILITIES_TAG_OPTION_CODE_NAME = "LiabilityAccountTags";
    public static final String EQUITY_TAG_OPTION_CODE_NAME = "EquityAccountTags";
    public static final String INCOME_TAG_OPTION_CODE_NAME = "IncomeAccountTags";
    public static final String EXPENSES_TAG_OPTION_CODE_NAME = "ExpenseAccountTags";

}
