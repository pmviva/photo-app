package com.pmviva.photoapp.users.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class CreateUserDTO {

  /**
   * The first name of the user.
   */
  @NotBlank
  @JsonProperty("first_name")
  private String firstName;

  /**
   * The last name of the user.
   */
  @NotBlank
  @JsonProperty("last_name")
  private String lastName;

  /**
   * The email of the user.
   */
  @NotBlank
  @Email
  @JsonProperty("email")
  private String email;

  /**
   * The password of the user.
   */
  @NotBlank
  @JsonProperty("password")
  private String password;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
