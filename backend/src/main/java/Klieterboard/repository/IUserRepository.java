package Klieterboard.repository;

import Klieterboard.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer > {

        User findByUsername(String username);
        User findByKilterId(String kilterId);
}
