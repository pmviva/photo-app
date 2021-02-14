package com.pmviva.photoapp.users.api.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

@SpringBootTest
public class CreateUserDTOTest {

  @Autowired
  private Validator validator;

  @Test
  public void testValidateFirstName() {
    CreateUserDTO dto;
    Long count;

    dto = new CreateUserDTO();

    count = validator.validate(dto)
      .stream()
      .filter(
        (ConstraintViolation<CreateUserDTO> v) -> "firstName".equals(v.getPropertyPath().toString())
      )
      .count();

    Assertions.assertEquals(1, count);

    dto = new CreateUserDTO();
    dto.setFirstName("FIRST NAME");

    count = validator.validate(dto)
      .stream()
      .filter(
        (ConstraintViolation<CreateUserDTO> v) -> "firstName".equals(v.getPropertyPath().toString())
      )
      .count();

    Assertions.assertEquals(0, count);
  }

  @Test
  public void testValidateLastName() {
    CreateUserDTO dto;
    Long count;

    dto = new CreateUserDTO();

    count = validator.validate(dto)
      .stream()
      .filter(
        (ConstraintViolation<CreateUserDTO> v) -> "lastName".equals(v.getPropertyPath().toString())
      )
      .count();

    Assertions.assertEquals(1, count);

    dto = new CreateUserDTO();
    dto.setLastName("LAST NAME");

    count = validator.validate(dto)
      .stream()
      .filter(
        (ConstraintViolation<CreateUserDTO> v) -> "lastName".equals(v.getPropertyPath().toString())
      )
      .count();

    Assertions.assertEquals(0, count);
  }

  @Test
  public void testValidateEmail() {
    CreateUserDTO dto;
    Long count;

    dto = new CreateUserDTO();

    count = validator.validate(dto)
      .stream()
      .filter(
        (ConstraintViolation<CreateUserDTO> v) -> "email".equals(v.getPropertyPath().toString())
      )
      .count();

    Assertions.assertEquals(1, count);

    dto = new CreateUserDTO();
    dto.setEmail("INVALID EMAIL");

    count = validator.validate(dto)
      .stream()
      .filter(
        (ConstraintViolation<CreateUserDTO> v) -> "email".equals(v.getPropertyPath().toString())
      )
      .count();

    Assertions.assertEquals(1, count);

    dto = new CreateUserDTO();
    dto.setEmail("EMAIL@EXAMPLE.COM");

    count = validator.validate(dto)
      .stream()
      .filter(
        (ConstraintViolation<CreateUserDTO> v) -> "email".equals(v.getPropertyPath().toString())
      )
      .count();

    Assertions.assertEquals(0, count);
  }

  @Test
  public void testValidatePassword() {
    CreateUserDTO dto;
    Long count;

    dto = new CreateUserDTO();

    count = validator.validate(dto)
      .stream()
      .filter(
        (ConstraintViolation<CreateUserDTO> v) -> "password".equals(v.getPropertyPath().toString())
      )
      .count();

    Assertions.assertEquals(1, count);

    dto = new CreateUserDTO();
    dto.setPassword("PASSWORD");

    count = validator.validate(dto)
      .stream()
      .filter(
        (ConstraintViolation<CreateUserDTO> v) -> "password".equals(v.getPropertyPath().toString())
      )
      .count();

    Assertions.assertEquals(0, count);
  }

}
