/*
 * Author : Naveen Kumar
 * Date : 06-02-2023
 * Created With : IntelliJ IDEA Community Edition
 */

package com.niit.repo;

import com.niit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository <User,Integer> {

}
