package com.aws.deploy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIContorller {

    @GetMapping("api/health")
    public ResponseEntity<?> healthCheck()
    {
        return ResponseEntity.ok("OMG!!!.");
    }

    @GetMapping("api/check")
    public ResponseEntity<?> checkUp()
    {
        return ResponseEntity.ok("Up and Running.");
    }
}
