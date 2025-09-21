package DAO;

import java.util.List;
import Model.Costumer;

public interface CostumerDao {
    void save(Costumer customer);
    List<Costumer> show();
    void update(Costumer customer);
    void delete(String id);
}