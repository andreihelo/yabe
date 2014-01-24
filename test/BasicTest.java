import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

    @Test
    public void aVeryImportantThingToTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void createAndRetrieveUser() {
        User usuario = new User("andreihelo@gmail.com", "secret", "Andrei Helo", Boolean.FALSE);
        usuario.save();

        User usuarioTest = User.find("byEmailAndPassword", "andreihelo@gmail.com", "secret").first();

        assertNotNull(usuarioTest);
        assertEquals("Andrei Helo", usuarioTest.fullName);

        Post post = new Post("Esto es un post DEMO", usuario, "Esto es el contenido del post y ya no se que poner bla, bla, bla...");
        post.save();
    }

}
