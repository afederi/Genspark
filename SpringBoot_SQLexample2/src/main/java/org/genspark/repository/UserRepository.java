package org.genspark.repository;

import org.genspark.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * For the findBy method to work:
     *  - the method has to start exactly with findBy. the B has to be capitalized
     *  - the word after the findBy has to be a column name. It is case-sensitive, but the first letter can be upper case since it will turn to lower case
     */

   User findByusername(String place);
}
