package com.pmviva.photoapp.users.api.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User implements Serializable {

  /**
   * The id of the user.
   */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  /**
   * The user id of the user.
   */
  @Column(nullable = false, unique = true)
  private String userId;

  /**
   * The first name of the user.
   */
  @Column(nullable = false, length = 50)
  private String firstName;

  /**
   * The last name of the user.
   */
  @Column(nullable = false, length = 50)
  private String lastName;

  /**
   * The email of the user.
   */
  @Column(nullable = false, length= 150, unique = true)
  private String email;

  /**
   * The encrypted password of the user.
   */
  @Column(nullable = false, unique = true)
  private String encryptedPassword;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

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

  public String getEncryptedPassword() {
    return encryptedPassword;
  }

  public void setEncryptedPassword(String encryptedPassword) {
    this.encryptedPassword = encryptedPassword;
  }

  @Override
  public boolean equals(Object object) {
    if (object instanceof User) {
      User user = (User) object;

      return Objects.equals(this.getUserId(), user.getUserId()) &&
        Objects.equals(this.getFirstName(), user.getFirstName()) &&
        Objects.equals(this.getLastName(), user.getLastName()) &&
        Objects.equals(this.getEmail(), user.getEmail()) &&
        Objects.equals(this.getEncryptedPassword(), user.getEncryptedPassword());
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.getUserId(),
      this.getFirstName(),
      this.getLastName(),
      this.getEmail(),
      this.getEncryptedPassword());
  }

}
