package com.generalbytes.batm.server.extensions.extra.export;

import com.generalbytes.batm.server.extensions.ITransactionDetails;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExportExtensionUtils {

    static Map<String, Object> ITransactionDetailsToMap(ITransactionDetails transactionDetails) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("serverTime", transactionDetails.getServerTime());
        map.put("terminalTime", transactionDetails.getTerminalTime());
        map.put("type", transactionDetails.getType());
        map.put("terminalSerialNumber", transactionDetails.getTerminalSerialNumber());
        map.put("transactionDetails", transactionDetails.getRemoteTransactionId());
        map.put("status", transactionDetails.getStatus());
        map.put("errorCode", transactionDetails.getErrorCode());
        map.put("cashAmount", transactionDetails.getCashAmount());
        map.put("cashCurrency", transactionDetails.getCashCurrency());
        map.put("cryptoAmount", transactionDetails.getCryptoAmount());
        map.put("cryptoCurrency", transactionDetails.getCryptoCurrency());
        map.put("cryptoAddress", transactionDetails.getCryptoAddress());
        map.put("fixedTransactionFee", transactionDetails.getFixedTransactionFee());
        map.put("identityPublicId", transactionDetails.getIdentityPublicId());
        map.put("detail", transactionDetails.getDetail());
        map.put("relatedRemoteTransactionId", transactionDetails.getRelatedRemoteTransactionId());
        map.put("cellPhoneUsed", transactionDetails.getCellPhoneUsed());
        map.put("rateSourcePrice", transactionDetails.getRateSourcePrice());
        return map;
    }
}
