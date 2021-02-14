package com.pmviva.photoapp.users.api.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {

  @Test
  public void testEquals() {
    User user1 = new User();
    User user2 = new User();
    User user3 = new User();

    user1.setUserId("USER ID");
    user1.setFirstName("FIRST NAME");
    user1.setLastName("LAST NAME");
    user1.setEmail("EMAIL");
    user1.setEncryptedPassword("ENCRYPTED PASSWORD");

    user2.setUserId("USER ID");
    user2.setFirstName("FIRST NAME");
    user2.setLastName("LAST NAME");
    user2.setEmail("EMAIL");
    user2.setEncryptedPassword("ENCRYPTED PASSWORD");

    user3.setUserId("OTHER USER ID");
    user3.setFirstName("OTHER FIRST NAME");
    user3.setLastName("OTHER LAST NAME");
    user3.setEmail("OTHER EMAIL");
    user3.setEncryptedPassword("OTHER ENCRYPTED PASSWORD");

    Assertions.assertEquals(user1, user2);
    Assertions.assertEquals(user2, user1);

    Assertions.assertNotEquals(user1, user3);
    Assertions.assertNotEquals(user3, user1);

    Assertions.assertNotEquals(user2, user3);
    Assertions.assertNotEquals(user3, user2);

    Assertions.assertFalse(user1.equals(null));
    Assertions.assertFalse(user2.equals(null));
    Assertions.assertFalse(user3.equals(null));
  }

  @Test
  public void testHashCode() {
    User user1 = new User();
    User user2 = new User();
    User user3 = new User();

    user1.setUserId("USER ID");
    user1.setFirstName("FIRST NAME");
    user1.setLastName("LAST NAME");
    user1.setEmail("EMAIL");
    user1.setEncryptedPassword("ENCRYPTED PASSWORD");

    user2.setUserId("USER ID");
    user2.setFirstName("FIRST NAME");
    user2.setLastName("LAST NAME");
    user2.setEmail("EMAIL");
    user2.setEncryptedPassword("ENCRYPTED PASSWORD");

    user3.setUserId("OTHER USER ID");
    user3.setFirstName("OTHER FIRST NAME");
    user3.setLastName("OTHER LAST NAME");
    user3.setEmail("OTHER EMAIL");
    user3.setEncryptedPassword("OTHER ENCRYPTED PASSWORD");

    Assertions.assertEquals(user1.hashCode(), user2.hashCode());
    Assertions.assertEquals(user2.hashCode(), user1.hashCode());

    Assertions.assertNotEquals(user1.hashCode(), user3.hashCode());
    Assertions.assertNotEquals(user3.hashCode(), user1.hashCode());

    Assertions.assertNotEquals(user2.hashCode(), user3.hashCode());
    Assertions.assertNotEquals(user3.hashCode(), user2.hashCode());
  }

}
