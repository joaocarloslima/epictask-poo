package br.senac.sp.epictask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senac.sp.epictask.model.Task;

public interface TaskRepository extends JpaRepository<Task,Long> {
    
}
