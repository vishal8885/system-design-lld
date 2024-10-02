package VendingMachine.VendingStates;


import VendingMachine.Coin;
import VendingMachine.VendingMachine;
import VendingMachine.Item;

import java.util.List;

public interface State {
    void clickOnInsertCoinButton(VendingMachine machine) throws Exception;

    void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;

    void insertCoin(VendingMachine machine, Coin coin) throws Exception;

    void chooseProduct(VendingMachine machine, int codeNumber) throws Exception;

    int getChange(int returnChangeMoney) throws Exception;

    Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception;

    List<Coin> refundFullMoney(VendingMachine machine) throws Exception;

    void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception;
}
