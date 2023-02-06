/*
 * Author : Naveen Kumar
 * Date : 06-02-2023
 * Created With : IntelliJ IDEA Community Edition
 */

package com.niit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class User {
    @Id
    int userId;
    String userName;
    String password;
    String address;



}
