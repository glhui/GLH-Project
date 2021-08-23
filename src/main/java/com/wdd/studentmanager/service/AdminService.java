package com.wdd.studentmanager.service;

import com.wdd.studentmanager.domain.Admin;

/**
 * @Classname AdminService
 * @Description None
 */
public interface AdminService {

    Admin findByAdmin(Admin admin);


    int editPswdByAdmin(Admin admin);
}
