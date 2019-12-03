package com.nsa.ons.onsgroupproject.service;

import com.nsa.ons.onsgroupproject.domain.User;

import java.util.Optional;

public interface UserFinder{

    public Optional<User> findById(Long id);

    public Optional<User>  findBySkill(Long SkillId , Long UserId);
}
