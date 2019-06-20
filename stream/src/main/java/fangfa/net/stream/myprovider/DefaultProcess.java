package fangfa.net.stream.myprovider;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;


public interface DefaultProcess {
    /**
     * 输出通道名称
     */
    String OUTPUT = "study_output";
    /**
     * 输入通道名称
     */
    String INPUT = "study_input";

    /**
     * 输入通道
     *
     * @return SubscribableChannel
     */
    @Input(DefaultProcess.INPUT)
    SubscribableChannel input();

    /**
     * 输出通道
     *
     * @return MessageChannel
     */
    @Output(DefaultProcess.OUTPUT)
    MessageChannel output();
}