package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class UserTest {

    private static User user1 = new User();
    private static User user2 = new User("@test", "test");

    @Test
    public void testingWithParameters() {
        Assertions.assertTrue(user2.getEmail() != null && user2.getLogin() != null);
    }

    @Test
    public void testingNoParameters() {
        Assertions.assertTrue(user1.getEmail() == null && user2.getLogin() == null);
    }

    @Test
    public void testingValidParametres() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new User("@test", "test") );
    }


}