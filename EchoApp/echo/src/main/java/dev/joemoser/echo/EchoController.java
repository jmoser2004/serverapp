package dev.joemoser.echo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.joemoser.echo.JSONTemplates.Echo;
import dev.joemoser.echo.JSONTemplates.Input;
import dev.joemoser.echo.JSONTemplates.Timestamp;

@CrossOrigin
@RestController
@RequestMapping("/")
public class EchoController
{
    @GetMapping("{input}")
    public ResponseEntity<Echo> getMapping(@PathVariable String input)
    {
        Echo result = new Echo(input);
        result.addToStamps(new Timestamp("server_out", null));
        return ResponseEntity.ok(result);
    }

    @PostMapping
    public ResponseEntity<Echo> postMapping(@RequestBody Input input)
    {
        Echo result = new Echo(input.getInput(), input.getStamp());
        result.addToStamps(new Timestamp("server_out", null));
        return ResponseEntity.ok(result);
    }
}