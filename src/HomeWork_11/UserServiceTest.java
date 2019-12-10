package HomeWork_11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

private UserService service;
private UserRepositoryMock repository;

@BeforeEach
    void setUp(){
    repository = new UserRepositoryMock();
    service = new UserService(repository);
}

@Test
    void shouldSaveUser(){
    service.createUser();
    assertTrue(repository.isSaveTrggered());
}



}