package DAO;
import java.util.List;
import Model.Service;

public interface ServiceDao {
    void save(Service service);
    List<Service> show();
    void update(Service service);
    void delete(String id);
}