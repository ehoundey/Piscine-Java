import java.util.UUID;

public interface TransactionsList {
    void addTransaction(Transaction newTransaction);
    void removeTransaction(UUID identifier);
    Transaction [] toArray();
}
