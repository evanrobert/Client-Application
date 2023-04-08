package com.example.Clientapplication;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    @JsonProperty("itemId")
    private Long id;
    private String name;
    private String description;
}

