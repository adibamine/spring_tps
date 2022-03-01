package ma.octo.training;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("/")
    public String all() {
        return ("<h1>Welcome All</h1>");
    }

    @GetMapping("/user")
    public String user() {
        return ("<h1>Welcome User</h1");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Welcome Admin</h1");
    }
}