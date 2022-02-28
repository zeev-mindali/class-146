package com.jb.catsandtoys.repo;

import com.jb.catsandtoys.data_beans.Toy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //not a must (gum)
public interface ToyRepository extends JpaRepository<Toy,Integer> {

}
