
package com.example.KafkaExample.stream;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface StudentStream {
    String INPUT="students-in";


    @Input(INPUT)
    SubscribableChannel inboundGreetings();

}

