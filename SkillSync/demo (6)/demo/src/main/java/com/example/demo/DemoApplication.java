package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/process")
    public Map<String, Object> processData() {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("hi", 9);
        map.put("mom", 8);
        map.put("d", 6);
        map.put("foo", 3);
        map.put("ach", 4);
        map.put("cbba", 5);
        map.put("edf", 7);

        List<String>[] groups = new List[4];
        for (int i = 0; i < 4; i++) {
            groups[i] = new ArrayList<>();
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int val = entry.getValue();
            if (val % 4 == 0) {
                groups[0].add(entry.getKey() + ":" + val);
            } else if (val % 4 == 1) {
                groups[1].add(entry.getKey() + ":" + val);
            } else if (val % 4 == 2) {
                groups[2].add(entry.getKey() + ":" + val);
            } else {
                groups[3].add(entry.getKey() + ":" + val);
            }
        }

        Map<String, Object> response = new HashMap<>();
        response.put("originalMap", map);
        response.put("groups", groups);
        return response;
    }
}