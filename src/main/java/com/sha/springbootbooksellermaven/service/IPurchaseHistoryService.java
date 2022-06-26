package com.sha.springbootbooksellermaven.service;

import com.sha.springbootbooksellermaven.model.PurchaseHistory;
import com.sha.springbootbooksellermaven.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService
{
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
