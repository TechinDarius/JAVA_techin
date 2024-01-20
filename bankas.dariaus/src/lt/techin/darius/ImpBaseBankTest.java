package lt.techin.darius;

import ibank.Bank;
import ibank.BaseBankTest;

public class ImpBaseBankTest extends BaseBankTest {
    @Override
    protected Bank createBank() {
        return new MyBank();
    }
}
