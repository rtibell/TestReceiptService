package se.consid.receipt.service.impl;

import org.springframework.stereotype.Service;
import se.consid.receipt.service.ReceiptService;

@Service
public class ReceiptServiceImpl implements ReceiptService {

    public String produceReceipt() {
        return "Receipt";
    }


}
