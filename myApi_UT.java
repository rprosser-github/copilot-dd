import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class MyApiTest {

    @Autowired
    private MyApi myApi;

    @MockBean
    private OAuthTokenRequest oauthTokenRequest;

    @MockBean
    private OAuthLoginRequest oauthLoginRequest;

    @Test
    public void testOauthToken() {
        ResponseEntity<?> response = myApi.oauthToken(oauthTokenRequest);
        assertEquals(200, response.getStatusCodeValue());
    }
    @Test
    public void testOauthLogin() {
        ResponseEntity<?> response = myApi.oauthLogin(oauthLoginRequest);
        assertEquals(200, response.getStatusCodeValue());
    }

    @Test
    public void testOauthLogout() {
        ResponseEntity<?> response = myApi.oauthLogout();
        assertEquals(200, response.getStatusCodeValue());
    }

    // Add more tests as needed
}