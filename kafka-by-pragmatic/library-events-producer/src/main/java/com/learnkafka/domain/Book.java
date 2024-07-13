package com.learnkafka.domain;


import lombok.Getter;
import lombok.Setter;
public record Book(
        Integer bookId,
        String bookName,
        String bookAuthor
) {

}
