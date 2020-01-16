package repositories;

import model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository <Tasks, Long> {
    List<Tasks> findByTasks_TaskId(Long taskId);

}
