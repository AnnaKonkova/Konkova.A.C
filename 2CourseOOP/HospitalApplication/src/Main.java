import ru.vsuet.hospital.domain.Department;
import ru.vsuet.hospital.integration.database.ConnectionManager;
import ru.vsuet.hospital.integration.database.DepartmentRepositoryImpl;
import ru.vsuet.hospital.service.DepartmentService;

public class Main {
    public static void main(String[] args) {
        ConnectionManager manager = new ConnectionManager();

        DepartmentService service =
                new DepartmentService(new DepartmentRepositoryImpl(manager.getConnection()));
        service.getAll()
                .forEach(b -> System.out.println("Id: " + b.getId() + ", title: " + b.getTitle()));
        System.out.println("============");
        Department department = service.getById(3L);
        System.out.println("Box by id = 3: " + department.getId() + " - " + department.getTitle());
    }
}